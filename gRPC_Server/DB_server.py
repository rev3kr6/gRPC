import pymysql
import sys
import asyncio
from concurrent import futures
import grpc, Charge_pb2, Charge_pb2_grpc


class Charger(Charge_pb2_grpc.ChargerServicer):
    def GetChargeById(self, request, context):
        query = "SELECT * FROM Charge WHERE ID=%d" % request.idx
        try:
            cur.execute(query)
            row = cur.fetchone()          
            message = "ID: %d, COST: %d, GENRE: %s, DATE: %s, DESCRIPTION: %s\n" % (row[0], row[1], row[2], row[3], row[4])
            print("SELECT QUERY EXECUTED!")
        except pymysql.err.ProgrammingError as e: # query exception
            message = f"ProgrammingError: {e}\n"
        except TypeError as e:
            message = f"TypeError: {e}\n"
        return Charge_pb2.StringReply(message=message)
    
    def GetChargeByGenre(self, request, context):
        reply = []
        query = "SELECT * FROM Charge WHERE GENRE=\"%s\"" % request.genre
        try:
            cur.execute(query)
            while True:
                row = cur.fetchone()
                if row == None:
                    break
                message = "ID: %d, COST: %d, GENRE: %s, DATE: %s, DESCRIPTION: %s" % (row[0], row[1], row[2], row[3], row[4])
                reply.append(Charge_pb2.StringReply(message=message))
            for i in reply:
                yield i
            print("SELECT QUERY EXECUTED!")
        except pymysql.err.ProgrammingError as e:
            message = f"ProgrammingError: {e}"
            return Charge_pb2.StringReply(message=message)
        
    def GetChargeByDate(self, request, context):
        reply = []
        query = "SELECT * FROM Charge WHERE CHARGEDATE=\"%s\"" % request.date
        try:
            cur.execute(query)
            while True:
                row = cur.fetchone()
                if row == None:
                    break
                message = "ID: %d, COST: %d, GENRE: %s, DATE: %s, DESCRIPTION: %s" % (row[0], row[1], row[2], row[3], row[4])
                reply.append(Charge_pb2.StringReply(message=message))
            for i in reply:
                yield i
            print("SELECT QUERY EXECUTED!")
        except pymysql.err.ProgrammingError as e:
            return Charge_pb2.StringReply(message=f"ProgrammingError: {e}")
        except pymysql.err.DataError as e: # data type exception
            return Charge_pb2.StringReply(message=f"DataError: {e}")

    def GetChargeAll(self, request, context):
        reply = []
        query = "SELECT * FROM Charge"
        cur.execute(query)
        while True:
            row = cur.fetchone()
            if row == None:
                break
            message = "ID: %d, COST: %d, GENRE: %s, DATE: %s, DESCRIPTION: %s" % (row[0], row[1], row[2], row[3], row[4])
            reply.append(Charge_pb2.StringReply(message=message))
        for i in reply:
            yield i
        print("SELECT QUERY EXECUTED!")
    
    def CurrentCostSum(self, request, context):
        sum = 0
        query = "SELECT * FROM Charge"
        cur.execute(query)
        while True:
            row = cur.fetchone()
            if row == None:
                break
            sum += row[1]
        print("SELECT QUERY EXECUTED!")
        return Charge_pb2.CostReply(cost=sum)

    def PostCharge(self, request, context):
        query = "INSERT INTO Charge VALUES ('%d', '%d', '%s', '%s', '%s')" % (request.idx, request.cost, request.genre, request.date, request.description)
        try:
            cur.execute(query)
            conn.commit()
            print("INSERT QUERY EXECUTED!")
            message = "Message POST complete.\n"
        except pymysql.err.ProgrammingError as e:
            message = f"ProgrammingError: {e}\n"
        except pymysql.err.InternalError as e: # Commit exception
            message = f"InternalError: {e}\n"
        except pymysql.err.DataError as e:
            message = f"DataError: {e}\n"
        except pymysql.err.IntegrityError as e:
            message = f"IntegrityError: {e}\n"
        except pymysql.err.OperationalError as e:
            message = f"OperationalError: {e}\n"
        return Charge_pb2.StringReply(message=message)

    def PutCharge(self, request, context):
        query = "UPDATE Charge SET COST=%d, GENRE='%s', CHARGEDATE='%s', DESCRIPTION='%s' WHERE ID=%d" % (request.cost, request.genre, request.date, request.description, request.idx)
        try:
            cur.execute(query)
            conn.commit()
            print("UPDATE QUERY EXECUTED!")
            message = "Message PUT complete.\n"
        except pymysql.err.ProgrammingError as e:
            message = f"ProgrammingError: {e}\n"
        except pymysql.err.InternalError as e:
            message = f"InternalError: {e}\n"
        except pymysql.err.DataError as e:
            message = f"DataError: {e}\n"
        return Charge_pb2.StringReply(message=message)

    
    def PatchCharge(self, request, context):
        query = "UPDATE Charge SET "
        if(request.cost != None):
            query = query + "COST=%d, " % request.cost
        if(request.genre != None):
            query = query + "GENRE='%s', " % request.genre
        if(request.date != None):
            query = query + "CHARGEDATE='%s', " % request.date
        if(request.description != None):
            query = query + "DESCRIPTION='%s' " % request.description
        if(request.idx != None):
            query = query + "WHERE ID=%d" % request.idx
        else:
            message = f"Please input ID.\n"
            return Charge_pb2.StringReply(message=message)
        try:
            cur.execute(query)
            conn.commit()
            print("UPDATE QUERY EXECUTED!")
            message = "Message PATCH complete.\n"
        except pymysql.err.ProgrammingError as e:
            message = f"ProgrammingError: {e}\n"
        except pymysql.err.InternalError as e:
            message = f"InternalError: {e}\n"
        except pymysql.err.DataError as e:
            message = f"DataError: {e}\n"
        return Charge_pb2.StringReply(message=message)

    def DeleteChargeById(self, request, context):
        query = "DELETE FROM Charge WHERE ID=%d" % request.idx
        try:
            cur.execute(query)
            conn.commit()
            print("DELETE QUERY EXECUTED!")
            message = "Message DELETE complete.\n"
        except pymysql.err.ProgrammingError as e:
            message = f"ProgrammingError: {e}\n"
        except pymysql.err.InternalError as e:
            message = f"InternalError: {e}\n"
        return Charge_pb2.StringReply(message=message)

    def DeleteChargeAll(self, request, context):
        query = "DELETE FROM Charge"
        cur.execute(query)
        try:
            conn.commit()
            print("DELETE QUERY EXECUTED!")
            message = "Message DELETE all complete.\n"
        except pymysql.err.InternalError as e:
            message = f"InternalError: {e}\n"
        return Charge_pb2.StringReply(message=message)
    
async def server():
    port = "8080"
    server = grpc.server(futures.ThreadPoolExecutor())
    Charge_pb2_grpc.add_ChargerServicer_to_server(Charger(), server)
    server.add_insecure_port("localhost:" + port)
    server.start()
    server.wait_for_termination()

try:
    conn = pymysql.connect(host='127.0.0.1', user='root', password='1q2w3e4r', db='hw2', charset='utf8')
except pymysql.err.OperationalError as e:
    print(f"OperationalError: {e}")
    sys.exit(1)
cur = conn.cursor()
cur.execute("CREATE TABLE IF NOT EXISTS Charge (ID INT PRIMARY KEY, COST INT NOT NULL, GENRE VARCHAR(15) NOT NULL, CHARGEDATE DATE NOT NULL, DESCRIPTION VARCHAR(30))")
asyncio.run(server())