package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0116;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p159.ViewOnTouchListenerC2341;
import p171.AbstractC2466;
import p239.AbstractC3098;
import p278.AbstractC3362;
import p293.C3474;
import p361.C4105;
import p378.AbstractC4339;
import p378.AbstractC4345;
import p378.C4358;
import p378.C4365;
import p378.C4376;
import p378.C4379;
import p378.C4386;
import p421.AbstractC4862;

/* renamed from: com.google.android.material.datepicker.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0692<S> extends DialogInterfaceOnCancelListenerC0116 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final LinkedHashSet f3293;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public CharSequence f3294;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public CharSequence f3295;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public boolean f3296;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public int f3297;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public int f3298;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public C0687 f3299;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public int f3300;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public CharSequence f3301;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public boolean f3302;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public CharSequence f3303;

    /* renamed from: יˋ, reason: contains not printable characters */
    public int f3304;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public TextView f3305;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public int f3306;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public CharSequence f3307;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public CharSequence f3308;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public C4105 f3309;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public CheckableImageButton f3310;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public AbstractC0688 f3311;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public int f3312;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final LinkedHashSet f3313;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public int f3314;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public CharSequence f3315;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public C0682 f3316;

    public C0692() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f3313 = new LinkedHashSet();
        this.f3293 = new LinkedHashSet();
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static int m2865(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen._2_res_0x7f0703b8);
        Calendar calendarM2868 = AbstractC0696.m2868();
        calendarM2868.set(5, 1);
        Calendar calendarM2870 = AbstractC0696.m2870(calendarM2868);
        calendarM2870.get(2);
        calendarM2870.get(1);
        int maximum = calendarM2870.getMaximum(7);
        calendarM2870.getActualMaximum(5);
        calendarM2870.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen._2_res_0x7f0703be) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen._2_res_0x7f0703cc)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public static boolean m2866(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ⁱـ.ˑי.ʿˏ(R.attr._2_res_0x7f0403c8, context, C0687.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f3313.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f3312 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3316 = (C0682) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3300 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f3308 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f3298 = bundle.getInt("INPUT_MODE_KEY");
        this.f3314 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f3301 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f3304 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f3294 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f3297 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f3295 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f3306 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f3307 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f3308;
        if (text == null) {
            text = requireContext().getResources().getText(this.f3300);
        }
        this.f3303 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f3315 = text;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f3296 ? R.layout.mtrl_picker_fullscreen : R.layout._2_res_0x7f0e0103, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f3296) {
            viewInflate.findViewById(R.id._2_res_0x7f0b0295).setLayoutParams(new LinearLayout.LayoutParams(m2865(context), -2));
        } else {
            viewInflate.findViewById(R.id._2_res_0x7f0b0296).setLayoutParams(new LinearLayout.LayoutParams(m2865(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id._2_res_0x7f0b02a1)).setAccessibilityLiveRegion(1);
        this.f3310 = (CheckableImageButton) viewInflate.findViewById(R.id._2_res_0x7f0b02a3);
        this.f3305 = (TextView) viewInflate.findViewById(R.id._2_res_0x7f0b02a7);
        this.f3310.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f3310;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, ᴵﹳ.ٴˎ.ˏᵢ(context, R.drawable._2_res_0x7f0801b9));
        stateListDrawable.addState(new int[0], ᴵﹳ.ٴˎ.ˏᵢ(context, R.drawable._2_res_0x7f0801bb));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f3310.setChecked(this.f3298 != 0);
        AbstractC4345.m9884(this.f3310, null);
        CheckableImageButton checkableImageButton2 = this.f3310;
        this.f3310.setContentDescription(this.f3298 == 1 ? checkableImageButton2.getContext().getString(R.string._2_res_0x7f13015b) : checkableImageButton2.getContext().getString(R.string._2_res_0x7f13015d));
        this.f3310.setOnClickListener(new ViewOnClickListenerC0689(0, this));
        m2867();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f3293.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f3312);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0682 c0682 = this.f3316;
        C0697 c0697 = new C0697();
        int i = C0697.f3324;
        int i2 = C0697.f3324;
        long j = c0682.f3258.f3340;
        long j2 = c0682.f3254.f3340;
        c0697.f3325 = Long.valueOf(c0682.f3257.f3340);
        C0687 c0687 = this.f3299;
        C0702 c0702 = c0687 == null ? null : c0687.f3277;
        if (c0702 != null) {
            c0697.f3325 = Long.valueOf(c0702.f3340);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0682.f3256);
        C0702 c0702M2872 = C0702.m2872(j);
        C0702 c0702M28722 = C0702.m2872(j2);
        C0705 c0705 = (C0705) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c0697.f3325;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0682(c0702M2872, c0702M28722, c0705, l == null ? null : C0702.m2872(l.longValue()), c0682.f3255));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f3300);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f3308);
        bundle.putInt("INPUT_MODE_KEY", this.f3298);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f3314);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f3301);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f3304);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f3294);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f3297);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f3295);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f3306);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f3307);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [ᵢٴ.ˑʾ] */
    /* JADX WARN: Type inference failed for: r3v25, types: [ᵢٴ.ˑʾ] */
    /* JADX WARN: Type inference failed for: r7v12, types: [ᵢٴ.ˑʾ] */
    /* JADX WARN: Type inference failed for: r7v18, types: [ᵢٴ.ˑʾ] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onStart() throws Resources.NotFoundException {
        C4365 c4376;
        C4365 c43762;
        super.onStart();
        Dialog dialog = this.f694;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f3296) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f3309);
            if (!this.f3302) {
                View viewFindViewById = requireView().findViewById(R.id._2_res_0x7f0b01a6);
                ColorStateList colorStateList = ˈⁱ.ﹳﹳ.ᵎˏ(viewFindViewById.getBackground());
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = numValueOf == null || numValueOf.intValue() == 0;
                int iM8196 = AbstractC3362.m8196(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z) {
                    numValueOf = Integer.valueOf(iM8196);
                }
                if (i >= 35) {
                    AbstractC2466.m6583(window, false);
                } else if (i >= 30) {
                    AbstractC2466.m6587(window, false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                int iM10942 = i < 23 ? AbstractC4862.m10942(AbstractC3362.m8196(window.getContext(), android.R.attr.statusBarColor, -16777216), 128) : 0;
                int iM109422 = i < 27 ? AbstractC4862.m10942(AbstractC3362.m8196(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(iM10942);
                window.setNavigationBarColor(iM109422);
                boolean z2 = AbstractC3362.m8207(iM10942) || (iM10942 == 0 && AbstractC3362.m8207(numValueOf.intValue()));
                C3474 c3474 = new C3474(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    ?? c4386 = new C4386(window.getInsetsController(), c3474);
                    c4386.f16863 = window;
                    c4376 = c4386;
                } else if (i2 >= 30) {
                    ?? c4358 = new C4358(window.getInsetsController(), c3474);
                    c4358.f16863 = window;
                    c4376 = c4358;
                } else {
                    c4376 = i2 >= 26 ? new C4376(window, c3474) : i2 >= 23 ? new C4379(window, c3474) : new C4365(window, c3474);
                }
                c4376.ˋˊ(z2);
                boolean z3 = AbstractC3362.m8207(iM109422) || (iM109422 == 0 && AbstractC3362.m8207(iM8196));
                C3474 c34742 = new C3474(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 35) {
                    ?? c43862 = new C4386(window.getInsetsController(), c34742);
                    c43862.f16863 = window;
                    c43762 = c43862;
                } else if (i3 >= 30) {
                    ?? c43582 = new C4358(window.getInsetsController(), c34742);
                    c43582.f16863 = window;
                    c43762 = c43582;
                } else {
                    c43762 = i3 >= 26 ? new C4376(window, c34742) : i3 >= 23 ? new C4379(window, c34742) : new C4365(window, c34742);
                }
                c43762.ʿˏ(z3);
                C0700 c0700 = new C0700(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC4345.f16838;
                AbstractC4339.m9855(viewFindViewById, c0700);
                this.f3302 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen._2_res_0x7f0703c0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f3309, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView2 = window.getDecorView();
            Dialog dialog2 = this.f694;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView2.setOnTouchListener(new ViewOnTouchListenerC2341(dialog2, rect));
        }
        requireContext();
        int i4 = this.f3312;
        if (i4 == 0) {
            m2867();
            throw null;
        }
        m2867();
        C0682 c0682 = this.f3316;
        C0687 c0687 = new C0687();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i4);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0682);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0682.f3257);
        c0687.setArguments(bundle);
        this.f3299 = c0687;
        AbstractC0688 abstractC0688 = c0687;
        if (this.f3298 == 1) {
            m2867();
            C0682 c06822 = this.f3316;
            AbstractC0688 c0695 = new C0695();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i4);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c06822);
            c0695.setArguments(bundle2);
            abstractC0688 = c0695;
        }
        this.f3311 = abstractC0688;
        this.f3305.setText((this.f3298 == 1 && getResources().getConfiguration().orientation == 2) ? this.f3315 : this.f3303);
        m2867();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onStop() {
        this.f3311.f3282.clear();
        super.onStop();
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final void m2867() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116
    /* renamed from: ᵔ */
    public final Dialog mo742(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int i = this.f3312;
        if (i == 0) {
            m2867();
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i);
        Context context = dialog.getContext();
        this.f3296 = m2866(context, android.R.attr.windowFullscreen);
        this.f3309 = new C4105(context, null, R.attr._2_res_0x7f0403c8, R.style._2_res_0x7f140534);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC3098.f11959, R.attr._2_res_0x7f0403c8, R.style._2_res_0x7f140534);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f3309.m9405(context);
        this.f3309.m9407(ColorStateList.valueOf(color));
        C4105 c4105 = this.f3309;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        c4105.m9406(AbstractC4339.m9852(decorView));
        return dialog;
    }
}
