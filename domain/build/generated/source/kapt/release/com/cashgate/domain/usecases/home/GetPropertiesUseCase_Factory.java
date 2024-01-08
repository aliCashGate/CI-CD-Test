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
public final class GetPropertiesUseCase_Factory implements Factory<GetPropertiesUseCase> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  public GetPropertiesUseCase_Factory(Provider<HomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  @Override
  public GetPropertiesUseCase get() {
    return newInstance(homeRepositoryProvider.get());
  }

  public static GetPropertiesUseCase_Factory create(
      Provider<HomeRepository> homeRepositoryProvider) {
    return new GetPropertiesUseCase_Factory(homeRepositoryProvider);
  }

  public static GetPropertiesUseCase newInstance(HomeRepository homeRepository) {
    return new GetPropertiesUseCase(homeRepository);
  }
}
