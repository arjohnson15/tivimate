package p345;

import j$.util.Objects;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵎᴵ.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3920 extends AbstractC3980 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final transient int f15233;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final transient Object[] f15234;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient int f15235;

    public C3920(Object[] objArr, int i, int i2) {
        this.f15234 = objArr;
        this.f15235 = i;
        this.f15233 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ـﹶ.ᐧʻ(i, this.f15233);
        Object obj = this.f15234[(i * 2) + this.f15235];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15233;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean mo9116() {
        return true;
    }
}
