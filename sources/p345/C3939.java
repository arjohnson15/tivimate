package p345;

import java.util.Map;

/* renamed from: ᵎᴵ.ˎˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3939 extends AbstractC3985 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final transient Object[] f15288;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient C3930 f15289;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final transient int f15290;

    public C3939(C3930 c3930, Object[] objArr, int i) {
        this.f15289 = c3930;
        this.f15288 = objArr;
        this.f15290 = i;
    }

    @Override // p345.AbstractC3927, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f15289.get(key));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15290;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˉⁱ */
    public final boolean mo9116() {
        return true;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˏᴵ */
    public final AbstractC3986 iterator() {
        return mo9136().listIterator(0);
    }

    @Override // p345.AbstractC3927
    /* renamed from: ٴˎ */
    public final int mo9119(int i, Object[] objArr) {
        return mo9136().mo9119(i, objArr);
    }

    @Override // p345.AbstractC3985
    /* renamed from: ﹳˎ */
    public final AbstractC3980 mo9121() {
        return new C3975(this);
    }
}
