-if class com.cashgate.core.responses.login.User
-keepnames class com.cashgate.core.responses.login.User
-if class com.cashgate.core.responses.login.User
-keep class com.cashgate.core.responses.login.UserJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.cashgate.core.responses.login.User
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.cashgate.core.responses.login.User
-keepclassmembers class com.cashgate.core.responses.login.User {
    public synthetic <init>(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
