package p149;

import androidx.recyclerview.widget.RecyclerView;
import p061.AbstractC1382;

/* renamed from: ˊʾ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2307 extends AbstractC1382 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final RecyclerView f9106;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f9107;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2311 f9108;

    public C2307(C2311 c2311, RecyclerView recyclerView, String str) {
        this.f9108 = c2311;
        this.f9106 = recyclerView;
        this.f9107 = str;
    }

    @Override // p061.AbstractC1382
    /* renamed from: ʽᐧ */
    public final void mo4706(int i, int i2, Object obj) {
        m6351();
    }

    @Override // p061.AbstractC1382
    /* renamed from: ʿʼ */
    public final void mo4707(int i, int i2) {
        m6351();
    }

    @Override // p061.AbstractC1382
    /* renamed from: ˑʽ */
    public final void mo4708(int i, int i2) {
        m6351();
    }

    @Override // p061.AbstractC1382
    /* renamed from: ـﹶ */
    public final void mo4709() {
        m6351();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m6351() {
        C2311 c2311 = this.f9108;
        c2311.f5598.unregisterObserver(this);
        int iM6358 = c2311.m6358(this.f9107);
        if (iM6358 != -1) {
            this.f9106.mo956(iM6358);
        }
    }

    @Override // p061.AbstractC1382
    /* renamed from: ﹳﹳ */
    public final void mo4712(int i, int i2) {
        m6351();
    }
}
