package p137;

import android.graphics.Bitmap;

/* renamed from: ˉˈ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2109 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int[] f8333;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f8333 = iArr;
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8333[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8333[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f8333[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
