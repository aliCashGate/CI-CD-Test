package com.cashgate.feature_ad_posting.presentation.ui.screens.select_category;

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
public final class SelectCategoryViewModel_Factory implements Factory<SelectCategoryViewModel> {
  private final Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider;

  public SelectCategoryViewModel_Factory(
      Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider) {
    this.getCategoriesUseCaseProvider = getCategoriesUseCaseProvider;
  }

  @Override
  public SelectCategoryViewModel get() {
    return newInstance(getCategoriesUseCaseProvider.get());
  }

  public static SelectCategoryViewModel_Factory create(
      Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider) {
    return new SelectCategoryViewModel_Factory(getCategoriesUseCaseProvider);
  }

  public static SelectCategoryViewModel newInstance(GetCategoriesUseCase getCategoriesUseCase) {
    return new SelectCategoryViewModel(getCategoriesUseCase);
  }
}
