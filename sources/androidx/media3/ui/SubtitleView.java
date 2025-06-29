package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.bumptech.glide.ﹳﹳ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p112.C1808;
import p112.C1812;
import p112.InterfaceC1813;
import p272.C3299;
import p272.C3330;
import p272.C3336;
import p272.InterfaceC3298;
import p383.AbstractC4470;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C3299 f1500;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f1501;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public InterfaceC3298 f1502;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public float f1503;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public View f1504;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public float f1505;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public List f1506;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f1507;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f1508;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1506 = Collections.emptyList();
        this.f1500 = C3299.f12841;
        this.f1503 = 0.0533f;
        this.f1505 = 0.08f;
        this.f1501 = true;
        this.f1507 = true;
        C3336 c3336 = new C3336(context);
        this.f1502 = c3336;
        this.f1504 = c3336;
        addView(c3336);
        this.f1508 = 1;
    }

    private List<C1808> getCuesWithStylingPreferencesApplied() {
        if (this.f1501 && this.f1507) {
            return this.f1506;
        }
        ArrayList arrayList = new ArrayList(this.f1506.size());
        for (int i = 0; i < this.f1506.size(); i++) {
            C1812 c1812M5555 = ((C1808) this.f1506.get(i)).m5555();
            if (!this.f1501) {
                c1812M5555.f7023 = false;
                CharSequence charSequence = c1812M5555.f7020;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c1812M5555.f7020 = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c1812M5555.f7020;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC1813)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                ﹳﹳ.יʻ(c1812M5555);
            } else if (!this.f1507) {
                ﹳﹳ.יʻ(c1812M5555);
            }
            arrayList.add(c1812M5555.m5556());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C3299 getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        C3299 c3299 = C3299.f12841;
        if (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c3299;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (AbstractC4470.f17202 >= 21) {
            return new C3299(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new C3299(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & InterfaceC3298> void setView(T t) {
        removeView(this.f1504);
        View view = this.f1504;
        if (view instanceof C3330) {
            ((C3330) view).f12979.destroy();
        }
        this.f1504 = t;
        this.f1502 = t;
        addView(t);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f1507 = z;
        m1160();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f1501 = z;
        m1160();
    }

    public void setBottomPaddingFraction(float f) {
        this.f1505 = f;
        m1160();
    }

    public void setCues(List<C1808> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f1506 = list;
        m1160();
    }

    public void setFractionalTextSize(float f) {
        this.f1503 = f;
        m1160();
    }

    public void setStyle(C3299 c3299) {
        this.f1500 = c3299;
        m1160();
    }

    public void setViewType(int i) {
        if (this.f1508 == i) {
            return;
        }
        if (i == 1) {
            setView(new C3336(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new C3330(getContext()));
        }
        this.f1508 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m1159() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m1160() {
        this.f1502.mo8105(getCuesWithStylingPreferencesApplied(), this.f1500, this.f1503, this.f1505);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m1161() {
        setStyle(getUserCaptionStyle());
    }
}
