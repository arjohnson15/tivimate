package p378;

import p421.C4861;
import ـˈ.ˉᵎ;

/* renamed from: ᵢٴ.ˉᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4342 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C4861[] f16829;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4369 f16830;

    public AbstractC4342() {
        this(new C4369());
    }

    public AbstractC4342(C4369 c4369) {
        this.f16830 = c4369;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public abstract C4369 mo9867();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public abstract void mo9868(C4861 c4861);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void mo9869(C4861 c4861) {
    }

    /* renamed from: ˑʽ */
    public void mo9846(int i, C4861 c4861) {
        char c;
        if (this.f16829 == null) {
            this.f16829 = new C4861[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                C4861[] c4861Arr = this.f16829;
                if (i2 != 1) {
                    c = 2;
                    if (i2 == 2) {
                        c = 1;
                    } else if (i2 != 4) {
                        c = '\b';
                        if (i2 == 8) {
                            c = 3;
                        } else if (i2 == 16) {
                            c = 4;
                        } else if (i2 == 32) {
                            c = 5;
                        } else if (i2 == 64) {
                            c = 6;
                        } else if (i2 == 128) {
                            c = 7;
                        } else if (i2 != 256) {
                            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("type needs to be >= FIRST and <= LAST, type=", i2));
                        }
                    }
                } else {
                    c = 0;
                }
                c4861Arr[c] = c4861;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9870() {
        C4861[] c4861Arr = this.f16829;
        if (c4861Arr != null) {
            C4861 c4861Mo9839 = c4861Arr[0];
            C4861 c4861Mo98392 = c4861Arr[1];
            C4369 c4369 = this.f16830;
            if (c4861Mo98392 == null) {
                c4861Mo98392 = c4369.f16871.mo9839(2);
            }
            if (c4861Mo9839 == null) {
                c4861Mo9839 = c4369.f16871.mo9839(1);
            }
            mo9872(C4861.m10937(c4861Mo9839, c4861Mo98392));
            C4861 c4861 = this.f16829[4];
            if (c4861 != null) {
                mo9871(c4861);
            }
            C4861 c48612 = this.f16829[5];
            if (c48612 != null) {
                mo9873(c48612);
            }
            C4861 c48613 = this.f16829[6];
            if (c48613 != null) {
                mo9869(c48613);
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void mo9871(C4861 c4861) {
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public abstract void mo9872(C4861 c4861);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void mo9873(C4861 c4861) {
    }
}
