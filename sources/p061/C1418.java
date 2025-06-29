package p061;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: ʾـ.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1418 extends C1425 {

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final /* synthetic */ Object f5779;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final /* synthetic */ int f5780;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1418(Object obj, Context context, int i) {
        super(context);
        this.f5780 = i;
        this.f5779 = obj;
    }

    @Override // p061.C1425
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int mo4911(View view, int i) {
        switch (this.f5780) {
            case 1:
                ((CarouselLayoutManager) this.f5779).getClass();
                return 0;
            default:
                return super.mo4911(view, i);
        }
    }

    @Override // p061.C1425
    /* renamed from: ʿʼ */
    public int mo961(int i) {
        switch (this.f5780) {
            case 0:
                return Math.min(100, super.mo961(i));
            default:
                return super.mo961(i);
        }
    }

    @Override // p061.C1425
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int mo4912(View view, int i) {
        switch (this.f5780) {
            case 1:
                ((CarouselLayoutManager) this.f5779).getClass();
                return 0;
            default:
                return super.mo4912(view, i);
        }
    }

    @Override // p061.C1425
    /* renamed from: ٴˎ */
    public PointF mo944(int i) {
        switch (this.f5780) {
            case 1:
                ((CarouselLayoutManager) this.f5779).getClass();
                return null;
            default:
                return super.mo944(i);
        }
    }

    @Override // p061.C1425
    /* renamed from: ﹳﹳ */
    public float mo963(DisplayMetrics displayMetrics) {
        switch (this.f5780) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo963(displayMetrics);
        }
    }

    @Override // p061.C1425
    /* renamed from: ﹶˆ */
    public void mo964(View view, C1364 c1364) {
        switch (this.f5780) {
            case 0:
                C1439 c1439 = (C1439) this.f5779;
                int[] iArrM4986 = c1439.m4986(c1439.f5903.getLayoutManager(), view);
                int i = iArrM4986[0];
                int i2 = iArrM4986[1];
                int iCeil = (int) Math.ceil(mo961(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f5806;
                    c1364.f5534 = i;
                    c1364.f5531 = i2;
                    c1364.f5533 = iCeil;
                    c1364.f5532 = decelerateInterpolator;
                    c1364.f5535 = true;
                    break;
                }
                break;
            default:
                super.mo964(view, c1364);
                break;
        }
    }
}
