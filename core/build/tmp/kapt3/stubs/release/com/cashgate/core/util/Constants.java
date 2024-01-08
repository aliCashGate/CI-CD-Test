package com.cashgate.core.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b;\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010!R\u0014\u0010=\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0006R\u0014\u0010?\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0006R\u000e\u0010A\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010F\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0006R\u0014\u0010H\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0006R\u000e\u0010J\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010K\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0006R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010!R\u000e\u0010O\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010!R\u000e\u0010R\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006Z"}, d2 = {"Lcom/cashgate/core/util/Constants;", "", "()V", "AFL", "", "getAFL", "()Ljava/lang/String;", "ALIGNMENT", "APP_PREFERENCE", "ARGS", "BASE_URL", "BOTTOM", "BUTTON_ACTION", "CATEGORY_ID", "getCATEGORY_ID", "CATEGORY_UNDESCORE_ID", "EMAIL", "getEMAIL", "ERROR_FIELDS", "EXTRA_TITLE", "EXTRA_TITLE_ALIGNMENT", "EXTRA_TITLE_POSITION", "FIELD_VALIDATION", "FIRSTNAME", "getFIRSTNAME", "FIRST_NAME", "IMAGE", "INCLUDE_CHILD", "getINCLUDE_CHILD", "IS_LOGGED_IN", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getIS_LOGGED_IN", "()Landroidx/datastore/preferences/core/Preferences$Key;", "KEY", "LASTNAME", "getLASTNAME", "LAST_NAME", "LEFT", "NEXT_STEP", "OPTIONS", "PAGE", "getPAGE", "PASSWORD", "getPASSWORD", "PHONE", "getPHONE", "PLACEHOLDER", "POSITION", "PRIVACY_POLICY", "PROPERTYID", "PROPERTY_IMAGES_URL", "PROPERTY_PAYMENT_INTENT_URL", "REFRESH_TOKEN", "getREFRESH_TOKEN", "REFRESH_TOKEN_URL", "REMOVE_URL", "REQUIRED", "RIGHT", "SHOWN_INTRO", "getSHOWN_INTRO", "SHOW_ON_SCREEN", "getSHOW_ON_SCREEN", "STEPS", "getSTEPS", "STRIPE_PUB_KEY", "TERMS_CONDITION", "TITLE", "TOP", "TYPE", "TYPE_EMAIL", "getTYPE_EMAIL", "TYPE_PHONE", "getTYPE_PHONE", "UPLOAD_URL", "USERID", "getUSERID", "USER_DETAILS", "getUSER_DETAILS", "USER_PROFILE_URL", "USER_TOKEN", "getUSER_TOKEN", "VALUES", "VALUES_TYPE", "VERIFY_TOKEN_URL", "customer", "ephemeralKey", "paymentIntent", "pub_key", "verified", "core_release"})
public final class Constants {
    @org.jetbrains.annotations.NotNull
    public static final com.cashgate.core.util.Constants INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TYPE_EMAIL = "email";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TYPE_PHONE = "phone";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String AFL = "afl";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SHOW_ON_SCREEN = "showOnScreen";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CATEGORY_ID = "categoryId";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String STEPS = "steps";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String INCLUDE_CHILD = "includeChild";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String EMAIL = "email";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PHONE = "phone";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PASSWORD = "password";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String FIRSTNAME = "firstName";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String LASTNAME = "lastName";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PAGE = "page";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String USERID = "userId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PROPERTYID = "propertyId";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUES = "values";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FIRST_NAME = "first_name";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LAST_NAME = "last_name";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IMAGE = "image";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PLACEHOLDER = "placeholder";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TITLE = "title";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FIELD_VALIDATION = "field_validation";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REQUIRED = "required";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ALIGNMENT = "alignment";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String POSITION = "position";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TOP = "top";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BOTTOM = "bottom";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LEFT = "left";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String RIGHT = "right";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARGS = "args";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CATEGORY_UNDESCORE_ID = "category_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ERROR_FIELDS = "error_fields";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "baseURL";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String STRIPE_PUB_KEY = "stripePubKey";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String UPLOAD_URL = "/restapis/upload";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REMOVE_URL = "/restapis/remove";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PROPERTY_PAYMENT_INTENT_URL = "/restapis/property-paymentintent";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VERIFY_TOKEN_URL = "/restapis/verify-token";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REFRESH_TOKEN_URL = "/restapis/refresh-token";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TERMS_CONDITION = "https://kulushae.com/terms.html";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PRIVACY_POLICY = "https://kulushae.com/privacy.html";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY = "key";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PROPERTY_IMAGES_URL = "PROPERTY_IMAGES_URL";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_PROFILE_URL = "USER_PROFILE_URL";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TYPE = "type";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUES_TYPE = "values_type";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OPTIONS = "options";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_TITLE = "extra_title";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_TITLE_POSITION = "extra_title_position";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_TITLE_ALIGNMENT = "extra_title_alignment";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BUTTON_ACTION = "button_action";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NEXT_STEP = "next_step";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String verified = "verified";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String paymentIntent = "paymentIntent";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ephemeralKey = "ephemeralKey";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String customer = "customer";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String pub_key = "pub_key";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String APP_PREFERENCE = "kulushae_app_preference";
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> IS_LOGGED_IN = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> SHOWN_INTRO = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> USER_TOKEN = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> REFRESH_TOKEN = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> USER_DETAILS = null;
    
    private Constants() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTYPE_EMAIL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTYPE_PHONE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAFL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSHOW_ON_SCREEN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCATEGORY_ID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSTEPS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getINCLUDE_CHILD() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEMAIL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPHONE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPASSWORD() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFIRSTNAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLASTNAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPAGE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUSERID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> getIS_LOGGED_IN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> getSHOWN_INTRO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getUSER_TOKEN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getREFRESH_TOKEN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getUSER_DETAILS() {
        return null;
    }
}