package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p080.C1700;
import p331.C3761;
import p334.C3789;
import p412.AbstractC4692;
import p412.AbstractC4701;
import p412.AbstractC4702;
import p412.AbstractC4706;
import p412.C4693;
import p412.C4696;
import p412.C4707;
import p412.C4708;
import p447.C5171;
import p447.C5177;
import p447.C5180;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static C4707 f259;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f260;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f261;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f262;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f263;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C5177 f264;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final SparseArray f265;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public HashMap f266;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f267;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f268;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final SparseArray f269;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C4696 f270;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f271;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final C4693 f272;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f273;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public C3761 f274;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.f269 = new SparseArray();
        this.f261 = new ArrayList(4);
        this.f264 = new C5177();
        this.f268 = 0;
        this.f262 = 0;
        this.f271 = Integer.MAX_VALUE;
        this.f273 = Integer.MAX_VALUE;
        this.f263 = true;
        this.f267 = 257;
        this.f270 = null;
        this.f274 = null;
        this.f260 = -1;
        this.f266 = new HashMap();
        this.f265 = new SparseArray();
        this.f272 = new C4693(this, this);
        m173(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.f269 = new SparseArray();
        this.f261 = new ArrayList(4);
        this.f264 = new C5177();
        this.f268 = 0;
        this.f262 = 0;
        this.f271 = Integer.MAX_VALUE;
        this.f273 = Integer.MAX_VALUE;
        this.f263 = true;
        this.f267 = 257;
        this.f270 = null;
        this.f274 = null;
        this.f260 = -1;
        this.f266 = new HashMap();
        this.f265 = new SparseArray();
        this.f272 = new C4693(this, this);
        m173(attributeSet, i);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C4707 getSharedValues() {
        if (f259 == null) {
            C4707 c4707 = new C4707();
            new SparseIntArray();
            new HashMap();
            f259 = c4707;
        }
        return f259;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static C4708 m168() {
        C4708 c4708 = new C4708(-2, -2);
        c4708.f17979 = -1;
        c4708.f17945 = -1;
        c4708.f17970 = -1.0f;
        c4708.f18002 = true;
        c4708.f17947 = -1;
        c4708.f17980 = -1;
        c4708.f17983 = -1;
        c4708.f17969 = -1;
        c4708.f18004 = -1;
        c4708.f17954 = -1;
        c4708.f17967 = -1;
        c4708.f17956 = -1;
        c4708.f17960 = -1;
        c4708.f17987 = -1;
        c4708.f17968 = -1;
        c4708.f17972 = -1;
        c4708.f17991 = 0;
        c4708.f17964 = 0.0f;
        c4708.f17990 = -1;
        c4708.f18000 = -1;
        c4708.f17949 = -1;
        c4708.f17959 = -1;
        c4708.f18006 = Integer.MIN_VALUE;
        c4708.f18005 = Integer.MIN_VALUE;
        c4708.f17975 = Integer.MIN_VALUE;
        c4708.f18001 = Integer.MIN_VALUE;
        c4708.f17952 = Integer.MIN_VALUE;
        c4708.f17985 = Integer.MIN_VALUE;
        c4708.f17950 = Integer.MIN_VALUE;
        c4708.f17963 = 0;
        c4708.f17984 = 0.5f;
        c4708.f17951 = 0.5f;
        c4708.f17996 = null;
        c4708.f18003 = -1.0f;
        c4708.f17958 = -1.0f;
        c4708.f17977 = 0;
        c4708.f17986 = 0;
        c4708.f18008 = 0;
        c4708.f17946 = 0;
        c4708.f17974 = 0;
        c4708.f17973 = 0;
        c4708.f17997 = 0;
        c4708.f17965 = 0;
        c4708.f17995 = 1.0f;
        c4708.f17942 = 1.0f;
        c4708.f17994 = -1;
        c4708.f17993 = -1;
        c4708.f18007 = -1;
        c4708.f17957 = false;
        c4708.f17961 = false;
        c4708.f17988 = null;
        c4708.f17948 = 0;
        c4708.f17955 = true;
        c4708.f17998 = true;
        c4708.f17962 = false;
        c4708.f17976 = false;
        c4708.f17943 = false;
        c4708.f17953 = -1;
        c4708.f17944 = -1;
        c4708.f17981 = -1;
        c4708.f17982 = -1;
        c4708.f17978 = Integer.MIN_VALUE;
        c4708.f17992 = Integer.MIN_VALUE;
        c4708.f17989 = 0.5f;
        c4708.f18009 = new C5171();
        return c4708;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4708;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f261;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC4692) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f263 = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m168();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C4708 c4708 = new C4708(context, attributeSet);
        c4708.f17979 = -1;
        c4708.f17945 = -1;
        c4708.f17970 = -1.0f;
        c4708.f18002 = true;
        c4708.f17947 = -1;
        c4708.f17980 = -1;
        c4708.f17983 = -1;
        c4708.f17969 = -1;
        c4708.f18004 = -1;
        c4708.f17954 = -1;
        c4708.f17967 = -1;
        c4708.f17956 = -1;
        c4708.f17960 = -1;
        c4708.f17987 = -1;
        c4708.f17968 = -1;
        c4708.f17972 = -1;
        c4708.f17991 = 0;
        c4708.f17964 = 0.0f;
        c4708.f17990 = -1;
        c4708.f18000 = -1;
        c4708.f17949 = -1;
        c4708.f17959 = -1;
        c4708.f18006 = Integer.MIN_VALUE;
        c4708.f18005 = Integer.MIN_VALUE;
        c4708.f17975 = Integer.MIN_VALUE;
        c4708.f18001 = Integer.MIN_VALUE;
        c4708.f17952 = Integer.MIN_VALUE;
        c4708.f17985 = Integer.MIN_VALUE;
        c4708.f17950 = Integer.MIN_VALUE;
        c4708.f17963 = 0;
        c4708.f17984 = 0.5f;
        c4708.f17951 = 0.5f;
        c4708.f17996 = null;
        c4708.f18003 = -1.0f;
        c4708.f17958 = -1.0f;
        c4708.f17977 = 0;
        c4708.f17986 = 0;
        c4708.f18008 = 0;
        c4708.f17946 = 0;
        c4708.f17974 = 0;
        c4708.f17973 = 0;
        c4708.f17997 = 0;
        c4708.f17965 = 0;
        c4708.f17995 = 1.0f;
        c4708.f17942 = 1.0f;
        c4708.f17994 = -1;
        c4708.f17993 = -1;
        c4708.f18007 = -1;
        c4708.f17957 = false;
        c4708.f17961 = false;
        c4708.f17988 = null;
        c4708.f17948 = 0;
        c4708.f17955 = true;
        c4708.f17998 = true;
        c4708.f17962 = false;
        c4708.f17976 = false;
        c4708.f17943 = false;
        c4708.f17953 = -1;
        c4708.f17944 = -1;
        c4708.f17981 = -1;
        c4708.f17982 = -1;
        c4708.f17978 = Integer.MIN_VALUE;
        c4708.f17992 = Integer.MIN_VALUE;
        c4708.f17989 = 0.5f;
        c4708.f18009 = new C5171();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4702.f17908);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC4701.f17907.get(index);
            switch (i2) {
                case 1:
                    c4708.f18007 = typedArrayObtainStyledAttributes.getInt(index, c4708.f18007);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17972);
                    c4708.f17972 = resourceId;
                    if (resourceId == -1) {
                        c4708.f17972 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c4708.f17991 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f17991);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c4708.f17964) % 360.0f;
                    c4708.f17964 = f;
                    if (f < 0.0f) {
                        c4708.f17964 = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c4708.f17979 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4708.f17979);
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    c4708.f17945 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4708.f17945);
                    break;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    c4708.f17970 = typedArrayObtainStyledAttributes.getFloat(index, c4708.f17970);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17947);
                    c4708.f17947 = resourceId2;
                    if (resourceId2 == -1) {
                        c4708.f17947 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17980);
                    c4708.f17980 = resourceId3;
                    if (resourceId3 == -1) {
                        c4708.f17980 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17983);
                    c4708.f17983 = resourceId4;
                    if (resourceId4 == -1) {
                        c4708.f17983 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17969);
                    c4708.f17969 = resourceId5;
                    if (resourceId5 == -1) {
                        c4708.f17969 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f18004);
                    c4708.f18004 = resourceId6;
                    if (resourceId6 == -1) {
                        c4708.f18004 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17954);
                    c4708.f17954 = resourceId7;
                    if (resourceId7 == -1) {
                        c4708.f17954 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17967);
                    c4708.f17967 = resourceId8;
                    if (resourceId8 == -1) {
                        c4708.f17967 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17956);
                    c4708.f17956 = resourceId9;
                    if (resourceId9 == -1) {
                        c4708.f17956 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17960);
                    c4708.f17960 = resourceId10;
                    if (resourceId10 == -1) {
                        c4708.f17960 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17990);
                    c4708.f17990 = resourceId11;
                    if (resourceId11 == -1) {
                        c4708.f17990 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f18000);
                    c4708.f18000 = resourceId12;
                    if (resourceId12 == -1) {
                        c4708.f18000 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17949);
                    c4708.f17949 = resourceId13;
                    if (resourceId13 == -1) {
                        c4708.f17949 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17959);
                    c4708.f17959 = resourceId14;
                    if (resourceId14 == -1) {
                        c4708.f17959 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c4708.f18006 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f18006);
                    break;
                case 22:
                    c4708.f18005 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f18005);
                    break;
                case 23:
                    c4708.f17975 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f17975);
                    break;
                case 24:
                    c4708.f18001 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f18001);
                    break;
                case 25:
                    c4708.f17952 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f17952);
                    break;
                case 26:
                    c4708.f17985 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f17985);
                    break;
                case 27:
                    c4708.f17957 = typedArrayObtainStyledAttributes.getBoolean(index, c4708.f17957);
                    break;
                case 28:
                    c4708.f17961 = typedArrayObtainStyledAttributes.getBoolean(index, c4708.f17961);
                    break;
                case 29:
                    c4708.f17984 = typedArrayObtainStyledAttributes.getFloat(index, c4708.f17984);
                    break;
                case 30:
                    c4708.f17951 = typedArrayObtainStyledAttributes.getFloat(index, c4708.f17951);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c4708.f18008 = i3;
                    if (i3 == 1) {
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c4708.f17946 = i4;
                    if (i4 == 1) {
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c4708.f17974 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f17974);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c4708.f17974) == -2) {
                            c4708.f17974 = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c4708.f17997 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f17997);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c4708.f17997) == -2) {
                            c4708.f17997 = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c4708.f17995 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c4708.f17995));
                    c4708.f18008 = 2;
                    break;
                case 36:
                    try {
                        c4708.f17973 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f17973);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c4708.f17973) == -2) {
                            c4708.f17973 = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c4708.f17965 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f17965);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c4708.f17965) == -2) {
                            c4708.f17965 = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c4708.f17942 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c4708.f17942));
                    c4708.f17946 = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C4696.m10610(c4708, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c4708.f18003 = typedArrayObtainStyledAttributes.getFloat(index, c4708.f18003);
                            break;
                        case 46:
                            c4708.f17958 = typedArrayObtainStyledAttributes.getFloat(index, c4708.f17958);
                            break;
                        case 47:
                            c4708.f17977 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c4708.f17986 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c4708.f17994 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4708.f17994);
                            break;
                        case 50:
                            c4708.f17993 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4708.f17993);
                            break;
                        case 51:
                            c4708.f17988 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17987);
                            c4708.f17987 = resourceId15;
                            if (resourceId15 == -1) {
                                c4708.f17987 = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c4708.f17968);
                            c4708.f17968 = resourceId16;
                            if (resourceId16 == -1) {
                                c4708.f17968 = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c4708.f17963 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f17963);
                            break;
                        case 55:
                            c4708.f17950 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4708.f17950);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C4696.m10613(c4708, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C4696.m10613(c4708, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c4708.f17948 = typedArrayObtainStyledAttributes.getInt(index, c4708.f17948);
                                    break;
                                case 67:
                                    c4708.f18002 = typedArrayObtainStyledAttributes.getBoolean(index, c4708.f18002);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c4708.m10626();
        return c4708;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C4708 c4708 = new C4708(layoutParams);
        c4708.f17979 = -1;
        c4708.f17945 = -1;
        c4708.f17970 = -1.0f;
        c4708.f18002 = true;
        c4708.f17947 = -1;
        c4708.f17980 = -1;
        c4708.f17983 = -1;
        c4708.f17969 = -1;
        c4708.f18004 = -1;
        c4708.f17954 = -1;
        c4708.f17967 = -1;
        c4708.f17956 = -1;
        c4708.f17960 = -1;
        c4708.f17987 = -1;
        c4708.f17968 = -1;
        c4708.f17972 = -1;
        c4708.f17991 = 0;
        c4708.f17964 = 0.0f;
        c4708.f17990 = -1;
        c4708.f18000 = -1;
        c4708.f17949 = -1;
        c4708.f17959 = -1;
        c4708.f18006 = Integer.MIN_VALUE;
        c4708.f18005 = Integer.MIN_VALUE;
        c4708.f17975 = Integer.MIN_VALUE;
        c4708.f18001 = Integer.MIN_VALUE;
        c4708.f17952 = Integer.MIN_VALUE;
        c4708.f17985 = Integer.MIN_VALUE;
        c4708.f17950 = Integer.MIN_VALUE;
        c4708.f17963 = 0;
        c4708.f17984 = 0.5f;
        c4708.f17951 = 0.5f;
        c4708.f17996 = null;
        c4708.f18003 = -1.0f;
        c4708.f17958 = -1.0f;
        c4708.f17977 = 0;
        c4708.f17986 = 0;
        c4708.f18008 = 0;
        c4708.f17946 = 0;
        c4708.f17974 = 0;
        c4708.f17973 = 0;
        c4708.f17997 = 0;
        c4708.f17965 = 0;
        c4708.f17995 = 1.0f;
        c4708.f17942 = 1.0f;
        c4708.f17994 = -1;
        c4708.f17993 = -1;
        c4708.f18007 = -1;
        c4708.f17957 = false;
        c4708.f17961 = false;
        c4708.f17988 = null;
        c4708.f17948 = 0;
        c4708.f17955 = true;
        c4708.f17998 = true;
        c4708.f17962 = false;
        c4708.f17976 = false;
        c4708.f17943 = false;
        c4708.f17953 = -1;
        c4708.f17944 = -1;
        c4708.f17981 = -1;
        c4708.f17982 = -1;
        c4708.f17978 = Integer.MIN_VALUE;
        c4708.f17992 = Integer.MIN_VALUE;
        c4708.f17989 = 0.5f;
        c4708.f18009 = new C5171();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c4708).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c4708).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c4708).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c4708).bottomMargin = marginLayoutParams.bottomMargin;
            c4708.setMarginStart(marginLayoutParams.getMarginStart());
            c4708.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (layoutParams instanceof C4708) {
            C4708 c47082 = (C4708) layoutParams;
            c4708.f17979 = c47082.f17979;
            c4708.f17945 = c47082.f17945;
            c4708.f17970 = c47082.f17970;
            c4708.f18002 = c47082.f18002;
            c4708.f17947 = c47082.f17947;
            c4708.f17980 = c47082.f17980;
            c4708.f17983 = c47082.f17983;
            c4708.f17969 = c47082.f17969;
            c4708.f18004 = c47082.f18004;
            c4708.f17954 = c47082.f17954;
            c4708.f17967 = c47082.f17967;
            c4708.f17956 = c47082.f17956;
            c4708.f17960 = c47082.f17960;
            c4708.f17987 = c47082.f17987;
            c4708.f17968 = c47082.f17968;
            c4708.f17972 = c47082.f17972;
            c4708.f17991 = c47082.f17991;
            c4708.f17964 = c47082.f17964;
            c4708.f17990 = c47082.f17990;
            c4708.f18000 = c47082.f18000;
            c4708.f17949 = c47082.f17949;
            c4708.f17959 = c47082.f17959;
            c4708.f18006 = c47082.f18006;
            c4708.f18005 = c47082.f18005;
            c4708.f17975 = c47082.f17975;
            c4708.f18001 = c47082.f18001;
            c4708.f17952 = c47082.f17952;
            c4708.f17985 = c47082.f17985;
            c4708.f17950 = c47082.f17950;
            c4708.f17963 = c47082.f17963;
            c4708.f17984 = c47082.f17984;
            c4708.f17951 = c47082.f17951;
            c4708.f17996 = c47082.f17996;
            c4708.f18003 = c47082.f18003;
            c4708.f17958 = c47082.f17958;
            c4708.f17977 = c47082.f17977;
            c4708.f17986 = c47082.f17986;
            c4708.f17957 = c47082.f17957;
            c4708.f17961 = c47082.f17961;
            c4708.f18008 = c47082.f18008;
            c4708.f17946 = c47082.f17946;
            c4708.f17974 = c47082.f17974;
            c4708.f17997 = c47082.f17997;
            c4708.f17973 = c47082.f17973;
            c4708.f17965 = c47082.f17965;
            c4708.f17995 = c47082.f17995;
            c4708.f17942 = c47082.f17942;
            c4708.f17994 = c47082.f17994;
            c4708.f17993 = c47082.f17993;
            c4708.f18007 = c47082.f18007;
            c4708.f17955 = c47082.f17955;
            c4708.f17998 = c47082.f17998;
            c4708.f17962 = c47082.f17962;
            c4708.f17976 = c47082.f17976;
            c4708.f17953 = c47082.f17953;
            c4708.f17944 = c47082.f17944;
            c4708.f17981 = c47082.f17981;
            c4708.f17982 = c47082.f17982;
            c4708.f17978 = c47082.f17978;
            c4708.f17992 = c47082.f17992;
            c4708.f17989 = c47082.f17989;
            c4708.f17988 = c47082.f17988;
            c4708.f17948 = c47082.f17948;
            c4708.f18009 = c47082.f18009;
        }
        return c4708;
    }

    public int getMaxHeight() {
        return this.f273;
    }

    public int getMaxWidth() {
        return this.f271;
    }

    public int getMinHeight() {
        return this.f262;
    }

    public int getMinWidth() {
        return this.f268;
    }

    public int getOptimizationLevel() {
        return this.f264.f19906;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C5177 c5177 = this.f264;
        if (c5177.f19784 == null) {
            int id2 = getId();
            if (id2 != -1) {
                c5177.f19784 = getContext().getResources().getResourceEntryName(id2);
            } else {
                c5177.f19784 = "parent";
            }
        }
        if (c5177.f19811 == null) {
            c5177.f19811 = c5177.f19784;
            String str = " setDebugName " + c5177.f19811;
        }
        Iterator it = c5177.f19893.iterator();
        while (it.hasNext()) {
            C5171 c5171 = (C5171) it.next();
            View view = c5171.f19783;
            if (view != null) {
                if (c5171.f19784 == null && (id = view.getId()) != -1) {
                    c5171.f19784 = getContext().getResources().getResourceEntryName(id);
                }
                if (c5171.f19811 == null) {
                    c5171.f19811 = c5171.f19784;
                    String str2 = " setDebugName " + c5171.f19811;
                }
            }
        }
        c5177.mo11503(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C4708 c4708 = (C4708) childAt.getLayoutParams();
            C5171 c5171 = c4708.f18009;
            if (childAt.getVisibility() != 8 || c4708.f17976 || c4708.f17943 || zIsInEditMode) {
                int iM11488 = c5171.m11488();
                int iM11504 = c5171.m11504();
                childAt.layout(iM11488, iM11504, c5171.m11505() + iM11488, c5171.m11490() + iM11504);
            }
        }
        ArrayList arrayList = this.f261;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC4692) arrayList.get(i6)).mo174();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x051c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r24, int r25) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C5171 c5171M172 = m172(view);
        if ((view instanceof Guideline) && !(c5171M172 instanceof C5180)) {
            C4708 c4708 = (C4708) view.getLayoutParams();
            C5180 c5180 = new C5180();
            c4708.f18009 = c5180;
            c4708.f17976 = true;
            c5180.m11555(c4708.f18007);
        }
        if (view instanceof AbstractC4692) {
            AbstractC4692 abstractC4692 = (AbstractC4692) view;
            abstractC4692.m10601();
            ((C4708) view.getLayoutParams()).f17943 = true;
            ArrayList arrayList = this.f261;
            if (!arrayList.contains(abstractC4692)) {
                arrayList.add(abstractC4692);
            }
        }
        this.f269.put(view.getId(), view);
        this.f263 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f269.remove(view.getId());
        C5171 c5171M172 = m172(view);
        this.f264.f19893.remove(c5171M172);
        c5171M172.mo11479();
        this.f261.remove(view);
        this.f263 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f263 = true;
        super.requestLayout();
    }

    public void setConstraintSet(C4696 c4696) {
        this.f270 = c4696;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f269;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f273) {
            return;
        }
        this.f273 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f271) {
            return;
        }
        this.f271 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f262) {
            return;
        }
        this.f262 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f268) {
            return;
        }
        this.f268 = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC4706 abstractC4706) {
        C3761 c3761 = this.f274;
        if (c3761 != null) {
            c3761.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f267 = i;
        C5177 c5177 = this.f264;
        c5177.f19906 = i;
        C1700.f6626 = c5177.m11538(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m169(int r13) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r12 = this;
            ᴵﹳ.ˉⁱ r0 = new ᴵﹳ.ˉⁱ
            android.content.Context r1 = r12.getContext()
            r2 = 17
            r3 = 0
            r0.<init>(r2, r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f14527 = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f14528 = r2
            java.lang.String r2 = "Error parsing resource: "
            java.lang.String r3 = "ConstraintLayoutStates"
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.XmlResourceParser r4 = r4.getXml(r13)
            int r5 = r4.getEventType()     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r6 = 0
        L2b:
            r7 = 1
            if (r5 == r7) goto Lc1
            r8 = 2
            if (r5 == r8) goto L33
            goto La1
        L33:
            java.lang.String r5 = r4.getName()     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            int r9 = r5.hashCode()     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r10 = 4
            r11 = 3
            switch(r9) {
                case -1349929691: goto L6d;
                case 80204913: goto L63;
                case 1382829617: goto L5a;
                case 1657696882: goto L50;
                case 1901439077: goto L41;
                default: goto L40;
            }     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
        L40:
            goto L77
        L41:
            java.lang.String r7 = "Variant"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            if (r5 == 0) goto L77
            r7 = 3
            goto L78
        L4b:
            r1 = move-exception
            goto La6
        L4d:
            r1 = move-exception
            goto Lb4
        L50:
            java.lang.String r7 = "layoutDescription"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            if (r5 == 0) goto L77
            r7 = 0
            goto L78
        L5a:
            java.lang.String r9 = "StateSet"
            boolean r5 = r5.equals(r9)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            if (r5 == 0) goto L77
            goto L78
        L63:
            java.lang.String r7 = "State"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            if (r5 == 0) goto L77
            r7 = 2
            goto L78
        L6d:
            java.lang.String r7 = "ConstraintSet"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            if (r5 == 0) goto L77
            r7 = 4
            goto L78
        L77:
            r7 = -1
        L78:
            if (r7 == r8) goto L92
            if (r7 == r11) goto L83
            if (r7 == r10) goto L7f
            goto La1
        L7f:
            r0.m8770(r1, r4)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            goto La1
        L83:
            ﹳˑ.ٴˎ r5 = new ﹳˑ.ٴˎ     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r5.<init>(r1, r4)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            if (r6 == 0) goto La1
            java.lang.Object r7 = r6.f1033     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r7.add(r5)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            goto La1
        L92:
            androidx.leanback.widget.ʽⁱ r5 = new androidx.leanback.widget.ʽⁱ     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r5.<init>(r1, r4)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            java.lang.Object r6 = r0.f14527     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            int r7 = r5.f1034     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r6.put(r7, r5)     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            r6 = r5
        La1:
            int r5 = r4.next()     // Catch: java.io.IOException -> L4b org.xmlpull.v1.XmlPullParserException -> L4d
            goto L2b
        La6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            goto Lc1
        Lb4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
        Lc1:
            r12.f274 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m169(int):void");
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m170(C5171 c5171, C4708 c4708, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f269.get(i);
        C5171 c51712 = (C5171) sparseArray.get(i);
        if (c51712 == null || view == null || !(view.getLayoutParams() instanceof C4708)) {
            return;
        }
        c4708.f17962 = true;
        if (i2 == 6) {
            C4708 c47082 = (C4708) view.getLayoutParams();
            c47082.f17962 = true;
            c47082.f18009.f19814 = true;
        }
        c5171.mo11510(6).m11522(c51712.mo11510(i2), c4708.f17963, c4708.f17950, true);
        c5171.f19814 = true;
        c5171.mo11510(3).m11524();
        c5171.mo11510(5).m11524();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bc  */
    /* renamed from: ˏʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m171(p447.C5177 r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m171(ﾞˊ.ٴˎ, int, int, int):void");
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C5171 m172(View view) {
        if (view == this) {
            return this.f264;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C4708) {
            return ((C4708) view.getLayoutParams()).f18009;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C4708) {
            return ((C4708) view.getLayoutParams()).f18009;
        }
        return null;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m173(AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        C5177 c5177 = this.f264;
        c5177.f19783 = this;
        C4693 c4693 = this.f272;
        c5177.f19897 = c4693;
        c5177.f19899.f19615 = c4693;
        this.f269.put(getId(), this);
        this.f270 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC4702.f17908, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f268 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f268);
                } else if (index == 17) {
                    this.f262 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f262);
                } else if (index == 14) {
                    this.f271 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f271);
                } else if (index == 15) {
                    this.f273 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f273);
                } else if (index == 113) {
                    this.f267 = typedArrayObtainStyledAttributes.getInt(index, this.f267);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m169(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f274 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C4696 c4696 = new C4696();
                        this.f270 = c4696;
                        c4696.m10616(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f270 = null;
                    }
                    this.f260 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c5177.f19906 = this.f267;
        C1700.f6626 = c5177.m11538(512);
    }
}
