package com.cashgate.domain.usecases.fetch_forms;

import com.cashgate.domain.respository.get_form.GetFormRepository;
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
public final class GetPropertyPaymentIntentUseCase_Factory implements Factory<GetPropertyPaymentIntentUseCase> {
  private final Provider<GetFormRepository> formsRepositoryProvider;

  public GetPropertyPaymentIntentUseCase_Factory(
      Provider<GetFormRepository> formsRepositoryProvider) {
    this.formsRepositoryProvider = formsRepositoryProvider;
  }

  @Override
  public GetPropertyPaymentIntentUseCase get() {
    return newInstance(formsRepositoryProvider.get());
  }

  public static GetPropertyPaymentIntentUseCase_Factory create(
      Provider<GetFormRepository> formsRepositoryProvider) {
    return new GetPropertyPaymentIntentUseCase_Factory(formsRepositoryProvider);
  }

  public static GetPropertyPaymentIntentUseCase newInstance(GetFormRepository formsRepository) {
    return new GetPropertyPaymentIntentUseCase(formsRepository);
  }
}
