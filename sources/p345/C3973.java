package p345;

import java.util.Iterator;
import java.util.ListIterator;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵎᴵ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3973 extends AbstractC3980 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3980 f15345;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final transient int f15346;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient int f15347;

    public C3973(AbstractC3980 abstractC3980, int i, int i2) {
        this.f15345 = abstractC3980;
        this.f15346 = i;
        this.f15347 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ـﹶ.ᐧʻ(i, this.f15347);
        return this.f15345.get(i + this.f15346);
    }

    @Override // p345.AbstractC3980, p345.AbstractC3927, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p345.AbstractC3980, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p345.AbstractC3980, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15347;
    }

    @Override // p345.AbstractC3980, java.util.List
    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final AbstractC3980 subList(int i, int i2) {
        ـﹶ.ˉי(i, i2, this.f15347);
        int i3 = this.f15346;
        return this.f15345.subList(i + i3, i2 + i3);
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˉי */
    public final int mo9117() {
        return this.f15345.mo9117() + this.f15346;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˉⁱ */
    public final boolean mo9116() {
        return true;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ᐧʻ */
    public final Object[] mo9120() {
        return this.f15345.mo9120();
    }

    @Override // p345.AbstractC3927
    /* renamed from: ﹶˆ */
    public final int mo9122() {
        return this.f15345.mo9117() + this.f15346 + this.f15347;
    }
}
