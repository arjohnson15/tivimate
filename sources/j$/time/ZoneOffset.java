package j$.time;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.m, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    private final int b;
    private final transient String c;
    private static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentHashMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = d0(0);
    public static final ZoneOffset f = d0(-64800);
    public static final ZoneOffset g = d0(64800);

    private ZoneOffset(int i) {
        String string;
        this.b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : ":");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.c = string;
    }

    public static ZoneOffset Z(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.A(j$.time.temporal.l.i());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new c("Unable to obtain ZoneOffset from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.ZoneOffset b0(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.requireNonNull(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.ZoneOffset.e
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = e0(r7, r2, r3)
            int r1 = e0(r7, r6, r2)
            int r2 = e0(r7, r5, r2)
            goto L85
        L37:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = e0(r7, r2, r3)
            int r1 = e0(r7, r1, r3)
            int r2 = e0(r7, r4, r3)
            goto L85
        L50:
            int r0 = e0(r7, r2, r3)
            int r1 = e0(r7, r6, r2)
        L58:
            r2 = 0
            goto L85
        L5a:
            int r0 = e0(r7, r2, r3)
            int r1 = e0(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = e0(r7, r2, r3)
            r1 = 0
            goto L58
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = c0(r7, r0, r1)
            return r7
        La8:
            j$.time.ZoneOffset r7 = c0(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.b0(java.lang.String):j$.time.ZoneOffset");
    }

    public static ZoneOffset c0(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new c("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new c("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new c("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) == 18 && (i2 | i3) != 0) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return d0((i2 * 60) + (i * 3600) + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset d0(int i) {
        if (i < -64800 || i > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 != 0) {
            return new ZoneOffset(i);
        }
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = d;
        ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i));
        ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
        e.putIfAbsent(zoneOffset2.c, zoneOffset2);
        return zoneOffset2;
    }

    private static int e0(String str, int i, boolean z) {
        if (z && str.charAt(i - 1) != ':') {
            throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char cCharAt = str.charAt(i);
        char cCharAt2 = str.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    static ZoneOffset f0(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        return b == Byte.MAX_VALUE ? d0(objectInput.readInt()) : d0(b * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 8, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        return (rVar == j$.time.temporal.l.i() || rVar == j$.time.temporal.l.k()) ? this : j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        return temporal.d(this.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f T() {
        return j$.time.zone.f.i(this);
    }

    @Override // j$.time.ZoneId
    final void X(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        g0(objectOutput);
    }

    @Override // java.lang.Comparable
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    public final int a0() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.b == ((ZoneOffset) obj).b;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.s(this);
    }

    final void g0(DataOutput dataOutput) {
        int i = this.b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public final String m() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
        return j$.time.temporal.l.d(this, qVar).a(v(qVar), qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
        return qVar.r(this);
    }
}
