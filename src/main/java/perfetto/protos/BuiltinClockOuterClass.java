// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protos/perfetto/common/builtin_clock.proto
// Protobuf Java Version: 4.29.3

package perfetto.protos;

public final class BuiltinClockOuterClass {
  private BuiltinClockOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      BuiltinClockOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code perfetto.protos.BuiltinClock}
   */
  public enum BuiltinClock
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>BUILTIN_CLOCK_UNKNOWN = 0;</code>
     */
    BUILTIN_CLOCK_UNKNOWN(0),
    /**
     * <code>BUILTIN_CLOCK_REALTIME = 1;</code>
     */
    BUILTIN_CLOCK_REALTIME(1),
    /**
     * <code>BUILTIN_CLOCK_REALTIME_COARSE = 2;</code>
     */
    BUILTIN_CLOCK_REALTIME_COARSE(2),
    /**
     * <code>BUILTIN_CLOCK_MONOTONIC = 3;</code>
     */
    BUILTIN_CLOCK_MONOTONIC(3),
    /**
     * <code>BUILTIN_CLOCK_MONOTONIC_COARSE = 4;</code>
     */
    BUILTIN_CLOCK_MONOTONIC_COARSE(4),
    /**
     * <code>BUILTIN_CLOCK_MONOTONIC_RAW = 5;</code>
     */
    BUILTIN_CLOCK_MONOTONIC_RAW(5),
    /**
     * <code>BUILTIN_CLOCK_BOOTTIME = 6;</code>
     */
    BUILTIN_CLOCK_BOOTTIME(6),
    /**
     * <code>BUILTIN_CLOCK_TSC = 9;</code>
     */
    BUILTIN_CLOCK_TSC(9),
    /**
     * <code>BUILTIN_CLOCK_PERF = 10;</code>
     */
    BUILTIN_CLOCK_PERF(10),
    /**
     * <code>BUILTIN_CLOCK_MAX_ID = 63;</code>
     */
    BUILTIN_CLOCK_MAX_ID(63),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        BuiltinClock.class.getName());
    }
    /**
     * <code>BUILTIN_CLOCK_UNKNOWN = 0;</code>
     */
    public static final int BUILTIN_CLOCK_UNKNOWN_VALUE = 0;
    /**
     * <code>BUILTIN_CLOCK_REALTIME = 1;</code>
     */
    public static final int BUILTIN_CLOCK_REALTIME_VALUE = 1;
    /**
     * <code>BUILTIN_CLOCK_REALTIME_COARSE = 2;</code>
     */
    public static final int BUILTIN_CLOCK_REALTIME_COARSE_VALUE = 2;
    /**
     * <code>BUILTIN_CLOCK_MONOTONIC = 3;</code>
     */
    public static final int BUILTIN_CLOCK_MONOTONIC_VALUE = 3;
    /**
     * <code>BUILTIN_CLOCK_MONOTONIC_COARSE = 4;</code>
     */
    public static final int BUILTIN_CLOCK_MONOTONIC_COARSE_VALUE = 4;
    /**
     * <code>BUILTIN_CLOCK_MONOTONIC_RAW = 5;</code>
     */
    public static final int BUILTIN_CLOCK_MONOTONIC_RAW_VALUE = 5;
    /**
     * <code>BUILTIN_CLOCK_BOOTTIME = 6;</code>
     */
    public static final int BUILTIN_CLOCK_BOOTTIME_VALUE = 6;
    /**
     * <code>BUILTIN_CLOCK_TSC = 9;</code>
     */
    public static final int BUILTIN_CLOCK_TSC_VALUE = 9;
    /**
     * <code>BUILTIN_CLOCK_PERF = 10;</code>
     */
    public static final int BUILTIN_CLOCK_PERF_VALUE = 10;
    /**
     * <code>BUILTIN_CLOCK_MAX_ID = 63;</code>
     */
    public static final int BUILTIN_CLOCK_MAX_ID_VALUE = 63;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static BuiltinClock valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BuiltinClock forNumber(int value) {
      switch (value) {
        case 0: return BUILTIN_CLOCK_UNKNOWN;
        case 1: return BUILTIN_CLOCK_REALTIME;
        case 2: return BUILTIN_CLOCK_REALTIME_COARSE;
        case 3: return BUILTIN_CLOCK_MONOTONIC;
        case 4: return BUILTIN_CLOCK_MONOTONIC_COARSE;
        case 5: return BUILTIN_CLOCK_MONOTONIC_RAW;
        case 6: return BUILTIN_CLOCK_BOOTTIME;
        case 9: return BUILTIN_CLOCK_TSC;
        case 10: return BUILTIN_CLOCK_PERF;
        case 63: return BUILTIN_CLOCK_MAX_ID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BuiltinClock>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BuiltinClock> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BuiltinClock>() {
            public BuiltinClock findValueByNumber(int number) {
              return BuiltinClock.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return perfetto.protos.BuiltinClockOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final BuiltinClock[] VALUES = values();

    public static BuiltinClock valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private BuiltinClock(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:perfetto.protos.BuiltinClock)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*protos/perfetto/common/builtin_clock.p" +
      "roto\022\017perfetto.protos*\273\002\n\014BuiltinClock\022\031" +
      "\n\025BUILTIN_CLOCK_UNKNOWN\020\000\022\032\n\026BUILTIN_CLO" +
      "CK_REALTIME\020\001\022!\n\035BUILTIN_CLOCK_REALTIME_" +
      "COARSE\020\002\022\033\n\027BUILTIN_CLOCK_MONOTONIC\020\003\022\"\n" +
      "\036BUILTIN_CLOCK_MONOTONIC_COARSE\020\004\022\037\n\033BUI" +
      "LTIN_CLOCK_MONOTONIC_RAW\020\005\022\032\n\026BUILTIN_CL" +
      "OCK_BOOTTIME\020\006\022\025\n\021BUILTIN_CLOCK_TSC\020\t\022\026\n" +
      "\022BUILTIN_CLOCK_PERF\020\n\022\030\n\024BUILTIN_CLOCK_M" +
      "AX_ID\020?\"\004\010\007\020\007\"\004\010\010\020\010"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
