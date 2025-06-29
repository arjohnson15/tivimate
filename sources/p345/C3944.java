package p345;

import java.util.List;
import java.util.ListIterator;

/* renamed from: ᵎᴵ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3944 extends C3947 implements ListIterator {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C3933 f15301;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3944(C3933 c3933) {
        super(c3933);
        this.f15301 = c3933;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3944(C3933 c3933, int i) {
        super(c3933, ((List) c3933.f15277).listIterator(i));
        this.f15301 = c3933;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C3933 c3933 = this.f15301;
        boolean zIsEmpty = c3933.isEmpty();
        m9153().add(obj);
        c3933.f15282.f15283++;
        if (zIsEmpty) {
            c3933.m9147();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m9153().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m9153().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m9153().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m9153().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m9153().set(obj);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ListIterator m9153() {
        m9154();
        return (ListIterator) this.f15302;
    }
}
