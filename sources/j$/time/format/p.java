package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.AbstractC5402g;
import j$.util.Objects;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class p extends j {
    static final LocalDate g = LocalDate.of(2000, 1, 1);

    p(j$.time.temporal.q qVar) {
        this(qVar, 2, 2, 0);
        if (g == null) {
            long j = 0;
            if (!qVar.n().i(j)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
            if (j + j.f[2] > 2147483647L) {
                throw new j$.time.c("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
    }

    /* synthetic */ p(j$.time.temporal.q qVar, int i) {
        this(qVar, 2, 2, i);
    }

    private p(j$.time.temporal.q qVar, int i, int i2, int i3) {
        super(qVar, i, i2, G.NOT_NEGATIVE, i3);
    }

    @Override // j$.time.format.j
    final long b(z zVar, long j) {
        long jAbs = Math.abs(j);
        LocalDate localDate = g;
        long jP = localDate != null ? AbstractC5402g.p(zVar.d()).q(localDate).p(this.a) : 0;
        long[] jArr = j.f;
        if (j >= jP) {
            long j2 = jArr[this.b];
            if (j < jP + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // j$.time.format.j
    final boolean c(w wVar) {
        if (wVar.l()) {
            return super.c(wVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [j$.time.format.o] */
    @Override // j$.time.format.j
    final int d(final w wVar, final long j, final int i, final int i2) {
        int iP;
        LocalDate localDate = g;
        if (localDate != null) {
            iP = wVar.h().q(localDate).p(this.a);
            wVar.a(new Consumer() { // from class: j$.time.format.o
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.a.d(wVar, j, i, i2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return j$.com.android.tools.r8.a.d(this, consumer);
                }
            });
        } else {
            iP = 0;
        }
        int i3 = i2 - i;
        int i4 = this.b;
        if (i3 == i4 && j >= 0) {
            long j2 = j.f[i4];
            long j3 = iP;
            long j4 = j3 - (j3 % j2);
            j = iP > 0 ? j4 + j : j4 - j;
            if (j < j3) {
                j += j2;
            }
        }
        return wVar.o(this.a, j, i, i2);
    }

    @Override // j$.time.format.j
    final j e() {
        return this.e == -1 ? this : new p(this.a, this.b, this.c, -1);
    }

    @Override // j$.time.format.j
    final j f(int i) {
        int i2 = this.e + i;
        return new p(this.a, this.b, this.c, i2);
    }

    @Override // j$.time.format.j
    public final String toString() {
        Object objRequireNonNull = g;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(0, "defaultObj");
        }
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + objRequireNonNull + ")";
    }
}
