package p101;

import android.os.Bundle;
import p076.C1663;
import p254.C3159;
import p254.C3176;
import p254.C3179;
import p254.InterfaceC3157;
import p331.C3761;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p456.AbstractC5248;
import p456.C5235;
import p456.C5236;
import p456.C5255;
import p456.C5280;
import p456.C5316;
import ʿﾞ.ﹳﹳ;

/* renamed from: ˆˏ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1778 implements InterfaceC1781 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f6897;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f6898;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Object f6899;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f6900;

    public C1778(int i, long j) {
        AbstractC4464.m10132(((C1663) this.f6898) == null);
        this.f6900 = j;
        this.f6897 = j + i;
    }

    public C1778(String str, byte[] bArr, long j, long j2) {
        this.f6898 = str;
        this.f6899 = bArr;
        this.f6900 = j;
        this.f6897 = j2;
    }

    @Override // p101.InterfaceC1781
    /* renamed from: ˉי */
    public InterfaceC3157 mo5492() {
        AbstractC4464.m10132(this.f6900 != -1);
        return new C3176((C3179) this.f6898, this.f6900, 0);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean m5501(long j, boolean z, boolean z2) {
        C5255 c5255 = (C5255) this.f6899;
        c5255.m11846();
        c5255.m11757();
        C5236 c5236 = (C5236) ((ﹳﹳ) c5255).ᐧⁱ;
        if (c5236.m11662()) {
            C5280 c5280 = c5255.ᐧᴵ();
            c5236.f20107.getClass();
            c5280.f20480.m11314(System.currentTimeMillis());
        }
        long j2 = j - this.f6900;
        if (!z && j2 < 1000) {
            c5255.ˏᵢ().f20566.m4531(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.f6897;
            this.f6897 = j;
        }
        c5255.ˏᵢ().f20566.m4531(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        C5316.m11947(c5255.m11849().m12009(!c5236.f20123.m11729()), bundle, true);
        if (!z2) {
            c5255.m11847().m11705("auto", "_e", bundle);
        }
        this.f6900 = j;
        C5235 c5235 = (C5235) this.f6898;
        c5235.m11844();
        c5235.m11843(((Long) AbstractC5248.f20246.m11751(null)).longValue());
        return true;
    }

    @Override // p101.InterfaceC1781
    /* renamed from: ﾞʽ */
    public void mo5493(long j) {
        long[] jArr = (long[]) ((C3761) this.f6899).f14527;
        this.f6897 = jArr[AbstractC4470.m10195(jArr, j, true)];
    }

    @Override // p101.InterfaceC1781
    /* renamed from: ﾞˊ */
    public long mo5494(C3159 c3159) {
        long j = this.f6897;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f6897 = -1L;
        return j2;
    }
}
