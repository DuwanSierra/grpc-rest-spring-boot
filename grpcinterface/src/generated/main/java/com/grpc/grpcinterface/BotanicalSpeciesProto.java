// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BotanicSpecies.proto

package com.grpc.grpcinterface;

public final class BotanicalSpeciesProto {
  private BotanicalSpeciesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_grpcinterface_BotanicSpeciesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_grpcinterface_BotanicSpeciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_grpcinterface_BotanicSpeciesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_grpcinterface_BotanicSpeciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_grpcinterface_BotanicSpeciesDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_grpcinterface_BotanicSpeciesDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BotanicSpecies.proto\022\026com.grpc.grpcint" +
      "erface\"%\n\025BotanicSpeciesRequest\022\014\n\004size\030" +
      "\001 \001(\003\"T\n\026BotanicSpeciesResponse\022:\n\007speci" +
      "es\030\001 \003(\0132).com.grpc.grpcinterface.Botani" +
      "cSpeciesDto\"\355\002\n\021BotanicSpeciesDto\022\022\n\005gru" +
      "po\030\001 \001(\tH\000\210\001\001\022\024\n\007familia\030\002 \001(\tH\001\210\001\001\022\035\n\020n" +
      "ombreCientifico\030\003 \001(\tH\002\210\001\001\022\"\n\025endemismoP" +
      "araColombia\030\004 \001(\tH\003\210\001\001\022\034\n\017estadoDeAmenaz" +
      "a\030\005 \001(\tH\004\210\001\001\022\035\n\020nativaDeColombia\030\006 \001(\tH\005" +
      "\210\001\001\022$\n\027especimenRepresentativo\030\007 \001(\tH\006\210\001" +
      "\001B\010\n\006_grupoB\n\n\010_familiaB\023\n\021_nombreCienti" +
      "ficoB\030\n\026_endemismoParaColombiaB\022\n\020_estad" +
      "oDeAmenazaB\023\n\021_nativaDeColombiaB\032\n\030_espe" +
      "cimenRepresentativo2\230\001\n\031BotanicSpeciesGr" +
      "pcService\022{\n\026GetAllBotanicalSpecies\022-.co" +
      "m.grpc.grpcinterface.BotanicSpeciesReque" +
      "st\032..com.grpc.grpcinterface.BotanicSpeci" +
      "esResponse\"\0000\001B1\n\026com.grpc.grpcinterface" +
      "B\025BotanicalSpeciesProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_grpc_grpcinterface_BotanicSpeciesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_grpc_grpcinterface_BotanicSpeciesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_grpcinterface_BotanicSpeciesRequest_descriptor,
        new java.lang.String[] { "Size", });
    internal_static_com_grpc_grpcinterface_BotanicSpeciesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_grpc_grpcinterface_BotanicSpeciesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_grpcinterface_BotanicSpeciesResponse_descriptor,
        new java.lang.String[] { "Species", });
    internal_static_com_grpc_grpcinterface_BotanicSpeciesDto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_grpc_grpcinterface_BotanicSpeciesDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_grpcinterface_BotanicSpeciesDto_descriptor,
        new java.lang.String[] { "Grupo", "Familia", "NombreCientifico", "EndemismoParaColombia", "EstadoDeAmenaza", "NativaDeColombia", "EspecimenRepresentativo", "Grupo", "Familia", "NombreCientifico", "EndemismoParaColombia", "EstadoDeAmenaza", "NativaDeColombia", "EspecimenRepresentativo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}