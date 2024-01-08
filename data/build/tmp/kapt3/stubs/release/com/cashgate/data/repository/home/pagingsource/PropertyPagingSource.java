package com.cashgate.data.repository.home.pagingsource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\rH\u0017\u00a2\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/cashgate/data/repository/home/pagingsource/PropertyPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/cashgate/core/responses/home/properties/Property;", "apiRemoteDataSource", "Lcom/cashgate/core/network/sources/ApiRemoteDataSource;", "propertiesMapper", "Lcom/cashgate/data/repository/home/mapper/PropertiesMapper;", "userID", "", "(Lcom/cashgate/core/network/sources/ApiRemoteDataSource;Lcom/cashgate/data/repository/home/mapper/PropertiesMapper;Ljava/lang/String;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"})
public final class PropertyPagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.cashgate.core.responses.home.properties.Property> {
    private final com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource = null;
    private final com.cashgate.data.repository.home.mapper.PropertiesMapper propertiesMapper = null;
    private final java.lang.String userID = null;
    
    public PropertyPagingSource(@org.jetbrains.annotations.NotNull
    com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource, @org.jetbrains.annotations.NotNull
    com.cashgate.data.repository.home.mapper.PropertiesMapper propertiesMapper, @org.jetbrains.annotations.Nullable
    java.lang.String userID) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.WorkerThread
    @java.lang.Override
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingState<java.lang.Integer, com.cashgate.core.responses.home.properties.Property> state) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.WorkerThread
    @java.lang.Override
    public java.lang.Object load(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.cashgate.core.responses.home.properties.Property>> continuation) {
        return null;
    }
}