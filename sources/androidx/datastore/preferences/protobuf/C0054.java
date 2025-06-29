package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p200.C2741;
import p200.C2749;

/* renamed from: androidx.datastore.preferences.protobuf.ٴᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0054 extends AbstractSet {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Map f465;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f466;

    public /* synthetic */ C0054(Map map, int i) {
        this.f466 = i;
        this.f465 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f466) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C0034) this.f465).m352((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f466) {
            case 0:
                ((C0034) this.f465).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f466) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C0034) this.f465).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f466) {
            case 0:
                return new C0011((C0034) this.f465);
            default:
                return new C2749((C2741) this.f465);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f466) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C0034) this.f465).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f466) {
            case 0:
                return ((C0034) this.f465).size();
            default:
                return ((C2741) this.f465).f10778;
        }
    }
}
