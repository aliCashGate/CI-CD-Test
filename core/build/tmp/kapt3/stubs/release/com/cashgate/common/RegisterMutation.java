package com.cashgate.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004,-./BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u00c6\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u00c6\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u00c6\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u00c6\u0003J[\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u00c6\u0001J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\t\u0010+\u001a\u00020\u0004H\u00d6\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u00060"}, d2 = {"Lcom/cashgate/common/RegisterMutation;", "Lcom/apollographql/apollo3/api/Mutation;", "Lcom/cashgate/common/RegisterMutation$Data;", "password", "", "email", "Lcom/apollographql/apollo3/api/Optional;", "phone", "lastName", "firstName", "(Ljava/lang/String;Lcom/apollographql/apollo3/api/Optional;Lcom/apollographql/apollo3/api/Optional;Lcom/apollographql/apollo3/api/Optional;Lcom/apollographql/apollo3/api/Optional;)V", "getEmail", "()Lcom/apollographql/apollo3/api/Optional;", "getFirstName", "getLastName", "getPassword", "()Ljava/lang/String;", "getPhone", "adapter", "Lcom/apollographql/apollo3/api/Adapter;", "component1", "component2", "component3", "component4", "component5", "copy", "document", "equals", "", "other", "", "hashCode", "", "id", "name", "rootField", "Lcom/apollographql/apollo3/api/CompiledField;", "serializeVariables", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toString", "Companion", "Data", "Register", "User", "core_release"})
public final class RegisterMutation implements com.apollographql.apollo3.api.Mutation<com.cashgate.common.RegisterMutation.Data> {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String password = null;
    @org.jetbrains.annotations.NotNull
    private final com.apollographql.apollo3.api.Optional<java.lang.String> email = null;
    @org.jetbrains.annotations.NotNull
    private final com.apollographql.apollo3.api.Optional<java.lang.String> phone = null;
    @org.jetbrains.annotations.NotNull
    private final com.apollographql.apollo3.api.Optional<java.lang.String> lastName = null;
    @org.jetbrains.annotations.NotNull
    private final com.apollographql.apollo3.api.Optional<java.lang.String> firstName = null;
    @org.jetbrains.annotations.NotNull
    public static final com.cashgate.common.RegisterMutation.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OPERATION_ID = "294758453500af2cabaf9ec090122ccd44e914f5ab503c707c02e17abdefb58a";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OPERATION_NAME = "Register";
    
    @org.jetbrains.annotations.NotNull
    public final com.cashgate.common.RegisterMutation copy(@org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.String> email, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.String> phone, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.String> lastName, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.String> firstName) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public RegisterMutation(@org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.String> email, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.String> phone, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.String> lastName, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.String> firstName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.String> getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.String> getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.String> getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.String> getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String document() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String name() {
        return null;
    }
    
    @java.lang.Override
    public void serializeVariables(@org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.json.JsonWriter writer, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.CustomScalarAdapters customScalarAdapters) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.apollographql.apollo3.api.Adapter<com.cashgate.common.RegisterMutation.Data> adapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.apollographql.apollo3.api.CompiledField rootField() {
        return null;
    }
    
    @com.apollographql.apollo3.annotations.ApolloAdaptableWith(adapter = com.cashgate.common.adapter.RegisterMutation_ResponseAdapter.Data.class)
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/cashgate/common/RegisterMutation$Data;", "Lcom/apollographql/apollo3/api/Mutation$Data;", "register", "Lcom/cashgate/common/RegisterMutation$Register;", "(Lcom/cashgate/common/RegisterMutation$Register;)V", "getRegister", "()Lcom/cashgate/common/RegisterMutation$Register;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_release"})
    public static final class Data implements com.apollographql.apollo3.api.Mutation.Data {
        @org.jetbrains.annotations.Nullable
        private final com.cashgate.common.RegisterMutation.Register register = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.cashgate.common.RegisterMutation.Data copy(@org.jetbrains.annotations.Nullable
        com.cashgate.common.RegisterMutation.Register register) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Data(@org.jetbrains.annotations.Nullable
        com.cashgate.common.RegisterMutation.Register register) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.cashgate.common.RegisterMutation.Register component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.cashgate.common.RegisterMutation.Register getRegister() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/cashgate/common/RegisterMutation$Register;", "", "user", "Lcom/cashgate/common/RegisterMutation$User;", "token", "", "message", "refresh_token", "(Lcom/cashgate/common/RegisterMutation$User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getRefresh_token", "getToken", "getUser", "()Lcom/cashgate/common/RegisterMutation$User;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"})
    public static final class Register {
        @org.jetbrains.annotations.Nullable
        private final com.cashgate.common.RegisterMutation.User user = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String token = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String message = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String refresh_token = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.cashgate.common.RegisterMutation.Register copy(@org.jetbrains.annotations.Nullable
        com.cashgate.common.RegisterMutation.User user, @org.jetbrains.annotations.Nullable
        java.lang.String token, @org.jetbrains.annotations.Nullable
        java.lang.String message, @org.jetbrains.annotations.Nullable
        java.lang.String refresh_token) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Register(@org.jetbrains.annotations.Nullable
        com.cashgate.common.RegisterMutation.User user, @org.jetbrains.annotations.Nullable
        java.lang.String token, @org.jetbrains.annotations.Nullable
        java.lang.String message, @org.jetbrains.annotations.Nullable
        java.lang.String refresh_token) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.cashgate.common.RegisterMutation.User component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.cashgate.common.RegisterMutation.User getUser() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getToken() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRefresh_token() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/cashgate/common/RegisterMutation$User;", "", "createdAt", "", "email", "first_name", "id", "phone", "last_name", "image", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/String;", "getEmail", "getFirst_name", "getId", "getImage", "getLast_name", "getPhone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"})
    public static final class User {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String createdAt = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String email = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String first_name = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String id = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String phone = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String last_name = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String image = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.cashgate.common.RegisterMutation.User copy(@org.jetbrains.annotations.Nullable
        java.lang.String createdAt, @org.jetbrains.annotations.Nullable
        java.lang.String email, @org.jetbrains.annotations.Nullable
        java.lang.String first_name, @org.jetbrains.annotations.Nullable
        java.lang.String id, @org.jetbrains.annotations.Nullable
        java.lang.String phone, @org.jetbrains.annotations.Nullable
        java.lang.String last_name, @org.jetbrains.annotations.Nullable
        java.lang.String image) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public User(@org.jetbrains.annotations.Nullable
        java.lang.String createdAt, @org.jetbrains.annotations.Nullable
        java.lang.String email, @org.jetbrains.annotations.Nullable
        java.lang.String first_name, @org.jetbrains.annotations.Nullable
        java.lang.String id, @org.jetbrains.annotations.Nullable
        java.lang.String phone, @org.jetbrains.annotations.Nullable
        java.lang.String last_name, @org.jetbrains.annotations.Nullable
        java.lang.String image) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCreatedAt() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getEmail() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getFirst_name() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPhone() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getLast_name() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getImage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/cashgate/common/RegisterMutation$Companion;", "", "()V", "OPERATION_DOCUMENT", "", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_ID", "OPERATION_NAME", "core_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getOPERATION_DOCUMENT() {
            return null;
        }
    }
}