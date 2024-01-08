package com.cashgate.data.repository.edit_profile.mapper;

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
public final class UpdateUserMapper_Factory implements Factory<UpdateUserMapper> {
  @Override
  public UpdateUserMapper get() {
    return newInstance();
  }

  public static UpdateUserMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UpdateUserMapper newInstance() {
    return new UpdateUserMapper();
  }

  private static final class InstanceHolder {
    private static final UpdateUserMapper_Factory INSTANCE = new UpdateUserMapper_Factory();
  }
}
