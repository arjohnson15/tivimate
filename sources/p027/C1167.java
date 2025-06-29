package p027;

import p430.C4994;
import p430.C5013;

/* renamed from: ʼˊ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1167 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m4220(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C4994 m4221(C4994 c4994) {
        if ((c4994 != null ? c4994.f18890 : null) == null) {
            return c4994;
        }
        C5013 c5013M11084 = c4994.m11084();
        c5013M11084.f19027 = null;
        return c5013M11084.m11101();
    }
}
