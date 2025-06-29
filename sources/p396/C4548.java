package p396;

import androidx.leanback.widget.ʿˏ;
import j$.util.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p430.AbstractC4996;
import p430.AbstractC5001;
import p454.InterfaceC5227;

/* renamed from: ⁱᴵ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4548 extends AbstractC4556 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f17452;

    public /* synthetic */ C4548(int i) {
        this.f17452 = i;
    }

    @Override // p396.AbstractC4556
    /* renamed from: ʽᐧ */
    public final InterfaceC4560 mo8508(Type type, Annotation[] annotationArr, ʿˏ r5) {
        switch (this.f17452) {
            case 0:
                if (type == AbstractC5001.class) {
                    return AbstractC4581.m10468(annotationArr, InterfaceC5227.class) ? C4574.f17513 : C4574.f17514;
                }
                if (type == Void.class) {
                    return C4574.f17517;
                }
                if (AbstractC4581.m10469(type)) {
                    return C4574.f17516;
                }
                return null;
            default:
                if (AbstractC4581.m10473(type) != Optional.class) {
                    return null;
                }
                return new C4554(r5.ᵎـ(AbstractC4581.m10477(0, (ParameterizedType) type), annotationArr));
        }
    }

    @Override // p396.AbstractC4556
    /* renamed from: ـﹶ */
    public InterfaceC4560 mo8509(Type type, Annotation[] annotationArr) {
        switch (this.f17452) {
            case 0:
                if (AbstractC4996.class.isAssignableFrom(AbstractC4581.m10473(type))) {
                    return C4574.f17515;
                }
                return null;
            default:
                return super.mo8509(type, annotationArr);
        }
    }
}
