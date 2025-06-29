package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.r;
import j$.time.k;
import j$.time.m;
import j$.time.temporal.n;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final m a;
    private final byte b;
    private final DayOfWeek c;
    private final k d;
    private final boolean e;
    private final d f;
    private final ZoneOffset g;
    private final ZoneOffset h;
    private final ZoneOffset i;

    e(m mVar, int i, DayOfWeek dayOfWeek, k kVar, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = mVar;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = kVar;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    static e b(ObjectInput objectInput) {
        int i = objectInput.readInt();
        m mVarV = m.V(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        DayOfWeek dayOfWeekOf = i3 == 0 ? null : DayOfWeek.of(i3);
        int i4 = (507904 & i) >>> 14;
        d dVar = d.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        k kVarD0 = i4 == 31 ? k.d0(objectInput.readInt()) : k.a0(i4 % 24);
        ZoneOffset zoneOffsetD0 = ZoneOffset.d0(i5 == 255 ? objectInput.readInt() : (i5 - 128) * 900);
        ZoneOffset zoneOffsetD02 = i6 == 3 ? ZoneOffset.d0(objectInput.readInt()) : ZoneOffset.d0((i6 * 1800) + zoneOffsetD0.a0());
        ZoneOffset zoneOffsetD03 = i7 == 3 ? ZoneOffset.d0(objectInput.readInt()) : ZoneOffset.d0((i7 * 1800) + zoneOffsetD0.a0());
        boolean z = i4 == 24;
        Objects.requireNonNull(mVarV, "month");
        Objects.requireNonNull(kVarD0, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(zoneOffsetD0, "standardOffset");
        Objects.requireNonNull(zoneOffsetD02, "offsetBefore");
        Objects.requireNonNull(zoneOffsetD03, "offsetAfter");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !kVarD0.equals(k.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (kVarD0.Y() == 0) {
            return new e(mVarV, i2, dayOfWeekOf, kVarD0, z, dVar, zoneOffsetD0, zoneOffsetD02, zoneOffsetD03);
        }
        throw new IllegalArgumentException("Time's nano-of-second must be zero");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final b a(int i) {
        LocalDate localDateF0;
        DayOfWeek dayOfWeek = this.c;
        m mVar = this.a;
        byte b = this.b;
        if (b < 0) {
            localDateF0 = LocalDate.f0(i, mVar, mVar.T(r.d.Q(i)) + 1 + b);
            if (dayOfWeek != null) {
                localDateF0 = localDateF0.k(new n(dayOfWeek.getValue(), 1));
            }
        } else {
            localDateF0 = LocalDate.f0(i, mVar, b);
            if (dayOfWeek != null) {
                localDateF0 = localDateF0.k(new n(dayOfWeek.getValue(), 0));
            }
        }
        if (this.e) {
            localDateF0 = localDateF0.plusDays(1L);
        }
        LocalDateTime localDateTimeA0 = LocalDateTime.a0(localDateF0, this.d);
        d dVar = this.f;
        dVar.getClass();
        int i2 = c.a[dVar.ordinal()];
        ZoneOffset zoneOffset = this.h;
        if (i2 == 1) {
            localDateTimeA0 = localDateTimeA0.plusSeconds(zoneOffset.a0() - ZoneOffset.UTC.a0());
        } else if (i2 == 2) {
            localDateTimeA0 = localDateTimeA0.plusSeconds(zoneOffset.a0() - this.g.a0());
        }
        return new b(localDateTimeA0, zoneOffset, this.i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i);
    }

    public final int hashCode() {
        int iL0 = ((this.d.l0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        return ((this.g.hashCode() ^ (this.f.ordinal() + (iL0 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.h;
        ZoneOffset zoneOffset2 = this.i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        m mVar = this.a;
        byte b = this.b;
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek == null) {
            sb.append(mVar.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(mVar.name());
        } else if (b < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(mVar.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(mVar.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        k kVar = this.d;
        boolean z = this.e;
        int iL0 = z ? 86400 : kVar.l0();
        int iA0 = this.g.a0();
        ZoneOffset zoneOffset = this.h;
        int iA02 = zoneOffset.a0() - iA0;
        ZoneOffset zoneOffset2 = this.i;
        int iA03 = zoneOffset2.a0() - iA0;
        int iW = iL0 % 3600 == 0 ? z ? 24 : kVar.W() : 31;
        int i = iA0 % 900 == 0 ? (iA0 / 900) + 128 : 255;
        int i2 = (iA02 == 0 || iA02 == 1800 || iA02 == 3600) ? iA02 / 1800 : 3;
        int i3 = (iA03 == 0 || iA03 == 1800 || iA03 == 3600) ? iA03 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (iW << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (iW == 31) {
            objectOutput.writeInt(iL0);
        }
        if (i == 255) {
            objectOutput.writeInt(iA0);
        }
        if (i2 == 3) {
            objectOutput.writeInt(zoneOffset.a0());
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset2.a0());
        }
    }
}
