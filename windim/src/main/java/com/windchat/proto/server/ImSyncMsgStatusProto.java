// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/im_sync_msgStatus.proto

package com.windchat.proto.server;

public final class ImSyncMsgStatusProto {
  private ImSyncMsgStatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ImSyncMsgStatusRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ImSyncMsgStatusRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    java.util.List<String>
        getU2MsgIdList();
    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    int getU2MsgIdCount();
    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    String getU2MsgId(int index);
    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getU2MsgIdBytes(int index);

    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    java.util.List<String>
        getGroupMsgIdList();
    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    int getGroupMsgIdCount();
    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    String getGroupMsgId(int index);
    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getGroupMsgIdBytes(int index);
  }
  /**
   * Protobuf type {@code site.ImSyncMsgStatusRequest}
   */
  public  static final class ImSyncMsgStatusRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ImSyncMsgStatusRequest, ImSyncMsgStatusRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ImSyncMsgStatusRequest)
      ImSyncMsgStatusRequestOrBuilder {
    private ImSyncMsgStatusRequest() {
      u2MsgId_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
      groupMsgId_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }
    public static final int U2_MSG_ID_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<String> u2MsgId_;
    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    public java.util.List<String> getU2MsgIdList() {
      return u2MsgId_;
    }
    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    public int getU2MsgIdCount() {
      return u2MsgId_.size();
    }
    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    public String getU2MsgId(int index) {
      return u2MsgId_.get(index);
    }
    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getU2MsgIdBytes(int index) {
      return com.google.protobuf.ByteString.copyFromUtf8(
          u2MsgId_.get(index));
    }
    private void ensureU2MsgIdIsMutable() {
      if (!u2MsgId_.isModifiable()) {
        u2MsgId_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(u2MsgId_);
       }
    }
    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    private void setU2MsgId(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureU2MsgIdIsMutable();
      u2MsgId_.set(index, value);
    }
    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    private void addU2MsgId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureU2MsgIdIsMutable();
      u2MsgId_.add(value);
    }
    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    private void addAllU2MsgId(
        Iterable<String> values) {
      ensureU2MsgIdIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, u2MsgId_);
    }
    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    private void clearU2MsgId() {
      u2MsgId_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }
    /**
     * <pre>
     *客户端需要同步状态的U2消息id
     * </pre>
     *
     * <code>repeated string u2_msg_id = 1;</code>
     */
    private void addU2MsgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureU2MsgIdIsMutable();
      u2MsgId_.add(value.toStringUtf8());
    }

    public static final int GROUP_MSG_ID_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.ProtobufList<String> groupMsgId_;
    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    public java.util.List<String> getGroupMsgIdList() {
      return groupMsgId_;
    }
    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    public int getGroupMsgIdCount() {
      return groupMsgId_.size();
    }
    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    public String getGroupMsgId(int index) {
      return groupMsgId_.get(index);
    }
    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGroupMsgIdBytes(int index) {
      return com.google.protobuf.ByteString.copyFromUtf8(
          groupMsgId_.get(index));
    }
    private void ensureGroupMsgIdIsMutable() {
      if (!groupMsgId_.isModifiable()) {
        groupMsgId_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(groupMsgId_);
       }
    }
    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    private void setGroupMsgId(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureGroupMsgIdIsMutable();
      groupMsgId_.set(index, value);
    }
    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    private void addGroupMsgId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureGroupMsgIdIsMutable();
      groupMsgId_.add(value);
    }
    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    private void addAllGroupMsgId(
        Iterable<String> values) {
      ensureGroupMsgIdIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, groupMsgId_);
    }
    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    private void clearGroupMsgId() {
      groupMsgId_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }
    /**
     * <pre>
     *客户端需要同步状态的Group消息id
     * </pre>
     *
     * <code>repeated string group_msg_id = 2;</code>
     */
    private void addGroupMsgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureGroupMsgIdIsMutable();
      groupMsgId_.add(value.toStringUtf8());
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < u2MsgId_.size(); i++) {
        output.writeString(1, u2MsgId_.get(i));
      }
      for (int i = 0; i < groupMsgId_.size(); i++) {
        output.writeString(2, groupMsgId_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < u2MsgId_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeStringSizeNoTag(u2MsgId_.get(i));
        }
        size += dataSize;
        size += 1 * getU2MsgIdList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < groupMsgId_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeStringSizeNoTag(groupMsgId_.get(i));
        }
        size += dataSize;
        size += 1 * getGroupMsgIdList().size();
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ImSyncMsgStatusRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ImSyncMsgStatusRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ImSyncMsgStatusRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ImSyncMsgStatusRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ImSyncMsgStatusRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ImSyncMsgStatusRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ImSyncMsgStatusRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ImSyncMsgStatusRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ImSyncMsgStatusRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ImSyncMsgStatusRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ImSyncMsgStatusRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ImSyncMsgStatusRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ImSyncMsgStatusRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ImSyncMsgStatusRequest)
        ImSyncMsgStatusRequestOrBuilder {
      // Construct using com.windchat.proto.server.ImSyncMsgStatusProto.ImSyncMsgStatusRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *客户端需要同步状态的U2消息id
       * </pre>
       *
       * <code>repeated string u2_msg_id = 1;</code>
       */
      public java.util.List<String>
          getU2MsgIdList() {
        return java.util.Collections.unmodifiableList(
            instance.getU2MsgIdList());
      }
      /**
       * <pre>
       *客户端需要同步状态的U2消息id
       * </pre>
       *
       * <code>repeated string u2_msg_id = 1;</code>
       */
      public int getU2MsgIdCount() {
        return instance.getU2MsgIdCount();
      }
      /**
       * <pre>
       *客户端需要同步状态的U2消息id
       * </pre>
       *
       * <code>repeated string u2_msg_id = 1;</code>
       */
      public String getU2MsgId(int index) {
        return instance.getU2MsgId(index);
      }
      /**
       * <pre>
       *客户端需要同步状态的U2消息id
       * </pre>
       *
       * <code>repeated string u2_msg_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getU2MsgIdBytes(int index) {
        return instance.getU2MsgIdBytes(index);
      }
      /**
       * <pre>
       *客户端需要同步状态的U2消息id
       * </pre>
       *
       * <code>repeated string u2_msg_id = 1;</code>
       */
      public Builder setU2MsgId(
          int index, String value) {
        copyOnWrite();
        instance.setU2MsgId(index, value);
        return this;
      }
      /**
       * <pre>
       *客户端需要同步状态的U2消息id
       * </pre>
       *
       * <code>repeated string u2_msg_id = 1;</code>
       */
      public Builder addU2MsgId(
          String value) {
        copyOnWrite();
        instance.addU2MsgId(value);
        return this;
      }
      /**
       * <pre>
       *客户端需要同步状态的U2消息id
       * </pre>
       *
       * <code>repeated string u2_msg_id = 1;</code>
       */
      public Builder addAllU2MsgId(
          Iterable<String> values) {
        copyOnWrite();
        instance.addAllU2MsgId(values);
        return this;
      }
      /**
       * <pre>
       *客户端需要同步状态的U2消息id
       * </pre>
       *
       * <code>repeated string u2_msg_id = 1;</code>
       */
      public Builder clearU2MsgId() {
        copyOnWrite();
        instance.clearU2MsgId();
        return this;
      }
      /**
       * <pre>
       *客户端需要同步状态的U2消息id
       * </pre>
       *
       * <code>repeated string u2_msg_id = 1;</code>
       */
      public Builder addU2MsgIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.addU2MsgIdBytes(value);
        return this;
      }

      /**
       * <pre>
       *客户端需要同步状态的Group消息id
       * </pre>
       *
       * <code>repeated string group_msg_id = 2;</code>
       */
      public java.util.List<String>
          getGroupMsgIdList() {
        return java.util.Collections.unmodifiableList(
            instance.getGroupMsgIdList());
      }
      /**
       * <pre>
       *客户端需要同步状态的Group消息id
       * </pre>
       *
       * <code>repeated string group_msg_id = 2;</code>
       */
      public int getGroupMsgIdCount() {
        return instance.getGroupMsgIdCount();
      }
      /**
       * <pre>
       *客户端需要同步状态的Group消息id
       * </pre>
       *
       * <code>repeated string group_msg_id = 2;</code>
       */
      public String getGroupMsgId(int index) {
        return instance.getGroupMsgId(index);
      }
      /**
       * <pre>
       *客户端需要同步状态的Group消息id
       * </pre>
       *
       * <code>repeated string group_msg_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getGroupMsgIdBytes(int index) {
        return instance.getGroupMsgIdBytes(index);
      }
      /**
       * <pre>
       *客户端需要同步状态的Group消息id
       * </pre>
       *
       * <code>repeated string group_msg_id = 2;</code>
       */
      public Builder setGroupMsgId(
          int index, String value) {
        copyOnWrite();
        instance.setGroupMsgId(index, value);
        return this;
      }
      /**
       * <pre>
       *客户端需要同步状态的Group消息id
       * </pre>
       *
       * <code>repeated string group_msg_id = 2;</code>
       */
      public Builder addGroupMsgId(
          String value) {
        copyOnWrite();
        instance.addGroupMsgId(value);
        return this;
      }
      /**
       * <pre>
       *客户端需要同步状态的Group消息id
       * </pre>
       *
       * <code>repeated string group_msg_id = 2;</code>
       */
      public Builder addAllGroupMsgId(
          Iterable<String> values) {
        copyOnWrite();
        instance.addAllGroupMsgId(values);
        return this;
      }
      /**
       * <pre>
       *客户端需要同步状态的Group消息id
       * </pre>
       *
       * <code>repeated string group_msg_id = 2;</code>
       */
      public Builder clearGroupMsgId() {
        copyOnWrite();
        instance.clearGroupMsgId();
        return this;
      }
      /**
       * <pre>
       *客户端需要同步状态的Group消息id
       * </pre>
       *
       * <code>repeated string group_msg_id = 2;</code>
       */
      public Builder addGroupMsgIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.addGroupMsgIdBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ImSyncMsgStatusRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ImSyncMsgStatusRequest();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          u2MsgId_.makeImmutable();
          groupMsgId_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          ImSyncMsgStatusRequest other = (ImSyncMsgStatusRequest) arg1;
          u2MsgId_= visitor.visitList(u2MsgId_, other.u2MsgId_);
          groupMsgId_= visitor.visitList(groupMsgId_, other.groupMsgId_);
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
                case 10: {
                  String s = input.readStringRequireUtf8();
                  if (!u2MsgId_.isModifiable()) {
                    u2MsgId_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(u2MsgId_);
                  }
                  u2MsgId_.add(s);
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();
                  if (!groupMsgId_.isModifiable()) {
                    groupMsgId_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(groupMsgId_);
                  }
                  groupMsgId_.add(s);
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
          if (PARSER == null) {    synchronized (ImSyncMsgStatusRequest.class) {
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


    // @@protoc_insertion_point(class_scope:site.ImSyncMsgStatusRequest)
    private static final ImSyncMsgStatusRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ImSyncMsgStatusRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ImSyncMsgStatusRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ImSyncMsgStatusRequest> PARSER;

    public static com.google.protobuf.Parser<ImSyncMsgStatusRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
