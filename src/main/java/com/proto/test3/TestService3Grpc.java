package com.proto.test3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: test3.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestService3Grpc {

  private TestService3Grpc() {}

  public static final String SERVICE_NAME = "test3.TestService3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.test3.TestService3Request,
      com.proto.test3.TestService3Response> getTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "test",
      requestType = com.proto.test3.TestService3Request.class,
      responseType = com.proto.test3.TestService3Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.test3.TestService3Request,
      com.proto.test3.TestService3Response> getTestMethod() {
    io.grpc.MethodDescriptor<com.proto.test3.TestService3Request, com.proto.test3.TestService3Response> getTestMethod;
    if ((getTestMethod = TestService3Grpc.getTestMethod) == null) {
      synchronized (TestService3Grpc.class) {
        if ((getTestMethod = TestService3Grpc.getTestMethod) == null) {
          TestService3Grpc.getTestMethod = getTestMethod =
              io.grpc.MethodDescriptor.<com.proto.test3.TestService3Request, com.proto.test3.TestService3Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "test"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.test3.TestService3Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.test3.TestService3Response.getDefaultInstance()))
              .setSchemaDescriptor(new TestService3MethodDescriptorSupplier("test"))
              .build();
        }
      }
    }
    return getTestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestService3Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestService3Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestService3Stub>() {
        @java.lang.Override
        public TestService3Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestService3Stub(channel, callOptions);
        }
      };
    return TestService3Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestService3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestService3BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestService3BlockingStub>() {
        @java.lang.Override
        public TestService3BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestService3BlockingStub(channel, callOptions);
        }
      };
    return TestService3BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestService3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestService3FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestService3FutureStub>() {
        @java.lang.Override
        public TestService3FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestService3FutureStub(channel, callOptions);
        }
      };
    return TestService3FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TestService3ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void test(com.proto.test3.TestService3Request request,
        io.grpc.stub.StreamObserver<com.proto.test3.TestService3Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.test3.TestService3Request,
                com.proto.test3.TestService3Response>(
                  this, METHODID_TEST)))
          .build();
    }
  }

  /**
   */
  public static final class TestService3Stub extends io.grpc.stub.AbstractAsyncStub<TestService3Stub> {
    private TestService3Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestService3Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestService3Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void test(com.proto.test3.TestService3Request request,
        io.grpc.stub.StreamObserver<com.proto.test3.TestService3Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TestService3BlockingStub extends io.grpc.stub.AbstractBlockingStub<TestService3BlockingStub> {
    private TestService3BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestService3BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestService3BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.proto.test3.TestService3Response test(com.proto.test3.TestService3Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestService3FutureStub extends io.grpc.stub.AbstractFutureStub<TestService3FutureStub> {
    private TestService3FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestService3FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestService3FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.test3.TestService3Response> test(
        com.proto.test3.TestService3Request request) {
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
    private final TestService3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestService3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST:
          serviceImpl.test((com.proto.test3.TestService3Request) request,
              (io.grpc.stub.StreamObserver<com.proto.test3.TestService3Response>) responseObserver);
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

  private static abstract class TestService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestService3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.test3.Test3.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestService3");
    }
  }

  private static final class TestService3FileDescriptorSupplier
      extends TestService3BaseDescriptorSupplier {
    TestService3FileDescriptorSupplier() {}
  }

  private static final class TestService3MethodDescriptorSupplier
      extends TestService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestService3MethodDescriptorSupplier(String methodName) {
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
      synchronized (TestService3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestService3FileDescriptorSupplier())
              .addMethod(getTestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
