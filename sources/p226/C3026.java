package p226;

import android.window.BackEvent;
import ˆʽ.ᵎˏ;

/* renamed from: ˑʽ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3026 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float f11700;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float f11701;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float f11702;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f11703;

    public C3026(BackEvent backEvent) {
        C3039 c3039 = C3039.f11729;
        float fM7535 = c3039.m7535(backEvent);
        float fM7532 = c3039.m7532(backEvent);
        float fM7531 = c3039.m7531(backEvent);
        int iM7533 = c3039.m7533(backEvent);
        this.f11702 = fM7535;
        this.f11700 = fM7532;
        this.f11701 = fM7531;
        this.f11703 = iM7533;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f11702);
        sb.append(", touchY=");
        sb.append(this.f11700);
        sb.append(", progress=");
        sb.append(this.f11701);
        sb.append(", swipeEdge=");
        return ᵎˏ.ᵎـ(sb, this.f11703, '}');
    }
}
