package p033;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p015.C1067;
import p016.C1072;
import p031.C1195;
import p112.C1811;
import p166.AbstractC2394;
import p166.C2396;
import p166.C2397;
import p166.C2398;
import p166.C2401;
import p166.C2402;
import p166.C2409;
import p166.C2410;
import p166.C2412;
import p166.C2421;
import p166.C2427;
import p166.C2434;
import p166.C2437;
import p166.C2441;
import p166.InterfaceC2419;
import p166.InterfaceC2446;
import p175.C2484;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3930;
import p345.C3932;
import p374.C4261;
import p374.C4290;
import p374.InterfaceC4286;
import p375.C4305;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4460;
import p383.C4469;
import p383.InterfaceC4461;
import p385.InterfaceC4485;
import p438.C5118;
import ᴵˎ.ˎˋ;

/* renamed from: ʼᵎ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1220 implements InterfaceC2446, InterfaceC4286, InterfaceC4485 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2412 f5011;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final SparseArray f5012;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C4469 f5013;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2434 f5014;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f5015;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C4305 f5016;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4460 f5017;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public ˎˋ f5018;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public InterfaceC2419 f5019;

    public C1220(C4460 c4460) {
        c4460.getClass();
        this.f5017 = c4460;
        int i = AbstractC4470.f17202;
        Looper looperMyLooper = Looper.myLooper();
        this.f5018 = new ˎˋ(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, c4460, new C1072(25));
        C2412 c2412 = new C2412();
        this.f5011 = c2412;
        this.f5014 = new C2434();
        C4305 c4305 = new C4305();
        c4305.f16748 = c2412;
        C3928 c3928 = AbstractC3980.f15360;
        c4305.f16745 = C3932.f15274;
        c4305.f16747 = C3930.f15266;
        this.f5016 = c4305;
        this.f5012 = new SparseArray();
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m4338(C1218 c1218, int i, InterfaceC4461 interfaceC4461) {
        this.f5012.put(i, c1218);
        this.f5018.ᐧʻ(i, interfaceC4461);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1218 m4339() {
        return m4366((C4290) this.f5016.f16750);
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final void mo4340(C2437 c2437) {
        C1218 c1218M4364 = m4364();
        m4338(c1218M4364, 25, new C1222(c1218M4364, c2437));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo4341(C2427 c2427) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void mo4342(int i, boolean z) {
        m4338(m4339(), 5, new C1072(23));
    }

    @Override // p374.InterfaceC4286
    /* renamed from: ˆʿ */
    public final void mo2481(int i, C4290 c4290, C2484 c2484) {
        m4338(m4348(i, c4290), 1005, new C1209(19));
    }

    @Override // p374.InterfaceC4286
    /* renamed from: ˆᵔ */
    public final void mo2482(int i, C4290 c4290, C4261 c4261, C2484 c2484) {
        m4338(m4348(i, c4290), 1002, new C1209(14));
    }

    @Override // p385.InterfaceC4485
    /* renamed from: ˈٴ */
    public final void mo2483(int i, C4290 c4290, Exception exc) {
        m4338(m4348(i, c4290), 1024, new C1209(17));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo4343(int i) {
        m4338(m4339(), 8, new C1209(3));
    }

    @Override // p374.InterfaceC4286
    /* renamed from: ˉⁱ */
    public final void mo2485(int i, C4290 c4290, C4261 c4261, C2484 c2484) {
        m4338(m4348(i, c4290), 1001, new C1209(18));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void mo4344(ExoPlaybackException exoPlaybackException) {
        C4290 c4290;
        C1218 c1218M4339 = (!(exoPlaybackException instanceof ExoPlaybackException) || (c4290 = exoPlaybackException.f1403) == null) ? m4339() : m4366(c4290);
        m4338(c1218M4339, 10, new C1067(c1218M4339, exoPlaybackException, 1));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void mo4345(float f) {
        m4338(m4364(), 22, new C1072(10));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void mo4346(boolean z) {
        m4338(m4339(), 3, new C1209(27));
    }

    @Override // p374.InterfaceC4286
    /* renamed from: ˎˑ */
    public final void mo2488(int i, C4290 c4290, C2484 c2484) {
        C1218 c1218M4348 = m4348(i, c4290);
        m4338(c1218M4348, 1004, new C1195(c1218M4348, 2, c2484));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void mo4347(List list) {
        m4338(m4339(), 27, new C1072(24));
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final C1218 m4348(int i, C4290 c4290) {
        this.f5019.getClass();
        if (c4290 != null) {
            return ((AbstractC2394) ((C3930) this.f5016.f16747).get(c4290)) != null ? m4366(c4290) : m4354(AbstractC2394.f9448, i, c4290);
        }
        AbstractC2394 abstractC2394M11369 = ((C5118) this.f5019).m11369();
        if (i >= abstractC2394M11369.mo6474()) {
            abstractC2394M11369 = AbstractC2394.f9448;
        }
        return m4354(abstractC2394M11369, i, null);
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo4349(int i, C2396 c2396, C2396 c23962) {
        if (i == 1) {
            this.f5015 = false;
        }
        InterfaceC2419 interfaceC2419 = this.f5019;
        interfaceC2419.getClass();
        C4305 c4305 = this.f5016;
        c4305.f16750 = C4305.m9787(interfaceC2419, (AbstractC3980) c4305.f16745, (C4290) c4305.f16746, (C2412) c4305.f16748);
        C1218 c1218M4339 = m4339();
        m4338(c1218M4339, 11, new C1217(c1218M4339, i, c2396, c23962));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void mo4350() {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo4351(C2409 c2409) {
        m4338(m4339(), 19, new C1209(10));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo4352(int i) {
        InterfaceC2419 interfaceC2419 = this.f5019;
        interfaceC2419.getClass();
        C4305 c4305 = this.f5016;
        c4305.f16750 = C4305.m9787(interfaceC2419, (AbstractC3980) c4305.f16745, (C4290) c4305.f16746, (C2412) c4305.f16748);
        c4305.m9796(((C5118) interfaceC2419).m11369());
        m4338(m4339(), 0, new C1219(0));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˑי, reason: contains not printable characters */
    public final void mo4353(boolean z) {
        m4338(m4364(), 23, new C1209(21));
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C1218 m4354(AbstractC2394 abstractC2394, int i, C4290 c4290) {
        C4290 c42902 = abstractC2394.m6477() ? null : c4290;
        this.f5017.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = abstractC2394.equals(((C5118) this.f5019).m11369()) && i == ((C5118) this.f5019).m11386();
        long jM10171 = 0;
        if (c42902 == null || !c42902.m9753()) {
            if (z) {
                C5118 c5118 = (C5118) this.f5019;
                c5118.m11358();
                jM10171 = c5118.m11387(c5118.f19520);
            } else if (!abstractC2394.m6477()) {
                jM10171 = AbstractC4470.m10171(abstractC2394.mo6179(i, this.f5014, 0L).f9706);
            }
        } else if (z && ((C5118) this.f5019).m11382() == c42902.f16690 && ((C5118) this.f5019).m11383() == c42902.f16692) {
            jM10171 = ((C5118) this.f5019).m11360();
        }
        C4290 c42903 = (C4290) this.f5016.f16750;
        AbstractC2394 abstractC2394M11369 = ((C5118) this.f5019).m11369();
        int iM11386 = ((C5118) this.f5019).m11386();
        long jM11360 = ((C5118) this.f5019).m11360();
        C5118 c51182 = (C5118) this.f5019;
        c51182.m11358();
        return new C1218(jElapsedRealtime, abstractC2394, i, c42902, jM10171, abstractC2394M11369, iM11386, c42903, jM11360, AbstractC4470.m10171(c51182.f19520.f19453));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final void mo4355(boolean z) {
        m4338(m4339(), 7, new C1072(16));
    }

    @Override // p374.InterfaceC4286
    /* renamed from: יʻ */
    public final void mo2494(int i, C4290 c4290, C4261 c4261, C2484 c2484, IOException iOException, boolean z) {
        C1218 c1218M4348 = m4348(i, c4290);
        m4338(c1218M4348, 1003, new C1067(c1218M4348, c4261, c2484, iOException, z));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void mo4356(C2402 c2402, int i) {
        m4338(m4339(), 1, new C1072(9));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo4357(int i) {
        m4338(m4339(), 6, new C1072(19));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo4358(C2398 c2398) {
        m4338(m4339(), 2, new C1072(18));
    }

    @Override // p385.InterfaceC4485
    /* renamed from: ᐧʻ */
    public final void mo2496(int i, C4290 c4290) {
        m4338(m4348(i, c4290), 1027, new C1209(20));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void mo4359(boolean z) {
        m4338(m4339(), 9, new C1209(8));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void mo4360(int i) {
        m4338(m4339(), 4, new C1072(28));
    }

    @Override // p385.InterfaceC4485
    /* renamed from: ᴵʼ */
    public final void mo2499(int i, C4290 c4290, int i2) {
        m4338(m4348(i, c4290), 1022, new C1209(16));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void mo4361(C2441 c2441) {
        m4338(m4339(), 12, new C1072(8));
    }

    @Override // p385.InterfaceC4485
    /* renamed from: ᵎˏ */
    public final void mo2501(int i, C4290 c4290) {
        m4338(m4348(i, c4290), 1025, new C1209(24));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void mo4362(ExoPlaybackException exoPlaybackException) {
        C4290 c4290;
        C1218 c1218M4339 = (!(exoPlaybackException instanceof ExoPlaybackException) || (c4290 = exoPlaybackException.f1403) == null) ? m4339() : m4366(c4290);
        m4338(c1218M4339, 10, new C1072(c1218M4339, exoPlaybackException));
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final void m4363(InterfaceC2419 interfaceC2419, Looper looper) {
        AbstractC4464.m10132(this.f5019 == null || ((AbstractC3980) this.f5016.f16745).isEmpty());
        interfaceC2419.getClass();
        this.f5019 = interfaceC2419;
        this.f5013 = this.f5017.m10120(looper, null);
        ˎˋ r0 = this.f5018;
        this.f5018 = new ˎˋ((CopyOnWriteArraySet) r0.ٴˎ, looper, (C4460) r0.ˑʽ, new C1195(this, 1, interfaceC2419), r0.ʽᐧ);
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final C1218 m4364() {
        return m4366((C4290) this.f5016.f16749);
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void mo4365(int i, int i2) {
        m4338(m4364(), 24, new C1209(9));
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final C1218 m4366(C4290 c4290) {
        this.f5019.getClass();
        AbstractC2394 abstractC2394 = c4290 == null ? null : (AbstractC2394) ((C3930) this.f5016.f16747).get(c4290);
        if (c4290 != null && abstractC2394 != null) {
            return m4354(abstractC2394, abstractC2394.mo6479(c4290.f16693, this.f5011).f9576, c4290);
        }
        int iM11386 = ((C5118) this.f5019).m11386();
        AbstractC2394 abstractC2394M11369 = ((C5118) this.f5019).m11369();
        if (iM11386 >= abstractC2394M11369.mo6474()) {
            abstractC2394M11369 = AbstractC2394.f9448;
        }
        return m4354(abstractC2394M11369, iM11386, null);
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void mo4367(int i, boolean z) {
        m4338(m4339(), -1, new C1072(12));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void mo4368(C2401 c2401) {
        m4338(m4339(), 28, new C1072(14));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo4369(C2421 c2421) {
        m4338(m4339(), 13, new C1209(29));
    }

    @Override // p385.InterfaceC4485
    /* renamed from: ﹳﹶ */
    public final void mo2507(int i, C4290 c4290) {
        m4338(m4348(i, c4290), 1023, new C1209(26));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo4370(C1811 c1811) {
        m4338(m4339(), 27, new C1209(6));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void mo4371(C2397 c2397) {
        m4338(m4364(), 20, new C1072(13));
    }

    @Override // p374.InterfaceC4286
    /* renamed from: ﾞˊ */
    public final void mo2510(int i, C4290 c4290, C4261 c4261, C2484 c2484) {
        m4338(m4348(i, c4290), 1000, new C1209(12));
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final void mo4372(C2410 c2410) {
        m4338(m4339(), 14, new C1209(15));
    }
}
