package com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a \u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\u00a8\u0006\u001a"}, d2 = {"locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "getLocationCallback", "()Lcom/google/android/gms/location/LocationCallback;", "setLocationCallback", "(Lcom/google/android/gms/location/LocationCallback;)V", "AdPostStep1Screen", "", "categoriesData", "Lcom/cashgate/core/responses/home/CategoriesData;", "navController", "Landroidx/navigation/NavHostController;", "adPostStep1ViewModel", "Lcom/cashgate/feature_ad_posting/presentation/ui/screens/apartment_details/AdPostStep1ViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "getUserLocation", "context", "Landroid/content/Context;", "presentPaymentSheet", "paymentSheet", "Lcom/stripe/android/paymentsheet/PaymentSheet;", "customerConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "paymentIntentClientSecret", "", "feature_ad_posting_release"})
public final class AdPostStep1Kt {
    public static com.google.android.gms.location.LocationCallback locationCallback;
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    public static final void AdPostStep1Screen(@org.jetbrains.annotations.NotNull
    com.cashgate.core.responses.home.CategoriesData categoriesData, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.AdPostStep1ViewModel adPostStep1ViewModel, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.google.android.gms.location.LocationCallback getLocationCallback() {
        return null;
    }
    
    public static final void setLocationCallback(@org.jetbrains.annotations.NotNull
    com.google.android.gms.location.LocationCallback p0) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void getUserLocation(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    private static final void presentPaymentSheet(com.stripe.android.paymentsheet.PaymentSheet paymentSheet, com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customerConfig, java.lang.String paymentIntentClientSecret) {
    }
}