package p341;

import p061.C1440;
import p208.AbstractC2793;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.C4457;
import p456.C5349;

/* renamed from: ᵎˑ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3886 implements InterfaceC3891 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final float[] f14981 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4457 f14982;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1440 f14983;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f14984;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public long f14985;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public String f14986;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean[] f14987 = new boolean[4];

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5349 f14988;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C3884 f14989;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f14990;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3889 f14991;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public InterfaceC3178 f14992;

    public C3886(C5349 c5349) {
        this.f14988 = c5349;
        C3889 c3889 = new C3889();
        c3889.f15019 = new byte[128];
        this.f14991 = c3889;
        this.f14985 = -9223372036854775807L;
        this.f14983 = new C1440(178);
        this.f14982 = new C4457();
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ˏᵢ */
    public final void mo9075(int i, long j) {
        this.f14985 = j;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ـﹶ */
    public final void mo9076() {
        AbstractC2793.m7074(this.f14987);
        C3889 c3889 = this.f14991;
        c3889.f15021 = false;
        c3889.f15020 = 0;
        c3889.f15018 = 0;
        C3884 c3884 = this.f14989;
        if (c3884 != null) {
            c3884.f14961 = false;
            c3884.f14964 = false;
            c3884.f14968 = false;
            c3884.f14962 = -1;
        }
        C1440 c1440 = this.f14983;
        if (c1440 != null) {
            c1440.m4995();
        }
        this.f14990 = 0L;
        this.f14985 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024c  */
    @Override // p341.InterfaceC3891
    /* renamed from: ٴˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9077(p383.C4457 r19) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p341.C3886.mo9077(ᵢᵢ.ˋⁱ):void");
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ᐧʻ */
    public final void mo9078(boolean z) {
        AbstractC4464.m10146(this.f14989);
        if (z) {
            this.f14989.m9083(this.f14990, this.f14984, 0);
            C3884 c3884 = this.f14989;
            c3884.f14961 = false;
            c3884.f14964 = false;
            c3884.f14968 = false;
            c3884.f14962 = -1;
        }
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ﹶˆ */
    public final void mo9079(InterfaceC3177 interfaceC3177, C3898 c3898) {
        c3898.m9092();
        c3898.m9091();
        this.f14986 = c3898.f15096;
        c3898.m9091();
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(c3898.f15099, 2);
        this.f14992 = interfaceC3178Mo4851;
        this.f14989 = new C3884(interfaceC3178Mo4851);
        this.f14988.m12110(interfaceC3177, c3898);
    }
}
