# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Charge.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0c\x43harge.proto\"T\n\x06\x43harge\x12\n\n\x02id\x18\x01 \x01(\x05\x12\x0c\n\x04\x63ost\x18\x02 \x01(\x03\x12\r\n\x05genre\x18\x03 \x01(\t\x12\x0c\n\x04\x64\x61te\x18\x04 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x05 \x01(\t\"(\n\rChargeRequest\x12\x17\n\x06\x63harge\x18\x01 \x01(\x0b\x32\x07.Charge\")\n\x0eGetChargeReply\x12\x17\n\x06\x63harge\x18\x01 \x01(\x0b\x32\x07.Charge\"\"\n\x0fGetMessageReply\x12\x0f\n\x07message\x18\x01 \x01(\t\"\x1c\n\x0cGetCostReply\x12\x0c\n\x04\x63ost\x18\x01 \x01(\x03\x32\x9b\x04\n\x07\x43harger\x12\x32\n\rGetChargeById\x12\x0e.ChargeRequest\x1a\x0f.GetChargeReply\"\x00\x12\x36\n\x0fGetChargeByDate\x12\x0e.ChargeRequest\x1a\x0f.GetChargeReply\"\x00\x30\x01\x12\x37\n\x10GetChargeByGenre\x12\x0e.ChargeRequest\x1a\x0f.GetChargeReply\"\x00\x30\x01\x12\x31\n\x0e\x43urrentCostSum\x12\x0e.ChargeRequest\x1a\r.GetCostReply\"\x00\x12\x33\n\x0cGetChargeAll\x12\x0e.ChargeRequest\x1a\x0f.GetChargeReply\"\x00\x30\x01\x12\x30\n\nPostCharge\x12\x0e.ChargeRequest\x1a\x10.GetMessageReply\"\x00\x12/\n\tPutCharge\x12\x0e.ChargeRequest\x1a\x10.GetMessageReply\"\x00\x12\x31\n\x0bPatchCharge\x12\x0e.ChargeRequest\x1a\x10.GetMessageReply\"\x00\x12\x36\n\x10\x44\x65leteChargeById\x12\x0e.ChargeRequest\x1a\x10.GetMessageReply\"\x00\x12\x35\n\x0f\x44\x65leteChargeAll\x12\x0e.ChargeRequest\x1a\x10.GetMessageReply\"\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'Charge_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  DESCRIPTOR._options = None
  _globals['_CHARGE']._serialized_start=16
  _globals['_CHARGE']._serialized_end=100
  _globals['_CHARGEREQUEST']._serialized_start=102
  _globals['_CHARGEREQUEST']._serialized_end=142
  _globals['_GETCHARGEREPLY']._serialized_start=144
  _globals['_GETCHARGEREPLY']._serialized_end=185
  _globals['_GETMESSAGEREPLY']._serialized_start=187
  _globals['_GETMESSAGEREPLY']._serialized_end=221
  _globals['_GETCOSTREPLY']._serialized_start=223
  _globals['_GETCOSTREPLY']._serialized_end=251
  _globals['_CHARGER']._serialized_start=254
  _globals['_CHARGER']._serialized_end=793
# @@protoc_insertion_point(module_scope)