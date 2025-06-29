package p345;

/* renamed from: ᵎᴵ.יˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3953 extends AbstractC3985 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final transient C3920 f15316;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient C3930 f15317;

    public C3953(C3930 c3930, C3920 c3920) {
        this.f15317 = c3930;
        this.f15316 = c3920;
    }

    @Override // p345.AbstractC3927, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15317.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15317.f15272;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˉⁱ */
    public final boolean mo9116() {
        return true;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˏᴵ */
    public final AbstractC3986 iterator() {
        return this.f15316.listIterator(0);
    }

    @Override // p345.AbstractC3927
    /* renamed from: ٴˎ */
    public final int mo9119(int i, Object[] objArr) {
        return this.f15316.mo9119(i, objArr);
    }

    @Override // p345.AbstractC3985, p345.AbstractC3927
    /* renamed from: ﹳﹳ */
    public final AbstractC3980 mo9136() {
        return this.f15316;
    }
}
