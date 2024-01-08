package com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
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
  @Override
  public AdPostStep1ViewModel get() {
    return newInstance();
  }

  public static AdPostStep1ViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AdPostStep1ViewModel newInstance() {
    return new AdPostStep1ViewModel();
  }

  private static final class InstanceHolder {
    private static final AdPostStep1ViewModel_Factory INSTANCE = new AdPostStep1ViewModel_Factory();
  }
}
