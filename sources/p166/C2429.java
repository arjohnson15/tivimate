package p166;

import java.util.Arrays;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ˊﹶ.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2429 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2433 f9651;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean[] f9652;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f9653;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f9654;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int[] f9655;

    static {
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
        AbstractC4470.m10164(3);
        AbstractC4470.m10164(4);
    }

    public C2429(C2433 c2433, boolean z, int[] iArr, boolean[] zArr) {
        int i = c2433.f9699;
        this.f9654 = i;
        boolean z2 = false;
        AbstractC4464.m10142(i == iArr.length && i == zArr.length);
        this.f9651 = c2433;
        if (z && i > 1) {
            z2 = true;
        }
        this.f9653 = z2;
        this.f9655 = (int[]) iArr.clone();
        this.f9652 = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2429.class != obj.getClass()) {
            return false;
        }
        C2429 c2429 = (C2429) obj;
        return this.f9653 == c2429.f9653 && this.f9651.equals(c2429.f9651) && Arrays.equals(this.f9655, c2429.f9655) && Arrays.equals(this.f9652, c2429.f9652);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9652) + ((Arrays.hashCode(this.f9655) + (((this.f9651.hashCode() * 31) + (this.f9653 ? 1 : 0)) * 31)) * 31);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m6536(int i) {
        return this.f9655[i] == 4;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m6537() {
        return this.f9651.f9698;
    }
}
