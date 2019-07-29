// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: platform/im_ctp_ping.proto

package com.akaxin.proto.site;

public final class ImCtpPingProto {
  private ImCtpPingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ImCtpPingRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:client.ImCtpPingRequest)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * <pre>
   *ping操作不需要request实体
   * </pre>
   *
   * Protobuf type {@code client.ImCtpPingRequest}
   */
  public  static final class ImCtpPingRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ImCtpPingRequest, ImCtpPingRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:client.ImCtpPingRequest)
      ImCtpPingRequestOrBuilder {
    private ImCtpPingRequest() {
    }
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSerializedSize = size;
      return size;
    }

    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     *ping操作不需要request实体
     * </pre>
     *
     * Protobuf type {@code client.ImCtpPingRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ImCtpPingRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:client.ImCtpPingRequest)
        com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequestOrBuilder {
      // Construct using com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:client.ImCtpPingRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest other = (com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest) arg1;
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:client.ImCtpPingRequest)
    private static final com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ImCtpPingRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ImCtpPingRequest> PARSER;

    public static com.google.protobuf.Parser<ImCtpPingRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
