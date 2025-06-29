package p374;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;
import p076.C1653;
import p166.AbstractC2394;
import p166.C2434;
import p383.AbstractC4464;

/* renamed from: ᵢˎ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4244 extends AbstractC4250 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public long f16484;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final long f16485;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public C4291 f16486;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final ArrayList f16487;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final boolean f16488;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public long f16489;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public ClippingMediaSource$IllegalClippingException f16490;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final C2434 f16491;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4244(InterfaceC4277 interfaceC4277, long j, boolean z) {
        super(interfaceC4277);
        interfaceC4277.getClass();
        this.f16485 = j;
        this.f16488 = z;
        this.f16487 = new ArrayList();
        this.f16491 = new C2434();
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ʽᐧ */
    public final InterfaceC4294 mo6113(C4290 c4290, C1653 c1653, long j) {
        C4266 c4266 = new C4266(this.f16503.mo6113(c4290, c1653, j), this.f16488, this.f16484, this.f16489);
        this.f16487.add(c4266);
        return c4266;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˋⁱ */
    public final void mo6116(InterfaceC4294 interfaceC4294) {
        ArrayList arrayList = this.f16487;
        AbstractC4464.m10132(arrayList.remove(interfaceC4294));
        this.f16503.mo6116(((C4266) interfaceC4294).f16573);
        if (arrayList.isEmpty()) {
            C4291 c4291 = this.f16486;
            c4291.getClass();
            m9707(c4291.f16576);
        }
    }

    @Override // p374.AbstractC4265, p374.InterfaceC4277
    /* renamed from: ˏᵢ */
    public final void mo6117() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f16490;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.mo6117();
    }

    @Override // p374.AbstractC4250
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void mo9706(AbstractC2394 abstractC2394) {
        if (this.f16490 != null) {
            return;
        }
        m9707(abstractC2394);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m9707(AbstractC2394 abstractC2394) {
        long j;
        C2434 c2434 = this.f16491;
        abstractC2394.m6480(0, c2434);
        long j2 = c2434.f9712;
        C4291 c4291 = this.f16486;
        ArrayList arrayList = this.f16487;
        long j3 = this.f16485;
        if (c4291 == null || arrayList.isEmpty()) {
            this.f16484 = j2;
            this.f16489 = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C4266 c4266 = (C4266) arrayList.get(i);
                long j4 = this.f16484;
                long j5 = this.f16489;
                c4266.f16570 = j4;
                c4266.f16574 = j5;
            }
            j = 0;
        } else {
            long j6 = this.f16484 - j2;
            j3 = j3 != Long.MIN_VALUE ? this.f16489 - j2 : Long.MIN_VALUE;
            j = j6;
        }
        try {
            C4291 c42912 = new C4291(abstractC2394, j, j3);
            this.f16486 = c42912;
            m9730(c42912);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.f16490 = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C4266) arrayList.get(i2)).f16575 = this.f16490;
            }
        }
    }

    @Override // p374.AbstractC4265, p374.AbstractC4273
    /* renamed from: ﾞˊ */
    public final void mo6120() {
        super.mo6120();
        this.f16490 = null;
        this.f16486 = null;
    }
}
