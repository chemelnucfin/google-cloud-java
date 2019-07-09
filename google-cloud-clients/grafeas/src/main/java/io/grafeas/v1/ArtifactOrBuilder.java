/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/provenance.proto

package io.grafeas.v1;

public interface ArtifactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Artifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
   * container.
   * </pre>
   *
   * <code>string checksum = 1;</code>
   */
  java.lang.String getChecksum();
  /**
   *
   *
   * <pre>
   * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
   * container.
   * </pre>
   *
   * <code>string checksum = 1;</code>
   */
  com.google.protobuf.ByteString getChecksumBytes();

  /**
   *
   *
   * <pre>
   * Artifact ID, if any; for container images, this will be a URL by digest
   * like `gcr.io/projectID/imagename&#64;sha256:123456`.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Artifact ID, if any; for container images, this will be a URL by digest
   * like `gcr.io/projectID/imagename&#64;sha256:123456`.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   */
  java.util.List<java.lang.String> getNamesList();
  /**
   *
   *
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   */
  int getNamesCount();
  /**
   *
   *
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   */
  java.lang.String getNames(int index);
  /**
   *
   *
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   */
  com.google.protobuf.ByteString getNamesBytes(int index);
}