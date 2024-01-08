package com.cashgate.domain.usecases.profile;

import com.cashgate.domain.respository.profile.ProfileRepository;
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
public final class DeleteUserUseCase_Factory implements Factory<DeleteUserUseCase> {
  private final Provider<ProfileRepository> profileRepositoryProvider;

  public DeleteUserUseCase_Factory(Provider<ProfileRepository> profileRepositoryProvider) {
    this.profileRepositoryProvider = profileRepositoryProvider;
  }

  @Override
  public DeleteUserUseCase get() {
    return newInstance(profileRepositoryProvider.get());
  }

  public static DeleteUserUseCase_Factory create(
      Provider<ProfileRepository> profileRepositoryProvider) {
    return new DeleteUserUseCase_Factory(profileRepositoryProvider);
  }

  public static DeleteUserUseCase newInstance(ProfileRepository profileRepository) {
    return new DeleteUserUseCase(profileRepository);
  }
}
