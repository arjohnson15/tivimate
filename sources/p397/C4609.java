package p397;

/* renamed from: ⁱᵎ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4609 implements Comparable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final byte[] f17630;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f17631;

    public C4609(long j, byte[] bArr) {
        this.f17631 = j;
        this.f17630 = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f17631, ((C4609) obj).f17631);
    }
}
