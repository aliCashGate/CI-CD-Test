package com.cashgate.feature_auth.presentation.ui.otp;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001cJ1\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J>\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/cashgate/feature_auth/presentation/ui/otp/OtpViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "otpVerificationUseCase", "Lcom/cashgate/domain/usecases/auth/otp/OTPVerificationUseCase;", "registerWithPhoneNumUseCase", "Lcom/cashgate/domain/usecases/auth/otp/RegisterWithPhoneNumUseCase;", "(Landroid/content/Context;Lcom/cashgate/domain/usecases/auth/otp/OTPVerificationUseCase;Lcom/cashgate/domain/usecases/auth/otp/RegisterWithPhoneNumUseCase;)V", "_otpState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cashgate/feature_auth/presentation/ui/otp/uistates/OtpScreenUiState;", "_registerState", "Lcom/cashgate/feature_auth/presentation/ui/register/uistates/RegisterUIState;", "getContext", "()Landroid/content/Context;", "otpState", "Lkotlinx/coroutines/flow/StateFlow;", "getOtpState", "()Lkotlinx/coroutines/flow/StateFlow;", "registerState", "getRegisterState", "navigateToMainScreen", "", "navController", "Landroidx/navigation/NavHostController;", "onErrorState", "error", "", "onRegisterErrorState", "errorState", "registerWithPhoneNumRequest", "firstName", "lastName", "password", "phoneNum", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyOtp", "verificationCode", "otp", "isForgetPassword", "", "feature_auth_debug"})
public final class OtpViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final com.cashgate.domain.usecases.auth.otp.OTPVerificationUseCase otpVerificationUseCase = null;
    private final com.cashgate.domain.usecases.auth.otp.RegisterWithPhoneNumUseCase registerWithPhoneNumUseCase = null;
    private kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_auth.presentation.ui.otp.uistates.OtpScreenUiState> _otpState;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.otp.uistates.OtpScreenUiState> otpState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_auth.presentation.ui.register.uistates.RegisterUIState> _registerState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.register.uistates.RegisterUIState> registerState = null;
    
    @javax.inject.Inject
    public OtpViewModel(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.auth.otp.OTPVerificationUseCase otpVerificationUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.auth.otp.RegisterWithPhoneNumUseCase registerWithPhoneNumUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.otp.uistates.OtpScreenUiState> getOtpState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.register.uistates.RegisterUIState> getRegisterState() {
        return null;
    }
    
    public final void verifyOtp(@org.jetbrains.annotations.NotNull
    java.lang.String verificationCode, @org.jetbrains.annotations.NotNull
    java.lang.String otp, @org.jetbrains.annotations.NotNull
    java.lang.String firstName, @org.jetbrains.annotations.NotNull
    java.lang.String lastName, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNum, boolean isForgetPassword) {
    }
    
    public final void onErrorState(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
    
    public final void onRegisterErrorState(@org.jetbrains.annotations.NotNull
    java.lang.String errorState) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object registerWithPhoneNumRequest(@org.jetbrains.annotations.NotNull
    java.lang.String firstName, @org.jetbrains.annotations.NotNull
    java.lang.String lastName, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNum, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void navigateToMainScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
}