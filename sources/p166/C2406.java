package p166;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;

/* renamed from: ˊﹶ.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2406 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f9506;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C3932 f9507;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C2445 f9508;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public HashMap f9509;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f9510;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f9511;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C3932 f9512;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f9514;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public C3932 f9518;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public HashSet f9519;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f9520;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C3932 f9522;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f9515 = Integer.MAX_VALUE;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f9504 = Integer.MAX_VALUE;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f9513 = Integer.MAX_VALUE;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f9521 = Integer.MAX_VALUE;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f9505 = Integer.MAX_VALUE;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f9516 = Integer.MAX_VALUE;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f9517 = true;

    public C2406() {
        C3928 c3928 = AbstractC3980.f15360;
        C3932 c3932 = C3932.f15274;
        this.f9512 = c3932;
        this.f9522 = c3932;
        this.f9506 = Integer.MAX_VALUE;
        this.f9510 = Integer.MAX_VALUE;
        this.f9507 = c3932;
        this.f9508 = C2445.f9741;
        this.f9518 = c3932;
        this.f9511 = 0;
        this.f9514 = 0;
        this.f9520 = false;
        this.f9509 = new HashMap();
        this.f9519 = new HashSet();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6495(C2409 c2409) {
        this.f9515 = c2409.f9539;
        this.f9504 = c2409.f9528;
        this.f9513 = c2409.f9537;
        this.f9521 = c2409.f9545;
        this.f9505 = c2409.f9529;
        this.f9516 = c2409.f9540;
        this.f9517 = c2409.f9541;
        this.f9512 = c2409.f9536;
        this.f9522 = c2409.f9546;
        this.f9506 = c2409.f9530;
        this.f9510 = c2409.f9534;
        this.f9507 = c2409.f9531;
        this.f9508 = c2409.f9532;
        this.f9518 = c2409.f9542;
        this.f9511 = c2409.f9535;
        this.f9514 = c2409.f9538;
        this.f9520 = c2409.f9544;
        this.f9519 = new HashSet(c2409.f9543);
        this.f9509 = new HashMap(c2409.f9533);
    }

    /* renamed from: ˑʽ */
    public C2406 mo4453(int i, int i2) {
        this.f9505 = i;
        this.f9516 = i2;
        this.f9517 = true;
        return this;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m6496(int i) {
        Iterator it = this.f9509.values().iterator();
        while (it.hasNext()) {
            if (((C2432) it.next()).f9695.f9698 == i) {
                it.remove();
            }
        }
    }
}
