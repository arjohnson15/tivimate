package p218;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p288.C3397;
import p330.C3749;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import p407.InterfaceC4671;
import ˈⁱ.ˉⁱ;

/* renamed from: ˏי.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2830 implements Iterator, InterfaceC3746, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f10981;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Iterator f10982;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public InterfaceC3746 f10983;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f10984;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f10984;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m7104();
                }
                if (this.f10982.hasNext()) {
                    this.f10984 = 2;
                    return true;
                }
                this.f10982 = null;
            }
            this.f10984 = 5;
            InterfaceC3746 interfaceC3746 = this.f10983;
            this.f10983 = null;
            interfaceC3746.mo3974(C3397.f13249);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f10984;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f10984 = 1;
            return this.f10982.next();
        }
        if (i != 3) {
            throw m7104();
        }
        this.f10984 = 0;
        Object obj = this.f10981;
        this.f10981 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ˉי */
    public final void mo3974(Object obj) {
        ˉⁱ.ˆʿ(obj);
        this.f10984 = 4;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final RuntimeException m7104() {
        int i = this.f10984;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f10984);
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ᐧʻ */
    public final InterfaceC3747 mo3963() {
        return C3749.f14510;
    }
}
