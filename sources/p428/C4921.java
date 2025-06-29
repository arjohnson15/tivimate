package p428;

import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
import p007.C0937;
import p136.C2098;
import ˉˆ.ﹳﹳ;

/* renamed from: ﹶˊ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4921 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4941 f18600;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0937 f18601;

    public C4921(C0937 c0937, ﹳﹳ r2) {
        this.f18601 = c0937;
        this.f18600 = new C4941(r2);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11036(String str) {
        C4941 c4941 = this.f18600;
        synchronized (c4941) {
            if (!Objects.equals(c4941.f18689, str)) {
                C4941.m11065(c4941.f18691, str, c4941.f18690);
                c4941.f18689 = str;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m11037(String str) {
        String strSubstring;
        C4941 c4941 = this.f18600;
        synchronized (c4941) {
            if (Objects.equals(c4941.f18689, str)) {
                strSubstring = c4941.f18690;
            } else {
                ﹳﹳ r1 = c4941.f18691;
                C2098 c2098 = C4941.f18688;
                File file = new File((File) r1.ᐧˋ, str);
                file.mkdirs();
                List list = ﹳﹳ.ﹶˆ(file.listFiles(c2098));
                strSubstring = list.isEmpty() ? null : ((File) Collections.min(list, C4941.f18687)).getName().substring(4);
            }
        }
        return strSubstring;
    }
}
