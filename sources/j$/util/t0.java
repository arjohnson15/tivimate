package j$.util;

import java.security.AccessController;

/* loaded from: classes2.dex */
abstract class t0 {
    static final boolean a = ((Boolean) AccessController.doPrivileged(new s0())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
