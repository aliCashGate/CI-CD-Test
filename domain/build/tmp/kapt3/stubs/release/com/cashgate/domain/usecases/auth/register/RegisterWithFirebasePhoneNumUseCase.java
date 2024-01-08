package com.cashgate.domain.usecases.auth.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/cashgate/domain/usecases/auth/register/RegisterWithFirebasePhoneNumUseCase;", "", "registerRepository", "Lcom/cashgate/domain/respository/auth/register/RegisterRepository;", "(Lcom/cashgate/domain/respository/auth/register/RegisterRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/cashgate/core/network/Resource;", "", "activity", "Landroid/app/Activity;", "phoneNum", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"})
public final class RegisterWithFirebasePhoneNumUseCase {
    private final com.cashgate.domain.respository.auth.register.RegisterRepository registerRepository = null;
    
    @javax.inject.Inject
    public RegisterWithFirebasePhoneNumUseCase(@org.jetbrains.annotations.NotNull
    com.cashgate.domain.respository.auth.register.RegisterRepository registerRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNum, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.cashgate.core.network.Resource<java.lang.String>>> continuation) {
        return null;
    }
}