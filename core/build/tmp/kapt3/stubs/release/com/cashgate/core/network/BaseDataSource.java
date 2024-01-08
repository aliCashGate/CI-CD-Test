package com.cashgate.core.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JC\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00052\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/cashgate/core/network/BaseDataSource;", "", "()V", "getResult", "Lcom/cashgate/core/network/Resource;", "T", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/cashgate/core/network/GraphQLResponse;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_release"})
public abstract class BaseDataSource {
    
    public BaseDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final <T extends java.lang.Object>java.lang.Object getResult(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.cashgate.core.network.GraphQLResponse<T>>, ? extends java.lang.Object> call, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cashgate.core.network.Resource<T>> continuation) {
        return null;
    }
}