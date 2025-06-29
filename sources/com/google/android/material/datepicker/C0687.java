package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.leanback.widget.RunnableC0134;
import androidx.leanback.widget.ViewOnClickListenerC0202;
import androidx.leanback.widget.ﾞᐧ;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import p061.C1359;
import p061.C1439;
import p378.AbstractC4345;

/* renamed from: com.google.android.material.datepicker.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0687<S> extends AbstractC0688 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public View f3271;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f3272;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f3273;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public RecyclerView f3274;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C0682 f3275;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public View f3276;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C0702 f3277;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public View f3278;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C0694 f3279;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public RecyclerView f3280;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public View f3281;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f3272 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3275 = (C0682) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3277 = (C0702) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i;
        int i2;
        C1439 c1439;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f3272);
        this.f3279 = new C0694(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0702 c0702 = this.f3275.f3258;
        if (C0692.m2866(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = org.lsposed.hiddenapibypass.library.R.layout._2_res_0x7f0e00fd;
            i2 = 1;
        } else {
            i = org.lsposed.hiddenapibypass.library.R.layout._2_res_0x7f0e00f8;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f0703ce) + resources.getDimensionPixelOffset(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f0703d0) + resources.getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f0703cf);
        int dimensionPixelSize = resources.getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f0703bf);
        int i3 = C0690.f3286;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f0703cd) * (i3 - 1)) + (resources.getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f0703ba) * i3) + resources.getDimensionPixelOffset(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f0703b7));
        GridView gridView = (GridView) viewInflate.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b0294);
        AbstractC4345.m9884(gridView, new C0699(0));
        int i4 = this.f3275.f3255;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C0683(i4) : new C0683()));
        gridView.setNumColumns(c0702.f3338);
        gridView.setEnabled(false);
        this.f3274 = (RecyclerView) viewInflate.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b0297);
        getContext();
        this.f3274.setLayoutManager(new C0693(this, i2, i2));
        this.f3274.setTag("MONTHS_VIEW_GROUP_TAG");
        C0684 c0684 = new C0684(contextThemeWrapper, this.f3275, new ﾞᐧ(2, this));
        this.f3274.setAdapter(c0684);
        int integer = contextThemeWrapper.getResources().getInteger(org.lsposed.hiddenapibypass.library.R.integer._2_res_0x7f0c005b);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b029a);
        this.f3280 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f3280.setLayoutManager(new GridLayoutManager(integer));
            this.f3280.setAdapter(new C0685(this));
            this.f3280.m1327(new C0706(this));
        }
        if (viewInflate.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b028d) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b028d);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC4345.m9884(materialButton, new C0686(0, this));
            View viewFindViewById = viewInflate.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b028f);
            this.f3276 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b028e);
            this.f3278 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f3281 = viewInflate.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b029a);
            this.f3271 = viewInflate.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b0293);
            m2859(1);
            materialButton.setText(this.f3277.m2875());
            this.f3274.m1289(new C0691(this, c0684, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0202(2, this));
            this.f3278.setOnClickListener(new ViewOnClickListenerC0698(this, c0684, 1));
            this.f3276.setOnClickListener(new ViewOnClickListenerC0698(this, c0684, 0));
        }
        if (!C0692.m2866(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c1439 = new C1439()).f5903) != (recyclerView = this.f3274)) {
            C1359 c1359 = c1439.f5901;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1710;
                if (arrayList != null) {
                    arrayList.remove(c1359);
                }
                c1439.f5903.setOnFlingListener(null);
            }
            c1439.f5903 = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c1439.f5903.m1289(c1359);
                c1439.f5903.setOnFlingListener(c1439);
                new Scroller(c1439.f5903.getContext(), new DecelerateInterpolator());
                c1439.m4987();
            }
        }
        this.f3274.mo956(c0684.f3267.f3258.m2874(this.f3277));
        AbstractC4345.m9884(this.f3274, new C0699(1));
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f3272);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3275);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f3277);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m2858(C0702 c0702) {
        C0684 c0684 = (C0684) this.f3274.getAdapter();
        int iM2874 = c0684.f3267.f3258.m2874(c0702);
        int iM28742 = iM2874 - c0684.f3267.f3258.m2874(this.f3277);
        boolean z = Math.abs(iM28742) > 3;
        boolean z2 = iM28742 > 0;
        this.f3277 = c0702;
        if (z && z2) {
            this.f3274.mo956(iM2874 - 3);
            this.f3274.post(new RunnableC0134(iM2874, 1, this));
        } else if (!z) {
            this.f3274.post(new RunnableC0134(iM2874, 1, this));
        } else {
            this.f3274.mo956(iM2874 + 3);
            this.f3274.post(new RunnableC0134(iM2874, 1, this));
        }
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final void m2859(int i) {
        this.f3273 = i;
        if (i == 2) {
            this.f3280.getLayoutManager().mo848(this.f3277.f3337 - ((C0685) this.f3280.getAdapter()).f3268.f3275.f3258.f3337);
            this.f3281.setVisibility(0);
            this.f3271.setVisibility(8);
            this.f3276.setVisibility(8);
            this.f3278.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f3281.setVisibility(8);
            this.f3271.setVisibility(0);
            this.f3276.setVisibility(0);
            this.f3278.setVisibility(0);
            m2858(this.f3277);
        }
    }
}
