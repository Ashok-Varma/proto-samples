// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test3_nongrpc.proto

package com.proto.pure.test3;

public final class Test3Nongrpc {
  private Test3Nongrpc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test3_TestService3Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test3_TestService3Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test3_TestService3Response_NestedMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test3_TestService3Response_NestedMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test3_TestService3Response_MapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test3_TestService3Response_MapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test3_TestService3Response_MapFieldEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test3_TestService3Response_MapFieldEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test3_TestService3Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test3_TestService3Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test3_TestService3Request_NestedMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test3_TestService3Request_NestedMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test3_TestService3Request_MapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test3_TestService3Request_MapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test3_TestService3Request_MapFieldEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test3_TestService3Request_MapFieldEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023test3_nongrpc.proto\022\005test3\032\031google/pro" +
      "tobuf/any.proto\"\212\016\n\024TestService3Response" +
      "\022\033\n\016optionalDouble\030\001 \001(\001H\001\210\001\001\022\026\n\016require" +
      "dDouble\030\003 \001(\001\022\032\n\roptionalInt32\030\004 \001(\005H\002\210\001" +
      "\001\022\025\n\rrequiredInt32\030\005 \001(\005\022\032\n\roptionalInt6" +
      "4\030\006 \001(\003H\003\210\001\001\022\025\n\rrequiredInt64\030\007 \001(\003\022\033\n\016o" +
      "ptionalUint32\030\010 \001(\rH\004\210\001\001\022\026\n\016requiredUint" +
      "32\030\014 \001(\r\022\033\n\016optionalUint64\030\r \001(\004H\005\210\001\001\022\026\n" +
      "\016requiredUint64\030\016 \001(\004\022\033\n\016optionalSint32\030" +
      "\020 \001(\021H\006\210\001\001\022\026\n\016requiredSint32\030\021 \001(\021\022\033\n\016op" +
      "tionalSint64\030\022 \001(\022H\007\210\001\001\022\026\n\016requiredSint6" +
      "4\030\023 \001(\022\022\034\n\017optionalFixed32\030\024 \001(\007H\010\210\001\001\022\027\n" +
      "\017requiredFixed32\030\025 \001(\007\022\034\n\017optionalFixed6" +
      "4\030\026 \001(\006H\t\210\001\001\022\027\n\017requiredFixed64\030\027 \001(\006\022\035\n" +
      "\020optionalSfixed32\030\030 \001(\017H\n\210\001\001\022\030\n\020required" +
      "Sfixed32\030\031 \001(\017\022\035\n\020optionalSfixed64\030\032 \001(\020" +
      "H\013\210\001\001\022\030\n\020requiredSfixed64\030\033 \001(\020\022\031\n\014optio" +
      "nalBool\030\034 \001(\010H\014\210\001\001\022\024\n\014requiredBool\030\035 \001(\010" +
      "\022\033\n\016optionalString\030\036 \001(\tH\r\210\001\001\022\026\n\016require" +
      "dString\030\037 \001(\t\022\032\n\roptionalBytes\030  \001(\014H\016\210\001" +
      "\001\022\025\n\rrequiredBytes\030! \001(\014\0227\n\006corpus\030$ \001(\016" +
      "2\".test3.TestService3Response.CorpusH\017\210\001" +
      "\001\022\023\n\007samples\030% \003(\005B\002\020\001\022\016\n\004name\030& \001(\tH\000\022;" +
      "\n\006nested\030\' \001(\0132).test3.TestService3Respo" +
      "nse.NestedMessageH\000\0221\n\003map\030( \003(\0132$.test3" +
      ".TestService3Response.MapEntry\022<\n\tmap_fi" +
      "eld\030) \003(\0132).test3.TestService3Response.M" +
      "apFieldEntry\022%\n\007details\030* \003(\0132\024.google.p" +
      "rotobuf.Any\032L\n\rNestedMessage\022\013\n\003url\030\001 \001(" +
      "\t\022\022\n\005title\030\002 \001(\tH\000\210\001\001\022\020\n\010snippets\030\003 \003(\tB" +
      "\010\n\006_title\032U\n\010MapEntry\022\013\n\003key\030\001 \001(\t\0228\n\005va" +
      "lue\030\002 \001(\0132).test3.TestService3Response.N" +
      "estedMessage:\0028\001\032V\n\rMapFieldEntry\022\013\n\003key" +
      "\030\001 \001(\t\0228\n\005value\030\002 \001(\0132).test3.TestServic" +
      "e3Response.NestedMessage\"Z\n\006Corpus\022\r\n\tUN" +
      "IVERSAL\020\000\022\007\n\003WEB\020\001\022\n\n\006IMAGES\020\002\022\t\n\005LOCAL\020" +
      "\003\022\010\n\004NEWS\020\004\022\014\n\010PRODUCTS\020\005\022\t\n\005VIDEO\020\006\">\n\021" +
      "EnumAllowingAlias\022\013\n\007UNKNOWN\020\000\022\013\n\007STARTE" +
      "D\020\001\022\013\n\007RUNNING\020\001\032\002\020\001B\014\n\noneOfFieldB\021\n\017_o" +
      "ptionalDoubleB\020\n\016_optionalInt32B\020\n\016_opti" +
      "onalInt64B\021\n\017_optionalUint32B\021\n\017_optiona" +
      "lUint64B\021\n\017_optionalSint32B\021\n\017_optionalS" +
      "int64B\022\n\020_optionalFixed32B\022\n\020_optionalFi" +
      "xed64B\023\n\021_optionalSfixed32B\023\n\021_optionalS" +
      "fixed64B\017\n\r_optionalBoolB\021\n\017_optionalStr" +
      "ingB\020\n\016_optionalBytesB\t\n\007_corpusJ\004\010\002\020\003J\004" +
      "\010\017\020\020J\004\010\t\020\014R\003fooR\003bar\"\203\016\n\023TestService3Req" +
      "uest\022\033\n\016optionalDouble\030\001 \001(\001H\001\210\001\001\022\026\n\016req" +
      "uiredDouble\030\003 \001(\001\022\032\n\roptionalInt32\030\004 \001(\005" +
      "H\002\210\001\001\022\025\n\rrequiredInt32\030\005 \001(\005\022\032\n\roptional" +
      "Int64\030\006 \001(\003H\003\210\001\001\022\025\n\rrequiredInt64\030\007 \001(\003\022" +
      "\033\n\016optionalUint32\030\010 \001(\rH\004\210\001\001\022\026\n\016required" +
      "Uint32\030\014 \001(\r\022\033\n\016optionalUint64\030\r \001(\004H\005\210\001" +
      "\001\022\026\n\016requiredUint64\030\016 \001(\004\022\033\n\016optionalSin" +
      "t32\030\020 \001(\021H\006\210\001\001\022\026\n\016requiredSint32\030\021 \001(\021\022\033" +
      "\n\016optionalSint64\030\022 \001(\022H\007\210\001\001\022\026\n\016requiredS" +
      "int64\030\023 \001(\022\022\034\n\017optionalFixed32\030\024 \001(\007H\010\210\001" +
      "\001\022\027\n\017requiredFixed32\030\025 \001(\007\022\034\n\017optionalFi" +
      "xed64\030\026 \001(\006H\t\210\001\001\022\027\n\017requiredFixed64\030\027 \001(" +
      "\006\022\035\n\020optionalSfixed32\030\030 \001(\017H\n\210\001\001\022\030\n\020requ" +
      "iredSfixed32\030\031 \001(\017\022\035\n\020optionalSfixed64\030\032" +
      " \001(\020H\013\210\001\001\022\030\n\020requiredSfixed64\030\033 \001(\020\022\031\n\014o" +
      "ptionalBool\030\034 \001(\010H\014\210\001\001\022\024\n\014requiredBool\030\035" +
      " \001(\010\022\033\n\016optionalString\030\036 \001(\tH\r\210\001\001\022\026\n\016req" +
      "uiredString\030\037 \001(\t\022\032\n\roptionalBytes\030  \001(\014" +
      "H\016\210\001\001\022\025\n\rrequiredBytes\030! \001(\014\0226\n\006corpus\030$" +
      " \001(\0162!.test3.TestService3Request.CorpusH" +
      "\017\210\001\001\022\023\n\007samples\030% \003(\005B\002\020\001\022\016\n\004name\030& \001(\tH" +
      "\000\022:\n\006nested\030\' \001(\0132(.test3.TestService3Re" +
      "quest.NestedMessageH\000\0220\n\003map\030( \003(\0132#.tes" +
      "t3.TestService3Request.MapEntry\022;\n\tmap_f" +
      "ield\030) \003(\0132(.test3.TestService3Request.M" +
      "apFieldEntry\022%\n\007details\030* \003(\0132\024.google.p" +
      "rotobuf.Any\032L\n\rNestedMessage\022\013\n\003url\030\001 \001(" +
      "\t\022\022\n\005title\030\002 \001(\tH\000\210\001\001\022\020\n\010snippets\030\003 \003(\tB" +
      "\010\n\006_title\032T\n\010MapEntry\022\013\n\003key\030\001 \001(\t\0227\n\005va" +
      "lue\030\002 \001(\0132(.test3.TestService3Request.Ne" +
      "stedMessage:\0028\001\032U\n\rMapFieldEntry\022\013\n\003key\030" +
      "\001 \001(\t\0227\n\005value\030\002 \001(\0132(.test3.TestService" +
      "3Request.NestedMessage\"Z\n\006Corpus\022\r\n\tUNIV" +
      "ERSAL\020\000\022\007\n\003WEB\020\001\022\n\n\006IMAGES\020\002\022\t\n\005LOCAL\020\003\022" +
      "\010\n\004NEWS\020\004\022\014\n\010PRODUCTS\020\005\022\t\n\005VIDEO\020\006\">\n\021En" +
      "umAllowingAlias\022\013\n\007UNKNOWN\020\000\022\013\n\007STARTED\020" +
      "\001\022\013\n\007RUNNING\020\001\032\002\020\001B\014\n\noneOfFieldB\021\n\017_opt" +
      "ionalDoubleB\020\n\016_optionalInt32B\020\n\016_option" +
      "alInt64B\021\n\017_optionalUint32B\021\n\017_optionalU" +
      "int64B\021\n\017_optionalSint32B\021\n\017_optionalSin" +
      "t64B\022\n\020_optionalFixed32B\022\n\020_optionalFixe" +
      "d64B\023\n\021_optionalSfixed32B\023\n\021_optionalSfi" +
      "xed64B\017\n\r_optionalBoolB\021\n\017_optionalStrin" +
      "gB\020\n\016_optionalBytesB\t\n\007_corpusJ\004\010\002\020\003J\004\010\017" +
      "\020\020J\004\010\t\020\014R\003fooR\003barB\030\n\024com.proto.pure.tes" +
      "t3P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_test3_TestService3Response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_test3_TestService3Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test3_TestService3Response_descriptor,
        new java.lang.String[] { "OptionalDouble", "RequiredDouble", "OptionalInt32", "RequiredInt32", "OptionalInt64", "RequiredInt64", "OptionalUint32", "RequiredUint32", "OptionalUint64", "RequiredUint64", "OptionalSint32", "RequiredSint32", "OptionalSint64", "RequiredSint64", "OptionalFixed32", "RequiredFixed32", "OptionalFixed64", "RequiredFixed64", "OptionalSfixed32", "RequiredSfixed32", "OptionalSfixed64", "RequiredSfixed64", "OptionalBool", "RequiredBool", "OptionalString", "RequiredString", "OptionalBytes", "RequiredBytes", "Corpus", "Samples", "Name", "Nested", "Map", "MapField", "Details", "OneOfField", "OptionalDouble", "OptionalInt32", "OptionalInt64", "OptionalUint32", "OptionalUint64", "OptionalSint32", "OptionalSint64", "OptionalFixed32", "OptionalFixed64", "OptionalSfixed32", "OptionalSfixed64", "OptionalBool", "OptionalString", "OptionalBytes", "Corpus", });
    internal_static_test3_TestService3Response_NestedMessage_descriptor =
      internal_static_test3_TestService3Response_descriptor.getNestedTypes().get(0);
    internal_static_test3_TestService3Response_NestedMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test3_TestService3Response_NestedMessage_descriptor,
        new java.lang.String[] { "Url", "Title", "Snippets", "Title", });
    internal_static_test3_TestService3Response_MapEntry_descriptor =
      internal_static_test3_TestService3Response_descriptor.getNestedTypes().get(1);
    internal_static_test3_TestService3Response_MapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test3_TestService3Response_MapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_test3_TestService3Response_MapFieldEntry_descriptor =
      internal_static_test3_TestService3Response_descriptor.getNestedTypes().get(2);
    internal_static_test3_TestService3Response_MapFieldEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test3_TestService3Response_MapFieldEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_test3_TestService3Request_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_test3_TestService3Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test3_TestService3Request_descriptor,
        new java.lang.String[] { "OptionalDouble", "RequiredDouble", "OptionalInt32", "RequiredInt32", "OptionalInt64", "RequiredInt64", "OptionalUint32", "RequiredUint32", "OptionalUint64", "RequiredUint64", "OptionalSint32", "RequiredSint32", "OptionalSint64", "RequiredSint64", "OptionalFixed32", "RequiredFixed32", "OptionalFixed64", "RequiredFixed64", "OptionalSfixed32", "RequiredSfixed32", "OptionalSfixed64", "RequiredSfixed64", "OptionalBool", "RequiredBool", "OptionalString", "RequiredString", "OptionalBytes", "RequiredBytes", "Corpus", "Samples", "Name", "Nested", "Map", "MapField", "Details", "OneOfField", "OptionalDouble", "OptionalInt32", "OptionalInt64", "OptionalUint32", "OptionalUint64", "OptionalSint32", "OptionalSint64", "OptionalFixed32", "OptionalFixed64", "OptionalSfixed32", "OptionalSfixed64", "OptionalBool", "OptionalString", "OptionalBytes", "Corpus", });
    internal_static_test3_TestService3Request_NestedMessage_descriptor =
      internal_static_test3_TestService3Request_descriptor.getNestedTypes().get(0);
    internal_static_test3_TestService3Request_NestedMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test3_TestService3Request_NestedMessage_descriptor,
        new java.lang.String[] { "Url", "Title", "Snippets", "Title", });
    internal_static_test3_TestService3Request_MapEntry_descriptor =
      internal_static_test3_TestService3Request_descriptor.getNestedTypes().get(1);
    internal_static_test3_TestService3Request_MapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test3_TestService3Request_MapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_test3_TestService3Request_MapFieldEntry_descriptor =
      internal_static_test3_TestService3Request_descriptor.getNestedTypes().get(2);
    internal_static_test3_TestService3Request_MapFieldEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test3_TestService3Request_MapFieldEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}