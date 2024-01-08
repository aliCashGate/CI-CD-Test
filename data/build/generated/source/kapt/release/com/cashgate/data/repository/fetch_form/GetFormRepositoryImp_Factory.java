package com.cashgate.data.repository.fetch_form;

import android.content.Context;
import com.cashgate.core.network.sources.ApiRemoteDataSource;
import com.cashgate.core.util.AppPreferences;
import com.cashgate.data.repository.fetch_form.mapper.AmenitiesMapper;
import com.cashgate.data.repository.fetch_form.mapper.FormsMapper;
import com.cashgate.data.repository.fetch_form.mapper.StorePropertyMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("javax.inject.Named")
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

  private final Provider<AmenitiesMapper> amenitiesMapperProvider;

  private final Provider<StorePropertyMapper> storePropertyMapperProvider;

  private final Provider<Context> contextProvider;

  private final Provider<String> apiURLProvider;

  private final Provider<String> apiSecretProvider;

  private final Provider<AppPreferences> appPreferencesProvider;

  public GetFormRepositoryImp_Factory(Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<FormsMapper> formsMapperProvider, Provider<AmenitiesMapper> amenitiesMapperProvider,
      Provider<StorePropertyMapper> storePropertyMapperProvider, Provider<Context> contextProvider,
      Provider<String> apiURLProvider, Provider<String> apiSecretProvider,
      Provider<AppPreferences> appPreferencesProvider) {
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
    this.formsMapperProvider = formsMapperProvider;
    this.amenitiesMapperProvider = amenitiesMapperProvider;
    this.storePropertyMapperProvider = storePropertyMapperProvider;
    this.contextProvider = contextProvider;
    this.apiURLProvider = apiURLProvider;
    this.apiSecretProvider = apiSecretProvider;
    this.appPreferencesProvider = appPreferencesProvider;
  }

  @Override
  public GetFormRepositoryImp get() {
    return newInstance(apiRemoteDataSourceProvider.get(), formsMapperProvider.get(), amenitiesMapperProvider.get(), storePropertyMapperProvider.get(), contextProvider.get(), apiURLProvider.get(), apiSecretProvider.get(), appPreferencesProvider.get());
  }

  public static GetFormRepositoryImp_Factory create(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<FormsMapper> formsMapperProvider, Provider<AmenitiesMapper> amenitiesMapperProvider,
      Provider<StorePropertyMapper> storePropertyMapperProvider, Provider<Context> contextProvider,
      Provider<String> apiURLProvider, Provider<String> apiSecretProvider,
      Provider<AppPreferences> appPreferencesProvider) {
    return new GetFormRepositoryImp_Factory(apiRemoteDataSourceProvider, formsMapperProvider, amenitiesMapperProvider, storePropertyMapperProvider, contextProvider, apiURLProvider, apiSecretProvider, appPreferencesProvider);
  }

  public static GetFormRepositoryImp newInstance(ApiRemoteDataSource apiRemoteDataSource,
      FormsMapper formsMapper, AmenitiesMapper amenitiesMapper,
      StorePropertyMapper storePropertyMapper, Context context, String apiURL, String apiSecret,
      AppPreferences appPreferences) {
    return new GetFormRepositoryImp(apiRemoteDataSource, formsMapper, amenitiesMapper, storePropertyMapper, context, apiURL, apiSecret, appPreferences);
  }
}
