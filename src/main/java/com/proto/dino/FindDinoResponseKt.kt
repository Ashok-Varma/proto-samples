//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: dino.proto

package com.proto.dino;

@kotlin.jvm.JvmName("-initializefindDinoResponse")
public inline fun findDinoResponse(block: com.proto.dino.FindDinoResponseKt.Dsl.() -> kotlin.Unit): com.proto.dino.FindDinoResponse =
  com.proto.dino.FindDinoResponseKt.Dsl._create(com.proto.dino.FindDinoResponse.newBuilder()).apply { block() }._build()
public object FindDinoResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.proto.dino.FindDinoResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.proto.dino.FindDinoResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.proto.dino.FindDinoResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DinosaursProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
     public val dinosaurs: com.google.protobuf.kotlin.DslList<com.proto.dino.Dinosaur, DinosaursProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDinosaursList()
      )
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     * @param value The dinosaurs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDinosaurs")
    public fun com.google.protobuf.kotlin.DslList<com.proto.dino.Dinosaur, DinosaursProxy>.add(value: com.proto.dino.Dinosaur) {
      _builder.addDinosaurs(value)
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     * @param value The dinosaurs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDinosaurs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.proto.dino.Dinosaur, DinosaursProxy>.plusAssign(value: com.proto.dino.Dinosaur) {
      add(value)
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     * @param values The dinosaurs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDinosaurs")
    public fun com.google.protobuf.kotlin.DslList<com.proto.dino.Dinosaur, DinosaursProxy>.addAll(values: kotlin.collections.Iterable<com.proto.dino.Dinosaur>) {
      _builder.addAllDinosaurs(values)
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     * @param values The dinosaurs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDinosaurs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.proto.dino.Dinosaur, DinosaursProxy>.plusAssign(values: kotlin.collections.Iterable<com.proto.dino.Dinosaur>) {
      addAll(values)
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     * @param index The index to set the value at.
     * @param value The dinosaurs to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDinosaurs")
    public operator fun com.google.protobuf.kotlin.DslList<com.proto.dino.Dinosaur, DinosaursProxy>.set(index: kotlin.Int, value: com.proto.dino.Dinosaur) {
      _builder.setDinosaurs(index, value)
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDinosaurs")
    public fun com.google.protobuf.kotlin.DslList<com.proto.dino.Dinosaur, DinosaursProxy>.clear() {
      _builder.clearDinosaurs()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.proto.dino.FindDinoResponse.copy(block: com.proto.dino.FindDinoResponseKt.Dsl.() -> kotlin.Unit): com.proto.dino.FindDinoResponse =
  com.proto.dino.FindDinoResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
