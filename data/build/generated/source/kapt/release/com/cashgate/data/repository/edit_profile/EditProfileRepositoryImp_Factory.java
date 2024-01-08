package com.cashgate.data.repository.edit_profile;

import com.cashgate.core.network.sources.ApiRemoteDataSource;
import com.cashgate.data.repository.edit_profile.mapper.UpdateUserMapper;
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
public final class EditProfileRepositoryImp_Factory implements Factory<EditProfileRepositoryImp> {
  private final Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider;

  private final Provider<UpdateUserMapper> updateUserMapperProvider;

  public EditProfileRepositoryImp_Factory(Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<UpdateUserMapper> updateUserMapperProvider) {
    this.apiRemoteDataSourceProvider = apiRemoteDataSourceProvider;
    this.updateUserMapperProvider = updateUserMapperProvider;
  }

  @Override
  public EditProfileRepositoryImp get() {
    return newInstance(apiRemoteDataSourceProvider.get(), updateUserMapperProvider.get());
  }

  public static EditProfileRepositoryImp_Factory create(
      Provider<ApiRemoteDataSource> apiRemoteDataSourceProvider,
      Provider<UpdateUserMapper> updateUserMapperProvider) {
    return new EditProfileRepositoryImp_Factory(apiRemoteDataSourceProvider, updateUserMapperProvider);
  }

  public static EditProfileRepositoryImp newInstance(ApiRemoteDataSource apiRemoteDataSource,
      UpdateUserMapper updateUserMapper) {
    return new EditProfileRepositoryImp(apiRemoteDataSource, updateUserMapper);
  }
}
