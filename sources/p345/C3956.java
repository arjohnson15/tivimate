package p345;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ᵎᴵ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3956 implements Iterator {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C3934 f15324;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Iterator f15327;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f15323 = null;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Collection f15325 = null;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Iterator f15326 = EnumC3951.f15312;

    public C3956(C3934 c3934) {
        this.f15324 = c3934;
        this.f15327 = c3934.f15284.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15327.hasNext() || this.f15326.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f15326.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f15327.next();
            this.f15323 = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f15325 = collection;
            this.f15326 = collection.iterator();
        }
        return this.f15326.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f15326.remove();
        Collection collection = this.f15325;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f15327.remove();
        }
        C3934 c3934 = this.f15324;
        c3934.f15283--;
    }
}
