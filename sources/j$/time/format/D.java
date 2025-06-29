package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class D {
    public static final D a = new D();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    final int a(char c) {
        int i = c - '0';
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        ((D) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
