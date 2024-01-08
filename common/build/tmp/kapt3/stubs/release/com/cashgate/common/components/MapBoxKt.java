package com.cashgate.common.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a6\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a*\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002\u00a8\u0006\u0019"}, d2 = {"MapBoxComponent", "", "modifier", "Landroidx/compose/ui/Modifier;", "pointClickable", "", "point", "Lcom/mapbox/geojson/Point;", "onPointClick", "Lkotlin/Function1;", "MapBoxMap", "addAnnotationToMap", "context", "Landroid/content/Context;", "pointAnnotationManager", "Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotationManager;", "mapView", "Lcom/cashgate/common/custom/CustomMapView;", "bitmapFromDrawableRes", "Landroid/graphics/Bitmap;", "resourceId", "", "convertDrawableToBitmap", "sourceDrawable", "Landroid/graphics/drawable/Drawable;", "common_release"})
public final class MapBoxKt {
    
    @androidx.compose.runtime.Composable
    public static final void MapBoxComponent(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, boolean pointClickable, @org.jetbrains.annotations.NotNull
    com.mapbox.geojson.Point point, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.mapbox.geojson.Point, kotlin.Unit> onPointClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void MapBoxMap(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    com.mapbox.geojson.Point point, boolean pointClickable, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.mapbox.geojson.Point, kotlin.Unit> onPointClick) {
    }
    
    private static final void addAnnotationToMap(android.content.Context context, com.mapbox.geojson.Point point, com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager pointAnnotationManager, com.cashgate.common.custom.CustomMapView mapView) {
    }
    
    private static final android.graphics.Bitmap bitmapFromDrawableRes(android.content.Context context, @androidx.annotation.DrawableRes
    int resourceId) {
        return null;
    }
    
    private static final android.graphics.Bitmap convertDrawableToBitmap(android.graphics.drawable.Drawable sourceDrawable) {
        return null;
    }
}