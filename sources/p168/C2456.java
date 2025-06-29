package p168;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p033.C1219;
import p166.C2401;
import p166.InterfaceC2425;
import p234.C3083;
import p254.AbstractC3152;
import p254.C3159;
import p254.C3160;
import p254.C3169;
import p254.C3175;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p380.C4428;
import p383.AbstractC4470;
import p383.C4457;

/* renamed from: ˋʽ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2456 implements InterfaceC3165 {

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static final C1219 f9763 = new C1219(15);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f9764;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3160 f9765;

    /* renamed from: ˉי, reason: contains not printable characters */
    public InterfaceC3178 f9766;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C2401 f9767;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long f9768;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean f9769;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f9770;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public long f9771;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public InterfaceC3177 f9772;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f9773;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f9774;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f9775;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C3083 f9776;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3175 f9777;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public long f9778;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public boolean f9779;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public InterfaceC2454 f9780;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public long f9781;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3169 f9782;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public InterfaceC3178 f9783;

    public C2456() {
        this(-9223372036854775807L);
    }

    public C2456(long j) {
        this.f9775 = 0;
        this.f9764 = j;
        this.f9773 = new C4457(10);
        this.f9782 = new C3169();
        this.f9765 = new C3160();
        this.f9768 = -9223372036854775807L;
        this.f9776 = new C3083(1);
        C3175 c3175 = new C3175();
        this.f9777 = c3175;
        this.f9766 = c3175;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static long m6569(C2401 c2401) {
        if (c2401 == null) {
            return -9223372036854775807L;
        }
        int length = c2401.f9491.length;
        for (int i = 0; i < length; i++) {
            InterfaceC2425 interfaceC2425 = c2401.f9491[i];
            if (interfaceC2425 instanceof C4428) {
                C4428 c4428 = (C4428) interfaceC2425;
                if (c4428.f17063.equals("TLEN")) {
                    return AbstractC4470.m10206(Long.parseLong((String) c4428.f17074.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) {
        return m6571((C3159) interfaceC3168, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo4075(p254.InterfaceC3168 r51, p166.C2430 r52) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p168.C2456.mo4075(יי.ˑי, ˊﹶ.ᵎˏ):int");
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
        this.f9770 = 0;
        this.f9768 = -9223372036854775807L;
        this.f9778 = 0L;
        this.f9774 = 0;
        this.f9781 = j2;
        InterfaceC2454 interfaceC2454 = this.f9780;
        if (!(interfaceC2454 instanceof C2449) || ((C2449) interfaceC2454).m6566(j2)) {
            return;
        }
        this.f9779 = true;
        this.f9766 = this.f9777;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m6570(C3159 c3159) {
        InterfaceC2454 interfaceC2454 = this.f9780;
        if (interfaceC2454 != null) {
            long jMo6567 = interfaceC2454.mo6567();
            if (jMo6567 != -1 && c3159.mo4865() > jMo6567 - 4) {
                return true;
            }
        }
        try {
            return !c3159.mo4875(this.f9773.f17171, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f9772 = interfaceC3177;
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(0, 1);
        this.f9783 = interfaceC3178Mo4851;
        this.f9766 = interfaceC3178Mo4851;
        this.f9772.mo4850();
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m6571(C3159 c3159, boolean z) throws ParserException, EOFException, InterruptedIOException {
        int i;
        int iMo4865;
        int iM7805;
        int i2 = z ? 32768 : 131072;
        c3159.f12219 = 0;
        if (c3159.f12217 == 0) {
            C2401 c2401M7581 = this.f9776.m7581(c3159, (this.f9775 & 8) == 0 ? null : f9763);
            this.f9767 = c2401M7581;
            if (c2401M7581 != null) {
                this.f9765.m7831(c2401M7581);
            }
            iMo4865 = (int) c3159.mo4865();
            if (!z) {
                c3159.mo4854(iMo4865);
            }
            i = 0;
        } else {
            i = 0;
            iMo4865 = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (!m6570(c3159)) {
                C4457 c4457 = this.f9773;
                c4457.m10108(0);
                int iM10092 = c4457.m10092();
                if ((i == 0 || ((-128000) & iM10092) == (i & (-128000))) && (iM7805 = AbstractC3152.m7805(iM10092)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.f9782.m7837(iM10092);
                        i = iM10092;
                    }
                    c3159.m7828(iM7805 - 4, false);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        throw ParserException.m1097("Searched too many bytes.", null);
                    }
                    if (z) {
                        c3159.f12219 = 0;
                        c3159.m7828(iMo4865 + i5, false);
                    } else {
                        c3159.mo4854(1);
                    }
                    i4 = i5;
                    i = 0;
                    i3 = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            c3159.mo4854(iMo4865 + i4);
        } else {
            c3159.f12219 = 0;
        }
        this.f9770 = i;
        return true;
    }
}
