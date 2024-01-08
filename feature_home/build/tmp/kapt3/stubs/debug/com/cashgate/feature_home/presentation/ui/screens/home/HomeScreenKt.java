package com.cashgate.feature_home.presentation.ui.screens.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u0007\u001a:\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0007\u001a\b\u0010\u0016\u001a\u00020\u0001H\u0007\u00a8\u0006\u0017"}, d2 = {"AdsRowList", "", "homeItem", "", "", "CategoriesRowList", "categories", "Lcom/cashgate/core/responses/home/CategoriesData;", "HomeList", "homeList", "Lcom/cashgate/core/responses/home/HomeListData;", "HomeScreen", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "navController", "Landroidx/navigation/NavHostController;", "modifier", "Landroidx/compose/ui/Modifier;", "homeViewModel", "Lcom/cashgate/feature_home/presentation/ui/screens/home/HomeViewModel;", "onCountryClick", "Lkotlin/Function0;", "HomeScreenPreview", "feature_home_debug"})
public final class HomeScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.ui.ExperimentalComposeUiApi.class})
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull
    androidx.compose.foundation.layout.PaddingValues paddingValues, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    com.cashgate.feature_home.presentation.ui.screens.home.HomeViewModel homeViewModel, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCountryClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void HomeList(@org.jetbrains.annotations.NotNull
    java.util.List<com.cashgate.core.responses.home.HomeListData> homeList) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void AdsRowList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> homeItem) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CategoriesRowList(@org.jetbrains.annotations.Nullable
    java.util.List<com.cashgate.core.responses.home.CategoriesData> categories) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void HomeScreenPreview() {
    }
}