package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.AbstractC0002;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p013.AbstractC1037;
import p033.C1212;
import p036.C1262;
import p061.AbstractC1355;
import p061.AbstractC1358;
import p061.AbstractC1360;
import p061.AbstractC1371;
import p061.AbstractC1373;
import p061.AbstractC1375;
import p061.AbstractC1402;
import p061.AbstractC1413;
import p061.AbstractC1417;
import p061.C1356;
import p061.C1366;
import p061.C1368;
import p061.C1377;
import p061.C1385;
import p061.C1386;
import p061.C1389;
import p061.C1391;
import p061.C1398;
import p061.C1399;
import p061.C1403;
import p061.C1412;
import p061.C1421;
import p061.C1423;
import p061.C1425;
import p061.C1426;
import p061.C1429;
import p061.C1436;
import p061.C1438;
import p061.InterfaceC1396;
import p061.InterfaceC1441;
import p061.InterpolatorC1381;
import p061.RunnableC1362;
import p061.RunnableC1376;
import p061.RunnableC1378;
import p080.AbstractC1702;
import p107.AbstractC1801;
import p200.C2742;
import p200.C2755;
import p232.AbstractC3076;
import p331.C3767;
import p360.C4082;
import p378.AbstractC4337;
import p378.AbstractC4339;
import p378.AbstractC4345;
import p378.AbstractC4364;
import p378.C4347;
import p453.AbstractC5202;
import ˆˑ.ﹳﹳ;
import ᵎﹳ.ᐧʻ;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public static final boolean f1638;

    /* renamed from: ˆˋ, reason: contains not printable characters */
    public static final boolean f1639;

    /* renamed from: ˆﹶ, reason: contains not printable characters */
    public static final boolean f1641;

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final C1386 f1642;

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public static boolean f1643;

    /* renamed from: יי, reason: contains not printable characters */
    public static boolean f1644;

    /* renamed from: ٴᵔ, reason: contains not printable characters */
    public static final InterpolatorC1381 f1645;

    /* renamed from: ᵢⁱ, reason: contains not printable characters */
    public static final Class[] f1646;

    /* renamed from: ʻ, reason: contains not printable characters */
    public final int f1648;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public VelocityTracker f1649;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final ArrayList f1650;

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public final C1412 f1651;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public boolean f1652;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public C1436 f1653;

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public final RunnableC1362 f1654;

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public boolean f1655;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public int f1656;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public final int f1657;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final RectF f1658;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public int f1659;

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public int f1660;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public boolean f1661;

    /* renamed from: ˆʼ, reason: contains not printable characters */
    public final RunnableC1376 f1662;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C1356 f1663;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C1262 f1664;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public int f1665;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public boolean f1666;

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public final int[] f1667;

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public final int[] f1668;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public boolean f1669;

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public final float f1670;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public boolean f1671;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public int f1672;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f1673;

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public C4347 f1674;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public int f1675;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public boolean f1676;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C1429 f1677;

    /* renamed from: ˎי, reason: contains not printable characters */
    public int f1678;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final ArrayList f1679;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public EdgeEffect f1680;

    /* renamed from: ˏ, reason: contains not printable characters */
    public AbstractC1417 f1681;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public AbstractC1371 f1682;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public AbstractC1402 f1683;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public AbstractC1373 f1684;

    /* renamed from: יˆ, reason: contains not printable characters */
    public final int[] f1685;

    /* renamed from: יˊ, reason: contains not printable characters */
    public boolean f1686;

    /* renamed from: יˋ, reason: contains not printable characters */
    public final AccessibilityManager f1687;

    /* renamed from: יᴵ, reason: contains not printable characters */
    public final ArrayList f1688;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final RunnableC1376 f1689;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public EdgeEffect f1690;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public int f1691;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public AbstractC1358 f1692;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public int f1693;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C1377 f1694;

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public final float f1695;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final float f1696;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final Rect f1697;

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public boolean f1698;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public boolean f1699;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public boolean f1700;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public EdgeEffect f1701;

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public RunnableC1378 f1702;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public EdgeEffect f1703;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean f1704;

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public final C1426 f1705;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public C1368 f1706;

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final C1366 f1707;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final ArrayList f1708;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C1389 f1709;

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public ArrayList f1710;

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public final int[] f1711;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public InterfaceC1441 f1712;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public int f1713;

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public AbstractC1413 f1714;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public int f1715;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public int f1716;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C3767 f1717;

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public final C1423 f1718;

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public boolean f1719;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public boolean f1720;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final Rect f1721;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public int f1722;

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public static final int[] f1640 = {R.attr.nestedScrollingEnabled};

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static final float f1647 = (float) (Math.log(0.78d) / Math.log(0.9d));

    static {
        f1641 = Build.VERSION.SDK_INT >= 23;
        f1639 = true;
        f1638 = true;
        Class cls = Integer.TYPE;
        f1646 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1645 = new InterpolatorC1381(0);
        f1642 = new C1386();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0404be);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        float fM9946;
        TypedArray typedArray;
        int i2;
        char c;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.f1663 = new C1356(this);
        this.f1677 = new C1429(this);
        this.f1717 = new C3767(5);
        this.f1689 = new RunnableC1376(this, 0);
        this.f1697 = new Rect();
        this.f1721 = new Rect();
        this.f1658 = new RectF();
        this.f1679 = new ArrayList();
        this.f1708 = new ArrayList();
        this.f1650 = new ArrayList();
        this.f1675 = 0;
        this.f1652 = false;
        this.f1666 = false;
        this.f1656 = 0;
        this.f1691 = 0;
        this.f1692 = f1642;
        this.f1682 = new C1438(0);
        this.f1716 = 0;
        this.f1722 = -1;
        this.f1670 = Float.MIN_VALUE;
        this.f1695 = Float.MIN_VALUE;
        int i3 = 1;
        this.f1719 = true;
        this.f1654 = new RunnableC1362(this);
        this.f1718 = f1638 ? new C1423() : null;
        C1426 c1426 = new C1426();
        c1426.f5830 = -1;
        c1426.f5820 = 0;
        c1426.f5828 = 0;
        c1426.f5834 = 1;
        c1426.f5821 = 0;
        c1426.f5831 = false;
        c1426.f5832 = false;
        c1426.f5827 = false;
        c1426.f5835 = false;
        c1426.f5822 = false;
        c1426.f5825 = false;
        this.f1705 = c1426;
        this.f1698 = false;
        this.f1699 = false;
        C1366 c1366 = new C1366(this);
        this.f1707 = c1366;
        this.f1686 = false;
        this.f1668 = new int[2];
        this.f1685 = new int[2];
        this.f1667 = new int[2];
        this.f1711 = new int[2];
        this.f1688 = new ArrayList();
        this.f1662 = new RunnableC1376(this, i3);
        this.f1660 = 0;
        this.f1678 = 0;
        this.f1651 = new C1412(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1713 = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = AbstractC4364.f16866;
            fM9946 = AbstractC1801.m5534(viewConfiguration);
        } else {
            fM9946 = AbstractC4364.m9946(viewConfiguration, context);
        }
        this.f1670 = fM9946;
        this.f1695 = i4 >= 26 ? AbstractC1801.m5540(viewConfiguration) : AbstractC4364.m9946(viewConfiguration, context);
        this.f1648 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1657 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1696 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1682.f5590 = c1366;
        this.f1664 = new C1262(new C1412(this));
        this.f1709 = new C1389(new C1366(this));
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        if ((i4 >= 26 ? AbstractC4337.m9848(this) : 0) == 0 && i4 >= 26) {
            AbstractC4337.m9847(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1687 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1436(this));
        int[] iArr = AbstractC3076.f11864;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC4345.m9881(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1673 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(AbstractC0002.m37(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            typedArray = typedArrayObtainStyledAttributes;
            c = 2;
            i2 = 4;
            new C1368(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f0700c2), resources.getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f0700c4), resources.getDimensionPixelOffset(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f0700c3));
        } else {
            typedArray = typedArrayObtainStyledAttributes;
            i2 = 4;
            c = 2;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC1402.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f1646);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC1402) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr2 = f1640;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        AbstractC4345.m9881(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b01fe, Boolean.TRUE);
    }

    private C4347 getScrollingChildHelper() {
        if (this.f1674 == null) {
            this.f1674 = new C4347(this);
        }
        return this.f1674;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        f1643 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        f1644 = z;
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static AbstractC1375 m1270(View view) {
        if (view == null) {
            return null;
        }
        return ((C1398) view.getLayoutParams()).f5702;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m1272(AbstractC1375 abstractC1375) {
        WeakReference weakReference = abstractC1375.f5609;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC1375.f5618) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC1375.f5609 = null;
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static int m1273(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && ﹳﹳ.ˉⁱ(edgeEffect) != 0.0f) {
            int iRound = Math.round(ﹳﹳ.ʿˏ(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || ﹳﹳ.ˉⁱ(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(ﹳﹳ.ʿˏ(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static RecyclerView m1277(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM1277 = m1277(viewGroup.getChildAt(i));
            if (recyclerViewM1277 != null) {
                return recyclerViewM1277;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 == null || !abstractC1402.mo799(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1398) && this.f1683.mo832((C1398) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 != null && abstractC1402.mo797()) {
            return this.f1683.mo1249(this.f1705);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 != null && abstractC1402.mo797()) {
            return this.f1683.mo1215(this.f1705);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 != null && abstractC1402.mo797()) {
            return this.f1683.mo1217(this.f1705);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 != null && abstractC1402.mo828()) {
            return this.f1683.mo1260(this.f1705);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 != null && abstractC1402.mo828()) {
            return this.f1683.mo1219(this.f1705);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 != null && abstractC1402.mo828()) {
            return this.f1683.mo1222(this.f1705);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m9897(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m9893(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m9896(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m9900(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.f1708;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC1360) arrayList.get(i)).mo4727(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1690;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1673 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1690;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f1703;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1673) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1703;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f1701;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1673 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1701;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f1680;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1673) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1680;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f1682 == null || arrayList.size() <= 0 || !this.f1682.mo4755()) ? z : true) {
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 != null) {
            return abstractC1402.mo856();
        }
        throw new IllegalStateException(AbstractC0002.m37(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 != null) {
            return abstractC1402.mo800(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC0002.m37(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 != null) {
            return abstractC1402.mo814(layoutParams);
        }
        throw new IllegalStateException(AbstractC0002.m37(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1373 getAdapter() {
        return this.f1684;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 == null) {
            return super.getBaseline();
        }
        abstractC1402.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1673;
    }

    public C1436 getCompatAccessibilityDelegate() {
        return this.f1653;
    }

    public AbstractC1358 getEdgeEffectFactory() {
        return this.f1692;
    }

    public AbstractC1371 getItemAnimator() {
        return this.f1682;
    }

    public int getItemDecorationCount() {
        return this.f1708.size();
    }

    public AbstractC1402 getLayoutManager() {
        return this.f1683;
    }

    public int getMaxFlingVelocity() {
        return this.f1657;
    }

    public int getMinFlingVelocity() {
        return this.f1648;
    }

    public long getNanoTime() {
        if (f1638) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC1417 getOnFlingListener() {
        return this.f1681;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1719;
    }

    public C1391 getRecycledViewPool() {
        return this.f1677.m4964();
    }

    public int getScrollState() {
        return this.f1716;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m9898(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1704;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1661;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f16846;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f1656 = r0
            r1 = 1
            r5.f1704 = r1
            boolean r2 = r5.f1671
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r5.f1671 = r2
            ʾـ.ⁱⁱ r2 = r5.f1677
            r2.m4958()
            ʾـ.ٴﹶ r2 = r5.f1683
            if (r2 == 0) goto L26
            r2.f5728 = r1
            r2.mo2843(r5)
        L26:
            r5.f1686 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f1638
            if (r0 == 0) goto L91
            java.lang.ThreadLocal r0 = p061.RunnableC1378.f5629
            java.lang.Object r1 = r0.get()
            ʾـ.ˋˉ r1 = (p061.RunnableC1378) r1
            r5.f1702 = r1
            if (r1 != 0) goto L74
            ʾـ.ˋˉ r1 = new ʾـ.ˋˉ
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f5634 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f5633 = r2
            r5.f1702 = r1
            java.util.WeakHashMap r1 = p378.AbstractC4345.f16838
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L66
            if (r1 == 0) goto L66
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L66
            goto L68
        L66:
            r1 = 1114636288(0x42700000, float:60.0)
        L68:
            ʾـ.ˋˉ r2 = r5.f1702
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f5632 = r3
            r0.set(r2)
        L74:
            ʾـ.ˋˉ r0 = r5.f1702
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.f1643
            java.util.ArrayList r0 = r0.f5634
            if (r1 == 0) goto L8e
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L86
            goto L8e
        L86:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L8e:
            r0.add(r5)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1429 c1429;
        RunnableC1378 runnableC1378;
        C1425 c1425;
        super.onDetachedFromWindow();
        AbstractC1371 abstractC1371 = this.f1682;
        if (abstractC1371 != null) {
            abstractC1371.mo4754();
        }
        int i = 0;
        setScrollState(0);
        RunnableC1362 runnableC1362 = this.f1654;
        runnableC1362.f5526.removeCallbacks(runnableC1362);
        runnableC1362.f5522.abortAnimation();
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 != null && (c1425 = abstractC1402.f5718) != null) {
            c1425.m4946();
        }
        this.f1704 = false;
        AbstractC1402 abstractC14022 = this.f1683;
        if (abstractC14022 != null) {
            abstractC14022.f5728 = false;
            abstractC14022.mo1265(this);
        }
        this.f1688.clear();
        removeCallbacks(this.f1662);
        this.f1717.getClass();
        while (C1421.f5788.mo5419() != null) {
        }
        int i2 = 0;
        while (true) {
            c1429 = this.f1677;
            ArrayList arrayList = c1429.f5849;
            if (i2 >= arrayList.size()) {
                break;
            }
            ﹳﹳ.ـﹶ(((AbstractC1375) arrayList.get(i2)).f5618);
            i2++;
        }
        c1429.m4966(c1429.f5848.f1684, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            C4082 c4082 = (C4082) childAt.getTag(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b02fd);
            if (c4082 == null) {
                c4082 = new C4082();
                childAt.setTag(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b02fd, c4082);
            }
            ArrayList arrayList2 = c4082.f15752;
            int iM4009 = AbstractC1037.m4009(arrayList2);
            if (-1 < iM4009) {
                ᐧʻ.ᵎˏ(arrayList2.get(iM4009));
                throw null;
            }
            i = i3;
        }
        if (!f1638 || (runnableC1378 = this.f1702) == null) {
            return;
        }
        boolean zRemove = runnableC1378.f5634.remove(this);
        if (f1643 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f1702 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1708;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1360) arrayList.get(i)).mo2876(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.f1661) {
            return false;
        }
        this.f1706 = null;
        if (m1311(motionEvent)) {
            m1288();
            setScrollState(0);
            return true;
        }
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 == null) {
            return false;
        }
        boolean zMo797 = abstractC1402.mo797();
        boolean zMo828 = this.f1683.mo828();
        if (this.f1649 == null) {
            this.f1649 = VelocityTracker.obtain();
        }
        this.f1649.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1669) {
                this.f1669 = false;
            }
            this.f1722 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f1659 = x;
            this.f1693 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f1665 = y;
            this.f1672 = y;
            EdgeEffect edgeEffect = this.f1690;
            if (edgeEffect == null || ﹳﹳ.ˉⁱ(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                ﹳﹳ.ʿˏ(this.f1690, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.f1701;
            if (edgeEffect2 != null && ﹳﹳ.ˉⁱ(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                ﹳﹳ.ʿˏ(this.f1701, 0.0f, motionEvent.getY() / getHeight());
                z = true;
            }
            EdgeEffect edgeEffect3 = this.f1703;
            if (edgeEffect3 != null && ﹳﹳ.ˉⁱ(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                ﹳﹳ.ʿˏ(this.f1703, 0.0f, motionEvent.getX() / getWidth());
                z = true;
            }
            EdgeEffect edgeEffect4 = this.f1680;
            if (edgeEffect4 != null && ﹳﹳ.ˉⁱ(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                ﹳﹳ.ʿˏ(this.f1680, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                z = true;
            }
            if (z || this.f1716 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m1279(1);
            }
            int[] iArr = this.f1667;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zMo797;
            if (zMo828) {
                i = (zMo797 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m9899(i, 0);
        } else if (actionMasked == 1) {
            this.f1649.clear();
            m1279(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f1722);
            if (iFindPointerIndex < 0) {
                String str = "Error processing scroll; pointer index for id " + this.f1722 + " not found. Did any MotionEvents get skipped?";
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f1716 != 1) {
                int i2 = x2 - this.f1693;
                int i3 = y2 - this.f1672;
                if (zMo797 == 0 || Math.abs(i2) <= this.f1713) {
                    z2 = false;
                } else {
                    this.f1659 = x2;
                    z2 = true;
                }
                if (zMo828 && Math.abs(i3) > this.f1713) {
                    this.f1665 = y2;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m1288();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f1722 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1659 = x3;
            this.f1693 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1665 = y3;
            this.f1672 = y3;
        } else if (actionMasked == 6) {
            m1291(motionEvent);
        }
        return this.f1716 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = AbstractC5202.f20025;
        Trace.beginSection("RV OnLayout");
        m1298();
        Trace.endSection();
        this.f1671 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 == null) {
            m1317(i, i2);
            return;
        }
        boolean zMo1234 = abstractC1402.mo1234();
        C1429 c1429 = this.f1677;
        boolean z = false;
        C1426 c1426 = this.f1705;
        if (zMo1234) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f1683.mo789(c1429, c1426, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f1655 = z;
            if (z || this.f1684 == null) {
                return;
            }
            if (c1426.f5834 == 1) {
                m1316();
            }
            this.f1683.m4841(i, i2);
            c1426.f5835 = true;
            m1324();
            this.f1683.m4821(i, i2);
            if (this.f1683.mo1254()) {
                this.f1683.m4841(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c1426.f5835 = true;
                m1324();
                this.f1683.m4821(i, i2);
            }
            this.f1660 = getMeasuredWidth();
            this.f1678 = getMeasuredHeight();
            return;
        }
        if (this.f1720) {
            this.f1683.mo789(c1429, c1426, i, i2);
            return;
        }
        if (this.f1676) {
            m1323();
            m1318();
            m1283();
            m1330(true);
            if (c1426.f5825) {
                c1426.f5832 = true;
            } else {
                this.f1664.m4496();
                c1426.f5832 = false;
            }
            this.f1676 = false;
            m1332(false);
        } else if (c1426.f5825) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC1373 abstractC1373 = this.f1684;
        if (abstractC1373 != null) {
            c1426.f5821 = abstractC1373.mo974();
        } else {
            c1426.f5821 = 0;
        }
        m1323();
        this.f1683.mo789(c1429, c1426, i, i2);
        m1332(false);
        c1426.f5832 = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m1299()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1377)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1377 c1377 = (C1377) parcelable;
        this.f1694 = c1377;
        super.onRestoreInstanceState(c1377.f15438);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1377 c1377 = new C1377(super.onSaveInstanceState());
        C1377 c13772 = this.f1694;
        if (c13772 != null) {
            c1377.f5628 = c13772.f5628;
        } else {
            AbstractC1402 abstractC1402 = this.f1683;
            if (abstractC1402 != null) {
                c1377.f5628 = abstractC1402.mo796();
            } else {
                c1377.f5628 = null;
            }
        }
        return c1377;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f1680 = null;
        this.f1703 = null;
        this.f1701 = null;
        this.f1690 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0399 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8 A[PHI: r0
  0x01f8: PHI (r0v55 int) = (r0v40 int), (r0v59 int) binds: [B:90:0x01e1, B:94:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fb  */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC1375 abstractC1375M1270 = m1270(view);
        if (abstractC1375M1270 != null) {
            if (abstractC1375M1270.m4770()) {
                abstractC1375M1270.f5619 &= -257;
            } else if (!abstractC1375M1270.m4771()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(abstractC1375M1270);
                throw new IllegalArgumentException(AbstractC0002.m37(this, sb));
            }
        } else if (f1643) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(AbstractC0002.m37(this, sb2));
        }
        view.clearAnimation();
        AbstractC1375 abstractC1375M12702 = m1270(view);
        AbstractC1373 abstractC1373 = this.f1684;
        if (abstractC1373 != null && abstractC1375M12702 != null) {
            abstractC1373.m4761(abstractC1375M12702);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f1683.mo833(this, view, view2) && view2 != null) {
            m1281(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f1683.mo859(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f1650;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1368) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1675 != 0 || this.f1661) {
            this.f1700 = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 == null || this.f1661) {
            return;
        }
        boolean zMo797 = abstractC1402.mo797();
        boolean zMo828 = this.f1683.mo828();
        if (zMo797 || zMo828) {
            if (!zMo797) {
                i = 0;
            }
            if (!zMo828) {
                i2 = 0;
            }
            m1282(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1299()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1715 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C1436 c1436) {
        this.f1653 = c1436;
        AbstractC4345.m9884(this, c1436);
    }

    public void setAdapter(AbstractC1373 abstractC1373) {
        setLayoutFrozen(false);
        AbstractC1373 abstractC13732 = this.f1684;
        C1356 c1356 = this.f1663;
        if (abstractC13732 != null) {
            abstractC13732.f5598.unregisterObserver(c1356);
            this.f1684.getClass();
        }
        AbstractC1371 abstractC1371 = this.f1682;
        if (abstractC1371 != null) {
            abstractC1371.mo4754();
        }
        AbstractC1402 abstractC1402 = this.f1683;
        C1429 c1429 = this.f1677;
        if (abstractC1402 != null) {
            abstractC1402.mo818(c1429);
            this.f1683.m4820(c1429);
        }
        c1429.f5850.clear();
        c1429.m4967();
        C1262 c1262 = this.f1664;
        c1262.m4492((ArrayList) c1262.f5177);
        c1262.m4492((ArrayList) c1262.f5180);
        c1262.f5178 = 0;
        AbstractC1373 abstractC13733 = this.f1684;
        this.f1684 = abstractC1373;
        if (abstractC1373 != null) {
            abstractC1373.f5598.registerObserver(c1356);
        }
        AbstractC1402 abstractC14022 = this.f1683;
        if (abstractC14022 != null) {
            abstractC14022.mo836(abstractC13733);
        }
        AbstractC1373 abstractC13734 = this.f1684;
        c1429.f5850.clear();
        c1429.m4967();
        c1429.m4966(abstractC13733, true);
        C1391 c1391M4964 = c1429.m4964();
        if (abstractC13733 != null) {
            c1391M4964.f5672--;
        }
        if (c1391M4964.f5672 == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c1391M4964.f5674;
                if (i >= sparseArray.size()) {
                    break;
                }
                C1385 c1385 = (C1385) sparseArray.valueAt(i);
                Iterator it = c1385.f5652.iterator();
                while (it.hasNext()) {
                    ﹳﹳ.ـﹶ(((AbstractC1375) it.next()).f5618);
                }
                c1385.f5652.clear();
                i++;
            }
        }
        if (abstractC13734 != null) {
            c1391M4964.f5672++;
        }
        c1429.m4958();
        this.f1705.f5831 = true;
        m1290(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1396 interfaceC1396) {
        if (interfaceC1396 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f1673) {
            this.f1680 = null;
            this.f1703 = null;
            this.f1701 = null;
            this.f1690 = null;
        }
        this.f1673 = z;
        super.setClipToPadding(z);
        if (this.f1671) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC1358 abstractC1358) {
        abstractC1358.getClass();
        this.f1692 = abstractC1358;
        this.f1680 = null;
        this.f1703 = null;
        this.f1701 = null;
        this.f1690 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f1720 = z;
    }

    public void setItemAnimator(AbstractC1371 abstractC1371) {
        AbstractC1371 abstractC13712 = this.f1682;
        if (abstractC13712 != null) {
            abstractC13712.mo4754();
            this.f1682.f5590 = null;
        }
        this.f1682 = abstractC1371;
        if (abstractC1371 != null) {
            abstractC1371.f5590 = this.f1707;
        }
    }

    public void setItemViewCacheSize(int i) {
        C1429 c1429 = this.f1677;
        c1429.f5847 = i;
        c1429.m4968();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC1402 abstractC1402) {
        RecyclerView recyclerView;
        C1425 c1425;
        if (abstractC1402 == this.f1683) {
            return;
        }
        setScrollState(0);
        RunnableC1362 runnableC1362 = this.f1654;
        runnableC1362.f5526.removeCallbacks(runnableC1362);
        runnableC1362.f5522.abortAnimation();
        AbstractC1402 abstractC14022 = this.f1683;
        if (abstractC14022 != null && (c1425 = abstractC14022.f5718) != null) {
            c1425.m4946();
        }
        AbstractC1402 abstractC14023 = this.f1683;
        C1429 c1429 = this.f1677;
        if (abstractC14023 != null) {
            AbstractC1371 abstractC1371 = this.f1682;
            if (abstractC1371 != null) {
                abstractC1371.mo4754();
            }
            this.f1683.mo818(c1429);
            this.f1683.m4820(c1429);
            c1429.f5850.clear();
            c1429.m4967();
            if (this.f1704) {
                AbstractC1402 abstractC14024 = this.f1683;
                abstractC14024.f5728 = false;
                abstractC14024.mo1265(this);
            }
            this.f1683.m4827(null);
            this.f1683 = null;
        } else {
            c1429.f5850.clear();
            c1429.m4967();
        }
        C1389 c1389 = this.f1709;
        ((C1403) c1389.f5667).m4849();
        ArrayList arrayList = (ArrayList) c1389.f5665;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C1366) c1389.f5666).f5546;
            if (size < 0) {
                break;
            }
            AbstractC1375 abstractC1375M1270 = m1270((View) arrayList.get(size));
            if (abstractC1375M1270 != null) {
                int i = abstractC1375M1270.f5613;
                if (recyclerView.m1299()) {
                    abstractC1375M1270.f5621 = i;
                    recyclerView.f1688.add(abstractC1375M1270);
                } else {
                    WeakHashMap weakHashMap = AbstractC4345.f16838;
                    abstractC1375M1270.f5618.setImportantForAccessibility(i);
                }
                abstractC1375M1270.f5613 = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            AbstractC1375 abstractC1375M12702 = m1270(childAt);
            AbstractC1373 abstractC1373 = recyclerView.f1684;
            if (abstractC1373 != null && abstractC1375M12702 != null) {
                abstractC1373.m4761(abstractC1375M12702);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1683 = abstractC1402;
        if (abstractC1402 != null) {
            if (abstractC1402.f5717 != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC1402);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC0002.m37(abstractC1402.f5717, sb));
            }
            abstractC1402.m4827(this);
            if (this.f1704) {
                AbstractC1402 abstractC14025 = this.f1683;
                abstractC14025.f5728 = true;
                abstractC14025.mo2843(this);
            }
        }
        c1429.m4968();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C4347 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f16846) {
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            AbstractC4339.m9860(scrollingChildHelper.f16844);
        }
        scrollingChildHelper.f16846 = z;
    }

    public void setOnFlingListener(AbstractC1417 abstractC1417) {
        this.f1681 = abstractC1417;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC1413 abstractC1413) {
        this.f1714 = abstractC1413;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f1719 = z;
    }

    public void setRecycledViewPool(C1391 c1391) {
        C1429 c1429 = this.f1677;
        RecyclerView recyclerView = c1429.f5848;
        c1429.m4966(recyclerView.f1684, false);
        if (c1429.f5852 != null) {
            r2.f5672--;
        }
        c1429.f5852 = c1391;
        if (c1391 != null && recyclerView.getAdapter() != null) {
            c1429.f5852.f5672++;
        }
        c1429.m4958();
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC1441 interfaceC1441) {
        this.f1712 = interfaceC1441;
    }

    public void setScrollState(int i) {
        C1425 c1425;
        if (i == this.f1716) {
            return;
        }
        if (f1644) {
            StringBuilder sbM40 = AbstractC0002.m40(i, "setting scroll state to ", " from ");
            sbM40.append(this.f1716);
            sbM40.toString();
            new Exception();
        }
        this.f1716 = i;
        if (i != 2) {
            RunnableC1362 runnableC1362 = this.f1654;
            runnableC1362.f5526.removeCallbacks(runnableC1362);
            runnableC1362.f5522.abortAnimation();
            AbstractC1402 abstractC1402 = this.f1683;
            if (abstractC1402 != null && (c1425 = abstractC1402.f5718) != null) {
                c1425.m4946();
            }
        }
        AbstractC1402 abstractC14022 = this.f1683;
        if (abstractC14022 != null) {
            abstractC14022.mo1344(i);
        }
        AbstractC1413 abstractC1413 = this.f1714;
        if (abstractC1413 != null) {
            abstractC1413.mo2864(this, i);
        }
        ArrayList arrayList = this.f1710;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC1413) this.f1710.get(size)).mo2864(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1713 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            String str = "setScrollingTouchSlop(): bad argument constant " + i + "; using default value";
        }
        this.f1713 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1355 abstractC1355) {
        this.f1677.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m9899(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m9895(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        C1425 c1425;
        if (z != this.f1661) {
            m1301("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f1661 = false;
                if (this.f1700 && this.f1683 != null && this.f1684 != null) {
                    requestLayout();
                }
                this.f1700 = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1661 = true;
            this.f1669 = true;
            setScrollState(0);
            RunnableC1362 runnableC1362 = this.f1654;
            runnableC1362.f5526.removeCallbacks(runnableC1362);
            runnableC1362.f5522.abortAnimation();
            AbstractC1402 abstractC1402 = this.f1683;
            if (abstractC1402 == null || (c1425 = abstractC1402.f5718) == null) {
                return;
            }
            c1425.m4946();
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final void m1279(int i) {
        getScrollingChildHelper().m9895(i);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m1280() {
        int iM4792 = this.f1709.m4792();
        for (int i = 0; i < iM4792; i++) {
            ((C1398) this.f1709.m4794(i).getLayoutParams()).f5701 = true;
        }
        ArrayList arrayList = this.f1677.f5849;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1398 c1398 = (C1398) ((AbstractC1375) arrayList.get(i2)).f5618.getLayoutParams();
            if (c1398 != null) {
                c1398.f5701 = true;
            }
        }
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final void m1281(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1697;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1398) {
            C1398 c1398 = (C1398) layoutParams;
            if (!c1398.f5701) {
                int i = rect.left;
                Rect rect2 = c1398.f5700;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1683.mo2840(this, view, this.f1697, !this.f1671, view2 == null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /* renamed from: ʽˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1282(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1282(int, int, android.view.MotionEvent, int):boolean");
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final void m1283() {
        boolean z;
        boolean z2 = false;
        if (this.f1652) {
            C1262 c1262 = this.f1664;
            c1262.m4492((ArrayList) c1262.f5177);
            c1262.m4492((ArrayList) c1262.f5180);
            c1262.f5178 = 0;
            if (this.f1666) {
                this.f1683.mo826();
            }
        }
        if (this.f1682 == null || !this.f1683.mo1213()) {
            this.f1664.m4496();
        } else {
            this.f1664.m4511();
        }
        boolean z3 = this.f1698 || this.f1699;
        boolean z4 = this.f1671 && this.f1682 != null && ((z = this.f1652) || z3 || this.f1683.f5727) && (!z || this.f1684.f5596);
        C1426 c1426 = this.f1705;
        c1426.f5822 = z4;
        if (z4 && z3 && !this.f1652 && this.f1682 != null && this.f1683.mo1213()) {
            z2 = true;
        }
        c1426.f5825 = z2;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final boolean m1284(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m9896(i, i2, i3, iArr, iArr2);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m1285(C1426 c1426) {
        if (getScrollState() != 2) {
            c1426.f5826 = 0;
            c1426.f5829 = 0;
        } else {
            OverScroller overScroller = this.f1654.f5522;
            c1426.f5826 = overScroller.getFinalX() - overScroller.getCurrX();
            c1426.f5829 = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m1286(int[] iArr) {
        int iM4802 = this.f1709.m4802();
        if (iM4802 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM4802; i3++) {
            AbstractC1375 abstractC1375M1270 = m1270(this.f1709.m4796(i3));
            if (!abstractC1375M1270.m4771()) {
                int iM4783 = abstractC1375M1270.m4783();
                if (iM4783 < i) {
                    i = iM4783;
                }
                if (iM4783 > i2) {
                    i2 = iM4783;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void m1287() {
        if (this.f1703 != null) {
            return;
        }
        ((C1386) this.f1692).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1703 = edgeEffect;
        if (this.f1673) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final void m1288() {
        VelocityTracker velocityTracker = this.f1649;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m1279(0);
        EdgeEffect edgeEffect = this.f1690;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f1690.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1703;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f1703.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1701;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f1701.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1680;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f1680.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m1289(AbstractC1413 abstractC1413) {
        if (this.f1710 == null) {
            this.f1710 = new ArrayList();
        }
        this.f1710.add(abstractC1413);
    }

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final void m1290(boolean z) {
        this.f1666 = z | this.f1666;
        this.f1652 = true;
        int iM4792 = this.f1709.m4792();
        for (int i = 0; i < iM4792; i++) {
            AbstractC1375 abstractC1375M1270 = m1270(this.f1709.m4794(i));
            if (abstractC1375M1270 != null && !abstractC1375M1270.m4771()) {
                abstractC1375M1270.m4777(6);
            }
        }
        m1280();
        C1429 c1429 = this.f1677;
        ArrayList arrayList = c1429.f5849;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1375 abstractC1375 = (AbstractC1375) arrayList.get(i2);
            if (abstractC1375 != null) {
                abstractC1375.m4777(6);
                abstractC1375.m4777(1024);
            }
        }
        AbstractC1373 abstractC1373 = c1429.f5848.f1684;
        if (abstractC1373 == null || !abstractC1373.f5596) {
            c1429.m4967();
        }
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final void m1291(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1722) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1722 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f1659 = x;
            this.f1693 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f1665 = y;
            this.f1672 = y;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* renamed from: ˋˉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p061.AbstractC1375 m1292(int r6, boolean r7) {
        /*
            r5 = this;
            ʾـ.ˏᵢ r0 = r5.f1709
            int r0 = r0.m4792()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3e
            ʾـ.ˏᵢ r3 = r5.f1709
            android.view.View r3 = r3.m4794(r2)
            ʾـ.ˊˆ r3 = m1270(r3)
            if (r3 == 0) goto L3b
            boolean r4 = r3.m4772()
            if (r4 != 0) goto L3b
            if (r7 == 0) goto L23
            int r4 = r3.f5612
            if (r4 == r6) goto L2a
            goto L3b
        L23:
            int r4 = r3.m4783()
            if (r4 == r6) goto L2a
            goto L3b
        L2a:
            ʾـ.ˏᵢ r1 = r5.f1709
            java.lang.Cloneable r1 = r1.f5665
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            android.view.View r4 = r3.f5618
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L3a
            r1 = r3
            goto L3b
        L3a:
            return r3
        L3b:
            int r2 = r2 + 1
            goto L8
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1292(int, boolean):ʾـ.ˊˆ");
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m1293(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m9900(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m1294() {
        int iM4792 = this.f1709.m4792();
        for (int i = 0; i < iM4792; i++) {
            AbstractC1375 abstractC1375M1270 = m1270(this.f1709.m4794(i));
            if (!abstractC1375M1270.m4771()) {
                abstractC1375M1270.f5617 = -1;
                abstractC1375M1270.f5624 = -1;
            }
        }
        C1429 c1429 = this.f1677;
        ArrayList arrayList = c1429.f5849;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1375 abstractC1375 = (AbstractC1375) arrayList.get(i2);
            abstractC1375.f5617 = -1;
            abstractC1375.f5624 = -1;
        }
        ArrayList arrayList2 = c1429.f5850;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC1375 abstractC13752 = (AbstractC1375) arrayList2.get(i3);
            abstractC13752.f5617 = -1;
            abstractC13752.f5624 = -1;
        }
        ArrayList arrayList3 = c1429.f5846;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC1375 abstractC13753 = (AbstractC1375) c1429.f5846.get(i4);
                abstractC13753.f5617 = -1;
                abstractC13753.f5624 = -1;
            }
        }
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public void m1295(int i, int i2) {
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final int m1296(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f1690;
        float f2 = 0.0f;
        if (edgeEffect == null || ﹳﹳ.ˉⁱ(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f1701;
            if (edgeEffect2 != null && ﹳﹳ.ˉⁱ(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f1701.onRelease();
                } else {
                    float f3 = ﹳﹳ.ʿˏ(this.f1701, width, height);
                    if (ﹳﹳ.ˉⁱ(this.f1701) == 0.0f) {
                        this.f1701.onRelease();
                    }
                    f2 = f3;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f1690.onRelease();
            } else {
                float f4 = -ﹳﹳ.ʿˏ(this.f1690, -width, 1.0f - height);
                if (ﹳﹳ.ˉⁱ(this.f1690) == 0.0f) {
                    this.f1690.onRelease();
                }
                f2 = f4;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final View m1297(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03d2  */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* renamed from: ˎٴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1298() {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1298():void");
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final boolean m1299() {
        return this.f1656 > 0;
    }

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public final void m1300(int i, boolean z, int i2) {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 == null || this.f1661) {
            return;
        }
        if (!abstractC1402.mo797()) {
            i = 0;
        }
        if (!this.f1683.mo828()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().m9899(i3, 1);
        }
        this.f1654.m4737(i, i2, Integer.MIN_VALUE, null);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m1301(String str) {
        if (m1299()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC0002.m37(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f1691 > 0) {
            new IllegalStateException(AbstractC0002.m37(this, new StringBuilder("")));
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m1302(AbstractC1375 abstractC1375) {
        View view = abstractC1375.f5618;
        boolean z = view.getParent() == this;
        this.f1677.m4961(m1331(view));
        if (abstractC1375.m4770()) {
            this.f1709.m4797(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.f1709.m4789(view, -1, true);
            return;
        }
        C1389 c1389 = this.f1709;
        int iIndexOfChild = ((C1366) c1389.f5666).f5546.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C1403) c1389.f5667).m4864(iIndexOfChild);
            c1389.m4793(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: ˑʾ */
    public void mo955(int i) {
        AbstractC1402 abstractC1402;
        if (!this.f1661 && (abstractC1402 = this.f1683) != null) {
            abstractC1402.mo844(this, i);
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m1303() {
        C1389 c1389 = this.f1709;
        C1262 c1262 = this.f1664;
        if (!this.f1671 || this.f1652) {
            int i = AbstractC5202.f20025;
            Trace.beginSection("RV FullInvalidate");
            m1298();
            Trace.endSection();
            return;
        }
        if (c1262.m4516()) {
            int i2 = c1262.f5178;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (c1262.m4516()) {
                    int i3 = AbstractC5202.f20025;
                    Trace.beginSection("RV FullInvalidate");
                    m1298();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = AbstractC5202.f20025;
            Trace.beginSection("RV PartialInvalidate");
            m1323();
            m1318();
            c1262.m4511();
            if (!this.f1700) {
                int iM4802 = c1389.m4802();
                int i5 = 0;
                while (true) {
                    if (i5 < iM4802) {
                        AbstractC1375 abstractC1375M1270 = m1270(c1389.m4796(i5));
                        if (abstractC1375M1270 != null && !abstractC1375M1270.m4771() && abstractC1375M1270.m4780()) {
                            m1298();
                            break;
                        }
                        i5++;
                    } else {
                        c1262.m4501();
                        break;
                    }
                }
            }
            m1332(true);
            m1330(true);
            Trace.endSection();
        }
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final boolean m1304() {
        return !this.f1671 || this.f1652 || this.f1664.m4516();
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Rect m1305(View view) {
        C1398 c1398 = (C1398) view.getLayoutParams();
        boolean z = c1398.f5701;
        Rect rect = c1398.f5700;
        if (!z) {
            return rect;
        }
        if (this.f1705.f5832 && (c1398.f5702.m4780() || c1398.f5702.m4784())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1708;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f1697;
            rect2.set(0, 0, 0, 0);
            ((AbstractC1360) arrayList.get(i)).mo4728(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c1398.f5701 = false;
        return rect;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m1306() {
        if (this.f1690 != null) {
            return;
        }
        ((C1386) this.f1692).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1690 = edgeEffect;
        if (this.f1673) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public final int m1307(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f1703;
        float f2 = 0.0f;
        if (edgeEffect == null || ﹳﹳ.ˉⁱ(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f1680;
            if (edgeEffect2 != null && ﹳﹳ.ˉⁱ(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f1680.onRelease();
                } else {
                    float f3 = ﹳﹳ.ʿˏ(this.f1680, height, 1.0f - width);
                    if (ﹳﹳ.ˉⁱ(this.f1680) == 0.0f) {
                        this.f1680.onRelease();
                    }
                    f2 = f3;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f1703.onRelease();
            } else {
                float f4 = -ﹳﹳ.ʿˏ(this.f1703, -height, width);
                if (ﹳﹳ.ˉⁱ(this.f1703) == 0.0f) {
                    this.f1703.onRelease();
                }
                f2 = f4;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final int m1308(AbstractC1375 abstractC1375) {
        if (abstractC1375.m4778(524) || !abstractC1375.m4774()) {
            return -1;
        }
        C1262 c1262 = this.f1664;
        int i = abstractC1375.f5612;
        ArrayList arrayList = (ArrayList) c1262.f5177;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1399 c1399 = (C1399) arrayList.get(i2);
            int i3 = c1399.f5706;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c1399.f5704;
                    if (i4 <= i) {
                        int i5 = c1399.f5707;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c1399.f5704;
                    if (i6 == i) {
                        i = c1399.f5707;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c1399.f5707 <= i) {
                            i++;
                        }
                    }
                }
            } else if (c1399.f5704 <= i) {
                i += c1399.f5707;
            }
        }
        return i;
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final boolean m1309(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float f = ﹳﹳ.ˉⁱ(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f2 = this.f1696 * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d = f1647;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f2))) < f;
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final void m1310(int i, int i2, int[] iArr) {
        AbstractC1375 abstractC1375;
        C1389 c1389 = this.f1709;
        m1323();
        m1318();
        int i3 = AbstractC5202.f20025;
        Trace.beginSection("RV Scroll");
        C1426 c1426 = this.f1705;
        m1285(c1426);
        C1429 c1429 = this.f1677;
        int iMo841 = i != 0 ? this.f1683.mo841(i, c1429, c1426) : 0;
        int iMo843 = i2 != 0 ? this.f1683.mo843(i2, c1429, c1426) : 0;
        Trace.endSection();
        int iM4802 = c1389.m4802();
        for (int i4 = 0; i4 < iM4802; i4++) {
            View viewM4796 = c1389.m4796(i4);
            AbstractC1375 abstractC1375M1331 = m1331(viewM4796);
            if (abstractC1375M1331 != null && (abstractC1375 = abstractC1375M1331.f5616) != null) {
                int left = viewM4796.getLeft();
                int top = viewM4796.getTop();
                View view = abstractC1375.f5618;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1330(true);
        m1332(false);
        if (iArr != null) {
            iArr[0] = iMo841;
            iArr[1] = iMo843;
        }
    }

    /* renamed from: ٴﹶ */
    public void mo956(int i) {
        C1425 c1425;
        if (this.f1661) {
            return;
        }
        setScrollState(0);
        RunnableC1362 runnableC1362 = this.f1654;
        runnableC1362.f5526.removeCallbacks(runnableC1362);
        runnableC1362.f5522.abortAnimation();
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 != null && (c1425 = abstractC1402.f5718) != null) {
            c1425.m4946();
        }
        AbstractC1402 abstractC14022 = this.f1683;
        if (abstractC14022 == null) {
            return;
        }
        abstractC14022.mo848(i);
        awakenScrollBars();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1311(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f1650
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            ʾـ.ˆᵔ r5 = (p061.C1368) r5
            int r6 = r5.f5561
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.m4743(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.m4746(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f5582 = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f5568 = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f5582 = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f5562 = r6
        L55:
            r5.m4745(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f1706 = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1311(android.view.MotionEvent):boolean");
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String m1312() {
        return " " + super.toString() + ", adapter:" + this.f1684 + ", layout:" + this.f1683 + ", context:" + getContext();
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final long m1313(AbstractC1375 abstractC1375) {
        return this.f1684.f5596 ? abstractC1375.f5610 : abstractC1375.f5612;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m1314(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f1690;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f1690.onRelease();
            zIsFinished = this.f1690.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1701;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1701.onRelease();
            zIsFinished |= this.f1701.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1703;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1703.onRelease();
            zIsFinished |= this.f1703.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1680;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1680.onRelease();
            zIsFinished |= this.f1680.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final void m1315() {
        if (this.f1686 || !this.f1704) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        postOnAnimation(this.f1662);
        this.f1686 = true;
    }

    /* renamed from: ᵎʾ */
    public void mo958(int i, int i2) {
        m1300(i, false, i2);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m1316() {
        C1421 c1421;
        View viewM1297;
        C1426 c1426 = this.f1705;
        c1426.m4949(1);
        m1285(c1426);
        c1426.f5835 = false;
        m1323();
        C3767 c3767 = this.f1717;
        ((C2755) c3767.f14557).clear();
        C2742 c2742 = (C2742) c3767.f14558;
        c2742.m6970();
        m1318();
        m1283();
        AbstractC1375 abstractC1375M1331 = null;
        View focusedChild = (this.f1719 && hasFocus() && this.f1684 != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM1297 = m1297(focusedChild)) != null) {
            abstractC1375M1331 = m1331(viewM1297);
        }
        if (abstractC1375M1331 == null) {
            c1426.f5824 = -1L;
            c1426.f5823 = -1;
            c1426.f5833 = -1;
        } else {
            c1426.f5824 = this.f1684.f5596 ? abstractC1375M1331.f5610 : -1L;
            c1426.f5823 = this.f1652 ? -1 : abstractC1375M1331.m4772() ? abstractC1375M1331.f5617 : abstractC1375M1331.m4766();
            View focusedChild2 = abstractC1375M1331.f5618;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c1426.f5833 = id;
        }
        c1426.f5827 = c1426.f5822 && this.f1699;
        this.f1699 = false;
        this.f1698 = false;
        c1426.f5832 = c1426.f5825;
        c1426.f5821 = this.f1684.mo974();
        m1286(this.f1668);
        boolean z = c1426.f5822;
        C2755 c2755 = (C2755) c3767.f14557;
        if (z) {
            int iM4802 = this.f1709.m4802();
            for (int i = 0; i < iM4802; i++) {
                AbstractC1375 abstractC1375M1270 = m1270(this.f1709.m4796(i));
                if (!abstractC1375M1270.m4771() && (!abstractC1375M1270.m4784() || this.f1684.f5596)) {
                    AbstractC1371 abstractC1371 = this.f1682;
                    AbstractC1371.m4749(abstractC1375M1270);
                    abstractC1375M1270.m4767();
                    abstractC1371.getClass();
                    C1212 c1212 = new C1212();
                    c1212.m4294(abstractC1375M1270);
                    C1421 c1421M4922 = (C1421) c2755.get(abstractC1375M1270);
                    if (c1421M4922 == null) {
                        c1421M4922 = C1421.m4922();
                        c2755.put(abstractC1375M1270, c1421M4922);
                    }
                    c1421M4922.f5789 = c1212;
                    c1421M4922.f5791 |= 4;
                    if (c1426.f5827 && abstractC1375M1270.m4780() && !abstractC1375M1270.m4772() && !abstractC1375M1270.m4771() && !abstractC1375M1270.m4784()) {
                        c2742.m6964(m1313(abstractC1375M1270), abstractC1375M1270);
                    }
                }
            }
        }
        if (c1426.f5825) {
            int iM4792 = this.f1709.m4792();
            for (int i2 = 0; i2 < iM4792; i2++) {
                AbstractC1375 abstractC1375M12702 = m1270(this.f1709.m4794(i2));
                if (f1643 && abstractC1375M12702.f5612 == -1 && !abstractC1375M12702.m4772()) {
                    throw new IllegalStateException(AbstractC0002.m37(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!abstractC1375M12702.m4771() && abstractC1375M12702.f5617 == -1) {
                    abstractC1375M12702.f5617 = abstractC1375M12702.f5612;
                }
            }
            boolean z2 = c1426.f5831;
            c1426.f5831 = false;
            this.f1683.mo851(this.f1677, c1426);
            c1426.f5831 = z2;
            for (int i3 = 0; i3 < this.f1709.m4802(); i3++) {
                AbstractC1375 abstractC1375M12703 = m1270(this.f1709.m4796(i3));
                if (!abstractC1375M12703.m4771() && ((c1421 = (C1421) c2755.get(abstractC1375M12703)) == null || (c1421.f5791 & 4) == 0)) {
                    AbstractC1371.m4749(abstractC1375M12703);
                    boolean zM4778 = abstractC1375M12703.m4778(8192);
                    AbstractC1371 abstractC13712 = this.f1682;
                    abstractC1375M12703.m4767();
                    abstractC13712.getClass();
                    C1212 c12122 = new C1212();
                    c12122.m4294(abstractC1375M12703);
                    if (zM4778) {
                        m1322(abstractC1375M12703, c12122);
                    } else {
                        C1421 c1421M49222 = (C1421) c2755.get(abstractC1375M12703);
                        if (c1421M49222 == null) {
                            c1421M49222 = C1421.m4922();
                            c2755.put(abstractC1375M12703, c1421M49222);
                        }
                        c1421M49222.f5791 |= 2;
                        c1421M49222.f5789 = c12122;
                    }
                }
            }
            m1294();
        } else {
            m1294();
        }
        m1330(true);
        m1332(false);
        c1426.f5834 = 2;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m1317(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        setMeasuredDimension(AbstractC1402.m4813(i, paddingRight, getMinimumWidth()), AbstractC1402.m4813(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* renamed from: ᵎᵢ */
    public void mo959(int i, int i2) {
        mo958(i, i2);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m1318() {
        this.f1656++;
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final void m1319(int i, boolean z, int i2) {
        int i3 = i + i2;
        int iM4792 = this.f1709.m4792();
        for (int i4 = 0; i4 < iM4792; i4++) {
            AbstractC1375 abstractC1375M1270 = m1270(this.f1709.m4794(i4));
            if (abstractC1375M1270 != null && !abstractC1375M1270.m4771()) {
                int i5 = abstractC1375M1270.f5612;
                C1426 c1426 = this.f1705;
                if (i5 >= i3) {
                    if (f1644) {
                        String str = "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC1375M1270 + " now at position " + (abstractC1375M1270.f5612 - i2);
                    }
                    abstractC1375M1270.m4773(-i2, z);
                    c1426.f5831 = true;
                } else if (i5 >= i) {
                    if (f1644) {
                        String str2 = "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC1375M1270 + " now REMOVED";
                    }
                    abstractC1375M1270.m4777(8);
                    abstractC1375M1270.m4773(-i2, z);
                    abstractC1375M1270.f5612 = i - 1;
                    c1426.f5831 = true;
                }
            }
        }
        C1429 c1429 = this.f1677;
        ArrayList arrayList = c1429.f5849;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1375 abstractC1375 = (AbstractC1375) arrayList.get(size);
            if (abstractC1375 != null) {
                int i6 = abstractC1375.f5612;
                if (i6 >= i3) {
                    if (f1644) {
                        String str3 = "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC1375 + " now at position " + (abstractC1375.f5612 - i2);
                    }
                    abstractC1375.m4773(-i2, z);
                } else if (i6 >= i) {
                    abstractC1375.m4777(8);
                    c1429.m4963(size);
                }
            }
        }
        requestLayout();
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m1320(int i) {
        if (this.f1683 == null) {
            return;
        }
        setScrollState(2);
        this.f1683.mo848(i);
        awakenScrollBars();
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean m1321() {
        return isChildrenDrawingOrderEnabled();
    }

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final void m1322(AbstractC1375 abstractC1375, C1212 c1212) {
        abstractC1375.f5619 &= -8193;
        boolean z = this.f1705.f5827;
        C3767 c3767 = this.f1717;
        if (z && abstractC1375.m4780() && !abstractC1375.m4772() && !abstractC1375.m4771()) {
            ((C2742) c3767.f14558).m6964(m1313(abstractC1375), abstractC1375);
        }
        C2755 c2755 = (C2755) c3767.f14557;
        C1421 c1421M4922 = (C1421) c2755.get(abstractC1375);
        if (c1421M4922 == null) {
            c1421M4922 = C1421.m4922();
            c2755.put(abstractC1375, c1421M4922);
        }
        c1421M4922.f5789 = c1212;
        c1421M4922.f5791 |= 4;
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public final void m1323() {
        int i = this.f1675 + 1;
        this.f1675 = i;
        if (i != 1 || this.f1661) {
            return;
        }
        this.f1700 = false;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m1324() {
        m1323();
        m1318();
        C1426 c1426 = this.f1705;
        c1426.m4949(6);
        this.f1664.m4496();
        c1426.f5821 = this.f1684.mo974();
        c1426.f5828 = 0;
        if (this.f1694 != null) {
            AbstractC1373 abstractC1373 = this.f1684;
            int iM5411 = AbstractC1702.m5411(abstractC1373.f5597);
            if (iM5411 == 1 ? abstractC1373.mo974() > 0 : iM5411 != 2) {
                Parcelable parcelable = this.f1694.f5628;
                if (parcelable != null) {
                    this.f1683.mo812(parcelable);
                }
                this.f1694 = null;
            }
        }
        c1426.f5832 = false;
        this.f1683.mo851(this.f1677, c1426);
        c1426.f5831 = false;
        c1426.f5822 = c1426.f5822 && this.f1682 != null;
        c1426.f5834 = 4;
        m1330(true);
        m1332(false);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m1325() {
        if (this.f1701 != null) {
            return;
        }
        ((C1386) this.f1692).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1701 = edgeEffect;
        if (this.f1673) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final AbstractC1375 m1326(int i) {
        AbstractC1375 abstractC1375 = null;
        if (this.f1652) {
            return null;
        }
        int iM4792 = this.f1709.m4792();
        for (int i2 = 0; i2 < iM4792; i2++) {
            AbstractC1375 abstractC1375M1270 = m1270(this.f1709.m4794(i2));
            if (abstractC1375M1270 != null && !abstractC1375M1270.m4772() && m1308(abstractC1375M1270) == i) {
                if (!((ArrayList) this.f1709.f5665).contains(abstractC1375M1270.f5618)) {
                    return abstractC1375M1270;
                }
                abstractC1375 = abstractC1375M1270;
            }
        }
        return abstractC1375;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m1327(AbstractC1360 abstractC1360) {
        AbstractC1402 abstractC1402 = this.f1683;
        if (abstractC1402 != null) {
            abstractC1402.mo1250("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1708;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC1360);
        m1280();
        requestLayout();
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void m1328() {
        if (this.f1680 != null) {
            return;
        }
        ((C1386) this.f1692).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1680 = edgeEffect;
        if (this.f1673) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m1329(int i, int i2) {
        this.f1691++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        m1295(i, i2);
        AbstractC1413 abstractC1413 = this.f1714;
        if (abstractC1413 != null) {
            abstractC1413.mo2863(this, i, i2);
        }
        ArrayList arrayList = this.f1710;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC1413) this.f1710.get(size)).mo2863(this, i, i2);
            }
        }
        this.f1691--;
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final void m1330(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1656 - 1;
        this.f1656 = i2;
        if (i2 < 1) {
            if (f1643 && i2 < 0) {
                throw new IllegalStateException(AbstractC0002.m37(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f1656 = 0;
            if (z) {
                int i3 = this.f1715;
                this.f1715 = 0;
                if (i3 != 0 && (accessibilityManager = this.f1687) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f1688;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC1375 abstractC1375 = (AbstractC1375) arrayList.get(size);
                    if (abstractC1375.f5618.getParent() == this && !abstractC1375.m4771() && (i = abstractC1375.f5621) != -1) {
                        WeakHashMap weakHashMap = AbstractC4345.f16838;
                        abstractC1375.f5618.setImportantForAccessibility(i);
                        abstractC1375.f5621 = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public AbstractC1375 m1331(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1270(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public final void m1332(boolean z) {
        if (this.f1675 < 1) {
            if (f1643) {
                throw new IllegalStateException(AbstractC0002.m37(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f1675 = 1;
        }
        if (!z && !this.f1661) {
            this.f1700 = false;
        }
        if (this.f1675 == 1) {
            if (z && this.f1700 && !this.f1661 && this.f1683 != null && this.f1684 != null) {
                m1298();
            }
            if (!this.f1661) {
                this.f1700 = false;
            }
        }
        this.f1675--;
    }
}
