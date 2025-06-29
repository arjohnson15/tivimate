package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC5402g;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    private final long a;
    private final LocalDateTime b;
    private final ZoneOffset c;
    private final ZoneOffset d;

    b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.a = j;
        this.b = LocalDateTime.b0(j, 0, zoneOffset);
        this.c = zoneOffset;
        this.d = zoneOffset2;
    }

    b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.a = AbstractC5402g.n(localDateTime, zoneOffset);
        this.b = localDateTime;
        this.c = zoneOffset;
        this.d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    final List A() {
        return C() ? Collections.emptyList() : j$.com.android.tools.r8.a.l(new Object[]{this.c, this.d});
    }

    public final boolean C() {
        return this.d.a0() > this.c.a0();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((b) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.c.equals(bVar.c) && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ this.c.hashCode()) ^ Integer.rotateLeft(this.d.hashCode(), 16);
    }

    public final LocalDateTime n() {
        return this.b.plusSeconds(this.d.a0() - this.c.a0());
    }

    public final LocalDateTime p() {
        return this.b;
    }

    public final j$.time.e r() {
        return j$.time.e.v(this.d.a0() - this.c.a0());
    }

    public final ZoneOffset s() {
        return this.d;
    }

    public final long toEpochSecond() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(C() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.b);
        sb.append(this.c);
        sb.append(" to ");
        sb.append(this.d);
        sb.append(']');
        return sb.toString();
    }

    public final ZoneOffset v() {
        return this.c;
    }

    final void writeExternal(ObjectOutput objectOutput) {
        a.c(this.a, objectOutput);
        a.d(this.c, objectOutput);
        a.d(this.d, objectOutput);
    }
}
