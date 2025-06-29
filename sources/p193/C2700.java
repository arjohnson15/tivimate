package p193;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import p215.C2819;
import p283.C3380;
import p332.AbstractC3777;
import ʼˉ.ٴˎ;

/* renamed from: ˎˊ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2700 implements InterfaceC2692, InterfaceC2689 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10602;

    @Override // p193.InterfaceC2689
    /* renamed from: ʽᐧ */
    public final InterfaceC2701 mo6864(AbstractC3777 abstractC3777) throws Buffer$BufferException {
        switch (this.f10602) {
            case 0:
                int iM8854 = (int) abstractC3777.f14613.m8854(abstractC3777);
                C2693 c2693 = new C2693();
                c2693.f10601 = iM8854;
                return c2693;
            case 1:
                long jM8855 = abstractC3777.f14613.m8855(abstractC3777);
                C2704 c2704 = new C2704();
                c2704.f10604 = jM8855;
                return c2704;
            default:
                C2819 c2819 = ٴˎ.ﾞʽ(abstractC3777);
                C2819 c28192 = ٴˎ.ﾞʽ(abstractC3777);
                C2819 c28193 = ٴˎ.ﾞʽ(abstractC3777);
                C2819 c28194 = ٴˎ.ﾞʽ(abstractC3777);
                long jM8854 = abstractC3777.f14613.m8854(abstractC3777);
                abstractC3777.m8843(4);
                return new C2680(c2819, c28192, c28193, c28194, jM8854);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p193.InterfaceC2692
    /* renamed from: ˑʽ */
    public final void mo6866(C2705 c2705, C3380 c3380) {
        switch (this.f10602) {
            case 0:
                c3380.m8844(((C2693) c2705).f10601 & 4294967295L);
                break;
            case 1:
                c3380.f14613.m8856(c3380, ((C2704) c2705).f10604);
                break;
            default:
                C2680 c2680 = (C2680) c2705;
                ٴˎ.ˋˊ(c2680.f10588, c3380);
                ٴˎ.ˋˊ(c2680.f10585, c3380);
                ٴˎ.ˋˊ(c2680.f10587, c3380);
                ٴˎ.ˋˊ(c2680.f10589, c3380);
                c3380.m8844(c2680.f10586);
                c3380.m8844(0L);
                break;
        }
    }

    @Override // p193.InterfaceC2692, p193.InterfaceC2689
    /* renamed from: ـﹶ */
    public final int mo6865() {
        switch (this.f10602) {
            case 0:
                return 16;
            case 1:
                return 19;
            default:
                return 4;
        }
    }
}
