package com.cashgate.data.repository.fetch_form;

import com.cashgate.core.network.sources.ApiRemoteDataSource;
import com.cashgate.data.repository.fetch_form.mapper.FormsMapper;
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
public final class GetFormRepositoryImp_Factory implements Factory<GetFormRepositoryImp> {
  private final Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider;

  private final Provider<FormsMapper> formsMapperProvider;

  public GetFormRepositoryImp_Factory(Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<FormsMapper> formsMapperProvider) {
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
    this.formsMapperProvider = formsMapperProvider;
  }

  @Override
  public GetFormRepositoryImp get() {
    return newInstance(apiRemoteDataSourceProvider.get(), formsMapperProvider.get());
  }

  public static GetFormRepositoryImp_Factory create(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<FormsMapper> formsMapperProvider) {
    return new GetFormRepositoryImp_Factory(apiRemoteDataSourceProvider, formsMapperProvider);
  }

  public static GetFormRepositoryImp newInstance(ApiRemoteDataSource apiRemoteDataSource,
      FormsMapper formsMapper) {
    return new GetFormRepositoryImp(apiRemoteDataSource, formsMapper);
  }
}
