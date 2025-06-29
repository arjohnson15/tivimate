package j$.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements BiConsumer, BiFunction, Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ s(BiFunction biFunction, Function function) {
        this.a = 2;
        this.c = biFunction;
        this.b = function;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        ((Consumer) this.b).accept(obj);
        ((Consumer) this.c).accept(obj);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((BiConsumer) this.b).accept(obj, obj2);
                ((BiConsumer) this.c).accept(obj, obj2);
                return;
        }
        do {
            Object objApply = ((BiFunction) this.c).apply(obj, obj2);
            ConcurrentMap concurrentMap = (ConcurrentMap) this.b;
            if (concurrentMap.replace(obj, obj2, objApply)) {
                return;
            } else {
                obj2 = concurrentMap.get(obj);
            }
        } while (obj2 != null);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.com.android.tools.r8.a.c(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.b).apply(((BiFunction) this.c).apply(obj, obj2));
    }
}
