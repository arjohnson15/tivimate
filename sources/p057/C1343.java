package p057;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p013.AbstractC1049;
import p070.AbstractC1549;

/* renamed from: ʾˉ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1343 extends AbstractC1049 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C1347 f5478;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5479;

    public /* synthetic */ C1343(C1347 c1347, int i) {
        this.f5479 = i;
        this.f5478 = c1347;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f5479) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f5479) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5479) {
            case 0:
                this.f5478.clear();
                break;
            default:
                this.f5478.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f5479) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C1347 c1347 = this.f5478;
                c1347.getClass();
                int iM4702 = c1347.m4702(entry.getKey());
                if (iM4702 < 0) {
                    return false;
                }
                return AbstractC1549.m5138(c1347.f5495[iM4702], entry.getValue());
            default:
                return this.f5478.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f5479) {
            case 0:
                return this.f5478.m4696(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f5479) {
        }
        return this.f5478.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5479) {
            case 0:
                C1347 c1347 = this.f5478;
                c1347.getClass();
                return new C1348(c1347, 0);
            default:
                C1347 c13472 = this.f5478;
                c13472.getClass();
                return new C1348(c13472, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f5479) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C1347 c1347 = this.f5478;
                    c1347.m4695();
                    int iM4702 = c1347.m4702(entry.getKey());
                    if (iM4702 >= 0 && AbstractC1549.m5138(c1347.f5495[iM4702], entry.getValue())) {
                        c1347.m4697(iM4702);
                        break;
                    }
                }
                break;
            default:
                C1347 c13472 = this.f5478;
                c13472.m4695();
                int iM47022 = c13472.m4702(obj);
                if (iM47022 >= 0) {
                    c13472.m4697(iM47022);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f5479) {
            case 0:
                this.f5478.m4695();
                break;
            default:
                this.f5478.m4695();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f5479) {
            case 0:
                this.f5478.m4695();
                break;
            default:
                this.f5478.m4695();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // p013.AbstractC1049
    /* renamed from: ٴˎ */
    public final int mo4039() {
        switch (this.f5479) {
        }
        return this.f5478.f5500;
    }
}
