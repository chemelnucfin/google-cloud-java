// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

public interface ImagePolylineAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ImagePolylineAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /** <code>.google.cloud.datalabeling.v1beta1.Polyline polyline = 2;</code> */
  boolean hasPolyline();
  /** <code>.google.cloud.datalabeling.v1beta1.Polyline polyline = 2;</code> */
  com.google.cloud.datalabeling.v1beta1.Polyline getPolyline();
  /** <code>.google.cloud.datalabeling.v1beta1.Polyline polyline = 2;</code> */
  com.google.cloud.datalabeling.v1beta1.PolylineOrBuilder getPolylineOrBuilder();

  /** <code>.google.cloud.datalabeling.v1beta1.NormalizedPolyline normalized_polyline = 3;</code> */
  boolean hasNormalizedPolyline();
  /** <code>.google.cloud.datalabeling.v1beta1.NormalizedPolyline normalized_polyline = 3;</code> */
  com.google.cloud.datalabeling.v1beta1.NormalizedPolyline getNormalizedPolyline();
  /** <code>.google.cloud.datalabeling.v1beta1.NormalizedPolyline normalized_polyline = 3;</code> */
  com.google.cloud.datalabeling.v1beta1.NormalizedPolylineOrBuilder
      getNormalizedPolylineOrBuilder();

  /**
   *
   *
   * <pre>
   * Label of this polyline.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  boolean hasAnnotationSpec();
  /**
   *
   *
   * <pre>
   * Label of this polyline.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec();
  /**
   *
   *
   * <pre>
   * Label of this polyline.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder getAnnotationSpecOrBuilder();

  public com.google.cloud.datalabeling.v1beta1.ImagePolylineAnnotation.PolyCase getPolyCase();
}
