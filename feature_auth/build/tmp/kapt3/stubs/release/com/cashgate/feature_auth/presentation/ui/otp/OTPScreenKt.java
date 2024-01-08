package com.cashgate.feature_auth.presentation.ui.otp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0007\u001a$\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a*\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011H\u0007\u001a>\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00032\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011H\u0007\u00a8\u0006\u0019"}, d2 = {"CharView", "", "index", "", "text", "", "LoginScreenPreview", "OTPScreen", "user", "Lcom/cashgate/feature_auth/models/User;", "navController", "Landroidx/navigation/NavHostController;", "otpViewModel", "Lcom/cashgate/feature_auth/presentation/ui/otp/OtpViewModel;", "OtpInput", "otpValue", "onValueChange", "Lkotlin/Function2;", "", "OtpTextField", "modifier", "Landroidx/compose/ui/Modifier;", "otpText", "otpCount", "onOtpTextChange", "feature_auth_release"})
public final class OTPScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.ui.ExperimentalComposeUiApi.class})
    public static final void OTPScreen(@org.jetbrains.annotations.NotNull
    com.cashgate.feature_auth.models.User user, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    com.cashgate.feature_auth.presentation.ui.otp.OtpViewModel otpViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void OtpInput(@org.jetbrains.annotations.NotNull
    java.lang.String otpValue, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> onValueChange) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void OtpTextField(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String otpText, int otpCount, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> onOtpTextChange) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void CharView(int index, java.lang.String text) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void LoginScreenPreview() {
    }
}