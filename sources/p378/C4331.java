package p378;

import android.os.Build;
import android.view.View;
import j$.util.Objects;
import p421.C4861;

/* renamed from: ᵢٴ.ʽˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4331 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C4369 f16816;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4369 f16817;

    static {
        int i = Build.VERSION.SDK_INT;
        f16816 = (i >= 30 ? new C4335() : i >= 29 ? new C4375() : new C4348()).mo9867().f16871.mo9838().f16871.mo9830().f16871.mo9836();
    }

    public C4331(C4369 c4369) {
        this.f16817 = c4369;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4331)) {
            return false;
        }
        C4331 c4331 = (C4331) obj;
        return mo9840() == c4331.mo9840() && mo9833() == c4331.mo9833() && Objects.equals(mo9832(), c4331.mo9832()) && Objects.equals(mo9835(), c4331.mo9835()) && Objects.equals(mo9831(), c4331.mo9831());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo9840()), Boolean.valueOf(mo9833()), mo9832(), mo9835(), mo9831());
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C4369 mo9830() {
        return this.f16817;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C4356 mo9831() {
        return null;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public C4861 mo9832() {
        return C4861.f18363;
    }

    /* renamed from: ˉⁱ */
    public C4369 mo9825(int i, int i2, int i3, int i4) {
        return f16816;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean mo9833() {
        return false;
    }

    /* renamed from: ˏʾ */
    public C4861 mo9826() {
        return mo9832();
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void mo9834(C4861[] c4861Arr) {
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C4861 mo9835() {
        return C4861.f18363;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C4369 mo9836() {
        return this.f16817;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void mo9837(C4369 c4369) {
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C4369 mo9838() {
        return this.f16817;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C4861 mo9839(int i) {
        return C4861.f18363;
    }

    /* renamed from: ᐧʻ */
    public C4861 mo9827() {
        return mo9832();
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public boolean mo9840() {
        return false;
    }

    /* renamed from: ᵎـ */
    public void mo9828(C4861 c4861) {
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void mo9841(View view) {
    }

    /* renamed from: ﹶˆ */
    public C4861 mo9829() {
        return mo9832();
    }
}
