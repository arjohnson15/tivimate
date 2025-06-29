package j$.util.stream;

import j$.util.C5563w;
import j$.util.C5564x;
import j$.util.C5566z;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import p334.C3789;

/* renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5511q implements BiConsumer, ObjDoubleConsumer, Supplier, LongFunction, BinaryOperator, IntFunction, DoubleBinaryOperator, DoubleFunction, ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ C5511q(int i) {
        this.a = i;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        switch (this.a) {
            case 1:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                AbstractC5486l.a(dArr, d);
                dArr[3] = dArr[3] + d;
                break;
            case 2:
            default:
                ((C5563w) obj).accept(d);
                break;
            case 3:
                double[] dArr2 = (double[]) obj;
                AbstractC5486l.a(dArr2, d);
                dArr2[2] = dArr2[2] + d;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC5486l.a(dArr, dArr2[0]);
                AbstractC5486l.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 2:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC5486l.a(dArr3, dArr4[0]);
                AbstractC5486l.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 20:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 21:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            default:
                ((C5563w) obj).b((C5563w) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                break;
            case 2:
                break;
            case 20:
                break;
            case 21:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.c(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 15:
                return new Object[i];
            default:
                return new Double[i];
        }
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 8:
                return AbstractC5551y0.J(j);
            case 9:
            default:
                return AbstractC5551y0.U(j);
            case 10:
                return AbstractC5551y0.S(j);
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 9:
                return new S0((E0) obj, (E0) obj2);
            case 10:
            case 12:
            default:
                return new W0((K0) obj, (K0) obj2);
            case 11:
                return new T0((G0) obj, (G0) obj2);
            case 13:
                return new U0((I0) obj, (I0) obj2);
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case 22:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 4:
                return new H();
            case 5:
                return new I();
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new J();
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return new K();
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                return new double[4];
            case 16:
                return new C5563w();
            case 17:
                return new C5564x();
            case 18:
                return new C5566z();
            case 19:
                return new LinkedHashSet();
        }
    }
}
