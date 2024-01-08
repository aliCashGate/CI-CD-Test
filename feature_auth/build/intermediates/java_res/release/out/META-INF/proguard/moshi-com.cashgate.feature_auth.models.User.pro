-if class com.cashgate.feature_auth.models.User
-keepnames class com.cashgate.feature_auth.models.User
-if class com.cashgate.feature_auth.models.User
-keep class com.cashgate.feature_auth.models.UserJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.cashgate.feature_auth.models.User
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.cashgate.feature_auth.models.User
-keepclassmembers class com.cashgate.feature_auth.models.User {
    public synthetic <init>(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,boolean,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
