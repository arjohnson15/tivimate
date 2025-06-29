package j$.util.function;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BinaryOperator, Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return j$.com.android.tools.r8.a.a(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.c(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (((Comparator) this.b).compare(obj, obj2) < 0) {
                    break;
                }
                break;
            default:
                if (((Comparator) this.b).compare(obj, obj2) > 0) {
                    break;
                }
                break;
        }
        return obj2;
    }

    public Predicate negate() {
        return new a(2, this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return j$.com.android.tools.r8.a.h(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }
}
