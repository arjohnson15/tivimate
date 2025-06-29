package p456;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0484;
import p041.C1272;
import p417.AbstractC4753;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5301 extends AbstractC5324 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C1272 f20562;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public String f20563;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C1272 f20564;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public char f20565;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C1272 f20566;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final C1272 f20567;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C1272 f20568;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long f20569;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C1272 f20570;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C1272 f20571;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C1272 f20572;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C1272 f20573;

    public C5301(C5236 c5236) {
        super(c5236);
        this.f20565 = (char) 0;
        this.f20569 = -1L;
        this.f20571 = new C1272(this, 6, false, false);
        this.f20572 = new C1272(this, 6, true, false);
        this.f20564 = new C1272(this, 6, false, true);
        this.f20568 = new C1272(this, 5, false, false);
        this.f20570 = new C1272(this, 5, true, false);
        this.f20573 = new C1272(this, 5, false, true);
        this.f20562 = new C1272(this, 4, false, false);
        this.f20567 = new C1272(this, 3, false, false);
        this.f20566 = new C1272(this, 2, false, false);
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public static String m11910(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            return str.substring(0, iLastIndexOf);
        }
        C0484.f2819.get();
        return ((Boolean) AbstractC5248.f20267.m11751(null)).booleanValue() ? "" : str;
    }

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public static C5243 m11911(String str) {
        if (str == null) {
            return null;
        }
        return new C5243(str);
    }

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public static String m11912(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strM11913 = m11913(obj, z);
        String strM119132 = m11913(obj2, z);
        String strM119133 = m11913(obj3, z);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM11913)) {
            sb.append(str2);
            sb.append(strM11913);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM119132)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM119132);
        }
        if (!TextUtils.isEmpty(strM119133)) {
            sb.append(str3);
            sb.append(strM119133);
        }
        return sb.toString();
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public static String m11913(Object obj, boolean z) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C5243 ? ((C5243) obj).f20146 : z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strM11910 = m11910(C5236.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m11910(className).equals(strM11910)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final C1272 m11914() {
        return this.f20567;
    }

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public final String m11915() {
        String str;
        synchronized (this) {
            try {
                if (this.f20563 == null) {
                    String str2 = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20113;
                    if (str2 == null) {
                        str2 = "FA";
                    }
                    this.f20563 = str2;
                }
                AbstractC4753.m10683(this.f20563);
                str = this.f20563;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public final C1272 m11916() {
        return this.f20571;
    }

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public final C1272 m11917() {
        return this.f20566;
    }

    /* renamed from: יˆ, reason: contains not printable characters */
    public final C1272 m11918() {
        return this.f20568;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final void m11919(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && m11920(i)) {
            m11912(false, str, obj, obj2, obj3);
            m11915();
        }
        if (z2 || i < 5) {
            return;
        }
        AbstractC4753.m10683(str);
        C5247 c5247 = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20115;
        if (c5247 == null) {
            m11915();
        } else {
            if (!c5247.f20648) {
                m11915();
                return;
            }
            if (i < 0) {
                i = 0;
            }
            c5247.m11743(new RunnableC5354(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        }
    }

    @Override // p456.AbstractC5324
    /* renamed from: ᵔˋ */
    public final boolean mo11746() {
        return false;
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final boolean m11920(int i) {
        return Log.isLoggable(m11915(), i);
    }
}
