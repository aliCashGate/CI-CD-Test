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
public final class GetHomeListUseCase_Factory implements Factory<GetHomeListUseCase> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  public GetHomeListUseCase_Factory(Provider<HomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  @Override
  public GetHomeListUseCase get() {
    return newInstance(homeRepositoryProvider.get());
  }

  public static GetHomeListUseCase_Factory create(Provider<HomeRepository> homeRepositoryProvider) {
    return new GetHomeListUseCase_Factory(homeRepositoryProvider);
  }

  public static GetHomeListUseCase newInstance(HomeRepository homeRepository) {
    return new GetHomeListUseCase(homeRepository);
  }
}
