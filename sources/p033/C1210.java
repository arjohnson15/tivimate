package p033;

import java.util.HashMap;
import p374.C4290;
import p383.AbstractC4464;
import p383.C4457;
import p383.InterfaceC4461;
import p383.InterfaceC4462;
import p397.C4598;
import p397.C4604;
import ٴᐧ.ᐧⁱ;

/* renamed from: ʼᵎ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1210 implements InterfaceC4461, InterfaceC4462 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f4956;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4957;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ long f4958;

    public /* synthetic */ C1210(C1218 c1218, int i, long j, long j2) {
        this.f4957 = c1218;
        this.f4956 = i;
        this.f4958 = j;
    }

    public /* synthetic */ C1210(C4604 c4604, long j, int i) {
        this.f4957 = c4604;
        this.f4958 = j;
        this.f4956 = i;
    }

    @Override // p383.InterfaceC4461
    /* renamed from: ʽᐧ */
    public void mo4092(Object obj) {
        C1213 c1213 = (C1213) obj;
        c1213.getClass();
        C1218 c1218 = (C1218) this.f4957;
        C4290 c4290 = c1218.f5008;
        if (c4290 != null) {
            String strM4379 = c1213.f4961.m4379(c1218.f5000, c4290);
            HashMap map = c1213.f4972;
            Long l = (Long) map.get(strM4379);
            HashMap map2 = c1213.f4978;
            Long l2 = (Long) map2.get(strM4379);
            map.put(strM4379, Long.valueOf((l == null ? 0L : l.longValue()) + this.f4958));
            map2.put(strM4379, Long.valueOf((l2 != null ? l2.longValue() : 0L) + this.f4956));
        }
    }

    @Override // p383.InterfaceC4462
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void mo4264(Object obj) {
        C4598 c4598 = (C4598) obj;
        C4604 c4604 = (C4604) this.f4957;
        AbstractC4464.m10146(c4604.f17610);
        byte[] bArr = ᐧⁱ.ˑי(c4598.f17600, c4598.f17599);
        C4457 c4457 = c4604.f17611;
        c4457.getClass();
        c4457.m10081(bArr.length, bArr);
        c4604.f17612.mo7841(bArr.length, c4457);
        long j = this.f4958;
        long j2 = c4598.f17598;
        if (j2 == -9223372036854775807L) {
            AbstractC4464.m10132(c4604.f17610.f9669 == Long.MAX_VALUE);
        } else {
            long j3 = c4604.f17610.f9669;
            j = j3 == Long.MAX_VALUE ? j + j2 : j2 + j3;
        }
        c4604.f17612.mo7842(j, this.f4956, bArr.length, 0, null);
    }
}
