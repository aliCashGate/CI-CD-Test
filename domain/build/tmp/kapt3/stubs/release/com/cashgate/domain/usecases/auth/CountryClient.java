package com.cashgate.domain.usecases.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Lcom/cashgate/domain/usecases/auth/CountryClient;", "", "getCountries", "Lcom/cashgate/common/CountriesQuery$Data;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"})
public abstract interface CountryClient {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCountries(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.common.CountriesQuery.Data> continuation);
}