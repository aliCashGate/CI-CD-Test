package com.cashgate.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003()*BM\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0011\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u00c6\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u00c6\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u00c6\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004H\u00c6\u0003JQ\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004H\u00c6\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\t\u0010\'\u001a\u00020\u0018H\u00d6\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f\u00a8\u0006+"}, d2 = {"Lcom/cashgate/common/CategoriesQuery;", "Lcom/apollographql/apollo3/api/Query;", "Lcom/cashgate/common/CategoriesQuery$Data;", "showOnScreen", "Lcom/apollographql/apollo3/api/Optional;", "", "afl", "categoryId", "includeChild", "", "(Lcom/apollographql/apollo3/api/Optional;Lcom/apollographql/apollo3/api/Optional;Lcom/apollographql/apollo3/api/Optional;Lcom/apollographql/apollo3/api/Optional;)V", "getAfl", "()Lcom/apollographql/apollo3/api/Optional;", "getCategoryId", "getIncludeChild", "getShowOnScreen", "adapter", "Lcom/apollographql/apollo3/api/Adapter;", "component1", "component2", "component3", "component4", "copy", "document", "", "equals", "other", "", "hashCode", "id", "name", "rootField", "Lcom/apollographql/apollo3/api/CompiledField;", "serializeVariables", "", "writer", "Lcom/apollographql/apollo3/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo3/api/CustomScalarAdapters;", "toString", "Category", "Companion", "Data", "core_release"})
public final class CategoriesQuery implements com.apollographql.apollo3.api.Query<com.cashgate.common.CategoriesQuery.Data> {
    @org.jetbrains.annotations.NotNull
    private final com.apollographql.apollo3.api.Optional<java.lang.Integer> showOnScreen = null;
    @org.jetbrains.annotations.NotNull
    private final com.apollographql.apollo3.api.Optional<java.lang.Integer> afl = null;
    @org.jetbrains.annotations.NotNull
    private final com.apollographql.apollo3.api.Optional<java.lang.Integer> categoryId = null;
    @org.jetbrains.annotations.NotNull
    private final com.apollographql.apollo3.api.Optional<java.lang.Boolean> includeChild = null;
    @org.jetbrains.annotations.NotNull
    public static final com.cashgate.common.CategoriesQuery.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OPERATION_ID = "79c4ceb25992bbb3cc7ee76c0fd605967c9ea8b92c793b9a6e3bbf7d46541f63";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OPERATION_NAME = "Categories";
    
    @org.jetbrains.annotations.NotNull
    public final com.cashgate.common.CategoriesQuery copy(@org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.Integer> showOnScreen, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.Integer> afl, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.Integer> categoryId, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.Boolean> includeChild) {
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
    
    public CategoriesQuery() {
        super();
    }
    
    public CategoriesQuery(@org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.Integer> showOnScreen, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.Integer> afl, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.Integer> categoryId, @org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.api.Optional<java.lang.Boolean> includeChild) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.Integer> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.Integer> getShowOnScreen() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.Integer> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.Integer> getAfl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.Integer> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.Integer> getCategoryId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.Boolean> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.api.Optional<java.lang.Boolean> getIncludeChild() {
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
    public com.apollographql.apollo3.api.Adapter<com.cashgate.common.CategoriesQuery.Data> adapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.apollographql.apollo3.api.CompiledField rootField() {
        return null;
    }
    
    @com.apollographql.apollo3.annotations.ApolloAdaptableWith(adapter = com.cashgate.common.adapter.CategoriesQuery_ResponseAdapter.Data.class)
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u00c6\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/cashgate/common/CategoriesQuery$Data;", "Lcom/apollographql/apollo3/api/Query$Data;", "categories", "", "Lcom/cashgate/common/CategoriesQuery$Category;", "(Ljava/util/List;)V", "getCategories", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_release"})
    public static final class Data implements com.apollographql.apollo3.api.Query.Data {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.cashgate.common.CategoriesQuery.Category> categories = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.cashgate.common.CategoriesQuery.Data copy(@org.jetbrains.annotations.NotNull
        java.util.List<com.cashgate.common.CategoriesQuery.Category> categories) {
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
        
        public Data(@org.jetbrains.annotations.NotNull
        java.util.List<com.cashgate.common.CategoriesQuery.Category> categories) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.cashgate.common.CategoriesQuery.Category> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.cashgate.common.CategoriesQuery.Category> getCategories() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ^\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0006H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012\u00a8\u0006&"}, d2 = {"Lcom/cashgate/common/CategoriesQuery$Category;", "", "image", "", "title", "parent_id", "", "has_child", "", "id", "show_on_screen", "has_form", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getHas_child", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHas_form", "getId", "()Ljava/lang/String;", "getImage", "getParent_id", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShow_on_screen", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/cashgate/common/CategoriesQuery$Category;", "equals", "other", "hashCode", "toString", "core_release"})
    public static final class Category {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String image = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer parent_id = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean has_child = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String id = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer show_on_screen = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean has_form = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.cashgate.common.CategoriesQuery.Category copy(@org.jetbrains.annotations.Nullable
        java.lang.String image, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.Nullable
        java.lang.Integer parent_id, @org.jetbrains.annotations.Nullable
        java.lang.Boolean has_child, @org.jetbrains.annotations.NotNull
        java.lang.String id, @org.jetbrains.annotations.Nullable
        java.lang.Integer show_on_screen, @org.jetbrains.annotations.Nullable
        java.lang.Boolean has_form) {
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
        
        public Category(@org.jetbrains.annotations.Nullable
        java.lang.String image, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.Nullable
        java.lang.Integer parent_id, @org.jetbrains.annotations.Nullable
        java.lang.Boolean has_child, @org.jetbrains.annotations.NotNull
        java.lang.String id, @org.jetbrains.annotations.Nullable
        java.lang.Integer show_on_screen, @org.jetbrains.annotations.Nullable
        java.lang.Boolean has_form) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getParent_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getHas_child() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getShow_on_screen() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getHas_form() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/cashgate/common/CategoriesQuery$Companion;", "", "()V", "OPERATION_DOCUMENT", "", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_ID", "OPERATION_NAME", "core_release"})
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