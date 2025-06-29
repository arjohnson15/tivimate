package p374;

import java.io.IOException;
import p076.C1659;
import p076.HandlerC1655;
import p312.C3589;
import p456.C5349;

/* renamed from: ᵢˎ.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4269 implements InterfaceC4254 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C4287 f16579;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f16580;

    public C4269(C4287 c4287, int i) {
        this.f16579 = c4287;
        this.f16580 = i;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ʿʼ */
    public final int mo4054(C5349 c5349, C3589 c3589, int i) {
        C4287 c4287 = this.f16579;
        if (c4287.m9748()) {
            return -3;
        }
        int i2 = this.f16580;
        c4287.m9751(i2);
        int iM9773 = c4287.f16677[i2].m9773(c5349, c3589, i, c4287.f16661);
        if (iM9773 == -3) {
            c4287.m9744(i2);
        }
        return iM9773;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ˏʾ */
    public final boolean mo4058() {
        C4287 c4287 = this.f16579;
        return !c4287.m9748() && c4287.f16677[this.f16580].m9782(c4287.f16661);
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ـﹶ */
    public final void mo4062() throws IOException {
        C4287 c4287 = this.f16579;
        c4287.f16677[this.f16580].m9770();
        int iM6869 = c4287.f16670.m6869(c4287.f16665);
        C1659 c1659 = c4287.f16684;
        IOException iOException = c1659.f6473;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC1655 handlerC1655 = c1659.f6472;
        if (handlerC1655 != null) {
            if (iM6869 == Integer.MIN_VALUE) {
                iM6869 = handlerC1655.f6459;
            }
            IOException iOException2 = handlerC1655.f6454;
            if (iOException2 != null && handlerC1655.f6461 > iM6869) {
                throw iOException2;
            }
        }
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ᵎـ */
    public final int mo4066(long j) {
        C4287 c4287 = this.f16579;
        if (c4287.m9748()) {
            return 0;
        }
        int i = this.f16580;
        c4287.m9751(i);
        C4296 c4296 = c4287.f16677[i];
        int iM9777 = c4296.m9777(c4287.f16661, j);
        c4296.m9779(iM9777);
        if (iM9777 != 0) {
            return iM9777;
        }
        c4287.m9744(i);
        return iM9777;
    }
}
