package p070;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013.AbstractC1035;
import p013.AbstractC1037;
import p013.AbstractC1039;
import p176.InterfaceC2487;
import p288.C3395;
import p317.AbstractC3616;
import p338.InterfaceC3852;
import p338.InterfaceC3853;
import p338.InterfaceC3854;
import p338.InterfaceC3855;
import p338.InterfaceC3856;
import p338.InterfaceC3857;
import p338.InterfaceC3858;
import p338.InterfaceC3859;
import p338.InterfaceC3860;
import p338.InterfaceC3861;
import p338.InterfaceC3862;
import p338.InterfaceC3863;
import p338.InterfaceC3864;
import p338.InterfaceC3865;
import p338.InterfaceC3866;
import p338.InterfaceC3867;
import p338.InterfaceC3868;
import p338.InterfaceC3869;
import p338.InterfaceC3870;
import p338.InterfaceC3871;
import p338.InterfaceC3872;
import p338.InterfaceC3873;
import p338.InterfaceC3874;
import ﹶⁱ.ـﹶ;

/* renamed from: ʿ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1545 implements InterfaceC2487, InterfaceC1564 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Map f6278;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final HashMap f6279;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final LinkedHashMap f6280;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class f6281;

    static {
        int i = 0;
        List listM4011 = AbstractC1037.m4011(InterfaceC3865.class, InterfaceC3856.class, InterfaceC3864.class, InterfaceC3870.class, InterfaceC3859.class, InterfaceC3869.class, InterfaceC3871.class, InterfaceC3854.class, InterfaceC3857.class, InterfaceC3874.class, InterfaceC3852.class, InterfaceC3863.class, InterfaceC3872.class, InterfaceC3853.class, InterfaceC3866.class, InterfaceC3867.class, InterfaceC3862.class, InterfaceC3873.class, InterfaceC3855.class, InterfaceC3860.class, InterfaceC3858.class, InterfaceC3868.class, InterfaceC3861.class);
        ArrayList arrayList = new ArrayList(AbstractC1039.m4012(listM4011, 10));
        for (Object obj : listM4011) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1037.m4008();
                throw null;
            }
            arrayList.add(new C3395((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f6278 = AbstractC1035.m3983(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        for (String str : map.values()) {
            map3.put("kotlin.jvm.internal." + AbstractC3616.m8519(str, '.', str) + "CompanionObject", str.concat(".Companion"));
        }
        for (Map.Entry entry : f6278.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f6279 = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1035.m3985(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, AbstractC3616.m8519(str2, '.', str2));
        }
        f6280 = linkedHashMap;
    }

    public C1545(Class cls) {
        this.f6281 = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1545) && ـﹶ.ﹳˑ(this).equals(ـﹶ.ﹳˑ((InterfaceC2487) obj));
    }

    public final int hashCode() {
        return ـﹶ.ﹳˑ(this).hashCode();
    }

    public final String toString() {
        return this.f6281.toString() + " (Kotlin reflection is not available)";
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String m5132() {
        String str;
        Class cls = this.f6281;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean zIsArray = cls.isArray();
        HashMap map = f6279;
        if (!zIsArray) {
            String str2 = (String) map.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String m5133() {
        String str;
        Class cls = this.f6281;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f6280;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC3616.m8538(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC3616.m8526(simpleName, '$');
        }
        return AbstractC3616.m8538(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // p070.InterfaceC1564
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class mo5134() {
        return this.f6281;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m5135(Object obj) {
        Map map = f6278;
        Class cls = this.f6281;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return AbstractC1549.m5143(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = ـﹶ.ﹳˑ(AbstractC1563.m5154(cls));
        }
        return cls.isInstance(obj);
    }
}
