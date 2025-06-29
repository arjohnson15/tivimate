package p141;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import p000.InterfaceC0880;
import p076.C1653;
import p166.AbstractC2394;
import p166.AbstractC2426;
import p166.C2402;
import p166.C2443;
import p374.AbstractC4273;
import p374.C4252;
import p374.C4290;
import p374.InterfaceC4294;
import p383.AbstractC4470;
import ᵔʼ.ˑʽ;

/* renamed from: ˉˑ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2188 extends AbstractC4273 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public long f8598;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final ˑʽ f8599;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public C2402 f8600;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f8601;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f8602;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final String f8603 = "AndroidXMedia3/1.4.0";

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final Uri f8604;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean f8605;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final SocketFactory f8606;

    static {
        AbstractC2426.m6526("media3.exoplayer.rtsp");
    }

    public C2188(C2402 c2402, ˑʽ r2, SocketFactory socketFactory) {
        this.f8600 = c2402;
        this.f8599 = r2;
        C2443 c2443 = c2402.f9492;
        c2443.getClass();
        this.f8604 = c2443.f9734;
        this.f8606 = socketFactory;
        this.f8598 = -9223372036854775807L;
        this.f8605 = true;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC4294 mo6113(C4290 c4290, C1653 c1653, long j) {
        ʾי.ˑʽ r4 = new ʾי.ˑʽ(27, this);
        return new C2210(c1653, this.f8599, this.f8604, r4, this.f8603, this.f8606);
    }

    @Override // p374.AbstractC4273
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void mo6114(InterfaceC0880 interfaceC0880) {
        m6118();
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final synchronized void mo6115(C2402 c2402) {
        this.f8600 = c2402;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void mo6116(InterfaceC4294 interfaceC4294) throws IOException {
        C2210 c2210 = (C2210) interfaceC4294;
        int i = 0;
        while (true) {
            ArrayList arrayList = c2210.f8737;
            if (i >= arrayList.size()) {
                AbstractC4470.m10186(c2210.f8745);
                c2210.f8734 = true;
                return;
            }
            C2197 c2197 = (C2197) arrayList.get(i);
            if (!c2197.f8644) {
                c2197.f8643.m5331(null);
                c2197.f8645.m9757();
                c2197.f8644 = true;
            }
            i++;
        }
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo6117() {
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m6118() {
        AbstractC2394 c4252 = new C4252(this.f8598, this.f8602, this.f8601, mo6119());
        if (this.f8605) {
            c4252 = new C2213(c4252, 0);
        }
        m9730(c4252);
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized C2402 mo6119() {
        return this.f8600;
    }

    @Override // p374.AbstractC4273
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void mo6120() {
    }
}
