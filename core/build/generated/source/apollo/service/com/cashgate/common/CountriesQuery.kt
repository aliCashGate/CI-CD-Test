//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.cashgate.common

import com.apollographql.apollo3.annotations.ApolloAdaptableWith
import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CompiledField
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.Query
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.obj
import com.cashgate.common.adapter.CountriesQuery_ResponseAdapter
import com.cashgate.common.selections.CountriesQuerySelections
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public class CountriesQuery() : Query<CountriesQuery.Data> {
  public override fun equals(other: Any?): Boolean = other != null && other::class == this::class

  public override fun hashCode(): Int = this::class.hashCode()

  public override fun id(): String = OPERATION_ID

  public override fun document(): String = OPERATION_DOCUMENT

  public override fun name(): String = OPERATION_NAME

  public override fun serializeVariables(writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters): Unit {
    // This operation doesn't have any variable
  }

  public override fun adapter(): Adapter<Data> = CountriesQuery_ResponseAdapter.Data.obj()

  public override fun rootField(): CompiledField = CompiledField.Builder(
    name = "data",
    type = com.cashgate.common.type.Query.type
  )
  .selections(selections = CountriesQuerySelections.__root)
  .build()

  @ApolloAdaptableWith(CountriesQuery_ResponseAdapter.Data::class)
  public data class Data(
    public val countries: List<Country>,
  ) : Query.Data

  public data class Country(
    public val name: String,
    public val iso3: String?,
    public val id: String,
  )

  public companion object {
    public const val OPERATION_ID: String =
        "1ece1ab73e21e3c20fb75488aeba82a2a1f565e74e9731e6eb36fec3d7735040"

    /**
     * The minimized GraphQL document being sent to the server to save a few bytes.
     * The un-minimized version is:
     *
     * query Countries {
     *   countries {
     *     name
     *     iso3
     *     id
     *   }
     * }
     */
    public val OPERATION_DOCUMENT: String
      get() = "query Countries { countries { name iso3 id } }"

    public const val OPERATION_NAME: String = "Countries"
  }
}
