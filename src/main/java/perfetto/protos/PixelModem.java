// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protos/perfetto/trace/track_event/pixel_modem.proto
// Protobuf Java Version: 4.29.3

package perfetto.protos;

public final class PixelModem {
  private PixelModem() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      PixelModem.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PixelModemEventInsightOrBuilder extends
      // @@protoc_insertion_point(interface_extends:perfetto.protos.PixelModemEventInsight)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Opaque string containing arguments from the modem.
     * </pre>
     *
     * <code>optional string detokenized_message = 1;</code>
     * @return Whether the detokenizedMessage field is set.
     */
    boolean hasDetokenizedMessage();
    /**
     * <pre>
     * Opaque string containing arguments from the modem.
     * </pre>
     *
     * <code>optional string detokenized_message = 1;</code>
     * @return The detokenizedMessage.
     */
    java.lang.String getDetokenizedMessage();
    /**
     * <pre>
     * Opaque string containing arguments from the modem.
     * </pre>
     *
     * <code>optional string detokenized_message = 1;</code>
     * @return The bytes for detokenizedMessage.
     */
    com.google.protobuf.ByteString
        getDetokenizedMessageBytes();
  }
  /**
   * <pre>
   * Event insights emitted by the Pixel modem.
   * </pre>
   *
   * Protobuf type {@code perfetto.protos.PixelModemEventInsight}
   */
  public static final class PixelModemEventInsight extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:perfetto.protos.PixelModemEventInsight)
      PixelModemEventInsightOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        PixelModemEventInsight.class.getName());
    }
    // Use PixelModemEventInsight.newBuilder() to construct.
    private PixelModemEventInsight(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private PixelModemEventInsight() {
      detokenizedMessage_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return perfetto.protos.PixelModem.internal_static_perfetto_protos_PixelModemEventInsight_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return perfetto.protos.PixelModem.internal_static_perfetto_protos_PixelModemEventInsight_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              perfetto.protos.PixelModem.PixelModemEventInsight.class, perfetto.protos.PixelModem.PixelModemEventInsight.Builder.class);
    }

    private int bitField0_;
    public static final int DETOKENIZED_MESSAGE_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object detokenizedMessage_ = "";
    /**
     * <pre>
     * Opaque string containing arguments from the modem.
     * </pre>
     *
     * <code>optional string detokenized_message = 1;</code>
     * @return Whether the detokenizedMessage field is set.
     */
    @java.lang.Override
    public boolean hasDetokenizedMessage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Opaque string containing arguments from the modem.
     * </pre>
     *
     * <code>optional string detokenized_message = 1;</code>
     * @return The detokenizedMessage.
     */
    @java.lang.Override
    public java.lang.String getDetokenizedMessage() {
      java.lang.Object ref = detokenizedMessage_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          detokenizedMessage_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * Opaque string containing arguments from the modem.
     * </pre>
     *
     * <code>optional string detokenized_message = 1;</code>
     * @return The bytes for detokenizedMessage.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDetokenizedMessageBytes() {
      java.lang.Object ref = detokenizedMessage_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        detokenizedMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, detokenizedMessage_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, detokenizedMessage_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof perfetto.protos.PixelModem.PixelModemEventInsight)) {
        return super.equals(obj);
      }
      perfetto.protos.PixelModem.PixelModemEventInsight other = (perfetto.protos.PixelModem.PixelModemEventInsight) obj;

      if (hasDetokenizedMessage() != other.hasDetokenizedMessage()) return false;
      if (hasDetokenizedMessage()) {
        if (!getDetokenizedMessage()
            .equals(other.getDetokenizedMessage())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasDetokenizedMessage()) {
        hash = (37 * hash) + DETOKENIZED_MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getDetokenizedMessage().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static perfetto.protos.PixelModem.PixelModemEventInsight parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.PixelModem.PixelModemEventInsight parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.PixelModem.PixelModemEventInsight parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.PixelModem.PixelModemEventInsight parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.PixelModem.PixelModemEventInsight parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.PixelModem.PixelModemEventInsight parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.PixelModem.PixelModemEventInsight parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.PixelModem.PixelModemEventInsight parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static perfetto.protos.PixelModem.PixelModemEventInsight parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static perfetto.protos.PixelModem.PixelModemEventInsight parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static perfetto.protos.PixelModem.PixelModemEventInsight parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.PixelModem.PixelModemEventInsight parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(perfetto.protos.PixelModem.PixelModemEventInsight prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Event insights emitted by the Pixel modem.
     * </pre>
     *
     * Protobuf type {@code perfetto.protos.PixelModemEventInsight}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:perfetto.protos.PixelModemEventInsight)
        perfetto.protos.PixelModem.PixelModemEventInsightOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return perfetto.protos.PixelModem.internal_static_perfetto_protos_PixelModemEventInsight_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return perfetto.protos.PixelModem.internal_static_perfetto_protos_PixelModemEventInsight_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                perfetto.protos.PixelModem.PixelModemEventInsight.class, perfetto.protos.PixelModem.PixelModemEventInsight.Builder.class);
      }

      // Construct using perfetto.protos.PixelModem.PixelModemEventInsight.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        detokenizedMessage_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return perfetto.protos.PixelModem.internal_static_perfetto_protos_PixelModemEventInsight_descriptor;
      }

      @java.lang.Override
      public perfetto.protos.PixelModem.PixelModemEventInsight getDefaultInstanceForType() {
        return perfetto.protos.PixelModem.PixelModemEventInsight.getDefaultInstance();
      }

      @java.lang.Override
      public perfetto.protos.PixelModem.PixelModemEventInsight build() {
        perfetto.protos.PixelModem.PixelModemEventInsight result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public perfetto.protos.PixelModem.PixelModemEventInsight buildPartial() {
        perfetto.protos.PixelModem.PixelModemEventInsight result = new perfetto.protos.PixelModem.PixelModemEventInsight(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(perfetto.protos.PixelModem.PixelModemEventInsight result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.detokenizedMessage_ = detokenizedMessage_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof perfetto.protos.PixelModem.PixelModemEventInsight) {
          return mergeFrom((perfetto.protos.PixelModem.PixelModemEventInsight)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(perfetto.protos.PixelModem.PixelModemEventInsight other) {
        if (other == perfetto.protos.PixelModem.PixelModemEventInsight.getDefaultInstance()) return this;
        if (other.hasDetokenizedMessage()) {
          detokenizedMessage_ = other.detokenizedMessage_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                detokenizedMessage_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object detokenizedMessage_ = "";
      /**
       * <pre>
       * Opaque string containing arguments from the modem.
       * </pre>
       *
       * <code>optional string detokenized_message = 1;</code>
       * @return Whether the detokenizedMessage field is set.
       */
      public boolean hasDetokenizedMessage() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Opaque string containing arguments from the modem.
       * </pre>
       *
       * <code>optional string detokenized_message = 1;</code>
       * @return The detokenizedMessage.
       */
      public java.lang.String getDetokenizedMessage() {
        java.lang.Object ref = detokenizedMessage_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            detokenizedMessage_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Opaque string containing arguments from the modem.
       * </pre>
       *
       * <code>optional string detokenized_message = 1;</code>
       * @return The bytes for detokenizedMessage.
       */
      public com.google.protobuf.ByteString
          getDetokenizedMessageBytes() {
        java.lang.Object ref = detokenizedMessage_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          detokenizedMessage_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Opaque string containing arguments from the modem.
       * </pre>
       *
       * <code>optional string detokenized_message = 1;</code>
       * @param value The detokenizedMessage to set.
       * @return This builder for chaining.
       */
      public Builder setDetokenizedMessage(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        detokenizedMessage_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Opaque string containing arguments from the modem.
       * </pre>
       *
       * <code>optional string detokenized_message = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDetokenizedMessage() {
        detokenizedMessage_ = getDefaultInstance().getDetokenizedMessage();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Opaque string containing arguments from the modem.
       * </pre>
       *
       * <code>optional string detokenized_message = 1;</code>
       * @param value The bytes for detokenizedMessage to set.
       * @return This builder for chaining.
       */
      public Builder setDetokenizedMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        detokenizedMessage_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:perfetto.protos.PixelModemEventInsight)
    }

    // @@protoc_insertion_point(class_scope:perfetto.protos.PixelModemEventInsight)
    private static final perfetto.protos.PixelModem.PixelModemEventInsight DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new perfetto.protos.PixelModem.PixelModemEventInsight();
    }

    public static perfetto.protos.PixelModem.PixelModemEventInsight getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PixelModemEventInsight>
        PARSER = new com.google.protobuf.AbstractParser<PixelModemEventInsight>() {
      @java.lang.Override
      public PixelModemEventInsight parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<PixelModemEventInsight> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PixelModemEventInsight> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public perfetto.protos.PixelModem.PixelModemEventInsight getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_perfetto_protos_PixelModemEventInsight_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_perfetto_protos_PixelModemEventInsight_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3protos/perfetto/trace/track_event/pixe" +
      "l_modem.proto\022\017perfetto.protos\"5\n\026PixelM" +
      "odemEventInsight\022\033\n\023detokenized_message\030" +
      "\001 \001(\t"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_perfetto_protos_PixelModemEventInsight_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_perfetto_protos_PixelModemEventInsight_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_perfetto_protos_PixelModemEventInsight_descriptor,
        new java.lang.String[] { "DetokenizedMessage", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
