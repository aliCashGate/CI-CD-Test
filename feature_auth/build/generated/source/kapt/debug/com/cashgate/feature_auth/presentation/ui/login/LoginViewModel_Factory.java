package com.cashgate.feature_auth.presentation.ui.login;

import android.content.Context;
import com.cashgate.core.util.AppPreferences;
import com.cashgate.domain.usecases.auth.login.LoginWithEmailUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<Context> applicationProvider;

  private final Provider<LoginWithEmailUseCase> loginWithEmailUseCaseProvider;

  private final Provider<AppPreferences> appPreferencesProvider;

  public LoginViewModel_Factory(Provider<Context> applicationProvider,
      Provider<LoginWithEmailUseCase> loginWithEmailUseCaseProvider,
      Provider<AppPreferences> appPreferencesProvider) {
    this.applicationProvider = applicationProvider;
    this.loginWithEmailUseCaseProvider = loginWithEmailUseCaseProvider;
    this.appPreferencesProvider = appPreferencesProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(applicationProvider.get(), loginWithEmailUseCaseProvider.get(), appPreferencesProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<Context> applicationProvider,
      Provider<LoginWithEmailUseCase> loginWithEmailUseCaseProvider,
      Provider<AppPreferences> appPreferencesProvider) {
    return new LoginViewModel_Factory(applicationProvider, loginWithEmailUseCaseProvider, appPreferencesProvider);
  }

  public static LoginViewModel newInstance(Context application,
      LoginWithEmailUseCase loginWithEmailUseCase, AppPreferences appPreferences) {
    return new LoginViewModel(application, loginWithEmailUseCase, appPreferences);
  }
}
