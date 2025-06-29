package p298;

import j$.util.Objects;

/* renamed from: ٴﾞ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3493 extends AbstractC3492 {

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public String f13509;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public int f13510;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public byte[] f13511;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public long f13512;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public int f13513;

    public C3493() {
        this.f5033 = 3;
    }

    @Override // p298.AbstractC3492
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3493.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C3493 c3493 = (C3493) obj;
        C3494 c3494 = this.f13496;
        long j = c3494 != null ? c3494.f13514 : this.f13512;
        C3494 c34942 = c3493.f13496;
        return j == (c34942 != null ? c34942.f13514 : c3493.f13512);
    }

    public final int hashCode() {
        String str = this.f13492;
        C3494 c3494 = this.f13496;
        return Objects.hash(str, Long.valueOf(c3494 != null ? c3494.f13514 : this.f13512));
    }

    @Override // p034.AbstractC1227
    public final String toString() {
        return this.f13492;
    }
}
