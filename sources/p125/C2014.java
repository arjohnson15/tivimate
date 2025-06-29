package p125;

import java.io.IOException;
import p405.C4643;
import p449.AbstractC5188;
import p449.EnumC5186;
import ʾי.ˑʽ;

/* renamed from: ˈᵎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2014 extends AbstractC5188 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public short f7656;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public byte[] f7657;

    @Override // p449.AbstractC5188
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void mo5657(ˑʽ r3) throws IOException {
        if (this.f7657 == null) {
            throw new IllegalStateException("Invalid stub: " + this.f7657);
        }
        this.f20004 = (short) ((this.f20000.contains(EnumC5186.f19993) ? 40 : 24) + this.f7657.length);
        super.mo5657(r3);
        byte[] bArr = this.f7657;
        r3.ˆᵔ(bArr.length);
        r3.ᵢʿ(0);
        r3.ᵢʿ(this.f7656);
        ((C4643) r3.ˆʿ).write(bArr);
    }
}
