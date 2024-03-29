//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.cashgate.common.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.NullableIntAdapter
import com.apollographql.apollo3.api.NullableStringAdapter
import com.apollographql.apollo3.api.StringAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.list
import com.apollographql.apollo3.api.nullable
import com.apollographql.apollo3.api.obj
import com.cashgate.common.FetchFormQuery
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public object FetchFormQuery_ResponseAdapter {
  public object Data : Adapter<FetchFormQuery.Data> {
    public val RESPONSE_NAMES: List<String> = listOf("fetchForm")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        FetchFormQuery.Data {
      var _fetchForm: List<FetchFormQuery.FetchForm?>? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _fetchForm = FetchForm.obj().nullable().list().nullable().fromJson(reader,
              customScalarAdapters)
          else -> break
        }
      }

      return FetchFormQuery.Data(
        fetchForm = _fetchForm
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: FetchFormQuery.Data,
    ): Unit {
      writer.name("fetchForm")
      FetchForm.obj().nullable().list().nullable().toJson(writer, customScalarAdapters,
          value.fetchForm)
    }
  }

  public object FetchForm : Adapter<FetchFormQuery.FetchForm> {
    public val RESPONSE_NAMES: List<String> = listOf("category_id", "field_extras", "field_id",
        "field_name", "field_order", "field_request_type", "field_size", "field_type",
        "field_validation", "id", "steps")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        FetchFormQuery.FetchForm {
      var _category_id: Int? = null
      var _field_extras: String? = null
      var _field_id: Int? = null
      var _field_name: String? = null
      var _field_order: Int? = null
      var _field_request_type: String? = null
      var _field_size: Int? = null
      var _field_type: String? = null
      var _field_validation: String? = null
      var _id: String? = null
      var _steps: Int? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _category_id = NullableIntAdapter.fromJson(reader, customScalarAdapters)
          1 -> _field_extras = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          2 -> _field_id = NullableIntAdapter.fromJson(reader, customScalarAdapters)
          3 -> _field_name = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          4 -> _field_order = NullableIntAdapter.fromJson(reader, customScalarAdapters)
          5 -> _field_request_type = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          6 -> _field_size = NullableIntAdapter.fromJson(reader, customScalarAdapters)
          7 -> _field_type = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          8 -> _field_validation = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          9 -> _id = StringAdapter.fromJson(reader, customScalarAdapters)
          10 -> _steps = NullableIntAdapter.fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return FetchFormQuery.FetchForm(
        category_id = _category_id,
        field_extras = _field_extras,
        field_id = _field_id,
        field_name = _field_name,
        field_order = _field_order,
        field_request_type = _field_request_type,
        field_size = _field_size,
        field_type = _field_type,
        field_validation = _field_validation,
        id = _id!!,
        steps = _steps
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: FetchFormQuery.FetchForm,
    ): Unit {
      writer.name("category_id")
      NullableIntAdapter.toJson(writer, customScalarAdapters, value.category_id)

      writer.name("field_extras")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.field_extras)

      writer.name("field_id")
      NullableIntAdapter.toJson(writer, customScalarAdapters, value.field_id)

      writer.name("field_name")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.field_name)

      writer.name("field_order")
      NullableIntAdapter.toJson(writer, customScalarAdapters, value.field_order)

      writer.name("field_request_type")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.field_request_type)

      writer.name("field_size")
      NullableIntAdapter.toJson(writer, customScalarAdapters, value.field_size)

      writer.name("field_type")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.field_type)

      writer.name("field_validation")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.field_validation)

      writer.name("id")
      StringAdapter.toJson(writer, customScalarAdapters, value.id)

      writer.name("steps")
      NullableIntAdapter.toJson(writer, customScalarAdapters, value.steps)
    }
  }
}
