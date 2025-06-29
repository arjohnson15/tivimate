package p129;

import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: ˈﹶ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2053 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC2054[] f7770;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Class f7771;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2049 f7772;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean f7773;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Class[] f7774;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f7775;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Method f7776;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final EnumC2046 f7777;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f7778;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f7779;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean f7780;

    public C2053(HashMap map) {
        Object[][] objArr = {new Object[]{"handler", Method.class}, new Object[]{"priority", Integer.class}, new Object[]{"invocation", Class.class}, new Object[]{"filter", InterfaceC2054[].class}, new Object[]{"condition", String.class}, new Object[]{"envelope", Boolean.class}, new Object[]{"messages", Class[].class}, new Object[]{"synchronized", Boolean.class}, new Object[]{"listener", C2049.class}, new Object[]{"subtypes", Boolean.class}};
        int i = 0;
        while (i < 10) {
            Object[] objArr2 = objArr[i];
            if (map.get(objArr2[0]) != null) {
                Object[][] objArr3 = objArr;
                if (((Class) objArr2[1]).isAssignableFrom(map.get(objArr2[0]).getClass())) {
                    i++;
                    objArr = objArr3;
                }
            }
            throw new IllegalArgumentException("Property " + objArr2[0] + " was expected to be not null and of type " + objArr2[1] + " but was: " + map.get(objArr2[0]));
        }
        this.f7776 = (Method) map.get("handler");
        this.f7770 = (InterfaceC2054[]) map.get("filter");
        this.f7775 = (String) map.get("condition");
        this.f7779 = ((Integer) map.get("priority")).intValue();
        this.f7771 = (Class) map.get("invocation");
        this.f7777 = (EnumC2046) map.get("invocationMode");
        this.f7778 = ((Boolean) map.get("envelope")).booleanValue();
        this.f7780 = ((Boolean) map.get("subtypes")).booleanValue();
        this.f7772 = (C2049) map.get("listener");
        this.f7773 = ((Boolean) map.get("synchronized")).booleanValue();
        this.f7774 = (Class[]) map.get("messages");
    }
}
