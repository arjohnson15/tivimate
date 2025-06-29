package p187;

import java.util.HashMap;
import p180.InterfaceC2498;
import p409.InterfaceC4673;
import p432.AbstractC5026;

/* renamed from: ˎʽ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2609 implements InterfaceC4673 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final HashMap f10384;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC5026 f10385;

    static {
        HashMap map = new HashMap();
        f10384 = map;
        map.put("SHA256", new C2608(4));
        map.put("MD4", new C2608(5));
    }

    public C2609() {
        InterfaceC2498 interfaceC2498 = (InterfaceC2498) f10384.get("MD4");
        if (interfaceC2498 == null) {
            throw new IllegalArgumentException("No MessageDigest MD4 defined in BouncyCastle");
        }
        this.f10385 = (AbstractC5026) interfaceC2498.mo6608();
    }

    @Override // p409.InterfaceC4673
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo6783(byte[] bArr) {
        this.f10385.m11131(bArr, 0, bArr.length);
    }

    @Override // p409.InterfaceC4673
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final byte[] mo6784() {
        AbstractC5026 abstractC5026 = this.f10385;
        byte[] bArr = new byte[abstractC5026.mo11116()];
        abstractC5026.mo11120(0, bArr);
        return bArr;
    }
}
