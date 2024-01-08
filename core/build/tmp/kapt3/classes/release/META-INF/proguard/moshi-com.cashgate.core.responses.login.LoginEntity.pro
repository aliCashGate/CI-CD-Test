-if class com.cashgate.core.responses.login.LoginEntity
-keepnames class com.cashgate.core.responses.login.LoginEntity
-if class com.cashgate.core.responses.login.LoginEntity
-keep class com.cashgate.core.responses.login.LoginEntityJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
