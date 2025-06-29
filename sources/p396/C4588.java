package p396;

import androidx.leanback.widget.ʿˏ;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p430.C5002;
import p430.C5014;

/* renamed from: ⁱᴵ.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4588 {

    /* renamed from: יʻ, reason: contains not printable characters */
    public static final Pattern f17544 = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static final Pattern f17545 = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Class f17546;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Annotation[][] f17547;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public C5002 f17548;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f17549;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f17550;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public LinkedHashSet f17551;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean f17552;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean f17553;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f17554;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public String f17555;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f17556;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Method f17557;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f17558;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ʿˏ f17559;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Type[] f17560;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f17561;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public boolean f17562;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public String f17563;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f17564;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public C5014 f17565;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Annotation[] f17566;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f17567;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public boolean f17568;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public AbstractC4581[] f17569;

    public C4588(ʿˏ r1, Class cls, Method method) {
        this.f17559 = r1;
        this.f17546 = cls;
        this.f17557 = method;
        this.f17566 = method.getAnnotations();
        this.f17560 = method.getGenericParameterTypes();
        this.f17547 = method.getParameterAnnotations();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Class m10485(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10486(String str, String str2, boolean z) {
        String str3 = this.f17555;
        Method method = this.f17557;
        if (str3 != null) {
            throw AbstractC4581.m10478(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f17555 = str;
        this.f17558 = z;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f17544;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw AbstractC4581.m10478(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f17563 = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f17551 = linkedHashSet;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10487(int i, Type type) {
        if (AbstractC4581.m10467(type)) {
            throw AbstractC4581.m10472(this.f17557, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
