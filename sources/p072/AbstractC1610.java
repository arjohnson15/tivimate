package p072;

import p148.AbstractC2262;
import p148.AbstractC2275;
import p217.C2828;
import p253.C3150;

/* renamed from: ʿʽ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1610 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final InterfaceC1621 f6388;

    static {
        String property;
        C2828 c2828;
        int i = AbstractC2275.f9020;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C3150 c3150 = AbstractC1586.f6345;
            C2828 c28282 = AbstractC2262.f8994;
            C2828 c28283 = c28282.f10976;
            c2828 = !(c28282 instanceof InterfaceC1621) ? RunnableC1641.f6413 : c28282;
        } else {
            c2828 = RunnableC1641.f6413;
        }
        f6388 = c2828;
    }
}
