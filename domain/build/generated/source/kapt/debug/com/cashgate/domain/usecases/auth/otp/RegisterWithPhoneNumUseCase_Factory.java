package com.cashgate.domain.usecases.auth.otp;

import com.cashgate.domain.respository.auth.otp_verification.OtpVerificationRepository;
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
public final class RegisterWithPhoneNumUseCase_Factory implements Factory<RegisterWithPhoneNumUseCase> {
  private final Provider<OtpVerificationRepository> otpRegisterRepositoryProvider;

  public RegisterWithPhoneNumUseCase_Factory(
      Provider<OtpVerificationRepository> otpRegisterRepositoryProvider) {
    this.otpRegisterRepositoryProvider = otpRegisterRepositoryProvider;
  }

  @Override
  public RegisterWithPhoneNumUseCase get() {
    return newInstance(otpRegisterRepositoryProvider.get());
  }

  public static RegisterWithPhoneNumUseCase_Factory create(
      Provider<OtpVerificationRepository> otpRegisterRepositoryProvider) {
    return new RegisterWithPhoneNumUseCase_Factory(otpRegisterRepositoryProvider);
  }

  public static RegisterWithPhoneNumUseCase newInstance(
      OtpVerificationRepository otpRegisterRepository) {
    return new RegisterWithPhoneNumUseCase(otpRegisterRepository);
  }
}
