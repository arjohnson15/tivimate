package p341;

import p061.C1440;
import p208.AbstractC2793;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.C4457;
import p456.C5349;

/* renamed from: ᵎˑ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3883 implements InterfaceC3891 {

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final double[] f14944 = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC3178 f14945;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1440 f14946;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f14947;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f14948;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long f14949;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public long f14950;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean f14951;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f14952;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C5349 f14953;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f14954;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f14955;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean[] f14956 = new boolean[4];

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3906 f14957;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public long f14958;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4457 f14959;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f14960;

    public C3883(C5349 c5349) {
        this.f14953 = c5349;
        C3906 c3906 = new C3906();
        c3906.f15189 = new byte[128];
        this.f14957 = c3906;
        if (c5349 != null) {
            this.f14946 = new C1440(178);
            this.f14959 = new C4457();
        } else {
            this.f14946 = null;
            this.f14959 = null;
        }
        this.f14948 = -9223372036854775807L;
        this.f14958 = -9223372036854775807L;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ˏᵢ */
    public final void mo9075(int i, long j) {
        this.f14948 = j;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ـﹶ */
    public final void mo9076() {
        AbstractC2793.m7074(this.f14956);
        C3906 c3906 = this.f14957;
        c3906.f15188 = false;
        c3906.f15186 = 0;
        c3906.f15187 = 0;
        C1440 c1440 = this.f14946;
        if (c1440 != null) {
            c1440.m4995();
        }
        this.f14952 = 0L;
        this.f14960 = false;
        this.f14948 = -9223372036854775807L;
        this.f14958 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0196  */
    @Override // p341.InterfaceC3891
    /* renamed from: ٴˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9077(p383.C4457 r27) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p341.C3883.mo9077(ᵢᵢ.ˋⁱ):void");
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ᐧʻ */
    public final void mo9078(boolean z) {
        AbstractC4464.m10146(this.f14945);
        if (z) {
            boolean z2 = this.f14951;
            this.f14945.mo7842(this.f14958, z2 ? 1 : 0, (int) (this.f14952 - this.f14949), 0, null);
        }
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ﹶˆ */
    public final void mo9079(InterfaceC3177 interfaceC3177, C3898 c3898) {
        c3898.m9092();
        c3898.m9091();
        this.f14955 = c3898.f15096;
        c3898.m9091();
        this.f14945 = interfaceC3177.mo4851(c3898.f15099, 2);
        C5349 c5349 = this.f14953;
        if (c5349 != null) {
            c5349.m12110(interfaceC3177, c3898);
        }
    }
}
