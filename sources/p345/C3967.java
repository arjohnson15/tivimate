package p345;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import ⁱـ.ˑי;

/* renamed from: ᵎᴵ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3967 extends AbstractSet {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C3926 f15338;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f15339;

    public /* synthetic */ C3967(C3926 c3926, int i) {
        this.f15339 = i;
        this.f15338 = c3926;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f15339) {
            case 0:
                this.f15338.clear();
                break;
            default:
                this.f15338.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f15339) {
            case 0:
                C3926 c3926 = this.f15338;
                Map mapM9132 = c3926.m9132();
                if (mapM9132 != null) {
                    return mapM9132.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM9133 = c3926.m9133(entry.getKey());
                    if (iM9133 != -1 && ˑי.ﹶˆ(c3926.m9128()[iM9133], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f15338.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f15339) {
            case 0:
                C3926 c3926 = this.f15338;
                Map mapM9132 = c3926.m9132();
                return mapM9132 != null ? mapM9132.entrySet().iterator() : new C3941(c3926, 1);
            default:
                C3926 c39262 = this.f15338;
                Map mapM91322 = c39262.m9132();
                return mapM91322 != null ? mapM91322.keySet().iterator() : new C3941(c39262, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f15339) {
            case 0:
                C3926 c3926 = this.f15338;
                Map mapM9132 = c3926.m9132();
                if (mapM9132 != null) {
                    return mapM9132.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c3926.m9131()) {
                        int iM9126 = c3926.m9126();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c3926.f15258;
                        Objects.requireNonNull(obj2);
                        int iM9183 = AbstractC3968.m9183(key, value, iM9126, obj2, c3926.m9127(), c3926.m9130(), c3926.m9128());
                        if (iM9183 != -1) {
                            c3926.m9134(iM9183, iM9126);
                            c3926.f15259--;
                            c3926.f15253 += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C3926 c39262 = this.f15338;
                Map mapM91322 = c39262.m9132();
                return mapM91322 != null ? mapM91322.keySet().remove(obj) : c39262.m9135(obj) != C3926.f15251;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f15339) {
        }
        return this.f15338.size();
    }
}
