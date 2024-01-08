package com.cashgate.data.repository.auth.login;

import com.cashgate.core.network.sources.ApiRemoteDataSource;
import com.cashgate.data.repository.auth.login.mapper.LoginMapper;
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
public final class LoginRepositoryImp_Factory implements Factory<LoginRepositoryImp> {
  private final Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider;

  private final Provider<LoginMapper> loginMapperProvider;

  public LoginRepositoryImp_Factory(Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<LoginMapper> loginMapperProvider) {
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
    this.loginMapperProvider = loginMapperProvider;
  }

  @Override
  public LoginRepositoryImp get() {
    return newInstance(apiRemoteDataSourceProvider.get(), loginMapperProvider.get());
  }

  public static LoginRepositoryImp_Factory create(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<LoginMapper> loginMapperProvider) {
    return new LoginRepositoryImp_Factory(apiRemoteDataSourceProvider, loginMapperProvider);
  }

  public static LoginRepositoryImp newInstance(ApiRemoteDataSource apiRemoteDataSource,
      LoginMapper loginMapper) {
    return new LoginRepositoryImp(apiRemoteDataSource, loginMapper);
  }
}
