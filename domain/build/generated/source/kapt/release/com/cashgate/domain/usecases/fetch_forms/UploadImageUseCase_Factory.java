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
public final class UploadImageUseCase_Factory implements Factory<UploadImageUseCase> {
  private final Provider<GetFormRepository> formsRepositoryProvider;

  public UploadImageUseCase_Factory(Provider<GetFormRepository> formsRepositoryProvider) {
    this.formsRepositoryProvider = formsRepositoryProvider;
  }

  @Override
  public UploadImageUseCase get() {
    return newInstance(formsRepositoryProvider.get());
  }

  public static UploadImageUseCase_Factory create(
      Provider<GetFormRepository> formsRepositoryProvider) {
    return new UploadImageUseCase_Factory(formsRepositoryProvider);
  }

  public static UploadImageUseCase newInstance(GetFormRepository formsRepository) {
    return new UploadImageUseCase(formsRepository);
  }
}
