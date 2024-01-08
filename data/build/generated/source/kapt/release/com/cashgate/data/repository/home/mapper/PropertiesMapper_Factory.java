package com.cashgate.data.repository.home.mapper;

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
public final class PropertiesMapper_Factory implements Factory<PropertiesMapper> {
  @Override
  public PropertiesMapper get() {
    return newInstance();
  }

  public static PropertiesMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PropertiesMapper newInstance() {
    return new PropertiesMapper();
  }

  private static final class InstanceHolder {
    private static final PropertiesMapper_Factory INSTANCE = new PropertiesMapper_Factory();
  }
}
