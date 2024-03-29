//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.cashgate.common.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.NullableStringAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.nullable
import com.apollographql.apollo3.api.obj
import com.cashgate.common.RegisterMutation
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public object RegisterMutation_ResponseAdapter {
  public object Data : Adapter<RegisterMutation.Data> {
    public val RESPONSE_NAMES: List<String> = listOf("register")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        RegisterMutation.Data {
      var _register: RegisterMutation.Register? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _register = Register.obj().nullable().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return RegisterMutation.Data(
        register = _register
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: RegisterMutation.Data,
    ): Unit {
      writer.name("register")
      Register.obj().nullable().toJson(writer, customScalarAdapters, value.register)
    }
  }

  public object Register : Adapter<RegisterMutation.Register> {
    public val RESPONSE_NAMES: List<String> = listOf("token", "message")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        RegisterMutation.Register {
      var _token: String? = null
      var _message: String? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _token = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          1 -> _message = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return RegisterMutation.Register(
        token = _token,
        message = _message
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: RegisterMutation.Register,
    ): Unit {
      writer.name("token")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.token)

      writer.name("message")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.message)
    }
  }
}
