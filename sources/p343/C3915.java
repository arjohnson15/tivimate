package p343;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: ᵎـ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3915 implements Iterable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C3913 f15220;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final WeakHashMap f15221 = new WeakHashMap();

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f15222 = 0;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C3913 f15223;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p343.C3911) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p343.C3915
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᵎـ.ٴˎ r7 = (p343.C3915) r7
            int r1 = r6.f15222
            int r3 = r7.f15222
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            ᵎـ.ʽᐧ r3 = (p343.C3911) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            ᵎـ.ʽᐧ r4 = (p343.C3911) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            ᵎـ.ʽᐧ r7 = (p343.C3911) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p343.C3915.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C3911 c3911 = (C3911) it;
            if (!c3911.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c3911.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C3911 c3911 = new C3911(this.f15223, this.f15220, 0);
        this.f15221.put(c3911, Boolean.FALSE);
        return c3911;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C3911 c3911 = (C3911) it;
            if (!c3911.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c3911.next()).toString());
            if (c3911.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* renamed from: ٴˎ */
    public Object mo9102(Object obj) {
        C3913 c3913Mo9103 = mo9103(obj);
        if (c3913Mo9103 == null) {
            return null;
        }
        this.f15222--;
        WeakHashMap weakHashMap = this.f15221;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC3912) it.next()).mo9101(c3913Mo9103);
            }
        }
        C3913 c3913 = c3913Mo9103.f15217;
        if (c3913 != null) {
            c3913.f15216 = c3913Mo9103.f15216;
        } else {
            this.f15223 = c3913Mo9103.f15216;
        }
        C3913 c39132 = c3913Mo9103.f15216;
        if (c39132 != null) {
            c39132.f15217 = c3913;
        } else {
            this.f15220 = c3913;
        }
        c3913Mo9103.f15216 = null;
        c3913Mo9103.f15217 = null;
        return c3913Mo9103.f15215;
    }

    /* renamed from: ﹳﹳ */
    public C3913 mo9103(Object obj) {
        C3913 c3913 = this.f15223;
        while (c3913 != null && !c3913.f15218.equals(obj)) {
            c3913 = c3913.f15216;
        }
        return c3913;
    }
}
