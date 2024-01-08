package com.cashgate.data.repository.profile;

import com.cashgate.core.network.sources.ApiRemoteDataSource;
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
public final class ProfileRepositoryImp_Factory implements Factory<ProfileRepositoryImp> {
  private final Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider;

  public ProfileRepositoryImp_Factory(Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider) {
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
  }

  @Override
  public ProfileRepositoryImp get() {
    return newInstance(apiRemoteDataSourceProvider.get());
  }

  public static ProfileRepositoryImp_Factory create(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider) {
    return new ProfileRepositoryImp_Factory(apiRemoteDataSourceProvider);
  }

  public static ProfileRepositoryImp newInstance(ApiRemoteDataSource apiRemoteDataSource) {
    return new ProfileRepositoryImp(apiRemoteDataSource);
  }
}
