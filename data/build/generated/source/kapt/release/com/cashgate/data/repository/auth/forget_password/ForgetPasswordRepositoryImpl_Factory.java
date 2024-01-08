package com.cashgate.data.repository.auth.forget_password;

import com.cashgate.core.network.sources.ApiRemoteDataSource;
import com.cashgate.data.repository.auth.forget_password.mapper.UpdatePasswordMapper;
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
public final class ForgetPasswordRepositoryImpl_Factory implements Factory<ForgetPasswordRepositoryImpl> {
  private final Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider;

  private final Provider<UpdatePasswordMapper> updatePasswordMapperProvider;

  public ForgetPasswordRepositoryImpl_Factory(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<UpdatePasswordMapper> updatePasswordMapperProvider) {
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
    this.updatePasswordMapperProvider = updatePasswordMapperProvider;
  }

  @Override
  public ForgetPasswordRepositoryImpl get() {
    return newInstance(apiRemoteDataSourceProvider.get(), updatePasswordMapperProvider.get());
  }

  public static ForgetPasswordRepositoryImpl_Factory create(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<UpdatePasswordMapper> updatePasswordMapperProvider) {
    return new ForgetPasswordRepositoryImpl_Factory(apiRemoteDataSourceProvider, updatePasswordMapperProvider);
  }

  public static ForgetPasswordRepositoryImpl newInstance(ApiRemoteDataSource apiRemoteDataSource,
      UpdatePasswordMapper updatePasswordMapper) {
    return new ForgetPasswordRepositoryImpl(apiRemoteDataSource, updatePasswordMapper);
  }
}
