package p148;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import p217.AbstractC2825;
import p217.C2827;
import p217.C2828;
import p218.AbstractC2834;

/* renamed from: ˊʻ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2262 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2828 f8994;

    static {
        String property;
        int i = AbstractC2275.f9020;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = AbstractC2834.m7107(AbstractC2834.m7106(Arrays.asList(new C2827()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iM7102 = ((C2827) next).m7102();
                    do {
                        Object next2 = it.next();
                        int iM71022 = ((C2827) next2).m7102();
                        if (iM7102 < iM71022) {
                            next = next2;
                            iM7102 = iM71022;
                        }
                    } while (it.hasNext());
                }
            }
            C2827 c2827 = (C2827) next;
            if (c2827 == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            try {
                c2827.getClass();
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null) {
                    throw new IllegalStateException("The main looper is not available");
                }
                f8994 = new C2828(AbstractC2825.m7101(mainLooper));
            } catch (Throwable th) {
                c2827.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
