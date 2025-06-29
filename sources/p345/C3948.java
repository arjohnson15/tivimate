package p345;

/* renamed from: ᵎᴵ.ˑʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3948 extends AbstractC3985 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient Object f15306;

    public C3948(Object obj) {
        obj.getClass();
        this.f15306 = obj;
    }

    @Override // p345.AbstractC3927, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15306.equals(obj);
    }

    @Override // p345.AbstractC3985, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15306.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f15306.toString() + ']';
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˉⁱ */
    public final boolean mo9116() {
        return false;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˏᴵ */
    public final AbstractC3986 iterator() {
        C3950 c3950 = new C3950();
        c3950.f15310 = this.f15306;
        return c3950;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ٴˎ */
    public final int mo9119(int i, Object[] objArr) {
        objArr[i] = this.f15306;
        return i + 1;
    }

    @Override // p345.AbstractC3985, p345.AbstractC3927
    /* renamed from: ﹳﹳ */
    public final AbstractC3980 mo9136() {
        return AbstractC3980.m9207(this.f15306);
    }
}
