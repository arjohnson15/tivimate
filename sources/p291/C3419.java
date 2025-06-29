package p291;

import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.fragment.app.Fragment$InstantiationException;
import p200.C2755;
import ˆʽ.ᵎˏ;

/* renamed from: ٴᐧ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3419 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C2755 f13289 = new C2755(0);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0104 f13290;

    public C3419(AbstractC0104 abstractC0104) {
        this.f13290 = abstractC0104;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Class m8289(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C2755 c2755 = f13289;
        C2755 c27552 = (C2755) c2755.get(classLoader);
        if (c27552 == null) {
            c27552 = new C2755(0);
            c2755.put(classLoader, c27552);
        }
        Class cls = (Class) c27552.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c27552.put(str, cls2);
        return cls2;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static Class m8290(ClassLoader classLoader, String str) {
        try {
            return m8289(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment$InstantiationException(ᵎˏ.ˑי("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment$InstantiationException(ᵎˏ.ˑי("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractComponentCallbacksC0100 m8291(String str) {
        return AbstractComponentCallbacksC0100.instantiate(this.f13290.f635.f13385, str, null);
    }
}
