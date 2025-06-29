package p249;

import p011.C1029;
import p166.C2431;
import p246.C3116;
import p275.C3349;
import p380.C4437;
import ˈⁱ.ˉⁱ;
import ᵎﹳ.ᐧʻ;

/* renamed from: יˊ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3124 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C3124 f12077 = new C3124();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m7672(C2431 c2431) {
        String str = c2431.f9667;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ˉⁱ m7673(C2431 c2431) {
        String str = c2431.f9667;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C3116(1);
                case "application/x-icy":
                    return new C1029();
                case "application/id3":
                    return new C4437(null);
                case "application/x-emsg":
                    return new C3116(0);
                case "application/x-scte35":
                    return new C3349();
            }
        }
        throw new IllegalArgumentException(ᐧʻ.ﾞˊ("Attempted to create decoder for unsupported MIME type: ", str));
    }
}
