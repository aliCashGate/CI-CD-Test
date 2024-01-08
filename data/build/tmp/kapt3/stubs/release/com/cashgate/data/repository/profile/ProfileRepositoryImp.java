package com.cashgate.data.repository.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/cashgate/data/repository/profile/ProfileRepositoryImp;", "Lcom/cashgate/domain/respository/profile/ProfileRepository;", "apiRemoteDataSource", "Lcom/cashgate/core/network/sources/ApiRemoteDataSource;", "(Lcom/cashgate/core/network/sources/ApiRemoteDataSource;)V", "getApiRemoteDataSource", "()Lcom/cashgate/core/network/sources/ApiRemoteDataSource;", "deleteUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/cashgate/core/network/Resource;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"})
public final class ProfileRepositoryImp implements com.cashgate.domain.respository.profile.ProfileRepository {
    @org.jetbrains.annotations.NotNull
    private final com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource = null;
    
    @javax.inject.Inject
    public ProfileRepositoryImp(@org.jetbrains.annotations.NotNull
    com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.cashgate.core.network.sources.ApiRemoteDataSource getApiRemoteDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.WorkerThread
    @java.lang.Override
    public java.lang.Object deleteUser(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<java.lang.String>>> continuation) {
        return null;
    }
}