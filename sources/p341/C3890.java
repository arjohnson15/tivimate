package p341;

import android.util.SparseArray;
import p153.C2324;
import p254.InterfaceC3178;

/* renamed from: ᵎˑ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3890 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f15023;

    /* renamed from: ˉי, reason: contains not printable characters */
    public long f15025;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f15026;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean f15028;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f15031;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f15032;

    /* renamed from: ˑי, reason: contains not printable characters */
    public long f15033;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3178 f15034;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2324 f15035;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public byte[] f15036;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public boolean f15038;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public long f15039;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f15041;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final SparseArray f15040 = new SparseArray();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final SparseArray f15024 = new SparseArray();

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C3900 f15027 = new C3900();

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public C3900 f15037 = new C3900();

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f15029 = false;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean f15030 = false;

    public C3890(InterfaceC3178 interfaceC3178, boolean z, boolean z2) {
        this.f15034 = interfaceC3178;
        this.f15023 = z;
        this.f15032 = z2;
        byte[] bArr = new byte[128];
        this.f15036 = bArr;
        this.f15035 = new C2324(bArr, 0, 0);
        C3900 c3900 = this.f15037;
        c3900.f15109 = false;
        c3900.f15119 = false;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9087() {
        boolean z;
        int i;
        boolean z2 = false;
        if (this.f15023) {
            C3900 c3900 = this.f15037;
            z = c3900.f15109 && ((i = c3900.f15110) == 7 || i == 2);
        } else {
            z = this.f15038;
        }
        boolean z3 = this.f15028;
        int i2 = this.f15041;
        if (i2 == 5 || (z && i2 == 1)) {
            z2 = true;
        }
        this.f15028 = z3 | z2;
    }
}
