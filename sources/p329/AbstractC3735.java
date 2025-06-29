package p329;

import android.graphics.Bitmap;

/* renamed from: ᴵᵢ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3735 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14492;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f14492 = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14492[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14492[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f14492[Bitmap.Config.RGBA_F16.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f14492[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
