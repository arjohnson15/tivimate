package p345;

import j$.util.Objects;
import java.util.AbstractMap;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵎᴵ.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3975 extends AbstractC3980 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C3939 f15350;

    public C3975(C3939 c3939) {
        this.f15350 = c3939;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C3939 c3939 = this.f15350;
        ـﹶ.ᐧʻ(i, c3939.f15290);
        int i2 = i * 2;
        Object[] objArr = c3939.f15288;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15350.f15290;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˉⁱ */
    public final boolean mo9116() {
        return true;
    }
}
