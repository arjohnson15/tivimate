package p396;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import ـˈ.ˎـ;

/* renamed from: ⁱᴵ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4565 extends AbstractC4550 {
    @Override // p396.AbstractC4550
    /* renamed from: ـﹶ */
    public final InterfaceC4575 mo10421(Type type, Annotation[] annotationArr) {
        if (AbstractC4581.m10473(type) != ˎـ.ˏᵢ()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM10477 = AbstractC4581.m10477(0, (ParameterizedType) type);
        if (AbstractC4581.m10473(typeM10477) != C4586.class) {
            return new C4593(0, typeM10477);
        }
        if (!(typeM10477 instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new C4593(1, AbstractC4581.m10477(0, (ParameterizedType) typeM10477));
    }
}
