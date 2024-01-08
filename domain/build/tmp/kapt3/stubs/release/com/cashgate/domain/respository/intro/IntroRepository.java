package com.cashgate.domain.respository.intro;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/cashgate/domain/respository/intro/IntroRepository;", "", "refreshToken", "Lkotlinx/coroutines/flow/Flow;", "Lcom/cashgate/core/responses/refresh_token/RefreshTokenEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyToken", "", "domain_release"})
public abstract interface IntroRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object verifyToken(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Boolean>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object refreshToken(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.responses.refresh_token.RefreshTokenEntity>> continuation);
}