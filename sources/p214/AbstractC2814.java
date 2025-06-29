package p214;

import java.rmi.UnmarshalException;
import p352.EnumC4008;
import p352.InterfaceC4007;
import p456.C5349;
import ˆʽ.ᵎˏ;

/* renamed from: ˏˉ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2814 implements InterfaceC4007 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C2818 f10954;

    @Override // p352.InterfaceC4007
    /* renamed from: ʽᐧ */
    public final void mo7065(C5349 c5349) {
    }

    @Override // p352.InterfaceC4007
    /* renamed from: ˑʽ */
    public final void mo7066(C5349 c5349) {
        C2818 c2818 = this.f10954;
        if (c2818 != null) {
            c5349.m12104(c2818);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: java.rmi.UnmarshalException */
    @Override // p352.InterfaceC4007
    /* renamed from: ـﹶ */
    public final void mo7067(C5349 c5349) throws UnmarshalException {
        c5349.m12092(EnumC4008.FOUR);
        int iM12101 = c5349.m12101();
        if (iM12101 != ᵎˏ.ˑʽ(2)) {
            throw new UnmarshalException(String.format("Expected info level %d, got: %d", Integer.valueOf(ᵎˏ.ˑʽ(2)), Integer.valueOf(iM12101)));
        }
        int iM121012 = c5349.m12101();
        if (iM121012 != iM12101) {
            throw new UnmarshalException(String.format("Expected info level %d to match enum level, got: %d", Integer.valueOf(iM12101), Integer.valueOf(iM121012)));
        }
        if (c5349.m12094() != 0) {
            this.f10954 = mo7094();
        } else {
            this.f10954 = null;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract C2818 mo7094();
}
