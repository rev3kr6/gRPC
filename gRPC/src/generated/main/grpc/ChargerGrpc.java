import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * python3 -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. ./Charge.proto
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: Charge.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ChargerGrpc {

  private ChargerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Charger";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Charge.IdRequest,
      Charge.StringReply> getGetChargeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChargeById",
      requestType = Charge.IdRequest.class,
      responseType = Charge.StringReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Charge.IdRequest,
      Charge.StringReply> getGetChargeByIdMethod() {
    io.grpc.MethodDescriptor<Charge.IdRequest, Charge.StringReply> getGetChargeByIdMethod;
    if ((getGetChargeByIdMethod = ChargerGrpc.getGetChargeByIdMethod) == null) {
      synchronized (ChargerGrpc.class) {
        if ((getGetChargeByIdMethod = ChargerGrpc.getGetChargeByIdMethod) == null) {
          ChargerGrpc.getGetChargeByIdMethod = getGetChargeByIdMethod =
              io.grpc.MethodDescriptor.<Charge.IdRequest, Charge.StringReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChargeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.StringReply.getDefaultInstance()))
              .setSchemaDescriptor(new ChargerMethodDescriptorSupplier("GetChargeById"))
              .build();
        }
      }
    }
    return getGetChargeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Charge.DateRequest,
      Charge.StringReply> getGetChargeByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChargeByDate",
      requestType = Charge.DateRequest.class,
      responseType = Charge.StringReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Charge.DateRequest,
      Charge.StringReply> getGetChargeByDateMethod() {
    io.grpc.MethodDescriptor<Charge.DateRequest, Charge.StringReply> getGetChargeByDateMethod;
    if ((getGetChargeByDateMethod = ChargerGrpc.getGetChargeByDateMethod) == null) {
      synchronized (ChargerGrpc.class) {
        if ((getGetChargeByDateMethod = ChargerGrpc.getGetChargeByDateMethod) == null) {
          ChargerGrpc.getGetChargeByDateMethod = getGetChargeByDateMethod =
              io.grpc.MethodDescriptor.<Charge.DateRequest, Charge.StringReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChargeByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.DateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.StringReply.getDefaultInstance()))
              .setSchemaDescriptor(new ChargerMethodDescriptorSupplier("GetChargeByDate"))
              .build();
        }
      }
    }
    return getGetChargeByDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Charge.GenreRequest,
      Charge.StringReply> getGetChargeByGenreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChargeByGenre",
      requestType = Charge.GenreRequest.class,
      responseType = Charge.StringReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Charge.GenreRequest,
      Charge.StringReply> getGetChargeByGenreMethod() {
    io.grpc.MethodDescriptor<Charge.GenreRequest, Charge.StringReply> getGetChargeByGenreMethod;
    if ((getGetChargeByGenreMethod = ChargerGrpc.getGetChargeByGenreMethod) == null) {
      synchronized (ChargerGrpc.class) {
        if ((getGetChargeByGenreMethod = ChargerGrpc.getGetChargeByGenreMethod) == null) {
          ChargerGrpc.getGetChargeByGenreMethod = getGetChargeByGenreMethod =
              io.grpc.MethodDescriptor.<Charge.GenreRequest, Charge.StringReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChargeByGenre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.GenreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.StringReply.getDefaultInstance()))
              .setSchemaDescriptor(new ChargerMethodDescriptorSupplier("GetChargeByGenre"))
              .build();
        }
      }
    }
    return getGetChargeByGenreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Charge.AllRequest,
      Charge.CostReply> getCurrentCostSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentCostSum",
      requestType = Charge.AllRequest.class,
      responseType = Charge.CostReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Charge.AllRequest,
      Charge.CostReply> getCurrentCostSumMethod() {
    io.grpc.MethodDescriptor<Charge.AllRequest, Charge.CostReply> getCurrentCostSumMethod;
    if ((getCurrentCostSumMethod = ChargerGrpc.getCurrentCostSumMethod) == null) {
      synchronized (ChargerGrpc.class) {
        if ((getCurrentCostSumMethod = ChargerGrpc.getCurrentCostSumMethod) == null) {
          ChargerGrpc.getCurrentCostSumMethod = getCurrentCostSumMethod =
              io.grpc.MethodDescriptor.<Charge.AllRequest, Charge.CostReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentCostSum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.AllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.CostReply.getDefaultInstance()))
              .setSchemaDescriptor(new ChargerMethodDescriptorSupplier("CurrentCostSum"))
              .build();
        }
      }
    }
    return getCurrentCostSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Charge.AllRequest,
      Charge.StringReply> getGetChargeAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChargeAll",
      requestType = Charge.AllRequest.class,
      responseType = Charge.StringReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Charge.AllRequest,
      Charge.StringReply> getGetChargeAllMethod() {
    io.grpc.MethodDescriptor<Charge.AllRequest, Charge.StringReply> getGetChargeAllMethod;
    if ((getGetChargeAllMethod = ChargerGrpc.getGetChargeAllMethod) == null) {
      synchronized (ChargerGrpc.class) {
        if ((getGetChargeAllMethod = ChargerGrpc.getGetChargeAllMethod) == null) {
          ChargerGrpc.getGetChargeAllMethod = getGetChargeAllMethod =
              io.grpc.MethodDescriptor.<Charge.AllRequest, Charge.StringReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChargeAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.AllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.StringReply.getDefaultInstance()))
              .setSchemaDescriptor(new ChargerMethodDescriptorSupplier("GetChargeAll"))
              .build();
        }
      }
    }
    return getGetChargeAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Charge.ChargeRequest,
      Charge.StringReply> getPostChargeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostCharge",
      requestType = Charge.ChargeRequest.class,
      responseType = Charge.StringReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Charge.ChargeRequest,
      Charge.StringReply> getPostChargeMethod() {
    io.grpc.MethodDescriptor<Charge.ChargeRequest, Charge.StringReply> getPostChargeMethod;
    if ((getPostChargeMethod = ChargerGrpc.getPostChargeMethod) == null) {
      synchronized (ChargerGrpc.class) {
        if ((getPostChargeMethod = ChargerGrpc.getPostChargeMethod) == null) {
          ChargerGrpc.getPostChargeMethod = getPostChargeMethod =
              io.grpc.MethodDescriptor.<Charge.ChargeRequest, Charge.StringReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostCharge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.ChargeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.StringReply.getDefaultInstance()))
              .setSchemaDescriptor(new ChargerMethodDescriptorSupplier("PostCharge"))
              .build();
        }
      }
    }
    return getPostChargeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Charge.ChargeRequest,
      Charge.StringReply> getPutChargeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutCharge",
      requestType = Charge.ChargeRequest.class,
      responseType = Charge.StringReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Charge.ChargeRequest,
      Charge.StringReply> getPutChargeMethod() {
    io.grpc.MethodDescriptor<Charge.ChargeRequest, Charge.StringReply> getPutChargeMethod;
    if ((getPutChargeMethod = ChargerGrpc.getPutChargeMethod) == null) {
      synchronized (ChargerGrpc.class) {
        if ((getPutChargeMethod = ChargerGrpc.getPutChargeMethod) == null) {
          ChargerGrpc.getPutChargeMethod = getPutChargeMethod =
              io.grpc.MethodDescriptor.<Charge.ChargeRequest, Charge.StringReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutCharge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.ChargeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.StringReply.getDefaultInstance()))
              .setSchemaDescriptor(new ChargerMethodDescriptorSupplier("PutCharge"))
              .build();
        }
      }
    }
    return getPutChargeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Charge.ChargeRequest,
      Charge.StringReply> getPatchChargeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchCharge",
      requestType = Charge.ChargeRequest.class,
      responseType = Charge.StringReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Charge.ChargeRequest,
      Charge.StringReply> getPatchChargeMethod() {
    io.grpc.MethodDescriptor<Charge.ChargeRequest, Charge.StringReply> getPatchChargeMethod;
    if ((getPatchChargeMethod = ChargerGrpc.getPatchChargeMethod) == null) {
      synchronized (ChargerGrpc.class) {
        if ((getPatchChargeMethod = ChargerGrpc.getPatchChargeMethod) == null) {
          ChargerGrpc.getPatchChargeMethod = getPatchChargeMethod =
              io.grpc.MethodDescriptor.<Charge.ChargeRequest, Charge.StringReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchCharge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.ChargeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.StringReply.getDefaultInstance()))
              .setSchemaDescriptor(new ChargerMethodDescriptorSupplier("PatchCharge"))
              .build();
        }
      }
    }
    return getPatchChargeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Charge.ChargeRequest,
      Charge.StringReply> getDeleteChargeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteChargeById",
      requestType = Charge.ChargeRequest.class,
      responseType = Charge.StringReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Charge.ChargeRequest,
      Charge.StringReply> getDeleteChargeByIdMethod() {
    io.grpc.MethodDescriptor<Charge.ChargeRequest, Charge.StringReply> getDeleteChargeByIdMethod;
    if ((getDeleteChargeByIdMethod = ChargerGrpc.getDeleteChargeByIdMethod) == null) {
      synchronized (ChargerGrpc.class) {
        if ((getDeleteChargeByIdMethod = ChargerGrpc.getDeleteChargeByIdMethod) == null) {
          ChargerGrpc.getDeleteChargeByIdMethod = getDeleteChargeByIdMethod =
              io.grpc.MethodDescriptor.<Charge.ChargeRequest, Charge.StringReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteChargeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.ChargeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.StringReply.getDefaultInstance()))
              .setSchemaDescriptor(new ChargerMethodDescriptorSupplier("DeleteChargeById"))
              .build();
        }
      }
    }
    return getDeleteChargeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Charge.ChargeRequest,
      Charge.StringReply> getDeleteChargeAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteChargeAll",
      requestType = Charge.ChargeRequest.class,
      responseType = Charge.StringReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Charge.ChargeRequest,
      Charge.StringReply> getDeleteChargeAllMethod() {
    io.grpc.MethodDescriptor<Charge.ChargeRequest, Charge.StringReply> getDeleteChargeAllMethod;
    if ((getDeleteChargeAllMethod = ChargerGrpc.getDeleteChargeAllMethod) == null) {
      synchronized (ChargerGrpc.class) {
        if ((getDeleteChargeAllMethod = ChargerGrpc.getDeleteChargeAllMethod) == null) {
          ChargerGrpc.getDeleteChargeAllMethod = getDeleteChargeAllMethod =
              io.grpc.MethodDescriptor.<Charge.ChargeRequest, Charge.StringReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteChargeAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.ChargeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Charge.StringReply.getDefaultInstance()))
              .setSchemaDescriptor(new ChargerMethodDescriptorSupplier("DeleteChargeAll"))
              .build();
        }
      }
    }
    return getDeleteChargeAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChargerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChargerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChargerStub>() {
        @java.lang.Override
        public ChargerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChargerStub(channel, callOptions);
        }
      };
    return ChargerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChargerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChargerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChargerBlockingStub>() {
        @java.lang.Override
        public ChargerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChargerBlockingStub(channel, callOptions);
        }
      };
    return ChargerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChargerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChargerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChargerFutureStub>() {
        @java.lang.Override
        public ChargerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChargerFutureStub(channel, callOptions);
        }
      };
    return ChargerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * python3 -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. ./Charge.proto
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GET
     * </pre>
     */
    default void getChargeById(Charge.IdRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChargeByIdMethod(), responseObserver);
    }

    /**
     */
    default void getChargeByDate(Charge.DateRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChargeByDateMethod(), responseObserver);
    }

    /**
     */
    default void getChargeByGenre(Charge.GenreRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChargeByGenreMethod(), responseObserver);
    }

    /**
     */
    default void currentCostSum(Charge.AllRequest request,
        io.grpc.stub.StreamObserver<Charge.CostReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentCostSumMethod(), responseObserver);
    }

    /**
     */
    default void getChargeAll(Charge.AllRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChargeAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST
     * </pre>
     */
    default void postCharge(Charge.ChargeRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostChargeMethod(), responseObserver);
    }

    /**
     * <pre>
     * PUT
     * </pre>
     */
    default void putCharge(Charge.ChargeRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutChargeMethod(), responseObserver);
    }

    /**
     * <pre>
     * PATCH
     * </pre>
     */
    default void patchCharge(Charge.ChargeRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchChargeMethod(), responseObserver);
    }

    /**
     * <pre>
     * DELETE
     * </pre>
     */
    default void deleteChargeById(Charge.ChargeRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteChargeByIdMethod(), responseObserver);
    }

    /**
     */
    default void deleteChargeAll(Charge.ChargeRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteChargeAllMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Charger.
   * <pre>
   * python3 -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. ./Charge.proto
   * </pre>
   */
  public static abstract class ChargerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ChargerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Charger.
   * <pre>
   * python3 -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. ./Charge.proto
   * </pre>
   */
  public static final class ChargerStub
      extends io.grpc.stub.AbstractAsyncStub<ChargerStub> {
    private ChargerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChargerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChargerStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET
     * </pre>
     */
    public void getChargeById(Charge.IdRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChargeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChargeByDate(Charge.DateRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetChargeByDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChargeByGenre(Charge.GenreRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetChargeByGenreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void currentCostSum(Charge.AllRequest request,
        io.grpc.stub.StreamObserver<Charge.CostReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentCostSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChargeAll(Charge.AllRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetChargeAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST
     * </pre>
     */
    public void postCharge(Charge.ChargeRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostChargeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PUT
     * </pre>
     */
    public void putCharge(Charge.ChargeRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutChargeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PATCH
     * </pre>
     */
    public void patchCharge(Charge.ChargeRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchChargeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DELETE
     * </pre>
     */
    public void deleteChargeById(Charge.ChargeRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteChargeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteChargeAll(Charge.ChargeRequest request,
        io.grpc.stub.StreamObserver<Charge.StringReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteChargeAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Charger.
   * <pre>
   * python3 -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. ./Charge.proto
   * </pre>
   */
  public static final class ChargerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ChargerBlockingStub> {
    private ChargerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChargerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChargerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET
     * </pre>
     */
    public Charge.StringReply getChargeById(Charge.IdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChargeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<Charge.StringReply> getChargeByDate(
        Charge.DateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetChargeByDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<Charge.StringReply> getChargeByGenre(
        Charge.GenreRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetChargeByGenreMethod(), getCallOptions(), request);
    }

    /**
     */
    public Charge.CostReply currentCostSum(Charge.AllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentCostSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<Charge.StringReply> getChargeAll(
        Charge.AllRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetChargeAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST
     * </pre>
     */
    public Charge.StringReply postCharge(Charge.ChargeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostChargeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PUT
     * </pre>
     */
    public Charge.StringReply putCharge(Charge.ChargeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutChargeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PATCH
     * </pre>
     */
    public Charge.StringReply patchCharge(Charge.ChargeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchChargeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DELETE
     * </pre>
     */
    public Charge.StringReply deleteChargeById(Charge.ChargeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteChargeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public Charge.StringReply deleteChargeAll(Charge.ChargeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteChargeAllMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Charger.
   * <pre>
   * python3 -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. ./Charge.proto
   * </pre>
   */
  public static final class ChargerFutureStub
      extends io.grpc.stub.AbstractFutureStub<ChargerFutureStub> {
    private ChargerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChargerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChargerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Charge.StringReply> getChargeById(
        Charge.IdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChargeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Charge.CostReply> currentCostSum(
        Charge.AllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentCostSumMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Charge.StringReply> postCharge(
        Charge.ChargeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostChargeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PUT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Charge.StringReply> putCharge(
        Charge.ChargeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutChargeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PATCH
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Charge.StringReply> patchCharge(
        Charge.ChargeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchChargeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DELETE
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Charge.StringReply> deleteChargeById(
        Charge.ChargeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteChargeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Charge.StringReply> deleteChargeAll(
        Charge.ChargeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteChargeAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CHARGE_BY_ID = 0;
  private static final int METHODID_GET_CHARGE_BY_DATE = 1;
  private static final int METHODID_GET_CHARGE_BY_GENRE = 2;
  private static final int METHODID_CURRENT_COST_SUM = 3;
  private static final int METHODID_GET_CHARGE_ALL = 4;
  private static final int METHODID_POST_CHARGE = 5;
  private static final int METHODID_PUT_CHARGE = 6;
  private static final int METHODID_PATCH_CHARGE = 7;
  private static final int METHODID_DELETE_CHARGE_BY_ID = 8;
  private static final int METHODID_DELETE_CHARGE_ALL = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CHARGE_BY_ID:
          serviceImpl.getChargeById((Charge.IdRequest) request,
              (io.grpc.stub.StreamObserver<Charge.StringReply>) responseObserver);
          break;
        case METHODID_GET_CHARGE_BY_DATE:
          serviceImpl.getChargeByDate((Charge.DateRequest) request,
              (io.grpc.stub.StreamObserver<Charge.StringReply>) responseObserver);
          break;
        case METHODID_GET_CHARGE_BY_GENRE:
          serviceImpl.getChargeByGenre((Charge.GenreRequest) request,
              (io.grpc.stub.StreamObserver<Charge.StringReply>) responseObserver);
          break;
        case METHODID_CURRENT_COST_SUM:
          serviceImpl.currentCostSum((Charge.AllRequest) request,
              (io.grpc.stub.StreamObserver<Charge.CostReply>) responseObserver);
          break;
        case METHODID_GET_CHARGE_ALL:
          serviceImpl.getChargeAll((Charge.AllRequest) request,
              (io.grpc.stub.StreamObserver<Charge.StringReply>) responseObserver);
          break;
        case METHODID_POST_CHARGE:
          serviceImpl.postCharge((Charge.ChargeRequest) request,
              (io.grpc.stub.StreamObserver<Charge.StringReply>) responseObserver);
          break;
        case METHODID_PUT_CHARGE:
          serviceImpl.putCharge((Charge.ChargeRequest) request,
              (io.grpc.stub.StreamObserver<Charge.StringReply>) responseObserver);
          break;
        case METHODID_PATCH_CHARGE:
          serviceImpl.patchCharge((Charge.ChargeRequest) request,
              (io.grpc.stub.StreamObserver<Charge.StringReply>) responseObserver);
          break;
        case METHODID_DELETE_CHARGE_BY_ID:
          serviceImpl.deleteChargeById((Charge.ChargeRequest) request,
              (io.grpc.stub.StreamObserver<Charge.StringReply>) responseObserver);
          break;
        case METHODID_DELETE_CHARGE_ALL:
          serviceImpl.deleteChargeAll((Charge.ChargeRequest) request,
              (io.grpc.stub.StreamObserver<Charge.StringReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetChargeByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Charge.IdRequest,
              Charge.StringReply>(
                service, METHODID_GET_CHARGE_BY_ID)))
        .addMethod(
          getGetChargeByDateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              Charge.DateRequest,
              Charge.StringReply>(
                service, METHODID_GET_CHARGE_BY_DATE)))
        .addMethod(
          getGetChargeByGenreMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              Charge.GenreRequest,
              Charge.StringReply>(
                service, METHODID_GET_CHARGE_BY_GENRE)))
        .addMethod(
          getCurrentCostSumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Charge.AllRequest,
              Charge.CostReply>(
                service, METHODID_CURRENT_COST_SUM)))
        .addMethod(
          getGetChargeAllMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              Charge.AllRequest,
              Charge.StringReply>(
                service, METHODID_GET_CHARGE_ALL)))
        .addMethod(
          getPostChargeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Charge.ChargeRequest,
              Charge.StringReply>(
                service, METHODID_POST_CHARGE)))
        .addMethod(
          getPutChargeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Charge.ChargeRequest,
              Charge.StringReply>(
                service, METHODID_PUT_CHARGE)))
        .addMethod(
          getPatchChargeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Charge.ChargeRequest,
              Charge.StringReply>(
                service, METHODID_PATCH_CHARGE)))
        .addMethod(
          getDeleteChargeByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Charge.ChargeRequest,
              Charge.StringReply>(
                service, METHODID_DELETE_CHARGE_BY_ID)))
        .addMethod(
          getDeleteChargeAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Charge.ChargeRequest,
              Charge.StringReply>(
                service, METHODID_DELETE_CHARGE_ALL)))
        .build();
  }

  private static abstract class ChargerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChargerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Charge.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Charger");
    }
  }

  private static final class ChargerFileDescriptorSupplier
      extends ChargerBaseDescriptorSupplier {
    ChargerFileDescriptorSupplier() {}
  }

  private static final class ChargerMethodDescriptorSupplier
      extends ChargerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ChargerMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChargerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChargerFileDescriptorSupplier())
              .addMethod(getGetChargeByIdMethod())
              .addMethod(getGetChargeByDateMethod())
              .addMethod(getGetChargeByGenreMethod())
              .addMethod(getCurrentCostSumMethod())
              .addMethod(getGetChargeAllMethod())
              .addMethod(getPostChargeMethod())
              .addMethod(getPutChargeMethod())
              .addMethod(getPatchChargeMethod())
              .addMethod(getDeleteChargeByIdMethod())
              .addMethod(getDeleteChargeAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
