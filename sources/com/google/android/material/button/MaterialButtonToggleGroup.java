package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.datepicker.C0686;
import com.google.android.material.timepicker.C0719;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import org.lsposed.hiddenapibypass.library.R;
import org.xmlpull.v1.XmlPullParserException;
import p211.AbstractC2807;
import p220.AbstractC2845;
import p237.C3093;
import p239.AbstractC3098;
import p361.C4089;
import p361.C4096;
import p361.C4097;
import p361.C4103;
import p361.InterfaceC4104;
import p378.AbstractC4345;
import ʽᵔ.ˊﹶ;
import ˊﹶ.ˋˉ;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final /* synthetic */ int f3214 = 0;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f3215;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f3216;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ˊﹶ f3217;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f3218;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ˋˉ f3219;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public HashSet f3220;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final int f3221;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f3222;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final LinkedHashSet f3223;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ArrayList f3224;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C4096 f3225;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Integer[] f3226;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f3227;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public C4103 f3228;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        C4096 c4096;
        int next;
        super(AbstractC2807.m7088(context, attributeSet, R.attr._2_res_0x7f0403bb, R.style._2_res_0x7f140533), attributeSet, R.attr._2_res_0x7f0403bb);
        this.f3224 = new ArrayList();
        this.f3216 = new ArrayList();
        this.f3219 = new ˋˉ(3, this);
        this.f3223 = new LinkedHashSet();
        this.f3217 = new ˊﹶ(24, this);
        this.f3227 = false;
        this.f3220 = new HashSet();
        Context context2 = getContext();
        TypedArray typedArrayM7129 = AbstractC2845.m7129(context2, attributeSet, AbstractC3098.f11963, R.attr._2_res_0x7f0403bb, R.style._2_res_0x7f140533, new int[0]);
        setSingleSelection(typedArrayM7129.getBoolean(7, false));
        this.f3221 = typedArrayM7129.getResourceId(2, -1);
        this.f3222 = typedArrayM7129.getBoolean(4, false);
        if (typedArrayM7129.hasValue(5)) {
            C4103 c4103M9399 = C4103.m9399(context2, typedArrayM7129, 5);
            this.f3228 = c4103M9399;
            if (c4103M9399 == null) {
                this.f3228 = new C3093(C4089.m9379(context2, typedArrayM7129.getResourceId(5, 0), typedArrayM7129.getResourceId(6, 0), new C4097(0)).m9375()).m7598();
            }
        }
        C4097 c4097 = new C4097(0.0f);
        int resourceId = typedArrayM7129.getResourceId(3, 0);
        if (resourceId == 0) {
            InterfaceC4104 interfaceC4104M9378 = C4089.m9378(typedArrayM7129, 3, c4097);
            c4096 = new C4096();
            c4096.m9398(StateSet.WILD_CARD, interfaceC4104M9378);
        } else if (context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
            try {
                XmlResourceParser xml = context2.getResources().getXml(resourceId);
                try {
                    C4096 c40962 = new C4096();
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (xml.getName().equals("selector")) {
                        c40962.m9397(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                    }
                    xml.close();
                    c4096 = c40962;
                } catch (Throwable th) {
                    if (xml != null) {
                        try {
                            xml.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                c4096 = new C4096();
                c4096.m9398(StateSet.WILD_CARD, c4097);
            }
        } else {
            InterfaceC4104 interfaceC4104M93782 = C4089.m9378(typedArrayM7129, 3, c4097);
            c4096 = new C4096();
            c4096.m9398(StateSet.WILD_CARD, interfaceC4104M93782);
        }
        this.f3225 = c4096;
        this.f3215 = typedArrayM7129.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM7129.getBoolean(0, true));
        typedArrayM7129.recycle();
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m2836(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m2836(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m2836(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f3219);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            m2834(materialButton.getId(), materialButton.f3211);
            this.f3224.add(materialButton.getShapeAppearanceModel());
            this.f3216.add(materialButton.getStateListShapeAppearanceModel());
            materialButton.setEnabled(isEnabled());
            AbstractC4345.m9884(materialButton, new C0686(2, this));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap((Comparator) this.f3217);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f3226 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public int getCheckedButtonId() {
        if (!this.f3218 || this.f3220.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f3220.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f3220.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f3226;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public InterfaceC4104 getInnerCornerSize() {
        return this.f3225.f15802;
    }

    public C4096 getInnerCornerSizeStateList() {
        return this.f3225;
    }

    public C4089 getShapeAppearance() {
        C4103 c4103 = this.f3228;
        if (c4103 == null) {
            return null;
        }
        return c4103.m9401();
    }

    public int getSpacing() {
        return this.f3215;
    }

    public C4103 getStateListShapeAppearance() {
        return this.f3228;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f3221;
        if (i != -1) {
            m2838(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f3218 ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m2835();
        m2837();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f3224.remove(iIndexOfChild);
            this.f3216.remove(iIndexOfChild);
        }
        m2835();
        m2837();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(InterfaceC4104 interfaceC4104) {
        C4096 c4096 = new C4096();
        c4096.m9398(StateSet.WILD_CARD, interfaceC4104);
        this.f3225 = c4096;
        m2835();
        invalidate();
    }

    public void setInnerCornerSizeStateList(C4096 c4096) {
        this.f3225 = c4096;
        m2835();
        invalidate();
    }

    public void setSelectionRequired(boolean z) {
        this.f3222 = z;
    }

    public void setShapeAppearance(C4089 c4089) {
        this.f3228 = new C3093(c4089).m7598();
        m2835();
        invalidate();
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f3218 != z) {
            this.f3218 = z;
            m2838(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f3218 ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSpacing(int i) {
        this.f3215 = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(C4103 c4103) {
        this.f3228 = c4103;
        m2835();
        invalidate();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m2834(int i, boolean z) {
        if (i == -1) {
            String str = "Button ID is not valid: " + i;
            return;
        }
        HashSet hashSet = new HashSet(this.f3220);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f3218 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f3222 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m2838(hashSet);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Serializable, ᵔᵔ.ˋⁱ[]] */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m2835() {
        C3093 c3093;
        int i;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int i2 = 0;
        while (i2 < childCount) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            if (materialButton.getVisibility() != 8) {
                boolean z = i2 == firstVisibleChildIndex;
                boolean z2 = i2 == lastVisibleChildIndex;
                C4103 c4103 = this.f3228;
                if (c4103 == null || (!z && !z2)) {
                    c4103 = (C4103) this.f3216.get(i2);
                }
                if (c4103 == null) {
                    c3093 = new C3093((C4089) this.f3224.get(i2));
                } else {
                    C3093 c30932 = new C3093(2);
                    int i3 = c4103.f15839;
                    c30932.f11934 = i3;
                    c30932.f11937 = c4103.f15835;
                    int[][] iArr = c4103.f15838;
                    int[][] iArr2 = new int[iArr.length][];
                    c30932.f11941 = iArr2;
                    C4089[] c4089Arr = c4103.f15842;
                    c30932.f11935 = new C4089[c4089Arr.length];
                    System.arraycopy(iArr, 0, iArr2, 0, i3);
                    System.arraycopy(c4089Arr, 0, (C4089[]) c30932.f11935, 0, c30932.f11934);
                    c30932.f11939 = c4103.f15836;
                    c30932.f11940 = c4103.f15840;
                    c30932.f11936 = c4103.f15841;
                    c30932.f11942 = c4103.f15837;
                    c3093 = c30932;
                }
                boolean z3 = getOrientation() == 0;
                boolean z4 = getLayoutDirection() == 1;
                if (z3) {
                    i = z ? 5 : 0;
                    if (z2) {
                        i |= 10;
                    }
                    if (z4) {
                        i = ((i & 10) >> 1) | ((i & 5) << 1);
                    }
                } else {
                    i = z ? 3 : 0;
                    if (z2) {
                        i |= 12;
                    }
                }
                int i4 = ~i;
                C4096 c4096 = this.f3225;
                if ((i4 | 1) == i4) {
                    c3093.f11939 = c4096;
                }
                if ((i4 | 2) == i4) {
                    c3093.f11940 = c4096;
                }
                if ((i4 | 4) == i4) {
                    c3093.f11936 = c4096;
                }
                if ((i4 | 8) == i4) {
                    c3093.f11942 = c4096;
                }
                C4103 c4103M7598 = c3093.m7598();
                if (c4103M7598.m9402()) {
                    materialButton.setStateListShapeAppearanceModel(c4103M7598);
                } else {
                    materialButton.setShapeAppearanceModel(c4103M7598.m9401());
                }
            }
            i2++;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m2836(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m2837() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = this.f3215 <= 0 ? Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth()) : 0;
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.f3215 - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.f3215 - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m2838(Set set) {
        HashSet hashSet = this.f3220;
        this.f3220 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f3227 = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f3227 = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f3223.iterator();
                while (it.hasNext()) {
                    ((C0719) it.next()).m2918();
                }
            }
        }
        invalidate();
    }
}
