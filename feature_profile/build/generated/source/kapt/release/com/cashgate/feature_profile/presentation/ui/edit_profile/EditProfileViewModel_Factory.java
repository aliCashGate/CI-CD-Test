package com.cashgate.feature_profile.presentation.ui.edit_profile;

import com.cashgate.core.util.AppPreferences;
import com.cashgate.domain.usecases.UpdateUserUseCase;
import com.cashgate.domain.usecases.fetch_forms.UploadImageUseCase;
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
public final class EditProfileViewModel_Factory implements Factory<EditProfileViewModel> {
  private final Provider<UploadImageUseCase> uploadImageUseCaseProvider;

  private final Provider<UpdateUserUseCase> updateUserUseCaseProvider;

  private final Provider<AppPreferences> appPreferencesProvider;

  public EditProfileViewModel_Factory(Provider<UploadImageUseCase> uploadImageUseCaseProvider,
      Provider<UpdateUserUseCase> updateUserUseCaseProvider,
      Provider<AppPreferences> appPreferencesProvider) {
    this.uploadImageUseCaseProvider = uploadImageUseCaseProvider;
    this.updateUserUseCaseProvider = updateUserUseCaseProvider;
    this.appPreferencesProvider = appPreferencesProvider;
  }

  @Override
  public EditProfileViewModel get() {
    return newInstance(uploadImageUseCaseProvider.get(), updateUserUseCaseProvider.get(), appPreferencesProvider.get());
  }

  public static EditProfileViewModel_Factory create(
      Provider<UploadImageUseCase> uploadImageUseCaseProvider,
      Provider<UpdateUserUseCase> updateUserUseCaseProvider,
      Provider<AppPreferences> appPreferencesProvider) {
    return new EditProfileViewModel_Factory(uploadImageUseCaseProvider, updateUserUseCaseProvider, appPreferencesProvider);
  }

  public static EditProfileViewModel newInstance(UploadImageUseCase uploadImageUseCase,
      UpdateUserUseCase updateUserUseCase, AppPreferences appPreferences) {
    return new EditProfileViewModel(uploadImageUseCase, updateUserUseCase, appPreferences);
  }
}
