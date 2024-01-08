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
public final class CategoriesMapper_Factory implements Factory<CategoriesMapper> {
  @Override
  public CategoriesMapper get() {
    return newInstance();
  }

  public static CategoriesMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CategoriesMapper newInstance() {
    return new CategoriesMapper();
  }

  private static final class InstanceHolder {
    private static final CategoriesMapper_Factory INSTANCE = new CategoriesMapper_Factory();
  }
}
