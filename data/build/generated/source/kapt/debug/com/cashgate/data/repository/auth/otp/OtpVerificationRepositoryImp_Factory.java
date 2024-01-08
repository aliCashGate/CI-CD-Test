package com.cashgate.data.repository.auth.otp;

import com.cashgate.core.network.sources.ApiRemoteDataSource;
import com.cashgate.data.repository.auth.otp.mapper.UserVerificationMapper;
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
public final class OtpVerificationRepositoryImp_Factory implements Factory<OtpVerificationRepositoryImp> {
  private final Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider;

  private final Provider<RegisterMapper> registerMapperProvider;

  private final Provider<UserVerificationMapper> userVerificationMapperProvider;

  private final Provider<FirebaseAuth> authProvider;

  public OtpVerificationRepositoryImp_Factory(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<RegisterMapper> registerMapperProvider,
      Provider<UserVerificationMapper> userVerificationMapperProvider,
      Provider<FirebaseAuth> authProvider) {
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
    this.registerMapperProvider = registerMapperProvider;
    this.userVerificationMapperProvider = userVerificationMapperProvider;
    this.authProvider = authProvider;
  }

  @Override
  public OtpVerificationRepositoryImp get() {
    return newInstance(apiRemoteDataSourceProvider.get(), registerMapperProvider.get(), userVerificationMapperProvider.get(), authProvider.get());
  }

  public static OtpVerificationRepositoryImp_Factory create(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<RegisterMapper> registerMapperProvider,
      Provider<UserVerificationMapper> userVerificationMapperProvider,
      Provider<FirebaseAuth> authProvider) {
    return new OtpVerificationRepositoryImp_Factory(apiRemoteDataSourceProvider, registerMapperProvider, userVerificationMapperProvider, authProvider);
  }

  public static OtpVerificationRepositoryImp newInstance(ApiRemoteDataSource apiRemoteDataSource,
      RegisterMapper registerMapper, UserVerificationMapper userVerificationMapper,
      FirebaseAuth auth) {
    return new OtpVerificationRepositoryImp(apiRemoteDataSource, registerMapper, userVerificationMapper, auth);
  }
}
