package p225;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p182.C2519;
import p182.C2522;
import p222.C2885;
import p222.InterfaceC2911;
import p222.InterfaceC2942;
import p225.C3016;
import p300.AbstractC3505;
import p331.C3759;
import p378.AbstractC4339;
import p378.AbstractC4345;
import p378.AbstractC4362;
import p378.C4361;

/* renamed from: ˏᵢ.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3016 extends AbstractC3007 implements InterfaceC2911 {

    /* renamed from: יʻ, reason: contains not printable characters */
    public static final AccelerateInterpolator f11580 = new AccelerateInterpolator();

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static final DecelerateInterpolator f11581 = new DecelerateInterpolator();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Context f11582;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public InterfaceC2942 f11583;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public boolean f11584;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C2997 f11585;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f11586;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final C3003 f11587;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final ArrayList f11588;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean f11589;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public C3759 f11590;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean f11591;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f11592;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public ActionBarOverlayLayout f11593;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f11594;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Context f11595;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public ActionBarContextView f11596;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final View f11597;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f11598;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public C2522 f11599;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f11600;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public boolean f11601;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public ActionBarContainer f11602;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C2997 f11603;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final ᵢٴ f11604;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final C3003 f11605;

    public C3016(Activity activity, boolean z) {
        new ArrayList();
        this.f11588 = new ArrayList();
        this.f11598 = 0;
        this.f11591 = true;
        this.f11589 = true;
        this.f11587 = new C3003(this, 0);
        this.f11605 = new C3003(this, 1);
        this.f11604 = new ᵢٴ(0, this);
        View decorView = activity.getWindow().getDecorView();
        m7456(decorView);
        if (z) {
            return;
        }
        this.f11597 = decorView.findViewById(R.id.content);
    }

    public C3016(Dialog dialog) {
        new ArrayList();
        this.f11588 = new ArrayList();
        this.f11598 = 0;
        this.f11591 = true;
        this.f11589 = true;
        this.f11587 = new C3003(this, 0);
        this.f11605 = new C3003(this, 1);
        this.f11604 = new ᵢٴ(0, this);
        m7456(dialog.getWindow().getDecorView());
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Context m7454() {
        if (this.f11582 == null) {
            TypedValue typedValue = new TypedValue();
            this.f11595.getTheme().resolveAttribute(org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04000c, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f11582 = new ContextThemeWrapper(this.f11595, i);
            } else {
                this.f11582 = this.f11595;
            }
        }
        return this.f11582;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m7455(boolean z) {
        if (z) {
            this.f11602.setTabContainer(null);
            ((C2885) this.f11583).getClass();
        } else {
            ((C2885) this.f11583).getClass();
            this.f11602.setTabContainer(null);
        }
        this.f11583.getClass();
        ((C2885) this.f11583).f11179.setCollapsible(false);
        this.f11593.setHasNonEmbeddedTabs(false);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7456(View view) {
        InterfaceC2942 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b0111);
        this.f11593 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b003b);
        if (callbackFindViewById instanceof InterfaceC2942) {
            wrapper = (InterfaceC2942) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f11583 = wrapper;
        this.f11596 = (ActionBarContextView) view.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b0043);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b003d);
        this.f11602 = actionBarContainer;
        InterfaceC2942 interfaceC2942 = this.f11583;
        if (interfaceC2942 == null || this.f11596 == null || actionBarContainer == null) {
            throw new IllegalStateException(C3016.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C2885) interfaceC2942).f11179.getContext();
        this.f11595 = context;
        if ((((C2885) this.f11583).f11170 & 4) != 0) {
            this.f11592 = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f11583.getClass();
        m7455(context.getResources().getBoolean(org.lsposed.hiddenapibypass.library.R.bool._2_res_0x7f050000));
        TypedArray typedArrayObtainStyledAttributes = this.f11595.obtainStyledAttributes(null, AbstractC3505.f13588, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040007, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11593;
            if (!actionBarOverlayLayout2.f131) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f11584 = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f11602;
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            AbstractC4339.m9854(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7457(boolean z) {
        C4361 c4361M119;
        C4361 c4361M1192;
        if (z) {
            if (!this.f11600) {
                this.f11600 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f11593;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m7458(false);
            }
        } else if (this.f11600) {
            this.f11600 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11593;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m7458(false);
        }
        if (!this.f11602.isLaidOut()) {
            if (z) {
                ((C2885) this.f11583).f11179.setVisibility(4);
                this.f11596.setVisibility(0);
                return;
            } else {
                ((C2885) this.f11583).f11179.setVisibility(0);
                this.f11596.setVisibility(8);
                return;
            }
        }
        if (z) {
            C2885 c2885 = (C2885) this.f11583;
            C4361 c4361M9885 = AbstractC4345.m9885(c2885.f11179);
            c4361M9885.m9941(0.0f);
            c4361M9885.m9940(100L);
            c4361M9885.m9942(new C2519(c2885, 4));
            c4361M1192 = this.f11596.m119(0, 200L);
            c4361M119 = c4361M9885;
        } else {
            C2885 c28852 = (C2885) this.f11583;
            C4361 c4361M98852 = AbstractC4345.m9885(c28852.f11179);
            c4361M98852.m9941(1.0f);
            c4361M98852.m9940(200L);
            c4361M98852.m9942(new C2519(c28852, 0));
            c4361M119 = this.f11596.m119(8, 100L);
            c4361M1192 = c4361M98852;
        }
        C2522 c2522 = new C2522();
        ArrayList arrayList = c2522.f10018;
        arrayList.add(c4361M119);
        View view = (View) c4361M119.f16865.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c4361M1192.f16865.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c4361M1192);
        c2522.m6662();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m7458(boolean z) {
        boolean z2 = this.f11600 || !this.f11594;
        View view = this.f11597;
        final ᵢٴ r8 = this.f11604;
        if (!z2) {
            if (this.f11589) {
                this.f11589 = false;
                C2522 c2522 = this.f11599;
                if (c2522 != null) {
                    c2522.m6663();
                }
                int i = this.f11598;
                C3003 c3003 = this.f11587;
                if (i != 0 || (!this.f11601 && !z)) {
                    c3003.m7430();
                    return;
                }
                this.f11602.setAlpha(1.0f);
                this.f11602.setTransitioning(true);
                C2522 c25222 = new C2522();
                float f = -this.f11602.getHeight();
                if (z) {
                    this.f11602.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C4361 c4361M9885 = AbstractC4345.m9885(this.f11602);
                c4361M9885.m9939(f);
                final View view2 = (View) c4361M9885.f16865.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(r8 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: ᵢٴ.ʾʼ
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((C3016) r8.ˆʿ).f11602.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z3 = c25222.f10016;
                ArrayList arrayList = c25222.f10018;
                if (!z3) {
                    arrayList.add(c4361M9885);
                }
                if (this.f11591 && view != null) {
                    C4361 c4361M98852 = AbstractC4345.m9885(view);
                    c4361M98852.m9939(f);
                    if (!c25222.f10016) {
                        arrayList.add(c4361M98852);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f11580;
                boolean z4 = c25222.f10016;
                if (!z4) {
                    c25222.f10017 = accelerateInterpolator;
                }
                if (!z4) {
                    c25222.f10015 = 250L;
                }
                if (!z4) {
                    c25222.f10020 = c3003;
                }
                this.f11599 = c25222;
                c25222.m6662();
                return;
            }
            return;
        }
        if (this.f11589) {
            return;
        }
        this.f11589 = true;
        C2522 c25223 = this.f11599;
        if (c25223 != null) {
            c25223.m6663();
        }
        this.f11602.setVisibility(0);
        int i2 = this.f11598;
        C3003 c30032 = this.f11605;
        if (i2 == 0 && (this.f11601 || z)) {
            this.f11602.setTranslationY(0.0f);
            float f2 = -this.f11602.getHeight();
            if (z) {
                this.f11602.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f11602.setTranslationY(f2);
            C2522 c25224 = new C2522();
            C4361 c4361M98853 = AbstractC4345.m9885(this.f11602);
            c4361M98853.m9939(0.0f);
            final View view3 = (View) c4361M98853.f16865.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(r8 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: ᵢٴ.ʾʼ
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((C3016) r8.ˆʿ).f11602.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z5 = c25224.f10016;
            ArrayList arrayList2 = c25224.f10018;
            if (!z5) {
                arrayList2.add(c4361M98853);
            }
            if (this.f11591 && view != null) {
                view.setTranslationY(f2);
                C4361 c4361M98854 = AbstractC4345.m9885(view);
                c4361M98854.m9939(0.0f);
                if (!c25224.f10016) {
                    arrayList2.add(c4361M98854);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f11581;
            boolean z6 = c25224.f10016;
            if (!z6) {
                c25224.f10017 = decelerateInterpolator;
            }
            if (!z6) {
                c25224.f10015 = 250L;
            }
            if (!z6) {
                c25224.f10020 = c30032;
            }
            this.f11599 = c25224;
            c25224.m6662();
        } else {
            this.f11602.setAlpha(1.0f);
            this.f11602.setTranslationY(0.0f);
            if (this.f11591 && view != null) {
                view.setTranslationY(0.0f);
            }
            c30032.m7430();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f11593;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            AbstractC4362.m9944(actionBarOverlayLayout);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m7459(boolean z) {
        if (this.f11592) {
            return;
        }
        int i = z ? 4 : 0;
        C2885 c2885 = (C2885) this.f11583;
        int i2 = c2885.f11170;
        this.f11592 = true;
        c2885.m7210((i & 4) | (i2 & (-5)));
    }
}
