package p225;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.leanback.widget.ViewOnClickListenerC0202;
import androidx.lifecycle.AbstractC0224;
import com.bumptech.glide.ˑʽ;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p065.ExecutorC1522;
import p182.AbstractC2517;
import p182.C2522;
import p182.InterfaceC2525;
import p222.C2869;
import p226.DialogC3032;
import p331.C3761;
import p378.AbstractC4345;
import p378.AbstractC4372;
import p378.InterfaceC4391;
import ˆˑ.ﹳﹳ;

/* renamed from: ˏᵢ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class DialogInterfaceC2998 extends DialogC3032 implements DialogInterface, InterfaceC2999 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C3021 f11523;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public LayoutInflaterFactory2C3017 f11524;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3022 f11525;

    /* JADX WARN: Type inference failed for: r2v2, types: [ˏᵢ.ﹳﹶ] */
    public DialogInterfaceC2998(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iM7424 = m7424(contextThemeWrapper, i);
        if (iM7424 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr._2_res_0x7f0401dc, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iM7424;
        }
        super(contextThemeWrapper, i2);
        this.f11523 = new InterfaceC4391() { // from class: ˏᵢ.ﹳﹶ
            @Override // p378.InterfaceC4391
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f11663.m7429(keyEvent);
            }
        };
        AbstractC3014 abstractC3014M7428 = m7428();
        if (iM7424 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr._2_res_0x7f0401dc, typedValue2, true);
            iM7424 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C3017) abstractC3014M7428).f11619 = iM7424;
        abstractC3014M7428.mo7449();
        this.f11525 = new C3022(getContext(), this, getWindow());
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m7424(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr._2_res_0x7f040032, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p226.DialogC3032, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) m7428();
        layoutInflaterFactory2C3017.m7468();
        ((ViewGroup) layoutInflaterFactory2C3017.f11652.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C3017.f11632.m7439(layoutInflaterFactory2C3017.f11616.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m7428().mo7445();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ˑʽ.ˏʾ(this.f11523, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) m7428();
        layoutInflaterFactory2C3017.m7468();
        return layoutInflaterFactory2C3017.f11616.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) m7428();
        if (layoutInflaterFactory2C3017.f11649 != null) {
            layoutInflaterFactory2C3017.m7466();
            layoutInflaterFactory2C3017.f11649.getClass();
            layoutInflaterFactory2C3017.m7474(0);
        }
    }

    @Override // p226.DialogC3032, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        int i2 = 0;
        m7427(bundle);
        C3022 c3022 = this.f11525;
        c3022.f11664.setContentView(c3022.f11692);
        Window window = c3022.f11679;
        View viewFindViewById2 = window.findViewById(R.id._2_res_0x7f0b02dc);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id._2_res_0x7f0b03a3);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id._2_res_0x7f0b00f2);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id._2_res_0x7f0b00b4);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id._2_res_0x7f0b010a);
        View view = c3022.f11684;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !C3022.m7515(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id._2_res_0x7f0b0109);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c3022.f11678) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c3022.f11683 != null) {
                ((LinearLayout.LayoutParams) ((C2869) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id._2_res_0x7f0b03a3);
        View viewFindViewById7 = viewGroup.findViewById(R.id._2_res_0x7f0b00f2);
        View viewFindViewById8 = viewGroup.findViewById(R.id._2_res_0x7f0b00b4);
        ViewGroup viewGroupM7514 = C3022.m7514(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM75142 = C3022.m7514(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM75143 = C3022.m7514(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id._2_res_0x7f0b0329);
        c3022.f11675 = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c3022.f11675.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM75142.findViewById(android.R.id.message);
        c3022.f11672 = textView;
        if (textView != null) {
            CharSequence charSequence = c3022.f11665;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c3022.f11675.removeView(c3022.f11672);
                if (c3022.f11683 != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c3022.f11675.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c3022.f11675);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c3022.f11683, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM75142.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupM75143.findViewById(android.R.id.button1);
        c3022.f11694 = button;
        ViewOnClickListenerC0202 viewOnClickListenerC0202 = c3022.f11690;
        button.setOnClickListener(viewOnClickListenerC0202);
        if (TextUtils.isEmpty(c3022.f11670)) {
            c3022.f11694.setVisibility(8);
            i = 0;
        } else {
            c3022.f11694.setText(c3022.f11670);
            c3022.f11694.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupM75143.findViewById(android.R.id.button2);
        c3022.f11671 = button2;
        button2.setOnClickListener(viewOnClickListenerC0202);
        if (TextUtils.isEmpty(c3022.f11673)) {
            c3022.f11671.setVisibility(8);
        } else {
            c3022.f11671.setText(c3022.f11673);
            c3022.f11671.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupM75143.findViewById(android.R.id.button3);
        c3022.f11677 = button3;
        button3.setOnClickListener(viewOnClickListenerC0202);
        if (TextUtils.isEmpty(c3022.f11680)) {
            c3022.f11677.setVisibility(8);
        } else {
            c3022.f11677.setText(c3022.f11680);
            c3022.f11677.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c3022.f11682.getTheme().resolveAttribute(R.attr._2_res_0x7f040030, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c3022.f11694;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c3022.f11671;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c3022.f11677;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM75143.setVisibility(8);
        }
        if (c3022.f11696 != null) {
            viewGroupM7514.addView(c3022.f11696, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id._2_res_0x7f0b039e).setVisibility(8);
        } else {
            c3022.f11691 = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c3022.f11693) || !c3022.f11685) {
                window.findViewById(R.id._2_res_0x7f0b039e).setVisibility(8);
                c3022.f11691.setVisibility(8);
                viewGroupM7514.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id._2_res_0x7f0b0056);
                c3022.f11666 = textView2;
                textView2.setText(c3022.f11693);
                Drawable drawable = c3022.f11688;
                if (drawable != null) {
                    c3022.f11691.setImageDrawable(drawable);
                } else {
                    c3022.f11666.setPadding(c3022.f11691.getPaddingLeft(), c3022.f11691.getPaddingTop(), c3022.f11691.getPaddingRight(), c3022.f11691.getPaddingBottom());
                    c3022.f11691.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupM7514 == null || viewGroupM7514.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupM75143.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupM75142.findViewById(R.id._2_res_0x7f0b0387)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = c3022.f11675;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c3022.f11665 == null && c3022.f11683 == null) ? null : viewGroupM7514.findViewById(R.id._2_res_0x7f0b039b);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM75142.findViewById(R.id._2_res_0x7f0b0388);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c3022.f11683;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z3 || i3 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f43, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f42);
            }
        }
        if (!z2) {
            View view2 = c3022.f11683;
            if (view2 == null) {
                view2 = c3022.f11675;
            }
            if (view2 != null) {
                int i4 = i3 | (z3 ? 2 : 0);
                View viewFindViewById11 = window.findViewById(R.id._2_res_0x7f0b0328);
                View viewFindViewById12 = window.findViewById(R.id._2_res_0x7f0b0327);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 23) {
                    WeakHashMap weakHashMap = AbstractC4345.f16838;
                    if (i5 >= 23) {
                        AbstractC4372.m9958(view2, i4, 3);
                    }
                    if (viewFindViewById11 != null) {
                        viewGroupM75142.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupM75142.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i4 & 1) == 0) {
                        viewGroupM75142.removeView(viewFindViewById11);
                        viewFindViewById11 = null;
                    }
                    if (viewFindViewById12 != null && (2 & i4) == 0) {
                        viewGroupM75142.removeView(viewFindViewById12);
                        viewFindViewById12 = null;
                    }
                    if (viewFindViewById11 != null || viewFindViewById12 != null) {
                        if (c3022.f11665 != null) {
                            c3022.f11675.setOnScrollChangeListener(new C3761(viewFindViewById11, 10, viewFindViewById12));
                            c3022.f11675.post(new RunnableC2983(c3022, viewFindViewById11, viewFindViewById12, i2));
                        } else {
                            AlertController$RecycleListView alertController$RecycleListView2 = c3022.f11683;
                            if (alertController$RecycleListView2 != null) {
                                alertController$RecycleListView2.setOnScrollListener(new C3001(viewFindViewById11, viewFindViewById12));
                                c3022.f11683.post(new RunnableC2983(c3022, viewFindViewById11, viewFindViewById12, 1));
                            } else {
                                if (viewFindViewById11 != null) {
                                    viewGroupM75142.removeView(viewFindViewById11);
                                }
                                if (viewFindViewById12 != null) {
                                    viewGroupM75142.removeView(viewFindViewById12);
                                }
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = c3022.f11683;
        if (alertController$RecycleListView3 == null || (listAdapter = c3022.f11695) == null) {
            return;
        }
        alertController$RecycleListView3.setAdapter(listAdapter);
        int i6 = c3022.f11681;
        if (i6 > -1) {
            alertController$RecycleListView3.setItemChecked(i6, true);
            alertController$RecycleListView3.setSelection(i6);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f11525.f11675;
        if (nestedScrollView == null || !nestedScrollView.m216(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f11525.f11675;
        if (nestedScrollView == null || !nestedScrollView.m216(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // p226.DialogC3032, android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) m7428();
        layoutInflaterFactory2C3017.m7466();
        C3016 c3016 = layoutInflaterFactory2C3017.f11649;
        if (c3016 != null) {
            c3016.f11601 = false;
            C2522 c2522 = c3016.f11599;
            if (c2522 != null) {
                c2522.m6663();
            }
        }
    }

    @Override // p225.InterfaceC2999
    public final void onSupportActionModeFinished(AbstractC2517 abstractC2517) {
    }

    @Override // p225.InterfaceC2999
    public final void onSupportActionModeStarted(AbstractC2517 abstractC2517) {
    }

    @Override // p225.InterfaceC2999
    public final AbstractC2517 onWindowStartingSupportActionMode(InterfaceC2525 interfaceC2525) {
        return null;
    }

    @Override // p226.DialogC3032, android.app.Dialog
    public final void setContentView(int i) {
        m7425();
        m7428().mo7448(i);
    }

    @Override // p226.DialogC3032, android.app.Dialog
    public final void setContentView(View view) {
        m7425();
        m7428().mo7452(view);
    }

    @Override // p226.DialogC3032, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m7425();
        m7428().mo7446(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m7428().mo7447(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m7426(charSequence);
        C3022 c3022 = this.f11525;
        c3022.f11693 = charSequence;
        TextView textView = c3022.f11666;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m7425() {
        AbstractC0224.m1025(getWindow().getDecorView(), this);
        ﹳﹳ.ﹳˑ(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id._2_res_0x7f0b0421, this);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m7426(CharSequence charSequence) {
        super.setTitle(charSequence);
        m7428().mo7447(charSequence);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m7427(Bundle bundle) {
        m7428().mo7450();
        super.onCreate(bundle);
        m7428().mo7449();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC3014 m7428() {
        if (this.f11524 == null) {
            ExecutorC1522 executorC1522 = AbstractC3014.f11577;
            this.f11524 = new LayoutInflaterFactory2C3017(getContext(), getWindow(), this, this);
        }
        return this.f11524;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m7429(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
