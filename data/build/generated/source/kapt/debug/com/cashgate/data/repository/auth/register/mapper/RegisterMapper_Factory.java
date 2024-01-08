package com.cashgate.data.repository.auth.register.mapper;

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
public final class RegisterMapper_Factory implements Factory<RegisterMapper> {
  @Override
  public RegisterMapper get() {
    return newInstance();
  }

  public static RegisterMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RegisterMapper newInstance() {
    return new RegisterMapper();
  }

  private static final class InstanceHolder {
    private static final RegisterMapper_Factory INSTANCE = new RegisterMapper_Factory();
  }
}
