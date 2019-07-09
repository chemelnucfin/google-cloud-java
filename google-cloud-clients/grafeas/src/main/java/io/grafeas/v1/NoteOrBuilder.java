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
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

public interface NoteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Note)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the note in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the note in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A one sentence description of this note.
   * </pre>
   *
   * <code>string short_description = 2;</code>
   */
  java.lang.String getShortDescription();
  /**
   *
   *
   * <pre>
   * A one sentence description of this note.
   * </pre>
   *
   * <code>string short_description = 2;</code>
   */
  com.google.protobuf.ByteString getShortDescriptionBytes();

  /**
   *
   *
   * <pre>
   * A detailed description of this note.
   * </pre>
   *
   * <code>string long_description = 3;</code>
   */
  java.lang.String getLongDescription();
  /**
   *
   *
   * <pre>
   * A detailed description of this note.
   * </pre>
   *
   * <code>string long_description = 3;</code>
   */
  com.google.protobuf.ByteString getLongDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The type of analysis. This field can be used as a filter in
   * list requests.
   * </pre>
   *
   * <code>.grafeas.v1.NoteKind kind = 4;</code>
   */
  int getKindValue();
  /**
   *
   *
   * <pre>
   * Output only. The type of analysis. This field can be used as a filter in
   * list requests.
   * </pre>
   *
   * <code>.grafeas.v1.NoteKind kind = 4;</code>
   */
  io.grafeas.v1.NoteKind getKind();

  /**
   *
   *
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.RelatedUrl related_url = 5;</code>
   */
  java.util.List<io.grafeas.v1.RelatedUrl> getRelatedUrlList();
  /**
   *
   *
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.RelatedUrl related_url = 5;</code>
   */
  io.grafeas.v1.RelatedUrl getRelatedUrl(int index);
  /**
   *
   *
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.RelatedUrl related_url = 5;</code>
   */
  int getRelatedUrlCount();
  /**
   *
   *
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.RelatedUrl related_url = 5;</code>
   */
  java.util.List<? extends io.grafeas.v1.RelatedUrlOrBuilder> getRelatedUrlOrBuilderList();
  /**
   *
   *
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.RelatedUrl related_url = 5;</code>
   */
  io.grafeas.v1.RelatedUrlOrBuilder getRelatedUrlOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Time of expiration for this note. Empty if note does not expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   */
  boolean hasExpirationTime();
  /**
   *
   *
   * <pre>
   * Time of expiration for this note. Empty if note does not expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   */
  com.google.protobuf.Timestamp getExpirationTime();
  /**
   *
   *
   * <pre>
   * Time of expiration for this note. Empty if note does not expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time this note was created. This field can be used as a
   * filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this note was created. This field can be used as a
   * filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this note was created. This field can be used as a
   * filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time this note was last updated. This field can be used as
   * a filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8;</code>
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this note was last updated. This field can be used as
   * a filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8;</code>
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this note was last updated. This field can be used as
   * a filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Other notes related to this note.
   * </pre>
   *
   * <code>repeated string related_note_names = 9;</code>
   */
  java.util.List<java.lang.String> getRelatedNoteNamesList();
  /**
   *
   *
   * <pre>
   * Other notes related to this note.
   * </pre>
   *
   * <code>repeated string related_note_names = 9;</code>
   */
  int getRelatedNoteNamesCount();
  /**
   *
   *
   * <pre>
   * Other notes related to this note.
   * </pre>
   *
   * <code>repeated string related_note_names = 9;</code>
   */
  java.lang.String getRelatedNoteNames(int index);
  /**
   *
   *
   * <pre>
   * Other notes related to this note.
   * </pre>
   *
   * <code>repeated string related_note_names = 9;</code>
   */
  com.google.protobuf.ByteString getRelatedNoteNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * A note describing a package vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1.VulnerabilityNote vulnerability = 10;</code>
   */
  boolean hasVulnerability();
  /**
   *
   *
   * <pre>
   * A note describing a package vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1.VulnerabilityNote vulnerability = 10;</code>
   */
  io.grafeas.v1.VulnerabilityNote getVulnerability();
  /**
   *
   *
   * <pre>
   * A note describing a package vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1.VulnerabilityNote vulnerability = 10;</code>
   */
  io.grafeas.v1.VulnerabilityNoteOrBuilder getVulnerabilityOrBuilder();

  /**
   *
   *
   * <pre>
   * A note describing build provenance for a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1.BuildNote build = 11;</code>
   */
  boolean hasBuild();
  /**
   *
   *
   * <pre>
   * A note describing build provenance for a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1.BuildNote build = 11;</code>
   */
  io.grafeas.v1.BuildNote getBuild();
  /**
   *
   *
   * <pre>
   * A note describing build provenance for a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1.BuildNote build = 11;</code>
   */
  io.grafeas.v1.BuildNoteOrBuilder getBuildOrBuilder();

  /**
   *
   *
   * <pre>
   * A note describing a base image.
   * </pre>
   *
   * <code>.grafeas.v1.ImageNote image = 12;</code>
   */
  boolean hasImage();
  /**
   *
   *
   * <pre>
   * A note describing a base image.
   * </pre>
   *
   * <code>.grafeas.v1.ImageNote image = 12;</code>
   */
  io.grafeas.v1.ImageNote getImage();
  /**
   *
   *
   * <pre>
   * A note describing a base image.
   * </pre>
   *
   * <code>.grafeas.v1.ImageNote image = 12;</code>
   */
  io.grafeas.v1.ImageNoteOrBuilder getImageOrBuilder();

  /**
   *
   *
   * <pre>
   * A note describing a package hosted by various package managers.
   * </pre>
   *
   * <code>.grafeas.v1.PackageNote package = 13;</code>
   */
  boolean hasPackage();
  /**
   *
   *
   * <pre>
   * A note describing a package hosted by various package managers.
   * </pre>
   *
   * <code>.grafeas.v1.PackageNote package = 13;</code>
   */
  io.grafeas.v1.PackageNote getPackage();
  /**
   *
   *
   * <pre>
   * A note describing a package hosted by various package managers.
   * </pre>
   *
   * <code>.grafeas.v1.PackageNote package = 13;</code>
   */
  io.grafeas.v1.PackageNoteOrBuilder getPackageOrBuilder();

  /**
   *
   *
   * <pre>
   * A note describing something that can be deployed.
   * </pre>
   *
   * <code>.grafeas.v1.DeploymentNote deployment = 14;</code>
   */
  boolean hasDeployment();
  /**
   *
   *
   * <pre>
   * A note describing something that can be deployed.
   * </pre>
   *
   * <code>.grafeas.v1.DeploymentNote deployment = 14;</code>
   */
  io.grafeas.v1.DeploymentNote getDeployment();
  /**
   *
   *
   * <pre>
   * A note describing something that can be deployed.
   * </pre>
   *
   * <code>.grafeas.v1.DeploymentNote deployment = 14;</code>
   */
  io.grafeas.v1.DeploymentNoteOrBuilder getDeploymentOrBuilder();

  /**
   *
   *
   * <pre>
   * A note describing the initial analysis of a resource.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryNote discovery = 15;</code>
   */
  boolean hasDiscovery();
  /**
   *
   *
   * <pre>
   * A note describing the initial analysis of a resource.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryNote discovery = 15;</code>
   */
  io.grafeas.v1.DiscoveryNote getDiscovery();
  /**
   *
   *
   * <pre>
   * A note describing the initial analysis of a resource.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryNote discovery = 15;</code>
   */
  io.grafeas.v1.DiscoveryNoteOrBuilder getDiscoveryOrBuilder();

  /**
   *
   *
   * <pre>
   * A note describing an attestation role.
   * </pre>
   *
   * <code>.grafeas.v1.AttestationNote attestation = 16;</code>
   */
  boolean hasAttestation();
  /**
   *
   *
   * <pre>
   * A note describing an attestation role.
   * </pre>
   *
   * <code>.grafeas.v1.AttestationNote attestation = 16;</code>
   */
  io.grafeas.v1.AttestationNote getAttestation();
  /**
   *
   *
   * <pre>
   * A note describing an attestation role.
   * </pre>
   *
   * <code>.grafeas.v1.AttestationNote attestation = 16;</code>
   */
  io.grafeas.v1.AttestationNoteOrBuilder getAttestationOrBuilder();

  public io.grafeas.v1.Note.TypeCase getTypeCase();
}