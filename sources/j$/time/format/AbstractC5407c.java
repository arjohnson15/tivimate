package j$.time.format;

/* renamed from: j$.time.format.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC5407c {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[G.values().length];
        a = iArr;
        try {
            iArr[G.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[G.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[G.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[G.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
