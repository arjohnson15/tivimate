package p234;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import p112.C1808;
import p112.C1812;
import p166.C2401;
import p254.C3159;
import p353.AbstractC4010;
import p362.C4125;
import p380.C4437;
import p380.InterfaceC4434;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import p383.InterfaceC4462;
import p397.C4598;
import p397.C4601;
import p397.InterfaceC4599;
import p397.InterfaceC4602;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˑˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3083 implements InterfaceC4602 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4457 f11902;

    public C3083(int i) {
        switch (i) {
            case 1:
                this.f11902 = new C4457(10);
                break;
            default:
                this.f11902 = new C4457();
                break;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C2401 m7581(C3159 c3159, InterfaceC4434 interfaceC4434) throws EOFException, InterruptedIOException {
        C4457 c4457 = this.f11902;
        C2401 c2401M10062 = null;
        int i = 0;
        while (true) {
            try {
                c3159.mo4875(c4457.f17171, 0, 10, false);
                c4457.m10108(0);
                if (c4457.m10095() != 4801587) {
                    break;
                }
                c4457.m10085(3);
                int iM10079 = c4457.m10079();
                int i2 = iM10079 + 10;
                if (c2401M10062 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(c4457.f17171, 0, bArr, 0, 10);
                    c3159.mo4875(bArr, 10, iM10079, false);
                    c2401M10062 = new C4437(interfaceC4434).m10062(i2, bArr);
                } else {
                    c3159.m7828(iM10079, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        c3159.f12219 = 0;
        c3159.m7828(i, false);
        return c2401M10062;
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏʾ */
    public int mo2490() {
        return 2;
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏᵢ */
    public /* synthetic */ InterfaceC4599 mo2492(byte[] bArr, int i, int i2) {
        return ᐧʻ.ʽᐧ(this, bArr, i2);
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ـﹶ */
    public /* synthetic */ void mo2495() {
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ﹳﹳ */
    public /* synthetic */ void mo2506(byte[] bArr, C4601 c4601, C4125 c4125) {
        ᐧʻ.ـﹶ(this, bArr, c4601, c4125);
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ﹶˆ */
    public void mo2508(byte[] bArr, int i, int i2, C4601 c4601, InterfaceC4462 interfaceC4462) {
        C1808 c1808M5556;
        C4457 c4457 = this.f11902;
        c4457.m10081(i + i2, bArr);
        c4457.m10108(i);
        ArrayList arrayList = new ArrayList();
        while (c4457.m10096() > 0) {
            AbstractC4464.m10124("Incomplete Mp4Webvtt Top Level box header found.", c4457.m10096() >= 8);
            int iM10092 = c4457.m10092();
            if (c4457.m10092() == 1987343459) {
                int i3 = iM10092 - 8;
                CharSequence charSequenceM7586 = null;
                C1812 c1812M7579 = null;
                while (i3 > 0) {
                    AbstractC4464.m10124("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM100922 = c4457.m10092();
                    int iM100923 = c4457.m10092();
                    int i4 = iM100922 - 8;
                    byte[] bArr2 = c4457.f17171;
                    int i5 = c4457.f17169;
                    int i6 = AbstractC4470.f17202;
                    String str = new String(bArr2, i5, i4, AbstractC4010.f15450);
                    c4457.m10085(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM100923 == 1937011815) {
                        C3081 c3081 = new C3081();
                        AbstractC3087.m7583(str, c3081);
                        c1812M7579 = c3081.m7579();
                    } else if (iM100923 == 1885436268) {
                        charSequenceM7586 = AbstractC3087.m7586(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceM7586 == null) {
                    charSequenceM7586 = "";
                }
                if (c1812M7579 != null) {
                    c1812M7579.f7020 = charSequenceM7586;
                    c1808M5556 = c1812M7579.m5556();
                } else {
                    Pattern pattern = AbstractC3087.f11914;
                    C3081 c30812 = new C3081();
                    c30812.f11879 = charSequenceM7586;
                    c1808M5556 = c30812.m7579().m5556();
                }
                arrayList.add(c1808M5556);
            } else {
                c4457.m10085(iM10092 - 8);
            }
        }
        interfaceC4462.mo4264(new C4598(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
