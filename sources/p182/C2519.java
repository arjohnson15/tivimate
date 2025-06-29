package p182;

import com.bumptech.glide.ﹳﹳ;
import p222.C2885;

/* renamed from: ˋⁱ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2519 extends ﹳﹳ {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f10011;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f10012;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10013;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ Object f10014;

    public C2519(C2522 c2522) {
        this.f10013 = 0;
        this.f10014 = c2522;
        this.f10011 = false;
        this.f10012 = 0;
    }

    public C2519(C2885 c2885, int i) {
        this.f10013 = 1;
        this.f10014 = c2885;
        this.f10012 = i;
        this.f10011 = false;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6656() {
        switch (this.f10013) {
            case 0:
                if (!this.f10011) {
                    this.f10011 = true;
                    ﹳﹳ r0 = ((C2522) this.f10014).f10020;
                    if (r0 != null) {
                        r0.m9935();
                        break;
                    }
                }
                break;
            default:
                ((C2885) this.f10014).f11179.setVisibility(0);
                break;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6657() {
        switch (this.f10013) {
            case 0:
                int i = this.f10012 + 1;
                this.f10012 = i;
                C2522 c2522 = (C2522) this.f10014;
                if (i == c2522.f10018.size()) {
                    ﹳﹳ r0 = c2522.f10020;
                    if (r0 != null) {
                        r0.m9936();
                    }
                    this.f10012 = 0;
                    this.f10011 = false;
                    c2522.f10016 = false;
                    break;
                }
                break;
            default:
                if (!this.f10011) {
                    ((C2885) this.f10014).f11179.setVisibility(this.f10012);
                    break;
                }
                break;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m6658() {
        switch (this.f10013) {
            case 1:
                this.f10011 = true;
                break;
        }
    }
}
