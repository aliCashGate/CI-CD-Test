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
public final class StorePropertyMapper_Factory implements Factory<StorePropertyMapper> {
  @Override
  public StorePropertyMapper get() {
    return newInstance();
  }

  public static StorePropertyMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StorePropertyMapper newInstance() {
    return new StorePropertyMapper();
  }

  private static final class InstanceHolder {
    private static final StorePropertyMapper_Factory INSTANCE = new StorePropertyMapper_Factory();
  }
}
