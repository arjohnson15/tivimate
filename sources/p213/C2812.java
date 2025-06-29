package p213;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import p259.C3216;

/* renamed from: ˏˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2812 implements InterfaceC2811, InterfaceC2813 {
    @Override // p213.InterfaceC2813
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public InterfaceC2811 mo7093(int i) {
        return C2810.f10953;
    }

    @Override // p213.InterfaceC2811
    /* renamed from: ـﹶ */
    public boolean mo7092(Object obj, C3216 c3216) {
        Drawable drawable = (Drawable) obj;
        ImageView imageView = c3216.f12527;
        Drawable drawable2 = imageView.getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(150);
        imageView.setImageDrawable(transitionDrawable);
        return true;
    }
}
