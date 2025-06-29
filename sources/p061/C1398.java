package p061;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: ʾـ.ـᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1398 extends ViewGroup.MarginLayoutParams {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Rect f5700;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f5701;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public AbstractC1375 f5702;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f5703;

    public C1398(int i, int i2) {
        super(i, i2);
        this.f5700 = new Rect();
        this.f5701 = true;
        this.f5703 = false;
    }

    public C1398(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5700 = new Rect();
        this.f5701 = true;
        this.f5703 = false;
    }

    public C1398(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5700 = new Rect();
        this.f5701 = true;
        this.f5703 = false;
    }

    public C1398(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5700 = new Rect();
        this.f5701 = true;
        this.f5703 = false;
    }

    public C1398(C1398 c1398) {
        super((ViewGroup.LayoutParams) c1398);
        this.f5700 = new Rect();
        this.f5701 = true;
        this.f5703 = false;
    }
}
