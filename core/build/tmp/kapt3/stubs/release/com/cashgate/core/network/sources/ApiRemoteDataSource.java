package com.cashgate.core.network.sources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJM\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J3\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ1\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\n2\b\b\u0002\u0010\u001f\u001a\u00020\u00122\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J#\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\n2\u0006\u0010$\u001a\u00020\u0012H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J7\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\'\u0018\u00010\n2\b\u0010(\u001a\u0004\u0018\u00010\u00052\b\u0010)\u001a\u0004\u0018\u00010\u00052\u0006\u0010*\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+JG\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010\n2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J#\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010\n2\u0006\u00103\u001a\u000204H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J+\u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u00010\n2\u0006\u0010*\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109J+\u0010:\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010;\u0018\u00010\n2\u0006\u00103\u001a\u0002042\u0006\u0010 \u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J3\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010>\u0018\u00010\n2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006A"}, d2 = {"Lcom/cashgate/core/network/sources/ApiRemoteDataSource;", "Lcom/cashgate/core/network/BaseDataSource;", "apolloClient", "Lcom/apollographql/apollo3/ApolloClient;", "apiSecret", "", "appPreferences", "Lcom/cashgate/core/util/AppPreferences;", "(Lcom/apollographql/apollo3/ApolloClient;Ljava/lang/String;Lcom/cashgate/core/util/AppPreferences;)V", "deleteUser", "Lcom/cashgate/core/network/Resource;", "Lcom/cashgate/common/DeleteUserMutation$Data;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAmenities", "Lcom/cashgate/common/AmenitiesQuery$Data;", "getCategories", "Lcom/cashgate/common/CategoriesQuery$Data;", "showScreen", "", "afl", "categoryId", "header", "includeChild", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForms", "Lcom/cashgate/common/FetchFormQuery$Data;", "steps", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProperties", "Lcom/cashgate/common/PropertiesQuery$Data;", "page", "userID", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPropertyDetail", "Lcom/cashgate/common/PropertyQuery$Data;", "propertyID", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/cashgate/common/LoginMutation$Data;", "email", "phoneNum", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "Lcom/cashgate/common/RegisterMutation$Data;", "firstName", "lastName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeProperty", "Lcom/cashgate/common/Store_propertyMutation$Data;", "args", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePassword", "Lcom/cashgate/common/UpdatePasswordMutation$Data;", "token", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "Lcom/cashgate/common/UpdateUserMutation$Data;", "(Lorg/json/JSONObject;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyUser", "Lcom/cashgate/common/UserVerficationMutation$Data;", "type", "value", "core_release"})
public final class ApiRemoteDataSource extends com.cashgate.core.network.BaseDataSource {
    private final com.apollographql.apollo3.ApolloClient apolloClient = null;
    private final java.lang.String apiSecret = null;
    private final com.cashgate.core.util.AppPreferences appPreferences = null;
    
    @javax.inject.Inject
    public ApiRemoteDataSource(@org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.ApolloClient apolloClient, @org.jetbrains.annotations.NotNull
    java.lang.String apiSecret, @org.jetbrains.annotations.NotNull
    com.cashgate.core.util.AppPreferences appPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object login(@org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String phoneNum, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.LoginMutation.Data>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object register(@org.jetbrains.annotations.NotNull
    java.lang.String firstName, @org.jetbrains.annotations.NotNull
    java.lang.String lastName, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.Nullable
    java.lang.String phoneNum, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.RegisterMutation.Data>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateUser(@org.jetbrains.annotations.NotNull
    org.json.JSONObject args, int userID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.UpdateUserMutation.Data>> continuation) {
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
    @androidx.annotation.WorkerThread
    public final java.lang.Object getProperties(int page, @org.jetbrains.annotations.Nullable
    java.lang.String userID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.PropertiesQuery.Data>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.WorkerThread
    public final java.lang.Object getPropertyDetail(int propertyID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.PropertyQuery.Data>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getForms(int categoryId, int steps, @org.jetbrains.annotations.NotNull
    java.lang.String header, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.FetchFormQuery.Data>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAmenities(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.AmenitiesQuery.Data>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object storeProperty(@org.jetbrains.annotations.NotNull
    org.json.JSONObject args, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.Store_propertyMutation.Data>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteUser(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<com.cashgate.common.DeleteUserMutation.Data>> continuation) {
        return null;
    }
}