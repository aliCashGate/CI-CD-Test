package com.cashgate.domain.respository.auth.forget_password;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/cashgate/domain/respository/auth/forget_password/ForgetPasswordRepository;", "", "updatePassword", "Lkotlinx/coroutines/flow/Flow;", "Lcom/cashgate/core/network/Resource;", "Lcom/cashgate/core/responses/forget_password/UpdatePasswordEntity;", "password", "", "token", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"})
public abstract interface ForgetPasswordRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updatePassword(@org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<com.cashgate.core.responses.forget_password.UpdatePasswordEntity>>> continuation);
}