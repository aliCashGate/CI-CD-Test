package com.cashgate.data.repository.fetch_form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J5\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001f0\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00192\u0006\u0010+\u001a\u00020%H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J%\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u001f0\u00192\u0006\u0010/\u001a\u000200H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J/\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00192\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lcom/cashgate/data/repository/fetch_form/GetFormRepositoryImp;", "Lcom/cashgate/domain/respository/get_form/GetFormRepository;", "apiRemoteDataSource", "Lcom/cashgate/core/network/sources/ApiRemoteDataSource;", "formsMapper", "Lcom/cashgate/data/repository/fetch_form/mapper/FormsMapper;", "amenitiesMapper", "Lcom/cashgate/data/repository/fetch_form/mapper/AmenitiesMapper;", "storePropertyMapper", "Lcom/cashgate/data/repository/fetch_form/mapper/StorePropertyMapper;", "context", "Landroid/content/Context;", "apiURL", "", "apiSecret", "appPreferences", "Lcom/cashgate/core/util/AppPreferences;", "(Lcom/cashgate/core/network/sources/ApiRemoteDataSource;Lcom/cashgate/data/repository/fetch_form/mapper/FormsMapper;Lcom/cashgate/data/repository/fetch_form/mapper/AmenitiesMapper;Lcom/cashgate/data/repository/fetch_form/mapper/StorePropertyMapper;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/cashgate/core/util/AppPreferences;)V", "getApiRemoteDataSource", "()Lcom/cashgate/core/network/sources/ApiRemoteDataSource;", "deleteImage", "", "fileName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddressFromLatLon", "Lkotlinx/coroutines/flow/Flow;", "longitude", "", "latitude", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAmenities", "Lcom/cashgate/core/network/Resource;", "Lcom/cashgate/core/responses/amenities/AmenitiesEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForms", "Lcom/cashgate/core/responses/fetch_forms/FetchFormEntity;", "categoryId", "", "steps", "header", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPropertyPaymentIntent", "Lcom/cashgate/core/responses/property_intent/GetPropertyIntent;", "categoryID", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeProperty", "Lcom/cashgate/core/responses/store_property/StorePropertyEntity;", "args", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImage", "Lcom/cashgate/core/responses/images/UploadImageEntity;", "file", "Ljava/io/File;", "id", "type", "(Ljava/io/File;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"})
public final class GetFormRepositoryImp implements com.cashgate.domain.respository.get_form.GetFormRepository {
    @org.jetbrains.annotations.NotNull
    private final com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource = null;
    private final com.cashgate.data.repository.fetch_form.mapper.FormsMapper formsMapper = null;
    private final com.cashgate.data.repository.fetch_form.mapper.AmenitiesMapper amenitiesMapper = null;
    private final com.cashgate.data.repository.fetch_form.mapper.StorePropertyMapper storePropertyMapper = null;
    private final android.content.Context context = null;
    private final java.lang.String apiURL = null;
    private final java.lang.String apiSecret = null;
    private final com.cashgate.core.util.AppPreferences appPreferences = null;
    
    @javax.inject.Inject
    public GetFormRepositoryImp(@org.jetbrains.annotations.NotNull
    com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource, @org.jetbrains.annotations.NotNull
    com.cashgate.data.repository.fetch_form.mapper.FormsMapper formsMapper, @org.jetbrains.annotations.NotNull
    com.cashgate.data.repository.fetch_form.mapper.AmenitiesMapper amenitiesMapper, @org.jetbrains.annotations.NotNull
    com.cashgate.data.repository.fetch_form.mapper.StorePropertyMapper storePropertyMapper, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "baseURL")
    java.lang.String apiURL, @org.jetbrains.annotations.NotNull
    java.lang.String apiSecret, @org.jetbrains.annotations.NotNull
    com.cashgate.core.util.AppPreferences appPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.cashgate.core.network.sources.ApiRemoteDataSource getApiRemoteDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getForms(int categoryId, int steps, @org.jetbrains.annotations.NotNull
    java.lang.String header, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<com.cashgate.core.responses.fetch_forms.FetchFormEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAmenities(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<com.cashgate.core.responses.amenities.AmenitiesEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object storeProperty(@org.jetbrains.annotations.NotNull
    org.json.JSONObject args, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<com.cashgate.core.responses.store_property.StorePropertyEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull
    java.io.File file, int id, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.responses.images.UploadImageEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteImage(@org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.WorkerThread
    @java.lang.Override
    public java.lang.Object getAddressFromLatLon(double longitude, double latitude, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getPropertyPaymentIntent(int categoryID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.responses.property_intent.GetPropertyIntent>> continuation) {
        return null;
    }
}