package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class Optional<T> {
    private static final Optional b = new Optional();
    private final Object a;

    private Optional() {
        this.a = null;
    }

    private Optional(Object obj) {
        this.a = Objects.requireNonNull(obj);
    }

    public static Optional a() {
        return b;
    }

    public static Optional d(Object obj) {
        return new Optional(obj);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? b : new Optional<>(t);
    }

    public final Object b() {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.a, ((Optional) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
