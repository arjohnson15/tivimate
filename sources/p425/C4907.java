package p425;

import j$.util.AbstractC5414b;
import j$.util.Comparator;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: ﹶʿ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4907 implements Comparator, j$.util.Comparator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C4907 f18570 = new C4907(0);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C4907 f18571 = new C4907(1);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f18572;

    public /* synthetic */ C4907(int i) {
        this.f18572 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f18572) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((Comparable) obj2).compareTo((Comparable) obj);
        }
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator reversed() {
        switch (this.f18572) {
            case 0:
                return f18571;
            default:
                return f18570;
        }
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        int i = this.f18572;
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        int i = this.f18572;
        return Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        int i = this.f18572;
        return AbstractC5414b.z(this, Comparator.CC.comparing(function, comparator));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        int i = this.f18572;
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        int i = this.f18572;
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        int i = this.f18572;
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }
}
