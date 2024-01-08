package com.cashgate.data.repository.auth.forget_password.mapper;

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
public final class UpdatePasswordMapper_Factory implements Factory<UpdatePasswordMapper> {
  @Override
  public UpdatePasswordMapper get() {
    return newInstance();
  }

  public static UpdatePasswordMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UpdatePasswordMapper newInstance() {
    return new UpdatePasswordMapper();
  }

  private static final class InstanceHolder {
    private static final UpdatePasswordMapper_Factory INSTANCE = new UpdatePasswordMapper_Factory();
  }
}
