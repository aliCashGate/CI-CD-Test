//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.cashgate.common.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.NullableStringAdapter
import com.apollographql.apollo3.api.StringAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.list
import com.apollographql.apollo3.api.obj
import com.cashgate.common.CountriesQuery
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public object CountriesQuery_ResponseAdapter {
  public object Data : Adapter<CountriesQuery.Data> {
    public val RESPONSE_NAMES: List<String> = listOf("countries")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        CountriesQuery.Data {
      var _countries: List<CountriesQuery.Country>? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _countries = Country.obj().list().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return CountriesQuery.Data(
        countries = _countries!!
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: CountriesQuery.Data,
    ): Unit {
      writer.name("countries")
      Country.obj().list().toJson(writer, customScalarAdapters, value.countries)
    }
  }

  public object Country : Adapter<CountriesQuery.Country> {
    public val RESPONSE_NAMES: List<String> = listOf("name", "iso3", "id")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        CountriesQuery.Country {
      var _name: String? = null
      var _iso3: String? = null
      var _id: String? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _name = StringAdapter.fromJson(reader, customScalarAdapters)
          1 -> _iso3 = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          2 -> _id = StringAdapter.fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return CountriesQuery.Country(
        name = _name!!,
        iso3 = _iso3,
        id = _id!!
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: CountriesQuery.Country,
    ): Unit {
      writer.name("name")
      StringAdapter.toJson(writer, customScalarAdapters, value.name)

      writer.name("iso3")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.iso3)

      writer.name("id")
      StringAdapter.toJson(writer, customScalarAdapters, value.id)
    }
  }
}
