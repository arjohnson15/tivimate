package p378;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p004.AbstractC0921;
import p421.C4861;

/* renamed from: ᵢٴ.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4385 extends C4331 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public static Class f16896;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static Field f16897;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static Field f16898;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static boolean f16899;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static Method f16900;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C4861 f16901;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final WindowInsets f16902;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C4369 f16903;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C4861 f16904;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C4861[] f16905;

    public AbstractC4385(C4369 c4369, WindowInsets windowInsets) {
        super(c4369);
        this.f16901 = null;
        this.f16902 = windowInsets;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    private C4861 m9974(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f16899) {
            m9975();
        }
        Method method = f16900;
        if (method != null && f16896 != null && f16898 != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    new NullPointerException();
                    return null;
                }
                Rect rect = (Rect) f16898.get(f16897.get(objInvoke));
                if (rect != null) {
                    return C4861.m10935(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                String str = "Failed to get visible insets. (Reflection error). " + e.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: ˋˊ, reason: contains not printable characters */
    private static void m9975() throws ClassNotFoundException, SecurityException {
        try {
            f16900 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f16896 = cls;
            f16898 = cls.getDeclaredField("mVisibleInsets");
            f16897 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f16898.setAccessible(true);
            f16897.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            String str = "Failed to get visible insets. (Reflection error). " + e.getMessage();
        }
        f16899 = true;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: ˎٴ, reason: contains not printable characters */
    private C4861 m9976(int i, boolean z) {
        C4861 c4861M10937 = C4861.f18363;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                c4861M10937 = C4861.m10937(c4861M10937, m9978(i2, z));
            }
        }
        return c4861M10937;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    private C4861 m9977() {
        C4369 c4369 = this.f16903;
        return c4369 != null ? c4369.f16871.mo9835() : C4861.f18363;
    }

    @Override // p378.C4331
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f16904, ((AbstractC4385) obj).f16904);
        }
        return false;
    }

    @Override // p378.C4331
    /* renamed from: ˉי */
    public final C4861 mo9832() {
        if (this.f16901 == null) {
            WindowInsets windowInsets = this.f16902;
            this.f16901 = C4861.m10935(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f16901;
    }

    @Override // p378.C4331
    /* renamed from: ˉⁱ */
    public C4369 mo9825(int i, int i2, int i3, int i4) {
        C4369 c4369M9950 = C4369.m9950(null, this.f16902);
        int i5 = Build.VERSION.SDK_INT;
        AbstractC4342 c4335 = i5 >= 30 ? new C4335(c4369M9950) : i5 >= 29 ? new C4375(c4369M9950) : new C4348(c4369M9950);
        c4335.mo9872(C4369.m9949(mo9832(), i, i2, i3, i4));
        c4335.mo9868(C4369.m9949(mo9835(), i, i2, i3, i4));
        return c4335.mo9867();
    }

    @Override // p378.C4331
    /* renamed from: ˏᴵ */
    public void mo9834(C4861[] c4861Arr) {
        this.f16905 = c4861Arr;
    }

    @Override // p378.C4331
    /* renamed from: ˑי */
    public void mo9837(C4369 c4369) {
        this.f16903 = c4369;
    }

    @Override // p378.C4331
    /* renamed from: ٴˎ */
    public C4861 mo9839(int i) {
        return m9976(i, false);
    }

    @Override // p378.C4331
    /* renamed from: ᴵʿ */
    public boolean mo9840() {
        return this.f16902.isRound();
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public C4861 m9978(int i, boolean z) {
        C4861 c4861Mo9835;
        int i2;
        if (i == 1) {
            return z ? C4861.m10935(0, Math.max(m9977().f18364, mo9832().f18364), 0, 0) : C4861.m10935(0, mo9832().f18364, 0, 0);
        }
        if (i == 2) {
            if (z) {
                C4861 c4861M9977 = m9977();
                C4861 c4861Mo98352 = mo9835();
                return C4861.m10935(Math.max(c4861M9977.f18366, c4861Mo98352.f18366), 0, Math.max(c4861M9977.f18365, c4861Mo98352.f18365), Math.max(c4861M9977.f18367, c4861Mo98352.f18367));
            }
            C4861 c4861Mo9832 = mo9832();
            C4369 c4369 = this.f16903;
            c4861Mo9835 = c4369 != null ? c4369.f16871.mo9835() : null;
            int iMin = c4861Mo9832.f18367;
            if (c4861Mo9835 != null) {
                iMin = Math.min(iMin, c4861Mo9835.f18367);
            }
            return C4861.m10935(c4861Mo9832.f18366, 0, c4861Mo9832.f18365, iMin);
        }
        C4861 c4861 = C4861.f18363;
        if (i == 8) {
            C4861[] c4861Arr = this.f16905;
            c4861Mo9835 = c4861Arr != null ? c4861Arr[3] : null;
            if (c4861Mo9835 != null) {
                return c4861Mo9835;
            }
            C4861 c4861Mo98322 = mo9832();
            C4861 c4861M99772 = m9977();
            int i3 = c4861Mo98322.f18367;
            if (i3 > c4861M99772.f18367) {
                return C4861.m10935(0, 0, 0, i3);
            }
            C4861 c48612 = this.f16904;
            return (c48612 == null || c48612.equals(c4861) || (i2 = this.f16904.f18367) <= c4861M99772.f18367) ? c4861 : C4861.m10935(0, 0, 0, i2);
        }
        if (i == 16) {
            return mo9829();
        }
        if (i == 32) {
            return mo9827();
        }
        if (i == 64) {
            return mo9826();
        }
        if (i != 128) {
            return c4861;
        }
        C4369 c43692 = this.f16903;
        C4356 c4356Mo9831 = c43692 != null ? c43692.f16871.mo9831() : mo9831();
        if (c4356Mo9831 == null) {
            return c4861;
        }
        int i4 = Build.VERSION.SDK_INT;
        return C4861.m10935(i4 >= 28 ? AbstractC0921.m3773(c4356Mo9831.f16862) : 0, i4 >= 28 ? AbstractC0921.m3776(c4356Mo9831.f16862) : 0, i4 >= 28 ? AbstractC0921.m3769(c4356Mo9831.f16862) : 0, i4 >= 28 ? AbstractC0921.m3772(c4356Mo9831.f16862) : 0);
    }

    @Override // p378.C4331
    /* renamed from: ﹳﹳ */
    public void mo9841(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C4861 c4861M9974 = m9974(view);
        if (c4861M9974 == null) {
            c4861M9974 = C4861.f18363;
        }
        m9979(c4861M9974);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public void m9979(C4861 c4861) {
        this.f16904 = c4861;
    }
}
