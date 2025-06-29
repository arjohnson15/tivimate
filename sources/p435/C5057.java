package p435;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;
import p169.AbstractC2458;
import p331.C3759;

/* renamed from: ﹶᵔ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5057 extends AbstractC5044 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C5055 f19191 = new C5055(1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5056[] f19192;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3759 f19193;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC5047 f19194;

    public C5057(AbstractC5047 abstractC5047, TreeMap treeMap) {
        this.f19194 = abstractC5047;
        this.f19192 = (C5056[]) treeMap.values().toArray(new C5056[treeMap.size()]);
        this.f19193 = C3759.m8745((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    public final String toString() {
        return "JsonAdapter(" + this.f19194 + ")";
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) throws IllegalAccessException, IllegalArgumentException {
        try {
            Object objMo11156 = this.f19194.mo11156();
            try {
                abstractC5050.mo11185();
                while (abstractC5050.mo11191()) {
                    int iMo11194 = abstractC5050.mo11194(this.f19193);
                    if (iMo11194 == -1) {
                        abstractC5050.mo11197();
                        abstractC5050.mo11184();
                    } else {
                        C5056 c5056 = this.f19192[iMo11194];
                        c5056.f19188.set(objMo11156, c5056.f19189.mo1390(abstractC5050));
                    }
                }
                abstractC5050.mo11198();
                return objMo11156;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            AbstractC2458.m6579(e2);
            throw null;
        }
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) throws IllegalAccessException, IllegalArgumentException {
        try {
            abstractC5048.mo11173();
            for (C5056 c5056 : this.f19192) {
                abstractC5048.mo11174(c5056.f19190);
                c5056.f19189.mo1391(abstractC5048, c5056.f19188.get(obj));
            }
            abstractC5048.mo11178();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }
}
