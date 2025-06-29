package p222;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p371.AbstractC4205;

/* renamed from: ˏᴵ.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2859 extends AbstractC4205 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public final /* synthetic */ WeakReference f11114;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final /* synthetic */ C2941 f11115;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ int f11116;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final /* synthetic */ int f11117;

    public C2859(C2941 c2941, int i, int i2, WeakReference weakReference) {
        this.f11115 = c2941;
        this.f11116 = i;
        this.f11117 = i2;
        this.f11114 = weakReference;
    }

    @Override // p371.AbstractC4205
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo7176(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f11116) != -1) {
            typeface = AbstractC2899.m7241(typeface, i, (this.f11117 & 2) != 0);
        }
        C2941 c2941 = this.f11115;
        if (c2941.f11369) {
            c2941.f11368 = typeface;
            TextView textView = (TextView) this.f11114.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC2949(textView, typeface, c2941.f11367, 0));
                } else {
                    textView.setTypeface(typeface, c2941.f11367);
                }
            }
        }
    }

    @Override // p371.AbstractC4205
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo7177(int i) {
    }
}
