/*
 * Copyright 2020 Google LLC
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
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

public final class SpannerProto {
  private SpannerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_CreateSessionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_CreateSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_BatchCreateSessionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_BatchCreateSessionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_BatchCreateSessionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_BatchCreateSessionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_Session_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_Session_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_Session_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_Session_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_GetSessionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_GetSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ListSessionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ListSessionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ListSessionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ListSessionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_DeleteSessionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_DeleteSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_RequestOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_RequestOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ExecuteSqlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ExecuteSqlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ExecuteSqlRequest_QueryOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ExecuteSqlRequest_QueryOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ExecuteSqlRequest_ParamTypesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ExecuteSqlRequest_ParamTypesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ExecuteBatchDmlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ExecuteBatchDmlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ExecuteBatchDmlRequest_Statement_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ExecuteBatchDmlRequest_Statement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ExecuteBatchDmlRequest_Statement_ParamTypesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ExecuteBatchDmlRequest_Statement_ParamTypesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ExecuteBatchDmlResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ExecuteBatchDmlResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_PartitionOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_PartitionOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_PartitionQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_PartitionQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_PartitionQueryRequest_ParamTypesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_PartitionQueryRequest_ParamTypesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_PartitionReadRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_PartitionReadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_Partition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_Partition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_PartitionResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_PartitionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ReadRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ReadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_BeginTransactionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_BeginTransactionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_CommitRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_CommitRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_RollbackRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_RollbackRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\037google/spanner/v1/spanner.proto\022\021googl"
          + "e.spanner.v1\032\034google/api/annotations.pro"
          + "to\032\027google/api/client.proto\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032\033google/protobuf/empty.proto\032\034go"
          + "ogle/protobuf/struct.proto\032\037google/proto"
          + "buf/timestamp.proto\032\027google/rpc/status.p"
          + "roto\032\'google/spanner/v1/commit_response."
          + "proto\032\034google/spanner/v1/keys.proto\032 goo"
          + "gle/spanner/v1/mutation.proto\032\"google/sp"
          + "anner/v1/result_set.proto\032#google/spanne"
          + "r/v1/transaction.proto\032\034google/spanner/v"
          + "1/type.proto\"\203\001\n\024CreateSessionRequest\0229\n"
          + "\010database\030\001 \001(\tB\'\340A\002\372A!\n\037spanner.googlea"
          + "pis.com/Database\0220\n\007session\030\002 \001(\0132\032.goog"
          + "le.spanner.v1.SessionB\003\340A\002\"\251\001\n\032BatchCrea"
          + "teSessionsRequest\0229\n\010database\030\001 \001(\tB\'\340A\002"
          + "\372A!\n\037spanner.googleapis.com/Database\0224\n\020"
          + "session_template\030\002 \001(\0132\032.google.spanner."
          + "v1.Session\022\032\n\rsession_count\030\003 \001(\005B\003\340A\002\"J"
          + "\n\033BatchCreateSessionsResponse\022+\n\007session"
          + "\030\001 \003(\0132\032.google.spanner.v1.Session\"\363\002\n\007S"
          + "ession\022\021\n\004name\030\001 \001(\tB\003\340A\003\0226\n\006labels\030\002 \003("
          + "\0132&.google.spanner.v1.Session.LabelsEntr"
          + "y\0224\n\013create_time\030\003 \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003\022B\n\031approximate_last_use_"
          + "time\030\004 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value"
          + "\030\002 \001(\t:\0028\001:t\352Aq\n\036spanner.googleapis.com/"
          + "Session\022Oprojects/{project}/instances/{i"
          + "nstance}/databases/{database}/sessions/{"
          + "session}\"I\n\021GetSessionRequest\0224\n\004name\030\001 "
          + "\001(\tB&\340A\002\372A \n\036spanner.googleapis.com/Sess"
          + "ion\"\207\001\n\023ListSessionsRequest\0229\n\010database\030"
          + "\001 \001(\tB\'\340A\002\372A!\n\037spanner.googleapis.com/Da"
          + "tabase\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030"
          + "\003 \001(\t\022\016\n\006filter\030\004 \001(\t\"]\n\024ListSessionsRes"
          + "ponse\022,\n\010sessions\030\001 \003(\0132\032.google.spanner"
          + ".v1.Session\022\027\n\017next_page_token\030\002 \001(\t\"L\n\024"
          + "DeleteSessionRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372"
          + "A \n\036spanner.googleapis.com/Session\"\334\001\n\016R"
          + "equestOptions\022<\n\010priority\030\001 \001(\0162*.google"
          + ".spanner.v1.RequestOptions.Priority\022\023\n\013r"
          + "equest_tag\030\002 \001(\t\022\027\n\017transaction_tag\030\003 \001("
          + "\t\"^\n\010Priority\022\030\n\024PRIORITY_UNSPECIFIED\020\000\022"
          + "\020\n\014PRIORITY_LOW\020\001\022\023\n\017PRIORITY_MEDIUM\020\002\022\021"
          + "\n\rPRIORITY_HIGH\020\003\"\344\005\n\021ExecuteSqlRequest\022"
          + "7\n\007session\030\001 \001(\tB&\340A\002\372A \n\036spanner.google"
          + "apis.com/Session\022;\n\013transaction\030\002 \001(\0132&."
          + "google.spanner.v1.TransactionSelector\022\020\n"
          + "\003sql\030\003 \001(\tB\003\340A\002\022\'\n\006params\030\004 \001(\0132\027.google"
          + ".protobuf.Struct\022I\n\013param_types\030\005 \003(\01324."
          + "google.spanner.v1.ExecuteSqlRequest.Para"
          + "mTypesEntry\022\024\n\014resume_token\030\006 \001(\014\022B\n\nque"
          + "ry_mode\030\007 \001(\0162..google.spanner.v1.Execut"
          + "eSqlRequest.QueryMode\022\027\n\017partition_token"
          + "\030\010 \001(\014\022\r\n\005seqno\030\t \001(\003\022H\n\rquery_options\030\n"
          + " \001(\01321.google.spanner.v1.ExecuteSqlReque"
          + "st.QueryOptions\022:\n\017request_options\030\013 \001(\013"
          + "2!.google.spanner.v1.RequestOptions\032O\n\014Q"
          + "ueryOptions\022\031\n\021optimizer_version\030\001 \001(\t\022$"
          + "\n\034optimizer_statistics_package\030\002 \001(\t\032J\n\017"
          + "ParamTypesEntry\022\013\n\003key\030\001 \001(\t\022&\n\005value\030\002 "
          + "\001(\0132\027.google.spanner.v1.Type:\0028\001\".\n\tQuer"
          + "yMode\022\n\n\006NORMAL\020\000\022\010\n\004PLAN\020\001\022\013\n\007PROFILE\020\002"
          + "\"\240\004\n\026ExecuteBatchDmlRequest\0227\n\007session\030\001"
          + " \001(\tB&\340A\002\372A \n\036spanner.googleapis.com/Ses"
          + "sion\022@\n\013transaction\030\002 \001(\0132&.google.spann"
          + "er.v1.TransactionSelectorB\003\340A\002\022L\n\nstatem"
          + "ents\030\003 \003(\01323.google.spanner.v1.ExecuteBa"
          + "tchDmlRequest.StatementB\003\340A\002\022\022\n\005seqno\030\004 "
          + "\001(\003B\003\340A\002\022:\n\017request_options\030\005 \001(\0132!.goog"
          + "le.spanner.v1.RequestOptions\032\354\001\n\tStateme"
          + "nt\022\020\n\003sql\030\001 \001(\tB\003\340A\002\022\'\n\006params\030\002 \001(\0132\027.g"
          + "oogle.protobuf.Struct\022X\n\013param_types\030\003 \003"
          + "(\0132C.google.spanner.v1.ExecuteBatchDmlRe"
          + "quest.Statement.ParamTypesEntry\032J\n\017Param"
          + "TypesEntry\022\013\n\003key\030\001 \001(\t\022&\n\005value\030\002 \001(\0132\027"
          + ".google.spanner.v1.Type:\0028\001\"p\n\027ExecuteBa"
          + "tchDmlResponse\0221\n\013result_sets\030\001 \003(\0132\034.go"
          + "ogle.spanner.v1.ResultSet\022\"\n\006status\030\002 \001("
          + "\0132\022.google.rpc.Status\"H\n\020PartitionOption"
          + "s\022\034\n\024partition_size_bytes\030\001 \001(\003\022\026\n\016max_p"
          + "artitions\030\002 \001(\003\"\243\003\n\025PartitionQueryReques"
          + "t\0227\n\007session\030\001 \001(\tB&\340A\002\372A \n\036spanner.goog"
          + "leapis.com/Session\022;\n\013transaction\030\002 \001(\0132"
          + "&.google.spanner.v1.TransactionSelector\022"
          + "\020\n\003sql\030\003 \001(\tB\003\340A\002\022\'\n\006params\030\004 \001(\0132\027.goog"
          + "le.protobuf.Struct\022M\n\013param_types\030\005 \003(\0132"
          + "8.google.spanner.v1.PartitionQueryReques"
          + "t.ParamTypesEntry\022>\n\021partition_options\030\006"
          + " \001(\0132#.google.spanner.v1.PartitionOption"
          + "s\032J\n\017ParamTypesEntry\022\013\n\003key\030\001 \001(\t\022&\n\005val"
          + "ue\030\002 \001(\0132\027.google.spanner.v1.Type:\0028\001\"\261\002"
          + "\n\024PartitionReadRequest\0227\n\007session\030\001 \001(\tB"
          + "&\340A\002\372A \n\036spanner.googleapis.com/Session\022"
          + ";\n\013transaction\030\002 \001(\0132&.google.spanner.v1"
          + ".TransactionSelector\022\022\n\005table\030\003 \001(\tB\003\340A\002"
          + "\022\r\n\005index\030\004 \001(\t\022\017\n\007columns\030\005 \003(\t\022/\n\007key_"
          + "set\030\006 \001(\0132\031.google.spanner.v1.KeySetB\003\340A"
          + "\002\022>\n\021partition_options\030\t \001(\0132#.google.sp"
          + "anner.v1.PartitionOptions\"$\n\tPartition\022\027"
          + "\n\017partition_token\030\001 \001(\014\"z\n\021PartitionResp"
          + "onse\0220\n\npartitions\030\001 \003(\0132\034.google.spanne"
          + "r.v1.Partition\0223\n\013transaction\030\002 \001(\0132\036.go"
          + "ogle.spanner.v1.Transaction\"\347\002\n\013ReadRequ"
          + "est\0227\n\007session\030\001 \001(\tB&\340A\002\372A \n\036spanner.go"
          + "ogleapis.com/Session\022;\n\013transaction\030\002 \001("
          + "\0132&.google.spanner.v1.TransactionSelecto"
          + "r\022\022\n\005table\030\003 \001(\tB\003\340A\002\022\r\n\005index\030\004 \001(\t\022\024\n\007"
          + "columns\030\005 \003(\tB\003\340A\002\022/\n\007key_set\030\006 \001(\0132\031.go"
          + "ogle.spanner.v1.KeySetB\003\340A\002\022\r\n\005limit\030\010 \001"
          + "(\003\022\024\n\014resume_token\030\t \001(\014\022\027\n\017partition_to"
          + "ken\030\n \001(\014\022:\n\017request_options\030\013 \001(\0132!.goo"
          + "gle.spanner.v1.RequestOptions\"\313\001\n\027BeginT"
          + "ransactionRequest\0227\n\007session\030\001 \001(\tB&\340A\002\372"
          + "A \n\036spanner.googleapis.com/Session\022;\n\007op"
          + "tions\030\002 \001(\0132%.google.spanner.v1.Transact"
          + "ionOptionsB\003\340A\002\022:\n\017request_options\030\003 \001(\013"
          + "2!.google.spanner.v1.RequestOptions\"\303\002\n\r"
          + "CommitRequest\0227\n\007session\030\001 \001(\tB&\340A\002\372A \n\036"
          + "spanner.googleapis.com/Session\022\030\n\016transa"
          + "ction_id\030\002 \001(\014H\000\022G\n\026single_use_transacti"
          + "on\030\003 \001(\0132%.google.spanner.v1.Transaction"
          + "OptionsH\000\022.\n\tmutations\030\004 \003(\0132\033.google.sp"
          + "anner.v1.Mutation\022\033\n\023return_commit_stats"
          + "\030\005 \001(\010\022:\n\017request_options\030\006 \001(\0132!.google"
          + ".spanner.v1.RequestOptionsB\r\n\013transactio"
          + "n\"g\n\017RollbackRequest\0227\n\007session\030\001 \001(\tB&\340"
          + "A\002\372A \n\036spanner.googleapis.com/Session\022\033\n"
          + "\016transaction_id\030\002 \001(\014B\003\340A\0022\300\026\n\007Spanner\022\246"
          + "\001\n\rCreateSession\022\'.google.spanner.v1.Cre"
          + "ateSessionRequest\032\032.google.spanner.v1.Se"
          + "ssion\"P\202\323\344\223\002?\":/v1/{database=projects/*/"
          + "instances/*/databases/*}/sessions:\001*\332A\010d"
          + "atabase\022\340\001\n\023BatchCreateSessions\022-.google"
          + ".spanner.v1.BatchCreateSessionsRequest\032."
          + ".google.spanner.v1.BatchCreateSessionsRe"
          + "sponse\"j\202\323\344\223\002K\"F/v1/{database=projects/*"
          + "/instances/*/databases/*}/sessions:batch"
          + "Create:\001*\332A\026database,session_count\022\227\001\n\nG"
          + "etSession\022$.google.spanner.v1.GetSession"
          + "Request\032\032.google.spanner.v1.Session\"G\202\323\344"
          + "\223\002:\0228/v1/{name=projects/*/instances/*/da"
          + "tabases/*/sessions/*}\332A\004name\022\256\001\n\014ListSes"
          + "sions\022&.google.spanner.v1.ListSessionsRe"
          + "quest\032\'.google.spanner.v1.ListSessionsRe"
          + "sponse\"M\202\323\344\223\002<\022:/v1/{database=projects/*"
          + "/instances/*/databases/*}/sessions\332A\010dat"
          + "abase\022\231\001\n\rDeleteSession\022\'.google.spanner"
          + ".v1.DeleteSessionRequest\032\026.google.protob"
          + "uf.Empty\"G\202\323\344\223\002:*8/v1/{name=projects/*/i"
          + "nstances/*/databases/*/sessions/*}\332A\004nam"
          + "e\022\243\001\n\nExecuteSql\022$.google.spanner.v1.Exe"
          + "cuteSqlRequest\032\034.google.spanner.v1.Resul"
          + "tSet\"Q\202\323\344\223\002K\"F/v1/{session=projects/*/in"
          + "stances/*/databases/*/sessions/*}:execut"
          + "eSql:\001*\022\276\001\n\023ExecuteStreamingSql\022$.google"
          + ".spanner.v1.ExecuteSqlRequest\032#.google.s"
          + "panner.v1.PartialResultSet\"Z\202\323\344\223\002T\"O/v1/"
          + "{session=projects/*/instances/*/database"
          + "s/*/sessions/*}:executeStreamingSql:\001*0\001"
          + "\022\300\001\n\017ExecuteBatchDml\022).google.spanner.v1"
          + ".ExecuteBatchDmlRequest\032*.google.spanner"
          + ".v1.ExecuteBatchDmlResponse\"V\202\323\344\223\002P\"K/v1"
          + "/{session=projects/*/instances/*/databas"
          + "es/*/sessions/*}:executeBatchDml:\001*\022\221\001\n\004"
          + "Read\022\036.google.spanner.v1.ReadRequest\032\034.g"
          + "oogle.spanner.v1.ResultSet\"K\202\323\344\223\002E\"@/v1/"
          + "{session=projects/*/instances/*/database"
          + "s/*/sessions/*}:read:\001*\022\254\001\n\rStreamingRea"
          + "d\022\036.google.spanner.v1.ReadRequest\032#.goog"
          + "le.spanner.v1.PartialResultSet\"T\202\323\344\223\002N\"I"
          + "/v1/{session=projects/*/instances/*/data"
          + "bases/*/sessions/*}:streamingRead:\001*0\001\022\311"
          + "\001\n\020BeginTransaction\022*.google.spanner.v1."
          + "BeginTransactionRequest\032\036.google.spanner"
          + ".v1.Transaction\"i\202\323\344\223\002Q\"L/v1/{session=pr"
          + "ojects/*/instances/*/databases/*/session"
          + "s/*}:beginTransaction:\001*\332A\017session,optio"
          + "ns\022\353\001\n\006Commit\022 .google.spanner.v1.Commit"
          + "Request\032!.google.spanner.v1.CommitRespon"
          + "se\"\233\001\202\323\344\223\002G\"B/v1/{session=projects/*/ins"
          + "tances/*/databases/*/sessions/*}:commit:"
          + "\001*\332A session,transaction_id,mutations\332A("
          + "session,single_use_transaction,mutations"
          + "\022\260\001\n\010Rollback\022\".google.spanner.v1.Rollba"
          + "ckRequest\032\026.google.protobuf.Empty\"h\202\323\344\223\002"
          + "I\"D/v1/{session=projects/*/instances/*/d"
          + "atabases/*/sessions/*}:rollback:\001*\332A\026ses"
          + "sion,transaction_id\022\267\001\n\016PartitionQuery\022("
          + ".google.spanner.v1.PartitionQueryRequest"
          + "\032$.google.spanner.v1.PartitionResponse\"U"
          + "\202\323\344\223\002O\"J/v1/{session=projects/*/instance"
          + "s/*/databases/*/sessions/*}:partitionQue"
          + "ry:\001*\022\264\001\n\rPartitionRead\022\'.google.spanner"
          + ".v1.PartitionReadRequest\032$.google.spanne"
          + "r.v1.PartitionResponse\"T\202\323\344\223\002N\"I/v1/{ses"
          + "sion=projects/*/instances/*/databases/*/"
          + "sessions/*}:partitionRead:\001*\032w\312A\026spanner"
          + ".googleapis.com\322A[https://www.googleapis"
          + ".com/auth/cloud-platform,https://www.goo"
          + "gleapis.com/auth/spanner.dataB\224\002\n\025com.go"
          + "ogle.spanner.v1B\014SpannerProtoP\001Z8google."
          + "golang.org/genproto/googleapis/spanner/v"
          + "1;spanner\252\002\027Google.Cloud.Spanner.V1\312\002\027Go"
          + "ogle\\Cloud\\Spanner\\V1\352\002\032Google::Cloud::S"
          + "panner::V1\352A_\n\037spanner.googleapis.com/Da"
          + "tabase\022<projects/{project}/instances/{in"
          + "stance}/databases/{database}P\010b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.spanner.v1.CommitResponseProto.getDescriptor(),
              com.google.spanner.v1.KeysProto.getDescriptor(),
              com.google.spanner.v1.MutationProto.getDescriptor(),
              com.google.spanner.v1.ResultSetProto.getDescriptor(),
              com.google.spanner.v1.TransactionProto.getDescriptor(),
              com.google.spanner.v1.TypeProto.getDescriptor(),
            });
    internal_static_google_spanner_v1_CreateSessionRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_spanner_v1_CreateSessionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_CreateSessionRequest_descriptor,
            new java.lang.String[] {
              "Database", "Session",
            });
    internal_static_google_spanner_v1_BatchCreateSessionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_spanner_v1_BatchCreateSessionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_BatchCreateSessionsRequest_descriptor,
            new java.lang.String[] {
              "Database", "SessionTemplate", "SessionCount",
            });
    internal_static_google_spanner_v1_BatchCreateSessionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_spanner_v1_BatchCreateSessionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_BatchCreateSessionsResponse_descriptor,
            new java.lang.String[] {
              "Session",
            });
    internal_static_google_spanner_v1_Session_descriptor = getDescriptor().getMessageTypes().get(3);
    internal_static_google_spanner_v1_Session_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_Session_descriptor,
            new java.lang.String[] {
              "Name", "Labels", "CreateTime", "ApproximateLastUseTime",
            });
    internal_static_google_spanner_v1_Session_LabelsEntry_descriptor =
        internal_static_google_spanner_v1_Session_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_v1_Session_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_Session_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_spanner_v1_GetSessionRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_spanner_v1_GetSessionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_GetSessionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_spanner_v1_ListSessionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_spanner_v1_ListSessionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ListSessionsRequest_descriptor,
            new java.lang.String[] {
              "Database", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_spanner_v1_ListSessionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_spanner_v1_ListSessionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ListSessionsResponse_descriptor,
            new java.lang.String[] {
              "Sessions", "NextPageToken",
            });
    internal_static_google_spanner_v1_DeleteSessionRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_spanner_v1_DeleteSessionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_DeleteSessionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_spanner_v1_RequestOptions_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_spanner_v1_RequestOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_RequestOptions_descriptor,
            new java.lang.String[] {
              "Priority", "RequestTag", "TransactionTag",
            });
    internal_static_google_spanner_v1_ExecuteSqlRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_spanner_v1_ExecuteSqlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ExecuteSqlRequest_descriptor,
            new java.lang.String[] {
              "Session",
              "Transaction",
              "Sql",
              "Params",
              "ParamTypes",
              "ResumeToken",
              "QueryMode",
              "PartitionToken",
              "Seqno",
              "QueryOptions",
              "RequestOptions",
            });
    internal_static_google_spanner_v1_ExecuteSqlRequest_QueryOptions_descriptor =
        internal_static_google_spanner_v1_ExecuteSqlRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_v1_ExecuteSqlRequest_QueryOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ExecuteSqlRequest_QueryOptions_descriptor,
            new java.lang.String[] {
              "OptimizerVersion", "OptimizerStatisticsPackage",
            });
    internal_static_google_spanner_v1_ExecuteSqlRequest_ParamTypesEntry_descriptor =
        internal_static_google_spanner_v1_ExecuteSqlRequest_descriptor.getNestedTypes().get(1);
    internal_static_google_spanner_v1_ExecuteSqlRequest_ParamTypesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ExecuteSqlRequest_ParamTypesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_spanner_v1_ExecuteBatchDmlRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_spanner_v1_ExecuteBatchDmlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ExecuteBatchDmlRequest_descriptor,
            new java.lang.String[] {
              "Session", "Transaction", "Statements", "Seqno", "RequestOptions",
            });
    internal_static_google_spanner_v1_ExecuteBatchDmlRequest_Statement_descriptor =
        internal_static_google_spanner_v1_ExecuteBatchDmlRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_v1_ExecuteBatchDmlRequest_Statement_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ExecuteBatchDmlRequest_Statement_descriptor,
            new java.lang.String[] {
              "Sql", "Params", "ParamTypes",
            });
    internal_static_google_spanner_v1_ExecuteBatchDmlRequest_Statement_ParamTypesEntry_descriptor =
        internal_static_google_spanner_v1_ExecuteBatchDmlRequest_Statement_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_spanner_v1_ExecuteBatchDmlRequest_Statement_ParamTypesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ExecuteBatchDmlRequest_Statement_ParamTypesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_spanner_v1_ExecuteBatchDmlResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_spanner_v1_ExecuteBatchDmlResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ExecuteBatchDmlResponse_descriptor,
            new java.lang.String[] {
              "ResultSets", "Status",
            });
    internal_static_google_spanner_v1_PartitionOptions_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_spanner_v1_PartitionOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_PartitionOptions_descriptor,
            new java.lang.String[] {
              "PartitionSizeBytes", "MaxPartitions",
            });
    internal_static_google_spanner_v1_PartitionQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_spanner_v1_PartitionQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_PartitionQueryRequest_descriptor,
            new java.lang.String[] {
              "Session", "Transaction", "Sql", "Params", "ParamTypes", "PartitionOptions",
            });
    internal_static_google_spanner_v1_PartitionQueryRequest_ParamTypesEntry_descriptor =
        internal_static_google_spanner_v1_PartitionQueryRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_v1_PartitionQueryRequest_ParamTypesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_PartitionQueryRequest_ParamTypesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_spanner_v1_PartitionReadRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_spanner_v1_PartitionReadRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_PartitionReadRequest_descriptor,
            new java.lang.String[] {
              "Session", "Transaction", "Table", "Index", "Columns", "KeySet", "PartitionOptions",
            });
    internal_static_google_spanner_v1_Partition_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_spanner_v1_Partition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_Partition_descriptor,
            new java.lang.String[] {
              "PartitionToken",
            });
    internal_static_google_spanner_v1_PartitionResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_spanner_v1_PartitionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_PartitionResponse_descriptor,
            new java.lang.String[] {
              "Partitions", "Transaction",
            });
    internal_static_google_spanner_v1_ReadRequest_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_spanner_v1_ReadRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ReadRequest_descriptor,
            new java.lang.String[] {
              "Session",
              "Transaction",
              "Table",
              "Index",
              "Columns",
              "KeySet",
              "Limit",
              "ResumeToken",
              "PartitionToken",
              "RequestOptions",
            });
    internal_static_google_spanner_v1_BeginTransactionRequest_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_spanner_v1_BeginTransactionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_BeginTransactionRequest_descriptor,
            new java.lang.String[] {
              "Session", "Options", "RequestOptions",
            });
    internal_static_google_spanner_v1_CommitRequest_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_spanner_v1_CommitRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_CommitRequest_descriptor,
            new java.lang.String[] {
              "Session",
              "TransactionId",
              "SingleUseTransaction",
              "Mutations",
              "ReturnCommitStats",
              "RequestOptions",
              "Transaction",
            });
    internal_static_google_spanner_v1_RollbackRequest_descriptor =
        getDescriptor().getMessageTypes().get(20);
    internal_static_google_spanner_v1_RollbackRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_RollbackRequest_descriptor,
            new java.lang.String[] {
              "Session", "TransactionId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.spanner.v1.CommitResponseProto.getDescriptor();
    com.google.spanner.v1.KeysProto.getDescriptor();
    com.google.spanner.v1.MutationProto.getDescriptor();
    com.google.spanner.v1.ResultSetProto.getDescriptor();
    com.google.spanner.v1.TransactionProto.getDescriptor();
    com.google.spanner.v1.TypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
