package j$.util.stream;

import j$.util.C5418f;
import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q0 implements LongFunction, IntFunction {
    public IntFunction a;

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        Object objApply = this.a.apply(i);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        C5418f.a("java.util.stream.IntStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return AbstractC5551y0.D(j, this.a);
    }
}
