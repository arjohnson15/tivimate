package j$.util.stream;

import j$.util.C5564x;
import j$.util.C5566z;
import j$.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import p334.C3789;

/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5520s implements Supplier, Predicate, IntFunction, ToIntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction, Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ C5520s(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i) {
        switch (this.a) {
            case 10:
                ((C5564x) obj).accept(i);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i;
                break;
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        switch (this.a) {
            case 17:
                ((C5566z) obj).accept(j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 11:
                ((C5564x) obj).b((C5564x) obj2);
                break;
            case 16:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 20:
                ((C5566z) obj).b((C5566z) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.a(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 11:
                break;
            case 16:
                break;
            case 20:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 5:
                return new Object[i];
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new Integer[i];
            case 8:
                return Integer.valueOf(i);
            case 21:
                return new Long[i];
            default:
                return new Object[i];
        }
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 9:
                return Math.min(i, i2);
            case 10:
            case 11:
            default:
                return Math.max(i, i2);
            case 12:
                return i + i2;
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 18:
                return Math.min(j, j2);
            case 26:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 0:
                return new double[3];
            case 14:
                return new long[2];
            default:
                return new long[2];
        }
    }

    public Predicate negate() {
        switch (this.a) {
        }
        return new j$.util.function.a(2, this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.h(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((j$.util.A) obj).c();
            case 2:
                return ((j$.util.B) obj).c();
            case 3:
                return ((j$.util.C) obj).c();
            default:
                return ((Optional) obj).c();
        }
    }
}
