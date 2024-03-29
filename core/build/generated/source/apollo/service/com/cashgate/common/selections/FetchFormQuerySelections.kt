//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.cashgate.common.selections

import com.apollographql.apollo3.api.CompiledArgument
import com.apollographql.apollo3.api.CompiledField
import com.apollographql.apollo3.api.CompiledSelection
import com.apollographql.apollo3.api.CompiledVariable
import com.apollographql.apollo3.api.list
import com.apollographql.apollo3.api.notNull
import com.cashgate.common.type.Form
import com.cashgate.common.type.GraphQLID
import com.cashgate.common.type.GraphQLInt
import com.cashgate.common.type.GraphQLString
import kotlin.collections.List

public object FetchFormQuerySelections {
  private val __fetchForm: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "category_id",
          type = GraphQLInt.type
        ).build(),
        CompiledField.Builder(
          name = "field_extras",
          type = GraphQLString.type
        ).build(),
        CompiledField.Builder(
          name = "field_id",
          type = GraphQLInt.type
        ).build(),
        CompiledField.Builder(
          name = "field_name",
          type = GraphQLString.type
        ).build(),
        CompiledField.Builder(
          name = "field_order",
          type = GraphQLInt.type
        ).build(),
        CompiledField.Builder(
          name = "field_request_type",
          type = GraphQLString.type
        ).build(),
        CompiledField.Builder(
          name = "field_size",
          type = GraphQLInt.type
        ).build(),
        CompiledField.Builder(
          name = "field_type",
          type = GraphQLString.type
        ).build(),
        CompiledField.Builder(
          name = "field_validation",
          type = GraphQLString.type
        ).build(),
        CompiledField.Builder(
          name = "id",
          type = GraphQLID.type.notNull()
        ).build(),
        CompiledField.Builder(
          name = "steps",
          type = GraphQLInt.type
        ).build()
      )

  public val __root: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "fetchForm",
          type = Form.type.list()
        ).arguments(listOf(
          CompiledArgument.Builder("category_id", CompiledVariable("categoryId")).build()
        ))
        .selections(__fetchForm)
        .build()
      )
}
