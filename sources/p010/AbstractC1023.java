package p010;

import java.util.ArrayList;
import p013.AbstractC1041;
import p148.C2274;
import p155.EnumC2332;
import p184.InterfaceC2552;
import p288.C3397;
import p330.C3749;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import p423.InterfaceC4887;
import ˏʼ.ʽᐧ;
import ـˈ.ˉᵎ;

/* renamed from: ʻˎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1023 implements InterfaceC1008 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f4402;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f4403;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC3747 f4404;

    public AbstractC1023(InterfaceC3747 interfaceC3747, int i, int i2) {
        this.f4404 = interfaceC3747;
        this.f4402 = i;
        this.f4403 = i2;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        C3749 c3749 = C3749.f14510;
        InterfaceC3747 interfaceC3747 = this.f4404;
        if (interfaceC3747 != c3749) {
            arrayList.add("context=" + interfaceC3747);
        }
        int i = this.f4402;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.f4403;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return ˉᵎ.ˑי(sb, AbstractC1041.m4033(arrayList, ", ", null, null, null, 62), ']');
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // p010.InterfaceC1008
    /* renamed from: ʽᐧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p184.InterfaceC2551 mo3960(p330.InterfaceC3747 r5, int r6, int r7) {
        /*
            r4 = this;
            ᴵⁱ.ˉי r0 = r4.f4404
            ᴵⁱ.ˉי r5 = r5.mo3967(r0)
            r1 = 1
            int r2 = r4.f4403
            int r3 = r4.f4402
            if (r7 == r1) goto Le
            goto L25
        Le:
            r7 = -3
            if (r3 != r7) goto L12
            goto L24
        L12:
            if (r6 != r7) goto L16
        L14:
            r6 = r3
            goto L24
        L16:
            r7 = -2
            if (r3 != r7) goto L1a
            goto L24
        L1a:
            if (r6 != r7) goto L1d
            goto L14
        L1d:
            int r6 = r6 + r3
            if (r6 < 0) goto L21
            goto L24
        L21:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L24:
            r7 = r2
        L25:
            boolean r0 = p070.AbstractC1549.m5138(r5, r0)
            if (r0 == 0) goto L30
            if (r6 != r3) goto L30
            if (r7 != r2) goto L30
            return r4
        L30:
            ʻˎ.ﹳﹳ r5 = r4.mo3973(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p010.AbstractC1023.mo3960(ᴵⁱ.ˉי, int, int):ˎ.ٴˎ");
    }

    /* renamed from: ˑʽ */
    public abstract Object mo3971(InterfaceC4887 interfaceC4887, InterfaceC3746 interfaceC3746);

    @Override // p184.InterfaceC2551
    /* renamed from: ـﹶ */
    public Object mo3972(InterfaceC2552 interfaceC2552, InterfaceC3746 interfaceC3746) {
        C1002 c1002 = new C1002(interfaceC2552, this, null);
        C2274 c2274 = new C2274(interfaceC3746, interfaceC3746.mo3963());
        Object obj = ʽᐧ.ᐧˋ(c2274, c2274, c1002);
        return obj == EnumC2332.f9250 ? obj : C3397.f13249;
    }

    /* renamed from: ﹳﹳ */
    public abstract AbstractC1023 mo3973(InterfaceC3747 interfaceC3747, int i, int i2);
}
