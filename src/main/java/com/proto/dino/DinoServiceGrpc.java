package com.proto.dino;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: dino.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DinoServiceGrpc {

  private DinoServiceGrpc() {}

  public static final String SERVICE_NAME = "test3.DinoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.dino.FindDinoRequest,
      com.proto.dino.FindDinoResponse> getFindDinoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findDino",
      requestType = com.proto.dino.FindDinoRequest.class,
      responseType = com.proto.dino.FindDinoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.dino.FindDinoRequest,
      com.proto.dino.FindDinoResponse> getFindDinoMethod() {
    io.grpc.MethodDescriptor<com.proto.dino.FindDinoRequest, com.proto.dino.FindDinoResponse> getFindDinoMethod;
    if ((getFindDinoMethod = DinoServiceGrpc.getFindDinoMethod) == null) {
      synchronized (DinoServiceGrpc.class) {
        if ((getFindDinoMethod = DinoServiceGrpc.getFindDinoMethod) == null) {
          DinoServiceGrpc.getFindDinoMethod = getFindDinoMethod =
              io.grpc.MethodDescriptor.<com.proto.dino.FindDinoRequest, com.proto.dino.FindDinoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findDino"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.dino.FindDinoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.dino.FindDinoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getFindDinoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DinoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DinoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DinoServiceStub>() {
        @java.lang.Override
        public DinoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DinoServiceStub(channel, callOptions);
        }
      };
    return DinoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DinoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DinoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DinoServiceBlockingStub>() {
        @java.lang.Override
        public DinoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DinoServiceBlockingStub(channel, callOptions);
        }
      };
    return DinoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DinoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DinoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DinoServiceFutureStub>() {
        @java.lang.Override
        public DinoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DinoServiceFutureStub(channel, callOptions);
        }
      };
    return DinoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DinoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * endpoint to find dino's with request specified
     * </pre>
     */
    public void findDino(com.proto.dino.FindDinoRequest request,
        io.grpc.stub.StreamObserver<com.proto.dino.FindDinoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindDinoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindDinoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.dino.FindDinoRequest,
                com.proto.dino.FindDinoResponse>(
                  this, METHODID_FIND_DINO)))
          .build();
    }
  }

  /**
   */
  public static final class DinoServiceStub extends io.grpc.stub.AbstractAsyncStub<DinoServiceStub> {
    private DinoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DinoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DinoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * endpoint to find dino's with request specified
     * </pre>
     */
    public void findDino(com.proto.dino.FindDinoRequest request,
        io.grpc.stub.StreamObserver<com.proto.dino.FindDinoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindDinoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DinoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DinoServiceBlockingStub> {
    private DinoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DinoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DinoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * endpoint to find dino's with request specified
     * </pre>
     */
    public com.proto.dino.FindDinoResponse findDino(com.proto.dino.FindDinoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindDinoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DinoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DinoServiceFutureStub> {
    private DinoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DinoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DinoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * endpoint to find dino's with request specified
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.dino.FindDinoResponse> findDino(
        com.proto.dino.FindDinoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindDinoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_DINO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DinoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DinoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_DINO:
          serviceImpl.findDino((com.proto.dino.FindDinoRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.dino.FindDinoResponse>) responseObserver);
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

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DinoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getFindDinoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
