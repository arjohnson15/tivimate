package p101;

import androidx.leanback.widget.C0153;
import java.io.EOFException;
import java.io.InterruptedIOException;
import p254.C3159;
import p383.AbstractC4464;
import p383.C4457;

/* renamed from: ˆˏ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1780 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f6903;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f6906;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0153 f6905 = new C0153();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4457 f6902 = new C4457(0, new byte[65025]);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f6904 = -1;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m5505(C3159 c3159) throws InterruptedIOException {
        int i;
        AbstractC4464.m10132(c3159 != null);
        boolean z = this.f6903;
        C4457 c4457 = this.f6902;
        if (z) {
            this.f6903 = false;
            c4457.m10099(0);
        }
        while (!this.f6903) {
            int i2 = this.f6904;
            C0153 c0153 = this.f6905;
            if (i2 < 0) {
                if (c0153.m931(c3159, -1L) && c0153.m935(c3159, true)) {
                    int iM5506 = c0153.f1077;
                    if ((c0153.f1074 & 1) == 1 && c4457.f17170 == 0) {
                        iM5506 += m5506(0);
                        i = this.f6906;
                    } else {
                        i = 0;
                    }
                    try {
                        c3159.mo4854(iM5506);
                        this.f6904 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM55062 = m5506(this.f6904);
            int i3 = this.f6904 + this.f6906;
            if (iM55062 > 0) {
                c4457.m10077(c4457.f17170 + iM55062);
                try {
                    c3159.mo4876(c4457.f17171, c4457.f17170, iM55062, false);
                    c4457.m10104(c4457.f17170 + iM55062);
                    this.f6903 = ((int[]) c0153.f1075)[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == c0153.f1073) {
                i3 = -1;
            }
            this.f6904 = i3;
        }
        return true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m5506(int i) {
        int i2;
        int i3 = 0;
        this.f6906 = 0;
        do {
            int i4 = this.f6906;
            int i5 = i + i4;
            C0153 c0153 = this.f6905;
            if (i5 >= c0153.f1073) {
                break;
            }
            int[] iArr = (int[]) c0153.f1075;
            this.f6906 = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
