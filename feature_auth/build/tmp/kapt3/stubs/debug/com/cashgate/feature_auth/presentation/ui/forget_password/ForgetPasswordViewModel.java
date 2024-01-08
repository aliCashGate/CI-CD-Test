package com.cashgate.feature_auth.presentation.ui.forget_password;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ)\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001fJ\u000e\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001fJ\u001e\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020(J\u0016\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010,\u001a\u00020\u001dJ!\u0010-\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\u0006\u0010 \u001a\u00020\u001fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J)\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u001fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00063"}, d2 = {"Lcom/cashgate/feature_auth/presentation/ui/forget_password/ForgetPasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/content/Context;", "loginWithEmailUseCase", "Lcom/cashgate/domain/usecases/auth/login/LoginWithEmailUseCase;", "verifyUserUseCase", "Lcom/cashgate/domain/usecases/auth/otp/VerifyUserUseCase;", "registerWithPhoneNumUseCase", "Lcom/cashgate/domain/usecases/auth/register/RegisterWithFirebasePhoneNumUseCase;", "(Landroid/content/Context;Lcom/cashgate/domain/usecases/auth/login/LoginWithEmailUseCase;Lcom/cashgate/domain/usecases/auth/otp/VerifyUserUseCase;Lcom/cashgate/domain/usecases/auth/register/RegisterWithFirebasePhoneNumUseCase;)V", "_loginState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cashgate/feature_auth/presentation/ui/login/uistates/LoginUIState;", "_registerWithPhoneState", "Lcom/cashgate/feature_auth/presentation/ui/register/uistates/RegisterWithPhoneUiStates;", "_verifyUserState", "Lcom/cashgate/feature_auth/presentation/ui/otp/uistates/UserVerificationUiState;", "getApplication", "()Landroid/content/Context;", "loginState", "Lkotlinx/coroutines/flow/StateFlow;", "getLoginState", "()Lkotlinx/coroutines/flow/StateFlow;", "registerWithPhoneState", "getRegisterWithPhoneState", "verifyUserState", "getVerifyUserState", "loginRequest", "", "email", "", "phoneNum", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onErrorState", "error", "onErrorUserVerification", "onForgetEmail", "isEmail", "", "onForgetPhone", "activity", "Landroid/app/Activity;", "onLoadingState", "registerWithPhoneNumRequest", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyUserRequest", "type", "value", "header", "feature_auth_debug"})
public final class ForgetPasswordViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context application = null;
    private final com.cashgate.domain.usecases.auth.login.LoginWithEmailUseCase loginWithEmailUseCase = null;
    private final com.cashgate.domain.usecases.auth.otp.VerifyUserUseCase verifyUserUseCase = null;
    private final com.cashgate.domain.usecases.auth.register.RegisterWithFirebasePhoneNumUseCase registerWithPhoneNumUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_auth.presentation.ui.login.uistates.LoginUIState> _loginState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.login.uistates.LoginUIState> loginState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_auth.presentation.ui.otp.uistates.UserVerificationUiState> _verifyUserState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.otp.uistates.UserVerificationUiState> verifyUserState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_auth.presentation.ui.register.uistates.RegisterWithPhoneUiStates> _registerWithPhoneState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.register.uistates.RegisterWithPhoneUiStates> registerWithPhoneState = null;
    
    @javax.inject.Inject
    public ForgetPasswordViewModel(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context application, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.auth.login.LoginWithEmailUseCase loginWithEmailUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.auth.otp.VerifyUserUseCase verifyUserUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.auth.register.RegisterWithFirebasePhoneNumUseCase registerWithPhoneNumUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.login.uistates.LoginUIState> getLoginState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.otp.uistates.UserVerificationUiState> getVerifyUserState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.register.uistates.RegisterWithPhoneUiStates> getRegisterWithPhoneState() {
        return null;
    }
    
    public final void onErrorState(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
    
    public final void onErrorUserVerification(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
    
    public final void onLoadingState() {
    }
    
    private final java.lang.Object loginRequest(java.lang.String email, java.lang.String phoneNum, java.lang.String password, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void onForgetPhone(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNum) {
    }
    
    public final void onForgetEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNum, boolean isEmail) {
    }
    
    private final java.lang.Object verifyUserRequest(java.lang.String type, java.lang.String value, java.lang.String header, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object registerWithPhoneNumRequest(android.app.Activity activity, java.lang.String phoneNum, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}