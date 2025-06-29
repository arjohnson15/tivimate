package p374;

import java.util.List;
import p345.AbstractC3980;
import p345.C3932;
import p345.C3961;
import p383.AbstractC4464;
import p438.C5077;

/* renamed from: ᵢˎ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4251 implements InterfaceC4280 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f16504;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3932 f16505;

    public C4251(List list, List list2) {
        C3961 c3961M9205 = AbstractC3980.m9205();
        AbstractC4464.m10142(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            c3961M9205.m9172(new C4293((InterfaceC4280) list.get(i), (List) list2.get(i)));
        }
        this.f16505 = c3961M9205.m9167();
        this.f16504 = -9223372036854775807L;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ʽᐧ */
    public final boolean mo6160() {
        int i = 0;
        while (true) {
            C3932 c3932 = this.f16505;
            if (i >= c3932.size()) {
                return false;
            }
            if (((C4293) c3932.get(i)).mo6160()) {
                return true;
            }
            i++;
        }
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᴵ */
    public final long mo6165() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            C3932 c3932 = this.f16505;
            if (i >= c3932.size()) {
                break;
            }
            C4293 c4293 = (C4293) c3932.get(i);
            long jMo6165 = c4293.mo6165();
            if ((c4293.m9755().contains(1) || c4293.m9755().contains(2) || c4293.m9755().contains(4)) && jMo6165 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo6165);
            }
            if (jMo6165 != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo6165);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f16504 = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.f16504;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᵢ */
    public final boolean mo6166(C5077 c5077) {
        boolean zMo6166;
        boolean z = false;
        do {
            long jMo6173 = mo6173();
            if (jMo6173 == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zMo6166 = false;
            while (true) {
                C3932 c3932 = this.f16505;
                if (i >= c3932.size()) {
                    break;
                }
                long jMo61732 = ((C4293) c3932.get(i)).mo6173();
                boolean z2 = jMo61732 != Long.MIN_VALUE && jMo61732 <= c5077.f19296;
                if (jMo61732 == jMo6173 || z2) {
                    zMo6166 |= ((C4293) c3932.get(i)).mo6166(c5077);
                }
                i++;
            }
            z |= zMo6166;
        } while (zMo6166);
        return z;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹳˎ */
    public final void mo6171(long j) {
        int i = 0;
        while (true) {
            C3932 c3932 = this.f16505;
            if (i >= c3932.size()) {
                return;
            }
            ((C4293) c3932.get(i)).mo6171(j);
            i++;
        }
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹶˆ */
    public final long mo6173() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            C3932 c3932 = this.f16505;
            if (i >= c3932.size()) {
                break;
            }
            long jMo6173 = ((C4293) c3932.get(i)).mo6173();
            if (jMo6173 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo6173);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
