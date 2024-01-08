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
public final class VerifyTokenUseCase_Factory implements Factory<VerifyTokenUseCase> {
  private final Provider<IntroRepository> introRepositoryProvider;

  public VerifyTokenUseCase_Factory(Provider<IntroRepository> introRepositoryProvider) {
    this.introRepositoryProvider = introRepositoryProvider;
  }

  @Override
  public VerifyTokenUseCase get() {
    return newInstance(introRepositoryProvider.get());
  }

  public static VerifyTokenUseCase_Factory create(
      Provider<IntroRepository> introRepositoryProvider) {
    return new VerifyTokenUseCase_Factory(introRepositoryProvider);
  }

  public static VerifyTokenUseCase newInstance(IntroRepository introRepository) {
    return new VerifyTokenUseCase(introRepository);
  }
}
