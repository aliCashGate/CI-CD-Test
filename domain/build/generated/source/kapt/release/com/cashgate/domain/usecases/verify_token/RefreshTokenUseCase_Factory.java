package com.cashgate.domain.usecases.verify_token;

import com.cashgate.domain.respository.intro.IntroRepository;
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
public final class RefreshTokenUseCase_Factory implements Factory<RefreshTokenUseCase> {
  private final Provider<IntroRepository> introRepositoryProvider;

  public RefreshTokenUseCase_Factory(Provider<IntroRepository> introRepositoryProvider) {
    this.introRepositoryProvider = introRepositoryProvider;
  }

  @Override
  public RefreshTokenUseCase get() {
    return newInstance(introRepositoryProvider.get());
  }

  public static RefreshTokenUseCase_Factory create(
      Provider<IntroRepository> introRepositoryProvider) {
    return new RefreshTokenUseCase_Factory(introRepositoryProvider);
  }

  public static RefreshTokenUseCase newInstance(IntroRepository introRepository) {
    return new RefreshTokenUseCase(introRepository);
  }
}
