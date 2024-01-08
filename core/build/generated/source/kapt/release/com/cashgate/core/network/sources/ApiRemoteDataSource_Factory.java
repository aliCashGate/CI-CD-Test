package com.cashgate.core.network.sources;

import com.apollographql.apollo3.ApolloClient;
import com.cashgate.core.util.AppPreferences;
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
public final class ApiRemoteDataSource_Factory implements Factory<ApiRemoteDataSource> {
  private final Provider<ApolloClient> apolloClientProvider;

  private final Provider<String> apiSecretProvider;

  private final Provider<AppPreferences> appPreferencesProvider;

  public ApiRemoteDataSource_Factory(Provider<ApolloClient> apolloClientProvider,
      Provider<String> apiSecretProvider, Provider<AppPreferences> appPreferencesProvider) {
    this.apolloClientProvider = apolloClientProvider;
    this.apiSecretProvider = apiSecretProvider;
    this.appPreferencesProvider = appPreferencesProvider;
  }

  @Override
  public ApiRemoteDataSource get() {
    return newInstance(apolloClientProvider.get(), apiSecretProvider.get(), appPreferencesProvider.get());
  }

  public static ApiRemoteDataSource_Factory create(Provider<ApolloClient> apolloClientProvider,
      Provider<String> apiSecretProvider, Provider<AppPreferences> appPreferencesProvider) {
    return new ApiRemoteDataSource_Factory(apolloClientProvider, apiSecretProvider, appPreferencesProvider);
  }

  public static ApiRemoteDataSource newInstance(ApolloClient apolloClient, String apiSecret,
      AppPreferences appPreferences) {
    return new ApiRemoteDataSource(apolloClient, apiSecret, appPreferences);
  }
}
