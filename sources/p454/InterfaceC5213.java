package p454;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ﾞᵎ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public @interface InterfaceC5213 {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
