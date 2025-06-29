package p397;

import android.support.v4.media.session.AbstractC0001;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2430;
import p166.C2431;
import p254.C3159;
import p254.C3184;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p362.C4125;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;

/* renamed from: ⁱᵎ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4605 implements InterfaceC3165 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2431 f17616;

    /* renamed from: ˉי, reason: contains not printable characters */
    public long f17618;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f17619;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList f17620;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC4602 f17621;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public InterfaceC3178 f17622;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f17623;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public long[] f17625;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public byte[] f17617 = AbstractC4470.f17203;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4457 f17624 = new C4457();

    public C4605(InterfaceC4602 interfaceC4602, C2431 c2431) {
        this.f17621 = interfaceC4602;
        C2417 c2417M6541 = c2431.m6541();
        c2417M6541.f9602 = AbstractC2435.m6559("application/x-media3-cues");
        c2417M6541.f9627 = c2431.f9667;
        c2417M6541.f9599 = interfaceC4602.mo2490();
        this.f17616 = new C2431(c2417M6541);
        this.f17620 = new ArrayList();
        this.f17619 = 0;
        this.f17625 = AbstractC4470.f17204;
        this.f17618 = -9223372036854775807L;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
        if (this.f17619 == 5) {
            return;
        }
        this.f17621.mo2495();
        this.f17619 = 5;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) {
        return true;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    public final int mo4075(InterfaceC3168 interfaceC3168, C2430 c2430) throws ParserException, EOFException, InterruptedIOException {
        int i = this.f17619;
        AbstractC4464.m10132((i == 0 || i == 5) ? false : true);
        if (this.f17619 == 1) {
            int iM12 = ((C3159) interfaceC3168).f12216 != -1 ? AbstractC0001.m12(((C3159) interfaceC3168).f12216) : 1024;
            if (iM12 > this.f17617.length) {
                this.f17617 = new byte[iM12];
            }
            this.f17623 = 0;
            this.f17619 = 2;
        }
        int i2 = this.f17619;
        ArrayList arrayList = this.f17620;
        if (i2 == 2) {
            byte[] bArr = this.f17617;
            if (bArr.length == this.f17623) {
                this.f17617 = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f17617;
            int i3 = this.f17623;
            C3159 c3159 = (C3159) interfaceC3168;
            int iMo3679 = c3159.mo3679(bArr2, i3, bArr2.length - i3);
            if (iMo3679 != -1) {
                this.f17623 += iMo3679;
            }
            long j = c3159.f12216;
            if ((j != -1 && this.f17623 == j) || iMo3679 == -1) {
                try {
                    long j2 = this.f17618;
                    this.f17621.mo2506(this.f17617, j2 != -9223372036854775807L ? new C4601(true, j2) : C4601.f17604, new C4125(4, this));
                    Collections.sort(arrayList);
                    this.f17625 = new long[arrayList.size()];
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        this.f17625[i4] = ((C4609) arrayList.get(i4)).f17631;
                    }
                    this.f17617 = AbstractC4470.f17203;
                    this.f17619 = 4;
                } catch (RuntimeException e) {
                    throw ParserException.m1097("SubtitleParser failed.", e);
                }
            }
        }
        if (this.f17619 == 3) {
            if (((C3159) interfaceC3168).m7826(((C3159) interfaceC3168).f12216 != -1 ? AbstractC0001.m12(((C3159) interfaceC3168).f12216) : 1024) == -1) {
                long j3 = this.f17618;
                for (int iM10195 = j3 == -9223372036854775807L ? 0 : AbstractC4470.m10195(this.f17625, j3, true); iM10195 < arrayList.size(); iM10195++) {
                    m10492((C4609) arrayList.get(iM10195));
                }
                this.f17619 = 4;
            }
        }
        return this.f17619 == 4 ? -1 : 0;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10492(C4609 c4609) {
        AbstractC4464.m10146(this.f17622);
        byte[] bArr = c4609.f17630;
        int length = bArr.length;
        C4457 c4457 = this.f17624;
        c4457.getClass();
        c4457.m10081(bArr.length, bArr);
        this.f17622.mo7841(length, c4457);
        this.f17622.mo7842(c4609.f17631, 1, length, 0, null);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        int i = this.f17619;
        AbstractC4464.m10132((i == 0 || i == 5) ? false : true);
        this.f17618 = j2;
        if (this.f17619 == 2) {
            this.f17619 = 1;
        }
        if (this.f17619 == 4) {
            this.f17619 = 3;
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        AbstractC4464.m10132(this.f17619 == 0);
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(0, 3);
        this.f17622 = interfaceC3178Mo4851;
        interfaceC3178Mo4851.mo7840(this.f17616);
        interfaceC3177.mo4850();
        interfaceC3177.mo4858(new C3184(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f17619 = 1;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
