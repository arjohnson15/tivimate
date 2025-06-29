package p185;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p155.EnumC2332;
import p288.C3403;
import p330.InterfaceC3746;

/* renamed from: ˎʻ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2563 implements InterfaceC3746, InterfaceC2566, Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC3746 f10145;

    public AbstractC2563(InterfaceC3746 interfaceC3746) {
        this.f10145 = interfaceC3746;
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objMo3961 = mo3961();
        if (objMo3961 == null) {
            objMo3961 = getClass().getName();
        }
        sb.append(objMo3961);
        return sb.toString();
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ˉי */
    public final void mo3974(Object obj) {
        InterfaceC3746 interfaceC3746 = this;
        while (true) {
            AbstractC2563 abstractC2563 = (AbstractC2563) interfaceC3746;
            InterfaceC3746 interfaceC37462 = abstractC2563.f10145;
            try {
                obj = abstractC2563.mo1055(obj);
                if (obj == EnumC2332.f9250) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C3403(th);
            }
            abstractC2563.mo6677();
            if (!(interfaceC37462 instanceof AbstractC2563)) {
                interfaceC37462.mo3974(obj);
                return;
            }
            interfaceC3746 = interfaceC37462;
        }
    }

    /* renamed from: ˏᴵ */
    public StackTraceElement mo3961() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        InterfaceC2560 interfaceC2560 = (InterfaceC2560) getClass().getAnnotation(InterfaceC2560.class);
        String str = null;
        if (interfaceC2560 == null) {
            return null;
        }
        int iV = interfaceC2560.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC2560.l()[iIntValue] : -1;
        C2564 c2564 = AbstractC2565.f10149;
        C2564 c25642 = AbstractC2565.f10150;
        if (c2564 == null) {
            try {
                C2564 c25643 = new C2564(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC2565.f10149 = c25643;
                c2564 = c25643;
            } catch (Exception unused2) {
                AbstractC2565.f10149 = c25642;
                c2564 = c25642;
            }
        }
        if (c2564 != c25642) {
            Method method = c2564.f10148;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = c2564.f10146;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = c2564.f10147;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = interfaceC2560.c();
        } else {
            strC = str + '/' + interfaceC2560.c();
        }
        return new StackTraceElement(strC, interfaceC2560.m(), interfaceC2560.f(), i);
    }

    /* renamed from: ˑי */
    public abstract Object mo1055(Object obj);

    /* renamed from: ٴˎ */
    public InterfaceC2566 mo3962() {
        InterfaceC3746 interfaceC3746 = this.f10145;
        if (interfaceC3746 instanceof InterfaceC2566) {
            return (InterfaceC2566) interfaceC3746;
        }
        return null;
    }

    /* renamed from: ᴵʿ */
    public InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* renamed from: ᵎـ */
    public void mo6677() {
    }
}
