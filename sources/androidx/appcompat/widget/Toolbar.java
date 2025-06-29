package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.leanback.widget.RunnableC0183;
import androidx.leanback.widget.ViewOnClickListenerC0202;
import androidx.leanback.widget.ﾞᐧ;
import java.util.ArrayList;
import java.util.Iterator;
import org.lsposed.hiddenapibypass.library.R;
import p182.C2530;
import p222.AbstractC2926;
import p222.AbstractC2963;
import p222.C2878;
import p222.C2881;
import p222.C2885;
import p222.C2900;
import p222.C2908;
import p222.C2923;
import p222.C2958;
import p222.C2971;
import p222.InterfaceC2862;
import p222.InterfaceC2942;
import p222.RunnableC2922;
import p222.ViewOnClickListenerC2930;
import p291.C3453;
import p300.AbstractC3505;
import p320.C3644;
import p320.MenuC3643;
import p331.C3762;
import p378.AbstractC4345;
import p378.C4354;
import p378.InterfaceC4341;
import p378.InterfaceC4343;
import ˈⁱ.ˉⁱ;
import ˊﹶ.ˋˉ;
import ᴵﹳ.ٴˎ;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC4341 {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public boolean f208;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public int f209;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final ArrayList f210;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final int[] f211;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f212;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public CharSequence f213;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C2900 f214;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public AppCompatImageView f215;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final ArrayList f216;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public ColorStateList f217;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public int f218;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C2971 f219;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final int f220;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public boolean f221;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C2900 f222;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f223;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public C2881 f224;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public boolean f225;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final int f226;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f227;

    /* renamed from: יˋ, reason: contains not printable characters */
    public boolean f228;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public View f229;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final ﾞᐧ f230;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final C4354 f231;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public ArrayList f232;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public final RunnableC0183 f233;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C2971 f234;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public ActionMenuView f235;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public Context f236;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public CharSequence f237;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public C2908 f238;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public C2885 f239;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C2923 f240;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public int f241;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public int f242;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Drawable f243;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final int f244;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public ColorStateList f245;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public OnBackInvokedCallback f246;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final CharSequence f247;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public int f248;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f249;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public OnBackInvokedDispatcher f250;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr._2_res_0x7f040612);
        this.f220 = 8388627;
        this.f210 = new ArrayList();
        this.f216 = new ArrayList();
        this.f211 = new int[2];
        this.f231 = new C4354(new RunnableC2922(this, 1));
        this.f232 = new ArrayList();
        this.f230 = new ﾞᐧ(29, this);
        this.f233 = new RunnableC0183(16, this);
        Context context2 = getContext();
        int[] iArr = AbstractC3505.f13598;
        C3762 c3762M8778 = C3762.m8778(context2, attributeSet, iArr, R.attr._2_res_0x7f040612);
        AbstractC4345.m9881(this, context, iArr, attributeSet, (TypedArray) c3762M8778.f14531, R.attr._2_res_0x7f040612);
        TypedArray typedArray = (TypedArray) c3762M8778.f14531;
        this.f212 = typedArray.getResourceId(28, 0);
        this.f227 = typedArray.getResourceId(19, 0);
        this.f220 = typedArray.getInteger(0, 8388627);
        this.f226 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f241 = dimensionPixelOffset;
        this.f209 = dimensionPixelOffset;
        this.f242 = dimensionPixelOffset;
        this.f223 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f223 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f242 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f209 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f241 = dimensionPixelOffset5;
        }
        this.f244 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m163();
        C2923 c2923 = this.f240;
        c2923.f11323 = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c2923.f11322 = dimensionPixelSize;
            c2923.f11325 = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c2923.f11326 = dimensionPixelSize2;
            c2923.f11321 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c2923.m7273(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f248 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f218 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f243 = c3762M8778.m8784(4);
        this.f247 = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f236 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM8784 = c3762M8778.m8784(16);
        if (drawableM8784 != null) {
            setNavigationIcon(drawableM8784);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM87842 = c3762M8778.m8784(11);
        if (drawableM87842 != null) {
            setLogo(drawableM87842);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c3762M8778.m8782(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c3762M8778.m8782(20));
        }
        if (typedArray.hasValue(14)) {
            mo151(typedArray.getResourceId(14, 0));
        }
        c3762M8778.m8783();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C2530(getContext());
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static int m143(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static int m144(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static C2878 m145() {
        C2878 c2878 = new C2878(-2, -2);
        c2878.f11141 = 0;
        c2878.f11142 = 8388627;
        return c2878;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static C2878 m146(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C2878;
        if (z) {
            C2878 c2878 = (C2878) layoutParams;
            C2878 c28782 = new C2878(c2878);
            c28782.f11141 = 0;
            c28782.f11141 = c2878.f11141;
            return c28782;
        }
        if (z) {
            C2878 c28783 = new C2878((C2878) layoutParams);
            c28783.f11141 = 0;
            return c28783;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C2878 c28784 = new C2878(layoutParams);
            c28784.f11141 = 0;
            return c28784;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C2878 c28785 = new C2878(marginLayoutParams);
        c28785.f11141 = 0;
        ((ViewGroup.MarginLayoutParams) c28785).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c28785).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c28785).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c28785).bottomMargin = marginLayoutParams.bottomMargin;
        return c28785;
    }

    @Override // p378.InterfaceC4341
    public final void addMenuProvider(InterfaceC4343 interfaceC4343) {
        C4354 c4354 = this.f231;
        c4354.f16859.add(interfaceC4343);
        c4354.f16861.run();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2878);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m145();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C2878 c2878 = new C2878(context, attributeSet);
        c2878.f11142 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3505.f13573);
        c2878.f11142 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c2878.f11141 = 0;
        return c2878;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m146(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C2971 c2971 = this.f219;
        if (c2971 != null) {
            return c2971.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C2971 c2971 = this.f219;
        if (c2971 != null) {
            return c2971.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C2923 c2923 = this.f240;
        if (c2923 != null) {
            return c2923.f11327 ? c2923.f11325 : c2923.f11321;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f218;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C2923 c2923 = this.f240;
        if (c2923 != null) {
            return c2923.f11325;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C2923 c2923 = this.f240;
        if (c2923 != null) {
            return c2923.f11321;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C2923 c2923 = this.f240;
        if (c2923 != null) {
            return c2923.f11327 ? c2923.f11321 : c2923.f11325;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f248;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC3643 menuC3643;
        ActionMenuView actionMenuView = this.f235;
        return (actionMenuView == null || (menuC3643 = actionMenuView.f139) == null || !menuC3643.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f218, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f248, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f215;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f215;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m148();
        return this.f235.getMenu();
    }

    public View getNavButtonView() {
        return this.f234;
    }

    public CharSequence getNavigationContentDescription() {
        C2971 c2971 = this.f234;
        if (c2971 != null) {
            return c2971.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C2971 c2971 = this.f234;
        if (c2971 != null) {
            return c2971.getDrawable();
        }
        return null;
    }

    public C2908 getOuterActionMenuPresenter() {
        return this.f238;
    }

    public Drawable getOverflowIcon() {
        m148();
        return this.f235.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f236;
    }

    public int getPopupTheme() {
        return this.f249;
    }

    public CharSequence getSubtitle() {
        return this.f213;
    }

    public final TextView getSubtitleTextView() {
        return this.f222;
    }

    public CharSequence getTitle() {
        return this.f237;
    }

    public int getTitleMarginBottom() {
        return this.f241;
    }

    public int getTitleMarginEnd() {
        return this.f242;
    }

    public int getTitleMarginStart() {
        return this.f223;
    }

    public int getTitleMarginTop() {
        return this.f209;
    }

    public final TextView getTitleTextView() {
        return this.f214;
    }

    public InterfaceC2942 getWrapper() {
        Drawable drawable;
        if (this.f239 == null) {
            C2885 c2885 = new C2885();
            c2885.f11182 = 0;
            c2885.f11179 = this;
            c2885.f11177 = getTitle();
            c2885.f11184 = getSubtitle();
            c2885.f11181 = c2885.f11177 != null;
            c2885.f11180 = getNavigationIcon();
            C3762 c3762M8778 = C3762.m8778(getContext(), null, AbstractC3505.f13588, R.attr._2_res_0x7f040007);
            c2885.f11176 = c3762M8778.m8784(15);
            TypedArray typedArray = (TypedArray) c3762M8778.f14531;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c2885.f11181 = true;
                c2885.f11177 = text;
                if ((c2885.f11170 & 8) != 0) {
                    Toolbar toolbar = c2885.f11179;
                    toolbar.setTitle(text);
                    if (c2885.f11181) {
                        AbstractC4345.m9890(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c2885.f11184 = text2;
                if ((c2885.f11170 & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM8784 = c3762M8778.m8784(20);
            if (drawableM8784 != null) {
                c2885.f11171 = drawableM8784;
                c2885.m7209();
            }
            Drawable drawableM87842 = c3762M8778.m8784(17);
            if (drawableM87842 != null) {
                c2885.f11183 = drawableM87842;
                c2885.m7209();
            }
            if (c2885.f11180 == null && (drawable = c2885.f11176) != null) {
                c2885.f11180 = drawable;
                int i = c2885.f11170 & 4;
                Toolbar toolbar2 = c2885.f11179;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c2885.m7210(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c2885.f11178;
                if (view != null && (c2885.f11170 & 16) != 0) {
                    removeView(view);
                }
                c2885.f11178 = viewInflate;
                if (viewInflate != null && (c2885.f11170 & 16) != 0) {
                    addView(viewInflate);
                }
                c2885.m7210(c2885.f11170 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m163();
                this.f240.m7273(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f212 = resourceId2;
                C2900 c2900 = this.f214;
                if (c2900 != null) {
                    c2900.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f227 = resourceId3;
                C2900 c29002 = this.f222;
                if (c29002 != null) {
                    c29002.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c3762M8778.m8783();
            if (R.string._2_res_0x7f130001 != c2885.f11182) {
                c2885.f11182 = R.string._2_res_0x7f130001;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = c2885.f11182;
                    c2885.f11172 = i2 != 0 ? getContext().getString(i2) : null;
                    c2885.m7208();
                }
            }
            c2885.f11172 = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC2930(c2885));
            this.f239 = c2885;
        }
        return this.f239;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m149();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f233);
        m149();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f228 = false;
        }
        if (!this.f228) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f228 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f228 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0298 A[LOOP:0: B:105:0x0296->B:106:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b5 A[LOOP:1: B:108:0x02b3->B:109:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d3 A[LOOP:2: B:111:0x02d1->B:112:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0321 A[LOOP:3: B:120:0x031f->B:121:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        char c2;
        int iM144;
        int iMax;
        int iCombineMeasuredStates;
        int iM1442;
        int iCombineMeasuredStates2;
        int iMax2;
        int iM143;
        boolean z = AbstractC2926.f11335;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        if (m162(this.f234)) {
            m160(this.f234, i, 0, i2, this.f244);
            iM144 = m144(this.f234) + this.f234.getMeasuredWidth();
            iMax = Math.max(0, m143(this.f234) + this.f234.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f234.getMeasuredState());
        } else {
            iM144 = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m162(this.f219)) {
            m160(this.f219, i, 0, i2, this.f244);
            iM144 = m144(this.f219) + this.f219.getMeasuredWidth();
            iMax = Math.max(iMax, m143(this.f219) + this.f219.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f219.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM144);
        int iMax4 = Math.max(0, currentContentInsetStart - iM144);
        int[] iArr = this.f211;
        iArr[c] = iMax4;
        if (m162(this.f235)) {
            m160(this.f235, i, iMax3, i2, this.f244);
            iM1442 = m144(this.f235) + this.f235.getMeasuredWidth();
            iMax = Math.max(iMax, m143(this.f235) + this.f235.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f235.getMeasuredState());
        } else {
            iM1442 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM1442);
        iArr[c2] = Math.max(0, currentContentInsetEnd - iM1442);
        if (m162(this.f229)) {
            iMax5 += m152(this.f229, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m143(this.f229) + this.f229.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f229.getMeasuredState());
        }
        if (m162(this.f215)) {
            iMax5 += m152(this.f215, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m143(this.f215) + this.f215.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f215.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C2878) childAt.getLayoutParams()).f11141 == 0 && m162(childAt)) {
                iMax5 += m152(childAt, i, iMax5, i2, 0, iArr);
                iMax = Math.max(iMax, m143(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.f209 + this.f241;
        int i6 = this.f223 + this.f242;
        if (m162(this.f214)) {
            m152(this.f214, i, iMax5 + i6, i2, i5, iArr);
            int iM1443 = m144(this.f214) + this.f214.getMeasuredWidth();
            iM143 = m143(this.f214) + this.f214.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f214.getMeasuredState());
            iMax2 = iM1443;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iM143 = 0;
        }
        if (m162(this.f222)) {
            iMax2 = Math.max(iMax2, m152(this.f222, i, iMax5 + i6, i2, iM143 + i5, iArr));
            iM143 = m143(this.f222) + this.f222.getMeasuredHeight() + iM143;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f222.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iM143);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f225) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt2 = getChildAt(i7);
            if (m162(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C2958)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2958 c2958 = (C2958) parcelable;
        super.onRestoreInstanceState(c2958.f15438);
        ActionMenuView actionMenuView = this.f235;
        MenuC3643 menuC3643 = actionMenuView != null ? actionMenuView.f139 : null;
        int i = c2958.f11400;
        if (i != 0 && this.f224 != null && menuC3643 != null && (menuItemFindItem = menuC3643.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c2958.f11401) {
            RunnableC0183 runnableC0183 = this.f233;
            removeCallbacks(runnableC0183);
            post(runnableC0183);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m163();
        C2923 c2923 = this.f240;
        boolean z = i == 1;
        if (z == c2923.f11327) {
            return;
        }
        c2923.f11327 = z;
        if (!c2923.f11323) {
            c2923.f11325 = c2923.f11322;
            c2923.f11321 = c2923.f11326;
            return;
        }
        if (z) {
            int i2 = c2923.f11328;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c2923.f11322;
            }
            c2923.f11325 = i2;
            int i3 = c2923.f11324;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c2923.f11326;
            }
            c2923.f11321 = i3;
            return;
        }
        int i4 = c2923.f11324;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c2923.f11322;
        }
        c2923.f11325 = i4;
        int i5 = c2923.f11328;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c2923.f11326;
        }
        c2923.f11321 = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2908 c2908;
        C3644 c3644;
        C2958 c2958 = new C2958(super.onSaveInstanceState());
        C2881 c2881 = this.f224;
        if (c2881 != null && (c3644 = c2881.f11151) != null) {
            c2958.f11400 = c3644.f13941;
        }
        ActionMenuView actionMenuView = this.f235;
        c2958.f11401 = (actionMenuView == null || (c2908 = actionMenuView.f141) == null || !c2908.m7256()) ? false : true;
        return c2958;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f221 = false;
        }
        if (!this.f221) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f221 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f221 = false;
        }
        return true;
    }

    @Override // p378.InterfaceC4341
    public final void removeMenuProvider(InterfaceC4343 interfaceC4343) {
        C4354 c4354 = this.f231;
        c4354.f16859.remove(interfaceC4343);
        if (c4354.f16860.remove(interfaceC4343) != null) {
            throw new ClassCastException();
        }
        c4354.f16861.run();
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f208 != z) {
            this.f208 = z;
            m149();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m154();
        }
        C2971 c2971 = this.f219;
        if (c2971 != null) {
            c2971.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(ٴˎ.ˏᵢ(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m154();
            this.f219.setImageDrawable(drawable);
        } else {
            C2971 c2971 = this.f219;
            if (c2971 != null) {
                c2971.setImageDrawable(this.f243);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.f225 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f218) {
            this.f218 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f248) {
            this.f248 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(ٴˎ.ˏᵢ(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f215 == null) {
                this.f215 = new AppCompatImageView(getContext(), null);
            }
            if (!m153(this.f215)) {
                m147(this.f215, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f215;
            if (appCompatImageView != null && m153(appCompatImageView)) {
                removeView(this.f215);
                this.f216.remove(this.f215);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f215;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f215 == null) {
            this.f215 = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f215;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m158();
        }
        C2971 c2971 = this.f234;
        if (c2971 != null) {
            c2971.setContentDescription(charSequence);
            ˉⁱ.ˈٴ(this.f234, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(ٴˎ.ˏᵢ(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m158();
            if (!m153(this.f234)) {
                m147(this.f234, true);
            }
        } else {
            C2971 c2971 = this.f234;
            if (c2971 != null && m153(c2971)) {
                removeView(this.f234);
                this.f216.remove(this.f234);
            }
        }
        C2971 c29712 = this.f234;
        if (c29712 != null) {
            c29712.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m158();
        this.f234.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC2862 interfaceC2862) {
    }

    public void setOverflowIcon(Drawable drawable) {
        m148();
        this.f235.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f249 != i) {
            this.f249 = i;
            if (i == 0) {
                this.f236 = getContext();
            } else {
                this.f236 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C2900 c2900 = this.f222;
            if (c2900 != null && m153(c2900)) {
                removeView(this.f222);
                this.f216.remove(this.f222);
            }
        } else {
            if (this.f222 == null) {
                Context context = getContext();
                C2900 c29002 = new C2900(context, null);
                this.f222 = c29002;
                c29002.setSingleLine();
                this.f222.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f227;
                if (i != 0) {
                    this.f222.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f245;
                if (colorStateList != null) {
                    this.f222.setTextColor(colorStateList);
                }
            }
            if (!m153(this.f222)) {
                m147(this.f222, true);
            }
        }
        C2900 c29003 = this.f222;
        if (c29003 != null) {
            c29003.setText(charSequence);
        }
        this.f213 = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f245 = colorStateList;
        C2900 c2900 = this.f222;
        if (c2900 != null) {
            c2900.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C2900 c2900 = this.f214;
            if (c2900 != null && m153(c2900)) {
                removeView(this.f214);
                this.f216.remove(this.f214);
            }
        } else {
            if (this.f214 == null) {
                Context context = getContext();
                C2900 c29002 = new C2900(context, null);
                this.f214 = c29002;
                c29002.setSingleLine();
                this.f214.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f212;
                if (i != 0) {
                    this.f214.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f217;
                if (colorStateList != null) {
                    this.f214.setTextColor(colorStateList);
                }
            }
            if (!m153(this.f214)) {
                m147(this.f214, true);
            }
        }
        C2900 c29003 = this.f214;
        if (c29003 != null) {
            c29003.setText(charSequence);
        }
        this.f237 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f241 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f242 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f223 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f209 = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f217 = colorStateList;
        C2900 c2900 = this.f214;
        if (c2900 != null) {
            c2900.setTextColor(colorStateList);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m147(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C2878 c2878M145 = layoutParams == null ? m145() : !checkLayoutParams(layoutParams) ? m146(layoutParams) : (C2878) layoutParams;
        c2878M145.f11141 = 1;
        if (!z || this.f229 == null) {
            addView(view, c2878M145);
        } else {
            view.setLayoutParams(c2878M145);
            this.f216.add(view);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m148() {
        m157();
        ActionMenuView actionMenuView = this.f235;
        if (actionMenuView.f139 == null) {
            MenuC3643 menuC3643 = (MenuC3643) actionMenuView.getMenu();
            if (this.f224 == null) {
                this.f224 = new C2881(this);
            }
            this.f235.setExpandedActionViewsExclusive(true);
            menuC3643.m8585(this.f224, this.f236);
            m149();
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m149() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM7335 = AbstractC2963.m7335(this);
            C2881 c2881 = this.f224;
            boolean z = (c2881 == null || c2881.f11151 == null || onBackInvokedDispatcherM7335 == null || !isAttachedToWindow() || !this.f208) ? false : true;
            if (z && this.f250 == null) {
                if (this.f246 == null) {
                    this.f246 = AbstractC2963.m7333(new RunnableC2922(this, 0));
                }
                AbstractC2963.m7334(onBackInvokedDispatcherM7335, this.f246);
                this.f250 = onBackInvokedDispatcherM7335;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f250) == null) {
                return;
            }
            AbstractC2963.m7336(onBackInvokedDispatcher, this.f246);
            this.f250 = null;
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int m150(View view, int i) {
        C2878 c2878 = (C2878) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c2878.f11142 & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f220 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c2878).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c2878).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c2878).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void mo151(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int m152(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean m153(View view) {
        return view.getParent() == this || this.f216.contains(view);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m154() {
        if (this.f219 == null) {
            C2971 c2971 = new C2971(getContext(), null, R.attr._2_res_0x7f040611);
            this.f219 = c2971;
            c2971.setImageDrawable(this.f243);
            this.f219.setContentDescription(this.f247);
            C2878 c2878M145 = m145();
            c2878M145.f11142 = (this.f226 & 112) | 8388611;
            c2878M145.f11141 = 2;
            this.f219.setLayoutParams(c2878M145);
            this.f219.setOnClickListener(new ViewOnClickListenerC0202(5, this));
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final int m155(View view, int i, int i2, int[] iArr) {
        C2878 c2878 = (C2878) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c2878).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM150 = m150(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM150, iMax + measuredWidth, view.getMeasuredHeight() + iM150);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c2878).rightMargin + iMax;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m156(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C2878 c2878 = (C2878) childAt.getLayoutParams();
                if (c2878.f11141 == 0 && m162(childAt)) {
                    int i3 = c2878.f11142;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C2878 c28782 = (C2878) childAt2.getLayoutParams();
            if (c28782.f11141 == 0 && m162(childAt2)) {
                int i5 = c28782.f11142;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m157() {
        if (this.f235 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f235 = actionMenuView;
            actionMenuView.setPopupTheme(this.f249);
            this.f235.setOnMenuItemClickListener(this.f230);
            ActionMenuView actionMenuView2 = this.f235;
            ˋˉ r1 = new ˋˉ(8, this);
            actionMenuView2.getClass();
            actionMenuView2.f144 = r1;
            C2878 c2878M145 = m145();
            c2878M145.f11142 = (this.f226 & 112) | 8388613;
            this.f235.setLayoutParams(c2878M145);
            m147(this.f235, false);
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m158() {
        if (this.f234 == null) {
            this.f234 = new C2971(getContext(), null, R.attr._2_res_0x7f040611);
            C2878 c2878M145 = m145();
            c2878M145.f11142 = (this.f226 & 112) | 8388611;
            this.f234.setLayoutParams(c2878M145);
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m159() {
        Iterator it = this.f232.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.f231.f16859.iterator();
        while (it2.hasNext()) {
            ((C3453) ((InterfaceC4343) it2.next())).f13374.m659(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f232 = currentMenuItems2;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m160(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m161(View view, int i, int i2, int[] iArr) {
        C2878 c2878 = (C2878) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c2878).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM150 = m150(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM150, iMax, view.getMeasuredHeight() + iM150);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c2878).leftMargin);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final boolean m162(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m163() {
        if (this.f240 == null) {
            C2923 c2923 = new C2923();
            c2923.f11325 = 0;
            c2923.f11321 = 0;
            c2923.f11324 = Integer.MIN_VALUE;
            c2923.f11328 = Integer.MIN_VALUE;
            c2923.f11322 = 0;
            c2923.f11326 = 0;
            c2923.f11327 = false;
            c2923.f11323 = false;
            this.f240 = c2923;
        }
    }
}
