package p435;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: ﹶᵔ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5052 extends AbstractC5047 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final /* synthetic */ Class f19169;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final /* synthetic */ AccessibleObject f19170;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final /* synthetic */ int f19171 = 0;

    public C5052(Constructor constructor, Class cls) {
        this.f19170 = constructor;
        this.f19169 = cls;
    }

    public C5052(Method method, Class cls) {
        this.f19170 = method;
        this.f19169 = cls;
    }

    public final String toString() {
        switch (this.f19171) {
        }
        return this.f19169.getName();
    }

    @Override // p435.AbstractC5047
    /* renamed from: ʿʼ */
    public final Object mo11156() {
        AccessibleObject accessibleObject = this.f19170;
        switch (this.f19171) {
            case 0:
                return ((Constructor) accessibleObject).newInstance(null);
            default:
                return ((Method) accessibleObject).invoke(null, this.f19169, Object.class);
        }
    }
}
