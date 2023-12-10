import pymysql
import asyncio
from concurrent import futures
import grpc, Charge_pb2, Charge_pb2_grpc

class Charge:
    def __init__(self, id, cost, genre, date, description):
        self.id = id
        self.cost = cost
        self.genre = genre
        self.date = date
        self.description = description

class Charger(Charge_pb2_grpc.ChargerServicer):
    def GetChargeById(self, request, context):
        query = "SELECT * FROM Charge WHERE ID=%d" % request.id
        cur.execute(query)
        row = cur.fetchone()
        print("SELECT QUERY EXECUTED!")
        return Charge_pb2.GetChargeReply(Charge=Charge(row), message='Get ID complete\n')
    
    async def GetChargeByGenre(self, request, context):
        reply = []
        query = "SELECT * FROM Charge WHERE GENRE=%s" % request.genre
        cur.execute(query)
        while True:
            row = cur.fetchone()
            if row == None:
                break
            reply.append(Charge_pb2.GetChargeReply(Charge=Charge(row), message='Get ID complete\n'))
        for i in reply:
            yield i
        print("SELECT QUERY EXECUTED!")
    
    async def GetChargeByDate(self, request, context):
        reply = []
        query = "SELECT * FROM Charge WHERE CHARGEDATE=%s" % request.date
        cur.execute(query)
        while True:
            row = cur.fetchone()
            if row == None:
                break
            reply.append(Charge_pb2.GetChargeReply(Charge=Charge(row), message='Get ID complete\n'))
        for i in reply:
            yield i
        print("SELECT QUERY EXECUTED!")

    async def GetChargeAll(self, request, context):
        reply = []
        query = "SELECT * FROM Charge"
        cur.execute(query)
        while True:
            row = cur.fetchone()
            if row == None:
                break
            reply.append(Charge_pb2.GetChargeReply(Charge=Charge(row), message='Get ID complete\n'))
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
        return Charge_pb2.GetCostReply(cost=sum)

    def PostCharge(self, request, context):
        query = "INSERT INTO Charge VALUES ('%d', '%d', '%s', '%s', '%s')" % (request.id, request.cost, request.genre, request.date, request.description)
        cur.execute(query)
        conn.commit()
        print("INSERT QUERY EXECUTED!")
        return Charge_pb2.GetMessageReply(message='Message POST complete.\n')

    def PutCharge(self, request, context):
        query = "UPDATE Charge SET COST=%d, GENRE=%s, CHARGEDATE=%s, DESCRIPTION=$s WHERE ID=%d" % (request.cost, request.genre, request.date, request.description, request.id)
        cur.execute(query)
        conn.commit()
        print("UPDATE QUERY EXECUTED!")
        return Charge_pb2.GetMessageReply(message='Message PUT complete.\n')
    
    def PatchCharge(self, request, context):
        query = "UPDATE Charge SET COST=%d, GENRE=%s, CHARGEDATE=%s, DESCRIPTION=$s WHERE ID=%d" % (request.cost, request.genre, request.date, request.description, request.id)
        cur.execute(query)
        conn.commit()
        print("UPDATE QUERY EXECUTED!")
        return Charge_pb2.GetMessageReply(message='Message PATCH complete.\n')

    def DeleteChargeById(self, request, context):
        query = "DELETE FROM Charge WHERE ID=%d" % request.id
        cur.execute(query)
        conn.commit()
        print("DELETE QUERY EXECUTED!")
        return Charge_pb2.GetMessageReply(message='Message DELETE complete.\n')

    def DeleteChargeById(self, request, context):
        query = "DELETE FROM Charge"
        cur.execute(query)
        conn.commit()
        print("DELETE QUERY EXECUTED!")
        return Charge_pb2.GetMessageReply(message='Message DELETE all complete.\n')
    
async def server():
    server = grpc.aio.server()
    Charge_pb2_grpc.add_ChargerServicer_to_server(Charger(), server)
    server.add_insecure_port('0.0.0.0:8080')
    await server.start()
    await server.wait_for_termination()

conn = pymysql.connect(host='127.0.0.1', user='root', password='1q2w3e4r', db='hw2', charset='utf8')
cur = conn.cursor()
cur.execute("CREATE TABLE IF NOT EXISTS Charge (ID INT PRIMARY KEY, COST INT NOT NULL, GENRE VARCHAR(15) NOT NULL, CHARGEDATE DATE NOT NULL, DESCRIPTION VARCHAR(30))")
asyncio.run(server())