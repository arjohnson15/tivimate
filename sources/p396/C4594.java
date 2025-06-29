package p396;

import java.io.IOException;
import p366.C4149;
import p366.InterfaceC4161;
import p430.AbstractC5001;
import p430.C5002;

/* renamed from: ⁱᴵ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4594 extends AbstractC5001 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4149 f17590;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public IOException f17591;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC5001 f17592;

    public C4594(AbstractC5001 abstractC5001) {
        this.f17592 = abstractC5001;
        this.f17590 = new C4149(new C4595(this, abstractC5001.mo5667()));
    }

    @Override // p430.AbstractC5001, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17592.close();
    }

    @Override // p430.AbstractC5001
    /* renamed from: ʽᐧ */
    public final C5002 mo5666() {
        return this.f17592.mo5666();
    }

    @Override // p430.AbstractC5001
    /* renamed from: ˑʽ */
    public final InterfaceC4161 mo5667() {
        return this.f17590;
    }

    @Override // p430.AbstractC5001
    /* renamed from: ـﹶ */
    public final long mo5668() {
        return this.f17592.mo5668();
    }
}
