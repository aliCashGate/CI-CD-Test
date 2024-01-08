package com.cashgate.data.repository.seeall;

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
public final class SeeAllRepositoryImp_Factory implements Factory<SeeAllRepositoryImp> {
  private final Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider;

  private final Provider<PropertiesMapper> propertiesMapperProvider;

  public SeeAllRepositoryImp_Factory(Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<PropertiesMapper> propertiesMapperProvider) {
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
    this.propertiesMapperProvider = propertiesMapperProvider;
  }

  @Override
  public SeeAllRepositoryImp get() {
    return newInstance(apiRemoteDataSourceProvider.get(), propertiesMapperProvider.get());
  }

  public static SeeAllRepositoryImp_Factory create(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<PropertiesMapper> propertiesMapperProvider) {
    return new SeeAllRepositoryImp_Factory(apiRemoteDataSourceProvider, propertiesMapperProvider);
  }

  public static SeeAllRepositoryImp newInstance(ApiRemoteDataSource apiRemoteDataSource,
      PropertiesMapper propertiesMapper) {
    return new SeeAllRepositoryImp(apiRemoteDataSource, propertiesMapper);
  }
}
