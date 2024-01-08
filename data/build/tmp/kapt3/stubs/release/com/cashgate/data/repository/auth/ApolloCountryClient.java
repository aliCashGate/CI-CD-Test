package com.cashgate.data.repository.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/cashgate/data/repository/auth/ApolloCountryClient;", "Lcom/cashgate/domain/usecases/auth/CountryClient;", "apolloClient", "Lcom/apollographql/apollo3/ApolloClient;", "(Lcom/apollographql/apollo3/ApolloClient;)V", "getCountries", "Lcom/cashgate/common/CountriesQuery$Data;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"})
public final class ApolloCountryClient implements com.cashgate.domain.usecases.auth.CountryClient {
    private final com.apollographql.apollo3.ApolloClient apolloClient = null;
    
    public ApolloCountryClient(@org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.ApolloClient apolloClient) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCountries(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.common.CountriesQuery.Data> continuation) {
        return null;
    }
}