package p113;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import p062.AbstractBinderC1444;
import p417.AbstractC4753;
import ـˈ.ˉᵎ;

/* renamed from: ˈ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class BinderC1816 extends AbstractBinderC1444 implements InterfaceC1818 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object f7036;

    public BinderC1816(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f7036 = obj;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static Object m5558(InterfaceC1818 interfaceC1818) throws SecurityException {
        if (interfaceC1818 instanceof BinderC1816) {
            return ((BinderC1816) interfaceC1818).f7036;
        }
        IBinder iBinderAsBinder = interfaceC1818.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        AbstractC4753.m10683(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static InterfaceC1818 m5559(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1818 ? (InterfaceC1818) iInterfaceQueryLocalInterface : new C1817(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }
}
