package p341;

import p153.C2324;
import p254.InterfaceC3177;
import p383.AbstractC4464;
import p383.C4457;
import p383.C4458;
import ˆʽ.ᵎˏ;

/* renamed from: ᵎˑ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3885 implements InterfaceC3881 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C4458 f14970;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f14971;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f14972;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f14973;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f14974;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3891 f14976;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f14977;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f14978;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f14979;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f14980;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2324 f14969 = new C2324(10, new byte[10]);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f14975 = 0;

    public C3885(InterfaceC3891 interfaceC3891) {
        this.f14976 = interfaceC3891;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // p341.InterfaceC3881
    /* renamed from: ʽᐧ */
    public final void mo9080(int i, C4457 c4457) {
        int i2;
        AbstractC4464.m10146(this.f14970);
        int i3 = i & 1;
        InterfaceC3891 interfaceC3891 = this.f14976;
        int i4 = -1;
        int i5 = 3;
        int i6 = 2;
        ?? r9 = 0;
        if (i3 != 0) {
            int i7 = this.f14975;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    AbstractC4464.m10144("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f14971 != -1) {
                        AbstractC4464.m10144("PesReader", "Unexpected start indicator: expected " + this.f14971 + " more bytes");
                    }
                    interfaceC3891.mo9078(c4457.f17170 == 0);
                }
            }
            this.f14975 = 1;
            this.f14979 = 0;
        }
        int i8 = i;
        while (c4457.m10096() > 0) {
            int i9 = this.f14975;
            if (i9 != 0) {
                C2324 c2324 = this.f14969;
                if (i9 != 1) {
                    if (i9 == i6) {
                        if (m9085(c4457, c2324.f9219, Math.min(10, this.f14980)) && m9085(c4457, null, this.f14980)) {
                            c2324.m6407(r9);
                            this.f14972 = -9223372036854775807L;
                            if (this.f14977) {
                                c2324.m6408(4);
                                c2324.m6408(1);
                                c2324.m6408(1);
                                long jM6410 = (c2324.m6410(i5) << 30) | (c2324.m6410(15) << 15) | c2324.m6410(15);
                                c2324.m6408(1);
                                if (!this.f14974 && this.f14978) {
                                    c2324.m6408(4);
                                    c2324.m6408(1);
                                    c2324.m6408(1);
                                    c2324.m6408(1);
                                    this.f14970.m10112((c2324.m6410(15) << 15) | (c2324.m6410(i5) << 30) | c2324.m6410(15));
                                    this.f14974 = true;
                                }
                                this.f14972 = this.f14970.m10112(jM6410);
                            }
                            i8 |= this.f14973 ? 4 : 0;
                            interfaceC3891.mo9075(i8, this.f14972);
                            this.f14975 = 3;
                            this.f14979 = 0;
                        }
                    } else {
                        if (i9 != i5) {
                            throw new IllegalStateException();
                        }
                        int iM10096 = c4457.m10096();
                        int i10 = this.f14971;
                        int i11 = i10 == i4 ? 0 : iM10096 - i10;
                        if (i11 > 0) {
                            iM10096 -= i11;
                            c4457.m10104(c4457.f17169 + iM10096);
                        }
                        interfaceC3891.mo9077(c4457);
                        int i12 = this.f14971;
                        if (i12 != i4) {
                            int i13 = i12 - iM10096;
                            this.f14971 = i13;
                            if (i13 == 0) {
                                interfaceC3891.mo9078(r9);
                                this.f14975 = 1;
                                this.f14979 = r9;
                            }
                        }
                    }
                } else if (m9085(c4457, c2324.f9219, 9)) {
                    c2324.m6407(0);
                    int iM6410 = c2324.m6410(24);
                    if (iM6410 != 1) {
                        ᵎˏ.ʿˏ(iM6410, "Unexpected start code prefix: ", "PesReader");
                        this.f14971 = -1;
                        i2 = 0;
                    } else {
                        c2324.m6408(8);
                        int iM64102 = c2324.m6410(16);
                        c2324.m6408(5);
                        this.f14973 = c2324.m6399();
                        c2324.m6408(2);
                        this.f14977 = c2324.m6399();
                        this.f14978 = c2324.m6399();
                        c2324.m6408(6);
                        int iM64103 = c2324.m6410(8);
                        this.f14980 = iM64103;
                        if (iM64102 == 0) {
                            this.f14971 = -1;
                        } else {
                            int i14 = (iM64102 - 3) - iM64103;
                            this.f14971 = i14;
                            if (i14 < 0) {
                                AbstractC4464.m10144("PesReader", "Found negative packet payload size: " + this.f14971);
                                this.f14971 = -1;
                            }
                            i2 = 2;
                        }
                        i2 = 2;
                    }
                    this.f14975 = i2;
                    this.f14979 = 0;
                }
            } else {
                c4457.m10085(c4457.m10096());
            }
            i4 = -1;
            i5 = 3;
            i6 = 2;
            r9 = 0;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m9085(C4457 c4457, byte[] bArr, int i) {
        int iMin = Math.min(c4457.m10096(), i - this.f14979);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c4457.m10085(iMin);
        } else {
            c4457.m10097(bArr, this.f14979, iMin);
        }
        int i2 = this.f14979 + iMin;
        this.f14979 = i2;
        return i2 == i;
    }

    @Override // p341.InterfaceC3881
    /* renamed from: ـﹶ */
    public final void mo9081() {
        this.f14975 = 0;
        this.f14979 = 0;
        this.f14974 = false;
        this.f14976.mo9076();
    }

    @Override // p341.InterfaceC3881
    /* renamed from: ﹳﹳ */
    public final void mo9082(C4458 c4458, InterfaceC3177 interfaceC3177, C3898 c3898) {
        this.f14970 = c4458;
        this.f14976.mo9079(interfaceC3177, c3898);
    }
}
