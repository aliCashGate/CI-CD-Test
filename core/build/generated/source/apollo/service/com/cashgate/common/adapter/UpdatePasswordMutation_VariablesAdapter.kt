//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.cashgate.common.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.StringAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.cashgate.common.UpdatePasswordMutation
import kotlin.IllegalStateException
import kotlin.Unit

public object UpdatePasswordMutation_VariablesAdapter : Adapter<UpdatePasswordMutation> {
  public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
      UpdatePasswordMutation = throw IllegalStateException("Input type used in output position")

  public override fun toJson(
    writer: JsonWriter,
    customScalarAdapters: CustomScalarAdapters,
    `value`: UpdatePasswordMutation,
  ): Unit {
    writer.name("password")
    StringAdapter.toJson(writer, customScalarAdapters, value.password)
  }
}
