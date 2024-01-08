package com.cashgate.data.repository.property_detail;

import com.cashgate.core.network.sources.ApiRemoteDataSource;
import com.cashgate.data.repository.property_detail.mapper.PropertyDetailMapper;
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
public final class PropertyDetailRepositoryImp_Factory implements Factory<PropertyDetailRepositoryImp> {
  private final Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider;

  private final Provider<PropertyDetailMapper> propertyDetailMapperProvider;

  public PropertyDetailRepositoryImp_Factory(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<PropertyDetailMapper> propertyDetailMapperProvider) {
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
    this.propertyDetailMapperProvider = propertyDetailMapperProvider;
  }

  @Override
  public PropertyDetailRepositoryImp get() {
    return newInstance(apiRemoteDataSourceProvider.get(), propertyDetailMapperProvider.get());
  }

  public static PropertyDetailRepositoryImp_Factory create(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<PropertyDetailMapper> propertyDetailMapperProvider) {
    return new PropertyDetailRepositoryImp_Factory(apiRemoteDataSourceProvider, propertyDetailMapperProvider);
  }

  public static PropertyDetailRepositoryImp newInstance(ApiRemoteDataSource apiRemoteDataSource,
      PropertyDetailMapper propertyDetailMapper) {
    return new PropertyDetailRepositoryImp(apiRemoteDataSource, propertyDetailMapper);
  }
}
