package p010;

import p034.C1228;
import p070.AbstractC1549;
import p148.AbstractC2269;
import p185.AbstractC2563;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import p338.InterfaceC3864;
import ⁱـ.ˑי;

/* renamed from: ʻˎ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1014 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1228 f4386 = new C1228("NULL", 1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1228 f4385 = new C1228("UNINITIALIZED", 1);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Object m3969(InterfaceC3747 interfaceC3747, Object obj, Object obj2, InterfaceC3864 interfaceC3864, InterfaceC3746 interfaceC3746) {
        Object objMo1054;
        Object objM6280 = AbstractC2269.m6280(interfaceC3747, obj2);
        try {
            C1026 c1026 = new C1026(interfaceC3746, interfaceC3747);
            if (interfaceC3864 instanceof AbstractC2563) {
                AbstractC1549.m5141(2, interfaceC3864);
                objMo1054 = interfaceC3864.mo1054(obj, c1026);
            } else {
                objMo1054 = ˑי.ˈٴ(interfaceC3864, obj, c1026);
            }
            AbstractC2269.m6288(interfaceC3747, objM6280);
            return objMo1054;
        } catch (Throwable th) {
            AbstractC2269.m6288(interfaceC3747, objM6280);
            throw th;
        }
    }
}
