package com.cashgate.core.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007R\u001c\u0010\u0003\u001a\u00028\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/cashgate/core/network/GraphQLResponse;", "T", "", "data", "errors", "", "Lcom/apollographql/apollo3/api/Error;", "(Ljava/lang/Object;Ljava/util/List;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getErrors", "()Ljava/util/List;", "setErrors", "(Ljava/util/List;)V", "core_release"})
public final class GraphQLResponse<T extends java.lang.Object> {
    private T data;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.apollographql.apollo3.api.Error> errors;
    
    public final T getData() {
        return null;
    }
    
    public final void setData(T p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.apollographql.apollo3.api.Error> getErrors() {
        return null;
    }
    
    public final void setErrors(@org.jetbrains.annotations.Nullable
    java.util.List<com.apollographql.apollo3.api.Error> p0) {
    }
    
    public GraphQLResponse(T data, @org.jetbrains.annotations.Nullable
    java.util.List<com.apollographql.apollo3.api.Error> errors) {
        super();
    }
}