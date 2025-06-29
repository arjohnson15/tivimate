package p141;

import android.os.SystemClock;
import java.util.List;
import p166.C2430;
import p175.InterfaceC2486;
import p254.C3176;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4464;
import p383.C4457;

/* renamed from: ˉˑ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2206 implements InterfaceC3165 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4457 f8686;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object f8687;

    /* renamed from: ˉי, reason: contains not printable characters */
    public volatile int f8688;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f8689;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long f8690;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f8691;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f8692;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f8693;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC2486 f8694;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2198 f8695;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public InterfaceC3177 f8696;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f8697;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public volatile long f8698;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2206(p141.C2193 r5, int r6) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p141.C2206.<init>(ˉˑ.ˉⁱ, int):void");
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    public final int mo4075(InterfaceC3168 interfaceC3168, C2430 c2430) {
        byte[] bArr;
        this.f8696.getClass();
        int iMo3679 = interfaceC3168.mo3679(this.f8686.f17171, 0, 65507);
        if (iMo3679 == -1) {
            return -1;
        }
        if (iMo3679 == 0) {
            return 0;
        }
        this.f8686.m10108(0);
        this.f8686.m10104(iMo3679);
        C4457 c4457 = this.f8686;
        C2217 c2217 = null;
        if (c4457.m10096() >= 12) {
            int iM10086 = c4457.m10086();
            byte b = (byte) (iM10086 >> 6);
            byte b2 = (byte) (iM10086 & 15);
            if (b == 2) {
                int iM100862 = c4457.m10086();
                boolean z = ((iM100862 >> 7) & 1) == 1;
                byte b3 = (byte) (iM100862 & 127);
                int iM10100 = c4457.m10100();
                long jM10110 = c4457.m10110();
                int iM10092 = c4457.m10092();
                byte[] bArr2 = C2217.f8775;
                if (b2 > 0) {
                    bArr = new byte[b2 * 4];
                    for (int i = 0; i < b2; i++) {
                        c4457.m10097(bArr, i * 4, 4);
                    }
                } else {
                    bArr = bArr2;
                }
                byte[] bArr3 = new byte[c4457.m10096()];
                c4457.m10097(bArr3, 0, c4457.m10096());
                C2200 c2200 = new C2200();
                c2200.f8658 = bArr2;
                c2200.f8659 = bArr2;
                c2200.f8657 = z;
                c2200.f8654 = b3;
                AbstractC4464.m10142(iM10100 >= 0 && iM10100 <= 65535);
                c2200.f8656 = 65535 & iM10100;
                c2200.f8660 = jM10110;
                c2200.f8655 = iM10092;
                c2200.f8658 = bArr;
                c2200.f8659 = bArr3;
                c2217 = new C2217(c2200);
            }
        }
        if (c2217 == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - 30;
        this.f8695.m6129(c2217, jElapsedRealtime);
        C2217 c2217M6131 = this.f8695.m6131(j);
        if (c2217M6131 == null) {
            return 0;
        }
        if (!this.f8692) {
            if (this.f8698 == -9223372036854775807L) {
                this.f8698 = c2217M6131.f8781;
            }
            if (this.f8688 == -1) {
                this.f8688 = c2217M6131.f8778;
            }
            this.f8694.mo6599(this.f8698);
            this.f8692 = true;
        }
        synchronized (this.f8687) {
            try {
                if (!this.f8691) {
                    do {
                        C4457 c44572 = this.f8693;
                        byte[] bArr4 = c2217M6131.f8780;
                        c44572.getClass();
                        c44572.m10081(bArr4.length, bArr4);
                        this.f8694.mo6602(this.f8693, c2217M6131.f8781, c2217M6131.f8778, c2217M6131.f8779);
                        c2217M6131 = this.f8695.m6131(j);
                    } while (c2217M6131 != null);
                } else if (this.f8689 != -9223372036854775807L && this.f8690 != -9223372036854775807L) {
                    this.f8695.m6128();
                    this.f8694.mo6601(this.f8689, this.f8690);
                    this.f8691 = false;
                    this.f8689 = -9223372036854775807L;
                    this.f8690 = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        synchronized (this.f8687) {
            try {
                if (!this.f8691) {
                    this.f8691 = true;
                }
                this.f8689 = j;
                this.f8690 = j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f8694.mo6600(interfaceC3177, this.f8697);
        interfaceC3177.mo4850();
        interfaceC3177.mo4858(new C3176(-9223372036854775807L));
        this.f8696 = interfaceC3177;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
