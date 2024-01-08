package com.cashgate.data.repository.property_detail.mapper;

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
public final class PropertyDetailMapper_Factory implements Factory<PropertyDetailMapper> {
  @Override
  public PropertyDetailMapper get() {
    return newInstance();
  }

  public static PropertyDetailMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PropertyDetailMapper newInstance() {
    return new PropertyDetailMapper();
  }

  private static final class InstanceHolder {
    private static final PropertyDetailMapper_Factory INSTANCE = new PropertyDetailMapper_Factory();
  }
}
