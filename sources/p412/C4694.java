package p412;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p172.AbstractC2468;
import p334.C3789;

/* renamed from: ﹳˑ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4694 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final SparseIntArray f17865;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f17866;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public float f17867;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public String f17868;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f17869;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f17870;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public float f17871;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f17872;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public float f17873;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f17874;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17865 = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10608(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4702.f17914);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f17865.get(index)) {
                case 1:
                    this.f17867 = typedArrayObtainStyledAttributes.getFloat(index, this.f17867);
                    break;
                case 2:
                    this.f17869 = typedArrayObtainStyledAttributes.getInt(index, this.f17869);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC2468.f9811[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f17870 = C4696.m10612(typedArrayObtainStyledAttributes, index, this.f17870);
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f17866 = typedArrayObtainStyledAttributes.getInteger(index, this.f17866);
                    break;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f17873 = typedArrayObtainStyledAttributes.getFloat(index, this.f17873);
                    break;
                case 8:
                    this.f17872 = typedArrayObtainStyledAttributes.getInteger(index, this.f17872);
                    break;
                case 9:
                    this.f17871 = typedArrayObtainStyledAttributes.getFloat(index, this.f17871);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.f17874 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f17868 = string;
                        if (string.indexOf("/") > 0) {
                            this.f17874 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f17874);
                        break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
