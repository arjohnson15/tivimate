package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.lsposed.hiddenapibypass.library.R;
import p227.C3049;
import p227.C3052;
import p227.C3053;
import p348.AbstractC3996;
import p378.AbstractC4345;
import יⁱ.ˋⁱ;
import ᵎﹳ.ᐧʻ;

/* loaded from: classes.dex */
public class Picker extends FrameLayout {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f996;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f997;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final float f998;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final DecelerateInterpolator f999;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public ArrayList f1000;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final C3052 f1001;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public int f1002;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final ArrayList f1003;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public ArrayList f1004;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final float f1005;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ViewGroup f1006;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public float f1007;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final float f1008;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public int f1009;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f1010;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public float f1011;

    public Picker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr._2_res_0x7f040471);
    }

    public Picker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f997 = new ArrayList();
        this.f1007 = 3.0f;
        this.f1011 = 1.0f;
        this.f996 = 0;
        this.f1003 = new ArrayList();
        this.f1001 = new C3052(this);
        int[] iArr = AbstractC3996.f15433;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC4345.m9881(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        this.f1002 = typedArrayObtainStyledAttributes.getResourceId(0, R.layout._2_res_0x7f0e00b6);
        this.f1009 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        setEnabled(true);
        setDescendantFocusability(262144);
        this.f998 = 1.0f;
        this.f1005 = 1.0f;
        this.f1008 = 0.5f;
        this.f1010 = 200;
        this.f999 = new DecelerateInterpolator(2.5f);
        this.f1006 = (ViewGroup) ((ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout._2_res_0x7f0e00b4, (ViewGroup) this, true)).findViewById(R.id._2_res_0x7f0b02ef);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    public float getActivatedVisibleItemCount() {
        return this.f1007;
    }

    public int getColumnsCount() {
        ArrayList arrayList = this.f1000;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070462);
    }

    public final int getPickerItemLayoutId() {
        return this.f1002;
    }

    public final int getPickerItemTextViewId() {
        return this.f1009;
    }

    public int getSelectedColumn() {
        return this.f996;
    }

    @Deprecated
    public final CharSequence getSeparator() {
        return (CharSequence) this.f1003.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.f1003;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn < 0) {
            return false;
        }
        ArrayList arrayList = this.f997;
        if (selectedColumn < arrayList.size()) {
            return ((VerticalGridView) arrayList.get(selectedColumn)).requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f997;
            if (i >= arrayList.size()) {
                return;
            }
            if (((VerticalGridView) arrayList.get(i)).hasFocus()) {
                setSelectedColumn(i);
            }
            i++;
        }
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        ArrayList arrayList;
        if (z == isActivated()) {
            super.setActivated(z);
            return;
        }
        super.setActivated(z);
        boolean zHasFocus = hasFocus();
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(131072);
        if (!z && zHasFocus && isFocusable()) {
            requestFocus();
        }
        int i = 0;
        while (true) {
            int columnsCount = getColumnsCount();
            arrayList = this.f997;
            if (i >= columnsCount) {
                break;
            }
            ((VerticalGridView) arrayList.get(i)).setFocusable(z);
            i++;
        }
        m894();
        boolean zIsActivated = isActivated();
        for (int i2 = 0; i2 < getColumnsCount(); i2++) {
            VerticalGridView verticalGridView = (VerticalGridView) arrayList.get(i2);
            for (int i3 = 0; i3 < verticalGridView.getChildCount(); i3++) {
                verticalGridView.getChildAt(i3).setFocusable(zIsActivated);
            }
        }
        if (z && zHasFocus && selectedColumn >= 0) {
            ((VerticalGridView) arrayList.get(selectedColumn)).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public void setActivatedVisibleItemCount(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f1007 != f) {
            this.f1007 = f;
            if (isActivated()) {
                m894();
            }
        }
    }

    public void setColumns(List<C3053> list) {
        ArrayList arrayList = this.f1003;
        if (arrayList.size() == 0) {
            throw new IllegalStateException("Separators size is: " + arrayList.size() + ". At least one separator must be provided");
        }
        if (arrayList.size() == 1) {
            CharSequence charSequence = (CharSequence) arrayList.get(0);
            arrayList.clear();
            arrayList.add("");
            for (int i = 0; i < list.size() - 1; i++) {
                arrayList.add(charSequence);
            }
            arrayList.add("");
        } else if (arrayList.size() != list.size() + 1) {
            throw new IllegalStateException("Separators size: " + arrayList.size() + " mustequal the size of columns: " + list.size() + " + 1");
        }
        ArrayList arrayList2 = this.f997;
        arrayList2.clear();
        ViewGroup viewGroup = this.f1006;
        viewGroup.removeAllViews();
        ArrayList arrayList3 = new ArrayList(list);
        this.f1000 = arrayList3;
        if (this.f996 > arrayList3.size() - 1) {
            this.f996 = this.f1000.size() - 1;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int columnsCount = getColumnsCount();
        if (!TextUtils.isEmpty((CharSequence) arrayList.get(0))) {
            TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout._2_res_0x7f0e00b7, viewGroup, false);
            textView.setText((CharSequence) arrayList.get(0));
            viewGroup.addView(textView);
        }
        int i2 = 0;
        while (i2 < columnsCount) {
            VerticalGridView verticalGridView = (VerticalGridView) layoutInflaterFrom.inflate(R.layout._2_res_0x7f0e00b5, viewGroup, false);
            m888(verticalGridView);
            verticalGridView.setWindowAlignment(0);
            verticalGridView.setHasFixedSize(false);
            verticalGridView.setFocusable(isActivated());
            verticalGridView.setItemViewCacheSize(0);
            arrayList2.add(verticalGridView);
            viewGroup.addView(verticalGridView);
            int i3 = i2 + 1;
            if (!TextUtils.isEmpty((CharSequence) arrayList.get(i3))) {
                TextView textView2 = (TextView) layoutInflaterFrom.inflate(R.layout._2_res_0x7f0e00b7, viewGroup, false);
                textView2.setText((CharSequence) arrayList.get(i3));
                viewGroup.addView(textView2);
            }
            verticalGridView.setAdapter(new C3049(this, getPickerItemLayoutId(), getPickerItemTextViewId(), i2));
            verticalGridView.setOnChildViewHolderSelectedListener(this.f1001);
            i2 = i3;
        }
    }

    public final void setPickerItemLayoutId(int i) {
        this.f1002 = i;
    }

    public final void setPickerItemTextViewId(int i) {
        this.f1009 = i;
    }

    public void setSelectedColumn(int i) {
        int i2 = this.f996;
        ArrayList arrayList = this.f997;
        if (i2 != i) {
            this.f996 = i;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                m889(i3);
            }
        }
        VerticalGridView verticalGridView = (VerticalGridView) arrayList.get(i);
        if (!hasFocus() || verticalGridView.hasFocus()) {
            return;
        }
        verticalGridView.requestFocus();
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(charSequence));
    }

    public final void setSeparators(List<CharSequence> list) {
        ArrayList arrayList = this.f1003;
        arrayList.clear();
        arrayList.addAll(list);
    }

    public void setVisibleItemCount(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f1011 != f) {
            this.f1011 = f;
            if (isActivated()) {
                return;
            }
            m894();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m886(int i) {
        ArrayList arrayList = this.f1004;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ˋⁱ) this.f1004.get(size)).ـﹶ.ٴᐧ(i);
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m887(int i, int i2) {
        C3053 c3053 = (C3053) this.f1000.get(i);
        if (c3053.f11759 != i2) {
            c3053.f11759 = i2;
            m886(i);
            VerticalGridView verticalGridView = (VerticalGridView) this.f997.get(i);
            if (verticalGridView != null) {
                verticalGridView.setSelectedPosition(i2 - ((C3053) this.f1000.get(i)).f11756);
            }
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m888(VerticalGridView verticalGridView) {
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        float activatedVisibleItemCount = isActivated() ? getActivatedVisibleItemCount() : getVisibleItemCount();
        layoutParams.height = (int) ᐧʻ.ﹶˆ(activatedVisibleItemCount, 1.0f, verticalGridView.getVerticalSpacing(), getPickerItemHeightPixels() * activatedVisibleItemCount);
        verticalGridView.setLayoutParams(layoutParams);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m889(int i) {
        VerticalGridView verticalGridView = (VerticalGridView) this.f997.get(i);
        int selectedPosition = verticalGridView.getSelectedPosition();
        int i2 = 0;
        while (i2 < verticalGridView.getAdapter().mo974()) {
            View viewMo1262 = verticalGridView.getLayoutManager().mo1262(i2);
            if (viewMo1262 != null) {
                m891(i, viewMo1262, selectedPosition == i2, true);
            }
            i2++;
        }
    }

    /* renamed from: ˑʽ */
    public void mo885(int i, int i2) {
        C3053 c3053 = (C3053) this.f1000.get(i);
        if (c3053.f11759 != i2) {
            c3053.f11759 = i2;
            m886(i);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3053 m890(int i) {
        ArrayList arrayList = this.f1000;
        if (arrayList == null) {
            return null;
        }
        return (C3053) arrayList.get(i);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m891(int i, View view, boolean z, boolean z2) {
        boolean z3 = i == this.f996 || !hasFocus();
        DecelerateInterpolator decelerateInterpolator = this.f999;
        if (z) {
            if (z3) {
                m892(view, z2, this.f998, decelerateInterpolator);
                return;
            } else {
                m892(view, z2, this.f1005, decelerateInterpolator);
                return;
            }
        }
        if (z3) {
            m892(view, z2, this.f1008, decelerateInterpolator);
        } else {
            m892(view, z2, 0.0f, decelerateInterpolator);
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m892(View view, boolean z, float f, DecelerateInterpolator decelerateInterpolator) {
        view.animate().cancel();
        if (z) {
            view.animate().alpha(f).setDuration(this.f1010).setInterpolator(decelerateInterpolator).start();
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m893(int i, C3053 c3053) {
        this.f1000.set(i, c3053);
        VerticalGridView verticalGridView = (VerticalGridView) this.f997.get(i);
        C3049 c3049 = (C3049) verticalGridView.getAdapter();
        if (c3049 != null) {
            c3049.m4765();
        }
        verticalGridView.setSelectedPosition(c3053.f11759 - c3053.f11756);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m894() {
        for (int i = 0; i < getColumnsCount(); i++) {
            m888((VerticalGridView) this.f997.get(i));
        }
    }
}
