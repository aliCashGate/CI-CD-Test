package com.cashgate.feature_home.presentation.ui.screens.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ9\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010/\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002\u00a2\u0006\u0002\u00104J\u0006\u00105\u001a\u00020+J\u0006\u00106\u001a\u00020\u001aJ\u0006\u0010\"\u001a\u00020+J\b\u00107\u001a\u00020+H\u0002J\b\u00108\u001a\u00020+H\u0002J\u000e\u00109\u001a\u00020+2\u0006\u0010:\u001a\u000201J\u000e\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\u001aJ\u000e\u0010=\u001a\u00020+2\u0006\u0010:\u001a\u000201R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00110\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001eR\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00110\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001e\u00a8\u0006>"}, d2 = {"Lcom/cashgate/feature_home/presentation/ui/screens/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "getCategoriesUseCase", "Lcom/cashgate/domain/usecases/home/GetCategoriesUseCase;", "getHomeListUseCase", "Lcom/cashgate/domain/usecases/home/GetHomeListUseCase;", "getCountriesUseCase", "Lcom/cashgate/domain/usecases/auth/GetCountriesUseCase;", "getPropertiesUseCase", "Lcom/cashgate/domain/usecases/home/GetPropertiesUseCase;", "(Landroid/content/Context;Lcom/cashgate/domain/usecases/home/GetCategoriesUseCase;Lcom/cashgate/domain/usecases/home/GetHomeListUseCase;Lcom/cashgate/domain/usecases/auth/GetCountriesUseCase;Lcom/cashgate/domain/usecases/home/GetPropertiesUseCase;)V", "_categoriesData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cashgate/core/uistates/CategoriesUiState;", "_categoriesListData", "", "Lcom/cashgate/core/responses/home/CategoriesData;", "_homeList", "Lcom/cashgate/core/responses/home/HomeListData;", "_homeListData", "Lcom/cashgate/feature_home/presentation/ui/screens/home/uistates/HomeListUiState;", "_propertiesData", "Lcom/cashgate/feature_home/presentation/ui/screens/home/uistates/PropertiesUiState;", "_regionsList", "Lcom/cashgate/core/responses/regions/RegionsData;", "categoriesData", "Lkotlinx/coroutines/flow/StateFlow;", "getCategoriesData", "()Lkotlinx/coroutines/flow/StateFlow;", "categoriesListData", "getCategoriesListData", "homeList", "getHomeList", "homeListData", "getHomeListData", "mListRegions", "propertiesData", "getPropertiesData", "regionsList", "getRegionsList", "getCategories", "", "showScreen", "", "afl", "categoryId", "header", "", "includeChild", "", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)V", "getCountries", "getCurrentRegion", "getProperties", "getRegions", "onErrorState", "error", "onListItemClick", "item", "onPropertyErrorState", "feature_home_release"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.cashgate.domain.usecases.home.GetCategoriesUseCase getCategoriesUseCase = null;
    private final com.cashgate.domain.usecases.home.GetHomeListUseCase getHomeListUseCase = null;
    private final com.cashgate.domain.usecases.auth.GetCountriesUseCase getCountriesUseCase = null;
    private final com.cashgate.domain.usecases.home.GetPropertiesUseCase getPropertiesUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.core.uistates.CategoriesUiState> _categoriesData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.core.uistates.CategoriesUiState> categoriesData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_home.presentation.ui.screens.home.uistates.PropertiesUiState> _propertiesData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_home.presentation.ui.screens.home.uistates.PropertiesUiState> propertiesData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.cashgate.core.responses.home.CategoriesData>> _categoriesListData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.cashgate.core.responses.home.CategoriesData>> categoriesListData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cashgate.feature_home.presentation.ui.screens.home.uistates.HomeListUiState> _homeListData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_home.presentation.ui.screens.home.uistates.HomeListUiState> homeListData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.cashgate.core.responses.home.HomeListData>> _homeList = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.cashgate.core.responses.home.HomeListData>> homeList = null;
    private java.util.List<com.cashgate.core.responses.regions.RegionsData> mListRegions;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.cashgate.core.responses.regions.RegionsData>> _regionsList;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.cashgate.core.responses.regions.RegionsData>> regionsList = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.home.GetCategoriesUseCase getCategoriesUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.home.GetHomeListUseCase getHomeListUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.auth.GetCountriesUseCase getCountriesUseCase, @org.jetbrains.annotations.NotNull
    com.cashgate.domain.usecases.home.GetPropertiesUseCase getPropertiesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.core.uistates.CategoriesUiState> getCategoriesData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_home.presentation.ui.screens.home.uistates.PropertiesUiState> getPropertiesData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.cashgate.core.responses.home.CategoriesData>> getCategoriesListData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cashgate.feature_home.presentation.ui.screens.home.uistates.HomeListUiState> getHomeListData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.cashgate.core.responses.home.HomeListData>> getHomeList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.cashgate.core.responses.regions.RegionsData>> getRegionsList() {
        return null;
    }
    
    private final void getRegions() {
    }
    
    public final void onListItemClick(@org.jetbrains.annotations.NotNull
    com.cashgate.core.responses.regions.RegionsData item) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.cashgate.core.responses.regions.RegionsData getCurrentRegion() {
        return null;
    }
    
    public final void getCountries() {
    }
    
    public final void getHomeList() {
    }
    
    private final void getProperties() {
    }
    
    private final void getCategories(int showScreen, java.lang.Integer afl, java.lang.Integer categoryId, java.lang.String header, boolean includeChild) {
    }
    
    public final void onErrorState(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
    
    public final void onPropertyErrorState(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
}