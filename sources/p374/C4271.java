package p374;

import p166.AbstractC2394;
import p166.C2395;
import p166.C2402;
import p166.C2412;
import p166.C2434;
import p166.C2443;

/* renamed from: ᵢˎ.יˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4271 extends AbstractC4267 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ int f16581 = 1;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f16582;

    public C4271(AbstractC2394 abstractC2394) {
        super(abstractC2394);
        this.f16582 = new C2434();
    }

    public C4271(AbstractC2394 abstractC2394, C2402 c2402) {
        super(abstractC2394);
        this.f16582 = c2402;
    }

    @Override // p374.AbstractC4267, p166.AbstractC2394
    /* renamed from: ˋⁱ */
    public C2434 mo6179(int i, C2434 c2434, long j) {
        switch (this.f16581) {
            case 0:
                super.mo6179(i, c2434, j);
                C2402 c2402 = (C2402) this.f16582;
                c2434.f9711 = c2402;
                C2443 c2443 = c2402.f9492;
                c2434.getClass();
                return c2434;
            default:
                return super.mo6179(i, c2434, j);
        }
    }

    @Override // p374.AbstractC4267, p166.AbstractC2394
    /* renamed from: ٴˎ */
    public C2412 mo6180(int i, C2412 c2412, boolean z) {
        switch (this.f16581) {
            case 1:
                AbstractC2394 abstractC2394 = this.f16576;
                C2412 c2412Mo6180 = abstractC2394.mo6180(i, c2412, z);
                if (abstractC2394.mo6179(c2412Mo6180.f9576, (C2434) this.f16582, 0L).m6547()) {
                    c2412Mo6180.m6501(c2412.f9577, c2412.f9574, c2412.f9576, c2412.f9580, c2412.f9575, C2395.f9449, true);
                } else {
                    c2412Mo6180.f9578 = true;
                }
                return c2412Mo6180;
            default:
                return super.mo6180(i, c2412, z);
        }
    }
}
