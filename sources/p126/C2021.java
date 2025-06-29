package p126;

import java.util.ArrayList;
import p041.C1273;
import p041.C1274;
import p041.C1283;
import p070.AbstractC1549;
import p430.C4994;
import p430.C5004;
import p430.C5009;
import p430.C5021;
import p430.InterfaceC5007;
import p430.InterfaceC5016;

/* renamed from: ˈᵔ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2021 implements InterfaceC5007 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f7666;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C5021 f7667;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f7668;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f7669;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1274 f7670;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f7671;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f7672;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1273 f7673;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f7674;

    public C2021(C1274 c1274, ArrayList arrayList, int i, C1273 c1273, C5021 c5021, int i2, int i3, int i4) {
        this.f7670 = c1274;
        this.f7666 = arrayList;
        this.f7669 = i;
        this.f7673 = c1273;
        this.f7667 = c5021;
        this.f7671 = i2;
        this.f7672 = i3;
        this.f7668 = i4;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2021 m5664(C2021 c2021, int i, C1273 c1273, C5021 c5021, int i2) {
        if ((i2 & 1) != 0) {
            i = c2021.f7669;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c1273 = c2021.f7673;
        }
        C1273 c12732 = c1273;
        if ((i2 & 4) != 0) {
            c5021 = c2021.f7667;
        }
        int i4 = c2021.f7671;
        int i5 = c2021.f7672;
        int i6 = c2021.f7668;
        return new C2021(c2021.f7670, c2021.f7666, i3, c12732, c5021, i4, i5, i6);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4994 m5665(C5021 c5021) {
        ArrayList arrayList = this.f7666;
        int size = arrayList.size();
        int i = this.f7669;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f7674++;
        C1273 c1273 = this.f7673;
        if (c1273 != null) {
            C5004 c5004 = c5021.f19052;
            C5004 c50042 = ((C5009) ((C1283) c1273.f5217).f5273).f19004;
            if (c5004.f18954 != c50042.f18954 || !AbstractC1549.m5138(c5004.f18961, c50042.f18961)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.f7674 != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        C2021 c2021M5664 = m5664(this, i2, null, c5021, 58);
        InterfaceC5016 interfaceC5016 = (InterfaceC5016) arrayList.get(i);
        C4994 c4994Mo3528 = interfaceC5016.mo3528(c2021M5664);
        if (c4994Mo3528 == null) {
            throw new NullPointerException("interceptor " + interfaceC5016 + " returned null");
        }
        if (c1273 != null && i2 < arrayList.size() && c2021M5664.f7674 != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC5016 + " must call proceed() exactly once").toString());
        }
        if (c4994Mo3528.f18890 != null) {
            return c4994Mo3528;
        }
        throw new IllegalStateException(("interceptor " + interfaceC5016 + " returned a response with no body").toString());
    }
}
