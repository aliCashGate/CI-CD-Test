-if class com.cashgate.feature_auth.models.VerifyUser
-keepnames class com.cashgate.feature_auth.models.VerifyUser
-if class com.cashgate.feature_auth.models.VerifyUser
-keep class com.cashgate.feature_auth.models.VerifyUserJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.cashgate.feature_auth.models.VerifyUser
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.cashgate.feature_auth.models.VerifyUser
-keepclassmembers class com.cashgate.feature_auth.models.VerifyUser {
    public synthetic <init>(java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
