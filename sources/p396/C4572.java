package p396;

import p366.InterfaceC4161;
import p430.AbstractC5001;
import p430.C5002;

/* renamed from: ⁱᴵ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4572 extends AbstractC5001 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f17509;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C5002 f17510;

    public C4572(C5002 c5002, long j) {
        this.f17510 = c5002;
        this.f17509 = j;
    }

    @Override // p430.AbstractC5001
    /* renamed from: ʽᐧ */
    public final C5002 mo5666() {
        return this.f17510;
    }

    @Override // p430.AbstractC5001
    /* renamed from: ˑʽ */
    public final InterfaceC4161 mo5667() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // p430.AbstractC5001
    /* renamed from: ـﹶ */
    public final long mo5668() {
        return this.f17509;
    }
}
