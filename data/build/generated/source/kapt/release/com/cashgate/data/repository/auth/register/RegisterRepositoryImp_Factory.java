package com.cashgate.data.repository.auth.register;

import com.cashgate.core.network.sources.ApiRemoteDataSource;
import com.cashgate.data.repository.auth.register.mapper.RegisterMapper;
import com.google.firebase.auth.FirebaseAuth;
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
public final class RegisterRepositoryImp_Factory implements Factory<RegisterRepositoryImp> {
  private final Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider;

  private final Provider<RegisterMapper> registerMapperProvider;

  private final Provider<FirebaseAuth> authProvider;

  public RegisterRepositoryImp_Factory(Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<RegisterMapper> registerMapperProvider, Provider<FirebaseAuth> authProvider) {
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
    this.registerMapperProvider = registerMapperProvider;
    this.authProvider = authProvider;
  }

  @Override
  public RegisterRepositoryImp get() {
    return newInstance(apiRemoteDataSourceProvider.get(), registerMapperProvider.get(), authProvider.get());
  }

  public static RegisterRepositoryImp_Factory create(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<RegisterMapper> registerMapperProvider, Provider<FirebaseAuth> authProvider) {
    return new RegisterRepositoryImp_Factory(apiRemoteDataSourceProvider, registerMapperProvider, authProvider);
  }

  public static RegisterRepositoryImp newInstance(ApiRemoteDataSource apiRemoteDataSource,
      RegisterMapper registerMapper, FirebaseAuth auth) {
    return new RegisterRepositoryImp(apiRemoteDataSource, registerMapper, auth);
  }
}
