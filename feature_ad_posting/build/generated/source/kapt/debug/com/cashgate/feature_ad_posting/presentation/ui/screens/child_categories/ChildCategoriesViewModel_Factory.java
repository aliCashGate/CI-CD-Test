package com.cashgate.feature_ad_posting.presentation.ui.screens.child_categories;

import androidx.lifecycle.SavedStateHandle;
import com.cashgate.domain.usecases.home.GetCategoriesUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class ChildCategoriesViewModel_Factory implements Factory<ChildCategoriesViewModel> {
  private final Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public ChildCategoriesViewModel_Factory(
      Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.getCategoriesUseCaseProvider = getCategoriesUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public ChildCategoriesViewModel get() {
    return newInstance(getCategoriesUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static ChildCategoriesViewModel_Factory create(
      Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new ChildCategoriesViewModel_Factory(getCategoriesUseCaseProvider, savedStateHandleProvider);
  }

  public static ChildCategoriesViewModel newInstance(GetCategoriesUseCase getCategoriesUseCase,
      SavedStateHandle savedStateHandle) {
    return new ChildCategoriesViewModel(getCategoriesUseCase, savedStateHandle);
  }
}
