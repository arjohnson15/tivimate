package p225;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import p320.DialogInterfaceOnKeyListenerC3648;

/* renamed from: ˏᵢ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2990 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f11506;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3009 f11507;

    public C2990(Context context) {
        this(context, DialogInterfaceC2998.m7424(context, 0));
    }

    public C2990(Context context, int i) {
        this.f11507 = new C3009(new ContextThemeWrapper(context, DialogInterfaceC2998.m7424(context, i)));
        this.f11506 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    public DialogInterfaceC2998 create() {
        ?? c3000;
        C3009 c3009 = this.f11507;
        DialogInterfaceC2998 dialogInterfaceC2998 = new DialogInterfaceC2998(c3009.f11556, this.f11506);
        View view = c3009.f11546;
        C3022 c3022 = dialogInterfaceC2998.f11525;
        if (view != null) {
            c3022.f11696 = view;
        } else {
            CharSequence charSequence = c3009.f11563;
            if (charSequence != null) {
                c3022.f11693 = charSequence;
                TextView textView = c3022.f11666;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c3009.f11554;
            if (drawable != null) {
                c3022.f11688 = drawable;
                ImageView imageView = c3022.f11691;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c3022.f11691.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c3009.f11557;
        if (charSequence2 != null) {
            c3022.f11665 = charSequence2;
            TextView textView2 = c3022.f11672;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c3009.f11558;
        if (charSequence3 != null) {
            c3022.m7516(-1, charSequence3, c3009.f11553);
        }
        CharSequence charSequence4 = c3009.f11564;
        if (charSequence4 != null) {
            c3022.m7516(-2, charSequence4, c3009.f11547);
        }
        if (c3009.f11548 != null || c3009.f11549 != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c3009.f11545.inflate(c3022.f11669, (ViewGroup) null);
            boolean z = c3009.f11561;
            ContextThemeWrapper contextThemeWrapper = c3009.f11556;
            if (z) {
                c3000 = new C3020(c3009, contextThemeWrapper, c3022.f11686, c3009.f11548, alertController$RecycleListView);
            } else {
                int i = c3009.f11550 ? c3022.f11667 : c3022.f11674;
                Object obj = c3009.f11549;
                c3000 = obj;
                if (obj == null) {
                    c3000 = new C3000(contextThemeWrapper, i, R.id.text1, c3009.f11548);
                }
            }
            c3022.f11695 = c3000;
            c3022.f11681 = c3009.f11560;
            if (c3009.f11559 != null) {
                alertController$RecycleListView.setOnItemClickListener(new C2985(c3009, c3022));
            } else if (c3009.f11562 != null) {
                alertController$RecycleListView.setOnItemClickListener(new C3008(c3009, alertController$RecycleListView, c3022));
            }
            if (c3009.f11550) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (c3009.f11561) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            c3022.f11683 = alertController$RecycleListView;
        }
        View view2 = c3009.f11552;
        if (view2 != null) {
            c3022.f11684 = view2;
            c3022.f11678 = false;
        }
        dialogInterfaceC2998.setCancelable(true);
        dialogInterfaceC2998.setCanceledOnTouchOutside(true);
        dialogInterfaceC2998.setOnCancelListener(null);
        dialogInterfaceC2998.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC3648 dialogInterfaceOnKeyListenerC3648 = c3009.f11551;
        if (dialogInterfaceOnKeyListenerC3648 != null) {
            dialogInterfaceC2998.setOnKeyListener(dialogInterfaceOnKeyListenerC3648);
        }
        return dialogInterfaceC2998;
    }

    public Context getContext() {
        return this.f11507.f11556;
    }

    public C2990 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C3009 c3009 = this.f11507;
        c3009.f11564 = c3009.f11556.getText(i);
        c3009.f11547 = onClickListener;
        return this;
    }

    public C2990 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C3009 c3009 = this.f11507;
        c3009.f11558 = c3009.f11556.getText(i);
        c3009.f11553 = onClickListener;
        return this;
    }

    public C2990 setTitle(CharSequence charSequence) {
        this.f11507.f11563 = charSequence;
        return this;
    }

    public C2990 setView(View view) {
        this.f11507.f11552 = view;
        return this;
    }
}
