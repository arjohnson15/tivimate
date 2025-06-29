package p026;

import dalvik.system.PathClassLoader;

/* renamed from: ʼˉ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1163 extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
