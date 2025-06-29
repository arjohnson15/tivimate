package p345;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵎᴵ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3947 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Iterator f15302;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f15303;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f15304;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f15305 = 1;

    public C3947(C3924 c3924, Iterator it) {
        this.f15304 = c3924;
        this.f15302 = it;
    }

    public C3947(C3933 c3933) {
        this.f15304 = c3933;
        Collection collection = c3933.f15277;
        this.f15303 = collection;
        this.f15302 = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public C3947(C3933 c3933, ListIterator listIterator) {
        this.f15304 = c3933;
        this.f15303 = c3933.f15277;
        this.f15302 = listIterator;
    }

    public C3947(C3979 c3979) {
        this.f15304 = c3979;
        this.f15302 = c3979.f15357.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15305) {
            case 0:
                break;
            case 1:
                break;
            default:
                m9154();
                break;
        }
        return this.f15302.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15305) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f15302.next();
                this.f15303 = (Collection) entry.getValue();
                return ((C3979) this.f15304).m9202(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f15302.next();
                this.f15303 = entry2;
                return entry2.getKey();
            default:
                m9154();
                return this.f15302.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f15305) {
            case 0:
                ـﹶ.ˉⁱ("no calls to next() since the last call to remove()", ((Collection) this.f15303) != null);
                this.f15302.remove();
                ((C3979) this.f15304).f15358.f15283 -= ((Collection) this.f15303).size();
                ((Collection) this.f15303).clear();
                this.f15303 = null;
                break;
            case 1:
                ـﹶ.ˉⁱ("no calls to next() since the last call to remove()", ((Map.Entry) this.f15303) != null);
                Collection collection = (Collection) ((Map.Entry) this.f15303).getValue();
                this.f15302.remove();
                ((C3924) this.f15304).f15249.f15283 -= collection.size();
                collection.clear();
                this.f15303 = null;
                break;
            default:
                this.f15302.remove();
                C3933 c3933 = (C3933) this.f15304;
                C3934 c3934 = c3933.f15278;
                c3934.f15283--;
                c3933.m9146();
                break;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m9154() {
        C3933 c3933 = (C3933) this.f15304;
        c3933.m9145();
        if (c3933.f15277 != ((Collection) this.f15303)) {
            throw new ConcurrentModificationException();
        }
    }
}
