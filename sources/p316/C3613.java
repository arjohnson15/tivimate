package p316;

import androidx.leanback.widget.ʿˏ;
import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import p396.AbstractC4556;
import p396.InterfaceC4560;
import p435.C5054;
import p435.InterfaceC5059;

/* renamed from: ᐧﹶ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3613 extends AbstractC4556 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5054 f13850;

    public C3613(C5054 c5054) {
        this.f13850 = c5054;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static Set m8507(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC5059.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? DesugarCollections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    @Override // p396.AbstractC4556
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC4560 mo8508(Type type, Annotation[] annotationArr, ʿˏ r4) {
        return new C3612(this.f13850.m11213(type, m8507(annotationArr), null));
    }

    @Override // p396.AbstractC4556
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC4560 mo8509(Type type, Annotation[] annotationArr) {
        return new C3611(this.f13850.m11213(type, m8507(annotationArr), null));
    }
}
