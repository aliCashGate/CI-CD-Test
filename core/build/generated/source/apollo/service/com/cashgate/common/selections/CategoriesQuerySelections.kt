//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.cashgate.common.selections

import com.apollographql.apollo3.api.CompiledArgument
import com.apollographql.apollo3.api.CompiledCondition
import com.apollographql.apollo3.api.CompiledField
import com.apollographql.apollo3.api.CompiledSelection
import com.apollographql.apollo3.api.CompiledVariable
import com.apollographql.apollo3.api.list
import com.apollographql.apollo3.api.notNull
import com.cashgate.common.type.Category
import com.cashgate.common.type.GraphQLBoolean
import com.cashgate.common.type.GraphQLID
import com.cashgate.common.type.GraphQLInt
import com.cashgate.common.type.GraphQLString
import kotlin.collections.List

public object CategoriesQuerySelections {
  private val __categories: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "image",
          type = GraphQLString.type
        ).build(),
        CompiledField.Builder(
          name = "title",
          type = GraphQLString.type.notNull()
        ).build(),
        CompiledField.Builder(
          name = "parent_id",
          type = GraphQLInt.type
        ).condition(listOf(CompiledCondition("includeChild", false)))
        .build(),
        CompiledField.Builder(
          name = "has_child",
          type = GraphQLBoolean.type
        ).condition(listOf(CompiledCondition("includeChild", false)))
        .build(),
        CompiledField.Builder(
          name = "id",
          type = GraphQLID.type.notNull()
        ).build(),
        CompiledField.Builder(
          name = "show_on_screen",
          type = GraphQLInt.type
        ).condition(listOf(CompiledCondition("includeChild", false)))
        .build()
      )

  public val __root: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "categories",
          type = Category.type.list().notNull()
        ).arguments(listOf(
          CompiledArgument.Builder("afl", CompiledVariable("afl")).build(),
          CompiledArgument.Builder("category_id", CompiledVariable("categoryId")).build(),
          CompiledArgument.Builder("show_on_screen", CompiledVariable("showOnScreen")).build()
        ))
        .selections(__categories)
        .build()
      )
}