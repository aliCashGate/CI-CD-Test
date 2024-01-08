package com.cashgate.feature_profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aZ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0007\u001a\"\u0010\u0012\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\b\u0010\u0013\u001a\u00020\u0001H\u0007\u00a8\u0006\u0014"}, d2 = {"ProfileContent", "", "user", "Lcom/cashgate/core/responses/login/User;", "deleteUserState", "Lcom/cashgate/feature_profile/entities/DeleteUserEntity;", "profileViewModel", "Lcom/cashgate/feature_profile/ProfileViewModel;", "navHostController", "Landroidx/navigation/NavHostController;", "properties", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/cashgate/core/responses/home/properties/Property;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "onLogoutClick", "Lkotlin/Function0;", "onDeleteClick", "ProfileScreen", "ProfileScreenPreview", "feature_profile_release"})
public final class ProfileScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void ProfileScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navHostController, @org.jetbrains.annotations.NotNull
    androidx.compose.foundation.layout.PaddingValues paddingValues, @org.jetbrains.annotations.NotNull
    com.cashgate.feature_profile.ProfileViewModel profileViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ProfileContent(@org.jetbrains.annotations.NotNull
    com.cashgate.core.responses.login.User user, @org.jetbrains.annotations.NotNull
    com.cashgate.feature_profile.entities.DeleteUserEntity deleteUserState, @org.jetbrains.annotations.NotNull
    com.cashgate.feature_profile.ProfileViewModel profileViewModel, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navHostController, @org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.cashgate.core.responses.home.properties.Property> properties, @org.jetbrains.annotations.NotNull
    androidx.compose.foundation.layout.PaddingValues paddingValues, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onLogoutClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteClick) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, backgroundColor = 4294967295L, showSystemUi = true, device = "id:pixel_5")
    public static final void ProfileScreenPreview() {
    }
}