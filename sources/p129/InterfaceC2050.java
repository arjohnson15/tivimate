package p129;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p160.AbstractC2344;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ˈﹶ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public @interface InterfaceC2050 {
    String condition() default "";

    EnumC2046 delivery() default EnumC2046.f7765;

    boolean enabled() default true;

    InterfaceC2045[] filters() default {};

    Class invocation() default AbstractC2344.class;

    int priority() default 0;

    boolean rejectSubtypes() default false;
}
