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
public final class GetFormsUseCase_Factory implements Factory<GetFormsUseCase> {
  private final Provider<GetFormRepository> formsRepositoryProvider;

  public GetFormsUseCase_Factory(Provider<GetFormRepository> formsRepositoryProvider) {
    this.formsRepositoryProvider = formsRepositoryProvider;
  }

  @Override
  public GetFormsUseCase get() {
    return newInstance(formsRepositoryProvider.get());
  }

  public static GetFormsUseCase_Factory create(
      Provider<GetFormRepository> formsRepositoryProvider) {
    return new GetFormsUseCase_Factory(formsRepositoryProvider);
  }

  public static GetFormsUseCase newInstance(GetFormRepository formsRepository) {
    return new GetFormsUseCase(formsRepository);
  }
}
