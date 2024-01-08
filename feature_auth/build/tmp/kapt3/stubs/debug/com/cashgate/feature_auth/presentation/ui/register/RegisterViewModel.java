package com.cashgate.feature_auth.presentation.ui.register;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\u001fJF\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\'2\u0006\u0010-\u001a\u00020\'2\u0006\u0010.\u001a\u00020\'2\u0006\u0010/\u001a\u00020\'2\u0006\u00100\u001a\u00020\'2\u0006\u00101\u001a\u0002022\u0006\u0010 \u001a\u00020!J9\u00103\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\'2\u0006\u0010-\u001a\u00020\'2\u0006\u0010.\u001a\u00020\'2\u0006\u0010/\u001a\u00020\'2\u0006\u00100\u001a\u00020\'H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104JA\u00105\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\'2\u0006\u0010-\u001a\u00020\'2\u0006\u0010/\u001a\u00020\'2\u0006\u00100\u001a\u00020\'2\u0006\u0010 \u001a\u00020!H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106JY\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\'2\u0006\u00109\u001a\u00020\'2\u0006\u0010:\u001a\u00020\'2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\'2\u0006\u0010-\u001a\u00020\'2\u0006\u0010/\u001a\u00020\'2\u0006\u00100\u001a\u00020\'2\u0006\u0010 \u001a\u00020!H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006<"}, d2 = {"Lcom/cashgate/feature_auth/presentation/ui/register/RegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/content/Context;", "registerWithEmailUseCase", "Lcom/cashgate/domain/usecases/auth/register/RegisterWithEmailUseCase;", "registerWithPhoneNumUseCase", "Lcom/cashgate/domain/usecases/auth/register/RegisterWithFirebasePhoneNumUseCase;", "verifyUserUseCase", "Lcom/cashgate/domain/usecases/auth/otp/VerifyUserUseCase;", "appPreferences", "Lcom/cashgate/core/util/AppPreferences;", "(Landroid/content/Context;Lcom/cashgate/domain/usecases/auth/register/RegisterWithEmailUseCase;Lcom/cashgate/domain/usecases/auth/register/RegisterWithFirebasePhoneNumUseCase;Lcom/cashgate/domain/usecases/auth/otp/VerifyUserUseCase;Lcom/cashgate/core/util/AppPreferences;)V", "_registerState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cashgate/feature_auth/presentation/ui/register/uistates/RegisterUIState;", "_registerWithPhoneState", "Lcom/cashgate/feature_auth/presentation/ui/register/uistates/RegisterWithPhoneUiStates;", "_verifyUserState", "Lcom/cashgate/feature_auth/presentation/ui/otp/uistates/UserVerificationUiState;", "getApplication", "()Landroid/content/Context;", "registerState", "Lkotlinx/coroutines/flow/StateFlow;", "getRegisterState", "()Lkotlinx/coroutines/flow/StateFlow;", "registerWithPhoneState", "getRegisterWithPhoneState", "verifyUserState", "getVerifyUserState", "navigateToMainScreen", "", "navController", "Landroidx/navigation/NavHostController;", "navigateToOTPScreen", "user", "Lcom/cashgate/feature_auth/models/User;", "onErrorState", "error", "", "onPhoneLoadingState", "onRegister", "activity", "Landroid/app/Activity;", "firstName", "lastName", "email", "password", "phoneNum", "isEmail", "", "registerUserRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWithPhoneNumRequest", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyUserRequest", "type", "value", "header", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_auth_debug"})
public final class RegisterViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context application = null;
    private final com.cashgate.domain.usecases.auth.register.RegisterWithEmailUseCase registerWithEmailUseCase = null;
    private final com.cashgate.domain.usecases.auth.register.RegisterWithFirebasePhoneNumUseCase registerWithPhoneNumUseCase = null;
    private final com.cashgate.domain.usecases.auth.otp.VerifyUserUseCase verifyUserUseCase = null;
    private final com.cashgate.core.util.AppPreferences appPreferences = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_auth.presentation.ui.register.uistates.RegisterUIState> _registerState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.register.uistates.RegisterUIState> registerState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_auth.presentation.ui.register.uistates.RegisterWithPhoneUiStates> _registerWithPhoneState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.register.uistates.RegisterWithPhoneUiStates> registerWithPhoneState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_auth.presentation.ui.otp.uistates.UserVerificationUiState> _verifyUserState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.otp.uistates.UserVerificationUiState> verifyUserState = null;
    
    @javax.inject.Inject
    public RegisterViewModel(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context application, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.auth.register.RegisterWithEmailUseCase registerWithEmailUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.auth.register.RegisterWithFirebasePhoneNumUseCase registerWithPhoneNumUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.auth.otp.VerifyUserUseCase verifyUserUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.core.util.AppPreferences appPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.register.uistates.RegisterUIState> getRegisterState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.register.uistates.RegisterWithPhoneUiStates> getRegisterWithPhoneState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.otp.uistates.UserVerificationUiState> getVerifyUserState() {
        return null;
    }
    
    public final void onRegister(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String firstName, @org.jetbrains.annotations.NotNull
    java.lang.String lastName, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNum, boolean isEmail, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
    
    private final java.lang.Object verifyUserRequest(java.lang.String type, java.lang.String value, java.lang.String header, android.app.Activity activity, java.lang.String firstName, java.lang.String lastName, java.lang.String password, java.lang.String phoneNum, androidx.navigation.NavHostController navController, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void onErrorState(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
    
    public final void onPhoneLoadingState() {
    }
    
    private final java.lang.Object registerUserRequest(java.lang.String firstName, java.lang.String lastName, java.lang.String email, java.lang.String password, java.lang.String phoneNum, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object registerWithPhoneNumRequest(android.app.Activity activity, java.lang.String firstName, java.lang.String lastName, java.lang.String password, java.lang.String phoneNum, androidx.navigation.NavHostController navController, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void navigateToMainScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
    
    public final void navigateToOTPScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    com.cashgate.feature_auth.models.User user) {
    }
}