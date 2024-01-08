package com.cashgate.feature_home.presentation.ui.screens.seeall;

import com.cashgate.core.network.sources.ApiRemoteDataSource;
import com.cashgate.data.repository.home.mapper.PropertiesMapper;
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
public final class SeeAllViewModel_Factory implements Factory<SeeAllViewModel> {
  private final Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider;

  private final Provider<PropertiesMapper> propertiesMapperProvider;

  public SeeAllViewModel_Factory(Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<PropertiesMapper> propertiesMapperProvider) {
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
    this.propertiesMapperProvider = propertiesMapperProvider;
  }

  @Override
  public SeeAllViewModel get() {
    return newInstance(apiRemoteDataSourceProvider.get(), propertiesMapperProvider.get());
  }

  public static SeeAllViewModel_Factory create(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<PropertiesMapper> propertiesMapperProvider) {
    return new SeeAllViewModel_Factory(apiRemoteDataSourceProvider, propertiesMapperProvider);
  }

  public static SeeAllViewModel newInstance(ApiRemoteDataSource apiRemoteDataSource,
      PropertiesMapper propertiesMapper) {
    return new SeeAllViewModel(apiRemoteDataSource, propertiesMapper);
  }
}
