package p004;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: ʻʿ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0932 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static float m3789(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static float m3790(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static EdgeEffect m3791(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }
}
