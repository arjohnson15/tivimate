package p018;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import java.util.ArrayList;
import p078.AbstractC1685;
import p078.C1696;
import p078.EnumC1683;
import p078.EnumC1689;
import p180.AbstractC2497;
import p180.AbstractC2500;
import p283.C3380;
import p283.InterfaceC3379;
import p332.C3779;
import p342.EnumC3909;
import p456.C5349;
import ʿﾞ.ﹳﹳ;

/* renamed from: ʻⁱ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1095 extends AbstractC1685 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ int f4672;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1095(int i, EnumC1689 enumC1689, EnumC1683 enumC1683, long j, long j2) {
        super(i, enumC1689, enumC1683, j, j2);
        this.f4672 = 4;
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public final void mo4125(C3380 c3380) throws Buffer$BufferException {
        int iM8854;
        switch (this.f4672) {
            case 0:
                c3380.m8843(2);
                C3779 c3779 = c3380.f14613;
                int iM8852 = c3779.m8852(c3380);
                int iM8848 = c3380.m8848();
                if (iM8852 > 0 && iM8848 > 0) {
                    ArrayList arrayList = new ArrayList();
                    int i = ((C1696) ((InterfaceC3379) ((ﹳﹳ) this).ᐧⁱ)).f6607 + iM8852;
                    c3380.f14614 = i;
                    do {
                        iM8854 = (int) c3779.m8854(c3380);
                        EnumC3909 enumC3909 = (EnumC3909) AbstractC2500.m6613(c3779.m8854(c3380), EnumC3909.class, null);
                        String strM8840 = c3380.m8840(((int) c3779.m8854(c3380)) / 2, AbstractC2497.f9929);
                        C5349 c5349 = new C5349(2);
                        c5349.f20756 = enumC3909;
                        c5349.f20757 = strM8840;
                        arrayList.add(c5349);
                        if (iM8854 != 0) {
                            i += iM8854;
                            c3380.f14614 = i;
                        }
                    } while (iM8854 != 0);
                }
                c3380.f14614 = ((C1696) ((InterfaceC3379) ((ﹳﹳ) this).ᐧⁱ)).f6607 + iM8852 + iM8848;
                break;
            case 1:
                c3380.m8843(4);
                break;
            case 2:
                c3380.m8841();
                c3380.m8843(2);
                break;
            case 3:
                c3380.m8843(2);
                break;
            default:
                c3380.m8841();
                c3380.m8843(2);
                break;
        }
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public void mo4126(C3380 c3380) {
        switch (this.f4672) {
            case 1:
                c3380.m8847(this.f6557);
                c3380.m8847(0);
                return;
            case 2:
                c3380.m8847(this.f6557);
                c3380.m8240();
                c3380.m8238();
                throw null;
            case 3:
            default:
                super.mo4126(c3380);
                return;
            case 4:
                c3380.m8847(this.f6557);
                c3380.m8239(2);
                return;
        }
    }
}
