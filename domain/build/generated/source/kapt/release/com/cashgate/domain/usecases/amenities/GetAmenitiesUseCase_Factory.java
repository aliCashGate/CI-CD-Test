package com.cashgate.domain.usecases.amenities;

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
public final class GetAmenitiesUseCase_Factory implements Factory<GetAmenitiesUseCase> {
  private final Provider<GetFormRepository> formsRepositoryProvider;

  public GetAmenitiesUseCase_Factory(Provider<GetFormRepository> formsRepositoryProvider) {
    this.formsRepositoryProvider = formsRepositoryProvider;
  }

  @Override
  public GetAmenitiesUseCase get() {
    return newInstance(formsRepositoryProvider.get());
  }

  public static GetAmenitiesUseCase_Factory create(
      Provider<GetFormRepository> formsRepositoryProvider) {
    return new GetAmenitiesUseCase_Factory(formsRepositoryProvider);
  }

  public static GetAmenitiesUseCase newInstance(GetFormRepository formsRepository) {
    return new GetAmenitiesUseCase(formsRepository);
  }
}
