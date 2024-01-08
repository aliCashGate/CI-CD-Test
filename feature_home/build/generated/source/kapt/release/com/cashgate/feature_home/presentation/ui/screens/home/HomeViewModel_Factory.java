package com.cashgate.feature_home.presentation.ui.screens.home;

import android.content.Context;
import com.cashgate.domain.usecases.auth.GetCountriesUseCase;
import com.cashgate.domain.usecases.home.GetCategoriesUseCase;
import com.cashgate.domain.usecases.home.GetHomeListUseCase;
import com.cashgate.domain.usecases.home.GetPropertiesUseCase;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider;

  private final Provider<GetHomeListUseCase> getHomeListUseCaseProvider;

  private final Provider<GetCountriesUseCase> getCountriesUseCaseProvider;

  private final Provider<GetPropertiesUseCase> getPropertiesUseCaseProvider;

  public HomeViewModel_Factory(Provider<Context> contextProvider,
      Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider,
      Provider<GetHomeListUseCase> getHomeListUseCaseProvider,
      Provider<GetCountriesUseCase> getCountriesUseCaseProvider,
      Provider<GetPropertiesUseCase> getPropertiesUseCaseProvider) {
    this.contextProvider = contextProvider;
    this.getCategoriesUseCaseProvider = getCategoriesUseCaseProvider;
    this.getHomeListUseCaseProvider = getHomeListUseCaseProvider;
    this.getCountriesUseCaseProvider = getCountriesUseCaseProvider;
    this.getPropertiesUseCaseProvider = getPropertiesUseCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(contextProvider.get(), getCategoriesUseCaseProvider.get(), getHomeListUseCaseProvider.get(), getCountriesUseCaseProvider.get(), getPropertiesUseCaseProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<Context> contextProvider,
      Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider,
      Provider<GetHomeListUseCase> getHomeListUseCaseProvider,
      Provider<GetCountriesUseCase> getCountriesUseCaseProvider,
      Provider<GetPropertiesUseCase> getPropertiesUseCaseProvider) {
    return new HomeViewModel_Factory(contextProvider, getCategoriesUseCaseProvider, getHomeListUseCaseProvider, getCountriesUseCaseProvider, getPropertiesUseCaseProvider);
  }

  public static HomeViewModel newInstance(Context context,
      GetCategoriesUseCase getCategoriesUseCase, GetHomeListUseCase getHomeListUseCase,
      GetCountriesUseCase getCountriesUseCase, GetPropertiesUseCase getPropertiesUseCase) {
    return new HomeViewModel(context, getCategoriesUseCase, getHomeListUseCase, getCountriesUseCase, getPropertiesUseCase);
  }
}
