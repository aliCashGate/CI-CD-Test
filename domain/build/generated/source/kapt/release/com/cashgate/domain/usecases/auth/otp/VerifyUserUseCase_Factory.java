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
public final class VerifyUserUseCase_Factory implements Factory<VerifyUserUseCase> {
  private final Provider<OtpVerificationRepository> otpVerificationRepositoryProvider;

  public VerifyUserUseCase_Factory(
      Provider<OtpVerificationRepository> otpVerificationRepositoryProvider) {
    this.otpVerificationRepositoryProvider = otpVerificationRepositoryProvider;
  }

  @Override
  public VerifyUserUseCase get() {
    return newInstance(otpVerificationRepositoryProvider.get());
  }

  public static VerifyUserUseCase_Factory create(
      Provider<OtpVerificationRepository> otpVerificationRepositoryProvider) {
    return new VerifyUserUseCase_Factory(otpVerificationRepositoryProvider);
  }

  public static VerifyUserUseCase newInstance(OtpVerificationRepository otpVerificationRepository) {
    return new VerifyUserUseCase(otpVerificationRepository);
  }
}
