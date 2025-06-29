package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import org.lsposed.hiddenapibypass.library.R;

/* loaded from: classes.dex */
public class SpeechOrbView extends SearchOrbView {

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public C0166 f964;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public int f965;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public boolean f966;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final float f967;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public C0166 f968;

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f965 = 0;
        this.f966 = false;
        Resources resources = context.getResources();
        this.f967 = resources.getFraction(R.fraction._2_res_0x7f0a0006, 1, 1);
        this.f964 = new C0166(resources.getColor(R.color._2_res_0x7f0600f8), resources.getColor(R.color._2_res_0x7f0600fa), resources.getColor(R.color._2_res_0x7f0600f9));
        this.f968 = new C0166(resources.getColor(R.color._2_res_0x7f0600fb), resources.getColor(R.color._2_res_0x7f0600fb), 0);
        m881();
    }

    @Override // androidx.leanback.widget.SearchOrbView
    public int getLayoutResourceId() {
        return R.layout.lb_speech_orb;
    }

    public void setListeningOrbColors(C0166 c0166) {
        this.f968 = c0166;
    }

    public void setNotListeningOrbColors(C0166 c0166) {
        this.f964 = c0166;
    }

    public void setSoundLevel(int i) {
        if (this.f966) {
            int i2 = this.f965;
            if (i > i2) {
                this.f965 = ((i - i2) / 2) + i2;
            } else {
                this.f965 = (int) (i2 * 0.7f);
            }
            float focusedZoom = (((this.f967 - getFocusedZoom()) * this.f965) / 100.0f) + 1.0f;
            View view = this.f937;
            view.setScaleX(focusedZoom);
            view.setScaleY(focusedZoom);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m881() {
        setOrbColors(this.f964);
        setOrbIcon(getResources().getDrawable(R.drawable._2_res_0x7f080193));
        m879(hasFocus());
        View view = this.f937;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.f966 = false;
    }
}
