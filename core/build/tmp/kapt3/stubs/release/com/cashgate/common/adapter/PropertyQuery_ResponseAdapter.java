package com.cashgate.common.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\t"}, d2 = {"Lcom/cashgate/common/adapter/PropertyQuery_ResponseAdapter;", "", "()V", "Amenity", "Data", "Image", "Property", "Socialmedium", "User_id", "core_release"})
public final class PropertyQuery_ResponseAdapter {
    @org.jetbrains.annotations.NotNull
    public static final com.cashgate.common.adapter.PropertyQuery_ResponseAdapter INSTANCE = null;
    
    private PropertyQuery_ResponseAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/cashgate/common/adapter/PropertyQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/cashgate/common/PropertyQuery$Data;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "core_release"})
    public static final class Data implements com.apollographql.apollo3.api.Adapter<com.cashgate.common.PropertyQuery.Data> {
        @org.jetbrains.annotations.NotNull
        public static final com.cashgate.common.adapter.PropertyQuery_ResponseAdapter.Data INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        
        private Data() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.cashgate.common.PropertyQuery.Data fromJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override
        public void toJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull
        com.cashgate.common.PropertyQuery.Data value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/cashgate/common/adapter/PropertyQuery_ResponseAdapter$Property;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/cashgate/common/PropertyQuery$Property;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "core_release"})
    public static final class Property implements com.apollographql.apollo3.api.Adapter<com.cashgate.common.PropertyQuery.Property> {
        @org.jetbrains.annotations.NotNull
        public static final com.cashgate.common.adapter.PropertyQuery_ResponseAdapter.Property INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        
        private Property() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.cashgate.common.PropertyQuery.Property fromJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override
        public void toJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull
        com.cashgate.common.PropertyQuery.Property value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/cashgate/common/adapter/PropertyQuery_ResponseAdapter$Amenity;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/cashgate/common/PropertyQuery$Amenity;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "core_release"})
    public static final class Amenity implements com.apollographql.apollo3.api.Adapter<com.cashgate.common.PropertyQuery.Amenity> {
        @org.jetbrains.annotations.NotNull
        public static final com.cashgate.common.adapter.PropertyQuery_ResponseAdapter.Amenity INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        
        private Amenity() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.cashgate.common.PropertyQuery.Amenity fromJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override
        public void toJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull
        com.cashgate.common.PropertyQuery.Amenity value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/cashgate/common/adapter/PropertyQuery_ResponseAdapter$Image;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/cashgate/common/PropertyQuery$Image;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "core_release"})
    public static final class Image implements com.apollographql.apollo3.api.Adapter<com.cashgate.common.PropertyQuery.Image> {
        @org.jetbrains.annotations.NotNull
        public static final com.cashgate.common.adapter.PropertyQuery_ResponseAdapter.Image INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        
        private Image() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.cashgate.common.PropertyQuery.Image fromJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override
        public void toJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull
        com.cashgate.common.PropertyQuery.Image value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/cashgate/common/adapter/PropertyQuery_ResponseAdapter$Socialmedium;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/cashgate/common/PropertyQuery$Socialmedium;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "core_release"})
    public static final class Socialmedium implements com.apollographql.apollo3.api.Adapter<com.cashgate.common.PropertyQuery.Socialmedium> {
        @org.jetbrains.annotations.NotNull
        public static final com.cashgate.common.adapter.PropertyQuery_ResponseAdapter.Socialmedium INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        
        private Socialmedium() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.cashgate.common.PropertyQuery.Socialmedium fromJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override
        public void toJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull
        com.cashgate.common.PropertyQuery.Socialmedium value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/cashgate/common/adapter/PropertyQuery_ResponseAdapter$User_id;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/cashgate/common/PropertyQuery$User_id;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "core_release"})
    public static final class User_id implements com.apollographql.apollo3.api.Adapter<com.cashgate.common.PropertyQuery.User_id> {
        @org.jetbrains.annotations.NotNull
        public static final com.cashgate.common.adapter.PropertyQuery_ResponseAdapter.User_id INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        
        private User_id() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.cashgate.common.PropertyQuery.User_id fromJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override
        public void toJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull
        com.cashgate.common.PropertyQuery.User_id value) {
        }
    }
}