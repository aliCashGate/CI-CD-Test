package com.cashgate.domain.usecases.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JK\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/cashgate/domain/usecases/home/GetCategoriesUseCase;", "", "homeRepository", "Lcom/cashgate/domain/respository/home/HomeRepository;", "(Lcom/cashgate/domain/respository/home/HomeRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/cashgate/core/network/Resource;", "Lcom/cashgate/core/responses/home/CategoriesEntity;", "showScreen", "", "afl", "categoryId", "header", "", "includeChild", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"})
public final class GetCategoriesUseCase {
    private final com.cashgate.domain.respository.home.HomeRepository homeRepository = null;
    
    @javax.inject.Inject
    public GetCategoriesUseCase(@org.jetbrains.annotations.NotNull
    com.cashgate.domain.respository.home.HomeRepository homeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.Nullable
    java.lang.Integer showScreen, @org.jetbrains.annotations.Nullable
    java.lang.Integer afl, @org.jetbrains.annotations.Nullable
    java.lang.Integer categoryId, @org.jetbrains.annotations.NotNull
    java.lang.String header, boolean includeChild, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<com.cashgate.core.responses.home.CategoriesEntity>>> continuation) {
        return null;
    }
}