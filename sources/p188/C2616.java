package p188;

import p314.C3602;

/* renamed from: ˎʾ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2616 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C2616 f10393;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final boolean f10394;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C2616 f10396;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C3602 f10397;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C2616 f10398;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10399;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C2616 f10392 = new C2616(2);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C2616 f10395 = new C2616(0);

    static {
        C2616 c2616 = new C2616(1);
        f10398 = c2616;
        f10393 = new C2616(3);
        f10396 = c2616;
        f10397 = C3602.m8503(c2616, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f10394 = true;
    }

    public /* synthetic */ C2616(int i) {
        this.f10399 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float m6790(int i, int i2, int i3, int i4) {
        switch (this.f10399) {
            case 0:
                return Math.min(1.0f, f10392.m6790(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (f10394) {
                    return Math.min(i3 / i, i4 / i2);
                }
                if (Math.max(i2 / i4, i / i3) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m6791(int i, int i2, int i3, int i4) {
        switch (this.f10399) {
            case 0:
                if (m6790(i, i2, i3, i4) != 1.0f) {
                    break;
                }
                break;
            case 2:
                if (f10394) {
                }
                break;
        }
        return 2;
    }
}
