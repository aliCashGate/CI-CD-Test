-if class com.cashgate.core.responses.fetch_forms.FetchForm
-keepnames class com.cashgate.core.responses.fetch_forms.FetchForm
-if class com.cashgate.core.responses.fetch_forms.FetchForm
-keep class com.cashgate.core.responses.fetch_forms.FetchFormJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.cashgate.core.responses.fetch_forms.FetchForm
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.cashgate.core.responses.fetch_forms.FetchForm
-keepclassmembers class com.cashgate.core.responses.fetch_forms.FetchForm {
    public synthetic <init>(java.lang.Integer,java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,java.lang.Integer,java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.Object,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
