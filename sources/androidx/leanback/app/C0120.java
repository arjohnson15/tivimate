package androidx.leanback.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0113;
import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.fragment.app.C0105;
import androidx.leanback.transition.C0126;
import androidx.leanback.transition.FadeAndShortSlide;
import androidx.leanback.widget.C0159;
import androidx.leanback.widget.C0180;
import androidx.leanback.widget.C0198;
import androidx.leanback.widget.C0203;
import androidx.leanback.widget.NonOverlappingLinearLayout;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.ʿˏ;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p291.AbstractC3436;
import p291.C3449;
import p378.AbstractC4339;
import p378.AbstractC4345;
import ʻˋ.ˋˊ;
import ˆʽ.ᵎˏ;
import ـˈ.ᴵʿ;
import ᴵﹳ.ﹶˆ;

/* renamed from: androidx.leanback.app.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0120 extends AbstractComponentCallbacksC0100 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ʿˏ f717;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C0180 f718;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public ˋˊ f719;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C0159 f720;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C0159 f722;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public ContextThemeWrapper f723;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C0180 f725;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C0180 f726;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public ArrayList f721 = new ArrayList();

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public ArrayList f724 = new ArrayList();

    public C0120() {
        m764();
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static void m748(AbstractC0104 abstractC0104, C0120 c0120) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M675 = abstractC0104.m675("leanBackGuidedStepSupportFragment");
        C0120 c01202 = abstractComponentCallbacksC0100M675 instanceof C0120 ? (C0120) abstractComponentCallbacksC0100M675 : null;
        int i = c01202 != null ? 1 : 0;
        C0105 c0105 = new C0105(abstractC0104);
        c0120.m760(i ^ 1);
        Bundle arguments = c0120.getArguments();
        int i2 = arguments == null ? 1 : arguments.getInt("uiStyle", 1);
        Class<?> cls = c0120.getClass();
        c0105.m702(i2 != 0 ? i2 != 1 ? "" : "GuidedStepEntrance".concat(cls.getName()) : "GuidedStepDefault".concat(cls.getName()));
        if (c01202 != null) {
            View view = c01202.getView();
            m751(c0105, view.findViewById(R.id._2_res_0x7f0b0047), "action_fragment_root");
            m751(c0105, view.findViewById(R.id._2_res_0x7f0b0046), "action_fragment_background");
            m751(c0105, view.findViewById(R.id._2_res_0x7f0b0045), "action_fragment");
            m751(c0105, view.findViewById(R.id._2_res_0x7f0b01c5), "guidedactions_root");
            m751(c0105, view.findViewById(R.id._2_res_0x7f0b01b9), "guidedactions_content");
            m751(c0105, view.findViewById(R.id._2_res_0x7f0b01c3), "guidedactions_list_background");
            m751(c0105, view.findViewById(R.id._2_res_0x7f0b01c6), "guidedactions_root2");
            m751(c0105, view.findViewById(R.id._2_res_0x7f0b01ba), "guidedactions_content2");
            m751(c0105, view.findViewById(R.id._2_res_0x7f0b01c4), "guidedactions_list_background2");
        }
        c0105.m700(android.R.id.content, c0120, "leanBackGuidedStepSupportFragment");
        c0105.m697(false);
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static boolean m749(C0203 c0203) {
        return (c0203.f1202 & 64) == 64 && c0203.f1209 != -1;
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static boolean m750(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr._2_res_0x7f0402c9, typedValue, true) && typedValue.type == 18 && typedValue.data != 0;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static void m751(C0105 c0105, View view, String str) {
        if (view != null) {
            C3449 c3449 = AbstractC3436.f13331;
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            String strM9863 = AbstractC4339.m9863(view);
            if (strM9863 == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (c0105.f651 == null) {
                c0105.f651 = new ArrayList();
                c0105.f644 = new ArrayList();
            } else {
                if (c0105.f644.contains(str)) {
                    throw new IllegalArgumentException(ᵎˏ.ˑי("A shared element with the target name '", str, "' has already been added to the transaction."));
                }
                if (c0105.f651.contains(strM9863)) {
                    throw new IllegalArgumentException(ᵎˏ.ˑי("A shared element with the source name '", strM9863, "' has already been added to the transaction."));
                }
            }
            c0105.f651.add(strM9863);
            c0105.f644.add(str);
        }
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static void m752(AbstractActivityC0113 abstractActivityC0113, ᴵʿ r3) {
        abstractActivityC0113.getWindow().getDecorView();
        AbstractC0104 supportFragmentManager = abstractActivityC0113.getSupportFragmentManager();
        if (supportFragmentManager.m675("leanBackGuidedStepSupportFragment") != null) {
            return;
        }
        C0105 c0105 = new C0105(supportFragmentManager);
        r3.m760(2);
        c0105.m700(android.R.id.content, r3, "leanBackGuidedStepSupportFragment");
        c0105.m697(false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f717 = new ʿˏ();
        this.f720 = m759();
        this.f722 = m753();
        m764();
        ArrayList arrayList = new ArrayList();
        m767(arrayList);
        if (bundle != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0203 c0203 = (C0203) arrayList.get(i);
                if (m749(c0203)) {
                    c0203.m992("action_" + c0203.f1209, bundle);
                }
            }
        }
        m765(arrayList);
        ArrayList arrayList2 = new ArrayList();
        m761(arrayList2);
        if (bundle != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C0203 c02032 = (C0203) arrayList2.get(i2);
                if (m749(c02032)) {
                    c02032.m992("buttonaction_" + c02032.f1209, bundle);
                }
            }
        }
        this.f724 = arrayList2;
        C0180 c0180 = this.f726;
        if (c0180 != null) {
            c0180.m973(arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        Context context = getContext();
        if (!m750(context)) {
            TypedValue typedValue = new TypedValue();
            boolean zResolveAttribute = context.getTheme().resolveAttribute(R.attr._2_res_0x7f0402c8, typedValue, true);
            if (zResolveAttribute) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, typedValue.resourceId);
                if (m750(contextThemeWrapper)) {
                    this.f723 = contextThemeWrapper;
                } else {
                    this.f723 = null;
                    zResolveAttribute = false;
                }
            }
            if (!zResolveAttribute) {
            }
        }
        ContextThemeWrapper contextThemeWrapper2 = this.f723;
        LayoutInflater layoutInflaterCloneInContext = contextThemeWrapper2 == null ? layoutInflater : layoutInflater.cloneInContext(contextThemeWrapper2);
        GuidedStepRootLayout guidedStepRootLayout = (GuidedStepRootLayout) layoutInflaterCloneInContext.inflate(R.layout._2_res_0x7f0e00a7, viewGroup, false);
        guidedStepRootLayout.getClass();
        ViewGroup viewGroup2 = (ViewGroup) guidedStepRootLayout.findViewById(R.id._2_res_0x7f0b00f4);
        ViewGroup viewGroup3 = (ViewGroup) guidedStepRootLayout.findViewById(R.id._2_res_0x7f0b0045);
        ((NonOverlappingLinearLayout) viewGroup3).setFocusableViewAvailableFixEnabled(true);
        ﹶˆ r2 = m755();
        ʿˏ r3 = this.f717;
        r3.getClass();
        View viewInflate = layoutInflaterCloneInContext.inflate(R.layout._2_res_0x7f0e00a1, viewGroup2, false);
        r3.ᐧⁱ = (TextView) viewInflate.findViewById(R.id._2_res_0x7f0b01b7);
        r3.ˎˑ = (TextView) viewInflate.findViewById(R.id._2_res_0x7f0b01b3);
        r3.ˆʿ = (TextView) viewInflate.findViewById(R.id._2_res_0x7f0b01b5);
        r3.ᐧˋ = (ImageView) viewInflate.findViewById(R.id._2_res_0x7f0b01b6);
        r3.ˆᵔ = viewInflate.findViewById(R.id._2_res_0x7f0b01b4);
        TextView textView = (TextView) r3.ᐧⁱ;
        String str = (String) r2.ᐧⁱ;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) r3.ˎˑ;
        String str2 = (String) r2.ˎˑ;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        TextView textView3 = (TextView) r3.ˆʿ;
        String str3 = (String) r2.ˆʿ;
        if (textView3 != null) {
            textView3.setText(str3);
        }
        ImageView imageView = (ImageView) r3.ᐧˋ;
        if (imageView != null) {
            Drawable drawable = (Drawable) r2.ᐧˋ;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
        View view = (View) r3.ˆᵔ;
        if (view != null && TextUtils.isEmpty(view.getContentDescription())) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
                sb.append('\n');
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append('\n');
            }
            if (!TextUtils.isEmpty(str3)) {
                sb.append(str3);
                sb.append('\n');
            }
            ((View) r3.ˆᵔ).setContentDescription(sb);
        }
        viewGroup2.addView(viewInflate);
        viewGroup3.addView(this.f720.m948(layoutInflaterCloneInContext, viewGroup3));
        ViewGroup viewGroupM948 = this.f722.m948(layoutInflaterCloneInContext, viewGroup3);
        viewGroup3.addView(viewGroupM948);
        C0121 c0121 = new C0121(this);
        this.f718 = new C0180(this.f721, new C0119(this, 0), this, this.f720, false);
        this.f726 = new C0180(this.f724, new C0121(this), this, this.f722, false);
        this.f725 = new C0180(null, new C0119(this, 1), this, this.f720, true);
        ˋˊ r0 = new ˋˊ(1, false);
        ArrayList arrayList = new ArrayList();
        r0.ˎˑ = arrayList;
        this.f719 = r0;
        C0180 c0180 = this.f718;
        C0180 c01802 = this.f726;
        arrayList.add(new Pair(c0180, c01802));
        if (c0180 != null) {
            c0180.f1145 = r0;
        }
        if (c01802 != null) {
            c01802.f1145 = r0;
        }
        ˋˊ r02 = this.f719;
        C0180 c01803 = this.f725;
        ((ArrayList) r02.ˎˑ).add(new Pair(c01803, null));
        if (c01803 != null) {
            c01803.f1145 = r02;
        }
        this.f719.ᐧˋ = c0121;
        C0159 c0159 = this.f720;
        c0159.getClass();
        c0159.f1091.setAdapter(this.f718);
        VerticalGridView verticalGridView = this.f720.f1100;
        if (verticalGridView != null) {
            verticalGridView.setAdapter(this.f725);
        }
        this.f722.f1091.setAdapter(this.f726);
        if (this.f724.size() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroupM948.getLayoutParams();
            layoutParams.weight = 0.0f;
            viewGroupM948.setLayoutParams(layoutParams);
        } else {
            Context context2 = this.f723;
            if (context2 == null) {
                context2 = getContext();
            }
            TypedValue typedValue2 = new TypedValue();
            if (context2.getTheme().resolveAttribute(R.attr._2_res_0x7f0402a1, typedValue2, true)) {
                View viewFindViewById = guidedStepRootLayout.findViewById(R.id._2_res_0x7f0b0047);
                float f = typedValue2.getFloat();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
                layoutParams2.weight = f;
                viewFindViewById.setLayoutParams(layoutParams2);
            }
        }
        View viewInflate2 = layoutInflaterCloneInContext.inflate(R.layout.lb_guidedstep_background, (ViewGroup) guidedStepRootLayout, false);
        if (viewInflate2 != null) {
            ((FrameLayout) guidedStepRootLayout.findViewById(R.id._2_res_0x7f0b01ca)).addView(viewInflate2, 0);
        }
        return guidedStepRootLayout;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onDestroyView() {
        ʿˏ r0 = this.f717;
        r0.ˎˑ = null;
        r0.ˆʿ = null;
        r0.ᐧˋ = null;
        r0.ᐧⁱ = null;
        r0.ˆᵔ = null;
        C0159 c0159 = this.f720;
        c0159.f1096 = null;
        c0159.f1106 = null;
        c0159.f1091 = null;
        c0159.f1100 = null;
        c0159.f1109 = null;
        c0159.f1092 = null;
        c0159.f1102 = null;
        C0159 c01592 = this.f722;
        c01592.f1096 = null;
        c01592.f1106 = null;
        c01592.f1091 = null;
        c01592.f1100 = null;
        c01592.f1109 = null;
        c01592.f1092 = null;
        c01592.f1102 = null;
        this.f718 = null;
        this.f725 = null;
        this.f726 = null;
        this.f719 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onResume() {
        super.onResume();
        getView().findViewById(R.id._2_res_0x7f0b0045).requestFocus();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ArrayList arrayList = this.f721;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0203 c0203 = (C0203) arrayList.get(i);
            if (m749(c0203)) {
                c0203.m993("action_" + c0203.f1209, bundle);
            }
        }
        ArrayList arrayList2 = this.f724;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0203 c02032 = (C0203) arrayList2.get(i2);
            if (m749(c02032)) {
                c02032.m993("buttonaction_" + c02032.f1209, bundle);
            }
        }
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public C0159 m753() {
        C0159 c0159 = new C0159();
        if (c0159.f1102 != null) {
            throw new IllegalStateException("setAsButtonActions() must be called before creating views");
        }
        c0159.f1103 = true;
        return c0159;
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public void m754(C0203 c0203) {
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public ﹶˆ m755() {
        return new ﹶˆ("", "", "", (Object) null);
    }

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final void m756(int i) {
        C0180 c0180 = this.f718;
        if (c0180 != null) {
            c0180.f5598.m4956(i, 1, null);
        }
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final int m757(long j) {
        if (this.f721 == null) {
            return -1;
        }
        for (int i = 0; i < this.f721.size(); i++) {
            if (((C0203) this.f721.get(i)).f1209 == j) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final int m758(long j) {
        if (this.f724 == null) {
            return -1;
        }
        for (int i = 0; i < this.f724.size(); i++) {
            if (((C0203) this.f724.get(i)).f1209 == j) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public C0159 m759() {
        return new C0159();
    }

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public final void m760(int i) {
        Bundle arguments = getArguments();
        boolean z = true;
        int i2 = arguments == null ? 1 : arguments.getInt("uiStyle", 1);
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            arguments2 = new Bundle();
        } else {
            z = false;
        }
        arguments2.putInt("uiStyle", i);
        if (z) {
            setArguments(arguments2);
        }
        if (i != i2) {
            m764();
        }
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public void m761(ArrayList arrayList) {
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m762(C0203 c0203) {
        C0159 c0159 = this.f720;
        C0180 c0180 = (C0180) c0159.f1091.getAdapter();
        c0180.getClass();
        int iIndexOf = new ArrayList(c0180.f1143).indexOf(c0203);
        if (iIndexOf < 0 || !c0203.m994()) {
            return;
        }
        c0159.f1091.m954(iIndexOf, new C0198(c0180));
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public long m763(C0203 c0203) {
        return -2L;
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public void m764() {
        Bundle arguments = getArguments();
        int i = arguments == null ? 1 : arguments.getInt("uiStyle", 1);
        if (i == 0) {
            FadeAndShortSlide fadeAndShortSlide = new FadeAndShortSlide(8388613);
            fadeAndShortSlide.excludeTarget(R.id._2_res_0x7f0b01c9, true);
            fadeAndShortSlide.excludeTarget(R.id._2_res_0x7f0b01c8, true);
            setEnterTransition(fadeAndShortSlide);
            Fade fade = new Fade(3);
            fade.addTarget(R.id._2_res_0x7f0b01c8);
            C0126 c0126 = new C0126();
            c0126.setReparent(false);
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(fade);
            transitionSet.addTransition(c0126);
            setSharedElementEnterTransition(transitionSet);
        } else if (i == 1) {
            Fade fade2 = new Fade(3);
            fade2.addTarget(R.id._2_res_0x7f0b01c9);
            FadeAndShortSlide fadeAndShortSlide2 = new FadeAndShortSlide(8388615);
            fadeAndShortSlide2.addTarget(R.id._2_res_0x7f0b00f4);
            fadeAndShortSlide2.addTarget(R.id._2_res_0x7f0b0047);
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.setOrdering(0);
            transitionSet2.addTransition(fade2);
            transitionSet2.addTransition(fadeAndShortSlide2);
            setEnterTransition(transitionSet2);
            setSharedElementEnterTransition(null);
        } else if (i == 2) {
            setEnterTransition(null);
            setSharedElementEnterTransition(null);
        }
        FadeAndShortSlide fadeAndShortSlide3 = new FadeAndShortSlide(8388611);
        fadeAndShortSlide3.excludeTarget(R.id._2_res_0x7f0b01c9, true);
        fadeAndShortSlide3.excludeTarget(R.id._2_res_0x7f0b01c8, true);
        setExitTransition(fadeAndShortSlide3);
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public final void m765(ArrayList arrayList) {
        this.f721 = arrayList;
        C0180 c0180 = this.f718;
        if (c0180 != null) {
            c0180.m973(arrayList);
        }
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final void m766(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            this.f717.getClass();
            this.f720.getClass();
            this.f722.getClass();
        } else {
            this.f717.getClass();
            this.f720.getClass();
            this.f722.getClass();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public void m767(ArrayList arrayList) {
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final C0203 m768(long j) {
        int iM757 = m757(j);
        if (iM757 >= 0) {
            return (C0203) this.f721.get(iM757);
        }
        return null;
    }
}
