package p230;

import java.util.Arrays;
import p254.C3159;
import p254.C3166;
import p254.InterfaceC3183;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import p383.C4458;
import ˆˑ.ﹳﹳ;

/* renamed from: ˑˈ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3071 implements InterfaceC3183 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f11848;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f11849;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Object f11850;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f11851;

    public C3071() {
        this.f11849 = new long[10];
        this.f11850 = new Object[10];
    }

    public C3071(int i, float[] fArr, float[] fArr2, int i2) {
        this.f11851 = i;
        AbstractC4464.m10142(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f11849 = fArr;
        this.f11850 = fArr2;
        this.f11848 = i2;
    }

    public C3071(C3071 c3071) {
        float[] fArr = (float[]) c3071.f11849;
        this.f11851 = fArr.length / 3;
        this.f11849 = AbstractC4464.m10139(fArr);
        this.f11850 = AbstractC4464.m10139((float[]) c3071.f11850);
        int i = c3071.f11848;
        if (i == 1) {
            this.f11848 = 5;
        } else if (i != 2) {
            this.f11848 = 4;
        } else {
            this.f11848 = 6;
        }
    }

    @Override // p254.InterfaceC3183
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void mo7562() {
        byte[] bArr = AbstractC4470.f17203;
        C4457 c4457 = (C4457) this.f11850;
        c4457.getClass();
        c4457.m10081(bArr.length, bArr);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m7563() {
        int length = ((Object[]) this.f11850).length;
        if (this.f11848 < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.f11851;
        int i3 = length - i2;
        System.arraycopy((long[]) this.f11849, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.f11850, this.f11851, objArr, 0, i3);
        int i4 = this.f11851;
        if (i4 > 0) {
            System.arraycopy((long[]) this.f11849, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.f11850, 0, objArr, i3, this.f11851);
        }
        this.f11849 = jArr;
        this.f11850 = objArr;
        this.f11851 = 0;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public synchronized int m7564() {
        return this.f11848;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public synchronized Object m7565(long j) {
        return m7568(true, j);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public synchronized void m7566(long j, Object obj) {
        if (this.f11848 > 0) {
            if (j <= ((long[]) this.f11849)[((this.f11851 + r0) - 1) % ((Object[]) this.f11850).length]) {
                m7570();
            }
        }
        m7563();
        int i = this.f11851;
        int i2 = this.f11848;
        Object[] objArr = (Object[]) this.f11850;
        int length = (i + i2) % objArr.length;
        ((long[]) this.f11849)[length] = j;
        objArr[length] = obj;
        this.f11848 = i2 + 1;
    }

    @Override // p254.InterfaceC3183
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C3166 mo7567(C3159 c3159, long j) {
        long j2 = c3159.f12217;
        int iMin = (int) Math.min(this.f11848, c3159.f12216 - j2);
        C4457 c4457 = (C4457) this.f11850;
        c4457.m10099(iMin);
        c3159.mo4875(c4457.f17171, 0, iMin, false);
        int i = c4457.f17170;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (c4457.m10096() >= 188) {
            byte[] bArr = c4457.f17171;
            int i2 = c4457.f17169;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long j6 = ﹳﹳ.ﾞˊ(c4457, i2, this.f11851);
            if (j6 != -9223372036854775807L) {
                long jM10112 = ((C4458) this.f11849).m10112(j6);
                if (jM10112 > j) {
                    return j5 == -9223372036854775807L ? new C3166(-1, jM10112, j2) : new C3166(0, -9223372036854775807L, j2 + j4);
                }
                if (100000 + jM10112 > j) {
                    return new C3166(0, -9223372036854775807L, j2 + i2);
                }
                j5 = jM10112;
                j4 = i2;
            }
            c4457.m10108(i3);
            j3 = i3;
        }
        return j5 != -9223372036854775807L ? new C3166(-2, j5, j2 + j3) : C3166.f12240;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object m7568(boolean z, long j) {
        Object objM7571 = null;
        long j2 = Long.MAX_VALUE;
        while (this.f11848 > 0) {
            long j3 = j - ((long[]) this.f11849)[this.f11851];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objM7571 = m7571();
            j2 = j3;
        }
        return objM7571;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public synchronized Object m7569() {
        return this.f11848 == 0 ? null : m7571();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public synchronized void m7570() {
        this.f11851 = 0;
        this.f11848 = 0;
        Arrays.fill((Object[]) this.f11850, (Object) null);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Object m7571() {
        AbstractC4464.m10132(this.f11848 > 0);
        Object[] objArr = (Object[]) this.f11850;
        int i = this.f11851;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f11851 = (i + 1) % objArr.length;
        this.f11848--;
        return obj;
    }
}
