-if class com.cashgate.core.responses.refresh_token.RefreshTokenEntity
-keepnames class com.cashgate.core.responses.refresh_token.RefreshTokenEntity
-if class com.cashgate.core.responses.refresh_token.RefreshTokenEntity
-keep class com.cashgate.core.responses.refresh_token.RefreshTokenEntityJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.cashgate.core.responses.refresh_token.RefreshTokenEntity
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.cashgate.core.responses.refresh_token.RefreshTokenEntity
-keepclassmembers class com.cashgate.core.responses.refresh_token.RefreshTokenEntity {
    public synthetic <init>(java.lang.String,java.lang.String,boolean,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
