package p396;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import ـˈ.ˎـ;

/* renamed from: ⁱᴵ.ʾʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4549 extends C4574 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ int f17453;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4549(int i) {
        super(7);
        this.f17453 = i;
    }

    @Override // p396.C4574
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public String mo10418(Method method, int i) {
        switch (this.f17453) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                    break;
                } else {
                    break;
                }
        }
        return super.mo10418(method, i);
    }

    @Override // p396.C4574
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean mo10419(Method method) {
        switch (this.f17453) {
        }
        return ˎـ.ᐧⁱ(method);
    }

    @Override // p396.C4574
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object mo10420(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.f17453) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return AbstractC4581.m10471(method, cls, obj, objArr);
                }
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            default:
                return AbstractC4581.m10471(method, cls, obj, objArr);
        }
    }
}
