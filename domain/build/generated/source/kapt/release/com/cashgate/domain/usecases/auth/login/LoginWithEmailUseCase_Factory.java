package com.cashgate.domain.usecases.auth.login;

import com.cashgate.domain.respository.auth.login.LoginRepository;
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
public final class LoginWithEmailUseCase_Factory implements Factory<LoginWithEmailUseCase> {
  private final Provider<LoginRepository> loginRepositoryProvider;

  public LoginWithEmailUseCase_Factory(Provider<LoginRepository> loginRepositoryProvider) {
    this.loginRepositoryProvider = loginRepositoryProvider;
  }

  @Override
  public LoginWithEmailUseCase get() {
    return newInstance(loginRepositoryProvider.get());
  }

  public static LoginWithEmailUseCase_Factory create(
      Provider<LoginRepository> loginRepositoryProvider) {
    return new LoginWithEmailUseCase_Factory(loginRepositoryProvider);
  }

  public static LoginWithEmailUseCase newInstance(LoginRepository loginRepository) {
    return new LoginWithEmailUseCase(loginRepository);
  }
}
