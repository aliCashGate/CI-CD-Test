package com.cashgate.domain.usecases.property_detail;

import com.cashgate.domain.respository.property_detail.PropertyDetailRepository;
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
public final class GetPropertyDetailUseCase_Factory implements Factory<GetPropertyDetailUseCase> {
  private final Provider<PropertyDetailRepository> propertyDetailRepositoryProvider;

  public GetPropertyDetailUseCase_Factory(
      Provider<PropertyDetailRepository> propertyDetailRepositoryProvider) {
    this.propertyDetailRepositoryProvider = propertyDetailRepositoryProvider;
  }

  @Override
  public GetPropertyDetailUseCase get() {
    return newInstance(propertyDetailRepositoryProvider.get());
  }

  public static GetPropertyDetailUseCase_Factory create(
      Provider<PropertyDetailRepository> propertyDetailRepositoryProvider) {
    return new GetPropertyDetailUseCase_Factory(propertyDetailRepositoryProvider);
  }

  public static GetPropertyDetailUseCase newInstance(
      PropertyDetailRepository propertyDetailRepository) {
    return new GetPropertyDetailUseCase(propertyDetailRepository);
  }
}
