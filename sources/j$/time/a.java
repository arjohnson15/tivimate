package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
final class a extends b implements Serializable {
    private static final long serialVersionUID = 6740630888130243051L;
    private final ZoneId a;

    static {
        System.currentTimeMillis();
        new a(ZoneOffset.UTC);
    }

    a(ZoneId zoneId) {
        this.a = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.b
    public final ZoneId a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.a.equals(((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }
}
