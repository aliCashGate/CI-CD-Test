package com.cashgate.core.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u001f B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006!"}, d2 = {"Lcom/cashgate/core/network/Resource;", "T", "", "status", "Lcom/cashgate/core/network/Resource$Status;", "data", "message", "", "(Lcom/cashgate/core/network/Resource$Status;Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getStatus", "()Lcom/cashgate/core/network/Resource$Status;", "setStatus", "(Lcom/cashgate/core/network/Resource$Status;)V", "component1", "component2", "component3", "copy", "(Lcom/cashgate/core/network/Resource$Status;Ljava/lang/Object;Ljava/lang/String;)Lcom/cashgate/core/network/Resource;", "equals", "", "other", "hashCode", "", "toString", "Companion", "Status", "core_debug"})
public final class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull
    private com.cashgate.core.network.Resource.Status status;
    @org.jetbrains.annotations.Nullable
    private T data;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull
    public static final com.cashgate.core.network.Resource.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.cashgate.core.network.Resource<T> copy(@org.jetbrains.annotations.NotNull
    com.cashgate.core.network.Resource.Status status, @org.jetbrains.annotations.Nullable
    T data, @org.jetbrains.annotations.Nullable
    java.lang.String message) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Resource(@org.jetbrains.annotations.NotNull
    com.cashgate.core.network.Resource.Status status, @org.jetbrains.annotations.Nullable
    T data, @org.jetbrains.annotations.Nullable
    java.lang.String message) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.cashgate.core.network.Resource.Status component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.cashgate.core.network.Resource.Status getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull
    com.cashgate.core.network.Resource.Status p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final T component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/cashgate/core/network/Resource$Status;", "", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "LOADING", "core_debug"})
    public static enum Status {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ ERROR /* = new ERROR() */,
        /*public static final*/ LOADING /* = new LOADING() */;
        
        Status() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00052\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/cashgate/core/network/Resource$Companion;", "", "()V", "error", "Lcom/cashgate/core/network/Resource;", "T", "data", "message", "", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/cashgate/core/network/Resource;", "loading", "(Ljava/lang/Object;)Lcom/cashgate/core/network/Resource;", "success", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final <T extends java.lang.Object>com.cashgate.core.network.Resource<T> success(T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final <T extends java.lang.Object>com.cashgate.core.network.Resource<T> error(@org.jetbrains.annotations.Nullable
        T data, @org.jetbrains.annotations.NotNull
        java.lang.String message) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final <T extends java.lang.Object>com.cashgate.core.network.Resource<T> loading(@org.jetbrains.annotations.Nullable
        T data) {
            return null;
        }
    }
}