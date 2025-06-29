package p226;

import android.window.BackEvent;

/* renamed from: ˑʽ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3039 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C3039 f11729 = new C3039();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float m7531(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float m7532(BackEvent backEvent) {
        return backEvent.getTouchY();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m7533(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final BackEvent m7534(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float m7535(BackEvent backEvent) {
        return backEvent.getTouchX();
    }
}
