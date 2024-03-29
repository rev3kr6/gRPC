// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Charge.proto

package com.hw2.grpc.lib;

/**
 * Protobuf type {@code ChargeRequest}
 */
public final class ChargeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ChargeRequest)
    ChargeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChargeRequest.newBuilder() to construct.
  private ChargeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChargeRequest() {
    genre_ = "";
    date_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChargeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChargeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            idx_ = input.readInt32();
            break;
          }
          case 16: {

            cost_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            genre_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            date_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hw2.grpc.lib.ChargeProto.internal_static_ChargeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hw2.grpc.lib.ChargeProto.internal_static_ChargeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hw2.grpc.lib.ChargeRequest.class, com.hw2.grpc.lib.ChargeRequest.Builder.class);
  }

  public static final int IDX_FIELD_NUMBER = 1;
  private int idx_;
  /**
   * <code>int32 idx = 1;</code>
   * @return The idx.
   */
  @java.lang.Override
  public int getIdx() {
    return idx_;
  }

  public static final int COST_FIELD_NUMBER = 2;
  private long cost_;
  /**
   * <code>int64 cost = 2;</code>
   * @return The cost.
   */
  @java.lang.Override
  public long getCost() {
    return cost_;
  }

  public static final int GENRE_FIELD_NUMBER = 3;
  private volatile java.lang.Object genre_;
  /**
   * <code>string genre = 3;</code>
   * @return The genre.
   */
  @java.lang.Override
  public java.lang.String getGenre() {
    java.lang.Object ref = genre_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      genre_ = s;
      return s;
    }
  }
  /**
   * <code>string genre = 3;</code>
   * @return The bytes for genre.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGenreBytes() {
    java.lang.Object ref = genre_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      genre_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATE_FIELD_NUMBER = 4;
  private volatile java.lang.Object date_;
  /**
   * <code>string date = 4;</code>
   * @return The date.
   */
  @java.lang.Override
  public java.lang.String getDate() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      date_ = s;
      return s;
    }
  }
  /**
   * <code>string date = 4;</code>
   * @return The bytes for date.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDateBytes() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      date_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 5;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 5;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
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
    if (idx_ != 0) {
      output.writeInt32(1, idx_);
    }
    if (cost_ != 0L) {
      output.writeInt64(2, cost_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(genre_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, genre_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(date_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, date_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, description_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idx_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, idx_);
    }
    if (cost_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, cost_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(genre_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, genre_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(date_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, date_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, description_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hw2.grpc.lib.ChargeRequest)) {
      return super.equals(obj);
    }
    com.hw2.grpc.lib.ChargeRequest other = (com.hw2.grpc.lib.ChargeRequest) obj;

    if (getIdx()
        != other.getIdx()) return false;
    if (getCost()
        != other.getCost()) return false;
    if (!getGenre()
        .equals(other.getGenre())) return false;
    if (!getDate()
        .equals(other.getDate())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IDX_FIELD_NUMBER;
    hash = (53 * hash) + getIdx();
    hash = (37 * hash) + COST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCost());
    hash = (37 * hash) + GENRE_FIELD_NUMBER;
    hash = (53 * hash) + getGenre().hashCode();
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + getDate().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hw2.grpc.lib.ChargeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hw2.grpc.lib.ChargeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hw2.grpc.lib.ChargeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hw2.grpc.lib.ChargeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hw2.grpc.lib.ChargeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hw2.grpc.lib.ChargeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hw2.grpc.lib.ChargeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hw2.grpc.lib.ChargeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hw2.grpc.lib.ChargeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hw2.grpc.lib.ChargeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hw2.grpc.lib.ChargeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hw2.grpc.lib.ChargeRequest parseFrom(
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
  public static Builder newBuilder(com.hw2.grpc.lib.ChargeRequest prototype) {
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
   * Protobuf type {@code ChargeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ChargeRequest)
      com.hw2.grpc.lib.ChargeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hw2.grpc.lib.ChargeProto.internal_static_ChargeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hw2.grpc.lib.ChargeProto.internal_static_ChargeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hw2.grpc.lib.ChargeRequest.class, com.hw2.grpc.lib.ChargeRequest.Builder.class);
    }

    // Construct using com.hw2.grpc.lib.ChargeRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      idx_ = 0;

      cost_ = 0L;

      genre_ = "";

      date_ = "";

      description_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hw2.grpc.lib.ChargeProto.internal_static_ChargeRequest_descriptor;
    }

    @java.lang.Override
    public com.hw2.grpc.lib.ChargeRequest getDefaultInstanceForType() {
      return com.hw2.grpc.lib.ChargeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hw2.grpc.lib.ChargeRequest build() {
      com.hw2.grpc.lib.ChargeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hw2.grpc.lib.ChargeRequest buildPartial() {
      com.hw2.grpc.lib.ChargeRequest result = new com.hw2.grpc.lib.ChargeRequest(this);
      result.idx_ = idx_;
      result.cost_ = cost_;
      result.genre_ = genre_;
      result.date_ = date_;
      result.description_ = description_;
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
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hw2.grpc.lib.ChargeRequest) {
        return mergeFrom((com.hw2.grpc.lib.ChargeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hw2.grpc.lib.ChargeRequest other) {
      if (other == com.hw2.grpc.lib.ChargeRequest.getDefaultInstance()) return this;
      if (other.getIdx() != 0) {
        setIdx(other.getIdx());
      }
      if (other.getCost() != 0L) {
        setCost(other.getCost());
      }
      if (!other.getGenre().isEmpty()) {
        genre_ = other.genre_;
        onChanged();
      }
      if (!other.getDate().isEmpty()) {
        date_ = other.date_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.hw2.grpc.lib.ChargeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hw2.grpc.lib.ChargeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int idx_ ;
    /**
     * <code>int32 idx = 1;</code>
     * @return The idx.
     */
    @java.lang.Override
    public int getIdx() {
      return idx_;
    }
    /**
     * <code>int32 idx = 1;</code>
     * @param value The idx to set.
     * @return This builder for chaining.
     */
    public Builder setIdx(int value) {
      
      idx_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 idx = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdx() {
      
      idx_ = 0;
      onChanged();
      return this;
    }

    private long cost_ ;
    /**
     * <code>int64 cost = 2;</code>
     * @return The cost.
     */
    @java.lang.Override
    public long getCost() {
      return cost_;
    }
    /**
     * <code>int64 cost = 2;</code>
     * @param value The cost to set.
     * @return This builder for chaining.
     */
    public Builder setCost(long value) {
      
      cost_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 cost = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCost() {
      
      cost_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object genre_ = "";
    /**
     * <code>string genre = 3;</code>
     * @return The genre.
     */
    public java.lang.String getGenre() {
      java.lang.Object ref = genre_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        genre_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string genre = 3;</code>
     * @return The bytes for genre.
     */
    public com.google.protobuf.ByteString
        getGenreBytes() {
      java.lang.Object ref = genre_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        genre_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string genre = 3;</code>
     * @param value The genre to set.
     * @return This builder for chaining.
     */
    public Builder setGenre(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      genre_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string genre = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGenre() {
      
      genre_ = getDefaultInstance().getGenre();
      onChanged();
      return this;
    }
    /**
     * <code>string genre = 3;</code>
     * @param value The bytes for genre to set.
     * @return This builder for chaining.
     */
    public Builder setGenreBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      genre_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object date_ = "";
    /**
     * <code>string date = 4;</code>
     * @return The date.
     */
    public java.lang.String getDate() {
      java.lang.Object ref = date_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        date_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string date = 4;</code>
     * @return The bytes for date.
     */
    public com.google.protobuf.ByteString
        getDateBytes() {
      java.lang.Object ref = date_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        date_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string date = 4;</code>
     * @param value The date to set.
     * @return This builder for chaining.
     */
    public Builder setDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      date_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string date = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDate() {
      
      date_ = getDefaultInstance().getDate();
      onChanged();
      return this;
    }
    /**
     * <code>string date = 4;</code>
     * @param value The bytes for date to set.
     * @return This builder for chaining.
     */
    public Builder setDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      date_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 5;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 5;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 5;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 5;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:ChargeRequest)
  }

  // @@protoc_insertion_point(class_scope:ChargeRequest)
  private static final com.hw2.grpc.lib.ChargeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hw2.grpc.lib.ChargeRequest();
  }

  public static com.hw2.grpc.lib.ChargeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChargeRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChargeRequest>() {
    @java.lang.Override
    public ChargeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChargeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChargeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChargeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hw2.grpc.lib.ChargeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

