package com.cashgate.core.responses.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0012J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u00107\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010<\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u0010=\u001a\u00020\bH\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0094\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\n2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\bH\u00d6\u0001J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0014\"\u0004\b(\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016\u00a8\u0006F"}, d2 = {"Lcom/cashgate/core/responses/home/CategoriesData;", "", "image", "", "title", "parentId", "id", "showOnScreen", "", "hasChild", "", "step", "selectedForms", "", "Lcom/cashgate/core/responses/fetch_forms/FetchForm;", "categoryId", "hasForm", "formID", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", "getFormID", "()Ljava/lang/Integer;", "setFormID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHasChild", "()Ljava/lang/Boolean;", "setHasChild", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getHasForm", "setHasForm", "getId", "setId", "getImage", "setImage", "getParentId", "setParentId", "getSelectedForms", "()Ljava/util/List;", "setSelectedForms", "(Ljava/util/List;)V", "getShowOnScreen", "setShowOnScreen", "getStep", "()I", "setStep", "(I)V", "getTitle", "setTitle", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/cashgate/core/responses/home/CategoriesData;", "equals", "other", "hashCode", "toString", "core_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class CategoriesData {
    @org.jetbrains.annotations.Nullable
    private java.lang.String image;
    @org.jetbrains.annotations.Nullable
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable
    private java.lang.String parentId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer showOnScreen;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean hasChild;
    private int step;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.cashgate.core.responses.fetch_forms.FetchForm> selectedForms;
    @org.jetbrains.annotations.Nullable
    private java.lang.String categoryId;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean hasForm;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer formID;
    
    @org.jetbrains.annotations.NotNull
    public final com.cashgate.core.responses.home.CategoriesData copy(@org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String parentId, @org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.Integer showOnScreen, @org.jetbrains.annotations.Nullable
    java.lang.Boolean hasChild, int step, @org.jetbrains.annotations.NotNull
    java.util.List<com.cashgate.core.responses.fetch_forms.FetchForm> selectedForms, @org.jetbrains.annotations.Nullable
    java.lang.String categoryId, @org.jetbrains.annotations.Nullable
    java.lang.Boolean hasForm, @org.jetbrains.annotations.Nullable
    java.lang.Integer formID) {
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
    
    public CategoriesData() {
        super();
    }
    
    public CategoriesData(@org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String parentId, @org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.Integer showOnScreen, @org.jetbrains.annotations.Nullable
    java.lang.Boolean hasChild, int step, @org.jetbrains.annotations.NotNull
    java.util.List<com.cashgate.core.responses.fetch_forms.FetchForm> selectedForms, @org.jetbrains.annotations.Nullable
    java.lang.String categoryId, @org.jetbrains.annotations.Nullable
    java.lang.Boolean hasForm, @org.jetbrains.annotations.Nullable
    java.lang.Integer formID) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getParentId() {
        return null;
    }
    
    public final void setParentId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getShowOnScreen() {
        return null;
    }
    
    public final void setShowOnScreen(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getHasChild() {
        return null;
    }
    
    public final void setHasChild(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getStep() {
        return 0;
    }
    
    public final void setStep(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.cashgate.core.responses.fetch_forms.FetchForm> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.cashgate.core.responses.fetch_forms.FetchForm> getSelectedForms() {
        return null;
    }
    
    public final void setSelectedForms(@org.jetbrains.annotations.NotNull
    java.util.List<com.cashgate.core.responses.fetch_forms.FetchForm> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCategoryId() {
        return null;
    }
    
    public final void setCategoryId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getHasForm() {
        return null;
    }
    
    public final void setHasForm(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getFormID() {
        return null;
    }
    
    public final void setFormID(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
}