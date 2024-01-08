package com.cashgate.data.repository.home;

import com.cashgate.core.network.sources.ApiRemoteDataSource;
import com.cashgate.data.repository.home.mapper.CategoriesMapper;
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
public final class HomeRepositoryImp_Factory implements Factory<HomeRepositoryImp> {
  private final Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider;

  private final Provider<CategoriesMapper> categoriesMapperProvider;

  private final Provider<PropertiesMapper> propertiesMapperProvider;

  public HomeRepositoryImp_Factory(Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<CategoriesMapper> categoriesMapperProvider,
      Provider<PropertiesMapper> propertiesMapperProvider) {
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
    this.categoriesMapperProvider = categoriesMapperProvider;
    this.propertiesMapperProvider = propertiesMapperProvider;
  }

  @Override
  public HomeRepositoryImp get() {
    return newInstance(apiRemoteDataSourceProvider.get(), categoriesMapperProvider.get(), propertiesMapperProvider.get());
  }

  public static HomeRepositoryImp_Factory create(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<CategoriesMapper> categoriesMapperProvider,
      Provider<PropertiesMapper> propertiesMapperProvider) {
    return new HomeRepositoryImp_Factory(apiRemoteDataSourceProvider, categoriesMapperProvider, propertiesMapperProvider);
  }

  public static HomeRepositoryImp newInstance(ApiRemoteDataSource apiRemoteDataSource,
      CategoriesMapper categoriesMapper, PropertiesMapper propertiesMapper) {
    return new HomeRepositoryImp(apiRemoteDataSource, categoriesMapper, propertiesMapper);
  }
}
