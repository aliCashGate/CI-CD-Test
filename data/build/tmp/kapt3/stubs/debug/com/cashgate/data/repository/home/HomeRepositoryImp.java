package com.cashgate.data.repository.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JK\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/cashgate/data/repository/home/HomeRepositoryImp;", "Lcom/cashgate/domain/respository/home/HomeRepository;", "apiRemoteDataSource", "Lcom/cashgate/core/network/sources/ApiRemoteDataSource;", "categoriesMapper", "Lcom/cashgate/data/repository/home/mapper/CategoriesMapper;", "(Lcom/cashgate/core/network/sources/ApiRemoteDataSource;Lcom/cashgate/data/repository/home/mapper/CategoriesMapper;)V", "getCategories", "Lkotlinx/coroutines/flow/Flow;", "Lcom/cashgate/core/network/Resource;", "Lcom/cashgate/core/responses/home/CategoriesEntity;", "showScreen", "", "afl", "categoryId", "header", "", "includeChild", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeList", "Lcom/cashgate/core/responses/home/HomeListEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class HomeRepositoryImp implements com.cashgate.domain.respository.home.HomeRepository {
    private final com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource = null;
    private final com.cashgate.data.repository.home.mapper.CategoriesMapper categoriesMapper = null;
    
    @javax.inject.Inject
    public HomeRepositoryImp(@org.jetbrains.annotations.NotNull
    com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource, @org.jetbrains.annotations.NotNull
    com.cashgate.data.repository.home.mapper.CategoriesMapper categoriesMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCategories(@org.jetbrains.annotations.Nullable
    java.lang.Integer showScreen, @org.jetbrains.annotations.Nullable
    java.lang.Integer afl, @org.jetbrains.annotations.Nullable
    java.lang.Integer categoryId, @org.jetbrains.annotations.NotNull
    java.lang.String header, boolean includeChild, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<com.cashgate.core.responses.home.CategoriesEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getHomeList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.responses.home.HomeListEntity>> continuation) {
        return null;
    }
}