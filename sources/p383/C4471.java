package p383;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p385.C4480;

/* renamed from: ᵢᵢ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4471 implements Iterable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f17211 = new Object();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final HashMap f17208 = new HashMap();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Set f17209 = Collections.emptySet();

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public List f17210 = Collections.emptyList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f17211) {
            it = this.f17210.iterator();
        }
        return it;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m10219(C4480 c4480) {
        synchronized (this.f17211) {
            try {
                Integer num = (Integer) this.f17208.get(c4480);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f17210);
                arrayList.remove(c4480);
                this.f17210 = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f17208.remove(c4480);
                    HashSet hashSet = new HashSet(this.f17209);
                    hashSet.remove(c4480);
                    this.f17209 = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f17208.put(c4480, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m10220(C4480 c4480) {
        int iIntValue;
        synchronized (this.f17211) {
            try {
                iIntValue = this.f17208.containsKey(c4480) ? ((Integer) this.f17208.get(c4480)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }
}
