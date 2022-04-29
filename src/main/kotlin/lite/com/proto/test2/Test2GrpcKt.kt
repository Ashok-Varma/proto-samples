package com.proto.test2

import com.proto.test2.TestService2Grpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for test2.TestService2.
 */
object TestService2GrpcKt {
  const val SERVICE_NAME: String = TestService2Grpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = TestService2Grpc.getServiceDescriptor()

  val testMethod: MethodDescriptor<TestService2Request, TestService2Response>
    @JvmStatic
    get() = TestService2Grpc.getTestMethod()

  /**
   * A stub for issuing RPCs to a(n) test2.TestService2 service as suspending coroutines.
   */
  @StubFor(TestService2Grpc::class)
  class TestService2CoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<TestService2CoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): TestService2CoroutineStub =
        TestService2CoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun test(request: TestService2Request, headers: Metadata = Metadata()):
        TestService2Response = unaryRpc(
      channel,
      TestService2Grpc.getTestMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the test2.TestService2 service based on Kotlin coroutines.
   */
  abstract class TestService2CoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for test2.TestService2.test.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun test(request: TestService2Request): TestService2Response = throw
        StatusException(UNIMPLEMENTED.withDescription("Method test2.TestService2.test is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TestService2Grpc.getTestMethod(),
      implementation = ::test
    )).build()
  }
}
