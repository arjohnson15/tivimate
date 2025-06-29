package p435;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import p169.AbstractC2458;

/* renamed from: ﹶᵔ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5038 extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f19115;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f19116;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f19117 = 0;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C5055 f19114 = new C5055(0);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C5055 f19113 = new C5055(3);

    public C5038(Class cls, AbstractC5044 abstractC5044) {
        this.f19116 = cls;
        this.f19115 = abstractC5044;
    }

    public C5038(C5054 c5054, Type type, Type type2) {
        c5054.getClass();
        Set set = AbstractC2458.f9787;
        this.f19115 = c5054.m11212(type, set);
        this.f19116 = c5054.m11212(type2, set);
    }

    public final String toString() {
        switch (this.f19117) {
            case 0:
                return this.f19115 + ".array()";
            default:
                return "JsonAdapter(" + this.f19115 + "=" + ((AbstractC5044) this.f19116) + ")";
        }
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        switch (this.f19117) {
            case 0:
                ArrayList arrayList = new ArrayList();
                abstractC5050.mo11193();
                while (abstractC5050.mo11191()) {
                    arrayList.add(this.f19115.mo1390(abstractC5050));
                }
                abstractC5050.mo11192();
                Object objNewInstance = Array.newInstance((Class<?>) this.f19116, arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    Array.set(objNewInstance, i, arrayList.get(i));
                }
                return objNewInstance;
            default:
                C5045 c5045 = new C5045();
                abstractC5050.mo11185();
                while (abstractC5050.mo11191()) {
                    C5053 c5053 = (C5053) abstractC5050;
                    if (c5053.mo11191()) {
                        c5053.f19180 = c5053.m11208();
                        c5053.f19182 = 11;
                    }
                    Object objMo1390 = this.f19115.mo1390(abstractC5050);
                    Object objMo13902 = ((AbstractC5044) this.f19116).mo1390(abstractC5050);
                    Object objPut = c5045.put(objMo1390, objMo13902);
                    if (objPut != null) {
                        throw new JsonDataException("Map key '" + objMo1390 + "' has multiple values at path " + abstractC5050.m11186() + ": " + objPut + " and " + objMo13902);
                    }
                }
                abstractC5050.mo11198();
                return c5045;
        }
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        switch (this.f19117) {
            case 0:
                abstractC5048.mo11179();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    this.f19115.mo1391(abstractC5048, Array.get(obj, i));
                }
                ((C5061) abstractC5048).m11220(1, 2, ']');
                return;
            default:
                abstractC5048.mo11173();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new JsonDataException("Map key is null at " + abstractC5048.m11182());
                    }
                    int iM11176 = abstractC5048.m11176();
                    if (iM11176 != 5 && iM11176 != 3) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    abstractC5048.f19157 = true;
                    this.f19115.mo1391(abstractC5048, entry.getKey());
                    ((AbstractC5044) this.f19116).mo1391(abstractC5048, entry.getValue());
                }
                abstractC5048.mo11178();
                return;
        }
    }
}
