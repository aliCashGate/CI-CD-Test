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
public final class FormsMapper_Factory implements Factory<FormsMapper> {
  @Override
  public FormsMapper get() {
    return newInstance();
  }

  public static FormsMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FormsMapper newInstance() {
    return new FormsMapper();
  }

  private static final class InstanceHolder {
    private static final FormsMapper_Factory INSTANCE = new FormsMapper_Factory();
  }
}
