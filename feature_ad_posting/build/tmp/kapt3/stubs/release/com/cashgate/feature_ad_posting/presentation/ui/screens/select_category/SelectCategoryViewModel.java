package com.cashgate.feature_ad_posting.presentation.ui.screens.select_category;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J;\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/cashgate/feature_ad_posting/presentation/ui/screens/select_category/SelectCategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "getCategoriesUseCase", "Lcom/cashgate/domain/usecases/home/GetCategoriesUseCase;", "(Lcom/cashgate/domain/usecases/home/GetCategoriesUseCase;)V", "_categoriesData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cashgate/core/uistates/CategoriesUiState;", "categoriesData", "Lkotlinx/coroutines/flow/StateFlow;", "getCategoriesData", "()Lkotlinx/coroutines/flow/StateFlow;", "getCategories", "", "showScreen", "", "afl", "categoryID", "header", "", "includeChild", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)V", "onErrorState", "error", "feature_ad_posting_release"})
public final class SelectCategoryViewModel extends androidx.lifecycle.ViewModel {
    private final com.cashgate.domain.usecases.home.GetCategoriesUseCase getCategoriesUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.core.uistates.CategoriesUiState> _categoriesData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.core.uistates.CategoriesUiState> categoriesData = null;
    
    @javax.inject.Inject
    public SelectCategoryViewModel(@org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.home.GetCategoriesUseCase getCategoriesUseCase) {
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