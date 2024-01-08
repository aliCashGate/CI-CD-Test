package com.cashgate.common.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/cashgate/common/adapter/RegisterMutation_ResponseAdapter;", "", "()V", "Data", "Register", "User", "core_release"})
public final class RegisterMutation_ResponseAdapter {
    @org.jetbrains.annotations.NotNull
    public static final com.cashgate.common.adapter.RegisterMutation_ResponseAdapter INSTANCE = null;
    
    private RegisterMutation_ResponseAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/cashgate/common/adapter/RegisterMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/cashgate/common/RegisterMutation$Data;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "core_release"})
    public static final class Data implements com.apollographql.apollo3.api.Adapter<com.cashgate.common.RegisterMutation.Data> {
        @org.jetbrains.annotations.NotNull
        public static final com.cashgate.common.adapter.RegisterMutation_ResponseAdapter.Data INSTANCE = null;
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
        public com.cashgate.common.RegisterMutation.Data fromJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override
        public void toJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull
        com.cashgate.common.RegisterMutation.Data value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/cashgate/common/adapter/RegisterMutation_ResponseAdapter$Register;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/cashgate/common/RegisterMutation$Register;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "core_release"})
    public static final class Register implements com.apollographql.apollo3.api.Adapter<com.cashgate.common.RegisterMutation.Register> {
        @org.jetbrains.annotations.NotNull
        public static final com.cashgate.common.adapter.RegisterMutation_ResponseAdapter.Register INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        
        private Register() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.cashgate.common.RegisterMutation.Register fromJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override
        public void toJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull
        com.cashgate.common.RegisterMutation.Register value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/cashgate/common/adapter/RegisterMutation_ResponseAdapter$User;", "Lcom/apollographql/apollo3/api/Adapter;", "Lcom/cashgate/common/RegisterMutation$User;", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo3/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "value", "core_release"})
    public static final class User implements com.apollographql.apollo3.api.Adapter<com.cashgate.common.RegisterMutation.User> {
        @org.jetbrains.annotations.NotNull
        public static final com.cashgate.common.adapter.RegisterMutation_ResponseAdapter.User INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = null;
        
        private User() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.cashgate.common.RegisterMutation.User fromJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonReader reader, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
            return null;
        }
        
        @java.lang.Override
        public void toJson(@org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull
        com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters, @org.jetbrains.annotations.NotNull
        com.cashgate.common.RegisterMutation.User value) {
        }
    }
}