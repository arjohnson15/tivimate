package p061;

import android.os.SystemClock;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import p130.C2057;
import p238.C3097;
import p254.C3158;
import p254.C3159;
import p254.InterfaceC3157;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p317.AbstractC3616;
import p334.C3789;
import p356.C4032;
import p366.C4149;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p417.AbstractC4753;
import p424.InterfaceC4906;
import p430.C5014;

/* renamed from: ʾـ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1403 implements InterfaceC3168, InterfaceC3177, InterfaceC4906 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f5732;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f5733;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5734;

    public C1403(int i) {
        this.f5734 = i;
        switch (i) {
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            default:
                this.f5732 = 0L;
                break;
        }
    }

    public /* synthetic */ C1403(long j, Object obj, int i) {
        this.f5734 = i;
        this.f5732 = j;
        this.f5733 = obj;
    }

    public /* synthetic */ C1403(Object obj, long j, int i) {
        this.f5734 = i;
        this.f5733 = obj;
        this.f5732 = j;
    }

    public C1403(C3097 c3097) {
        this.f5734 = 8;
        AbstractC4753.m10683(c3097);
        this.f5733 = c3097;
    }

    public C1403(C3159 c3159, long j) {
        this.f5734 = 2;
        this.f5733 = c3159;
        AbstractC4464.m10142(c3159.f12217 >= j);
        this.f5732 = j;
    }

    public C1403(C4149 c4149) {
        this.f5734 = 5;
        this.f5733 = c4149;
        this.f5732 = 262144L;
    }

    @Override // p254.InterfaceC3168
    public void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        ((C3159) this.f5733).mo4876(bArr, i, i2, false);
    }

    public String toString() {
        switch (this.f5734) {
            case 0:
                if (((C1403) this.f5733) == null) {
                    return Long.toBinaryString(this.f5732);
                }
                return ((C1403) this.f5733).toString() + "xx" + Long.toBinaryString(this.f5732);
            default:
                return super.toString();
        }
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public void m4849() {
        this.f5732 = 0L;
        C1403 c1403 = (C1403) this.f5733;
        if (c1403 != null) {
            c1403.m4849();
        }
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void mo4850() {
        ((InterfaceC3177) this.f5733).mo4850();
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public InterfaceC3178 mo4851(int i, int i2) {
        return ((InterfaceC3177) this.f5733).mo4851(i, i2);
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public int mo3679(byte[] bArr, int i, int i2) {
        return ((C3159) this.f5733).mo3679(bArr, i, i2);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public void m4852(int i) {
        if (i < 64) {
            this.f5732 &= ~(1 << i);
            return;
        }
        C1403 c1403 = (C1403) this.f5733;
        if (c1403 != null) {
            c1403.m4852(i - 64);
        }
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ˈٴ, reason: contains not printable characters */
    public void mo4853(byte[] bArr, int i, int i2) {
        ((C3159) this.f5733).mo4875(bArr, i, i2, false);
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void mo4854(int i) throws EOFException, InterruptedIOException {
        ((C3159) this.f5733).mo4854(i);
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean m4855(int i) {
        if (i < 64) {
            return (this.f5732 & (1 << i)) != 0;
        }
        m4877();
        return ((C1403) this.f5733).m4855(i - 64);
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public long mo4856() {
        return 0L;
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long mo4857(long j, long j2) {
        return 0L;
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ˎˑ, reason: contains not printable characters */
    public void mo4858(InterfaceC3157 interfaceC3157) {
        ((InterfaceC3177) this.f5733).mo4858(new C2057(this, interfaceC3157, interfaceC3157));
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public C4032 mo4859(long j) {
        return new C4032(((C3158) this.f5733).f12210[(int) j], r0.f12208[r9], null);
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void mo4860() {
        ((C3159) this.f5733).f12219 = 0;
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long mo4861() {
        return ((C3159) this.f5733).f12216 - this.f5732;
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long mo4862(long j) {
        return ((C3158) this.f5733).f12209[(int) j] - this.f5732;
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public void m4863(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f5733) == null) {
            this.f5733 = exc;
            this.f5732 = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f5732) {
            Exception exc2 = (Exception) this.f5733;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f5733;
            this.f5733 = null;
            throw exc3;
        }
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public void m4864(int i) {
        if (i < 64) {
            this.f5732 |= 1 << i;
        } else {
            m4877();
            ((C1403) this.f5733).m4864(i - 64);
        }
    }

    @Override // p254.InterfaceC3168
    /* renamed from: יʻ, reason: contains not printable characters */
    public long mo4865() {
        return ((C3159) this.f5733).mo4865() - this.f5732;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public void m4866(int i, boolean z) {
        if (i >= 64) {
            m4877();
            ((C1403) this.f5733).m4866(i - 64, z);
            return;
        }
        long j = this.f5732;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f5732 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m4864(i);
        } else {
            m4852(i);
        }
        if (z2 || ((C1403) this.f5733) != null) {
            m4877();
            ((C1403) this.f5733).m4866(0, z2);
        }
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long mo4867(long j, long j2) {
        return AbstractC4470.m10195(((C3158) this.f5733).f12209, j + this.f5732, true);
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long mo4868(long j, long j2) {
        return ((C3158) this.f5733).f12213[(int) j];
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long mo4869() {
        return ((C3159) this.f5733).f12217 - this.f5732;
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public void mo4870(int i) throws EOFException, InterruptedIOException {
        ((C3159) this.f5733).m7828(i, false);
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C5014 m4871() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strM9549 = ((C4149) this.f5733).m9549(this.f5732);
            this.f5732 -= strM9549.length();
            if (strM9549.length() == 0) {
                return new C5014((String[]) arrayList.toArray(new String[0]));
            }
            int iM8527 = AbstractC3616.m8527(strM9549, ':', 1, false, 4);
            if (iM8527 != -1) {
                String strSubstring = strM9549.substring(0, iM8527);
                String strSubstring2 = strM9549.substring(iM8527 + 1);
                arrayList.add(strSubstring);
                arrayList.add(AbstractC3616.m8539(strSubstring2).toString());
            } else if (strM9549.charAt(0) == ':') {
                String strSubstring3 = strM9549.substring(1);
                arrayList.add("");
                arrayList.add(AbstractC3616.m8539(strSubstring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(AbstractC3616.m8539(strM9549).toString());
            }
        }
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public boolean mo4872() {
        return true;
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public long mo4873(long j, long j2) {
        return -9223372036854775807L;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int m4874(int i) {
        C1403 c1403 = (C1403) this.f5733;
        if (c1403 == null) {
            return i >= 64 ? Long.bitCount(this.f5732) : Long.bitCount(this.f5732 & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f5732 & ((1 << i) - 1));
        }
        return Long.bitCount(this.f5732) + c1403.m4874(i - 64);
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public boolean mo4875(byte[] bArr, int i, int i2, boolean z) {
        return ((C3159) this.f5733).mo4875(bArr, i, i2, z);
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean mo4876(byte[] bArr, int i, int i2, boolean z) {
        return ((C3159) this.f5733).mo4876(bArr, 0, i2, z);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public void m4877() {
        if (((C1403) this.f5733) == null) {
            this.f5733 = new C1403(0);
        }
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public long mo4878(long j, long j2) {
        return ((C3158) this.f5733).f12211;
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public long mo4879(long j) {
        return ((C3158) this.f5733).f12211;
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean m4880(int i) {
        if (i >= 64) {
            m4877();
            return ((C1403) this.f5733).m4880(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f5732;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f5732 = j3;
        long j4 = j - 1;
        this.f5732 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C1403 c1403 = (C1403) this.f5733;
        if (c1403 != null) {
            if (c1403.m4855(0)) {
                m4864(63);
            }
            ((C1403) this.f5733).m4880(0);
        }
        return z;
    }
}
