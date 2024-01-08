package com.cashgate.feature_profile;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u001bJ\u0006\u0010#\u001a\u00020\u001bJ\u0006\u0010$\u001a\u00020\u001bJ\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020!R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015\u00a8\u0006*"}, d2 = {"Lcom/cashgate/feature_profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "appPreferences", "Lcom/cashgate/core/util/AppPreferences;", "deleteUserUseCase", "Lcom/cashgate/domain/usecases/profile/DeleteUserUseCase;", "apiRemoteDataSource", "Lcom/cashgate/core/network/sources/ApiRemoteDataSource;", "propertiesMapper", "Lcom/cashgate/data/repository/home/mapper/PropertiesMapper;", "(Lcom/cashgate/core/util/AppPreferences;Lcom/cashgate/domain/usecases/profile/DeleteUserUseCase;Lcom/cashgate/core/network/sources/ApiRemoteDataSource;Lcom/cashgate/data/repository/home/mapper/PropertiesMapper;)V", "_deleteUserState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cashgate/feature_profile/entities/DeleteUserEntity;", "_loginState", "", "_userInfoState", "Lcom/cashgate/core/responses/login/User;", "deleteUserState", "Lkotlinx/coroutines/flow/StateFlow;", "getDeleteUserState", "()Lkotlinx/coroutines/flow/StateFlow;", "loginState", "getLoginState", "userInfoState", "getUserInfoState", "deleteUser", "", "getMyPagingData", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/cashgate/core/responses/home/properties/Property;", "userID", "", "getUserInfo", "isUserLoggedIN", "logout", "navigateToMainScreen", "navController", "Landroidx/navigation/NavHostController;", "onErrorState", "error", "feature_profile_release"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    private final com.cashgate.core.util.AppPreferences appPreferences = null;
    private final com.cashgate.domain.usecases.profile.DeleteUserUseCase deleteUserUseCase = null;
    private final com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource = null;
    private final com.cashgate.data.repository.home.mapper.PropertiesMapper propertiesMapper = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _loginState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> loginState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_profile.entities.DeleteUserEntity> _deleteUserState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_profile.entities.DeleteUserEntity> deleteUserState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.core.responses.login.User> _userInfoState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.core.responses.login.User> userInfoState = null;
    
    @javax.inject.Inject
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    com.cashgate.core.util.AppPreferences appPreferences, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.profile.DeleteUserUseCase deleteUserUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.core.network.sources.ApiRemoteDataSource apiRemoteDataSource, @org.jetbrains.annotations.NotNull
    com.cashgate.data.repository.home.mapper.PropertiesMapper propertiesMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLoginState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_profile.entities.DeleteUserEntity> getDeleteUserState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.core.responses.login.User> getUserInfoState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.cashgate.core.responses.home.properties.Property>> getMyPagingData(@org.jetbrains.annotations.Nullable
    java.lang.String userID) {
        return null;
    }
    
    public final void isUserLoggedIN() {
    }
    
    public final void getUserInfo() {
    }
    
    public final void deleteUser() {
    }
    
    public final void logout() {
    }
    
    public final void onErrorState(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
    
    public final void navigateToMainScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
}