package p225;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.leanback.widget.ViewOnClickListenerC0202;
import java.lang.ref.WeakReference;
import org.lsposed.hiddenapibypass.library.R;
import p149.HandlerC2291;
import p300.AbstractC3505;

/* renamed from: ˏᵢ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3022 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final DialogInterfaceC2998 f11664;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public CharSequence f11665;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public TextView f11666;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f11667;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final HandlerC2291 f11668;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final int f11669;

    /* renamed from: ˉי, reason: contains not printable characters */
    public CharSequence f11670;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public Button f11671;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public TextView f11672;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public CharSequence f11673;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f11674;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public NestedScrollView f11675;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public Message f11676;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public Button f11677;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Window f11679;

    /* renamed from: ˑי, reason: contains not printable characters */
    public CharSequence f11680;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f11682;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public AlertController$RecycleListView f11683;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public View f11684;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean f11685;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f11686;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public Message f11687;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public Drawable f11688;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public Message f11689;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public ImageView f11691;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final int f11692;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public CharSequence f11693;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Button f11694;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public ListAdapter f11695;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public View f11696;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f11678 = false;

    /* renamed from: יʻ, reason: contains not printable characters */
    public int f11681 = -1;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final ViewOnClickListenerC0202 f11690 = new ViewOnClickListenerC0202(6, this);

    public C3022(Context context, DialogInterfaceC2998 dialogInterfaceC2998, Window window) {
        this.f11682 = context;
        this.f11664 = dialogInterfaceC2998;
        this.f11679 = window;
        HandlerC2291 handlerC2291 = new HandlerC2291();
        handlerC2291.f9066 = new WeakReference(dialogInterfaceC2998);
        this.f11668 = handlerC2291;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC3505.f13574, R.attr._2_res_0x7f040031, 0);
        this.f11692 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f11669 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f11686 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f11667 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f11674 = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f11685 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC2998.m7428().mo7451(1);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m7513(ViewGroup viewGroup, View view, View view2) {
        if (view != null) {
            view.setVisibility(viewGroup.canScrollVertically(-1) ? 0 : 4);
        }
        if (view2 != null) {
            view2.setVisibility(viewGroup.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static ViewGroup m7514(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m7515(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m7515(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m7516(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f11668.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f11680 = charSequence;
            this.f11689 = messageObtainMessage;
        } else if (i == -2) {
            this.f11673 = charSequence;
            this.f11687 = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f11670 = charSequence;
            this.f11676 = messageObtainMessage;
        }
    }
}
