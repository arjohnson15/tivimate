package p166;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* renamed from: ˊﹶ.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2434 {

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final C2402 f9701;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final Object f9702 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f9703;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f9704;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C2444 f9705;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f9706;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long f9707;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f9708;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f9709;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f9710;

    /* renamed from: ˑי, reason: contains not printable characters */
    public long f9712;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f9714;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f9715;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f9716;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f9717;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f9718;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object f9713 = f9702;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C2402 f9711 = f9701;

    static {
        C2430 c2430 = new C2430();
        C3928 c3928 = AbstractC3980.f15360;
        C3932 c3932 = C3932.f15274;
        List listEmptyList = Collections.emptyList();
        C3932 c39322 = C3932.f15274;
        C2407 c2407 = new C2407();
        C2420 c2420 = C2420.f9633;
        Uri uri = Uri.EMPTY;
        f9701 = new C2402("androidx.media3.common.Timeline", new C2399(c2430), uri != null ? new C2443(uri, null, null, listEmptyList, c39322, -9223372036854775807L) : null, new C2444(c2407), C2410.f9547, c2420);
        ᵎˏ.ﹳˎ(1, 2, 3, 4, 5);
        ᵎˏ.ﹳˎ(6, 7, 8, 9, 10);
        AbstractC4470.m10164(11);
        AbstractC4470.m10164(12);
        AbstractC4470.m10164(13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C2434.class.equals(obj.getClass())) {
            return false;
        }
        C2434 c2434 = (C2434) obj;
        return AbstractC4470.m10194(this.f9713, c2434.f9713) && AbstractC4470.m10194(this.f9711, c2434.f9711) && AbstractC4470.m10194(this.f9717, c2434.f9717) && AbstractC4470.m10194(this.f9705, c2434.f9705) && this.f9704 == c2434.f9704 && this.f9714 == c2434.f9714 && this.f9715 == c2434.f9715 && this.f9710 == c2434.f9710 && this.f9718 == c2434.f9718 && this.f9708 == c2434.f9708 && this.f9706 == c2434.f9706 && this.f9707 == c2434.f9707 && this.f9716 == c2434.f9716 && this.f9709 == c2434.f9709 && this.f9712 == c2434.f9712;
    }

    public final int hashCode() {
        int iHashCode = (this.f9711.hashCode() + ((this.f9713.hashCode() + 217) * 31)) * 31;
        Object obj = this.f9717;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C2444 c2444 = this.f9705;
        int iHashCode3 = (iHashCode2 + (c2444 != null ? c2444.hashCode() : 0)) * 31;
        long j = this.f9704;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f9714;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f9715;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f9710 ? 1 : 0)) * 31) + (this.f9718 ? 1 : 0)) * 31) + (this.f9708 ? 1 : 0)) * 31;
        long j4 = this.f9706;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f9707;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f9716) * 31) + this.f9709) * 31;
        long j6 = this.f9712;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6546(C2402 c2402, Object obj, long j, long j2, long j3, boolean z, boolean z2, C2444 c2444, long j4, long j5, int i, long j6) {
        this.f9713 = f9702;
        this.f9711 = c2402 != null ? c2402 : f9701;
        if (c2402 != null) {
            C2443 c2443 = c2402.f9492;
        }
        this.f9717 = obj;
        this.f9704 = j;
        this.f9714 = j2;
        this.f9715 = j3;
        this.f9710 = z;
        this.f9718 = z2;
        this.f9705 = c2444;
        this.f9706 = j4;
        this.f9707 = j5;
        this.f9716 = 0;
        this.f9709 = i;
        this.f9712 = j6;
        this.f9708 = false;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m6547() {
        return this.f9705 != null;
    }
}
