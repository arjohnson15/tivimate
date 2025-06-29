package p093;

import java.util.ArrayList;
import p033.C1219;
import p345.AbstractC3980;
import p345.C3932;
import p345.C3949;
import p345.C3958;
import p345.C3961;
import p345.C3965;
import p345.C3978;
import p383.AbstractC4464;
import p397.C4598;

/* renamed from: ˆʼ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1757 implements InterfaceC1758 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C3978 f6812;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f6813 = new ArrayList();

    static {
        C3965 c3965 = C3965.f15337;
        C1219 c1219 = new C1219(6);
        c3965.getClass();
        C3949 c3949 = new C3949(c1219, c3965);
        C3958 c3958 = C3958.f15329;
        C1219 c12192 = new C1219(7);
        c3958.getClass();
        f6812 = new C3978(c3949, new C3949(c12192, c3958));
    }

    @Override // p093.InterfaceC1758
    public final void clear() {
        this.f6813.clear();
    }

    @Override // p093.InterfaceC1758
    /* renamed from: ʽᐧ */
    public final long mo4163(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f6813;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((C4598) arrayList.get(i)).f17598;
            long j3 = ((C4598) arrayList.get(i)).f17601;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // p093.InterfaceC1758
    /* renamed from: ʿʼ */
    public final void mo4164(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6813;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((C4598) arrayList.get(i)).f17598;
            if (j > j2 && j > ((C4598) arrayList.get(i)).f17601) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // p093.InterfaceC1758
    /* renamed from: ˑʽ */
    public final boolean mo4169(C4598 c4598, long j) {
        long j2 = c4598.f17598;
        AbstractC4464.m10142(j2 != -9223372036854775807L);
        AbstractC4464.m10142(c4598.f17599 != -9223372036854775807L);
        boolean z = j2 <= j && j < c4598.f17601;
        ArrayList arrayList = this.f6813;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C4598) arrayList.get(size)).f17598) {
                arrayList.add(size + 1, c4598);
                return z;
            }
        }
        arrayList.add(0, c4598);
        return z;
    }

    @Override // p093.InterfaceC1758
    /* renamed from: ـﹶ */
    public final AbstractC3980 mo4170(long j) {
        ArrayList arrayList = this.f6813;
        if (!arrayList.isEmpty()) {
            if (j >= ((C4598) arrayList.get(0)).f17598) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    C4598 c4598 = (C4598) arrayList.get(i);
                    if (j >= c4598.f17598 && j < c4598.f17601) {
                        arrayList2.add(c4598);
                    }
                    if (j < c4598.f17598) {
                        break;
                    }
                }
                C3932 c3932M9208 = AbstractC3980.m9208(f6812, arrayList2);
                C3961 c3961M9205 = AbstractC3980.m9205();
                for (int i2 = 0; i2 < c3932M9208.size(); i2++) {
                    c3961M9205.m9171(((C4598) c3932M9208.get(i2)).f17600);
                }
                return c3961M9205.m9167();
            }
        }
        return AbstractC3980.m9204();
    }

    @Override // p093.InterfaceC1758
    /* renamed from: ﹳﹳ */
    public final long mo4173(long j) {
        ArrayList arrayList = this.f6813;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((C4598) arrayList.get(0)).f17598) {
            return -9223372036854775807L;
        }
        long jMax = ((C4598) arrayList.get(0)).f17598;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((C4598) arrayList.get(i)).f17598;
            long j3 = ((C4598) arrayList.get(i)).f17601;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }
}
