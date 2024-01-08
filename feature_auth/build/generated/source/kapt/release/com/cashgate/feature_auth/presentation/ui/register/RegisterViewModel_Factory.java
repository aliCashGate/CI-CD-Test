package com.cashgate.feature_auth.presentation.ui.register;

import android.content.Context;
import com.cashgate.core.util.AppPreferences;
import com.cashgate.domain.usecases.auth.otp.VerifyUserUseCase;
import com.cashgate.domain.usecases.auth.register.RegisterWithEmailUseCase;
import com.cashgate.domain.usecases.auth.register.RegisterWithFirebasePhoneNumUseCase;
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
public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<Context> applicationProvider;

  private final Provider<RegisterWithEmailUseCase> registerWithEmailUseCaseProvider;

  private final Provider<RegisterWithFirebasePhoneNumUseCase> registerWithPhoneNumUseCaseProvider;

  private final Provider<VerifyUserUseCase> verifyUserUseCaseProvider;

  private final Provider<AppPreferences> appPreferencesProvider;

  public RegisterViewModel_Factory(Provider<Context> applicationProvider,
      Provider<RegisterWithEmailUseCase> registerWithEmailUseCaseProvider,
      Provider<RegisterWithFirebasePhoneNumUseCase> registerWithPhoneNumUseCaseProvider,
      Provider<VerifyUserUseCase> verifyUserUseCaseProvider,
      Provider<AppPreferences> appPreferencesProvider) {
    this.applicationProvider = applicationProvider;
    this.registerWithEmailUseCaseProvider = registerWithEmailUseCaseProvider;
    this.registerWithPhoneNumUseCaseProvider = registerWithPhoneNumUseCaseProvider;
    this.verifyUserUseCaseProvider = verifyUserUseCaseProvider;
    this.appPreferencesProvider = appPreferencesProvider;
  }

  @Override
  public RegisterViewModel get() {
    return newInstance(applicationProvider.get(), registerWithEmailUseCaseProvider.get(), registerWithPhoneNumUseCaseProvider.get(), verifyUserUseCaseProvider.get(), appPreferencesProvider.get());
  }

  public static RegisterViewModel_Factory create(Provider<Context> applicationProvider,
      Provider<RegisterWithEmailUseCase> registerWithEmailUseCaseProvider,
      Provider<RegisterWithFirebasePhoneNumUseCase> registerWithPhoneNumUseCaseProvider,
      Provider<VerifyUserUseCase> verifyUserUseCaseProvider,
      Provider<AppPreferences> appPreferencesProvider) {
    return new RegisterViewModel_Factory(applicationProvider, registerWithEmailUseCaseProvider, registerWithPhoneNumUseCaseProvider, verifyUserUseCaseProvider, appPreferencesProvider);
  }

  public static RegisterViewModel newInstance(Context application,
      RegisterWithEmailUseCase registerWithEmailUseCase,
      RegisterWithFirebasePhoneNumUseCase registerWithPhoneNumUseCase,
      VerifyUserUseCase verifyUserUseCase, AppPreferences appPreferences) {
    return new RegisterViewModel(application, registerWithEmailUseCase, registerWithPhoneNumUseCase, verifyUserUseCase, appPreferences);
  }
}
