package p000;

import android.net.Uri;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.util.Map;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p254.C3159;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p323.C3682;
import p355.C4029;
import p355.InterfaceC4026;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ʻ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0871 implements InterfaceC4026 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long f3953;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f3954;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Object f3955;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f3956;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f3957;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object f3958;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object f3959;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f3960;

    public C0871(InterfaceC3177 interfaceC3177, InterfaceC3178 interfaceC3178, C3682 c3682, String str, int i) throws ParserException {
        this.f3954 = interfaceC3177;
        this.f3958 = interfaceC3178;
        this.f3959 = c3682;
        int i2 = c3682.f14116;
        int i3 = c3682.f14117;
        int i4 = (i2 * i3) / 8;
        int i5 = c3682.f14115;
        if (i5 != i4) {
            throw ParserException.m1097("Expected block size: " + i4 + "; got: " + i5, null);
        }
        int i6 = c3682.f14113;
        int i7 = i6 * i4;
        int i8 = i7 * 8;
        int iMax = Math.max(i4, i7 / 10);
        this.f3957 = iMax;
        C2417 c2417 = new C2417();
        c2417.f9602 = AbstractC2435.m6559(str);
        c2417.f9616 = i8;
        c2417.f9610 = i8;
        c2417.f9605 = iMax;
        c2417.f9624 = i3;
        c2417.f9600 = i6;
        c2417.f9618 = i;
        this.f3955 = new C2431(c2417);
    }

    @Override // p355.InterfaceC4026
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void mo3686(int i, long j) {
        ((InterfaceC3177) this.f3954).mo4858(new C4029((C3682) this.f3959, 1, i, j));
        ((InterfaceC3178) this.f3958).mo7840((C2431) this.f3955);
    }

    @Override // p355.InterfaceC4026
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void mo3687(long j) {
        this.f3953 = j;
        this.f3956 = 0;
        this.f3960 = 0L;
    }

    @Override // p355.InterfaceC4026
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean mo3688(C3159 c3159, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.f3956) < (i2 = this.f3957)) {
            int iMo7843 = ((InterfaceC3178) this.f3958).mo7843(c3159, (int) Math.min(i2 - i, j2), true);
            if (iMo7843 == -1) {
                j2 = 0;
            } else {
                this.f3956 += iMo7843;
                j2 -= iMo7843;
            }
        }
        C3682 c3682 = (C3682) this.f3959;
        int i3 = this.f3956;
        int i4 = c3682.f14115;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long j3 = this.f3953;
            long j4 = this.f3960;
            long j5 = c3682.f14113;
            int i6 = AbstractC4470.f17202;
            long jM10166 = j3 + AbstractC4470.m10166(j4, 1000000L, j5, RoundingMode.FLOOR);
            int i7 = i5 * i4;
            int i8 = this.f3956 - i7;
            ((InterfaceC3178) this.f3958).mo7842(jM10166, 1, i7, i8, null);
            this.f3960 += i5;
            this.f3956 = i8;
        }
        return j2 <= 0;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C0882 m3689() {
        AbstractC4464.m10136((Uri) this.f3954, "The uri must be set.");
        return new C0882((Uri) this.f3954, this.f3957, (byte[]) this.f3958, (Map) this.f3959, this.f3953, this.f3960, (String) this.f3955, this.f3956);
    }
}
