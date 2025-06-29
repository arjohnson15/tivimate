package p435;

import j$.util.DesugarCollections;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import p041.C1281;
import p169.AbstractC2458;

/* renamed from: ﹶᵔ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5054 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final ArrayList f19183;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ThreadLocal f19184 = new ThreadLocal();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final LinkedHashMap f19185 = new LinkedHashMap();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f19186;

    static {
        ArrayList arrayList = new ArrayList(5);
        f19183 = arrayList;
        arrayList.add(AbstractC5047.f19151);
        arrayList.add(C5051.f19166);
        arrayList.add(C5038.f19113);
        arrayList.add(C5038.f19114);
        arrayList.add(AbstractC5063.f19209);
        arrayList.add(C5057.f19191);
    }

    public C5054(C1281 c1281) {
        ArrayList arrayList = c1281.f5270;
        int size = arrayList.size();
        ArrayList arrayList2 = f19183;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f19186 = DesugarCollections.unmodifiableList(arrayList3);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 m11212(Type type, Set set) {
        return m11213(type, set, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [ﹶᵔ.ˉⁱ] */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 m11213(Type type, Set set, String str) {
        C5067 c5067;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM6577 = AbstractC2458.m6577(type);
        if (typeM6577 instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) typeM6577;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length != 1) {
                    throw new IllegalArgumentException();
                }
                typeM6577 = upperBounds[0];
            }
        }
        Object objAsList = set.isEmpty() ? typeM6577 : Arrays.asList(typeM6577, set);
        synchronized (this.f19185) {
            try {
                AbstractC5044 abstractC5044 = (AbstractC5044) this.f19185.get(objAsList);
                if (abstractC5044 != null) {
                    return abstractC5044;
                }
                C5066 c5066 = (C5066) this.f19184.get();
                if (c5066 == null) {
                    c5066 = new C5066(this);
                    this.f19184.set(c5066);
                }
                ArrayList arrayList = c5066.f19215;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    ArrayDeque arrayDeque = c5066.f19213;
                    if (i >= size) {
                        C5067 c50672 = new C5067(typeM6577, str, objAsList);
                        arrayList.add(c50672);
                        arrayDeque.add(c50672);
                        c5067 = null;
                        break;
                    }
                    c5067 = (C5067) arrayList.get(i);
                    if (c5067.f19218.equals(objAsList)) {
                        arrayDeque.add(c5067);
                        ?? r13 = c5067.f19220;
                        if (r13 != 0) {
                            c5067 = r13;
                        }
                    } else {
                        i++;
                    }
                }
                try {
                    if (c5067 != null) {
                        return c5067;
                    }
                    try {
                        int size2 = this.f19186.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            AbstractC5044 abstractC5044Mo11183 = ((InterfaceC5049) this.f19186.get(i2)).mo11183(typeM6577, set, this);
                            if (abstractC5044Mo11183 != null) {
                                ((C5067) c5066.f19213.getLast()).f19220 = abstractC5044Mo11183;
                                c5066.m11223(true);
                                return abstractC5044Mo11183;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + AbstractC2458.m6575(typeM6577, set));
                    } catch (IllegalArgumentException e) {
                        throw c5066.m11224(e);
                    }
                } finally {
                    c5066.m11223(false);
                }
            } finally {
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC5044 m11214(Class cls) {
        return m11213(cls, AbstractC2458.f9787, null);
    }
}
