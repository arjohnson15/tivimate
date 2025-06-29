package p031;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import p069.C1542;
import p210.C2804;
import p450.InterfaceC5190;
import ˆʽ.ᵎˏ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʼـ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1186 implements InterfaceC5190 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f4909;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4910;

    public /* synthetic */ C1186(int i, Object obj) {
        this.f4910 = i;
        this.f4909 = obj;
    }

    @Override // p450.InterfaceC5190
    public final Object get() throws ClassNotFoundException {
        switch (this.f4910) {
            case 0:
                String str = (String) this.f4909;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    String str2 = "Class " + str + " is not an found.";
                    return null;
                } catch (IllegalAccessException e) {
                    throw new InvalidRegistrarException(ᵎˏ.ˑי("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new InvalidRegistrarException(ᵎˏ.ˑי("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new InvalidRegistrarException(ᐧʻ.ﾞˊ("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new InvalidRegistrarException(ᐧʻ.ﾞˊ("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) this.f4909;
            default:
                return new C1542((C2804) this.f4909);
        }
    }
}
