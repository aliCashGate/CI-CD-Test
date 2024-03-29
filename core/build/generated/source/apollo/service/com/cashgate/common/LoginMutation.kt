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
import com.apollographql.apollo3.api.Mutation
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.obj
import com.cashgate.common.adapter.LoginMutation_ResponseAdapter
import com.cashgate.common.adapter.LoginMutation_VariablesAdapter
import com.cashgate.common.selections.LoginMutationSelections
import kotlin.String
import kotlin.Unit

public data class LoginMutation(
  public val password: String,
  public val phone: String,
  public val email: String,
) : Mutation<LoginMutation.Data> {
  public override fun id(): String = OPERATION_ID

  public override fun document(): String = OPERATION_DOCUMENT

  public override fun name(): String = OPERATION_NAME

  public override fun serializeVariables(writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters): Unit {
    LoginMutation_VariablesAdapter.toJson(writer, customScalarAdapters, this)
  }

  public override fun adapter(): Adapter<Data> = LoginMutation_ResponseAdapter.Data.obj()

  public override fun rootField(): CompiledField = CompiledField.Builder(
    name = "data",
    type = com.cashgate.common.type.Mutation.type
  )
  .selections(selections = LoginMutationSelections.__root)
  .build()

  @ApolloAdaptableWith(LoginMutation_ResponseAdapter.Data::class)
  public data class Data(
    public val login: Login?,
  ) : Mutation.Data

  public data class Login(
    public val status: String?,
    public val token: String?,
  )

  public companion object {
    public const val OPERATION_ID: String =
        "a2742389e8e848fd289ee4caaee5adf10cb8a1e85f18da04518839ed2aaf78ec"

    /**
     * The minimized GraphQL document being sent to the server to save a few bytes.
     * The un-minimized version is:
     *
     * mutation Login($password: String!, $phone: String!, $email: String!) {
     *   login(password: $password, email: $email, phone: $phone) {
     *     status
     *     token
     *   }
     * }
     */
    public val OPERATION_DOCUMENT: String
      get() =
          "mutation Login(${'$'}password: String!, ${'$'}phone: String!, ${'$'}email: String!) { login(password: ${'$'}password, email: ${'$'}email, phone: ${'$'}phone) { status token } }"

    public const val OPERATION_NAME: String = "Login"
  }
}
