package com.cashgate.data.repository.intro;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/cashgate/data/repository/intro/IntroRepositoryImpl;", "Lcom/cashgate/domain/respository/intro/IntroRepository;", "appPreferences", "Lcom/cashgate/core/util/AppPreferences;", "apiURL", "", "(Lcom/cashgate/core/util/AppPreferences;Ljava/lang/String;)V", "refreshToken", "Lkotlinx/coroutines/flow/Flow;", "Lcom/cashgate/core/responses/refresh_token/RefreshTokenEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyToken", "", "data_release"})
public final class IntroRepositoryImpl implements com.cashgate.domain.respository.intro.IntroRepository {
    private final com.cashgate.core.util.AppPreferences appPreferences = null;
    private final java.lang.String apiURL = null;
    
    @javax.inject.Inject
    public IntroRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.cashgate.core.util.AppPreferences appPreferences, @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "baseURL")
    java.lang.String apiURL) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object verifyToken(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Boolean>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object refreshToken(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.responses.refresh_token.RefreshTokenEntity>> continuation) {
        return null;
    }
}