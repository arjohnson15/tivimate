package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5401f implements j$.time.temporal.p, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    private final k a;
    final int b;
    final int c;
    final int d;

    static {
        j$.com.android.tools.r8.a.l(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    C5401f(k kVar, int i, int i2, int i3) {
        Objects.requireNonNull(kVar, "chrono");
        this.a = kVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5401f)) {
            return false;
        }
        C5401f c5401f = (C5401f) obj;
        if (this.b == c5401f.b && this.c == c5401f.c && this.d == c5401f.d) {
            if (((AbstractC5396a) this.a).equals(c5401f.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC5396a) this.a).hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.p
    public final Temporal n(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        k kVar = (k) temporal.A(j$.time.temporal.l.e());
        k kVar2 = this.a;
        if (kVar != null && !((AbstractC5396a) kVar2).equals(kVar)) {
            throw new j$.time.c("Chronology mismatch, expected: " + kVar2.m() + ", actual: " + kVar.m());
        }
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            j$.time.temporal.t tVarK = kVar2.K(j$.time.temporal.a.MONTH_OF_YEAR);
            long jD = (tVarK.g() && tVarK.h()) ? (tVarK.d() - tVarK.e()) + 1 : -1L;
            if (jD > 0) {
                temporal = temporal.e((i * jD) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporal = temporal.e(i, ChronoUnit.YEARS);
                }
                temporal = temporal.e(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporal = temporal.e(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporal.e(i3, ChronoUnit.DAYS) : temporal;
    }

    public final String toString() {
        k kVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return ((AbstractC5396a) kVar).m() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((AbstractC5396a) kVar).m());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.a.m());
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
        objectOutput.writeInt(this.d);
    }

    protected Object writeReplace() {
        return new D((byte) 9, this);
    }
}
