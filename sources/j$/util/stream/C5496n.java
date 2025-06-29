package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5496n extends AbstractC5489l2 {
    public final /* synthetic */ int b;
    Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5496n(AbstractC5436b abstractC5436b, InterfaceC5509p2 interfaceC5509p2, int i) {
        super(interfaceC5509p2);
        this.b = i;
        this.c = abstractC5436b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5496n(InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.b = 0;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((HashSet) this.c).contains(obj)) {
                    ((HashSet) this.c).add(obj);
                    this.a.accept((InterfaceC5509p2) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((C5530u) this.c).n).accept(obj);
                this.a.accept((InterfaceC5509p2) obj);
                break;
            case 2:
                if (((Predicate) ((C5530u) this.c).n).test(obj)) {
                    this.a.accept((InterfaceC5509p2) obj);
                    break;
                }
                break;
            case 3:
                this.a.accept((InterfaceC5509p2) ((Function) ((C5530u) this.c).n).apply(obj));
                break;
            case 4:
                this.a.accept(((ToIntFunction) ((X) this.c).n).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((ToLongFunction) ((C5467h0) this.c).n).applyAsLong(obj));
                break;
            default:
                this.a.accept(((ToDoubleFunction) ((C5555z) this.c).n).applyAsDouble(obj));
                break;
        }
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public void k() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public void l(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.l(-1L);
                break;
            case 1:
            default:
                super.l(j);
                break;
            case 2:
                this.a.l(-1L);
                break;
        }
    }
}
