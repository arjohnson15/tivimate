package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p378.AbstractC4345;

/* loaded from: classes.dex */
public class VerticalGridView extends AbstractC0164 {
    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1119.m853(1);
        m957(context, attributeSet);
        int[] iArr = AbstractC0171.f1133;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC4345.m9881(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        setColumnWidth(typedArrayObtainStyledAttributes);
        setNumColumns(typedArrayObtainStyledAttributes.getInt(1, 1));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setColumnWidth(int i) {
        this.f1119.m852(i);
        requestLayout();
    }

    public void setColumnWidth(TypedArray typedArray) {
        if (typedArray.peekValue(0) != null) {
            setColumnWidth(typedArray.getLayoutDimension(0, 0));
        }
    }

    public void setNumColumns(int i) {
        GridLayoutManager gridLayoutManager = this.f1119;
        if (i < 0) {
            gridLayoutManager.getClass();
            throw new IllegalArgumentException();
        }
        gridLayoutManager.f795 = i;
        requestLayout();
    }
}
