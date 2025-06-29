package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC5402g;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class f implements Serializable {
    private static final long[] i = new long[0];
    private static final e[] j = new e[0];
    private static final LocalDateTime[] k = new LocalDateTime[0];
    private static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    private final long[] a;
    private final ZoneOffset[] b;
    private final long[] c;
    private final LocalDateTime[] d;
    private final ZoneOffset[] e;
    private final e[] f;
    private final TimeZone g;
    private final transient ConcurrentHashMap h = new ConcurrentHashMap();

    private f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {j(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    private f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                if (bVar.C()) {
                    arrayList.add(bVar.p());
                    arrayList.add(bVar.n());
                } else {
                    arrayList.add(bVar.n());
                    arrayList.add(bVar.p());
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTimeP = bVar.p();
        return bVar.C() ? localDateTime.X(localDateTimeP) ? bVar.v() : localDateTime.X(bVar.n()) ? bVar : bVar.s() : !localDateTime.X(localDateTimeP) ? bVar.s() : localDateTime.X(bVar.n()) ? bVar.v() : bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b[] b(int i2) {
        long j2;
        Integer numValueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.h;
        b[] bVarArr = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.g;
        if (timeZone == null) {
            e[] eVarArr = this.f;
            b[] bVarArr2 = new b[eVarArr.length];
            for (int i3 = 0; i3 < eVarArr.length; i3++) {
                bVarArr2[i3] = eVarArr[i3].a(i2);
            }
            if (i2 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr2);
            }
            return bVarArr2;
        }
        b[] bVarArr3 = l;
        if (i2 < 1800) {
            return bVarArr3;
        }
        long jN = AbstractC5402g.n(LocalDateTime.Y(i2 - 1), this.b[0]);
        int offset = timeZone.getOffset(jN * 1000);
        long j3 = 31968000 + jN;
        while (jN < j3) {
            long j4 = 7776000 + jN;
            long j5 = jN;
            if (offset != timeZone.getOffset(j4 * 1000)) {
                jN = j5;
                while (j4 - jN > 1) {
                    int i4 = offset;
                    long j6 = j3;
                    long jO = j$.com.android.tools.r8.a.o(j4 + jN, 2L);
                    if (timeZone.getOffset(jO * 1000) == i4) {
                        jN = jO;
                    } else {
                        j4 = jO;
                    }
                    offset = i4;
                    j3 = j6;
                }
                j2 = j3;
                int i5 = offset;
                if (timeZone.getOffset(jN * 1000) == i5) {
                    jN = j4;
                }
                ZoneOffset zoneOffsetJ = j(i5);
                offset = timeZone.getOffset(jN * 1000);
                ZoneOffset zoneOffsetJ2 = j(offset);
                if (c(jN, zoneOffsetJ2) == i2) {
                    bVarArr3 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                    bVarArr3[bVarArr3.length - 1] = new b(jN, zoneOffsetJ, zoneOffsetJ2);
                }
            } else {
                j2 = j3;
                jN = j4;
            }
            j3 = j2;
        }
        if (1916 <= i2 && i2 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.g0(j$.com.android.tools.r8.a.o(j2 + zoneOffset.a0(), 86400)).getYear();
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArrB = b(localDateTime.getYear());
            if (bVarArrB.length == 0) {
                return j(timeZone.getOffset(AbstractC5402g.n(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i2 < length) {
                b bVar = bVarArrB[i2];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.v())) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f.length;
        LocalDateTime[] localDateTimeArr = this.d;
        if (length2 > 0 && localDateTime.W(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] bVarArrB2 = b(localDateTime.getYear());
            int length3 = bVarArrB2.length;
            while (i2 < length3) {
                b bVar2 = bVarArrB2[i2];
                Object objA2 = a(localDateTime, bVar2);
                if ((objA2 instanceof b) || objA2.equals(bVar2.v())) {
                    return objA2;
                }
                i2++;
                obj = objA2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i3 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i3])) {
                iBinarySearch = i3;
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return zoneOffsetArr2[(iBinarySearch / 2) + 1];
        }
        LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
        int i4 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i4];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i4 + 1];
        return zoneOffset2.a0() > zoneOffset.a0() ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
    }

    public static f i(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new f(zoneOffset);
    }

    private static ZoneOffset j(int i2) {
        return ZoneOffset.d0(i2 / 1000);
    }

    static f k(ObjectInput objectInput) throws IOException {
        int i2 = objectInput.readInt();
        long[] jArr = i;
        long[] jArr2 = i2 == 0 ? jArr : new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr2[i3] = a.a(objectInput);
        }
        int i4 = i2 + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            zoneOffsetArr[i5] = a.b(objectInput);
        }
        int i6 = objectInput.readInt();
        if (i6 != 0) {
            jArr = new long[i6];
        }
        long[] jArr3 = jArr;
        for (int i7 = 0; i7 < i6; i7++) {
            jArr3[i7] = a.a(objectInput);
        }
        int i8 = i6 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            zoneOffsetArr2[i9] = a.b(objectInput);
        }
        int i10 = objectInput.readByte();
        e[] eVarArr = i10 == 0 ? j : new e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            eVarArr[i11] = e.b(objectInput);
        }
        return new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return j(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long jU = instant.U();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length <= 0 || jU <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, jU);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return zoneOffsetArr[iBinarySearch + 1];
        }
        b[] bVarArrB = b(c(jU, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i2 = 0; i2 < bVarArrB.length; i2++) {
            bVar = bVarArrB[i2];
            if (jU < bVar.toEpochSecond()) {
                return bVar.v();
            }
        }
        return bVar.s();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.g, fVar.g) && Arrays.equals(this.a, fVar.a) && Arrays.equals(this.b, fVar.b) && Arrays.equals(this.c, fVar.c) && Arrays.equals(this.e, fVar.e) && Arrays.equals(this.f, fVar.f);
    }

    public final b f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return (b) objE;
        }
        return null;
    }

    public final List g(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        return objE instanceof b ? ((b) objE).A() : Collections.singletonList((ZoneOffset) objE);
    }

    public final boolean h(Instant instant) {
        ZoneOffset zoneOffsetJ;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetJ = j(timeZone.getRawOffset());
        } else {
            int length = this.c.length;
            ZoneOffset[] zoneOffsetArr = this.b;
            if (length == 0) {
                zoneOffsetJ = zoneOffsetArr[0];
            } else {
                int iBinarySearch = Arrays.binarySearch(this.a, instant.U());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetJ = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetJ.equals(d(instant));
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    final void l(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.g.getID());
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.b[r1.length - 1] + "]";
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        long[] jArr = this.a;
        objectOutput.writeInt(jArr.length);
        for (long j2 : jArr) {
            a.c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset : this.b) {
            a.d(zoneOffset, objectOutput);
        }
        long[] jArr2 = this.c;
        objectOutput.writeInt(jArr2.length);
        for (long j3 : jArr2) {
            a.c(j3, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : this.e) {
            a.d(zoneOffset2, objectOutput);
        }
        e[] eVarArr = this.f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }
}
