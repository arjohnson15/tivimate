package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.ʽˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0011 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f354;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Iterator f355;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C0034 f356;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f357 = -1;

    public C0011(C0034 c0034) {
        this.f356 = c0034;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f357 + 1;
        C0034 c0034 = this.f356;
        if (i >= c0034.f404.size()) {
            return !c0034.f406.isEmpty() && m232().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f354 = true;
        int i = this.f357 + 1;
        this.f357 = i;
        C0034 c0034 = this.f356;
        return i < c0034.f404.size() ? (Map.Entry) c0034.f404.get(this.f357) : (Map.Entry) m232().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f354) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f354 = false;
        int i = C0034.f403;
        C0034 c0034 = this.f356;
        c0034.m346();
        if (this.f357 >= c0034.f404.size()) {
            m232().remove();
            return;
        }
        int i2 = this.f357;
        this.f357 = i2 - 1;
        c0034.m348(i2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Iterator m232() {
        if (this.f355 == null) {
            this.f355 = this.f356.f406.entrySet().iterator();
        }
        return this.f355;
    }
}
