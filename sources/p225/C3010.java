package p225;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p182.C2529;
import ᴵﹳ.ٴˎ;

/* renamed from: ˏᵢ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3010 extends ContentFrameLayout {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C3017 f11565;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3010(LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017, C2529 c2529) {
        super(c2529, null);
        this.f11565 = layoutInflaterFactory2C3017;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f11565.m7478(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = this.f11565;
                layoutInflaterFactory2C3017.m7471(layoutInflaterFactory2C3017.m7479(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(ٴˎ.ˏᵢ(getContext(), i));
    }
}
