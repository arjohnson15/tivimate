package p329;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: ᴵᵢ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3742 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static volatile Handler f14502;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final char[] f14503 = "0123456789abcdef".toCharArray();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final char[] f14501 = new char[64];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m8708(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static ArrayList m8709(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m8710(Runnable runnable) {
        m8714().post(runnable);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m8711(int i, Object obj) {
        return m8715(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m8712(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m8713() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Handler m8714() {
        if (f14502 == null) {
            synchronized (AbstractC3742.class) {
                try {
                    if (f14502 == null) {
                        f14502 = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f14502;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m8715(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m8716(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = AbstractC3735.f14492[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static boolean m8717(int i, int i2) {
        return (i > 0 || i == Integer.MIN_VALUE) && (i2 > 0 || i2 == Integer.MIN_VALUE);
    }
}
