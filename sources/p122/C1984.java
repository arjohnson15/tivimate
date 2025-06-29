package p122;

import java.util.Arrays;

/* renamed from: ˈי.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1984 extends AbstractC1955 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] f7569;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7570;

    public C1984(byte[] bArr, String str) {
        this.f7570 = str;
        this.f7569 = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1955)) {
            return false;
        }
        AbstractC1955 abstractC1955 = (AbstractC1955) obj;
        if (this.f7570.equals(((C1984) abstractC1955).f7570)) {
            if (Arrays.equals(this.f7569, (abstractC1955 instanceof C1984 ? (C1984) abstractC1955 : (C1984) abstractC1955).f7569)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7570.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7569);
    }

    public final String toString() {
        return "File{filename=" + this.f7570 + ", contents=" + Arrays.toString(this.f7569) + "}";
    }
}
