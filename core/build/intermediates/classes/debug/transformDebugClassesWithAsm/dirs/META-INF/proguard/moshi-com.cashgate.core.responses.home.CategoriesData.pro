-if class com.cashgate.core.responses.home.CategoriesData
-keepnames class com.cashgate.core.responses.home.CategoriesData
-if class com.cashgate.core.responses.home.CategoriesData
-keep class com.cashgate.core.responses.home.CategoriesDataJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.cashgate.core.responses.home.CategoriesData
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.cashgate.core.responses.home.CategoriesData
-keepclassmembers class com.cashgate.core.responses.home.CategoriesData {
    public synthetic <init>(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
