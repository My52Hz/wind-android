// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin/hai_group_nonmembers.proto

package com.windchat.proto.plugin;

public final class HaiGroupNonmembersProto {
  private HaiGroupNonmembersProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface HaiGroupNonmembersRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiGroupNonmembersRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * 以谁的视角获取这份数据
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    String getSiteUserId();
    /**
     * <pre>
     * 以谁的视角获取这份数据
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getSiteUserIdBytes();

    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 2;</code>
     */
    String getGroupId();
    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getGroupIdBytes();

    /**
     * <pre>
     *分页：第几页
     * </pre>
     *
     * <code>optional int32 page_number = 3;</code>
     */
    int getPageNumber();

    /**
     * <pre>
     *分页：每页条数，默认100
     * </pre>
     *
     * <code>optional int32 page_size = 4;</code>
     */
    int getPageSize();
  }
  /**
   * <pre>
   **
   *分页获非群成员
   *----
   *接口名
   *----
   * /hai/group/nonmembers
   *错误码
   *----
   *- success
   *- error.alert
   * </pre>
   *
   * Protobuf type {@code plugin.HaiGroupNonmembersRequest}
   */
  public  static final class HaiGroupNonmembersRequest extends
      com.google.protobuf.GeneratedMessageLite<
          HaiGroupNonmembersRequest, HaiGroupNonmembersRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiGroupNonmembersRequest)
      HaiGroupNonmembersRequestOrBuilder {
    private HaiGroupNonmembersRequest() {
      siteUserId_ = "";
      groupId_ = "";
    }
    public static final int SITE_USER_ID_FIELD_NUMBER = 1;
    private String siteUserId_;
    /**
     * <pre>
     * 以谁的视角获取这份数据
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    public String getSiteUserId() {
      return siteUserId_;
    }
    /**
     * <pre>
     * 以谁的视角获取这份数据
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSiteUserIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(siteUserId_);
    }
    /**
     * <pre>
     * 以谁的视角获取这份数据
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    private void setSiteUserId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      siteUserId_ = value;
    }
    /**
     * <pre>
     * 以谁的视角获取这份数据
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    private void clearSiteUserId() {

      siteUserId_ = getDefaultInstance().getSiteUserId();
    }
    /**
     * <pre>
     * 以谁的视角获取这份数据
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    private void setSiteUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      siteUserId_ = value.toStringUtf8();
    }

    public static final int GROUP_ID_FIELD_NUMBER = 2;
    private String groupId_;
    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 2;</code>
     */
    public String getGroupId() {
      return groupId_;
    }
    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(groupId_);
    }
    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 2;</code>
     */
    private void setGroupId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      groupId_ = value;
    }
    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 2;</code>
     */
    private void clearGroupId() {

      groupId_ = getDefaultInstance().getGroupId();
    }
    /**
     * <pre>
     *群组ID
     * </pre>
     *
     * <code>optional string group_id = 2;</code>
     */
    private void setGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      groupId_ = value.toStringUtf8();
    }

    public static final int PAGE_NUMBER_FIELD_NUMBER = 3;
    private int pageNumber_;
    /**
     * <pre>
     *分页：第几页
     * </pre>
     *
     * <code>optional int32 page_number = 3;</code>
     */
    public int getPageNumber() {
      return pageNumber_;
    }
    /**
     * <pre>
     *分页：第几页
     * </pre>
     *
     * <code>optional int32 page_number = 3;</code>
     */
    private void setPageNumber(int value) {

      pageNumber_ = value;
    }
    /**
     * <pre>
     *分页：第几页
     * </pre>
     *
     * <code>optional int32 page_number = 3;</code>
     */
    private void clearPageNumber() {

      pageNumber_ = 0;
    }

    public static final int PAGE_SIZE_FIELD_NUMBER = 4;
    private int pageSize_;
    /**
     * <pre>
     *分页：每页条数，默认100
     * </pre>
     *
     * <code>optional int32 page_size = 4;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     *分页：每页条数，默认100
     * </pre>
     *
     * <code>optional int32 page_size = 4;</code>
     */
    private void setPageSize(int value) {

      pageSize_ = value;
    }
    /**
     * <pre>
     *分页：每页条数，默认100
     * </pre>
     *
     * <code>optional int32 page_size = 4;</code>
     */
    private void clearPageSize() {

      pageSize_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!siteUserId_.isEmpty()) {
        output.writeString(1, getSiteUserId());
      }
      if (!groupId_.isEmpty()) {
        output.writeString(2, getGroupId());
      }
      if (pageNumber_ != 0) {
        output.writeInt32(3, pageNumber_);
      }
      if (pageSize_ != 0) {
        output.writeInt32(4, pageSize_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!siteUserId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSiteUserId());
      }
      if (!groupId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getGroupId());
      }
      if (pageNumber_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, pageNumber_);
      }
      if (pageSize_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, pageSize_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiGroupNonmembersRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupNonmembersRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupNonmembersRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupNonmembersRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupNonmembersRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupNonmembersRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupNonmembersRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiGroupNonmembersRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupNonmembersRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupNonmembersRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiGroupNonmembersRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     **
     *分页获非群成员
     *----
     *接口名
     *----
     * /hai/group/nonmembers
     *错误码
     *----
     *- success
     *- error.alert
     * </pre>
     *
     * Protobuf type {@code plugin.HaiGroupNonmembersRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiGroupNonmembersRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiGroupNonmembersRequest)
        HaiGroupNonmembersRequestOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiGroupNonmembersProto.HaiGroupNonmembersRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * 以谁的视角获取这份数据
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public String getSiteUserId() {
        return instance.getSiteUserId();
      }
      /**
       * <pre>
       * 以谁的视角获取这份数据
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSiteUserIdBytes() {
        return instance.getSiteUserIdBytes();
      }
      /**
       * <pre>
       * 以谁的视角获取这份数据
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public Builder setSiteUserId(
          String value) {
        copyOnWrite();
        instance.setSiteUserId(value);
        return this;
      }
      /**
       * <pre>
       * 以谁的视角获取这份数据
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public Builder clearSiteUserId() {
        copyOnWrite();
        instance.clearSiteUserId();
        return this;
      }
      /**
       * <pre>
       * 以谁的视角获取这份数据
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public Builder setSiteUserIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSiteUserIdBytes(value);
        return this;
      }

      /**
       * <pre>
       *群组ID
       * </pre>
       *
       * <code>optional string group_id = 2;</code>
       */
      public String getGroupId() {
        return instance.getGroupId();
      }
      /**
       * <pre>
       *群组ID
       * </pre>
       *
       * <code>optional string group_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getGroupIdBytes() {
        return instance.getGroupIdBytes();
      }
      /**
       * <pre>
       *群组ID
       * </pre>
       *
       * <code>optional string group_id = 2;</code>
       */
      public Builder setGroupId(
          String value) {
        copyOnWrite();
        instance.setGroupId(value);
        return this;
      }
      /**
       * <pre>
       *群组ID
       * </pre>
       *
       * <code>optional string group_id = 2;</code>
       */
      public Builder clearGroupId() {
        copyOnWrite();
        instance.clearGroupId();
        return this;
      }
      /**
       * <pre>
       *群组ID
       * </pre>
       *
       * <code>optional string group_id = 2;</code>
       */
      public Builder setGroupIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setGroupIdBytes(value);
        return this;
      }

      /**
       * <pre>
       *分页：第几页
       * </pre>
       *
       * <code>optional int32 page_number = 3;</code>
       */
      public int getPageNumber() {
        return instance.getPageNumber();
      }
      /**
       * <pre>
       *分页：第几页
       * </pre>
       *
       * <code>optional int32 page_number = 3;</code>
       */
      public Builder setPageNumber(int value) {
        copyOnWrite();
        instance.setPageNumber(value);
        return this;
      }
      /**
       * <pre>
       *分页：第几页
       * </pre>
       *
       * <code>optional int32 page_number = 3;</code>
       */
      public Builder clearPageNumber() {
        copyOnWrite();
        instance.clearPageNumber();
        return this;
      }

      /**
       * <pre>
       *分页：每页条数，默认100
       * </pre>
       *
       * <code>optional int32 page_size = 4;</code>
       */
      public int getPageSize() {
        return instance.getPageSize();
      }
      /**
       * <pre>
       *分页：每页条数，默认100
       * </pre>
       *
       * <code>optional int32 page_size = 4;</code>
       */
      public Builder setPageSize(int value) {
        copyOnWrite();
        instance.setPageSize(value);
        return this;
      }
      /**
       * <pre>
       *分页：每页条数，默认100
       * </pre>
       *
       * <code>optional int32 page_size = 4;</code>
       */
      public Builder clearPageSize() {
        copyOnWrite();
        instance.clearPageSize();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:plugin.HaiGroupNonmembersRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiGroupNonmembersRequest();
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
          HaiGroupNonmembersRequest other = (HaiGroupNonmembersRequest) arg1;
          siteUserId_ = visitor.visitString(!siteUserId_.isEmpty(), siteUserId_,
              !other.siteUserId_.isEmpty(), other.siteUserId_);
          groupId_ = visitor.visitString(!groupId_.isEmpty(), groupId_,
              !other.groupId_.isEmpty(), other.groupId_);
          pageNumber_ = visitor.visitInt(pageNumber_ != 0, pageNumber_,
              other.pageNumber_ != 0, other.pageNumber_);
          pageSize_ = visitor.visitInt(pageSize_ != 0, pageSize_,
              other.pageSize_ != 0, other.pageSize_);
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

                  siteUserId_ = s;
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  groupId_ = s;
                  break;
                }
                case 24: {

                  pageNumber_ = input.readInt32();
                  break;
                }
                case 32: {

                  pageSize_ = input.readInt32();
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
          if (PARSER == null) {    synchronized (HaiGroupNonmembersRequest.class) {
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


    // @@protoc_insertion_point(class_scope:plugin.HaiGroupNonmembersRequest)
    private static final HaiGroupNonmembersRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiGroupNonmembersRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiGroupNonmembersRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiGroupNonmembersRequest> PARSER;

    public static com.google.protobuf.Parser<HaiGroupNonmembersRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface HaiGroupNonmembersResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiGroupNonmembersResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    java.util.List<com.windchat.proto.core.GroupProto.GroupMemberProfile>
        getGroupMemberList();
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    com.windchat.proto.core.GroupProto.GroupMemberProfile getGroupMember(int index);
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    int getGroupMemberCount();

    /**
     * <pre>
     * 分页总数
     * </pre>
     *
     * <code>optional int32 page_total_num = 2;</code>
     */
    int getPageTotalNum();
  }
  /**
   * Protobuf type {@code plugin.HaiGroupNonmembersResponse}
   */
  public  static final class HaiGroupNonmembersResponse extends
      com.google.protobuf.GeneratedMessageLite<
          HaiGroupNonmembersResponse, HaiGroupNonmembersResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiGroupNonmembersResponse)
      HaiGroupNonmembersResponseOrBuilder {
    private HaiGroupNonmembersResponse() {
      groupMember_ = emptyProtobufList();
    }
    private int bitField0_;
    public static final int GROUP_MEMBER_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<com.windchat.proto.core.GroupProto.GroupMemberProfile> groupMember_;
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    public java.util.List<com.windchat.proto.core.GroupProto.GroupMemberProfile> getGroupMemberList() {
      return groupMember_;
    }
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    public java.util.List<? extends com.windchat.proto.core.GroupProto.GroupMemberProfileOrBuilder>
        getGroupMemberOrBuilderList() {
      return groupMember_;
    }
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    public int getGroupMemberCount() {
      return groupMember_.size();
    }
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    public com.windchat.proto.core.GroupProto.GroupMemberProfile getGroupMember(int index) {
      return groupMember_.get(index);
    }
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    public com.windchat.proto.core.GroupProto.GroupMemberProfileOrBuilder getGroupMemberOrBuilder(
        int index) {
      return groupMember_.get(index);
    }
    private void ensureGroupMemberIsMutable() {
      if (!groupMember_.isModifiable()) {
        groupMember_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(groupMember_);
       }
    }

    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    private void setGroupMember(
        int index, com.windchat.proto.core.GroupProto.GroupMemberProfile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGroupMemberIsMutable();
      groupMember_.set(index, value);
    }
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    private void setGroupMember(
        int index, com.windchat.proto.core.GroupProto.GroupMemberProfile.Builder builderForValue) {
      ensureGroupMemberIsMutable();
      groupMember_.set(index, builderForValue.build());
    }
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    private void addGroupMember(com.windchat.proto.core.GroupProto.GroupMemberProfile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGroupMemberIsMutable();
      groupMember_.add(value);
    }
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    private void addGroupMember(
        int index, com.windchat.proto.core.GroupProto.GroupMemberProfile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGroupMemberIsMutable();
      groupMember_.add(index, value);
    }
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    private void addGroupMember(
        com.windchat.proto.core.GroupProto.GroupMemberProfile.Builder builderForValue) {
      ensureGroupMemberIsMutable();
      groupMember_.add(builderForValue.build());
    }
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    private void addGroupMember(
        int index, com.windchat.proto.core.GroupProto.GroupMemberProfile.Builder builderForValue) {
      ensureGroupMemberIsMutable();
      groupMember_.add(index, builderForValue.build());
    }
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    private void addAllGroupMember(
        Iterable<? extends com.windchat.proto.core.GroupProto.GroupMemberProfile> values) {
      ensureGroupMemberIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, groupMember_);
    }
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    private void clearGroupMember() {
      groupMember_ = emptyProtobufList();
    }
    /**
     * <pre>
     *群组成员信息
     * </pre>
     *
     * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
     */
    private void removeGroupMember(int index) {
      ensureGroupMemberIsMutable();
      groupMember_.remove(index);
    }

    public static final int PAGE_TOTAL_NUM_FIELD_NUMBER = 2;
    private int pageTotalNum_;
    /**
     * <pre>
     * 分页总数
     * </pre>
     *
     * <code>optional int32 page_total_num = 2;</code>
     */
    public int getPageTotalNum() {
      return pageTotalNum_;
    }
    /**
     * <pre>
     * 分页总数
     * </pre>
     *
     * <code>optional int32 page_total_num = 2;</code>
     */
    private void setPageTotalNum(int value) {

      pageTotalNum_ = value;
    }
    /**
     * <pre>
     * 分页总数
     * </pre>
     *
     * <code>optional int32 page_total_num = 2;</code>
     */
    private void clearPageTotalNum() {

      pageTotalNum_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < groupMember_.size(); i++) {
        output.writeMessage(1, groupMember_.get(i));
      }
      if (pageTotalNum_ != 0) {
        output.writeInt32(2, pageTotalNum_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < groupMember_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, groupMember_.get(i));
      }
      if (pageTotalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, pageTotalNum_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiGroupNonmembersResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupNonmembersResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupNonmembersResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupNonmembersResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupNonmembersResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupNonmembersResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupNonmembersResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiGroupNonmembersResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupNonmembersResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupNonmembersResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiGroupNonmembersResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code plugin.HaiGroupNonmembersResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiGroupNonmembersResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiGroupNonmembersResponse)
        HaiGroupNonmembersResponseOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiGroupNonmembersProto.HaiGroupNonmembersResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *群组成员信息
       * </pre>
       *
       * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
       */
      public java.util.List<com.windchat.proto.core.GroupProto.GroupMemberProfile> getGroupMemberList() {
        return java.util.Collections.unmodifiableList(
            instance.getGroupMemberList());
      }
      /**
       * <pre>
       *群组成员信息
       * </pre>
       *
       * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
       */
      public int getGroupMemberCount() {
        return instance.getGroupMemberCount();
      }/**
       * <pre>
       *群组成员信息
       * </pre>
       *
       * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
       */
      public com.windchat.proto.core.GroupProto.GroupMemberProfile getGroupMember(int index) {
        return instance.getGroupMember(index);
      }
      /**
       * <pre>
       *群组成员信息
       * </pre>
       *
       * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
       */
      public Builder setGroupMember(
          int index, com.windchat.proto.core.GroupProto.GroupMemberProfile value) {
        copyOnWrite();
        instance.setGroupMember(index, value);
        return this;
      }
      /**
       * <pre>
       *群组成员信息
       * </pre>
       *
       * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
       */
      public Builder setGroupMember(
          int index, com.windchat.proto.core.GroupProto.GroupMemberProfile.Builder builderForValue) {
        copyOnWrite();
        instance.setGroupMember(index, builderForValue);
        return this;
      }
      /**
       * <pre>
       *群组成员信息
       * </pre>
       *
       * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
       */
      public Builder addGroupMember(com.windchat.proto.core.GroupProto.GroupMemberProfile value) {
        copyOnWrite();
        instance.addGroupMember(value);
        return this;
      }
      /**
       * <pre>
       *群组成员信息
       * </pre>
       *
       * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
       */
      public Builder addGroupMember(
          int index, com.windchat.proto.core.GroupProto.GroupMemberProfile value) {
        copyOnWrite();
        instance.addGroupMember(index, value);
        return this;
      }
      /**
       * <pre>
       *群组成员信息
       * </pre>
       *
       * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
       */
      public Builder addGroupMember(
          com.windchat.proto.core.GroupProto.GroupMemberProfile.Builder builderForValue) {
        copyOnWrite();
        instance.addGroupMember(builderForValue);
        return this;
      }
      /**
       * <pre>
       *群组成员信息
       * </pre>
       *
       * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
       */
      public Builder addGroupMember(
          int index, com.windchat.proto.core.GroupProto.GroupMemberProfile.Builder builderForValue) {
        copyOnWrite();
        instance.addGroupMember(index, builderForValue);
        return this;
      }
      /**
       * <pre>
       *群组成员信息
       * </pre>
       *
       * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
       */
      public Builder addAllGroupMember(
          Iterable<? extends com.windchat.proto.core.GroupProto.GroupMemberProfile> values) {
        copyOnWrite();
        instance.addAllGroupMember(values);
        return this;
      }
      /**
       * <pre>
       *群组成员信息
       * </pre>
       *
       * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
       */
      public Builder clearGroupMember() {
        copyOnWrite();
        instance.clearGroupMember();
        return this;
      }
      /**
       * <pre>
       *群组成员信息
       * </pre>
       *
       * <code>repeated .core.GroupMemberProfile group_member = 1;</code>
       */
      public Builder removeGroupMember(int index) {
        copyOnWrite();
        instance.removeGroupMember(index);
        return this;
      }

      /**
       * <pre>
       * 分页总数
       * </pre>
       *
       * <code>optional int32 page_total_num = 2;</code>
       */
      public int getPageTotalNum() {
        return instance.getPageTotalNum();
      }
      /**
       * <pre>
       * 分页总数
       * </pre>
       *
       * <code>optional int32 page_total_num = 2;</code>
       */
      public Builder setPageTotalNum(int value) {
        copyOnWrite();
        instance.setPageTotalNum(value);
        return this;
      }
      /**
       * <pre>
       * 分页总数
       * </pre>
       *
       * <code>optional int32 page_total_num = 2;</code>
       */
      public Builder clearPageTotalNum() {
        copyOnWrite();
        instance.clearPageTotalNum();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:plugin.HaiGroupNonmembersResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiGroupNonmembersResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          groupMember_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          HaiGroupNonmembersResponse other = (HaiGroupNonmembersResponse) arg1;
          groupMember_= visitor.visitList(groupMember_, other.groupMember_);
          pageTotalNum_ = visitor.visitInt(pageTotalNum_ != 0, pageTotalNum_,
              other.pageTotalNum_ != 0, other.pageTotalNum_);
          if (visitor == MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
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
                  if (!groupMember_.isModifiable()) {
                    groupMember_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(groupMember_);
                  }
                  groupMember_.add(
                      input.readMessage(com.windchat.proto.core.GroupProto.GroupMemberProfile.parser(), extensionRegistry));
                  break;
                }
                case 16: {

                  pageTotalNum_ = input.readInt32();
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
          if (PARSER == null) {    synchronized (HaiGroupNonmembersResponse.class) {
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


    // @@protoc_insertion_point(class_scope:plugin.HaiGroupNonmembersResponse)
    private static final HaiGroupNonmembersResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiGroupNonmembersResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiGroupNonmembersResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiGroupNonmembersResponse> PARSER;

    public static com.google.protobuf.Parser<HaiGroupNonmembersResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
