package p206;

import j$.util.Objects;
import java.io.EOFException;
import java.rmi.UnmarshalException;
import p352.EnumC4008;
import p352.InterfaceC4007;
import p405.C4640;
import p456.C5349;
import ˆʽ.ᵎˏ;

/* renamed from: ˎⁱ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2787 implements InterfaceC4007 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f10851;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f10852;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f10853;

    /* JADX INFO: Thrown type has an unknown type hierarchy: java.rmi.UnmarshalException */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m7064(String str, C5349 c5349) throws UnmarshalException {
        long jM12093 = c5349.m12093();
        if (jM12093 <= 2147483647L) {
            return (int) jM12093;
        }
        throw new UnmarshalException(String.format("%s %d > %d", str, Long.valueOf(jM12093), Integer.MAX_VALUE));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2787)) {
            return false;
        }
        AbstractC2787 abstractC2787 = (AbstractC2787) obj;
        abstractC2787.getClass();
        return Objects.equals(this.f10853, abstractC2787.f10853);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.TRUE, this.f10853);
    }

    public final String toString() {
        String str = this.f10853;
        return str == null ? "null" : ᵎˏ.ˑי("\"", str, "\"");
    }

    @Override // p352.InterfaceC4007
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo7065(C5349 c5349) throws EOFException {
        c5349.m12092(EnumC4008.FOUR);
        c5349.m12098(4);
    }

    @Override // p352.InterfaceC4007
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo7066(C5349 c5349) throws EOFException {
        boolean z;
        c5349.m12092(EnumC4008.TWO);
        c5349.m12098(this.f10851 * 2);
        int i = this.f10852;
        if (i > 0) {
            i--;
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append((char) ((C4640) c5349.f20757).readUnsignedShort());
        }
        this.f10853 = sb.toString();
        if (z) {
            c5349.m12098(2);
        }
    }

    @Override // p352.InterfaceC4007
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo7067(C5349 c5349) {
        c5349.m12092(EnumC4008.FOUR);
        this.f10851 = m7064("Offset", c5349);
        this.f10852 = m7064("ActualCount", c5349);
    }
}
