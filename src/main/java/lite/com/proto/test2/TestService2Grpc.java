package com.proto.test2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: test2.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestService2Grpc {

  private TestService2Grpc() {}

  public static final String SERVICE_NAME = "test2.TestService2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.test2.TestService2Request,
      com.proto.test2.TestService2Response> getTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "test",
      requestType = com.proto.test2.TestService2Request.class,
      responseType = com.proto.test2.TestService2Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.test2.TestService2Request,
      com.proto.test2.TestService2Response> getTestMethod() {
    io.grpc.MethodDescriptor<com.proto.test2.TestService2Request, com.proto.test2.TestService2Response> getTestMethod;
    if ((getTestMethod = TestService2Grpc.getTestMethod) == null) {
      synchronized (TestService2Grpc.class) {
        if ((getTestMethod = TestService2Grpc.getTestMethod) == null) {
          TestService2Grpc.getTestMethod = getTestMethod =
              io.grpc.MethodDescriptor.<com.proto.test2.TestService2Request, com.proto.test2.TestService2Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "test"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.test2.TestService2Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.test2.TestService2Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestService2Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestService2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestService2Stub>() {
        @java.lang.Override
        public TestService2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestService2Stub(channel, callOptions);
        }
      };
    return TestService2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestService2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestService2BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestService2BlockingStub>() {
        @java.lang.Override
        public TestService2BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestService2BlockingStub(channel, callOptions);
        }
      };
    return TestService2BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestService2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestService2FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestService2FutureStub>() {
        @java.lang.Override
        public TestService2FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestService2FutureStub(channel, callOptions);
        }
      };
    return TestService2FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TestService2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void test(com.proto.test2.TestService2Request request,
        io.grpc.stub.StreamObserver<com.proto.test2.TestService2Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.test2.TestService2Request,
                com.proto.test2.TestService2Response>(
                  this, METHODID_TEST)))
          .build();
    }
  }

  /**
   */
  public static final class TestService2Stub extends io.grpc.stub.AbstractAsyncStub<TestService2Stub> {
    private TestService2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestService2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestService2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void test(com.proto.test2.TestService2Request request,
        io.grpc.stub.StreamObserver<com.proto.test2.TestService2Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TestService2BlockingStub extends io.grpc.stub.AbstractBlockingStub<TestService2BlockingStub> {
    private TestService2BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestService2BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestService2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.proto.test2.TestService2Response test(com.proto.test2.TestService2Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestService2FutureStub extends io.grpc.stub.AbstractFutureStub<TestService2FutureStub> {
    private TestService2FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestService2FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestService2FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.test2.TestService2Response> test(
        com.proto.test2.TestService2Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestService2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestService2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST:
          serviceImpl.test((com.proto.test2.TestService2Request) request,
              (io.grpc.stub.StreamObserver<com.proto.test2.TestService2Response>) responseObserver);
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
      synchronized (TestService2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getTestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
