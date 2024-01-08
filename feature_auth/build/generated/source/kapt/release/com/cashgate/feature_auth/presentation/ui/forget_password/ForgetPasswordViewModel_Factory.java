package com.cashgate.feature_auth.presentation.ui.forget_password;

import android.content.Context;
import com.cashgate.domain.usecases.auth.login.LoginWithEmailUseCase;
import com.cashgate.domain.usecases.auth.otp.VerifyUserUseCase;
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
public final class ForgetPasswordViewModel_Factory implements Factory<ForgetPasswordViewModel> {
  private final Provider<Context> applicationProvider;

  private final Provider<LoginWithEmailUseCase> loginWithEmailUseCaseProvider;

  private final Provider<VerifyUserUseCase> verifyUserUseCaseProvider;

  private final Provider<RegisterWithFirebasePhoneNumUseCase> registerWithPhoneNumUseCaseProvider;

  public ForgetPasswordViewModel_Factory(Provider<Context> applicationProvider,
      Provider<LoginWithEmailUseCase> loginWithEmailUseCaseProvider,
      Provider<VerifyUserUseCase> verifyUserUseCaseProvider,
      Provider<RegisterWithFirebasePhoneNumUseCase> registerWithPhoneNumUseCaseProvider) {
    this.applicationProvider = applicationProvider;
    this.loginWithEmailUseCaseProvider = loginWithEmailUseCaseProvider;
    this.verifyUserUseCaseProvider = verifyUserUseCaseProvider;
    this.registerWithPhoneNumUseCaseProvider = registerWithPhoneNumUseCaseProvider;
  }

  @Override
  public ForgetPasswordViewModel get() {
    return newInstance(applicationProvider.get(), loginWithEmailUseCaseProvider.get(), verifyUserUseCaseProvider.get(), registerWithPhoneNumUseCaseProvider.get());
  }

  public static ForgetPasswordViewModel_Factory create(Provider<Context> applicationProvider,
      Provider<LoginWithEmailUseCase> loginWithEmailUseCaseProvider,
      Provider<VerifyUserUseCase> verifyUserUseCaseProvider,
      Provider<RegisterWithFirebasePhoneNumUseCase> registerWithPhoneNumUseCaseProvider) {
    return new ForgetPasswordViewModel_Factory(applicationProvider, loginWithEmailUseCaseProvider, verifyUserUseCaseProvider, registerWithPhoneNumUseCaseProvider);
  }

  public static ForgetPasswordViewModel newInstance(Context application,
      LoginWithEmailUseCase loginWithEmailUseCase, VerifyUserUseCase verifyUserUseCase,
      RegisterWithFirebasePhoneNumUseCase registerWithPhoneNumUseCase) {
    return new ForgetPasswordViewModel(application, loginWithEmailUseCase, verifyUserUseCase, registerWithPhoneNumUseCase);
  }
}
