package p018;

import com.google.android.gms.internal.measurement.C0559;
import java.util.EnumSet;
import p078.AbstractC1684;
import p078.C1696;
import p078.EnumC1683;
import p078.EnumC1689;
import p180.AbstractC2497;
import p180.AbstractC2500;
import p283.C3380;
import p283.InterfaceC3379;
import ʿﾞ.ﹳﹳ;
import ـˈ.ˉᵎ;

/* renamed from: ʻⁱ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1099 extends AbstractC1684 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final EnumSet f4687;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C0559 f4688;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final String f4689;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f4690;

    public C1099(EnumC1689 enumC1689, long j, long j2, C0559 c0559, int i, EnumSet enumSet, String str, int i2) {
        super(33, enumC1689, EnumC1683.f6546, j, j2, i2);
        this.f4690 = i;
        this.f4687 = enumSet;
        this.f4688 = c0559;
        this.f4689 = str == null ? "*" : str;
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵢˆ */
    public final void mo4126(C3380 c3380) {
        c3380.m8847(this.f6557);
        c3380.mo6214((byte) ˉᵎ.ٴˎ(this.f4690));
        c3380.mo6214((byte) AbstractC2500.m6610(this.f4687));
        c3380.m8844(0L);
        this.f4688.m2497(c3380);
        c3380.m8847(96);
        String str = this.f4689;
        c3380.m8847(str.length() * 2);
        c3380.m8844(Math.min(this.f6556, ((C1696) ((InterfaceC3379) ((ﹳﹳ) this).ᐧⁱ)).f6596 * 65536));
        c3380.m8846(str, AbstractC2497.f9931);
    }
}
