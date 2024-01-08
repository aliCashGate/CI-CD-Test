package com.cashgate.domain.usecases.auth.register;

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
public final class RegisterWithFirebasePhoneNumUseCase_Factory implements Factory<RegisterWithFirebasePhoneNumUseCase> {
  private final Provider<RegisterRepository> registerRepositoryProvider;

  public RegisterWithFirebasePhoneNumUseCase_Factory(
      Provider<RegisterRepository> registerRepositoryProvider) {
    this.registerRepositoryProvider = registerRepositoryProvider;
  }

  @Override
  public RegisterWithFirebasePhoneNumUseCase get() {
    return newInstance(registerRepositoryProvider.get());
  }

  public static RegisterWithFirebasePhoneNumUseCase_Factory create(
      Provider<RegisterRepository> registerRepositoryProvider) {
    return new RegisterWithFirebasePhoneNumUseCase_Factory(registerRepositoryProvider);
  }

  public static RegisterWithFirebasePhoneNumUseCase newInstance(
      RegisterRepository registerRepository) {
    return new RegisterWithFirebasePhoneNumUseCase(registerRepository);
  }
}
