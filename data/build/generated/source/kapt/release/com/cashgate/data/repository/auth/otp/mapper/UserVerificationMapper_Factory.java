package com.cashgate.data.repository.auth.otp.mapper;

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
public final class UserVerificationMapper_Factory implements Factory<UserVerificationMapper> {
  @Override
  public UserVerificationMapper get() {
    return newInstance();
  }

  public static UserVerificationMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UserVerificationMapper newInstance() {
    return new UserVerificationMapper();
  }

  private static final class InstanceHolder {
    private static final UserVerificationMapper_Factory INSTANCE = new UserVerificationMapper_Factory();
  }
}
