package com.cashgate.common.mvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/cashgate/common/mvvm/BaseVM;", "T", "Landroidx/lifecycle/ViewModel;", "()V", "onTriggerEvent", "", "eventType", "(Ljava/lang/Object;)V", "common_release"})
public abstract class BaseVM<T extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    
    public BaseVM() {
        super();
    }
    
    public abstract void onTriggerEvent(T eventType);
}