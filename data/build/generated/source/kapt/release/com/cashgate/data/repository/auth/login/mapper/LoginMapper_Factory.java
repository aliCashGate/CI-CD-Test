package com.cashgate.data.repository.auth.login.mapper;

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
public final class LoginMapper_Factory implements Factory<LoginMapper> {
  @Override
  public LoginMapper get() {
    return newInstance();
  }

  public static LoginMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LoginMapper newInstance() {
    return new LoginMapper();
  }

  private static final class InstanceHolder {
    private static final LoginMapper_Factory INSTANCE = new LoginMapper_Factory();
  }
}
