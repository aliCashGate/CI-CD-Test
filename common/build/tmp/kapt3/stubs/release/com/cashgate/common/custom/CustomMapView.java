package com.cashgate.common.custom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/cashgate/common/custom/CustomMapView;", "Lcom/mapbox/maps/MapView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "common_release"})
public final class CustomMapView extends com.mapbox.maps.MapView {
    
    public CustomMapView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null);
    }
    
    @java.lang.Override
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.Nullable
    android.view.MotionEvent ev) {
        return false;
    }
}