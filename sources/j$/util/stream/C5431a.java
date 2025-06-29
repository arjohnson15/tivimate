package j$.util.stream;

import j$.util.C5418f;
import j$.util.Spliterator;
import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5431a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C5431a(int i) {
        this.a = i;
    }

    public /* synthetic */ C5431a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void p(Object obj) {
        switch (this.a) {
            case 1:
                ((InterfaceC5509p2) this.b).p((InterfaceC5509p2) obj);
                break;
            default:
                ((ArrayList) this.b).add(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object objApply = ((DoubleFunction) this.b).apply(d);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof F) {
            return E.k((F) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return D.k((DoubleStream) objApply);
        }
        C5418f.a("java.util.stream.DoubleStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC5497n0) {
            return C5492m0.k((InterfaceC5497n0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C5487l0.k((LongStream) objApply);
        }
        C5418f.a("java.util.stream.LongStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return C5435a3.k((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof F) {
            return E.k((F) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return D.k((DoubleStream) objApply);
        }
        if (objApply instanceof InterfaceC5497n0) {
            return C5492m0.k((InterfaceC5497n0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C5487l0.k((LongStream) objApply);
        }
        C5418f.a("java.util.stream.*Stream", objApply.getClass());
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 0:
                return ((AbstractC5436b) this.b).M();
            default:
                return (Spliterator) this.b;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 2:
                C5505o3 c5505o3 = (C5505o3) this.b;
                return c5505o3.d.tryAdvance(c5505o3.e);
            case 3:
                C5515q3 c5515q3 = (C5515q3) this.b;
                return c5515q3.d.tryAdvance(c5515q3.e);
            case 4:
                C5524s3 c5524s3 = (C5524s3) this.b;
                return c5524s3.d.tryAdvance(c5524s3.e);
            default:
                H3 h3 = (H3) this.b;
                return h3.d.tryAdvance(h3.e);
        }
    }
}
