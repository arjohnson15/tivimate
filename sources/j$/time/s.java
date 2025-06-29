package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class s implements j$.time.temporal.p, Serializable {
    public static final s d = new s(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    private final int a;
    private final int b;
    private final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.l(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    private s(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static s b(int i) {
        return i == 0 ? d : new s(0, 0, i);
    }

    static s c(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        int i2 = objectInput.readInt();
        int i3 = objectInput.readInt();
        return ((i | i2) | i3) == 0 ? d : new s(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 14, this);
    }

    public final int a() {
        return this.c;
    }

    public final long d() {
        return (this.a * 12) + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && this.b == sVar.b && this.c == sVar.c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.p
    public final Temporal n(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        j$.time.chrono.k kVar = (j$.time.chrono.k) temporal.A(j$.time.temporal.l.e());
        if (kVar != null && !j$.time.chrono.r.d.equals(kVar)) {
            throw new c("Chronology mismatch, expected: ISO, actual: " + kVar.m());
        }
        if (this.b == 0) {
            int i = this.a;
            if (i != 0) {
                temporal = temporal.e(i, ChronoUnit.YEARS);
            }
        } else {
            long jD = d();
            if (jD != 0) {
                temporal = temporal.e(jD, ChronoUnit.MONTHS);
            }
        }
        int i2 = this.c;
        return i2 != 0 ? temporal.e(i2, ChronoUnit.DAYS) : temporal;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.a);
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
    }
}
