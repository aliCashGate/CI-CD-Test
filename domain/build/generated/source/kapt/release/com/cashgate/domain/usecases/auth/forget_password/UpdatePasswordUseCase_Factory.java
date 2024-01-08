package com.cashgate.domain.usecases.auth.forget_password;

import com.cashgate.domain.respository.auth.forget_password.ForgetPasswordRepository;
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
public final class UpdatePasswordUseCase_Factory implements Factory<UpdatePasswordUseCase> {
  private final Provider<ForgetPasswordRepository> forgetPasswordRepositoryProvider;

  public UpdatePasswordUseCase_Factory(
      Provider<ForgetPasswordRepository> forgetPasswordRepositoryProvider) {
    this.forgetPasswordRepositoryProvider = forgetPasswordRepositoryProvider;
  }

  @Override
  public UpdatePasswordUseCase get() {
    return newInstance(forgetPasswordRepositoryProvider.get());
  }

  public static UpdatePasswordUseCase_Factory create(
      Provider<ForgetPasswordRepository> forgetPasswordRepositoryProvider) {
    return new UpdatePasswordUseCase_Factory(forgetPasswordRepositoryProvider);
  }

  public static UpdatePasswordUseCase newInstance(
      ForgetPasswordRepository forgetPasswordRepository) {
    return new UpdatePasswordUseCase(forgetPasswordRepository);
  }
}
