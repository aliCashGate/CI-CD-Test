package com.cashgate.domain.usecases.getAddressFromLatLon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/cashgate/domain/usecases/getAddressFromLatLon/GetAddressUseCase;", "", "formsRepository", "Lcom/cashgate/domain/respository/get_form/GetFormRepository;", "(Lcom/cashgate/domain/respository/get_form/GetFormRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "longitude", "", "latitude", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"})
public final class GetAddressUseCase {
    private final com.cashgate.domain.respository.get_form.GetFormRepository formsRepository = null;
    
    @javax.inject.Inject
    public GetAddressUseCase(@org.jetbrains.annotations.NotNull
    com.cashgate.domain.respository.get_form.GetFormRepository formsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(double longitude, double latitude, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> continuation) {
        return null;
    }
}