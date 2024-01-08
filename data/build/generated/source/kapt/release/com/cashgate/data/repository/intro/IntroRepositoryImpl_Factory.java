package com.cashgate.data.repository.intro;

import com.cashgate.core.util.AppPreferences;
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
public final class IntroRepositoryImpl_Factory implements Factory<IntroRepositoryImpl> {
  private final Provider<AppPreferences> appPreferencesProvider;

  private final Provider<String> apiURLProvider;

  public IntroRepositoryImpl_Factory(Provider<AppPreferences> appPreferencesProvider,
      Provider<String> apiURLProvider) {
    this.appPreferencesProvider = appPreferencesProvider;
    this.apiURLProvider = apiURLProvider;
  }

  @Override
  public IntroRepositoryImpl get() {
    return newInstance(appPreferencesProvider.get(), apiURLProvider.get());
  }

  public static IntroRepositoryImpl_Factory create(Provider<AppPreferences> appPreferencesProvider,
      Provider<String> apiURLProvider) {
    return new IntroRepositoryImpl_Factory(appPreferencesProvider, apiURLProvider);
  }

  public static IntroRepositoryImpl newInstance(AppPreferences appPreferences, String apiURL) {
    return new IntroRepositoryImpl(appPreferences, apiURL);
  }
}
