package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
final class P0 extends R0 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P0(AbstractC5436b abstractC5436b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i) {
        super(abstractC5436b, spliterator, longFunction, binaryOperator);
        this.k = i;
    }

    @Override // j$.util.stream.R0, j$.util.stream.AbstractC5451e
    protected final /* bridge */ /* synthetic */ Object a() {
        switch (this.k) {
        }
        return a();
    }

    @Override // j$.util.stream.R0, j$.util.stream.AbstractC5451e
    protected final AbstractC5451e e(Spliterator spliterator) {
        switch (this.k) {
        }
        return new R0(this, spliterator);
    }
}
