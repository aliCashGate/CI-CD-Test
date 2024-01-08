package com.cashgate.feature_profile.presentation.ui.edit_profile;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0016\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001eR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/cashgate/feature_profile/presentation/ui/edit_profile/EditProfileViewModel;", "Lcom/cashgate/common/mvvm/BaseVM;", "Lcom/cashgate/core/responses/login/User;", "uploadImageUseCase", "Lcom/cashgate/domain/usecases/fetch_forms/UploadImageUseCase;", "updateUserUseCase", "Lcom/cashgate/domain/usecases/UpdateUserUseCase;", "appPreferences", "Lcom/cashgate/core/util/AppPreferences;", "(Lcom/cashgate/domain/usecases/fetch_forms/UploadImageUseCase;Lcom/cashgate/domain/usecases/UpdateUserUseCase;Lcom/cashgate/core/util/AppPreferences;)V", "_updateUserData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cashgate/feature_profile/presentation/ui/edit_profile/uistates/UpdateUserUiState;", "_uploadImageData", "Lcom/cashgate/feature_ad_posting/presentation/ui/screens/apartment_details/uistates/UploadingImageUiState;", "updateUserData", "Lkotlinx/coroutines/flow/StateFlow;", "getUpdateUserData", "()Lkotlinx/coroutines/flow/StateFlow;", "uploadImageData", "getUploadImageData", "onErrorState", "", "error", "", "onTriggerEvent", "eventType", "updateUser", "user", "userID", "", "uploadImage", "file", "Ljava/io/File;", "id", "feature_profile_release"})
public final class EditProfileViewModel extends com.cashgate.common.mvvm.BaseVM<com.cashgate.core.responses.login.User> {
    private final com.cashgate.domain.usecases.fetch_forms.UploadImageUseCase uploadImageUseCase = null;
    private final com.cashgate.domain.usecases.UpdateUserUseCase updateUserUseCase = null;
    private final com.cashgate.core.util.AppPreferences appPreferences = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.UploadingImageUiState> _uploadImageData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.UploadingImageUiState> uploadImageData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_profile.presentation.ui.edit_profile.uistates.UpdateUserUiState> _updateUserData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_profile.presentation.ui.edit_profile.uistates.UpdateUserUiState> updateUserData = null;
    
    @javax.inject.Inject
    public EditProfileViewModel(@org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.fetch_forms.UploadImageUseCase uploadImageUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.UpdateUserUseCase updateUserUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.core.util.AppPreferences appPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_ad_posting.presentation.ui.screens.apartment_details.uistates.UploadingImageUiState> getUploadImageData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_profile.presentation.ui.edit_profile.uistates.UpdateUserUiState> getUpdateUserData() {
        return null;
    }
    
    public final void uploadImage(@org.jetbrains.annotations.NotNull
    java.io.File file, int id) {
    }
    
    public final void updateUser(@org.jetbrains.annotations.NotNull
    com.cashgate.core.responses.login.User user, int userID) {
    }
    
    public final void onErrorState(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
    
    @java.lang.Override
    public void onTriggerEvent(@org.jetbrains.annotations.NotNull
    com.cashgate.core.responses.login.User eventType) {
    }
}