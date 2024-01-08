package com.cashgate.domain.respository.get_form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J5\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e0\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\u001a\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\b2\u0006\u0010\u001e\u001a\u00020\u001fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J/\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/cashgate/domain/respository/get_form/GetFormRepository;", "", "deleteImage", "", "fileName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddressFromLatLon", "Lkotlinx/coroutines/flow/Flow;", "longitude", "", "latitude", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAmenities", "Lcom/cashgate/core/network/Resource;", "Lcom/cashgate/core/responses/amenities/AmenitiesEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForms", "Lcom/cashgate/core/responses/fetch_forms/FetchFormEntity;", "categoryId", "", "steps", "header", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPropertyPaymentIntent", "Lcom/cashgate/core/responses/property_intent/GetPropertyIntent;", "categoryID", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeProperty", "Lcom/cashgate/core/responses/store_property/StorePropertyEntity;", "args", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImage", "Lcom/cashgate/core/responses/images/UploadImageEntity;", "file", "Ljava/io/File;", "id", "type", "(Ljava/io/File;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"})
public abstract interface GetFormRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getForms(int categoryId, int steps, @org.jetbrains.annotations.NotNull
    java.lang.String header, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<com.cashgate.core.responses.fetch_forms.FetchFormEntity>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAmenities(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<com.cashgate.core.responses.amenities.AmenitiesEntity>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object storeProperty(@org.jetbrains.annotations.NotNull
    org.json.JSONObject args, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<com.cashgate.core.responses.store_property.StorePropertyEntity>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull
    java.io.File file, int id, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.responses.images.UploadImageEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteImage(@org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAddressFromLatLon(double longitude, double latitude, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPropertyPaymentIntent(int categoryID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.responses.property_intent.GetPropertyIntent>> continuation);
}