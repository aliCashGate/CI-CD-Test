package com.cashgate.data.repository.fetch_form.mapper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AmenitiesMapper_Factory implements Factory<AmenitiesMapper> {
  @Override
  public AmenitiesMapper get() {
    return newInstance();
  }

  public static AmenitiesMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AmenitiesMapper newInstance() {
    return new AmenitiesMapper();
  }

  private static final class InstanceHolder {
    private static final AmenitiesMapper_Factory INSTANCE = new AmenitiesMapper_Factory();
  }
}
