// Code generated by Wire protocol buffer compiler, do not edit.
// Source: test2.TestService2Request in test2.proto
package com.proto.test2;

import androidx.annotation.Nullable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class TestService2Request extends Message<TestService2Request, TestService2Request.Builder> {
  public static final ProtoAdapter<TestService2Request> ADAPTER = ProtoAdapter.newMessageAdapter(TestService2Request.class, "type.googleapis.com/test2.TestService2Request", Syntax.PROTO_2);

  private static final long serialVersionUID = 0L;

  public static final Double DEFAULT_OPTIONALDOUBLE = 0.0d;

  public static final Double DEFAULT_REQUIREDDOUBLE = 0.0d;

  public static final Integer DEFAULT_OPTIONALINT32 = 0;

  public static final Integer DEFAULT_REQUIREDINT32 = 0;

  public static final Long DEFAULT_OPTIONALINT64 = 0L;

  public static final Long DEFAULT_REQUIREDINT64 = 0L;

  public static final Integer DEFAULT_OPTIONALUINT32 = 0;

  public static final Integer DEFAULT_REQUIREDUINT32 = 0;

  public static final Long DEFAULT_OPTIONALUINT64 = 0L;

  public static final Long DEFAULT_REQUIREDUINT64 = 0L;

  public static final Integer DEFAULT_OPTIONALSINT32 = 0;

  public static final Integer DEFAULT_REQUIREDSINT32 = 0;

  public static final Long DEFAULT_OPTIONALSINT64 = 0L;

  public static final Long DEFAULT_REQUIREDSINT64 = 0L;

  public static final Integer DEFAULT_OPTIONALFIXED32 = 0;

  public static final Integer DEFAULT_REQUIREDFIXED32 = 0;

  public static final Long DEFAULT_OPTIONALFIXED64 = 0L;

  public static final Long DEFAULT_REQUIREDFIXED64 = 0L;

  public static final Integer DEFAULT_OPTIONALSFIXED32 = 0;

  public static final Integer DEFAULT_REQUIREDSFIXED32 = 0;

  public static final Long DEFAULT_OPTIONALSFIXED64 = 0L;

  public static final Long DEFAULT_REQUIREDSFIXED64 = 0L;

  public static final Boolean DEFAULT_OPTIONALBOOL = false;

  public static final Boolean DEFAULT_REQUIREDBOOL = false;

  public static final String DEFAULT_OPTIONALSTRING = "";

  public static final String DEFAULT_REQUIREDSTRING = "";

  public static final ByteString DEFAULT_OPTIONALBYTES = ByteString.EMPTY;

  public static final ByteString DEFAULT_REQUIREDBYTES = ByteString.EMPTY;

  public static final Integer DEFAULT_OPTIONALWITHDEFAULTINT32 = 10;

  public static final String DEFAULT_OPTIONALWITHDEFAULTSTRING = "temp_holder";

  public static final Corpus DEFAULT_CORPUS = Corpus.UNIVERSAL;

  public static final Integer DEFAULT_EXTENSION_SCOPE = 0;

  public static final String DEFAULT_NAME = "";

  /**
   *  https://developers.google.com/protocol-buffers/docs/proto#specifying-rules
   *  https://developers.google.com/protocol-buffers/docs/proto#scalar
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  @Nullable
  public final Double optionalDouble;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE",
      label = WireField.Label.REQUIRED
  )
  public final Double requiredDouble;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  @Nullable
  public final Integer optionalInt32;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.REQUIRED
  )
  public final Integer requiredInt32;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  @Nullable
  public final Long optionalInt64;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#INT64",
      label = WireField.Label.REQUIRED
  )
  public final Long requiredInt64;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  @Nullable
  public final Integer optionalUint32;

  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32",
      label = WireField.Label.REQUIRED
  )
  public final Integer requiredUint32;

  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  @Nullable
  public final Long optionalUint64;

  @WireField(
      tag = 14,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64",
      label = WireField.Label.REQUIRED
  )
  public final Long requiredUint64;

  @WireField(
      tag = 16,
      adapter = "com.squareup.wire.ProtoAdapter#SINT32"
  )
  @Nullable
  public final Integer optionalSint32;

  @WireField(
      tag = 17,
      adapter = "com.squareup.wire.ProtoAdapter#SINT32",
      label = WireField.Label.REQUIRED
  )
  public final Integer requiredSint32;

  @WireField(
      tag = 18,
      adapter = "com.squareup.wire.ProtoAdapter#SINT64"
  )
  @Nullable
  public final Long optionalSint64;

  @WireField(
      tag = 19,
      adapter = "com.squareup.wire.ProtoAdapter#SINT64",
      label = WireField.Label.REQUIRED
  )
  public final Long requiredSint64;

  @WireField(
      tag = 20,
      adapter = "com.squareup.wire.ProtoAdapter#FIXED32"
  )
  @Nullable
  public final Integer optionalFixed32;

  @WireField(
      tag = 21,
      adapter = "com.squareup.wire.ProtoAdapter#FIXED32",
      label = WireField.Label.REQUIRED
  )
  public final Integer requiredFixed32;

  @WireField(
      tag = 22,
      adapter = "com.squareup.wire.ProtoAdapter#FIXED64"
  )
  @Nullable
  public final Long optionalFixed64;

  @WireField(
      tag = 23,
      adapter = "com.squareup.wire.ProtoAdapter#FIXED64",
      label = WireField.Label.REQUIRED
  )
  public final Long requiredFixed64;

  @WireField(
      tag = 24,
      adapter = "com.squareup.wire.ProtoAdapter#SFIXED32"
  )
  @Nullable
  public final Integer optionalSfixed32;

  @WireField(
      tag = 25,
      adapter = "com.squareup.wire.ProtoAdapter#SFIXED32",
      label = WireField.Label.REQUIRED
  )
  public final Integer requiredSfixed32;

  @WireField(
      tag = 26,
      adapter = "com.squareup.wire.ProtoAdapter#SFIXED64"
  )
  @Nullable
  public final Long optionalSfixed64;

  @WireField(
      tag = 27,
      adapter = "com.squareup.wire.ProtoAdapter#SFIXED64",
      label = WireField.Label.REQUIRED
  )
  public final Long requiredSfixed64;

  @WireField(
      tag = 28,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @Nullable
  public final Boolean optionalBool;

  @WireField(
      tag = 29,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL",
      label = WireField.Label.REQUIRED
  )
  public final Boolean requiredBool;

  @WireField(
      tag = 30,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @Nullable
  public final String optionalString;

  @WireField(
      tag = 31,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REQUIRED
  )
  public final String requiredString;

  @WireField(
      tag = 32,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  @Nullable
  public final ByteString optionalBytes;

  @WireField(
      tag = 33,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES",
      label = WireField.Label.REQUIRED
  )
  public final ByteString requiredBytes;

  @WireField(
      tag = 34,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  @Nullable
  public final Integer optionalWithDefaultInt32;

  @WireField(
      tag = 35,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @Nullable
  public final String optionalWithDefaultString;

  @WireField(
      tag = 36,
      adapter = "com.proto.test2.TestService2Request$Corpus#ADAPTER"
  )
  @Nullable
  public final Corpus corpus;

  /**
   *  https://developers.google.com/protocol-buffers/docs/proto#other
   */
  @WireField(
      tag = 37,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.PACKED
  )
  public final List<Integer> samples;

  /**
   *  https://developers.google.com/protocol-buffers/docs/proto#maps (MAps can't have lables)
   */
  @WireField(
      tag = 40,
      keyAdapter = "com.squareup.wire.ProtoAdapter#STRING",
      adapter = "com.proto.test2.TestService2Request$NestedMessage#ADAPTER"
  )
  public final Map<String, NestedMessage> map;

  @WireField(
      tag = 41,
      adapter = "com.proto.test2.TestService2Request$MapFieldEntry#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<MapFieldEntry> map_field;

  /**
   * Extension source: test2.proto
   */
  @WireField(
      tag = 126,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  @Nullable
  public final Integer extension_scope;

  @WireField(
      tag = 38,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      oneofName = "oneOfField"
  )
  @Nullable
  public final String name;

  @WireField(
      tag = 39,
      adapter = "com.proto.test2.TestService2Request$NestedMessage#ADAPTER",
      oneofName = "oneOfField"
  )
  @Nullable
  public final NestedMessage nested;

  public TestService2Request(Builder builder, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    if (Internal.countNonNull(builder.name, builder.nested) > 1) {
      throw new IllegalArgumentException("at most one of builder.name, builder.nested may be non-null");
    }
    this.optionalDouble = builder.optionalDouble;
    this.requiredDouble = builder.requiredDouble;
    this.optionalInt32 = builder.optionalInt32;
    this.requiredInt32 = builder.requiredInt32;
    this.optionalInt64 = builder.optionalInt64;
    this.requiredInt64 = builder.requiredInt64;
    this.optionalUint32 = builder.optionalUint32;
    this.requiredUint32 = builder.requiredUint32;
    this.optionalUint64 = builder.optionalUint64;
    this.requiredUint64 = builder.requiredUint64;
    this.optionalSint32 = builder.optionalSint32;
    this.requiredSint32 = builder.requiredSint32;
    this.optionalSint64 = builder.optionalSint64;
    this.requiredSint64 = builder.requiredSint64;
    this.optionalFixed32 = builder.optionalFixed32;
    this.requiredFixed32 = builder.requiredFixed32;
    this.optionalFixed64 = builder.optionalFixed64;
    this.requiredFixed64 = builder.requiredFixed64;
    this.optionalSfixed32 = builder.optionalSfixed32;
    this.requiredSfixed32 = builder.requiredSfixed32;
    this.optionalSfixed64 = builder.optionalSfixed64;
    this.requiredSfixed64 = builder.requiredSfixed64;
    this.optionalBool = builder.optionalBool;
    this.requiredBool = builder.requiredBool;
    this.optionalString = builder.optionalString;
    this.requiredString = builder.requiredString;
    this.optionalBytes = builder.optionalBytes;
    this.requiredBytes = builder.requiredBytes;
    this.optionalWithDefaultInt32 = builder.optionalWithDefaultInt32;
    this.optionalWithDefaultString = builder.optionalWithDefaultString;
    this.corpus = builder.corpus;
    this.samples = Internal.immutableCopyOf("samples", builder.samples);
    this.map = Internal.immutableCopyOf("map", builder.map);
    this.map_field = Internal.immutableCopyOf("map_field", builder.map_field);
    this.extension_scope = builder.extension_scope;
    this.name = builder.name;
    this.nested = builder.nested;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.optionalDouble = optionalDouble;
    builder.requiredDouble = requiredDouble;
    builder.optionalInt32 = optionalInt32;
    builder.requiredInt32 = requiredInt32;
    builder.optionalInt64 = optionalInt64;
    builder.requiredInt64 = requiredInt64;
    builder.optionalUint32 = optionalUint32;
    builder.requiredUint32 = requiredUint32;
    builder.optionalUint64 = optionalUint64;
    builder.requiredUint64 = requiredUint64;
    builder.optionalSint32 = optionalSint32;
    builder.requiredSint32 = requiredSint32;
    builder.optionalSint64 = optionalSint64;
    builder.requiredSint64 = requiredSint64;
    builder.optionalFixed32 = optionalFixed32;
    builder.requiredFixed32 = requiredFixed32;
    builder.optionalFixed64 = optionalFixed64;
    builder.requiredFixed64 = requiredFixed64;
    builder.optionalSfixed32 = optionalSfixed32;
    builder.requiredSfixed32 = requiredSfixed32;
    builder.optionalSfixed64 = optionalSfixed64;
    builder.requiredSfixed64 = requiredSfixed64;
    builder.optionalBool = optionalBool;
    builder.requiredBool = requiredBool;
    builder.optionalString = optionalString;
    builder.requiredString = requiredString;
    builder.optionalBytes = optionalBytes;
    builder.requiredBytes = requiredBytes;
    builder.optionalWithDefaultInt32 = optionalWithDefaultInt32;
    builder.optionalWithDefaultString = optionalWithDefaultString;
    builder.corpus = corpus;
    builder.samples = Internal.copyOf(samples);
    builder.map = Internal.copyOf(map);
    builder.map_field = Internal.copyOf(map_field);
    builder.extension_scope = extension_scope;
    builder.name = name;
    builder.nested = nested;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof TestService2Request)) return false;
    TestService2Request o = (TestService2Request) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(optionalDouble, o.optionalDouble)
        && requiredDouble.equals(o.requiredDouble)
        && Internal.equals(optionalInt32, o.optionalInt32)
        && requiredInt32.equals(o.requiredInt32)
        && Internal.equals(optionalInt64, o.optionalInt64)
        && requiredInt64.equals(o.requiredInt64)
        && Internal.equals(optionalUint32, o.optionalUint32)
        && requiredUint32.equals(o.requiredUint32)
        && Internal.equals(optionalUint64, o.optionalUint64)
        && requiredUint64.equals(o.requiredUint64)
        && Internal.equals(optionalSint32, o.optionalSint32)
        && requiredSint32.equals(o.requiredSint32)
        && Internal.equals(optionalSint64, o.optionalSint64)
        && requiredSint64.equals(o.requiredSint64)
        && Internal.equals(optionalFixed32, o.optionalFixed32)
        && requiredFixed32.equals(o.requiredFixed32)
        && Internal.equals(optionalFixed64, o.optionalFixed64)
        && requiredFixed64.equals(o.requiredFixed64)
        && Internal.equals(optionalSfixed32, o.optionalSfixed32)
        && requiredSfixed32.equals(o.requiredSfixed32)
        && Internal.equals(optionalSfixed64, o.optionalSfixed64)
        && requiredSfixed64.equals(o.requiredSfixed64)
        && Internal.equals(optionalBool, o.optionalBool)
        && requiredBool.equals(o.requiredBool)
        && Internal.equals(optionalString, o.optionalString)
        && requiredString.equals(o.requiredString)
        && Internal.equals(optionalBytes, o.optionalBytes)
        && requiredBytes.equals(o.requiredBytes)
        && Internal.equals(optionalWithDefaultInt32, o.optionalWithDefaultInt32)
        && Internal.equals(optionalWithDefaultString, o.optionalWithDefaultString)
        && Internal.equals(corpus, o.corpus)
        && samples.equals(o.samples)
        && map.equals(o.map)
        && map_field.equals(o.map_field)
        && Internal.equals(extension_scope, o.extension_scope)
        && Internal.equals(name, o.name)
        && Internal.equals(nested, o.nested);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (optionalDouble != null ? optionalDouble.hashCode() : 0);
      result = result * 37 + requiredDouble.hashCode();
      result = result * 37 + (optionalInt32 != null ? optionalInt32.hashCode() : 0);
      result = result * 37 + requiredInt32.hashCode();
      result = result * 37 + (optionalInt64 != null ? optionalInt64.hashCode() : 0);
      result = result * 37 + requiredInt64.hashCode();
      result = result * 37 + (optionalUint32 != null ? optionalUint32.hashCode() : 0);
      result = result * 37 + requiredUint32.hashCode();
      result = result * 37 + (optionalUint64 != null ? optionalUint64.hashCode() : 0);
      result = result * 37 + requiredUint64.hashCode();
      result = result * 37 + (optionalSint32 != null ? optionalSint32.hashCode() : 0);
      result = result * 37 + requiredSint32.hashCode();
      result = result * 37 + (optionalSint64 != null ? optionalSint64.hashCode() : 0);
      result = result * 37 + requiredSint64.hashCode();
      result = result * 37 + (optionalFixed32 != null ? optionalFixed32.hashCode() : 0);
      result = result * 37 + requiredFixed32.hashCode();
      result = result * 37 + (optionalFixed64 != null ? optionalFixed64.hashCode() : 0);
      result = result * 37 + requiredFixed64.hashCode();
      result = result * 37 + (optionalSfixed32 != null ? optionalSfixed32.hashCode() : 0);
      result = result * 37 + requiredSfixed32.hashCode();
      result = result * 37 + (optionalSfixed64 != null ? optionalSfixed64.hashCode() : 0);
      result = result * 37 + requiredSfixed64.hashCode();
      result = result * 37 + (optionalBool != null ? optionalBool.hashCode() : 0);
      result = result * 37 + requiredBool.hashCode();
      result = result * 37 + (optionalString != null ? optionalString.hashCode() : 0);
      result = result * 37 + requiredString.hashCode();
      result = result * 37 + (optionalBytes != null ? optionalBytes.hashCode() : 0);
      result = result * 37 + requiredBytes.hashCode();
      result = result * 37 + (optionalWithDefaultInt32 != null ? optionalWithDefaultInt32.hashCode() : 0);
      result = result * 37 + (optionalWithDefaultString != null ? optionalWithDefaultString.hashCode() : 0);
      result = result * 37 + (corpus != null ? corpus.hashCode() : 0);
      result = result * 37 + samples.hashCode();
      result = result * 37 + map.hashCode();
      result = result * 37 + map_field.hashCode();
      result = result * 37 + (extension_scope != null ? extension_scope.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (nested != null ? nested.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<TestService2Request, Builder> {
    public Double optionalDouble;

    public Double requiredDouble;

    public Integer optionalInt32;

    public Integer requiredInt32;

    public Long optionalInt64;

    public Long requiredInt64;

    public Integer optionalUint32;

    public Integer requiredUint32;

    public Long optionalUint64;

    public Long requiredUint64;

    public Integer optionalSint32;

    public Integer requiredSint32;

    public Long optionalSint64;

    public Long requiredSint64;

    public Integer optionalFixed32;

    public Integer requiredFixed32;

    public Long optionalFixed64;

    public Long requiredFixed64;

    public Integer optionalSfixed32;

    public Integer requiredSfixed32;

    public Long optionalSfixed64;

    public Long requiredSfixed64;

    public Boolean optionalBool;

    public Boolean requiredBool;

    public String optionalString;

    public String requiredString;

    public ByteString optionalBytes;

    public ByteString requiredBytes;

    public Integer optionalWithDefaultInt32;

    public String optionalWithDefaultString;

    public Corpus corpus;

    public List<Integer> samples;

    public Map<String, NestedMessage> map;

    public List<MapFieldEntry> map_field;

    public Integer extension_scope;

    public String name;

    public NestedMessage nested;

    public Builder() {
      samples = Internal.newMutableList();
      map = Internal.newMutableMap();
      map_field = Internal.newMutableList();
    }

    /**
     *  https://developers.google.com/protocol-buffers/docs/proto#specifying-rules
     *  https://developers.google.com/protocol-buffers/docs/proto#scalar
     */
    public Builder optionalDouble(Double optionalDouble) {
      this.optionalDouble = optionalDouble;
      return this;
    }

    public Builder requiredDouble(Double requiredDouble) {
      this.requiredDouble = requiredDouble;
      return this;
    }

    public Builder optionalInt32(Integer optionalInt32) {
      this.optionalInt32 = optionalInt32;
      return this;
    }

    public Builder requiredInt32(Integer requiredInt32) {
      this.requiredInt32 = requiredInt32;
      return this;
    }

    public Builder optionalInt64(Long optionalInt64) {
      this.optionalInt64 = optionalInt64;
      return this;
    }

    public Builder requiredInt64(Long requiredInt64) {
      this.requiredInt64 = requiredInt64;
      return this;
    }

    public Builder optionalUint32(Integer optionalUint32) {
      this.optionalUint32 = optionalUint32;
      return this;
    }

    public Builder requiredUint32(Integer requiredUint32) {
      this.requiredUint32 = requiredUint32;
      return this;
    }

    public Builder optionalUint64(Long optionalUint64) {
      this.optionalUint64 = optionalUint64;
      return this;
    }

    public Builder requiredUint64(Long requiredUint64) {
      this.requiredUint64 = requiredUint64;
      return this;
    }

    public Builder optionalSint32(Integer optionalSint32) {
      this.optionalSint32 = optionalSint32;
      return this;
    }

    public Builder requiredSint32(Integer requiredSint32) {
      this.requiredSint32 = requiredSint32;
      return this;
    }

    public Builder optionalSint64(Long optionalSint64) {
      this.optionalSint64 = optionalSint64;
      return this;
    }

    public Builder requiredSint64(Long requiredSint64) {
      this.requiredSint64 = requiredSint64;
      return this;
    }

    public Builder optionalFixed32(Integer optionalFixed32) {
      this.optionalFixed32 = optionalFixed32;
      return this;
    }

    public Builder requiredFixed32(Integer requiredFixed32) {
      this.requiredFixed32 = requiredFixed32;
      return this;
    }

    public Builder optionalFixed64(Long optionalFixed64) {
      this.optionalFixed64 = optionalFixed64;
      return this;
    }

    public Builder requiredFixed64(Long requiredFixed64) {
      this.requiredFixed64 = requiredFixed64;
      return this;
    }

    public Builder optionalSfixed32(Integer optionalSfixed32) {
      this.optionalSfixed32 = optionalSfixed32;
      return this;
    }

    public Builder requiredSfixed32(Integer requiredSfixed32) {
      this.requiredSfixed32 = requiredSfixed32;
      return this;
    }

    public Builder optionalSfixed64(Long optionalSfixed64) {
      this.optionalSfixed64 = optionalSfixed64;
      return this;
    }

    public Builder requiredSfixed64(Long requiredSfixed64) {
      this.requiredSfixed64 = requiredSfixed64;
      return this;
    }

    public Builder optionalBool(Boolean optionalBool) {
      this.optionalBool = optionalBool;
      return this;
    }

    public Builder requiredBool(Boolean requiredBool) {
      this.requiredBool = requiredBool;
      return this;
    }

    public Builder optionalString(String optionalString) {
      this.optionalString = optionalString;
      return this;
    }

    public Builder requiredString(String requiredString) {
      this.requiredString = requiredString;
      return this;
    }

    public Builder optionalBytes(ByteString optionalBytes) {
      this.optionalBytes = optionalBytes;
      return this;
    }

    public Builder requiredBytes(ByteString requiredBytes) {
      this.requiredBytes = requiredBytes;
      return this;
    }

    public Builder optionalWithDefaultInt32(Integer optionalWithDefaultInt32) {
      this.optionalWithDefaultInt32 = optionalWithDefaultInt32;
      return this;
    }

    public Builder optionalWithDefaultString(String optionalWithDefaultString) {
      this.optionalWithDefaultString = optionalWithDefaultString;
      return this;
    }

    public Builder corpus(Corpus corpus) {
      this.corpus = corpus;
      return this;
    }

    /**
     *  https://developers.google.com/protocol-buffers/docs/proto#other
     */
    public Builder samples(List<Integer> samples) {
      Internal.checkElementsNotNull(samples);
      this.samples = samples;
      return this;
    }

    /**
     *  https://developers.google.com/protocol-buffers/docs/proto#maps (MAps can't have lables)
     */
    public Builder map(Map<String, NestedMessage> map) {
      Internal.checkElementsNotNull(map);
      this.map = map;
      return this;
    }

    public Builder map_field(List<MapFieldEntry> map_field) {
      Internal.checkElementsNotNull(map_field);
      this.map_field = map_field;
      return this;
    }

    public Builder extension_scope(Integer extension_scope) {
      this.extension_scope = extension_scope;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      this.nested = null;
      return this;
    }

    public Builder nested(NestedMessage nested) {
      this.nested = nested;
      this.name = null;
      return this;
    }

    @Override
    public TestService2Request build() {
      if (requiredDouble == null
          || requiredInt32 == null
          || requiredInt64 == null
          || requiredUint32 == null
          || requiredUint64 == null
          || requiredSint32 == null
          || requiredSint64 == null
          || requiredFixed32 == null
          || requiredFixed64 == null
          || requiredSfixed32 == null
          || requiredSfixed64 == null
          || requiredBool == null
          || requiredString == null
          || requiredBytes == null) {
        throw Internal.missingRequiredFields(requiredDouble, "requiredDouble",
            requiredInt32, "requiredInt32",
            requiredInt64, "requiredInt64",
            requiredUint32, "requiredUint32",
            requiredUint64, "requiredUint64",
            requiredSint32, "requiredSint32",
            requiredSint64, "requiredSint64",
            requiredFixed32, "requiredFixed32",
            requiredFixed64, "requiredFixed64",
            requiredSfixed32, "requiredSfixed32",
            requiredSfixed64, "requiredSfixed64",
            requiredBool, "requiredBool",
            requiredString, "requiredString",
            requiredBytes, "requiredBytes");
      }
      return new TestService2Request(this, super.buildUnknownFields());
    }
  }

  /**
   *  https://developers.google.com/protocol-buffers/docs/proto#enum
   */
  public enum Corpus implements WireEnum {
    UNIVERSAL(0),

    WEB(1),

    IMAGES(2),

    LOCAL(3),

    NEWS(4),

    PRODUCTS(5),

    VIDEO(6);

    public static final ProtoAdapter<Corpus> ADAPTER = ProtoAdapter.newEnumAdapter(Corpus.class);

    private final int value;

    Corpus(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static Corpus fromValue(int value) {
      switch (value) {
        case 0: return UNIVERSAL;
        case 1: return WEB;
        case 2: return IMAGES;
        case 3: return LOCAL;
        case 4: return NEWS;
        case 5: return PRODUCTS;
        case 6: return VIDEO;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  public enum EnumAllowingAlias implements WireEnum {
    UNKNOWN(0),

    STARTED(1),

    RUNNING(1);

    public static final ProtoAdapter<EnumAllowingAlias> ADAPTER = ProtoAdapter.newEnumAdapter(EnumAllowingAlias.class);

    private final int value;

    EnumAllowingAlias(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static EnumAllowingAlias fromValue(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return STARTED;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  /**
   * https://developers.google.com/protocol-buffers/docs/proto#nested
   */
  public static final class NestedMessage extends Message<NestedMessage, NestedMessage.Builder> {
    public static final ProtoAdapter<NestedMessage> ADAPTER = ProtoAdapter.newMessageAdapter(NestedMessage.class, "type.googleapis.com/test2.TestService2Request.NestedMessage", Syntax.PROTO_2);

    private static final long serialVersionUID = 0L;

    public static final String DEFAULT_URL = "";

    public static final String DEFAULT_TITLE = "";

    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.ProtoAdapter#STRING",
        label = WireField.Label.REQUIRED
    )
    public final String url;

    @WireField(
        tag = 2,
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
    )
    @Nullable
    public final String title;

    @WireField(
        tag = 3,
        adapter = "com.squareup.wire.ProtoAdapter#STRING",
        label = WireField.Label.REPEATED
    )
    public final List<String> snippets;

    public NestedMessage(String url, @Nullable String title, List<String> snippets) {
      this(url, title, snippets, ByteString.EMPTY);
    }

    public NestedMessage(String url, @Nullable String title, List<String> snippets,
        ByteString unknownFields) {
      super(ADAPTER, unknownFields);
      this.url = url;
      this.title = title;
      this.snippets = Internal.immutableCopyOf("snippets", snippets);
    }

    @Override
    public Builder newBuilder() {
      Builder builder = new Builder();
      builder.url = url;
      builder.title = title;
      builder.snippets = Internal.copyOf(snippets);
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof NestedMessage)) return false;
      NestedMessage o = (NestedMessage) other;
      return unknownFields().equals(o.unknownFields())
          && url.equals(o.url)
          && Internal.equals(title, o.title)
          && snippets.equals(o.snippets);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + url.hashCode();
        result = result * 37 + (title != null ? title.hashCode() : 0);
        result = result * 37 + snippets.hashCode();
        super.hashCode = result;
      }
      return result;
    }

    public static final class Builder extends Message.Builder<NestedMessage, Builder> {
      public String url;

      public String title;

      public List<String> snippets;

      public Builder() {
        snippets = Internal.newMutableList();
      }

      public Builder url(String url) {
        this.url = url;
        return this;
      }

      public Builder title(String title) {
        this.title = title;
        return this;
      }

      public Builder snippets(List<String> snippets) {
        Internal.checkElementsNotNull(snippets);
        this.snippets = snippets;
        return this;
      }

      @Override
      public NestedMessage build() {
        if (url == null) {
          throw Internal.missingRequiredFields(url, "url");
        }
        return new NestedMessage(url, title, snippets, super.buildUnknownFields());
      }
    }
  }

  /**
   * Map equivalent wire type (Backward compatibility) https://developers.google.com/protocol-buffers/docs/proto#backwards
   */
  public static final class MapFieldEntry extends Message<MapFieldEntry, MapFieldEntry.Builder> {
    public static final ProtoAdapter<MapFieldEntry> ADAPTER = ProtoAdapter.newMessageAdapter(MapFieldEntry.class, "type.googleapis.com/test2.TestService2Request.MapFieldEntry", Syntax.PROTO_2);

    private static final long serialVersionUID = 0L;

    public static final String DEFAULT_KEY = "";

    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
    )
    @Nullable
    public final String key;

    @WireField(
        tag = 2,
        adapter = "com.proto.test2.TestService2Request$NestedMessage#ADAPTER"
    )
    @Nullable
    public final NestedMessage value;

    public MapFieldEntry(@Nullable String key, @Nullable NestedMessage value) {
      this(key, value, ByteString.EMPTY);
    }

    public MapFieldEntry(@Nullable String key, @Nullable NestedMessage value,
        ByteString unknownFields) {
      super(ADAPTER, unknownFields);
      this.key = key;
      this.value = value;
    }

    @Override
    public Builder newBuilder() {
      Builder builder = new Builder();
      builder.key = key;
      builder.value = value;
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof MapFieldEntry)) return false;
      MapFieldEntry o = (MapFieldEntry) other;
      return unknownFields().equals(o.unknownFields())
          && Internal.equals(key, o.key)
          && Internal.equals(value, o.value);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + (key != null ? key.hashCode() : 0);
        result = result * 37 + (value != null ? value.hashCode() : 0);
        super.hashCode = result;
      }
      return result;
    }

    public static final class Builder extends Message.Builder<MapFieldEntry, Builder> {
      public String key;

      public NestedMessage value;

      public Builder() {
      }

      public Builder key(String key) {
        this.key = key;
        return this;
      }

      public Builder value(NestedMessage value) {
        this.value = value;
        return this;
      }

      @Override
      public MapFieldEntry build() {
        return new MapFieldEntry(key, value, super.buildUnknownFields());
      }
    }
  }
}
