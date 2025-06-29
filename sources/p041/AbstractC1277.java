package p041;

import java.net.Proxy;

/* renamed from: ʽˉ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1277 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int[] f5256;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f5256 = iArr;
    }
}
