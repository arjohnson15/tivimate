package p036;

import java.util.Arrays;

/* renamed from: ʼﹶ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1250 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5125;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC1239[] f5126;

    public C1250(InterfaceC1239... interfaceC1239Arr) {
        this.f5126 = interfaceC1239Arr;
        int length = interfaceC1239Arr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1250.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f5126, ((C1250) obj).f5126);
    }

    public final int hashCode() {
        if (this.f5125 == 0) {
            this.f5125 = 527 + Arrays.hashCode(this.f5126);
        }
        return this.f5125;
    }
}
