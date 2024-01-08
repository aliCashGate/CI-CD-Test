package com.cashgate.feature_ad_posting.presentation.ui.screens.child_categories;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J;\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/cashgate/feature_ad_posting/presentation/ui/screens/child_categories/ChildCategoriesViewModel;", "Landroidx/lifecycle/ViewModel;", "getCategoriesUseCase", "Lcom/cashgate/domain/usecases/home/GetCategoriesUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/cashgate/domain/usecases/home/GetCategoriesUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_categoriesData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cashgate/core/uistates/CategoriesUiState;", "categoriesData", "Lkotlinx/coroutines/flow/StateFlow;", "getCategoriesData", "()Lkotlinx/coroutines/flow/StateFlow;", "getCategories", "", "showScreen", "", "afl", "categoryID", "header", "", "includeChild", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)V", "onErrorState", "error", "feature_ad_posting_release"})
public final class ChildCategoriesViewModel extends androidx.lifecycle.ViewModel {
    private final com.cashgate.domain.usecases.home.GetCategoriesUseCase getCategoriesUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.core.uistates.CategoriesUiState> _categoriesData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.core.uistates.CategoriesUiState> categoriesData = null;
    
    @javax.inject.Inject
    public ChildCategoriesViewModel(@org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.home.GetCategoriesUseCase getCategoriesUseCase, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.core.uistates.CategoriesUiState> getCategoriesData() {
        return null;
    }
    
    private final void getCategories(java.lang.Integer showScreen, java.lang.Integer afl, java.lang.Integer categoryID, java.lang.String header, boolean includeChild) {
    }
    
    public final void onErrorState(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
}