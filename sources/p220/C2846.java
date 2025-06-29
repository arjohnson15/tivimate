package p220;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p228.C3057;
import p255.C3189;

/* renamed from: ˏٴ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2846 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final WeakReference f11066;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public float f11067;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C3057 f11069;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final TextPaint f11068 = new TextPaint(1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2854 f11065 = new C2854(0, this);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f11070 = true;

    public C2846(C3189 c3189) {
        this.f11066 = new WeakReference(null);
        this.f11066 = new WeakReference(c3189);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float m7134(String str) {
        if (!this.f11070) {
            return this.f11067;
        }
        TextPaint textPaint = this.f11068;
        this.f11067 = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f11070 = false;
        return this.f11067;
    }
}
