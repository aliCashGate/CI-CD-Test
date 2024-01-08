package com.cashgate.domain.usecases;

import com.cashgate.domain.respository.profile.EditProfileRepository;
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
public final class UpdateUserUseCase_Factory implements Factory<UpdateUserUseCase> {
  private final Provider<EditProfileRepository> editProfileRepositoryProvider;

  public UpdateUserUseCase_Factory(Provider<EditProfileRepository> editProfileRepositoryProvider) {
    this.editProfileRepositoryProvider = editProfileRepositoryProvider;
  }

  @Override
  public UpdateUserUseCase get() {
    return newInstance(editProfileRepositoryProvider.get());
  }

  public static UpdateUserUseCase_Factory create(
      Provider<EditProfileRepository> editProfileRepositoryProvider) {
    return new UpdateUserUseCase_Factory(editProfileRepositoryProvider);
  }

  public static UpdateUserUseCase newInstance(EditProfileRepository editProfileRepository) {
    return new UpdateUserUseCase(editProfileRepository);
  }
}
