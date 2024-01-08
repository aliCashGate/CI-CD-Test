package com.cashgate.core.util;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AppPreferences_Factory implements Factory<AppPreferences> {
  private final Provider<DataStore<Preferences>> dataStoreProvider;

  public AppPreferences_Factory(Provider<DataStore<Preferences>> dataStoreProvider) {
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public AppPreferences get() {
    return newInstance(dataStoreProvider.get());
  }

  public static AppPreferences_Factory create(Provider<DataStore<Preferences>> dataStoreProvider) {
    return new AppPreferences_Factory(dataStoreProvider);
  }

  public static AppPreferences newInstance(DataStore<Preferences> dataStore) {
    return new AppPreferences(dataStore);
  }
}
