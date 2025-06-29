package p078;

import android.support.v4.media.session.AbstractC0002;
import p023.C1147;
import p180.AbstractC2500;
import p283.C3380;
import p283.InterfaceC3379;
import ʿﾞ.ﹳﹳ;

/* renamed from: ʿˋ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1685 extends ﹳﹳ {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f6557;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6558;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C3380 f6559;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C1147 f6560;

    public AbstractC1685() {
        super(new C1696());
    }

    public AbstractC1685(int i, EnumC1689 enumC1689, EnumC1683 enumC1683) {
        this(i, enumC1689, enumC1683, 0L, 0L);
    }

    public AbstractC1685(int i, EnumC1689 enumC1689, EnumC1683 enumC1683, long j, long j2) {
        C1696 c1696 = new C1696();
        super(c1696);
        this.f6557 = i;
        c1696.f6604 = enumC1689;
        c1696.f6597 = enumC1683;
        c1696.f6602 = j;
        c1696.f6609 = j2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((C1696) ((InterfaceC3379) ((ﹳﹳ) this).ᐧⁱ)).f6597);
        sb.append(" with message id << ");
        return AbstractC0002.m42(sb, ((C1696) ((InterfaceC3379) ((ﹳﹳ) this).ᐧⁱ)).f6605, " >>");
    }

    /* renamed from: ᵎˆ */
    public int mo4128() {
        return 65536;
    }

    /* renamed from: ᵔˋ */
    public void mo4125(C3380 c3380) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* renamed from: ᵢˆ */
    public void mo4126(C3380 c3380) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    @Override // 
    /* renamed from: ᵢﹶ, reason: merged with bridge method [inline-methods] */
    public void mo4127(C3380 c3380) {
        C1696 c1696 = (C1696) ((InterfaceC3379) ((ﹳﹳ) this).ᐧⁱ);
        c1696.getClass();
        c1696.f6607 = c3380.f14616;
        c3380.mo6213(4, new byte[]{-2, 83, 77, 66});
        c3380.m8847(64);
        int iOrdinal = c1696.f6604.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            c3380.m8239(2);
        } else {
            c3380.m8847(c1696.f6596);
        }
        if (c1696.f6604.m5367()) {
            c3380.mo6213(2, new byte[]{0, 0});
            c3380.m8239(2);
            throw new UnsupportedOperationException("SMB 3.x not yet implemented");
        }
        c3380.m8238();
        c3380.m8847(c1696.f6597.f6555);
        c3380.m8847(c1696.f6603 + c1696.f6596);
        c3380.m8844(c1696.f6601);
        c3380.m8844(c1696.f6599);
        c3380.f14613.m8856(c3380, c1696.f6605);
        if (AbstractC2500.m6609(c1696.f6601, EnumC1686.f6561)) {
            c3380.f14613.m8856(c3380, c1696.f6606);
        } else {
            c3380.m8238();
            c3380.m8844(c1696.f6609);
        }
        c3380.f14613.m8856(c3380, c1696.f6602);
        c3380.mo6213(16, C1696.f6595);
        mo4126(c3380);
    }

    /* renamed from: ﹶʾ */
    public AbstractC1685 mo4131() {
        return this;
    }
}
