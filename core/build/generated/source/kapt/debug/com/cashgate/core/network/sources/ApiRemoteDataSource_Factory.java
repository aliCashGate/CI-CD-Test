package com.cashgate.core.network.sources;

import com.apollographql.apollo3.ApolloClient;
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

  public ApiRemoteDataSource_Factory(Provider<ApolloClient> apolloClientProvider,
      Provider<String> apiSecretProvider) {
    this.apolloClientProvider = apolloClientProvider;
    this.apiSecretProvider = apiSecretProvider;
  }

  @Override
  public ApiRemoteDataSource get() {
    return newInstance(apolloClientProvider.get(), apiSecretProvider.get());
  }

  public static ApiRemoteDataSource_Factory create(Provider<ApolloClient> apolloClientProvider,
      Provider<String> apiSecretProvider) {
    return new ApiRemoteDataSource_Factory(apolloClientProvider, apiSecretProvider);
  }

  public static ApiRemoteDataSource newInstance(ApolloClient apolloClient, String apiSecret) {
    return new ApiRemoteDataSource(apolloClient, apiSecret);
  }
}
