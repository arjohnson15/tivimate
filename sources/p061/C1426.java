package p061;

import android.support.v4.media.session.AbstractC0002;

/* renamed from: ʾـ.ᵢᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1426 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5820;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f5821;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f5822;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f5823;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long f5824;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f5825;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f5826;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f5827;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f5828;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f5829;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f5830;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f5831;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f5832;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f5833;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f5834;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f5835;

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.f5830);
        sb.append(", mData=null, mItemCount=");
        sb.append(this.f5821);
        sb.append(", mIsMeasuring=");
        sb.append(this.f5835);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.f5820);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.f5828);
        sb.append(", mStructureChanged=");
        sb.append(this.f5831);
        sb.append(", mInPreLayout=");
        sb.append(this.f5832);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.f5822);
        sb.append(", mRunPredictiveAnimations=");
        return AbstractC0002.m38(sb, this.f5825, '}');
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m4948() {
        return this.f5832 ? this.f5820 - this.f5828 : this.f5821;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4949(int i) {
        if ((this.f5834 & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f5834));
    }
}
