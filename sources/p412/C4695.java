package p412;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p334.C3789;

/* renamed from: ﹳˑ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4695 {

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final SparseIntArray f17875;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public float f17876;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public float f17877;

    /* renamed from: ˉי, reason: contains not printable characters */
    public float f17878;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f17879;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public float f17880;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public float f17881;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f17882;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public float f17883;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public float f17884;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public float f17885;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public float f17886;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public float f17887;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public float f17888;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17875 = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10609(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4702.f17917);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f17875.get(index)) {
                case 1:
                    this.f17884 = typedArrayObtainStyledAttributes.getFloat(index, this.f17884);
                    break;
                case 2:
                    this.f17876 = typedArrayObtainStyledAttributes.getFloat(index, this.f17876);
                    break;
                case 3:
                    this.f17883 = typedArrayObtainStyledAttributes.getFloat(index, this.f17883);
                    break;
                case 4:
                    this.f17887 = typedArrayObtainStyledAttributes.getFloat(index, this.f17887);
                    break;
                case 5:
                    this.f17877 = typedArrayObtainStyledAttributes.getFloat(index, this.f17877);
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f17885 = typedArrayObtainStyledAttributes.getDimension(index, this.f17885);
                    break;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f17886 = typedArrayObtainStyledAttributes.getDimension(index, this.f17886);
                    break;
                case 8:
                    this.f17888 = typedArrayObtainStyledAttributes.getDimension(index, this.f17888);
                    break;
                case 9:
                    this.f17878 = typedArrayObtainStyledAttributes.getDimension(index, this.f17878);
                    break;
                case 10:
                    this.f17881 = typedArrayObtainStyledAttributes.getDimension(index, this.f17881);
                    break;
                case 11:
                    this.f17879 = true;
                    this.f17880 = typedArrayObtainStyledAttributes.getDimension(index, this.f17880);
                    break;
                case 12:
                    this.f17882 = C4696.m10612(typedArrayObtainStyledAttributes, index, this.f17882);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
