package com.cashgate.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003#$%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u00c6\u0003J%\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u00c6\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0004H\u00d6\u0001J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006&"}, d2 = {"Lcom/cashgate/common/FetchFormQuery;", "Lcom/apollographql/apollo3/api/Query;", "Lcom/cashgate/common/FetchFormQuery$Data;", "categoryId", "", "steps", "Lcom/apollographql/apollo3/api/Optional;", "(ILcom/apollographql/apollo3/api/Optional;)V", "getCategoryId", "()I", "getSteps", "()Lcom/apollographql/apollo3/api/Optional;", "adapter", "Lcom/apollographql/apollo3/api/Adapter;", "component1", "component2", "copy", "document", "", "equals", "", "other", "", "hashCode", "id", "name", "rootField", "Lcom/apollographql/apollo3/api/CompiledField;", "serializeVariables", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toString", "Companion", "Data", "FetchForm", "core_release"})
public final class FetchFormQuery implements com.apollographql.apollo3.api.Query<com.cashgate.common.FetchFormQuery.Data> {
    private final int categoryId = 0;
    @org.jetbrains.annotations.NotNull
    private final com.apollographql.apollo3.api.Optional<java.lang.Integer> steps = null;
    @org.jetbrains.annotations.NotNull
    public static final com.cashgate.common.FetchFormQuery.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OPERATION_ID = "d2fd730cbd883bf051d12dffe9dc182dd69b682c700a6438838c57a3d4ccda9b";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OPERATION_NAME = "FetchForm";
    
    @org.jetbrains.annotations.NotNull
    public final com.cashgate.common.FetchFormQuery copy(int categoryId, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.Integer> steps) {
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
    
    public FetchFormQuery(int categoryId, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.Integer> steps) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getCategoryId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.Integer> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.Integer> getSteps() {
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
    public com.apollographql.apollo3.api.Adapter<com.cashgate.common.FetchFormQuery.Data> adapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.apollographql.apollo3.api.CompiledField rootField() {
        return null;
    }
    
    @com.apollographql.apollo3.annotations.ApolloAdaptableWith(adapter = com.cashgate.common.adapter.FetchFormQuery_ResponseAdapter.Data.class)
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0018\u00010\u0003H\u00c6\u0003J%\u0010\t\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R#\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/cashgate/common/FetchFormQuery$Data;", "Lcom/apollographql/apollo3/api/Query$Data;", "fetchForm", "", "Lcom/cashgate/common/FetchFormQuery$FetchForm;", "(Ljava/util/List;)V", "getFetchForm", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_release"})
    public static final class Data implements com.apollographql.apollo3.api.Query.Data {
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.util.List<com.cashgate.common.FetchFormQuery.FetchForm>> fetchForm = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.cashgate.common.FetchFormQuery.Data copy(@org.jetbrains.annotations.Nullable
        java.util.List<? extends java.util.List<com.cashgate.common.FetchFormQuery.FetchForm>> fetchForm) {
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
        java.util.List<? extends java.util.List<com.cashgate.common.FetchFormQuery.FetchForm>> fetchForm) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.util.List<com.cashgate.common.FetchFormQuery.FetchForm>> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.util.List<com.cashgate.common.FetchFormQuery.FetchForm>> getFetchForm() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0090\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001d\u0010\u0011\u00a8\u00060"}, d2 = {"Lcom/cashgate/common/FetchFormQuery$FetchForm;", "", "category_id", "", "field_extras", "", "field_id", "field_name", "field_order", "field_request_type", "field_size", "field_type", "field_validation", "id", "steps", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCategory_id", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getField_extras", "()Ljava/lang/String;", "getField_id", "getField_name", "getField_order", "getField_request_type", "getField_size", "getField_type", "getField_validation", "getId", "getSteps", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/cashgate/common/FetchFormQuery$FetchForm;", "equals", "", "other", "hashCode", "toString", "core_release"})
    public static final class FetchForm {
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer category_id = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String field_extras = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String field_id = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String field_name = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer field_order = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String field_request_type = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer field_size = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String field_type = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String field_validation = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String id = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer steps = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.cashgate.common.FetchFormQuery.FetchForm copy(@org.jetbrains.annotations.Nullable
        java.lang.Integer category_id, @org.jetbrains.annotations.Nullable
        java.lang.String field_extras, @org.jetbrains.annotations.Nullable
        java.lang.String field_id, @org.jetbrains.annotations.Nullable
        java.lang.String field_name, @org.jetbrains.annotations.Nullable
        java.lang.Integer field_order, @org.jetbrains.annotations.Nullable
        java.lang.String field_request_type, @org.jetbrains.annotations.Nullable
        java.lang.Integer field_size, @org.jetbrains.annotations.Nullable
        java.lang.String field_type, @org.jetbrains.annotations.Nullable
        java.lang.String field_validation, @org.jetbrains.annotations.NotNull
        java.lang.String id, @org.jetbrains.annotations.Nullable
        java.lang.Integer steps) {
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
        
        public FetchForm(@org.jetbrains.annotations.Nullable
        java.lang.Integer category_id, @org.jetbrains.annotations.Nullable
        java.lang.String field_extras, @org.jetbrains.annotations.Nullable
        java.lang.String field_id, @org.jetbrains.annotations.Nullable
        java.lang.String field_name, @org.jetbrains.annotations.Nullable
        java.lang.Integer field_order, @org.jetbrains.annotations.Nullable
        java.lang.String field_request_type, @org.jetbrains.annotations.Nullable
        java.lang.Integer field_size, @org.jetbrains.annotations.Nullable
        java.lang.String field_type, @org.jetbrains.annotations.Nullable
        java.lang.String field_validation, @org.jetbrains.annotations.NotNull
        java.lang.String id, @org.jetbrains.annotations.Nullable
        java.lang.Integer steps) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getCategory_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getField_extras() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getField_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getField_name() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getField_order() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getField_request_type() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getField_size() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getField_type() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getField_validation() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getSteps() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/cashgate/common/FetchFormQuery$Companion;", "", "()V", "OPERATION_DOCUMENT", "", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_ID", "OPERATION_NAME", "core_release"})
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