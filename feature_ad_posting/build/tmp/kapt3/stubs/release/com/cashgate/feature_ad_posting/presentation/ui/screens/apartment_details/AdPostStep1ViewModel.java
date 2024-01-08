package com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u000208J\'\u0010H\u001a\b\u0012\u0004\u0012\u0002080I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020KH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ\u0006\u0010%\u001a\u00020FJ)\u0010N\u001a\u00020F2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u000208H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010SJ\u000e\u0010T\u001a\u00020F2\u0006\u0010U\u001a\u00020PJ\u000e\u0010V\u001a\u00020F2\u0006\u0010W\u001a\u00020XJ\u000e\u0010Y\u001a\u00020F2\u0006\u0010Z\u001a\u00020[J\u0016\u0010\\\u001a\u00020F2\u0006\u0010]\u001a\u00020^2\u0006\u0010Z\u001a\u00020[J\u000e\u0010_\u001a\u00020F2\u0006\u0010`\u001a\u000208J\u000e\u0010a\u001a\u00020F2\u0006\u0010b\u001a\u00020$J\u001e\u0010c\u001a\u00020F2\b\u0010U\u001a\u0004\u0018\u0001082\f\u0010d\u001a\b\u0012\u0004\u0012\u00020f0eJ\u0016\u0010g\u001a\u00020F2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020PR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00170*\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190*\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00107\u001a\u0004\u0018\u000108X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b0*\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010,R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001d0*\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010,R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001f0*\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010,R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020!0*\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010,R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006k"}, d2 = {"Lcom/cashgate/feature_ad_posting/presentation/ui/screens/apartment_details/AdPostStep1ViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "getFormsUseCase", "Lcom/cashgate/domain/usecases/fetch_forms/GetFormsUseCase;", "getAmenitiesUseCase", "Lcom/cashgate/domain/usecases/amenities/GetAmenitiesUseCase;", "storePropertyUseCase", "Lcom/cashgate/domain/usecases/store_property/StorePropertyUseCase;", "getAddressUseCase", "Lcom/cashgate/domain/usecases/getAddressFromLatLon/GetAddressUseCase;", "uploadImageUseCase", "Lcom/cashgate/domain/usecases/fetch_forms/UploadImageUseCase;", "getPropertyPaymentIntentUseCase", "Lcom/cashgate/domain/usecases/fetch_forms/GetPropertyPaymentIntentUseCase;", "deleteImageUseCase", "Lcom/cashgate/domain/usecases/fetch_forms/DeleteImageUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroid/content/Context;Lcom/cashgate/domain/usecases/fetch_forms/GetFormsUseCase;Lcom/cashgate/domain/usecases/amenities/GetAmenitiesUseCase;Lcom/cashgate/domain/usecases/store_property/StorePropertyUseCase;Lcom/cashgate/domain/usecases/getAddressFromLatLon/GetAddressUseCase;Lcom/cashgate/domain/usecases/fetch_forms/UploadImageUseCase;Lcom/cashgate/domain/usecases/fetch_forms/GetPropertyPaymentIntentUseCase;Lcom/cashgate/domain/usecases/fetch_forms/DeleteImageUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_amenitiesData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cashgate/feature_ad_posting/presentation/ui/screens/apartment_details/uistates/AmenitiesUiState;", "_formsData", "Lcom/cashgate/feature_ad_posting/presentation/ui/screens/apartment_details/uistates/AdApartmentUiState;", "_paymentIntentData", "Lcom/cashgate/feature_ad_posting/presentation/ui/screens/apartment_details/uistates/GetPropertyIntentUiState;", "_storePropertyData", "Lcom/cashgate/feature_ad_posting/presentation/ui/screens/apartment_details/uistates/StorePropertyUiState;", "_stripeStatusData", "Lcom/cashgate/feature_ad_posting/presentation/ui/screens/apartment_details/uistates/StripeStatusUiState;", "_uploadImageData", "Lcom/cashgate/feature_ad_posting/presentation/ui/screens/apartment_details/uistates/UploadingImageUiState;", "amenities", "", "Lcom/cashgate/common/models/Amenity;", "getAmenities", "()Ljava/util/List;", "setAmenities", "(Ljava/util/List;)V", "amenitiesData", "Lkotlinx/coroutines/flow/StateFlow;", "getAmenitiesData", "()Lkotlinx/coroutines/flow/StateFlow;", "getContext", "()Landroid/content/Context;", "customerConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "getCustomerConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "setCustomerConfig", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;)V", "formsData", "getFormsData", "paymentIntentClientSecret", "", "getPaymentIntentClientSecret", "()Ljava/lang/String;", "setPaymentIntentClientSecret", "(Ljava/lang/String;)V", "paymentIntentData", "getPaymentIntentData", "storePropertyData", "getStorePropertyData", "stripeStatusData", "getStripeStatusData", "uploadImageData", "getUploadImageData", "deleteImage", "", "fileName", "getAddress", "Lkotlinx/coroutines/flow/Flow;", "longitude", "", "latitude", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForms", "categoryID", "", "steps", "header", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPropertyIntent", "catID", "handlePaymentSheetResult", "paymentSheetResult", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "navigateToMainScreen", "navController", "Landroidx/navigation/NavHostController;", "navigateToSteps", "categoriesData", "Lcom/cashgate/core/responses/home/CategoriesData;", "onErrorState", "error", "onListItemClick", "item", "onStoreProperty", "selectedForms", "", "Lcom/cashgate/core/responses/fetch_forms/FetchForm;", "uploadImage", "file", "Ljava/io/File;", "id", "feature_ad_posting_release"})
public final class AdPostStep1ViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final com.cashgate.domain.usecases.fetch_forms.GetFormsUseCase getFormsUseCase = null;
    private final com.cashgate.domain.usecases.amenities.GetAmenitiesUseCase getAmenitiesUseCase = null;
    private final com.cashgate.domain.usecases.store_property.StorePropertyUseCase storePropertyUseCase = null;
    private final com.cashgate.domain.usecases.getAddressFromLatLon.GetAddressUseCase getAddressUseCase = null;
    private final com.cashgate.domain.usecases.fetch_forms.UploadImageUseCase uploadImageUseCase = null;
    private final com.cashgate.domain.usecases.fetch_forms.GetPropertyPaymentIntentUseCase getPropertyPaymentIntentUseCase = null;
    private final com.cashgate.domain.usecases.fetch_forms.DeleteImageUseCase deleteImageUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.AdApartmentUiState> _formsData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.AdApartmentUiState> formsData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.AmenitiesUiState> _amenitiesData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.AmenitiesUiState> amenitiesData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.StorePropertyUiState> _storePropertyData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.StorePropertyUiState> storePropertyData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.UploadingImageUiState> _uploadImageData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.UploadingImageUiState> uploadImageData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.GetPropertyIntentUiState> _paymentIntentData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.GetPropertyIntentUiState> paymentIntentData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.StripeStatusUiState> _stripeStatusData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.StripeStatusUiState> stripeStatusData = null;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.cashgate.common.models.Amenity> amenities;
    @org.jetbrains.annotations.Nullable
    private com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customerConfig;
    @org.jetbrains.annotations.Nullable
    private java.lang.String paymentIntentClientSecret;
    
    @javax.inject.Inject
    public AdPostStep1ViewModel(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.fetch_forms.GetFormsUseCase getFormsUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.amenities.GetAmenitiesUseCase getAmenitiesUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.store_property.StorePropertyUseCase storePropertyUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.getAddressFromLatLon.GetAddressUseCase getAddressUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.fetch_forms.UploadImageUseCase uploadImageUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.fetch_forms.GetPropertyPaymentIntentUseCase getPropertyPaymentIntentUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.fetch_forms.DeleteImageUseCase deleteImageUseCase, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.AdApartmentUiState> getFormsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.AmenitiesUiState> getAmenitiesData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.StorePropertyUiState> getStorePropertyData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.UploadingImageUiState> getUploadImageData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.GetPropertyIntentUiState> getPaymentIntentData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.StripeStatusUiState> getStripeStatusData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.cashgate.common.models.Amenity> getAmenities() {
        return null;
    }
    
    public final void setAmenities(@org.jetbrains.annotations.Nullable
    java.util.List<com.cashgate.common.models.Amenity> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration getCustomerConfig() {
        return null;
    }
    
    public final void setCustomerConfig(@org.jetbrains.annotations.Nullable
    com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPaymentIntentClientSecret() {
        return null;
    }
    
    public final void setPaymentIntentClientSecret(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    private final java.lang.Object getForms(int categoryID, int steps, java.lang.String header, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void getAmenities() {
    }
    
    public final void onErrorState(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
    
    public final void navigateToSteps(@org.jetbrains.annotations.NotNull
    com.cashgate.core.responses.home.CategoriesData categoriesData, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
    
    public final void onStoreProperty(@org.jetbrains.annotations.Nullable
    java.lang.String catID, @org.jetbrains.annotations.NotNull
    java.util.List<com.cashgate.core.responses.fetch_forms.FetchForm> selectedForms) {
    }
    
    public final void getPropertyIntent(int catID) {
    }
    
    public final void uploadImage(@org.jetbrains.annotations.NotNull
    java.io.File file, int id) {
    }
    
    public final void deleteImage(@org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
    }
    
    public final void navigateToMainScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
    
    public final void onListItemClick(@org.jetbrains.annotations.NotNull
    com.cashgate.common.models.Amenity item) {
    }
    
    public final void handlePaymentSheetResult(@org.jetbrains.annotations.NotNull
    com.stripe.android.paymentsheet.PaymentSheetResult paymentSheetResult) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAddress(double longitude, double latitude, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> continuation) {
        return null;
    }
}