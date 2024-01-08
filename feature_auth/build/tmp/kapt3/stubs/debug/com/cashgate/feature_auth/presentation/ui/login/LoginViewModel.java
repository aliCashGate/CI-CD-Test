package com.cashgate.feature_auth.presentation.ui.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ)\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0015J\u0006\u0010\u001e\u001a\u00020\u0013J&\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/cashgate/feature_auth/presentation/ui/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/content/Context;", "loginWithEmailUseCase", "Lcom/cashgate/domain/usecases/auth/login/LoginWithEmailUseCase;", "appPreferences", "Lcom/cashgate/core/util/AppPreferences;", "(Landroid/content/Context;Lcom/cashgate/domain/usecases/auth/login/LoginWithEmailUseCase;Lcom/cashgate/core/util/AppPreferences;)V", "_loginState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cashgate/feature_auth/presentation/ui/login/uistates/LoginUIState;", "getApplication", "()Landroid/content/Context;", "loginState", "Lkotlinx/coroutines/flow/StateFlow;", "getLoginState", "()Lkotlinx/coroutines/flow/StateFlow;", "loginRequest", "", "email", "", "phoneNum", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "navigateToMainScreen", "navController", "Landroidx/navigation/NavHostController;", "onErrorState", "error", "onLoadingState", "onLogin", "isEmail", "", "feature_auth_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context application = null;
    private final com.cashgate.domain.usecases.auth.login.LoginWithEmailUseCase loginWithEmailUseCase = null;
    private final com.cashgate.core.util.AppPreferences appPreferences = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_auth.presentation.ui.login.uistates.LoginUIState> _loginState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.login.uistates.LoginUIState> loginState = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context application, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.auth.login.LoginWithEmailUseCase loginWithEmailUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.core.util.AppPreferences appPreferences) {
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
    
    public final void onLogin(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNum, @org.jetbrains.annotations.NotNull
    java.lang.String password, boolean isEmail) {
    }
    
    public final void onErrorState(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
    
    public final void onLoadingState() {
    }
    
    private final java.lang.Object loginRequest(java.lang.String email, java.lang.String phoneNum, java.lang.String password, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void navigateToMainScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
}