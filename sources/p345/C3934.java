package p345;

import com.google.common.collect.AbstractC0720;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* renamed from: ᵎᴵ.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3934 extends AbstractC0720 implements Serializable {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public transient int f15283;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient Map f15284;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public transient C3984 f15285;

    public C3934(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f15284 = map;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9148() {
        Map map = this.f15284;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f15283 = 0;
    }

    @Override // com.google.common.collect.AbstractC0720
    /* renamed from: ـﹶ */
    public final Map mo2920() {
        Map c3957 = this.f3518;
        if (c3957 == null) {
            Map map = this.f15284;
            c3957 = map instanceof NavigableMap ? new C3957(this, (NavigableMap) map) : map instanceof SortedMap ? new C3981(this, (SortedMap) map) : new C3979(this, map);
            this.f3518 = c3957;
        }
        return c3957;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Collection m9149() {
        return (List) this.f15285.get();
    }
}
