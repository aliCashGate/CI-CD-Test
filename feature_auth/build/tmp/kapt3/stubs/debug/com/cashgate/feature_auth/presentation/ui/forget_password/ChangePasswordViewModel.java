package com.cashgate.feature_auth.presentation.ui.forget_password;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0016J!\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/cashgate/feature_auth/presentation/ui/forget_password/ChangePasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/content/Context;", "updatePasswordUseCase", "Lcom/cashgate/domain/usecases/auth/forget_password/UpdatePasswordUseCase;", "(Landroid/content/Context;Lcom/cashgate/domain/usecases/auth/forget_password/UpdatePasswordUseCase;)V", "_updatePassword", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cashgate/feature_auth/presentation/ui/forget_password/uistates/UpdatePasswordUIState;", "getApplication", "()Landroid/content/Context;", "updatePassword", "Lkotlinx/coroutines/flow/StateFlow;", "getUpdatePassword", "()Lkotlinx/coroutines/flow/StateFlow;", "navigateToMainScreen", "", "navController", "Landroidx/navigation/NavHostController;", "onChangePassword", "password", "", "confrimPassword", "token", "onErrorState", "error", "updatePasswordRequest", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_auth_debug"})
public final class ChangePasswordViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context application = null;
    private final com.cashgate.domain.usecases.auth.forget_password.UpdatePasswordUseCase updatePasswordUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_auth.presentation.ui.forget_password.uistates.UpdatePasswordUIState> _updatePassword = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.forget_password.uistates.UpdatePasswordUIState> updatePassword = null;
    
    @javax.inject.Inject
    public ChangePasswordViewModel(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context application, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.auth.forget_password.UpdatePasswordUseCase updatePasswordUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_auth.presentation.ui.forget_password.uistates.UpdatePasswordUIState> getUpdatePassword() {
        return null;
    }
    
    public final void onChangePassword(@org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String confrimPassword, @org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
    
    public final void onErrorState(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
    
    private final java.lang.Object updatePasswordRequest(java.lang.String password, java.lang.String token, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void navigateToMainScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
}