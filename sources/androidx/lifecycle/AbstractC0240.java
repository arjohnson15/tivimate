package androidx.lifecycle;

/* renamed from: androidx.lifecycle.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0240 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int[] f1280;

    static {
        int[] iArr = new int[EnumC0247.values().length];
        try {
            iArr[EnumC0247.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0247.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0247.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0247.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC0247.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC0247.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EnumC0247.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f1280 = iArr;
    }
}
