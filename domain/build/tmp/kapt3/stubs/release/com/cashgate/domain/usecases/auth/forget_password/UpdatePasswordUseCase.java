package com.cashgate.domain.usecases.auth.forget_password;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/cashgate/domain/usecases/auth/forget_password/UpdatePasswordUseCase;", "", "forgetPasswordRepository", "Lcom/cashgate/domain/respository/auth/forget_password/ForgetPasswordRepository;", "(Lcom/cashgate/domain/respository/auth/forget_password/ForgetPasswordRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/cashgate/core/network/Resource;", "Lcom/cashgate/core/responses/forget_password/UpdatePasswordEntity;", "password", "", "token", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"})
public final class UpdatePasswordUseCase {
    private final com.cashgate.domain.respository.auth.forget_password.ForgetPasswordRepository forgetPasswordRepository = null;
    
    @javax.inject.Inject
    public UpdatePasswordUseCase(@org.jetbrains.annotations.NotNull
    com.cashgate.domain.respository.auth.forget_password.ForgetPasswordRepository forgetPasswordRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<com.cashgate.core.responses.forget_password.UpdatePasswordEntity>>> continuation) {
        return null;
    }
}