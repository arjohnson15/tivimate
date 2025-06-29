package p320;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import org.lsposed.hiddenapibypass.library.R;
import p222.C2864;

/* renamed from: ᴵʿ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3658 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final MenuC3643 f13997;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public View f13998;

    /* renamed from: ˉי, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f13999;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public InterfaceC3660 f14001;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f14002;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f14003;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f14005;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f14006;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public AbstractC3647 f14007;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f14004 = 8388611;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C2864 f14000 = new C2864(1, this);

    public C3658(int i, Context context, View view, MenuC3643 menuC3643, boolean z) {
        this.f14003 = context;
        this.f13997 = menuC3643;
        this.f13998 = view;
        this.f14002 = z;
        this.f14006 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m8618() {
        AbstractC3647 abstractC3647 = this.f14007;
        return abstractC3647 != null && abstractC3647.mo7318();
    }

    /* renamed from: ˑʽ */
    public void mo7281() {
        this.f14007 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f13999;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC3647 m8619() {
        AbstractC3647 viewOnKeyListenerC3661;
        if (this.f14007 == null) {
            Context context = this.f14003;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070016)) {
                viewOnKeyListenerC3661 = new ViewOnKeyListenerC3662(context, this.f13998, this.f14006, this.f14002);
            } else {
                View view = this.f13998;
                Context context2 = this.f14003;
                boolean z = this.f14002;
                viewOnKeyListenerC3661 = new ViewOnKeyListenerC3661(this.f14006, context2, view, this.f13997, z);
            }
            viewOnKeyListenerC3661.mo8607(this.f13997);
            viewOnKeyListenerC3661.mo8608(this.f14000);
            viewOnKeyListenerC3661.mo8611(this.f13998);
            viewOnKeyListenerC3661.mo7255(this.f14001);
            viewOnKeyListenerC3661.mo8609(this.f14005);
            viewOnKeyListenerC3661.mo8610(this.f14004);
            this.f14007 = viewOnKeyListenerC3661;
        }
        return this.f14007;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m8620(int i, int i2, boolean z, boolean z2) {
        AbstractC3647 abstractC3647M8619 = m8619();
        abstractC3647M8619.mo8612(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f14004, this.f13998.getLayoutDirection()) & 7) == 5) {
                i -= this.f13998.getWidth();
            }
            abstractC3647M8619.mo8613(i);
            abstractC3647M8619.mo8614(i2);
            int i3 = (int) ((this.f14003.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC3647M8619.f13957 = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC3647M8619.mo7326();
    }
}
