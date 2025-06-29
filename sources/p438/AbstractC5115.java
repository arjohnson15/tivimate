package p438;

import androidx.media3.exoplayer.ExoPlaybackException;
import p033.C1215;
import p036.C1255;
import p166.AbstractC2394;
import p166.C2417;
import p166.C2431;
import p312.C3589;
import p374.C4290;
import p374.InterfaceC4254;
import p383.AbstractC4464;
import p383.C4460;
import p456.C5349;

/* renamed from: ﹶﾞ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5115 implements InterfaceC5109 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public long f19475;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f19476;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f19477;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f19478;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f19481;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public InterfaceC4254 f19483;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C5081 f19484;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C2431[] f19486;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public C1255 f19487;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C1215 f19488;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean f19489;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C4460 f19490;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public long f19491;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f19485 = new Object();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C5349 f19479 = new C5349(19);

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public long f19482 = Long.MIN_VALUE;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public AbstractC2394 f19480 = AbstractC2394.f9448;

    public AbstractC5115(int i) {
        this.f19476 = i;
    }

    /* renamed from: ʿˏ */
    public abstract void mo1115(C2431[] c2431Arr, long j, long j2);

    /* renamed from: ˈٴ */
    public abstract int mo1118(C2431 c2431);

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m11335() {
        return this.f19482 == Long.MIN_VALUE;
    }

    /* renamed from: ˉⁱ */
    public abstract boolean mo1119();

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final int m11336(C5349 c5349, C3589 c3589, int i) {
        InterfaceC4254 interfaceC4254 = this.f19483;
        interfaceC4254.getClass();
        int iMo4054 = interfaceC4254.mo4054(c5349, c3589, i);
        if (iMo4054 == -4) {
            if (c3589.m4401(4)) {
                this.f19482 = Long.MIN_VALUE;
                return this.f19481 ? -4 : -3;
            }
            long j = c3589.f13807 + this.f19491;
            c3589.f13807 = j;
            this.f19482 = Math.max(this.f19482, j);
        } else if (iMo4054 == -5) {
            C2431 c2431 = (C2431) c5349.f20757;
            c2431.getClass();
            long j2 = c2431.f9669;
            if (j2 != Long.MAX_VALUE) {
                C2417 c2417M6541 = c2431.m6541();
                c2417M6541.f9621 = j2 + this.f19491;
                c5349.f20757 = new C2431(c2417M6541);
            }
        }
        return iMo4054;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean m11337() {
        if (m11335()) {
            return this.f19481;
        }
        InterfaceC4254 interfaceC4254 = this.f19483;
        interfaceC4254.getClass();
        return interfaceC4254.mo4058();
    }

    /* renamed from: ˎٴ */
    public void mo3858() {
    }

    /* renamed from: ˏʾ */
    public abstract boolean mo1122();

    /* renamed from: ˏᴵ */
    public void mo1123(boolean z, boolean z2) {
    }

    /* renamed from: ˏᵢ */
    public InterfaceC5111 mo1124() {
        return null;
    }

    @Override // p438.InterfaceC5109
    /* renamed from: ˑʽ */
    public void mo1125(int i, Object obj) {
    }

    /* renamed from: ˑי */
    public abstract void mo1126(boolean z, long j);

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m11338() {
        AbstractC4464.m10132(this.f19478 == 0);
        this.f19479.m12099();
        mo3858();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ExoPlaybackException m11339(Throwable th, C2431 c2431, boolean z, int i) {
        int iMo1118;
        if (c2431 == null || this.f19489) {
            iMo1118 = 4;
        } else {
            this.f19489 = true;
            try {
                iMo1118 = mo1118(c2431) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.f19489 = false;
            }
        }
        return new ExoPlaybackException(1, th, i, mo1137(), this.f19477, c2431, c2431 == null ? 4 : iMo1118, z);
    }

    /* renamed from: ᐧʻ */
    public void mo1140() {
    }

    /* renamed from: ᐧⁱ */
    public int mo1130() {
        return 0;
    }

    /* renamed from: ᴵʿ */
    public abstract void mo1131();

    /* renamed from: ᵎˏ */
    public void mo1132() {
    }

    /* renamed from: ᵎـ */
    public void mo3871() {
    }

    /* renamed from: ﹳˎ */
    public void mo1134() {
    }

    /* renamed from: ﹳˑ */
    public void mo3877(float f, float f2) {
    }

    /* renamed from: ﹶˆ */
    public abstract String mo1137();

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void m11340(C2431[] c2431Arr, InterfaceC4254 interfaceC4254, long j, long j2, C4290 c4290) {
        AbstractC4464.m10132(!this.f19481);
        this.f19483 = interfaceC4254;
        if (this.f19482 == Long.MIN_VALUE) {
            this.f19482 = j;
        }
        this.f19486 = c2431Arr;
        this.f19491 = j2;
        mo1115(c2431Arr, j, j2);
    }

    /* renamed from: ﾞˊ */
    public abstract void mo1138(long j, long j2);
}
