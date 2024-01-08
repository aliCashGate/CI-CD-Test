package com.cashgate.domain.respository.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/cashgate/domain/respository/profile/EditProfileRepository;", "", "updateUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/cashgate/core/network/Resource;", "Lcom/cashgate/core/responses/login/User;", "args", "Lorg/json/JSONObject;", "userID", "", "(Lorg/json/JSONObject;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"})
public abstract interface EditProfileRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateUser(@org.jetbrains.annotations.NotNull
    org.json.JSONObject args, int userID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<com.cashgate.core.responses.login.User>>> continuation);
}