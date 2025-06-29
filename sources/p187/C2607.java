package p187;

import java.util.HashMap;
import p079.C1697;
import p120.InterfaceC1864;
import p180.InterfaceC2498;
import p409.InterfaceC4675;
import p432.AbstractC5026;

/* renamed from: ˎʽ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2607 implements InterfaceC4675 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final HashMap f10381;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC1864 f10382;

    static {
        HashMap map = new HashMap();
        f10381 = map;
        map.put("HMACSHA256", new C2608(2));
        map.put("HMACMD5", new C2608(3));
    }

    public C2607(String str) {
        InterfaceC2498 interfaceC2498 = (InterfaceC2498) f10381.get(str.toUpperCase());
        if (interfaceC2498 == null) {
            throw new IllegalArgumentException("No Mac defined for ".concat(str));
        }
        this.f10382 = (InterfaceC1864) interfaceC2498.mo6608();
    }

    @Override // p409.InterfaceC4675
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo6778(byte[] bArr) {
        ((C1697) this.f10382).f6613.m11131(bArr, 0, bArr.length);
    }

    @Override // p409.InterfaceC4675
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo6779(byte[] bArr, int i, int i2) {
        ((C1697) this.f10382).f6613.m11131(bArr, i, i2);
    }

    @Override // p409.InterfaceC4675
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo6780(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        C1697 c1697 = (C1697) this.f10382;
        AbstractC5026 abstractC5026 = c1697.f6613;
        abstractC5026.mo11124();
        byte[] bArr3 = c1697.f6614;
        int i = c1697.f6612;
        if (length > i) {
            abstractC5026.m11131(bArr2, 0, length);
            abstractC5026.mo11120(0, bArr3);
            length = c1697.f6610;
        } else {
            System.arraycopy(bArr2, 0, bArr3, 0, length);
        }
        while (length < bArr3.length) {
            bArr3[length] = 0;
            length++;
        }
        byte[] bArr4 = c1697.f6615;
        System.arraycopy(bArr3, 0, bArr4, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ 54);
        }
        for (int i3 = 0; i3 < i; i3++) {
            bArr4[i3] = (byte) (bArr4[i3] ^ 92);
        }
        AbstractC5026 abstractC5026Mo11121 = abstractC5026.mo11121();
        c1697.f6611 = abstractC5026Mo11121;
        abstractC5026Mo11121.m11131(bArr4, 0, i);
        abstractC5026.m11131(bArr3, 0, bArr3.length);
        c1697.f6616 = abstractC5026.mo11121();
    }

    @Override // p409.InterfaceC4675
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final byte[] mo6781() {
        C1697 c1697 = (C1697) this.f10382;
        byte[] bArr = new byte[c1697.f6610];
        AbstractC5026 abstractC5026 = c1697.f6613;
        byte[] bArr2 = c1697.f6615;
        int i = c1697.f6612;
        abstractC5026.mo11120(i, bArr2);
        AbstractC5026 abstractC50262 = c1697.f6611;
        if (abstractC50262 != null) {
            abstractC5026.mo11117(abstractC50262);
            abstractC5026.m11131(bArr2, i, abstractC5026.mo11116());
        } else {
            abstractC5026.m11131(bArr2, 0, bArr2.length);
        }
        abstractC5026.mo11120(0, bArr);
        while (i < bArr2.length) {
            bArr2[i] = 0;
            i++;
        }
        AbstractC5026 abstractC50263 = c1697.f6616;
        if (abstractC50263 != null) {
            abstractC5026.mo11117(abstractC50263);
        } else {
            byte[] bArr3 = c1697.f6614;
            abstractC5026.m11131(bArr3, 0, bArr3.length);
        }
        return bArr;
    }

    @Override // p409.InterfaceC4675
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void mo6782(byte b) {
        ((C1697) this.f10382).f6613.m11132(b);
    }
}
