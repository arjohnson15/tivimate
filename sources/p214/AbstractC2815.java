package p214;

import java.io.EOFException;
import java.rmi.UnmarshalException;
import java.util.Arrays;
import p352.EnumC4008;
import p352.InterfaceC4007;
import p456.C5349;

/* renamed from: ˏˉ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2815 implements InterfaceC4007 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C2816[] f10955;

    /* JADX INFO: Thrown type has an unknown type hierarchy: java.rmi.UnmarshalException */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m7095(C5349 c5349) throws UnmarshalException {
        long jM12093 = c5349.m12093();
        if (jM12093 <= 2147483647L) {
            return (int) jM12093;
        }
        throw new UnmarshalException(String.format("%s %d > %d", "EntriesRead", Long.valueOf(jM12093), Integer.MAX_VALUE));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC2815) {
            return Arrays.equals(this.f10955, ((AbstractC2815) obj).f10955);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10955);
    }

    @Override // p352.InterfaceC4007
    /* renamed from: ʽᐧ */
    public final void mo7065(C5349 c5349) {
    }

    @Override // p352.InterfaceC4007
    /* renamed from: ˑʽ */
    public final void mo7066(C5349 c5349) throws EOFException {
        C2816[] c2816Arr;
        if (this.f10955 != null) {
            c5349.m12092(EnumC4008.FOUR);
            c5349.m12098(4);
            int i = 0;
            while (true) {
                c2816Arr = this.f10955;
                if (i >= c2816Arr.length) {
                    break;
                }
                c2816Arr[i] = new C2816();
                i++;
            }
            for (C2816 c2816 : c2816Arr) {
                c2816.mo7067(c5349);
            }
            for (C2816 c28162 : this.f10955) {
                c28162.mo7066(c5349);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: java.rmi.UnmarshalException */
    @Override // p352.InterfaceC4007
    /* renamed from: ـﹶ */
    public final void mo7067(C5349 c5349) throws UnmarshalException {
        c5349.m12092(EnumC4008.FOUR);
        int iM7095 = m7095(c5349);
        if (c5349.m12094() == 0) {
            this.f10955 = null;
        } else {
            if (iM7095 < 0) {
                throw new UnmarshalException(String.format("Expected entriesRead >= 0, got: %d", Integer.valueOf(iM7095)));
            }
            this.f10955 = mo7096(iM7095);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract C2816[] mo7096(int i);
}
