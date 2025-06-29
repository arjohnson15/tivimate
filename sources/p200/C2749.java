package p200;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p070.AbstractC1549;

/* renamed from: ˎٴ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2749 implements Iterator, Map.Entry {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f10748 = -1;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f10749;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C2741 f10750;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f10751;

    public C2749(C2741 c2741) {
        this.f10750 = c2741;
        this.f10751 = c2741.f10778 - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f10749) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f10748;
        C2741 c2741 = this.f10750;
        return AbstractC1549.m5138(key, c2741.m7021(i)) && AbstractC1549.m5138(entry.getValue(), c2741.m7016(this.f10748));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f10749) {
            return this.f10750.m7021(this.f10748);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f10749) {
            return this.f10750.m7016(this.f10748);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10748 < this.f10751;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f10749) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f10748;
        C2741 c2741 = this.f10750;
        Object objM7021 = c2741.m7021(i);
        Object objM7016 = c2741.m7016(this.f10748);
        return (objM7021 == null ? 0 : objM7021.hashCode()) ^ (objM7016 != null ? objM7016.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f10748++;
        this.f10749 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f10749) {
            throw new IllegalStateException();
        }
        this.f10750.mo7022(this.f10748);
        this.f10748--;
        this.f10751--;
        this.f10749 = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f10749) {
            return this.f10750.mo7015(this.f10748, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
