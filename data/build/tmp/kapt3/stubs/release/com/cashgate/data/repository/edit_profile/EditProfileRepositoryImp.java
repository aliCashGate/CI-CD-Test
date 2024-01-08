package com.cashgate.data.repository.edit_profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J-\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/cashgate/data/repository/edit_profile/EditProfileRepositoryImp;", "Lcom/cashgate/domain/respository/profile/EditProfileRepository;", "apiRemoteDataSource", "Lcom/cashgate/core/network/sources/ApiRemoteDataSource;", "updateUserMapper", "Lcom/cashgate/data/repository/edit_profile/mapper/UpdateUserMapper;", "(Lcom/cashgate/core/network/sources/ApiRemoteDataSource;Lcom/cashgate/data/repository/edit_profile/mapper/UpdateUserMapper;)V", "getApiRemoteDataSource", "()Lcom/cashgate/core/network/sources/ApiRemoteDataSource;", "updateUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/cashgate/core/network/Resource;", "Lcom/cashgate/core/responses/login/User;", "args", "Lorg/json/JSONObject;", "userID", "", "(Lorg/json/JSONObject;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"})
public final class EditProfileRepositoryImp implements com.cashgate.domain.respository.profile.EditProfileRepository {
    @org.jetbrains.annotations.NotNull
    private final com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource = null;
    private final com.cashgate.data.repository.edit_profile.mapper.UpdateUserMapper updateUserMapper = null;
    
    @javax.inject.Inject
    public EditProfileRepositoryImp(@org.jetbrains.annotations.NotNull
    com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource, @org.jetbrains.annotations.NotNull
    com.cashgate.data.repository.edit_profile.mapper.UpdateUserMapper updateUserMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.cashgate.core.network.sources.ApiRemoteDataSource getApiRemoteDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateUser(@org.jetbrains.annotations.NotNull
    org.json.JSONObject args, int userID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<com.cashgate.core.responses.login.User>>> continuation) {
        return null;
    }
}