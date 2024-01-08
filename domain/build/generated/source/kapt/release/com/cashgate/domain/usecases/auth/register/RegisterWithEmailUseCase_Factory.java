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
public final class RegisterWithEmailUseCase_Factory implements Factory<RegisterWithEmailUseCase> {
  private final Provider<RegisterRepository> registerRepositoryProvider;

  public RegisterWithEmailUseCase_Factory(Provider<RegisterRepository> registerRepositoryProvider) {
    this.registerRepositoryProvider = registerRepositoryProvider;
  }

  @Override
  public RegisterWithEmailUseCase get() {
    return newInstance(registerRepositoryProvider.get());
  }

  public static RegisterWithEmailUseCase_Factory create(
      Provider<RegisterRepository> registerRepositoryProvider) {
    return new RegisterWithEmailUseCase_Factory(registerRepositoryProvider);
  }

  public static RegisterWithEmailUseCase newInstance(RegisterRepository registerRepository) {
    return new RegisterWithEmailUseCase(registerRepository);
  }
}
