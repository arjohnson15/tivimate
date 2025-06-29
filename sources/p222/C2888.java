package p222;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import org.lsposed.hiddenapibypass.library.R;
import ˈⁱ.ˉⁱ;

/* renamed from: ˏᴵ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2888 extends AppCompatImageView implements InterfaceC2890 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C2908 f11195;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2888(C2908 c2908, Context context) {
        super(context, null, R.attr._2_res_0x7f040021);
        this.f11195 = c2908;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        ˉⁱ.ˈٴ(this, getContentDescription());
        setOnTouchListener(new C2969(this, this));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f11195.m7254();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }

    @Override // p222.InterfaceC2890
    /* renamed from: ʽᐧ */
    public final boolean mo104() {
        return false;
    }

    @Override // p222.InterfaceC2890
    /* renamed from: ـﹶ */
    public final boolean mo107() {
        return false;
    }
}
