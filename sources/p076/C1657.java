package p076;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import p000.C0876;
import p000.C0878;
import p000.C0882;
import p000.InterfaceC0875;
import p374.C4261;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ʿˉ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1657 implements InterfaceC1656 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C0882 f6463;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final InterfaceC1668 f6464;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f6465;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C0878 f6466;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f6467;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public volatile Object f6468;

    public C1657(InterfaceC0875 interfaceC0875, Uri uri, int i, InterfaceC1668 interfaceC1668) {
        Map mapEmptyMap = Collections.emptyMap();
        AbstractC4464.m10136(uri, "The uri must be set.");
        C0882 c0882 = new C0882(uri, 1, null, mapEmptyMap, 0L, -1L, null, 1);
        this.f6466 = new C0878(interfaceC0875);
        this.f6463 = c0882;
        this.f6465 = i;
        this.f6464 = interfaceC1668;
        this.f6467 = C4261.f16556.getAndIncrement();
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳˎ */
    public final void mo5325() {
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳﹳ */
    public final void mo5326() throws IOException {
        this.f6466.f3991 = 0L;
        C0876 c0876 = new C0876(this.f6466, this.f6463);
        try {
            c0876.m3690();
            Uri uriMo3681 = this.f6466.f3993.mo3681();
            uriMo3681.getClass();
            this.f6468 = this.f6464.mo5358(uriMo3681, c0876);
        } finally {
            AbstractC4470.m10186(c0876);
        }
    }
}
