package p345;

import j$.util.Objects;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵎᴵ.ˉᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3932 extends AbstractC3980 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final C3932 f15274 = new C3932(0, new Object[0]);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final transient Object[] f15275;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient int f15276;

    public C3932(int i, Object[] objArr) {
        this.f15275 = objArr;
        this.f15276 = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ـﹶ.ᐧʻ(i, this.f15276);
        Object obj = this.f15275[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15276;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˉי */
    public final int mo9117() {
        return 0;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˉⁱ */
    public final boolean mo9116() {
        return false;
    }

    @Override // p345.AbstractC3980, p345.AbstractC3927
    /* renamed from: ٴˎ */
    public final int mo9119(int i, Object[] objArr) {
        Object[] objArr2 = this.f15275;
        int i2 = this.f15276;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ᐧʻ */
    public final Object[] mo9120() {
        return this.f15275;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ﹶˆ */
    public final int mo9122() {
        return this.f15276;
    }
}
