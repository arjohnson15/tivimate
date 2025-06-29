package p361;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.lsposed.hiddenapibypass.library.R;
import org.xmlpull.v1.XmlPullParserException;
import p239.AbstractC3098;

/* renamed from: ᵔᵔ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4096 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC4104 f15802;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f15804;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int[][] f15803 = new int[10][];

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public InterfaceC4104[] f15805 = new InterfaceC4104[10];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC4104 m9396(int[] iArr) {
        int i;
        int[][] iArr2 = this.f15803;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= this.f15804) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f15803;
            while (true) {
                if (i2 >= this.f15804) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i2], iArr3)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            i3 = i;
        }
        return i3 < 0 ? this.f15802 : this.f15805[i3];
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9397(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = AbstractC3098.f11960;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                InterfaceC4104 interfaceC4104M9378 = C4089.m9378(typedArrayObtainAttributes, 5, new C4097(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr._2_res_0x7f04019f) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                m9398(StateSet.trimStateSet(iArr2, i), interfaceC4104M9378);
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9398(int[] iArr, InterfaceC4104 interfaceC4104) {
        int i = this.f15804;
        if (i == 0 || iArr.length == 0) {
            this.f15802 = interfaceC4104;
        }
        int[][] iArr2 = this.f15803;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f15803 = iArr3;
            InterfaceC4104[] interfaceC4104Arr = new InterfaceC4104[i2];
            System.arraycopy(this.f15805, 0, interfaceC4104Arr, 0, i);
            this.f15805 = interfaceC4104Arr;
        }
        int[][] iArr4 = this.f15803;
        int i3 = this.f15804;
        iArr4[i3] = iArr;
        this.f15805[i3] = interfaceC4104;
        this.f15804 = i3 + 1;
    }
}
