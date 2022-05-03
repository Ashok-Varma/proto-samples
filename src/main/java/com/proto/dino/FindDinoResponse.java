// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dino.proto

package com.proto.dino;

/**
 * Protobuf type {@code test3.FindDinoResponse}
 */
public final class FindDinoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:test3.FindDinoResponse)
    FindDinoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindDinoResponse.newBuilder() to construct.
  private FindDinoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindDinoResponse() {
    dinosaurs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FindDinoResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.dino.Dino.internal_static_test3_FindDinoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.dino.Dino.internal_static_test3_FindDinoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.dino.FindDinoResponse.class, com.proto.dino.FindDinoResponse.Builder.class);
  }

  public static final int DINOSAURS_FIELD_NUMBER = 1;
  private java.util.List<com.proto.dino.Dinosaur> dinosaurs_;
  /**
   * <pre>
   * Dinosaurs with matching search string
   * </pre>
   *
   * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.proto.dino.Dinosaur> getDinosaursList() {
    return dinosaurs_;
  }
  /**
   * <pre>
   * Dinosaurs with matching search string
   * </pre>
   *
   * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.proto.dino.DinosaurOrBuilder> 
      getDinosaursOrBuilderList() {
    return dinosaurs_;
  }
  /**
   * <pre>
   * Dinosaurs with matching search string
   * </pre>
   *
   * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
   */
  @java.lang.Override
  public int getDinosaursCount() {
    return dinosaurs_.size();
  }
  /**
   * <pre>
   * Dinosaurs with matching search string
   * </pre>
   *
   * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
   */
  @java.lang.Override
  public com.proto.dino.Dinosaur getDinosaurs(int index) {
    return dinosaurs_.get(index);
  }
  /**
   * <pre>
   * Dinosaurs with matching search string
   * </pre>
   *
   * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
   */
  @java.lang.Override
  public com.proto.dino.DinosaurOrBuilder getDinosaursOrBuilder(
      int index) {
    return dinosaurs_.get(index);
  }

  public static com.proto.dino.FindDinoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.dino.FindDinoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.dino.FindDinoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.dino.FindDinoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.dino.FindDinoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.dino.FindDinoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.dino.FindDinoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.dino.FindDinoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.dino.FindDinoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.dino.FindDinoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.dino.FindDinoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.dino.FindDinoResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.dino.FindDinoResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code test3.FindDinoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:test3.FindDinoResponse)
      com.proto.dino.FindDinoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.dino.Dino.internal_static_test3_FindDinoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.dino.Dino.internal_static_test3_FindDinoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.dino.FindDinoResponse.class, com.proto.dino.FindDinoResponse.Builder.class);
    }

    // Construct using com.proto.dino.FindDinoResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getDinosaursFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dinosaursBuilder_ == null) {
        dinosaurs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dinosaursBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.dino.Dino.internal_static_test3_FindDinoResponse_descriptor;
    }

    @java.lang.Override
    public com.proto.dino.FindDinoResponse getDefaultInstanceForType() {
      return com.proto.dino.FindDinoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.dino.FindDinoResponse build() {
      com.proto.dino.FindDinoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.dino.FindDinoResponse buildPartial() {
      com.proto.dino.FindDinoResponse result = new com.proto.dino.FindDinoResponse(this);
      int from_bitField0_ = bitField0_;
      if (dinosaursBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dinosaurs_ = java.util.Collections.unmodifiableList(dinosaurs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dinosaurs_ = dinosaurs_;
      } else {
        result.dinosaurs_ = dinosaursBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private java.util.List<com.proto.dino.Dinosaur> dinosaurs_ =
      java.util.Collections.emptyList();
    private void ensureDinosaursIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dinosaurs_ = new java.util.ArrayList<com.proto.dino.Dinosaur>(dinosaurs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.proto.dino.Dinosaur, com.proto.dino.Dinosaur.Builder, com.proto.dino.DinosaurOrBuilder> dinosaursBuilder_;

    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public java.util.List<com.proto.dino.Dinosaur> getDinosaursList() {
      if (dinosaursBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dinosaurs_);
      } else {
        return dinosaursBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public int getDinosaursCount() {
      if (dinosaursBuilder_ == null) {
        return dinosaurs_.size();
      } else {
        return dinosaursBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public com.proto.dino.Dinosaur getDinosaurs(int index) {
      if (dinosaursBuilder_ == null) {
        return dinosaurs_.get(index);
      } else {
        return dinosaursBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public Builder setDinosaurs(
        int index, com.proto.dino.Dinosaur value) {
      if (dinosaursBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDinosaursIsMutable();
        dinosaurs_.set(index, value);
        onChanged();
      } else {
        dinosaursBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public Builder setDinosaurs(
        int index, com.proto.dino.Dinosaur.Builder builderForValue) {
      if (dinosaursBuilder_ == null) {
        ensureDinosaursIsMutable();
        dinosaurs_.set(index, builderForValue.build());
        onChanged();
      } else {
        dinosaursBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public Builder addDinosaurs(com.proto.dino.Dinosaur value) {
      if (dinosaursBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDinosaursIsMutable();
        dinosaurs_.add(value);
        onChanged();
      } else {
        dinosaursBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public Builder addDinosaurs(
        int index, com.proto.dino.Dinosaur value) {
      if (dinosaursBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDinosaursIsMutable();
        dinosaurs_.add(index, value);
        onChanged();
      } else {
        dinosaursBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public Builder addDinosaurs(
        com.proto.dino.Dinosaur.Builder builderForValue) {
      if (dinosaursBuilder_ == null) {
        ensureDinosaursIsMutable();
        dinosaurs_.add(builderForValue.build());
        onChanged();
      } else {
        dinosaursBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public Builder addDinosaurs(
        int index, com.proto.dino.Dinosaur.Builder builderForValue) {
      if (dinosaursBuilder_ == null) {
        ensureDinosaursIsMutable();
        dinosaurs_.add(index, builderForValue.build());
        onChanged();
      } else {
        dinosaursBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public Builder addAllDinosaurs(
        java.lang.Iterable<? extends com.proto.dino.Dinosaur> values) {
      if (dinosaursBuilder_ == null) {
        ensureDinosaursIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dinosaurs_);
        onChanged();
      } else {
        dinosaursBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public Builder clearDinosaurs() {
      if (dinosaursBuilder_ == null) {
        dinosaurs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dinosaursBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public Builder removeDinosaurs(int index) {
      if (dinosaursBuilder_ == null) {
        ensureDinosaursIsMutable();
        dinosaurs_.remove(index);
        onChanged();
      } else {
        dinosaursBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public com.proto.dino.Dinosaur.Builder getDinosaursBuilder(
        int index) {
      return getDinosaursFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public com.proto.dino.DinosaurOrBuilder getDinosaursOrBuilder(
        int index) {
      if (dinosaursBuilder_ == null) {
        return dinosaurs_.get(index);  } else {
        return dinosaursBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public java.util.List<? extends com.proto.dino.DinosaurOrBuilder> 
         getDinosaursOrBuilderList() {
      if (dinosaursBuilder_ != null) {
        return dinosaursBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dinosaurs_);
      }
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public com.proto.dino.Dinosaur.Builder addDinosaursBuilder() {
      return getDinosaursFieldBuilder().addBuilder(
          com.proto.dino.Dinosaur.getDefaultInstance());
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public com.proto.dino.Dinosaur.Builder addDinosaursBuilder(
        int index) {
      return getDinosaursFieldBuilder().addBuilder(
          index, com.proto.dino.Dinosaur.getDefaultInstance());
    }
    /**
     * <pre>
     * Dinosaurs with matching search string
     * </pre>
     *
     * <code>repeated .test3.Dinosaur dinosaurs = 1;</code>
     */
    public java.util.List<com.proto.dino.Dinosaur.Builder> 
         getDinosaursBuilderList() {
      return getDinosaursFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.proto.dino.Dinosaur, com.proto.dino.Dinosaur.Builder, com.proto.dino.DinosaurOrBuilder> 
        getDinosaursFieldBuilder() {
      if (dinosaursBuilder_ == null) {
        dinosaursBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.proto.dino.Dinosaur, com.proto.dino.Dinosaur.Builder, com.proto.dino.DinosaurOrBuilder>(
                dinosaurs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dinosaurs_ = null;
      }
      return dinosaursBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:test3.FindDinoResponse)
  }

  // @@protoc_insertion_point(class_scope:test3.FindDinoResponse)
  private static final com.proto.dino.FindDinoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.dino.FindDinoResponse();
  }

  public static com.proto.dino.FindDinoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindDinoResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindDinoResponse>() {
    @java.lang.Override
    public FindDinoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(
                builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<FindDinoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindDinoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.dino.FindDinoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

