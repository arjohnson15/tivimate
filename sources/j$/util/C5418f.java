package j$.util;

import java.io.Serializable;

/* renamed from: j$.util.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5418f extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new C5418f("Unsupported " + str + " :" + serializable);
    }
}
