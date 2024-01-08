package com.cashgate.domain.usecases.store_property;

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
public final class StorePropertyUseCase_Factory implements Factory<StorePropertyUseCase> {
  private final Provider<GetFormRepository> formsRepositoryProvider;

  public StorePropertyUseCase_Factory(Provider<GetFormRepository> formsRepositoryProvider) {
    this.formsRepositoryProvider = formsRepositoryProvider;
  }

  @Override
  public StorePropertyUseCase get() {
    return newInstance(formsRepositoryProvider.get());
  }

  public static StorePropertyUseCase_Factory create(
      Provider<GetFormRepository> formsRepositoryProvider) {
    return new StorePropertyUseCase_Factory(formsRepositoryProvider);
  }

  public static StorePropertyUseCase newInstance(GetFormRepository formsRepository) {
    return new StorePropertyUseCase(formsRepository);
  }
}
