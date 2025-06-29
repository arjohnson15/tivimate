package p259;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import org.lsposed.hiddenapibypass.library.R;
import p213.InterfaceC2811;
import p329.AbstractC3740;
import p346.C3993;
import p346.InterfaceC3990;

/* renamed from: יᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3216 implements InterfaceC3214 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3217 f12524;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Animatable f12525;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ int f12526;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ImageView f12527;

    public C3216(ImageView imageView, int i) {
        this.f12526 = i;
        AbstractC3740.m8706(imageView, "Argument must not be null");
        this.f12527 = imageView;
        this.f12524 = new C3217(imageView);
    }

    public final String toString() {
        return "Target for: " + this.f12527;
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ʽᐧ */
    public final void mo1557(Drawable drawable) {
        m7916(null);
        this.f12525 = null;
        this.f12527.setImageDrawable(drawable);
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ʿʼ */
    public final void mo1558(Drawable drawable) {
        m7916(null);
        this.f12525 = null;
        this.f12527.setImageDrawable(drawable);
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˉי */
    public final void mo1559() {
        Animatable animatable = this.f12525;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m7916(Object obj) {
        switch (this.f12526) {
            case 0:
                this.f12527.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f12527.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˏʾ */
    public final void mo1560() {
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ˏᵢ */
    public final void mo1561(Drawable drawable) {
        C3217 c3217 = this.f12524;
        ViewTreeObserver viewTreeObserver = c3217.f12531.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c3217.f12530);
        }
        c3217.f12530 = null;
        c3217.f12529.clear();
        Animatable animatable = this.f12525;
        if (animatable != null) {
            animatable.stop();
        }
        m7916(null);
        this.f12525 = null;
        this.f12527.setImageDrawable(drawable);
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˑʽ */
    public final void mo1562() {
        Animatable animatable = this.f12525;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ـﹶ */
    public final void mo1563(C3993 c3993) {
        C3217 c3217 = this.f12524;
        ImageView imageView = c3217.f12531;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iM7917 = c3217.m7917(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = c3217.f12531;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iM79172 = c3217.m7917(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM7917 > 0 || iM7917 == Integer.MIN_VALUE) && (iM79172 > 0 || iM79172 == Integer.MIN_VALUE)) {
            c3993.m9254(iM7917, iM79172);
            return;
        }
        ArrayList arrayList = c3217.f12529;
        if (!arrayList.contains(c3993)) {
            arrayList.add(c3993);
        }
        if (c3217.f12530 == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC3213 viewTreeObserverOnPreDrawListenerC3213 = new ViewTreeObserverOnPreDrawListenerC3213(c3217);
            c3217.f12530 = viewTreeObserverOnPreDrawListenerC3213;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3213);
        }
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ٴˎ */
    public final void mo1564(C3993 c3993) {
        this.f12524.f12529.remove(c3993);
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ᐧʻ */
    public final InterfaceC3990 mo1565() {
        Object tag = this.f12527.getTag(R.id._2_res_0x7f0b01a9);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC3990) {
            return (InterfaceC3990) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ﹳﹳ */
    public final void mo1566(InterfaceC3990 interfaceC3990) {
        this.f12527.setTag(R.id._2_res_0x7f0b01a9, interfaceC3990);
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ﹶˆ */
    public final void mo1567(Object obj, InterfaceC2811 interfaceC2811) {
        if (interfaceC2811 != null && interfaceC2811.mo7092(obj, this)) {
            if (!(obj instanceof Animatable)) {
                this.f12525 = null;
                return;
            }
            Animatable animatable = (Animatable) obj;
            this.f12525 = animatable;
            animatable.start();
            return;
        }
        m7916(obj);
        if (!(obj instanceof Animatable)) {
            this.f12525 = null;
            return;
        }
        Animatable animatable2 = (Animatable) obj;
        this.f12525 = animatable2;
        animatable2.start();
    }
}
