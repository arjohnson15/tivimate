package p018;

import com.google.android.gms.internal.measurement.C0559;
import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import p078.AbstractC1685;
import p078.EnumC1683;
import p078.EnumC1689;
import p180.AbstractC2497;
import p283.C3380;
import p332.C3779;
import p408.C4672;
import ʼˉ.ٴˎ;

/* renamed from: ʻⁱ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1106 extends AbstractC1685 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ int f4701;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public Object f4702;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1106(int i, EnumC1689 enumC1689, EnumC1683 enumC1683, long j, long j2, int i2) {
        super(i, enumC1689, enumC1683, j, j2);
        this.f4701 = i2;
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵔˋ */
    public void mo4125(C3380 c3380) throws Buffer$BufferException {
        switch (this.f4701) {
            case 0:
                c3380.m8841();
                c3380.m8841();
                c3380.m8843(4);
                ٴˎ.ﾞʽ(c3380);
                ٴˎ.ﾞʽ(c3380);
                ٴˎ.ﾞʽ(c3380);
                ٴˎ.ﾞʽ(c3380);
                c3380.f14613.m8858(c3380);
                c3380.f14613.m8858(c3380);
                c3380.m8842(4);
                break;
            default:
                super.mo4125(c3380);
                break;
        }
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵢˆ */
    public final void mo4126(C3380 c3380) {
        switch (this.f4701) {
            case 0:
                c3380.m8847(this.f6557);
                c3380.m8847(1);
                c3380.m8238();
                ((C0559) this.f4702).m2497(c3380);
                break;
            default:
                c3380.m8847(this.f6557);
                c3380.m8240();
                c3380.m8847(72);
                String strM10573 = ((C4672) this.f4702).m10573();
                C3779 c3779 = c3380.f14613;
                if (strM10573 == null) {
                    c3779.m8857(c3380, 0);
                } else {
                    c3779.m8857(c3380, strM10573.length() * 2);
                }
                c3380.m8846(strM10573, AbstractC2497.f9931);
                break;
        }
    }
}
