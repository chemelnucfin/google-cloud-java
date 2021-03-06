// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/intent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface UpdateIntentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.UpdateIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The intent to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 1;</code>
   */
  boolean hasIntent();
  /**
   *
   *
   * <pre>
   * Required. The intent to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent getIntent();
  /**
   *
   *
   * <pre>
   * Required. The intent to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.IntentOrBuilder getIntentOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The language of training phrases, parameters and rich messages
   * defined in `intent`. If not specified, the agent's default language is
   * used. [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language of training phrases, parameters and rich messages
   * defined in `intent`. If not specified, the agent's default language is
   * used. [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 4;</code>
   */
  int getIntentViewValue();
  /**
   *
   *
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 4;</code>
   */
  com.google.cloud.dialogflow.v2beta1.IntentView getIntentView();
}
