package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class e implements j$.time.temporal.p, Comparable, Serializable {
    public static final e c = new e(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;
    private final long a;
    private final int b;

    static {
        BigInteger.valueOf(1000000000L);
    }

    private e(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static e A(long j, long j2) {
        return p(j$.com.android.tools.r8.a.j(j, j$.com.android.tools.r8.a.o(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.n(j2, 1000000000L));
    }

    private static e p(long j, int i) {
        return (((long) i) | j) == 0 ? c : new e(j, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static e s(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return p(j2, i);
    }

    public static e v(long j) {
        return p(j, 0);
    }

    private Object writeReplace() {
        return new t((byte) 1, this);
    }

    public final long C() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.p(j2, 1000000000L), j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        int iCompare = Long.compare(this.a, eVar.a);
        return iCompare != 0 ? iCompare : this.b - eVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.p
    public final Temporal n(Temporal temporal) {
        long j = this.a;
        if (j != 0) {
            temporal = temporal.e(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? temporal.e(i, ChronoUnit.NANOS) : temporal;
    }

    public final long r() {
        return this.a;
    }

    public final String toString() {
        if (this == c) {
            return "PT0S";
        }
        long j = this.a;
        int i = this.b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0 || i3 != 0) {
            sb.append(i3);
        } else {
            sb.append("-0");
        }
        if (i > 0) {
            int length = sb.length();
            if (j < 0) {
                sb.append(2000000000 - i);
            } else {
                sb.append(i + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.a);
        objectOutput.writeInt(this.b);
    }
}
