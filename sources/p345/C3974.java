package p345;

import java.util.AbstractList;
import java.util.ListIterator;

/* renamed from: ᵎᴵ.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3974 extends AbstractC3976 implements ListIterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f15348;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractList f15349;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3974(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f15348 = i;
        this.f15349 = abstractList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f15351).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f15351).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo9115(((ListIterator) this.f15351).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f15351).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p345.AbstractC3976
    /* renamed from: ـﹶ */
    public final Object mo9115(Object obj) {
        switch (this.f15348) {
            case 0:
                return ((C3942) this.f15349).f15299.apply(obj);
            default:
                return ((C3972) this.f15349).f15343.apply(obj);
        }
    }
}
