package com.cashgate.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/cashgate/data/repository/Mapper;", "E", "D", "", "mapToEntity", "type", "(Ljava/lang/Object;)Ljava/lang/Object;", "data_release"})
public abstract interface Mapper<E extends java.lang.Object, D extends java.lang.Object> {
    
    public abstract E mapToEntity(D type);
}