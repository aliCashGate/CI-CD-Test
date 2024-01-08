package com.cashgate.feature_profile;

import com.cashgate.core.network.sources.ApiRemoteDataSource;
import com.cashgate.core.util.AppPreferences;
import com.cashgate.data.repository.home.mapper.PropertiesMapper;
import com.cashgate.domain.usecases.profile.DeleteUserUseCase;
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
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<AppPreferences> appPreferencesProvider;

  private final Provider<DeleteUserUseCase> deleteUserUseCaseProvider;

  private final Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider;

  private final Provider<PropertiesMapper> propertiesMapperProvider;

  public ProfileViewModel_Factory(Provider<AppPreferences> appPreferencesProvider,
      Provider<DeleteUserUseCase> deleteUserUseCaseProvider,
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<PropertiesMapper> propertiesMapperProvider) {
    this.appPreferencesProvider = appPreferencesProvider;
    this.deleteUserUseCaseProvider = deleteUserUseCaseProvider;
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
    this.propertiesMapperProvider = propertiesMapperProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(appPreferencesProvider.get(), deleteUserUseCaseProvider.get(), apiRemoteDataSourceProvider.get(), propertiesMapperProvider.get());
  }

  public static ProfileViewModel_Factory create(Provider<AppPreferences> appPreferencesProvider,
      Provider<DeleteUserUseCase> deleteUserUseCaseProvider,
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<PropertiesMapper> propertiesMapperProvider) {
    return new ProfileViewModel_Factory(appPreferencesProvider, deleteUserUseCaseProvider, apiRemoteDataSourceProvider, propertiesMapperProvider);
  }

  public static ProfileViewModel newInstance(AppPreferences appPreferences,
      DeleteUserUseCase deleteUserUseCase, ApiRemoteDataSource apiRemoteDataSource,
      PropertiesMapper propertiesMapper) {
    return new ProfileViewModel(appPreferences, deleteUserUseCase, apiRemoteDataSource, propertiesMapper);
  }
}
