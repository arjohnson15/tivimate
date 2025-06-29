package p126;

import p070.AbstractC1549;
import p158.AbstractC2339;
import p317.AbstractC3625;
import p366.C4155;
import p430.C4994;

/* renamed from: ˈᵔ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2018 {
    static {
        new C4155("\"\\".getBytes(AbstractC3625.f13869)).f16069 = "\"\\";
        new C4155("\t ,=".getBytes(AbstractC3625.f13869)).f16069 = "\t ,=";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m5659(p430.InterfaceC5003 r36, p430.C5004 r37, p430.C5014 r38) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p126.AbstractC2018.m5659(ﹶˏ.ˏʾ, ﹶˏ.ˏᴵ, ﹶˏ.ᴵʿ):void");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final boolean m5660(C4994 c4994) {
        if (AbstractC1549.m5138(c4994.f18887.f19049, "HEAD")) {
            return false;
        }
        int i = c4994.f18886;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && AbstractC2339.m6448(c4994) == -1) {
            String strM11104 = c4994.f18889.m11104("Transfer-Encoding");
            if (strM11104 == null) {
                strM11104 = null;
            }
            if (!"chunked".equalsIgnoreCase(strM11104)) {
                return false;
            }
        }
        return true;
    }
}
