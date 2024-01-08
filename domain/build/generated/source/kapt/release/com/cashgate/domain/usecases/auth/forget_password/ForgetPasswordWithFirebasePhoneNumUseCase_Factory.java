package com.cashgate.domain.usecases.auth.forget_password;

import com.cashgate.domain.respository.auth.register.RegisterRepository;
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
public final class ForgetPasswordWithFirebasePhoneNumUseCase_Factory implements Factory<ForgetPasswordWithFirebasePhoneNumUseCase> {
  private final Provider<RegisterRepository> registerRepositoryProvider;

  public ForgetPasswordWithFirebasePhoneNumUseCase_Factory(
      Provider<RegisterRepository> registerRepositoryProvider) {
    this.registerRepositoryProvider = registerRepositoryProvider;
  }

  @Override
  public ForgetPasswordWithFirebasePhoneNumUseCase get() {
    return newInstance(registerRepositoryProvider.get());
  }

  public static ForgetPasswordWithFirebasePhoneNumUseCase_Factory create(
      Provider<RegisterRepository> registerRepositoryProvider) {
    return new ForgetPasswordWithFirebasePhoneNumUseCase_Factory(registerRepositoryProvider);
  }

  public static ForgetPasswordWithFirebasePhoneNumUseCase newInstance(
      RegisterRepository registerRepository) {
    return new ForgetPasswordWithFirebasePhoneNumUseCase(registerRepository);
  }
}
