package com.cashgate.feature_auth.presentation.ui.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u00a6\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a\b\u0010\u0013\u001a\u00020\u0001H\u0007\u001a\u001c\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\u0016\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018\u00a8\u0006\u0019"}, d2 = {"CheckBoxWithText", "", "Content", "firstName", "", "lastName", "email", "phoneNum", "password", "registerViewModel", "Lcom/cashgate/feature_auth/presentation/ui/register/RegisterViewModel;", "navContoller", "Landroidx/navigation/NavHostController;", "onValueFirstNameChange", "Lkotlin/Function1;", "onValueLastNameChange", "onValueEmailChange", "onValuePhoneChange", "onValuePasswordChange", "LoginScreenPreview", "RegisterScreen", "navController", "navigateToOTPScreen", "user", "Lcom/cashgate/feature_auth/models/User;", "feature_auth_debug"})
public final class RegisterScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.ui.ExperimentalComposeUiApi.class})
    public static final void RegisterScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    com.cashgate.feature_auth.presentation.ui.register.RegisterViewModel registerViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Content(@org.jetbrains.annotations.NotNull
    java.lang.String firstName, @org.jetbrains.annotations.NotNull
    java.lang.String lastName, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNum, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    com.cashgate.feature_auth.presentation.ui.register.RegisterViewModel registerViewModel, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navContoller, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueFirstNameChange, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueLastNameChange, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueEmailChange, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValuePhoneChange, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValuePasswordChange) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CheckBoxWithText() {
    }
    
    public static final void navigateToOTPScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    com.cashgate.feature_auth.models.User user) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void LoginScreenPreview() {
    }
}