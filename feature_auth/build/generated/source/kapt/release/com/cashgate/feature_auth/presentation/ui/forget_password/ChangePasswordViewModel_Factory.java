package com.cashgate.feature_auth.presentation.ui.forget_password;

import android.content.Context;
import com.cashgate.domain.usecases.auth.forget_password.UpdatePasswordUseCase;
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
public final class ChangePasswordViewModel_Factory implements Factory<ChangePasswordViewModel> {
  private final Provider<Context> applicationProvider;

  private final Provider<UpdatePasswordUseCase> updatePasswordUseCaseProvider;

  public ChangePasswordViewModel_Factory(Provider<Context> applicationProvider,
      Provider<UpdatePasswordUseCase> updatePasswordUseCaseProvider) {
    this.applicationProvider = applicationProvider;
    this.updatePasswordUseCaseProvider = updatePasswordUseCaseProvider;
  }

  @Override
  public ChangePasswordViewModel get() {
    return newInstance(applicationProvider.get(), updatePasswordUseCaseProvider.get());
  }

  public static ChangePasswordViewModel_Factory create(Provider<Context> applicationProvider,
      Provider<UpdatePasswordUseCase> updatePasswordUseCaseProvider) {
    return new ChangePasswordViewModel_Factory(applicationProvider, updatePasswordUseCaseProvider);
  }

  public static ChangePasswordViewModel newInstance(Context application,
      UpdatePasswordUseCase updatePasswordUseCase) {
    return new ChangePasswordViewModel(application, updatePasswordUseCase);
  }
}
