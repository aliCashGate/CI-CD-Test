package com.cashgate.feature_auth.presentation.ui.otp;

import android.content.Context;
import com.cashgate.domain.usecases.auth.otp.OTPVerificationUseCase;
import com.cashgate.domain.usecases.auth.otp.RegisterWithPhoneNumUseCase;
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
public final class OtpViewModel_Factory implements Factory<OtpViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<OTPVerificationUseCase> otpVerificationUseCaseProvider;

  private final Provider<RegisterWithPhoneNumUseCase> registerWithPhoneNumUseCaseProvider;

  public OtpViewModel_Factory(Provider<Context> contextProvider,
      Provider<OTPVerificationUseCase> otpVerificationUseCaseProvider,
      Provider<RegisterWithPhoneNumUseCase> registerWithPhoneNumUseCaseProvider) {
    this.contextProvider = contextProvider;
    this.otpVerificationUseCaseProvider = otpVerificationUseCaseProvider;
    this.registerWithPhoneNumUseCaseProvider = registerWithPhoneNumUseCaseProvider;
  }

  @Override
  public OtpViewModel get() {
    return newInstance(contextProvider.get(), otpVerificationUseCaseProvider.get(), registerWithPhoneNumUseCaseProvider.get());
  }

  public static OtpViewModel_Factory create(Provider<Context> contextProvider,
      Provider<OTPVerificationUseCase> otpVerificationUseCaseProvider,
      Provider<RegisterWithPhoneNumUseCase> registerWithPhoneNumUseCaseProvider) {
    return new OtpViewModel_Factory(contextProvider, otpVerificationUseCaseProvider, registerWithPhoneNumUseCaseProvider);
  }

  public static OtpViewModel newInstance(Context context,
      OTPVerificationUseCase otpVerificationUseCase,
      RegisterWithPhoneNumUseCase registerWithPhoneNumUseCase) {
    return new OtpViewModel(context, otpVerificationUseCase, registerWithPhoneNumUseCase);
  }
}
