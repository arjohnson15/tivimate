package j$.util.stream;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5446d {
    protected final int a;
    protected int b;
    protected int c;
    protected long[] d;

    protected AbstractC5446d() {
        this.a = 4;
    }

    protected AbstractC5446d(int i) {
        if (i >= 0) {
            this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
    }

    public abstract void clear();

    public final long count() {
        int i = this.c;
        return i == 0 ? this.b : this.d[i] + this.b;
    }
}
