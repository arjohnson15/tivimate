package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class A {
    private static final A c = new A();
    private final boolean a;
    private final double b;

    private A() {
        this.a = false;
        this.b = Double.NaN;
    }

    private A(double d) {
        this.a = true;
        this.b = d;
    }

    public static A a() {
        return c;
    }

    public static A d(double d) {
        return new A(d);
    }

    public final double b() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        boolean z = this.a;
        if (z && a.a) {
            if (Double.compare(this.b, a.b) == 0) {
                return true;
            }
        } else if (z == a.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.b + "]";
    }
}
