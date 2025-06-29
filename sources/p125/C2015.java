package p125;

import java.io.IOException;
import java.util.EnumSet;
import p405.C4643;
import p449.AbstractC5188;
import p449.EnumC5185;
import p449.EnumC5186;
import p449.EnumC5189;
import ʾי.ˑʽ;

/* renamed from: ˈᵎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2015 extends AbstractC5188 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f7658;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final EnumC5185 f7659;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final EnumC5185 f7660;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int f7661;

    public C2015(EnumC5185 enumC5185, EnumC5185 enumC51852) {
        this.f20005 = EnumC5189.f20012;
        this.f20000 = EnumSet.of(EnumC5186.f19990, EnumC5186.f19992);
        this.f20004 = (short) 72;
        this.f7658 = 16384;
        this.f7661 = 16384;
        this.f7659 = enumC5185;
        this.f7660 = enumC51852;
    }

    @Override // p449.AbstractC5188
    /* renamed from: ˋˊ */
    public final void mo5657(ˑʽ r4) throws IOException {
        super.mo5657(r4);
        r4.ᵢʿ(this.f7658);
        r4.ᵢʿ(this.f7661);
        r4.ˆᵔ(0);
        r4.ᐧˋ(1);
        r4.ᐧˋ(0);
        r4.ᵢʿ(0);
        r4.ᵢʿ(0);
        r4.ᐧˋ(1);
        r4.ᐧˋ(0);
        EnumC5185 enumC5185 = this.f7659;
        byte[] bArr = enumC5185.f19987;
        C4643 c4643 = (C4643) r4.ˆʿ;
        c4643.write(bArr);
        r4.ᵢʿ(enumC5185.f19988);
        r4.ᵢʿ(enumC5185.f19986);
        EnumC5185 enumC51852 = this.f7660;
        c4643.write(enumC51852.f19987);
        r4.ᵢʿ(enumC51852.f19988);
        r4.ᵢʿ(enumC51852.f19986);
    }
}
