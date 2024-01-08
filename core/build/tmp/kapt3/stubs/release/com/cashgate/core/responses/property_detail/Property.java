package com.cashgate.core.responses.property_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00cb\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u0019J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u000b\u00103\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u00d4\u0001\u0010?\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00c6\u0001\u00a2\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\tH\u00d6\u0001J\t\u0010E\u001a\u00020\u0006H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b$\u0010 R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001dR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/\u00a8\u0006F"}, d2 = {"Lcom/cashgate/core/responses/property_detail/Property;", "", "amenities", "", "Lcom/cashgate/core/responses/property_detail/Amenity;", "bathrooms", "", "bedrooms", "categoryID", "", "contactNumber", "description", "id", "images", "Lcom/cashgate/core/responses/property_detail/Image;", "location", "neighbourhood", "price", "", "size", "socialmedia", "Lcom/cashgate/core/responses/property_detail/Socialmedia;", "title", "userID", "Lcom/cashgate/core/responses/property_detail/UserID;", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/cashgate/core/responses/property_detail/UserID;)V", "getAmenities", "()Ljava/util/List;", "getBathrooms", "()Ljava/lang/String;", "getBedrooms", "getCategoryID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContactNumber", "getDescription", "getId", "getImages", "getLocation", "getNeighbourhood", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSize", "getSocialmedia", "getTitle", "getUserID", "()Lcom/cashgate/core/responses/property_detail/UserID;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/cashgate/core/responses/property_detail/UserID;)Lcom/cashgate/core/responses/property_detail/Property;", "equals", "", "other", "hashCode", "toString", "core_release"})
public final class Property {
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.cashgate.core.responses.property_detail.Amenity> amenities = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String bathrooms = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String bedrooms = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer categoryID = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String contactNumber = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.cashgate.core.responses.property_detail.Image> images = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String location = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String neighbourhood = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double price = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String size = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.cashgate.core.responses.property_detail.Socialmedia> socialmedia = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable
    private final com.cashgate.core.responses.property_detail.UserID userID = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.cashgate.core.responses.property_detail.Property copy(@org.jetbrains.annotations.Nullable
    java.util.List<com.cashgate.core.responses.property_detail.Amenity> amenities, @org.jetbrains.annotations.Nullable
    java.lang.String bathrooms, @org.jetbrains.annotations.Nullable
    java.lang.String bedrooms, @org.jetbrains.annotations.Nullable
    java.lang.Integer categoryID, @org.jetbrains.annotations.Nullable
    java.lang.String contactNumber, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.util.List<com.cashgate.core.responses.property_detail.Image> images, @org.jetbrains.annotations.Nullable
    java.lang.String location, @org.jetbrains.annotations.Nullable
    java.lang.String neighbourhood, @org.jetbrains.annotations.Nullable
    java.lang.Double price, @org.jetbrains.annotations.Nullable
    java.lang.String size, @org.jetbrains.annotations.Nullable
    java.util.List<com.cashgate.core.responses.property_detail.Socialmedia> socialmedia, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    com.cashgate.core.responses.property_detail.UserID userID) {
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
    
    public Property() {
        super();
    }
    
    public Property(@org.jetbrains.annotations.Nullable
    java.util.List<com.cashgate.core.responses.property_detail.Amenity> amenities, @org.jetbrains.annotations.Nullable
    java.lang.String bathrooms, @org.jetbrains.annotations.Nullable
    java.lang.String bedrooms, @org.jetbrains.annotations.Nullable
    java.lang.Integer categoryID, @org.jetbrains.annotations.Nullable
    java.lang.String contactNumber, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.util.List<com.cashgate.core.responses.property_detail.Image> images, @org.jetbrains.annotations.Nullable
    java.lang.String location, @org.jetbrains.annotations.Nullable
    java.lang.String neighbourhood, @org.jetbrains.annotations.Nullable
    java.lang.Double price, @org.jetbrains.annotations.Nullable
    java.lang.String size, @org.jetbrains.annotations.Nullable
    java.util.List<com.cashgate.core.responses.property_detail.Socialmedia> socialmedia, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    com.cashgate.core.responses.property_detail.UserID userID) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.cashgate.core.responses.property_detail.Amenity> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.cashgate.core.responses.property_detail.Amenity> getAmenities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBathrooms() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBedrooms() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCategoryID() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getContactNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.cashgate.core.responses.property_detail.Image> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.cashgate.core.responses.property_detail.Image> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNeighbourhood() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.cashgate.core.responses.property_detail.Socialmedia> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.cashgate.core.responses.property_detail.Socialmedia> getSocialmedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.cashgate.core.responses.property_detail.UserID component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.cashgate.core.responses.property_detail.UserID getUserID() {
        return null;
    }
}