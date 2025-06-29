package p341;

import p061.C1440;
import p208.AbstractC2793;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p331.C3761;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;

/* renamed from: ᵎˑ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3902 implements InterfaceC3891 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f15138;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f15139;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f15141;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public InterfaceC3178 f15145;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3761 f15146;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C3893 f15150;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean[] f15147 = new boolean[3];

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C1440 f15148 = new C1440(32);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C1440 f15144 = new C1440(33);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C1440 f15151 = new C1440(34);

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C1440 f15140 = new C1440(39);

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C1440 f15143 = new C1440(40);

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long f15142 = -9223372036854775807L;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C4457 f15149 = new C4457();

    public C3902(C3761 c3761) {
        this.f15146 = c3761;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9094(byte[] bArr, int i, int i2) {
        C3893 c3893 = this.f15150;
        if (c3893.f15054) {
            int i3 = c3893.f15056;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                c3893.f15055 = (bArr[i4] & 128) != 0;
                c3893.f15054 = false;
            } else {
                c3893.f15056 = (i2 - i) + i3;
            }
        }
        if (!this.f15139) {
            this.f15148.m4993(bArr, i, i2);
            this.f15144.m4993(bArr, i, i2);
            this.f15151.m4993(bArr, i, i2);
        }
        this.f15140.m4993(bArr, i, i2);
        this.f15143.m4993(bArr, i, i2);
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ˏᵢ */
    public final void mo9075(int i, long j) {
        this.f15142 = j;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ـﹶ */
    public final void mo9076() {
        this.f15141 = 0L;
        this.f15142 = -9223372036854775807L;
        AbstractC2793.m7074(this.f15147);
        this.f15148.m4995();
        this.f15144.m4995();
        this.f15151.m4995();
        this.f15140.m4995();
        this.f15143.m4995();
        C3893 c3893 = this.f15150;
        if (c3893 != null) {
            c3893.f15054 = false;
            c3893.f15055 = false;
            c3893.f15051 = false;
            c3893.f15057 = false;
            c3893.f15047 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022e A[SYNTHETIC] */
    @Override // p341.InterfaceC3891
    /* renamed from: ٴˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9077(p383.C4457 r38) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p341.C3902.mo9077(ᵢᵢ.ˋⁱ):void");
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ᐧʻ */
    public final void mo9078(boolean z) {
        AbstractC4464.m10146(this.f15145);
        int i = AbstractC4470.f17202;
        if (z) {
            C3893 c3893 = this.f15150;
            long j = this.f15141;
            c3893.f15049 = c3893.f15052;
            c3893.m9088((int) (j - c3893.f15045));
            c3893.f15050 = c3893.f15045;
            c3893.f15045 = j;
            c3893.m9088(0);
            c3893.f15057 = false;
        }
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ﹶˆ */
    public final void mo9079(InterfaceC3177 interfaceC3177, C3898 c3898) {
        c3898.m9092();
        c3898.m9091();
        this.f15138 = c3898.f15096;
        c3898.m9091();
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(c3898.f15099, 2);
        this.f15145 = interfaceC3178Mo4851;
        this.f15150 = new C3893(interfaceC3178Mo4851);
        this.f15146.m8762(interfaceC3177, c3898);
    }
}
