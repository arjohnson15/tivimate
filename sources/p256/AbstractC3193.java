package p256;

import p000.C0882;
import p000.InterfaceC0875;
import p166.C2431;

/* renamed from: יᴵ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3193 extends AbstractC3191 {

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final long f12405;

    public AbstractC3193(InterfaceC0875 interfaceC0875, C0882 c0882, C2431 c2431, int i, Object obj, long j, long j2, long j3) {
        super(interfaceC0875, c0882, 1, c2431, i, obj, j, j2);
        c2431.getClass();
        this.f12405 = j3;
    }

    /* renamed from: ʽᐧ */
    public abstract boolean mo7891();

    /* renamed from: ـﹶ */
    public long mo7892() {
        long j = this.f12405;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }
}
