package com.proto.dino

import com.proto.dino.DinoServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for test3.DinoService.
 */
object DinoServiceGrpcKt {
  const val SERVICE_NAME: String = DinoServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = DinoServiceGrpc.getServiceDescriptor()

  val findDinoMethod: MethodDescriptor<FindDinoRequest, FindDinoResponse>
    @JvmStatic
    get() = DinoServiceGrpc.getFindDinoMethod()

  /**
   * A stub for issuing RPCs to a(n) test3.DinoService service as suspending coroutines.
   */
  @StubFor(DinoServiceGrpc::class)
  class DinoServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<DinoServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): DinoServiceCoroutineStub =
        DinoServiceCoroutineStub(channel, callOptions)

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
    suspend fun findDino(request: FindDinoRequest, headers: Metadata = Metadata()): FindDinoResponse
        = unaryRpc(
      channel,
      DinoServiceGrpc.getFindDinoMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the test3.DinoService service based on Kotlin coroutines.
   */
  abstract class DinoServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for test3.DinoService.findDino.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun findDino(request: FindDinoRequest): FindDinoResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method test3.DinoService.findDino is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DinoServiceGrpc.getFindDinoMethod(),
      implementation = ::findDino
    )).build()
  }
}
