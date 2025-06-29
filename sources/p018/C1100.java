package p018;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import java.util.EnumSet;
import p078.AbstractC1685;
import p078.EnumC1690;
import p180.AbstractC2500;
import p215.EnumC2820;
import p283.C3380;
import p332.C3779;

/* renamed from: ʻⁱ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1100 extends AbstractC1685 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public byte f4691;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public EnumSet f4692;

    @Override // p078.AbstractC1685
    /* renamed from: ᵔˋ */
    public final void mo4125(C3380 c3380) throws Buffer$BufferException {
        c3380.m8843(2);
        this.f4691 = c3380.m8849();
        c3380.m8849();
        c3380.f14613.m8854(c3380);
        C3779 c3779 = c3380.f14613;
        this.f4692 = AbstractC2500.m6614(c3779.m8854(c3380), EnumC1690.class);
        AbstractC2500.m6614(c3779.m8854(c3380), EnumC2820.class);
    }
}
