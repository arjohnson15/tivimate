package p036;

import java.util.Arrays;
import p383.AbstractC4470;

/* renamed from: ʼﹶ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1241 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int[] f5071;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f5072;

    static {
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
        AbstractC4470.m10164(2);
    }

    public C1241(int[] iArr, int i) {
        this.f5072 = i;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.f5071 = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1241.class != obj.getClass()) {
            return false;
        }
        C1241 c1241 = (C1241) obj;
        return this.f5072 == c1241.f5072 && Arrays.equals(this.f5071, c1241.f5071);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f5071) + (this.f5072 * 31)) * 31;
    }
}
