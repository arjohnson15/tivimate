package p200;

import androidx.datastore.preferences.protobuf.C0054;
import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: ˎٴ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2741 extends C2755 implements Map, j$.util.Map {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C2740 f10720;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C0054 f10721;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C2758 f10722;

    public C2741(C2741 c2741) {
        super(0);
        mo7017(c2741);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0054 c0054 = this.f10721;
        if (c0054 != null) {
            return c0054;
        }
        C0054 c00542 = new C0054(this, 1);
        this.f10721 = c00542;
        return c00542;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2740 c2740 = this.f10720;
        if (c2740 != null) {
            return c2740;
        }
        C2740 c27402 = new C2740(this);
        this.f10720 = c27402;
        return c27402;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        m7013(map.size() + this.f10778);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        C2758 c2758 = this.f10722;
        if (c2758 != null) {
            return c2758;
        }
        C2758 c27582 = new C2758(this);
        this.f10722 = c27582;
        return c27582;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean m6960(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean m6961(Collection collection) {
        int i = this.f10778;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f10778;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final boolean m6962(Collection collection) {
        int i = this.f10778;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(m7021(i2))) {
                mo7022(i2);
            }
        }
        return i != this.f10778;
    }
}
