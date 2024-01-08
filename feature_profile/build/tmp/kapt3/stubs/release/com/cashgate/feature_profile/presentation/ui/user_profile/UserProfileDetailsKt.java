package com.cashgate.feature_profile.presentation.ui.user_profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a\b\u0010\t\u001a\u00020\u0001H\u0007\u001aB\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u00a8\u0006\u0012"}, d2 = {"ProfileListItem", "", "drawable", "", "text", "showNextButton", "", "onItemClick", "Lkotlin/Function0;", "ProfileScreenPreview", "UserProfileDetails", "navHostController", "Landroidx/navigation/NavHostController;", "user", "Lcom/cashgate/core/responses/login/User;", "onLogoutClick", "onDeleteClick", "onEditClick", "feature_profile_release"})
public final class UserProfileDetailsKt {
    
    @androidx.compose.runtime.Composable
    public static final void UserProfileDetails(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navHostController, @org.jetbrains.annotations.NotNull
    com.cashgate.core.responses.login.User user, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onLogoutClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onEditClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ProfileListItem(@androidx.annotation.DrawableRes
    int drawable, @androidx.annotation.StringRes
    int text, boolean showNextButton, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, backgroundColor = 4294967295L, showSystemUi = true, device = "id:pixel_5")
    public static final void ProfileScreenPreview() {
    }
}