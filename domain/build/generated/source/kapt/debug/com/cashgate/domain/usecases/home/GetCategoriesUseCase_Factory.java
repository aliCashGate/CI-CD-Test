package com.cashgate.domain.usecases.home;

import com.cashgate.domain.respository.home.HomeRepository;
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
public final class GetCategoriesUseCase_Factory implements Factory<GetCategoriesUseCase> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  public GetCategoriesUseCase_Factory(Provider<HomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  @Override
  public GetCategoriesUseCase get() {
    return newInstance(homeRepositoryProvider.get());
  }

  public static GetCategoriesUseCase_Factory create(
      Provider<HomeRepository> homeRepositoryProvider) {
    return new GetCategoriesUseCase_Factory(homeRepositoryProvider);
  }

  public static GetCategoriesUseCase newInstance(HomeRepository homeRepository) {
    return new GetCategoriesUseCase(homeRepository);
  }
}
