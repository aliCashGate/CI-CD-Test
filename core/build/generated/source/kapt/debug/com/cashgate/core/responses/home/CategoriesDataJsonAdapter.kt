// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.cashgate.core.responses.home

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

public class CategoriesDataJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<CategoriesData>() {
  private val options: JsonReader.Options = JsonReader.Options.of("image", "title", "parentId",
      "id", "showOnScreen", "hasChild")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "image")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "showOnScreen")

  private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
      moshi.adapter(Boolean::class.javaObjectType, emptySet(), "hasChild")

  @Volatile
  private var constructorRef: Constructor<CategoriesData>? = null

  public override fun toString(): String = buildString(36) {
      append("GeneratedJsonAdapter(").append("CategoriesData").append(')') }

  public override fun fromJson(reader: JsonReader): CategoriesData {
    var image: String? = null
    var title: String? = null
    var parentId: String? = null
    var id: String? = null
    var showOnScreen: Int? = null
    var hasChild: Boolean? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          image = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          title = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          parentId = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        3 -> {
          id = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 3).inv()
          mask0 = mask0 and 0xfffffff7.toInt()
        }
        4 -> {
          showOnScreen = nullableIntAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 4).inv()
          mask0 = mask0 and 0xffffffef.toInt()
        }
        5 -> {
          hasChild = nullableBooleanAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 5).inv()
          mask0 = mask0 and 0xffffffdf.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xffffffc0.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  CategoriesData(
          image = image,
          title = title,
          parentId = parentId,
          id = id,
          showOnScreen = showOnScreen,
          hasChild = hasChild
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<CategoriesData> = this.constructorRef ?:
          CategoriesData::class.java.getDeclaredConstructor(String::class.java, String::class.java,
          String::class.java, String::class.java, Int::class.javaObjectType,
          Boolean::class.javaObjectType, Int::class.javaPrimitiveType,
          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }
      return localConstructor.newInstance(
          image,
          title,
          parentId,
          id,
          showOnScreen,
          hasChild,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: CategoriesData?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("image")
    nullableStringAdapter.toJson(writer, value_.image)
    writer.name("title")
    nullableStringAdapter.toJson(writer, value_.title)
    writer.name("parentId")
    nullableStringAdapter.toJson(writer, value_.parentId)
    writer.name("id")
    nullableStringAdapter.toJson(writer, value_.id)
    writer.name("showOnScreen")
    nullableIntAdapter.toJson(writer, value_.showOnScreen)
    writer.name("hasChild")
    nullableBooleanAdapter.toJson(writer, value_.hasChild)
    writer.endObject()
  }
}
