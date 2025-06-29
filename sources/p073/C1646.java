package p073;

import androidx.lifecycle.AbstractC0207;
import androidx.lifecycle.AbstractC0224;
import androidx.lifecycle.C0259;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001.C0884;
import p013.C1053;
import p070.AbstractC1549;
import p072.AbstractC1586;
import p072.AbstractC1642;
import p132.C2077;
import p253.C3150;
import p253.ExecutorC3146;
import p317.AbstractC3616;
import p330.InterfaceC3746;

/* renamed from: ʿʾ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1646 extends AbstractC0207 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f6428;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final List f6430;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f6432;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C0259 f6429 = new C0259();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object f6431 = C1053.f4449;

    public C1646(String str, boolean z, List list, boolean z2) {
        this.f6428 = z;
        this.f6430 = list;
        this.f6432 = z2;
        C0884 c0884M1023 = AbstractC0224.m1023(this);
        C3150 c3150 = AbstractC1586.f6345;
        AbstractC1642.m5294(c0884M1023, ExecutorC3146.f12150, 0, new ˏʾ(this, str, (InterfaceC3746) null), 2);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static String m5311() {
        String strM5883 = C2077.f7939.m5883();
        return AbstractC3616.m8531(AbstractC3616.m8538(strM5883, "//", strM5883), "/");
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m5312(String str) {
        Iterable iterable = (Iterable) this.f6431;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (AbstractC1549.m5138(((ﹶˆ) it.next()).ʽᐧ, str)) {
                return true;
            }
        }
        return false;
    }
}
