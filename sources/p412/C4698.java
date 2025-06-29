package p412;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: ﹳˑ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4698 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f17897;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public float f17898;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f17899;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public float f17900;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10618(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4702.f17915);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f17898 = typedArrayObtainStyledAttributes.getFloat(index, this.f17898);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f17899);
                this.f17899 = i2;
                this.f17899 = C4696.f17891[i2];
            } else if (index == 4) {
                this.f17897 = typedArrayObtainStyledAttributes.getInt(index, this.f17897);
            } else if (index == 3) {
                this.f17900 = typedArrayObtainStyledAttributes.getFloat(index, this.f17900);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
