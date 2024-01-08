package com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.cashgate.domain.usecases.amenities.GetAmenitiesUseCase;
import com.cashgate.domain.usecases.fetch_forms.DeleteImageUseCase;
import com.cashgate.domain.usecases.fetch_forms.GetFormsUseCase;
import com.cashgate.domain.usecases.fetch_forms.GetPropertyPaymentIntentUseCase;
import com.cashgate.domain.usecases.fetch_forms.UploadImageUseCase;
import com.cashgate.domain.usecases.getAddressFromLatLon.GetAddressUseCase;
import com.cashgate.domain.usecases.store_property.StorePropertyUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AdPostStep1ViewModel_Factory implements Factory<AdPostStep1ViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<GetFormsUseCase> getFormsUseCaseProvider;

  private final Provider<GetAmenitiesUseCase> getAmenitiesUseCaseProvider;

  private final Provider<StorePropertyUseCase> storePropertyUseCaseProvider;

  private final Provider<GetAddressUseCase> getAddressUseCaseProvider;

  private final Provider<UploadImageUseCase> uploadImageUseCaseProvider;

  private final Provider<GetPropertyPaymentIntentUseCase> getPropertyPaymentIntentUseCaseProvider;

  private final Provider<DeleteImageUseCase> deleteImageUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public AdPostStep1ViewModel_Factory(Provider<Context> contextProvider,
      Provider<GetFormsUseCase> getFormsUseCaseProvider,
      Provider<GetAmenitiesUseCase> getAmenitiesUseCaseProvider,
      Provider<StorePropertyUseCase> storePropertyUseCaseProvider,
      Provider<GetAddressUseCase> getAddressUseCaseProvider,
      Provider<UploadImageUseCase> uploadImageUseCaseProvider,
      Provider<GetPropertyPaymentIntentUseCase> getPropertyPaymentIntentUseCaseProvider,
      Provider<DeleteImageUseCase> deleteImageUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.contextProvider = contextProvider;
    this.getFormsUseCaseProvider = getFormsUseCaseProvider;
    this.getAmenitiesUseCaseProvider = getAmenitiesUseCaseProvider;
    this.storePropertyUseCaseProvider = storePropertyUseCaseProvider;
    this.getAddressUseCaseProvider = getAddressUseCaseProvider;
    this.uploadImageUseCaseProvider = uploadImageUseCaseProvider;
    this.getPropertyPaymentIntentUseCaseProvider = getPropertyPaymentIntentUseCaseProvider;
    this.deleteImageUseCaseProvider = deleteImageUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public AdPostStep1ViewModel get() {
    return newInstance(contextProvider.get(), getFormsUseCaseProvider.get(), getAmenitiesUseCaseProvider.get(), storePropertyUseCaseProvider.get(), getAddressUseCaseProvider.get(), uploadImageUseCaseProvider.get(), getPropertyPaymentIntentUseCaseProvider.get(), deleteImageUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static AdPostStep1ViewModel_Factory create(Provider<Context> contextProvider,
      Provider<GetFormsUseCase> getFormsUseCaseProvider,
      Provider<GetAmenitiesUseCase> getAmenitiesUseCaseProvider,
      Provider<StorePropertyUseCase> storePropertyUseCaseProvider,
      Provider<GetAddressUseCase> getAddressUseCaseProvider,
      Provider<UploadImageUseCase> uploadImageUseCaseProvider,
      Provider<GetPropertyPaymentIntentUseCase> getPropertyPaymentIntentUseCaseProvider,
      Provider<DeleteImageUseCase> deleteImageUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new AdPostStep1ViewModel_Factory(contextProvider, getFormsUseCaseProvider, getAmenitiesUseCaseProvider, storePropertyUseCaseProvider, getAddressUseCaseProvider, uploadImageUseCaseProvider, getPropertyPaymentIntentUseCaseProvider, deleteImageUseCaseProvider, savedStateHandleProvider);
  }

  public static AdPostStep1ViewModel newInstance(Context context, GetFormsUseCase getFormsUseCase,
      GetAmenitiesUseCase getAmenitiesUseCase, StorePropertyUseCase storePropertyUseCase,
      GetAddressUseCase getAddressUseCase, UploadImageUseCase uploadImageUseCase,
      GetPropertyPaymentIntentUseCase getPropertyPaymentIntentUseCase,
      DeleteImageUseCase deleteImageUseCase, SavedStateHandle savedStateHandle) {
    return new AdPostStep1ViewModel(context, getFormsUseCase, getAmenitiesUseCase, storePropertyUseCase, getAddressUseCase, uploadImageUseCase, getPropertyPaymentIntentUseCase, deleteImageUseCase, savedStateHandle);
  }
}
