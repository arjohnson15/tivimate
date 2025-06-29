package p417;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.HandlerC0413;

/* renamed from: ﹳᴵ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4753 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean f18238;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int f18239;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Object f18240 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m10679(HandlerC0413 handlerC0413) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handlerC0413.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handlerC0413.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m10680(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m10681(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static boolean m10682(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m10683(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m10684(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m10685(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m10686() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m10687(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m10688(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m10689(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
