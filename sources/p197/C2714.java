package p197;

import android.util.Property;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: ˎˑ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2714 implements Cloneable {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static final Class[] f10613;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static final HashMap f10614;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static final Class[] f10615;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final HashMap f10616;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final Class[] f10617;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Property f10618;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Class f10619;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public InterfaceC2717 f10620;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Method f10621;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C2721 f10622;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Method f10623;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public String f10624;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public float f10625;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C2721 f10626;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Object[] f10627;

    static {
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        f10617 = new Class[]{cls, Float.class, cls2, cls3, Double.class, Integer.class};
        f10613 = new Class[]{cls3, Integer.class, cls, cls2, Float.class, Double.class};
        f10615 = new Class[]{cls2, Double.class, cls, cls3, Float.class, Integer.class};
        f10614 = new HashMap();
        f10616 = new HashMap();
    }

    public C2714(Property property, float... fArr) {
        this.f10621 = null;
        this.f10623 = null;
        this.f10626 = null;
        this.f10627 = new Object[1];
        this.f10618 = property;
        if (property != null) {
            this.f10624 = property.getName();
        }
        m6879(fArr);
    }

    public C2714(String str, float... fArr) {
        this.f10621 = null;
        this.f10623 = null;
        this.f10626 = null;
        this.f10627 = new Object[1];
        this.f10624 = str;
        m6879(fArr);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m6876(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return str + Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
    }

    public final String toString() {
        return this.f10624 + ": " + this.f10626.toString();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C2714 clone() {
        C2714 c2714;
        try {
            c2714 = (C2714) super.clone();
            c2714.f10624 = this.f10624;
            c2714.f10618 = this.f10618;
            c2714.f10626 = this.f10626.clone();
            c2714.f10620 = this.f10620;
        } catch (CloneNotSupportedException unused) {
            c2714 = null;
        }
        c2714.f10622 = c2714.f10626;
        return c2714;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Method m6878(Class cls, String str, Class cls2) throws NoSuchMethodException, SecurityException {
        String strM6876 = m6876(str, this.f10624);
        Method method = null;
        if (cls2 == null) {
            try {
                method = cls.getMethod(strM6876, null);
            } catch (NoSuchMethodException unused) {
            }
        } else {
            for (Class cls3 : cls2.equals(Float.class) ? f10617 : cls2.equals(Integer.class) ? f10613 : cls2.equals(Double.class) ? f10615 : new Class[]{cls2}) {
                Class[] clsArr = {cls3};
                try {
                    try {
                        Method method2 = cls.getMethod(strM6876, clsArr);
                        this.f10619 = cls3;
                        return method2;
                    } catch (NoSuchMethodException unused2) {
                    }
                } catch (NoSuchMethodException unused3) {
                    method = cls.getDeclaredMethod(strM6876, clsArr);
                    method.setAccessible(true);
                    this.f10619 = cls3;
                    return method;
                }
            }
        }
        if (method == null) {
            String str2 = "Method " + m6876(str, this.f10624) + "() with type " + cls2 + " not found on target class " + cls;
        }
        return method;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m6879(float... fArr) {
        this.f10619 = Float.TYPE;
        int length = fArr.length;
        C2730[] c2730Arr = new C2730[Math.max(length, 2)];
        boolean z = true;
        boolean z2 = false;
        if (length == 1) {
            c2730Arr[0] = new C2730(0.0f);
            float f = fArr[0];
            c2730Arr[1] = new C2730(1.0f, f);
            if (!Float.isNaN(f)) {
                z = false;
            }
        } else {
            c2730Arr[0] = new C2730(0.0f, fArr[0]);
            for (int i = 1; i < length; i++) {
                float f2 = fArr[i];
                c2730Arr[i] = new C2730(i / (length - 1), f2);
                if (Float.isNaN(f2)) {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (z) {
        }
        C2721 c2721 = new C2721(c2730Arr);
        this.f10626 = c2721;
        this.f10622 = c2721;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Method m6880(Class cls, HashMap map, String str, Class cls2) {
        Method methodM6878;
        boolean zContainsKey;
        synchronized (map) {
            try {
                HashMap map2 = (HashMap) map.get(cls);
                methodM6878 = null;
                if (map2 != null) {
                    zContainsKey = map2.containsKey(this.f10624);
                    if (zContainsKey) {
                        methodM6878 = (Method) map2.get(this.f10624);
                    }
                } else {
                    zContainsKey = false;
                }
                if (!zContainsKey) {
                    methodM6878 = m6878(cls, str, cls2);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(cls, map2);
                    }
                    map2.put(this.f10624, methodM6878);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return methodM6878;
    }
}
