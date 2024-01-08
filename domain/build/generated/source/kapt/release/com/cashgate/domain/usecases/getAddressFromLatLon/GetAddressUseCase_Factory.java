package com.cashgate.domain.usecases.getAddressFromLatLon;

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
public final class GetAddressUseCase_Factory implements Factory<GetAddressUseCase> {
  private final Provider<GetFormRepository> formsRepositoryProvider;

  public GetAddressUseCase_Factory(Provider<GetFormRepository> formsRepositoryProvider) {
    this.formsRepositoryProvider = formsRepositoryProvider;
  }

  @Override
  public GetAddressUseCase get() {
    return newInstance(formsRepositoryProvider.get());
  }

  public static GetAddressUseCase_Factory create(
      Provider<GetFormRepository> formsRepositoryProvider) {
    return new GetAddressUseCase_Factory(formsRepositoryProvider);
  }

  public static GetAddressUseCase newInstance(GetFormRepository formsRepository) {
    return new GetAddressUseCase(formsRepository);
  }
}
