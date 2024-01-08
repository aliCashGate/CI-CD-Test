package com.cashgate.data.repository.seeall;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/cashgate/data/repository/seeall/SeeAllRepositoryImp;", "Lcom/cashgate/domain/respository/seeall/SeeAllRepository;", "apiRemoteDataSource", "Lcom/cashgate/core/network/sources/ApiRemoteDataSource;", "propertiesMapper", "Lcom/cashgate/data/repository/home/mapper/PropertiesMapper;", "(Lcom/cashgate/core/network/sources/ApiRemoteDataSource;Lcom/cashgate/data/repository/home/mapper/PropertiesMapper;)V", "getProperties", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/cashgate/core/responses/home/properties/Property;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"})
public final class SeeAllRepositoryImp implements com.cashgate.domain.respository.seeall.SeeAllRepository {
    private final com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource = null;
    private final com.cashgate.data.repository.home.mapper.PropertiesMapper propertiesMapper = null;
    
    @javax.inject.Inject
    public SeeAllRepositoryImp(@org.jetbrains.annotations.NotNull
    com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource, @org.jetbrains.annotations.NotNull
    com.cashgate.data.repository.home.mapper.PropertiesMapper propertiesMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getProperties(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.cashgate.core.responses.home.properties.Property>>> continuation) {
        return null;
    }
}