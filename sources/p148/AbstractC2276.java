package p148;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import p217.C2824;
import p218.AbstractC2834;

/* renamed from: ˊʻ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2276 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Collection f9021;

    static {
        try {
            f9021 = AbstractC2834.m7107(AbstractC2834.m7106(Arrays.asList(new C2824()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
