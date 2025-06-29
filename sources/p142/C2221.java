package p142;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p171.InterfaceC2463;
import ﹶⁱ.ـﹶ;

/* renamed from: ˉי.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2221 extends AbstractC2224 implements InterfaceC2463 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public int f8826;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public C2220 f8827;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public C2220 f8828;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean f8829;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public int f8830;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public ـﹶ f8831;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean f8832;

    public C2221(C2220 c2220, Resources resources) {
        this.f8840 = 255;
        this.f8848 = -1;
        this.f8826 = -1;
        this.f8830 = -1;
        mo6198(new C2220(c2220, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0276, code lost:
    
        return r5;
     */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p142.C2221 m6196(android.content.Context r20, android.content.res.Resources r21, android.content.res.XmlResourceParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p142.C2221.m6196(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):ˉי.ʿʼ");
    }

    @Override // p142.AbstractC2224, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // p142.AbstractC2224, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ـﹶ r0 = this.f8831;
        if (r0 != null) {
            r0.ᴵʼ();
            this.f8831 = null;
            m6206(this.f8826);
            this.f8826 = -1;
            this.f8830 = -1;
        }
    }

    @Override // p142.AbstractC2224, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f8829) {
            m6197();
            C2220 c2220 = this.f8827;
            c2220.f8798 = c2220.f8798.clone();
            c2220.f8809 = c2220.f8809.clone();
            this.f8829 = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r14) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p142.C2221.onStateChange(int[]):boolean");
    }

    @Override // p142.AbstractC2224, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        ـﹶ r1 = this.f8831;
        if (r1 != null && (visible || z2)) {
            if (z) {
                r1.ـˆ();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Drawable m6197() {
        if (!this.f8832) {
            super.mutate();
            C2220 c2220 = this.f8828;
            c2220.f8798 = c2220.f8798.clone();
            c2220.f8809 = c2220.f8809.clone();
            this.f8832 = true;
        }
        return this;
    }

    @Override // p142.AbstractC2224
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo6198(C2220 c2220) {
        this.f8845 = c2220;
        int i = this.f8848;
        if (i >= 0) {
            Drawable drawableM6195 = c2220.m6195(i);
            this.f8842 = drawableM6195;
            if (drawableM6195 != null) {
                m6205(drawableM6195);
            }
        }
        this.f8844 = null;
        this.f8828 = c2220;
        this.f8827 = c2220;
    }
}
