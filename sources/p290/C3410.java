package p290;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import ˎˊ.ˏʾ;

/* renamed from: ٴٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3410 extends ˏʾ {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f13267;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final SideSheetBehavior f13268;

    public /* synthetic */ C3410(SideSheetBehavior sideSheetBehavior, int i) {
        this.f13267 = i;
        this.f13268 = sideSheetBehavior;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final int m8274() {
        switch (this.f13267) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f13268;
                return (-sideSheetBehavior.f3370) - sideSheetBehavior.f3375;
            default:
                return this.f13268.f3372;
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean m8275(float f) {
        switch (this.f13267) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final int m8276() {
        switch (this.f13267) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final int m8277() {
        switch (this.f13267) {
            case 0:
                return this.f13268.f3375;
            default:
                return this.f13268.f3372;
        }
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean m8278(View view) {
        switch (this.f13267) {
            case 0:
                if (view.getRight() < (m8285() - m8274()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (m8285() + this.f13268.f3372) / 2) {
                }
                break;
        }
        return false;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final int m8279(CoordinatorLayout coordinatorLayout) {
        switch (this.f13267) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final boolean m8280(View view, float f) {
        switch (this.f13267) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f13268;
                float fAbs = Math.abs((f * sideSheetBehavior.f3374) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f13268;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.f3374) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int m8281(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f13267) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final float m8282(int i) {
        switch (this.f13267) {
            case 0:
                float fM8274 = m8274();
                return (i - fM8274) / (m8285() - fM8274);
            default:
                float f = this.f13268.f3372;
                return (f - i) / (f - m8285());
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean m8283(float f, float f2) {
        switch (this.f13267) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs = Math.abs(f);
                    this.f13268.getClass();
                    if (fAbs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs2 = Math.abs(f);
                    this.f13268.getClass();
                    if (fAbs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final void m8284(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f13267) {
            case 0:
                if (i <= this.f13268.f3372) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f13268.f3372;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final int m8285() {
        switch (this.f13267) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f13268;
                return Math.max(0, sideSheetBehavior.f3382 + sideSheetBehavior.f3375);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f13268;
                return Math.max(0, (sideSheetBehavior2.f3372 - sideSheetBehavior2.f3370) - sideSheetBehavior2.f3375);
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final int m8286(View view) {
        switch (this.f13267) {
            case 0:
                return view.getRight() + this.f13268.f3375;
            default:
                return view.getLeft() - this.f13268.f3375;
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final int m8287() {
        switch (this.f13267) {
            case 0:
                return -this.f13268.f3370;
            default:
                return m8285();
        }
    }
}
