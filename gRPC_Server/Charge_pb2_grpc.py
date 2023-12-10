# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import Charge_pb2 as Charge__pb2


class ChargerStub(object):
    """python3 -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. ./Charge.proto
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.GetChargeById = channel.unary_unary(
                '/Charger/GetChargeById',
                request_serializer=Charge__pb2.ChargeRequest.SerializeToString,
                response_deserializer=Charge__pb2.GetChargeReply.FromString,
                )
        self.GetChargeByDate = channel.unary_stream(
                '/Charger/GetChargeByDate',
                request_serializer=Charge__pb2.ChargeRequest.SerializeToString,
                response_deserializer=Charge__pb2.GetChargeReply.FromString,
                )
        self.GetChargeByGenre = channel.unary_stream(
                '/Charger/GetChargeByGenre',
                request_serializer=Charge__pb2.ChargeRequest.SerializeToString,
                response_deserializer=Charge__pb2.GetChargeReply.FromString,
                )
        self.CurrentCostSum = channel.unary_unary(
                '/Charger/CurrentCostSum',
                request_serializer=Charge__pb2.ChargeRequest.SerializeToString,
                response_deserializer=Charge__pb2.GetCostReply.FromString,
                )
        self.GetChargeAll = channel.unary_stream(
                '/Charger/GetChargeAll',
                request_serializer=Charge__pb2.ChargeRequest.SerializeToString,
                response_deserializer=Charge__pb2.GetChargeReply.FromString,
                )
        self.PostCharge = channel.unary_unary(
                '/Charger/PostCharge',
                request_serializer=Charge__pb2.ChargeRequest.SerializeToString,
                response_deserializer=Charge__pb2.GetMessageReply.FromString,
                )
        self.PutCharge = channel.unary_unary(
                '/Charger/PutCharge',
                request_serializer=Charge__pb2.ChargeRequest.SerializeToString,
                response_deserializer=Charge__pb2.GetMessageReply.FromString,
                )
        self.PatchCharge = channel.unary_unary(
                '/Charger/PatchCharge',
                request_serializer=Charge__pb2.ChargeRequest.SerializeToString,
                response_deserializer=Charge__pb2.GetMessageReply.FromString,
                )
        self.DeleteChargeById = channel.unary_unary(
                '/Charger/DeleteChargeById',
                request_serializer=Charge__pb2.ChargeRequest.SerializeToString,
                response_deserializer=Charge__pb2.GetMessageReply.FromString,
                )
        self.DeleteChargeAll = channel.unary_unary(
                '/Charger/DeleteChargeAll',
                request_serializer=Charge__pb2.ChargeRequest.SerializeToString,
                response_deserializer=Charge__pb2.GetMessageReply.FromString,
                )


class ChargerServicer(object):
    """python3 -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. ./Charge.proto
    """

    def GetChargeById(self, request, context):
        """GET
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetChargeByDate(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetChargeByGenre(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CurrentCostSum(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetChargeAll(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def PostCharge(self, request, context):
        """POST
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def PutCharge(self, request, context):
        """PUT
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def PatchCharge(self, request, context):
        """PATCH
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteChargeById(self, request, context):
        """DELETE
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteChargeAll(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_ChargerServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'GetChargeById': grpc.unary_unary_rpc_method_handler(
                    servicer.GetChargeById,
                    request_deserializer=Charge__pb2.ChargeRequest.FromString,
                    response_serializer=Charge__pb2.GetChargeReply.SerializeToString,
            ),
            'GetChargeByDate': grpc.unary_stream_rpc_method_handler(
                    servicer.GetChargeByDate,
                    request_deserializer=Charge__pb2.ChargeRequest.FromString,
                    response_serializer=Charge__pb2.GetChargeReply.SerializeToString,
            ),
            'GetChargeByGenre': grpc.unary_stream_rpc_method_handler(
                    servicer.GetChargeByGenre,
                    request_deserializer=Charge__pb2.ChargeRequest.FromString,
                    response_serializer=Charge__pb2.GetChargeReply.SerializeToString,
            ),
            'CurrentCostSum': grpc.unary_unary_rpc_method_handler(
                    servicer.CurrentCostSum,
                    request_deserializer=Charge__pb2.ChargeRequest.FromString,
                    response_serializer=Charge__pb2.GetCostReply.SerializeToString,
            ),
            'GetChargeAll': grpc.unary_stream_rpc_method_handler(
                    servicer.GetChargeAll,
                    request_deserializer=Charge__pb2.ChargeRequest.FromString,
                    response_serializer=Charge__pb2.GetChargeReply.SerializeToString,
            ),
            'PostCharge': grpc.unary_unary_rpc_method_handler(
                    servicer.PostCharge,
                    request_deserializer=Charge__pb2.ChargeRequest.FromString,
                    response_serializer=Charge__pb2.GetMessageReply.SerializeToString,
            ),
            'PutCharge': grpc.unary_unary_rpc_method_handler(
                    servicer.PutCharge,
                    request_deserializer=Charge__pb2.ChargeRequest.FromString,
                    response_serializer=Charge__pb2.GetMessageReply.SerializeToString,
            ),
            'PatchCharge': grpc.unary_unary_rpc_method_handler(
                    servicer.PatchCharge,
                    request_deserializer=Charge__pb2.ChargeRequest.FromString,
                    response_serializer=Charge__pb2.GetMessageReply.SerializeToString,
            ),
            'DeleteChargeById': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteChargeById,
                    request_deserializer=Charge__pb2.ChargeRequest.FromString,
                    response_serializer=Charge__pb2.GetMessageReply.SerializeToString,
            ),
            'DeleteChargeAll': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteChargeAll,
                    request_deserializer=Charge__pb2.ChargeRequest.FromString,
                    response_serializer=Charge__pb2.GetMessageReply.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'Charger', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Charger(object):
    """python3 -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. ./Charge.proto
    """

    @staticmethod
    def GetChargeById(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/Charger/GetChargeById',
            Charge__pb2.ChargeRequest.SerializeToString,
            Charge__pb2.GetChargeReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetChargeByDate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/Charger/GetChargeByDate',
            Charge__pb2.ChargeRequest.SerializeToString,
            Charge__pb2.GetChargeReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetChargeByGenre(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/Charger/GetChargeByGenre',
            Charge__pb2.ChargeRequest.SerializeToString,
            Charge__pb2.GetChargeReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CurrentCostSum(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/Charger/CurrentCostSum',
            Charge__pb2.ChargeRequest.SerializeToString,
            Charge__pb2.GetCostReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetChargeAll(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/Charger/GetChargeAll',
            Charge__pb2.ChargeRequest.SerializeToString,
            Charge__pb2.GetChargeReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def PostCharge(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/Charger/PostCharge',
            Charge__pb2.ChargeRequest.SerializeToString,
            Charge__pb2.GetMessageReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def PutCharge(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/Charger/PutCharge',
            Charge__pb2.ChargeRequest.SerializeToString,
            Charge__pb2.GetMessageReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def PatchCharge(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/Charger/PatchCharge',
            Charge__pb2.ChargeRequest.SerializeToString,
            Charge__pb2.GetMessageReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteChargeById(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/Charger/DeleteChargeById',
            Charge__pb2.ChargeRequest.SerializeToString,
            Charge__pb2.GetMessageReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteChargeAll(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/Charger/DeleteChargeAll',
            Charge__pb2.ChargeRequest.SerializeToString,
            Charge__pb2.GetMessageReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)