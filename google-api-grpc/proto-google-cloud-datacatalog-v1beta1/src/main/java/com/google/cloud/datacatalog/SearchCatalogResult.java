// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/search.proto

package com.google.cloud.datacatalog;

/**
 *
 *
 * <pre>
 * A result that appears in the response of a search request. Each result
 * captures details of one entry that matches the search.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.SearchCatalogResult}
 */
public final class SearchCatalogResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.SearchCatalogResult)
    SearchCatalogResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchCatalogResult.newBuilder() to construct.
  private SearchCatalogResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchCatalogResult() {
    searchResultType_ = 0;
    searchResultSubtype_ = "";
    relativeResourceName_ = "";
    linkedResource_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SearchCatalogResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8:
            {
              int rawValue = input.readEnum();

              searchResultType_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              searchResultSubtype_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              relativeResourceName_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              linkedResource_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.Search
        .internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.Search
        .internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.SearchCatalogResult.class,
            com.google.cloud.datacatalog.SearchCatalogResult.Builder.class);
  }

  public static final int SEARCH_RESULT_TYPE_FIELD_NUMBER = 1;
  private int searchResultType_;
  /**
   *
   *
   * <pre>
   * Type of the search result. This field can be used to determine which Get
   * method to call to fetch the full resource.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.SearchResultType search_result_type = 1;</code>
   */
  public int getSearchResultTypeValue() {
    return searchResultType_;
  }
  /**
   *
   *
   * <pre>
   * Type of the search result. This field can be used to determine which Get
   * method to call to fetch the full resource.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.SearchResultType search_result_type = 1;</code>
   */
  public com.google.cloud.datacatalog.SearchResultType getSearchResultType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.datacatalog.SearchResultType result =
        com.google.cloud.datacatalog.SearchResultType.valueOf(searchResultType_);
    return result == null ? com.google.cloud.datacatalog.SearchResultType.UNRECOGNIZED : result;
  }

  public static final int SEARCH_RESULT_SUBTYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object searchResultSubtype_;
  /**
   *
   *
   * <pre>
   * Sub-type of the search result. This is a dot-delimited description of the
   * resource's full type, and is the same as the value callers would provide in
   * the "type" search facet.  Examples: "entry.table", "entry.dataStream",
   * "tagTemplate"
   * </pre>
   *
   * <code>string search_result_subtype = 2;</code>
   */
  public java.lang.String getSearchResultSubtype() {
    java.lang.Object ref = searchResultSubtype_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      searchResultSubtype_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Sub-type of the search result. This is a dot-delimited description of the
   * resource's full type, and is the same as the value callers would provide in
   * the "type" search facet.  Examples: "entry.table", "entry.dataStream",
   * "tagTemplate"
   * </pre>
   *
   * <code>string search_result_subtype = 2;</code>
   */
  public com.google.protobuf.ByteString getSearchResultSubtypeBytes() {
    java.lang.Object ref = searchResultSubtype_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      searchResultSubtype_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RELATIVE_RESOURCE_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object relativeResourceName_;
  /**
   *
   *
   * <pre>
   * The relative resource name of the resource in URL format.
   * Examples:
   * "projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}".
   * "projects/{project_id}/tagTemplates/{tag_template_id}".
   * </pre>
   *
   * <code>string relative_resource_name = 3;</code>
   */
  public java.lang.String getRelativeResourceName() {
    java.lang.Object ref = relativeResourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      relativeResourceName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The relative resource name of the resource in URL format.
   * Examples:
   * "projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}".
   * "projects/{project_id}/tagTemplates/{tag_template_id}".
   * </pre>
   *
   * <code>string relative_resource_name = 3;</code>
   */
  public com.google.protobuf.ByteString getRelativeResourceNameBytes() {
    java.lang.Object ref = relativeResourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      relativeResourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINKED_RESOURCE_FIELD_NUMBER = 4;
  private volatile java.lang.Object linkedResource_;
  /**
   *
   *
   * <pre>
   * The full name of the cloud resource the entry belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * Example:
   * "//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId".
   * </pre>
   *
   * <code>string linked_resource = 4;</code>
   */
  public java.lang.String getLinkedResource() {
    java.lang.Object ref = linkedResource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      linkedResource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The full name of the cloud resource the entry belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * Example:
   * "//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId".
   * </pre>
   *
   * <code>string linked_resource = 4;</code>
   */
  public com.google.protobuf.ByteString getLinkedResourceBytes() {
    java.lang.Object ref = linkedResource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      linkedResource_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (searchResultType_
        != com.google.cloud.datacatalog.SearchResultType.SEARCH_RESULT_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, searchResultType_);
    }
    if (!getSearchResultSubtypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, searchResultSubtype_);
    }
    if (!getRelativeResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, relativeResourceName_);
    }
    if (!getLinkedResourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, linkedResource_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (searchResultType_
        != com.google.cloud.datacatalog.SearchResultType.SEARCH_RESULT_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, searchResultType_);
    }
    if (!getSearchResultSubtypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, searchResultSubtype_);
    }
    if (!getRelativeResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, relativeResourceName_);
    }
    if (!getLinkedResourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, linkedResource_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.SearchCatalogResult)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.SearchCatalogResult other =
        (com.google.cloud.datacatalog.SearchCatalogResult) obj;

    if (searchResultType_ != other.searchResultType_) return false;
    if (!getSearchResultSubtype().equals(other.getSearchResultSubtype())) return false;
    if (!getRelativeResourceName().equals(other.getRelativeResourceName())) return false;
    if (!getLinkedResource().equals(other.getLinkedResource())) return false;
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
    hash = (37 * hash) + SEARCH_RESULT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + searchResultType_;
    hash = (37 * hash) + SEARCH_RESULT_SUBTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSearchResultSubtype().hashCode();
    hash = (37 * hash) + RELATIVE_RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getRelativeResourceName().hashCode();
    hash = (37 * hash) + LINKED_RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getLinkedResource().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.datacatalog.SearchCatalogResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A result that appears in the response of a search request. Each result
   * captures details of one entry that matches the search.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.SearchCatalogResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.SearchCatalogResult)
      com.google.cloud.datacatalog.SearchCatalogResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.Search
          .internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.Search
          .internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.SearchCatalogResult.class,
              com.google.cloud.datacatalog.SearchCatalogResult.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.SearchCatalogResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      searchResultType_ = 0;

      searchResultSubtype_ = "";

      relativeResourceName_ = "";

      linkedResource_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.Search
          .internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.SearchCatalogResult getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.SearchCatalogResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.SearchCatalogResult build() {
      com.google.cloud.datacatalog.SearchCatalogResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.SearchCatalogResult buildPartial() {
      com.google.cloud.datacatalog.SearchCatalogResult result =
          new com.google.cloud.datacatalog.SearchCatalogResult(this);
      result.searchResultType_ = searchResultType_;
      result.searchResultSubtype_ = searchResultSubtype_;
      result.relativeResourceName_ = relativeResourceName_;
      result.linkedResource_ = linkedResource_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.SearchCatalogResult) {
        return mergeFrom((com.google.cloud.datacatalog.SearchCatalogResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.SearchCatalogResult other) {
      if (other == com.google.cloud.datacatalog.SearchCatalogResult.getDefaultInstance())
        return this;
      if (other.searchResultType_ != 0) {
        setSearchResultTypeValue(other.getSearchResultTypeValue());
      }
      if (!other.getSearchResultSubtype().isEmpty()) {
        searchResultSubtype_ = other.searchResultSubtype_;
        onChanged();
      }
      if (!other.getRelativeResourceName().isEmpty()) {
        relativeResourceName_ = other.relativeResourceName_;
        onChanged();
      }
      if (!other.getLinkedResource().isEmpty()) {
        linkedResource_ = other.linkedResource_;
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
      com.google.cloud.datacatalog.SearchCatalogResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datacatalog.SearchCatalogResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int searchResultType_ = 0;
    /**
     *
     *
     * <pre>
     * Type of the search result. This field can be used to determine which Get
     * method to call to fetch the full resource.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.SearchResultType search_result_type = 1;</code>
     */
    public int getSearchResultTypeValue() {
      return searchResultType_;
    }
    /**
     *
     *
     * <pre>
     * Type of the search result. This field can be used to determine which Get
     * method to call to fetch the full resource.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.SearchResultType search_result_type = 1;</code>
     */
    public Builder setSearchResultTypeValue(int value) {
      searchResultType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the search result. This field can be used to determine which Get
     * method to call to fetch the full resource.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.SearchResultType search_result_type = 1;</code>
     */
    public com.google.cloud.datacatalog.SearchResultType getSearchResultType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.datacatalog.SearchResultType result =
          com.google.cloud.datacatalog.SearchResultType.valueOf(searchResultType_);
      return result == null ? com.google.cloud.datacatalog.SearchResultType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Type of the search result. This field can be used to determine which Get
     * method to call to fetch the full resource.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.SearchResultType search_result_type = 1;</code>
     */
    public Builder setSearchResultType(com.google.cloud.datacatalog.SearchResultType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      searchResultType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the search result. This field can be used to determine which Get
     * method to call to fetch the full resource.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.SearchResultType search_result_type = 1;</code>
     */
    public Builder clearSearchResultType() {

      searchResultType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object searchResultSubtype_ = "";
    /**
     *
     *
     * <pre>
     * Sub-type of the search result. This is a dot-delimited description of the
     * resource's full type, and is the same as the value callers would provide in
     * the "type" search facet.  Examples: "entry.table", "entry.dataStream",
     * "tagTemplate"
     * </pre>
     *
     * <code>string search_result_subtype = 2;</code>
     */
    public java.lang.String getSearchResultSubtype() {
      java.lang.Object ref = searchResultSubtype_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        searchResultSubtype_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Sub-type of the search result. This is a dot-delimited description of the
     * resource's full type, and is the same as the value callers would provide in
     * the "type" search facet.  Examples: "entry.table", "entry.dataStream",
     * "tagTemplate"
     * </pre>
     *
     * <code>string search_result_subtype = 2;</code>
     */
    public com.google.protobuf.ByteString getSearchResultSubtypeBytes() {
      java.lang.Object ref = searchResultSubtype_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        searchResultSubtype_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Sub-type of the search result. This is a dot-delimited description of the
     * resource's full type, and is the same as the value callers would provide in
     * the "type" search facet.  Examples: "entry.table", "entry.dataStream",
     * "tagTemplate"
     * </pre>
     *
     * <code>string search_result_subtype = 2;</code>
     */
    public Builder setSearchResultSubtype(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      searchResultSubtype_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sub-type of the search result. This is a dot-delimited description of the
     * resource's full type, and is the same as the value callers would provide in
     * the "type" search facet.  Examples: "entry.table", "entry.dataStream",
     * "tagTemplate"
     * </pre>
     *
     * <code>string search_result_subtype = 2;</code>
     */
    public Builder clearSearchResultSubtype() {

      searchResultSubtype_ = getDefaultInstance().getSearchResultSubtype();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sub-type of the search result. This is a dot-delimited description of the
     * resource's full type, and is the same as the value callers would provide in
     * the "type" search facet.  Examples: "entry.table", "entry.dataStream",
     * "tagTemplate"
     * </pre>
     *
     * <code>string search_result_subtype = 2;</code>
     */
    public Builder setSearchResultSubtypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      searchResultSubtype_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object relativeResourceName_ = "";
    /**
     *
     *
     * <pre>
     * The relative resource name of the resource in URL format.
     * Examples:
     * "projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}".
     * "projects/{project_id}/tagTemplates/{tag_template_id}".
     * </pre>
     *
     * <code>string relative_resource_name = 3;</code>
     */
    public java.lang.String getRelativeResourceName() {
      java.lang.Object ref = relativeResourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        relativeResourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The relative resource name of the resource in URL format.
     * Examples:
     * "projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}".
     * "projects/{project_id}/tagTemplates/{tag_template_id}".
     * </pre>
     *
     * <code>string relative_resource_name = 3;</code>
     */
    public com.google.protobuf.ByteString getRelativeResourceNameBytes() {
      java.lang.Object ref = relativeResourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        relativeResourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The relative resource name of the resource in URL format.
     * Examples:
     * "projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}".
     * "projects/{project_id}/tagTemplates/{tag_template_id}".
     * </pre>
     *
     * <code>string relative_resource_name = 3;</code>
     */
    public Builder setRelativeResourceName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      relativeResourceName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The relative resource name of the resource in URL format.
     * Examples:
     * "projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}".
     * "projects/{project_id}/tagTemplates/{tag_template_id}".
     * </pre>
     *
     * <code>string relative_resource_name = 3;</code>
     */
    public Builder clearRelativeResourceName() {

      relativeResourceName_ = getDefaultInstance().getRelativeResourceName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The relative resource name of the resource in URL format.
     * Examples:
     * "projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}".
     * "projects/{project_id}/tagTemplates/{tag_template_id}".
     * </pre>
     *
     * <code>string relative_resource_name = 3;</code>
     */
    public Builder setRelativeResourceNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      relativeResourceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object linkedResource_ = "";
    /**
     *
     *
     * <pre>
     * The full name of the cloud resource the entry belongs to. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * Example:
     * "//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId".
     * </pre>
     *
     * <code>string linked_resource = 4;</code>
     */
    public java.lang.String getLinkedResource() {
      java.lang.Object ref = linkedResource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        linkedResource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The full name of the cloud resource the entry belongs to. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * Example:
     * "//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId".
     * </pre>
     *
     * <code>string linked_resource = 4;</code>
     */
    public com.google.protobuf.ByteString getLinkedResourceBytes() {
      java.lang.Object ref = linkedResource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        linkedResource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The full name of the cloud resource the entry belongs to. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * Example:
     * "//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId".
     * </pre>
     *
     * <code>string linked_resource = 4;</code>
     */
    public Builder setLinkedResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      linkedResource_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The full name of the cloud resource the entry belongs to. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * Example:
     * "//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId".
     * </pre>
     *
     * <code>string linked_resource = 4;</code>
     */
    public Builder clearLinkedResource() {

      linkedResource_ = getDefaultInstance().getLinkedResource();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The full name of the cloud resource the entry belongs to. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name
     * Example:
     * "//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId".
     * </pre>
     *
     * <code>string linked_resource = 4;</code>
     */
    public Builder setLinkedResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      linkedResource_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.SearchCatalogResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.SearchCatalogResult)
  private static final com.google.cloud.datacatalog.SearchCatalogResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.SearchCatalogResult();
  }

  public static com.google.cloud.datacatalog.SearchCatalogResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchCatalogResult> PARSER =
      new com.google.protobuf.AbstractParser<SearchCatalogResult>() {
        @java.lang.Override
        public SearchCatalogResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SearchCatalogResult(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SearchCatalogResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchCatalogResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.SearchCatalogResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
