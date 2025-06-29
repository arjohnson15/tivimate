package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.lsposed.hiddenapibypass.library.R;

/* loaded from: classes.dex */
public class MediaNowPlayingView extends LinearLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ImageView f853;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ObjectAnimator f854;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ImageView f855;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final ObjectAnimator f856;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ImageView f857;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final ObjectAnimator f858;

    public MediaNowPlayingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        LayoutInflater.from(context).inflate(R.layout._2_res_0x7f0e00bc, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id._2_res_0x7f0b006f);
        this.f857 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id._2_res_0x7f0b0070);
        this.f853 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id._2_res_0x7f0b0071);
        this.f855 = imageView3;
        imageView.setPivotY(imageView.getDrawable().getIntrinsicHeight());
        imageView2.setPivotY(imageView2.getDrawable().getIntrinsicHeight());
        imageView3.setPivotY(imageView3.getDrawable().getIntrinsicHeight());
        setDropScale(imageView);
        setDropScale(imageView2);
        setDropScale(imageView3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "scaleY", 0.41666666f, 0.25f, 0.41666666f, 0.5833333f, 0.75f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.5f, 0.33333334f, 0.16666667f, 0.33333334f, 0.5f, 0.5833333f, 0.75f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.41666666f, 0.25f, 0.33333334f, 0.41666666f);
        this.f856 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setDuration(2320L);
        objectAnimatorOfFloat.setInterpolator(linearInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView2, "scaleY", 1.0f, 0.9166667f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.8333333f, 1.0f, 0.8333333f, 0.75f, 0.6666667f, 1.0f);
        this.f854 = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setDuration(2080L);
        objectAnimatorOfFloat2.setInterpolator(linearInterpolator);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView3, "scaleY", 0.6666667f, 0.75f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.5833333f, 0.6666667f, 0.75f, 1.0f, 0.9166667f, 1.0f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.6666667f);
        this.f858 = objectAnimatorOfFloat3;
        objectAnimatorOfFloat3.setRepeatCount(-1);
        objectAnimatorOfFloat3.setDuration(2000L);
        objectAnimatorOfFloat3.setInterpolator(linearInterpolator);
    }

    public static void setDropScale(View view) {
        view.setScaleY(0.083333336f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            m867();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m866();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            m866();
        } else {
            m867();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m866() {
        ObjectAnimator objectAnimator = this.f856;
        boolean zIsStarted = objectAnimator.isStarted();
        ImageView imageView = this.f857;
        if (zIsStarted) {
            objectAnimator.cancel();
            setDropScale(imageView);
        }
        ObjectAnimator objectAnimator2 = this.f854;
        boolean zIsStarted2 = objectAnimator2.isStarted();
        ImageView imageView2 = this.f853;
        if (zIsStarted2) {
            objectAnimator2.cancel();
            setDropScale(imageView2);
        }
        ObjectAnimator objectAnimator3 = this.f858;
        boolean zIsStarted3 = objectAnimator3.isStarted();
        ImageView imageView3 = this.f855;
        if (zIsStarted3) {
            objectAnimator3.cancel();
            setDropScale(imageView3);
        }
        imageView.setVisibility(8);
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m867() {
        ObjectAnimator objectAnimator = this.f856;
        if (!objectAnimator.isStarted()) {
            objectAnimator.start();
        }
        ObjectAnimator objectAnimator2 = this.f854;
        if (!objectAnimator2.isStarted()) {
            objectAnimator2.start();
        }
        ObjectAnimator objectAnimator3 = this.f858;
        if (!objectAnimator3.isStarted()) {
            objectAnimator3.start();
        }
        this.f857.setVisibility(0);
        this.f853.setVisibility(0);
        this.f855.setVisibility(0);
    }
}
