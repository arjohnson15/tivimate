package p356;

import java.util.ArrayList;
import p166.C2431;
import p345.AbstractC3980;
import p424.InterfaceC4906;

/* renamed from: ᵔˋ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4036 extends AbstractC4034 implements InterfaceC4906 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final AbstractC4044 f15523;

    public C4036(long j, C2431 c2431, AbstractC3980 abstractC3980, AbstractC4044 abstractC4044, ArrayList arrayList) {
        super(c2431, abstractC3980, abstractC4044, arrayList);
        this.f15523 = abstractC4044;
    }

    @Override // p356.AbstractC4034
    /* renamed from: ʽᐧ */
    public final String mo9294() {
        return null;
    }

    @Override // p356.AbstractC4034
    /* renamed from: ʿʼ */
    public final C4032 mo9295() {
        return null;
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ˋˊ */
    public final long mo4856() {
        return this.f15523.f15562;
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ˋⁱ */
    public final long mo4857(long j, long j2) {
        return this.f15523.m9307(j, j2);
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ˎٴ */
    public final C4032 mo4859(long j) {
        return this.f15523.mo9297(this, j);
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ˑʽ */
    public final long mo4862(long j) {
        return this.f15523.m9309(j);
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ـﹶ */
    public final long mo4867(long j, long j2) {
        return this.f15523.m9308(j, j2);
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ᐧʻ */
    public final long mo4868(long j, long j2) {
        return this.f15523.m9306(j, j2);
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ᵎˏ */
    public final boolean mo4872() {
        return this.f15523.mo9299();
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ᵎـ */
    public final long mo4873(long j, long j2) {
        AbstractC4044 abstractC4044 = this.f15523;
        if (abstractC4044.f15560 != null) {
            return -9223372036854775807L;
        }
        long jM9305 = abstractC4044.m9305(j, j2) + abstractC4044.m9307(j, j2);
        return (abstractC4044.m9306(jM9305, j) + abstractC4044.m9309(jM9305)) - abstractC4044.f15563;
    }

    @Override // p356.AbstractC4034
    /* renamed from: ﹳﹳ */
    public final InterfaceC4906 mo9296() {
        return this;
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ﾞʽ */
    public final long mo4878(long j, long j2) {
        return this.f15523.m9305(j, j2);
    }

    @Override // p424.InterfaceC4906
    /* renamed from: ﾞˊ */
    public final long mo4879(long j) {
        return this.f15523.mo9298(j);
    }
}
