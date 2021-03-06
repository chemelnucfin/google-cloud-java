// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

package com.google.bigtable.admin.v2;

public interface ListAppProfilesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.ListAppProfilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique name of the instance for which a list of app profiles is
   * requested. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * Use `&lt;instance&gt; = '-'` to list AppProfiles for all Instances in a project,
   * e.g., `projects/myproject/instances/-`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The unique name of the instance for which a list of app profiles is
   * requested. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * Use `&lt;instance&gt; = '-'` to list AppProfiles for all Instances in a project,
   * e.g., `projects/myproject/instances/-`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Maximum number of results per page.
   * CURRENTLY UNIMPLEMENTED AND IGNORED.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The value of `next_page_token` returned by a previous call.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The value of `next_page_token` returned by a previous call.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
