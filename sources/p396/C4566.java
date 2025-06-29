package p396;

import com.google.android.gms.internal.measurement.C0559;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p052.ExecutorC1321;

/* renamed from: ⁱᴵ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4566 extends AbstractC4550 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ExecutorC1321 f17490;

    public C4566(ExecutorC1321 executorC1321) {
        this.f17490 = executorC1321;
    }

    @Override // p396.AbstractC4550
    /* renamed from: ـﹶ */
    public final InterfaceC4575 mo10421(Type type, Annotation[] annotationArr) {
        if (AbstractC4581.m10473(type) != InterfaceC4591.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C0559(AbstractC4581.m10477(0, (ParameterizedType) type), 17, AbstractC4581.m10468(annotationArr, InterfaceC4585.class) ? null : this.f17490);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
