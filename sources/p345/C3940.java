package p345;

import java.io.Serializable;

/* renamed from: ᵎᴵ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3940 extends AbstractC3937 implements Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f15291;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f15292;

    public C3940(Object obj, Object obj2) {
        this.f15292 = obj;
        this.f15291 = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15292;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15291;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
