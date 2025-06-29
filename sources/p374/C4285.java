package p374;

import android.os.Looper;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import p000.InterfaceC0864;
import p000.InterfaceC0875;
import p000.InterfaceC0880;
import p033.C1215;
import p076.C1653;
import p141.C2213;
import p166.AbstractC2394;
import p166.C2402;
import p166.C2443;
import p193.C2705;
import p254.InterfaceC3163;
import p260.C3222;
import p362.C4125;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p385.C4480;
import p385.InterfaceC4483;
import p385.InterfaceC4493;

/* renamed from: ᵢˎ.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4285 extends AbstractC4273 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public C2402 f16633;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int f16634;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final InterfaceC0864 f16635;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public boolean f16636;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C4125 f16639;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final InterfaceC4483 f16640;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public InterfaceC0880 f16641;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean f16642;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C2705 f16643;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f16638 = true;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public long f16637 = -9223372036854775807L;

    public C4285(C2402 c2402, InterfaceC0864 interfaceC0864, C4125 c4125, InterfaceC4483 interfaceC4483, C2705 c2705, int i) {
        this.f16633 = c2402;
        this.f16635 = interfaceC0864;
        this.f16639 = c4125;
        this.f16640 = interfaceC4483;
        this.f16643 = c2705;
        this.f16634 = i;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ʽᐧ */
    public final InterfaceC4294 mo6113(C4290 c4290, C1653 c1653, long j) {
        InterfaceC0875 interfaceC0875Mo900 = this.f16635.mo900();
        InterfaceC0880 interfaceC0880 = this.f16641;
        if (interfaceC0880 != null) {
            interfaceC0875Mo900.mo3678(interfaceC0880);
        }
        C2443 c2443 = mo6119().f9492;
        c2443.getClass();
        AbstractC4464.m10146(this.f16597);
        C3222 c3222 = new C3222((InterfaceC3163) this.f16639.f15928);
        C4480 c4480 = new C4480(this.f16594.f17251, 0, c4290);
        ᐧʻ r7 = m9731(c4290);
        long jM10206 = AbstractC4470.m10206(c2443.f9732);
        return new C4287(c2443.f9734, interfaceC0875Mo900, c3222, this.f16640, c4480, this.f16643, r7, this, c1653, this.f16634, jM10206);
    }

    @Override // p374.AbstractC4273
    /* renamed from: ʿˏ */
    public final void mo6114(InterfaceC0880 interfaceC0880) {
        this.f16641 = interfaceC0880;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C1215 c1215 = this.f16597;
        AbstractC4464.m10146(c1215);
        InterfaceC4483 interfaceC4483 = this.f16640;
        interfaceC4483.mo10233(looperMyLooper, c1215);
        interfaceC4483.mo10231();
        m9741();
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˉⁱ */
    public final synchronized void mo6115(C2402 c2402) {
        this.f16633 = c2402;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˋⁱ */
    public final void mo6116(InterfaceC4294 interfaceC4294) {
        C4287 c4287 = (C4287) interfaceC4294;
        if (c4287.f16655) {
            for (C4296 c4296 : c4287.f16677) {
                c4296.m9760();
                InterfaceC4493 interfaceC4493 = c4296.f16717;
                if (interfaceC4493 != null) {
                    interfaceC4493.mo10246(c4296.f16704);
                    c4296.f16717 = null;
                    c4296.f16723 = null;
                }
            }
        }
        c4287.f16684.m5331(c4287);
        c4287.f16660.removeCallbacksAndMessages(null);
        c4287.f16678 = null;
        c4287.f16662 = true;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˏᵢ */
    public final void mo6117() {
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m9741() {
        AbstractC2394 c4252 = new C4252(this.f16637, this.f16642, this.f16636, mo6119());
        if (this.f16638) {
            c4252 = new C2213(c4252, 1);
        }
        m9730(c4252);
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ـﹶ */
    public final synchronized C2402 mo6119() {
        return this.f16633;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m9742(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f16637;
        }
        if (!this.f16638 && this.f16637 == j && this.f16642 == z && this.f16636 == z2) {
            return;
        }
        this.f16637 = j;
        this.f16642 = z;
        this.f16636 = z2;
        this.f16638 = false;
        m9741();
    }

    @Override // p374.AbstractC4273
    /* renamed from: ﾞˊ */
    public final void mo6120() {
        this.f16640.mo10230();
    }
}
