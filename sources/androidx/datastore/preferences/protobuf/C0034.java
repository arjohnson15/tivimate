package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: androidx.datastore.preferences.protobuf.ˎˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0034 extends AbstractMap {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f403 = 0;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public volatile C0054 f405;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f407;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f408;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public List f404 = Collections.emptyList();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Map f406 = Collections.emptyMap();

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Map f409 = Collections.emptyMap();

    public C0034(int i) {
        this.f408 = i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m346();
        if (!this.f404.isEmpty()) {
            this.f404.clear();
        }
        if (this.f406.isEmpty()) {
            return;
        }
        this.f406.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m350(comparable) >= 0 || this.f406.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f405 == null) {
            this.f405 = new C0054(this, 0);
        }
        return this.f405;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0034)) {
            return super.equals(obj);
        }
        C0034 c0034 = (C0034) obj;
        int size = size();
        if (size != c0034.size()) {
            return false;
        }
        int size2 = this.f404.size();
        if (size2 != c0034.f404.size()) {
            return ((AbstractSet) entrySet()).equals(c0034.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!m349(i).equals(c0034.m349(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f406.equals(c0034.f406);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM350 = m350(comparable);
        return iM350 >= 0 ? ((C0023) this.f404.get(iM350)).f380 : this.f406.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f404.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((C0023) this.f404.get(i)).hashCode();
        }
        return this.f406.size() > 0 ? iHashCode + this.f406.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        ᵎﹳ.ᐧʻ.ᵎˏ(obj);
        return m352(null, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m346();
        Comparable comparable = (Comparable) obj;
        int iM350 = m350(comparable);
        if (iM350 >= 0) {
            return m348(iM350);
        }
        if (this.f406.isEmpty()) {
            return null;
        }
        return this.f406.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f406.size() + this.f404.size();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m346() {
        if (this.f407) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Iterable m347() {
        return this.f406.isEmpty() ? AbstractC0072.f495 : this.f406.entrySet();
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Object m348(int i) {
        m346();
        Object obj = ((C0023) this.f404.remove(i)).f380;
        if (!this.f406.isEmpty()) {
            Iterator it = m351().entrySet().iterator();
            List list = this.f404;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C0023(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Map.Entry m349(int i) {
        return (Map.Entry) this.f404.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m350(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f404
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f404
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.ˈﹳ r2 = (androidx.datastore.preferences.protobuf.C0023) r2
            java.lang.Comparable r2 = r2.f382
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f404
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.ˈﹳ r3 = (androidx.datastore.preferences.protobuf.C0023) r3
            java.lang.Comparable r3 = r3.f382
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0034.m350(java.lang.Comparable):int");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final SortedMap m351() {
        m346();
        if (this.f406.isEmpty() && !(this.f406 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f406 = treeMap;
            this.f409 = treeMap.descendingMap();
        }
        return (SortedMap) this.f406;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object m352(Comparable comparable, Object obj) {
        m346();
        int iM350 = m350(comparable);
        if (iM350 >= 0) {
            return ((C0023) this.f404.get(iM350)).setValue(obj);
        }
        m346();
        boolean zIsEmpty = this.f404.isEmpty();
        int i = this.f408;
        if (zIsEmpty && !(this.f404 instanceof ArrayList)) {
            this.f404 = new ArrayList(i);
        }
        int i2 = -(iM350 + 1);
        if (i2 >= i) {
            return m351().put(comparable, obj);
        }
        if (this.f404.size() == i) {
            C0023 c0023 = (C0023) this.f404.remove(i - 1);
            m351().put(c0023.f382, c0023.f380);
        }
        this.f404.add(i2, new C0023(this, comparable, obj));
        return null;
    }
}
