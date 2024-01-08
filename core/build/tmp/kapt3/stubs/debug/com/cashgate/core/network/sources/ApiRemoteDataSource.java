package com.cashgate.core.network.sources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JM\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J+\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J3\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJC\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ+\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J3\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010\b2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/cashgate/core/network/sources/ApiRemoteDataSource;", "Lcom/cashgate/core/network/BaseDataSource;", "apolloClient", "Lcom/apollographql/apollo3/ApolloClient;", "apiSecret", "", "(Lcom/apollographql/apollo3/ApolloClient;Ljava/lang/String;)V", "getCategories", "Lcom/cashgate/core/network/Resource;", "Lcom/cashgate/common/CategoriesQuery$Data;", "showScreen", "", "afl", "categoryId", "header", "includeChild", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForms", "Lcom/cashgate/common/FetchFormQuery$Data;", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/cashgate/common/LoginMutation$Data;", "email", "phoneNum", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "Lcom/cashgate/common/RegisterMutation$Data;", "firstName", "lastName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePassword", "Lcom/cashgate/common/UpdatePasswordMutation$Data;", "token", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyUser", "Lcom/cashgate/common/UserVerficationMutation$Data;", "type", "value", "core_debug"})
public final class ApiRemoteDataSource extends com.cashgate.core.network.BaseDataSource {
    private final com.apollographql.apollo3.ApolloClient apolloClient = null;
    private final java.lang.String apiSecret = null;
    
    @javax.inject.Inject
    public ApiRemoteDataSource(@org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.ApolloClient apolloClient, @org.jetbrains.annotations.NotNull
    java.lang.String apiSecret) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNum, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.LoginMutation.Data>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object register(@org.jetbrains.annotations.NotNull
    java.lang.String firstName, @org.jetbrains.annotations.NotNull
    java.lang.String lastName, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNum, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.RegisterMutation.Data>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object verifyUser(@org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    java.lang.String header, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.UserVerficationMutation.Data>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updatePassword(@org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.UpdatePasswordMutation.Data>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCategories(@org.jetbrains.annotations.Nullable
    java.lang.Integer showScreen, @org.jetbrains.annotations.Nullable
    java.lang.Integer afl, @org.jetbrains.annotations.Nullable
    java.lang.Integer categoryId, @org.jetbrains.annotations.Nullable
    java.lang.String header, boolean includeChild, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.CategoriesQuery.Data>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getForms(int categoryId, @org.jetbrains.annotations.NotNull
    java.lang.String header, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.FetchFormQuery.Data>> continuation) {
        return null;
    }
}