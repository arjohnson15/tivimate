package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.FocusFinder;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p061.AbstractC1373;
import p061.AbstractC1375;
import p061.AbstractC1402;
import p061.AbstractC1420;
import p061.C1357;
import p061.C1398;
import p061.C1423;
import p061.C1424;
import p061.C1425;
import p061.C1426;
import p061.C1429;
import p061.RunnableC1362;
import p204.C2772;
import p204.C2784;
import p260.C3222;
import p378.AbstractC4345;

/* loaded from: classes.dex */
public final class GridLayoutManager extends AbstractC1402 {

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public static final Rect f782 = new Rect();

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public static final int[] f783 = new int[2];

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public int f784;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final C0137 f785;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final ʾי.ˑʽ f786;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f787;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final ﹶˋ.ـﹶ f788;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public int f789;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f790;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f791;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public AudioManager f792;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final RunnableC0183 f793;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final C3222 f794;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public int f795;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C0158 f796;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public C1426 f797;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public AbstractC0154 f798;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public int f799;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public InterfaceC0184 f800;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public AbstractC0164 f801;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f802;

    /* renamed from: ˑי, reason: contains not printable characters */
    public float f803;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public int[] f804;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f805;

    /* renamed from: יʻ, reason: contains not printable characters */
    public final SparseIntArray f806;

    /* renamed from: יˋ, reason: contains not printable characters */
    public final int[] f807;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f808;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ArrayList f809;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C1429 f810;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int f811;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public int f812;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public int f813;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public int f814;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public int f815;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public int f816;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public int f817;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f818;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public int f819;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public int f820;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public AbstractC1420 f821;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public int[] f822;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public AbstractC0167 f823;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public int f824;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public int f825;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public int f826;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f827;

    public GridLayoutManager() {
        this(null);
    }

    public GridLayoutManager(AbstractC0164 abstractC0164) {
        this.f803 = 1.0f;
        this.f814 = 10;
        this.f813 = 0;
        this.f821 = new C1357(this, 0);
        this.f806 = new SparseIntArray();
        this.f790 = 221696;
        this.f800 = null;
        this.f809 = null;
        this.f791 = -1;
        this.f818 = 0;
        this.f808 = 0;
        this.f815 = 8388659;
        this.f795 = 1;
        this.f812 = 0;
        this.f788 = new ﹶˋ.ـﹶ(1);
        this.f794 = new C3222(1);
        this.f807 = new int[2];
        C0137 c0137 = new C0137();
        c0137.f1034 = 0;
        c0137.f1032 = 100;
        this.f785 = c0137;
        this.f793 = new RunnableC0183(0, this);
        this.f786 = new ʾי.ˑʽ(1, this);
        this.f801 = abstractC0164;
        this.f811 = -1;
        m4837(false);
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public static int m785(View view) {
        C0187 c0187;
        if (view == null || (c0187 = (C0187) view.getLayoutParams()) == null || c0187.f5702.m4772()) {
            return -1;
        }
        return c0187.f5702.m4766();
    }

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public static int m786(View view) {
        C0187 c0187 = (C0187) view.getLayoutParams();
        return AbstractC1402.m4812(view) + ((ViewGroup.MarginLayoutParams) c0187).topMargin + ((ViewGroup.MarginLayoutParams) c0187).bottomMargin;
    }

    /* renamed from: יי, reason: contains not printable characters */
    public static int m787(View view) {
        C0187 c0187 = (C0187) view.getLayoutParams();
        return AbstractC1402.m4817(view) + ((ViewGroup.MarginLayoutParams) c0187).leftMargin + ((ViewGroup.MarginLayoutParams) c0187).rightMargin;
    }

    /* renamed from: ᵢⁱ, reason: contains not printable characters */
    public static int m788(View view, View view2) {
        ʾי.ˑʽ r1;
        if (view != null && view2 != null && (r1 = ((C0187) view.getLayoutParams()).f1162) != null) {
            C0189[] c0189Arr = (C0189[]) r1.ˆʿ;
            if (c0189Arr.length > 1) {
                while (view2 != view) {
                    int id = view2.getId();
                    if (id != -1) {
                        for (int i = 1; i < c0189Arr.length; i++) {
                            if (c0189Arr[i].f1171 == id) {
                                return i;
                            }
                        }
                    }
                    view2 = (View) view2.getParent();
                }
            }
        }
        return 0;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final void mo789(C1429 c1429, C1426 c1426, int i, int i2) {
        int size;
        int size2;
        int mode;
        int iM4835;
        int iM4848;
        int iM792;
        m835(c1429, c1426);
        if (this.f813 == 0) {
            size2 = View.MeasureSpec.getSize(i);
            size = View.MeasureSpec.getSize(i2);
            mode = View.MeasureSpec.getMode(i2);
            iM4835 = m4824();
            iM4848 = m4833();
        } else {
            size = View.MeasureSpec.getSize(i);
            size2 = View.MeasureSpec.getSize(i2);
            mode = View.MeasureSpec.getMode(i);
            iM4835 = m4835();
            iM4848 = m4848();
        }
        int i3 = iM4848 + iM4835;
        this.f819 = size;
        int i4 = this.f787;
        if (i4 == -2) {
            int i5 = this.f795;
            if (i5 == 0) {
                i5 = 1;
            }
            this.f826 = i5;
            this.f805 = 0;
            int[] iArr = this.f804;
            if (iArr == null || iArr.length != i5) {
                this.f804 = new int[i5];
            }
            if (this.f797.f5832) {
                m821();
            }
            m827(true);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(m792() + i3, this.f819);
            } else if (mode == 0) {
                iM792 = m792();
                size = iM792 + i3;
            } else {
                if (mode != 1073741824) {
                    throw new IllegalStateException("wrong spec");
                }
                size = this.f819;
            }
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    if (i4 == 0) {
                        i4 = size - i3;
                    }
                    this.f805 = i4;
                    int i6 = this.f795;
                    if (i6 == 0) {
                        i6 = 1;
                    }
                    this.f826 = i6;
                    iM792 = ((i6 - 1) * this.f816) + (i4 * i6);
                    size = iM792 + i3;
                } else if (mode != 1073741824) {
                    throw new IllegalStateException("wrong spec");
                }
            }
            int i7 = this.f795;
            if (i7 == 0 && i4 == 0) {
                this.f826 = 1;
                this.f805 = size - i3;
            } else if (i7 == 0) {
                this.f805 = i4;
                int i8 = this.f816;
                this.f826 = (size + i8) / (i4 + i8);
            } else if (i4 == 0) {
                this.f826 = i7;
                this.f805 = ((size - i3) - ((i7 - 1) * this.f816)) / i7;
            } else {
                this.f826 = i7;
                this.f805 = i4;
            }
            if (mode == Integer.MIN_VALUE) {
                int i9 = this.f805;
                int i10 = this.f826;
                int i11 = ((i10 - 1) * this.f816) + (i9 * i10) + i3;
                if (i11 < size) {
                    size = i11;
                }
            }
        }
        if (this.f813 == 0) {
            this.f5717.setMeasuredDimension(size2, size);
        } else {
            this.f5717.setMeasuredDimension(size, size2);
        }
        m819();
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public final void m790(View view) {
        int childMeasureSpec;
        int childMeasureSpec2;
        C0187 c0187 = (C0187) view.getLayoutParams();
        Rect rect = f782;
        m4843(view, rect);
        int i = ((ViewGroup.MarginLayoutParams) c0187).leftMargin + ((ViewGroup.MarginLayoutParams) c0187).rightMargin + rect.left + rect.right;
        int i2 = ((ViewGroup.MarginLayoutParams) c0187).topMargin + ((ViewGroup.MarginLayoutParams) c0187).bottomMargin + rect.top + rect.bottom;
        int iMakeMeasureSpec = this.f787 == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(this.f805, 1073741824);
        if (this.f813 == 0) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i, ((ViewGroup.MarginLayoutParams) c0187).width);
            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i2, ((ViewGroup.MarginLayoutParams) c0187).height);
        } else {
            int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i2, ((ViewGroup.MarginLayoutParams) c0187).height);
            childMeasureSpec = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i, ((ViewGroup.MarginLayoutParams) c0187).width);
            childMeasureSpec2 = childMeasureSpec3;
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    public final void m791() {
        int i = this.f790;
        if ((65600 & i) == 65536) {
            AbstractC0154 abstractC0154 = this.f798;
            int i2 = this.f791;
            int i3 = (i & 262144) != 0 ? -this.f799 : this.f820 + this.f799;
            while (true) {
                int i4 = abstractC0154.f1084;
                if (i4 >= abstractC0154.f1083 && i4 > i2) {
                    if (!abstractC0154.f1081) {
                        if (abstractC0154.f1078.ˋˊ(i4) < i3) {
                            break;
                        }
                        abstractC0154.f1078.ᐧⁱ(abstractC0154.f1084);
                        abstractC0154.f1084--;
                    } else {
                        if (abstractC0154.f1078.ˋˊ(i4) > i3) {
                            break;
                        }
                        abstractC0154.f1078.ᐧⁱ(abstractC0154.f1084);
                        abstractC0154.f1084--;
                    }
                } else {
                    break;
                }
            }
            if (abstractC0154.f1084 < abstractC0154.f1083) {
                abstractC0154.f1084 = -1;
                abstractC0154.f1083 = -1;
            }
        }
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public final int m792() {
        int i = (this.f790 & 524288) != 0 ? 0 : this.f826 - 1;
        return m854(i) + m806(i);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final void mo793(C1429 c1429, C1426 c1426, C2784 c2784) {
        m835(c1429, c1426);
        int iM4948 = c1426.m4948();
        int i = this.f790;
        boolean z = (262144 & i) != 0;
        if ((i & 2048) == 0 || (iM4948 > 1 && !m861(0))) {
            if (Build.VERSION.SDK_INT < 23) {
                c2784.m7059(8192);
            } else if (this.f813 == 0) {
                c2784.m7051(z ? C2772.f10836 : C2772.f10830);
            } else {
                c2784.m7051(C2772.f10832);
            }
            c2784.m7055(true);
        }
        if ((this.f790 & 4096) == 0 || (iM4948 > 1 && !m861(iM4948 - 1))) {
            if (Build.VERSION.SDK_INT < 23) {
                c2784.m7059(4096);
            } else if (this.f813 == 0) {
                c2784.m7051(z ? C2772.f10830 : C2772.f10836);
            } else {
                c2784.m7051(C2772.f10831);
            }
            c2784.m7055(true);
        }
        c2784.f10848.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo845(c1429, c1426), mo857(c1429, c1426), false, 0));
        c2784.m7063(GridView.class.getName());
        m819();
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public final void m794() {
        this.f798.mo912((this.f790 & 262144) != 0 ? (-this.f799) - this.f824 : this.f820 + this.f799 + this.f824, false);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void mo795(C1429 c1429, C1426 c1426, View view, C2784 c2784) {
        ˉⁱ r5;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f798 == null || !(layoutParams instanceof C0187)) {
            return;
        }
        int iM4766 = ((C0187) layoutParams).f5702.m4766();
        int i = -1;
        if (iM4766 >= 0 && (r5 = this.f798.mo919(iM4766)) != null) {
            i = r5.ᐧⁱ;
        }
        if (i < 0) {
            return;
        }
        int i2 = iM4766 / this.f798.f1079;
        if (this.f813 == 0) {
            c2784.m7056(ˊﹶ.ˋˉ.ˎˑ(false, i, 1, i2, 1));
        } else {
            c2784.m7056(ˊﹶ.ˋˉ.ˎˑ(false, i2, 1, i, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    @Override // p061.AbstractC1402
    /* renamed from: ʾˈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Parcelable mo796() {
        /*
            r8 = this;
            androidx.leanback.widget.ﹳˎ r0 = new androidx.leanback.widget.ﹳˎ
            r0.<init>()
            android.os.Bundle r1 = android.os.Bundle.EMPTY
            r0.f1195 = r1
            int r1 = r8.f791
            r0.f1196 = r1
            androidx.leanback.widget.ʽⁱ r1 = r8.f785
            java.lang.Object r2 = r1.f1033
            ʾـ.ᵢˆ r2 = (p061.C1424) r2
            if (r2 == 0) goto L54
            java.lang.Object r3 = r2.f5802
            ٴᐧ.ᐧⁱ r3 = (ٴᐧ.ᐧⁱ) r3
            monitor-enter(r3)
            int r2 = r2.f5799     // Catch: java.lang.Throwable -> L51
            monitor-exit(r3)
            if (r2 != 0) goto L20
            goto L54
        L20:
            java.lang.Object r2 = r1.f1033
            ʾـ.ᵢˆ r2 = (p061.C1424) r2
            java.util.LinkedHashMap r2 = r2.m4942()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            android.util.SparseArray r4 = (android.util.SparseArray) r4
            r3.putSparseParcelableArray(r5, r4)
            goto L35
        L51:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L54:
            r3 = 0
        L55:
            int r2 = r8.m4846()
            r4 = 0
        L5a:
            if (r4 >= r2) goto L84
            android.view.View r5 = r8.m4847(r4)
            int r6 = m785(r5)
            r7 = -1
            if (r6 == r7) goto L81
            int r7 = r1.f1034
            if (r7 == 0) goto L81
            java.lang.String r6 = java.lang.Integer.toString(r6)
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            r5.saveHierarchyState(r7)
            if (r3 != 0) goto L7e
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        L7e:
            r3.putSparseParcelableArray(r6, r7)
        L81:
            int r4 = r4 + 1
            goto L5a
        L84:
            r0.f1195 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.mo796():android.os.Parcelable");
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean mo797() {
        return this.f813 == 0 || this.f826 > 1;
    }

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public final void m798() {
        ArrayList arrayList;
        if (this.f800 != null || ((arrayList = this.f809) != null && arrayList.size() > 0)) {
            int i = this.f791;
            View viewMo1262 = i == -1 ? null : mo1262(i);
            if (viewMo1262 != null) {
                AbstractC1375 abstractC1375M1331 = this.f801.m1331(viewMo1262);
                InterfaceC0184 interfaceC0184 = this.f800;
                if (interfaceC0184 != null) {
                    interfaceC0184.mo981(viewMo1262, this.f791);
                }
                AbstractC0164 abstractC0164 = this.f801;
                int i2 = this.f791;
                ArrayList arrayList2 = this.f809;
                if (arrayList2 != null) {
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        ((AbstractC0141) this.f809.get(size)).mo906(abstractC0164, abstractC1375M1331, i2);
                    }
                }
            } else {
                InterfaceC0184 interfaceC01842 = this.f800;
                if (interfaceC01842 != null) {
                    interfaceC01842.mo981(null, -1);
                }
                AbstractC0164 abstractC01642 = this.f801;
                ArrayList arrayList3 = this.f809;
                if (arrayList3 != null) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        ((AbstractC0141) this.f809.get(size2)).mo906(abstractC01642, null, -1);
                    }
                }
            }
            if ((this.f790 & 3) == 1 || this.f801.isLayoutRequested()) {
                return;
            }
            int iM4846 = m4846();
            for (int i3 = 0; i3 < iM4846; i3++) {
                if (m4847(i3).isLayoutRequested()) {
                    AbstractC0164 abstractC01643 = this.f801;
                    WeakHashMap weakHashMap = AbstractC4345.f16838;
                    abstractC01643.postOnAnimation(this.f793);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    @Override // p061.AbstractC1402
    /* renamed from: ʿˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo799(androidx.recyclerview.widget.RecyclerView r18, java.util.ArrayList r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.mo799(androidx.recyclerview.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final C1398 mo800(Context context, AttributeSet attributeSet) {
        return new C0187(context, attributeSet);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int mo801(View view) {
        return super.mo801(view) + ((C0187) view.getLayoutParams()).f1160;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017d  */
    /* renamed from: ˆˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m802(android.view.View r13, android.view.View r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.m802(android.view.View, android.view.View, int[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* renamed from: ˆˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m803(int r10) {
        /*
            r9 = this;
            int r0 = r9.f813
            r1 = 130(0x82, float:1.82E-43)
            r2 = 66
            r3 = 33
            r4 = 2
            r5 = 0
            r6 = 3
            r7 = 1
            r8 = 17
            if (r0 != 0) goto L30
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r10 == r8) goto L28
            if (r10 == r3) goto L2e
            if (r10 == r2) goto L1f
            if (r10 == r1) goto L1d
            r4 = 17
            goto L2e
        L1d:
            r4 = 3
            goto L2e
        L1f:
            int r10 = r9.f790
            r10 = r10 & r0
            if (r10 != 0) goto L26
        L24:
            r4 = 1
            goto L2e
        L26:
            r4 = 0
            goto L2e
        L28:
            int r10 = r9.f790
            r10 = r10 & r0
            if (r10 != 0) goto L24
            goto L26
        L2e:
            r5 = r4
            goto L4d
        L30:
            if (r0 != r7) goto L4b
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == r8) goto L45
            if (r10 == r3) goto L4d
            if (r10 == r2) goto L3f
            if (r10 == r1) goto L3d
            goto L4b
        L3d:
            r5 = 1
            goto L4d
        L3f:
            int r10 = r9.f790
            r10 = r10 & r0
            if (r10 != 0) goto L2e
            goto L1d
        L45:
            int r10 = r9.f790
            r10 = r10 & r0
            if (r10 != 0) goto L1d
            goto L2e
        L4b:
            r5 = 17
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.m803(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[PHI: r0
  0x0031: PHI (r0v9 int) = (r0v8 int), (r0v12 int) binds: [B:19:0x002f, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ˆˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m804(int r7) {
        /*
            r6 = this;
            int r0 = r6.f790
            r1 = r0 & 64
            r2 = 1
            if (r1 != 0) goto L32
            r0 = r0 & 3
            if (r0 == r2) goto L32
            ﹶˋ.ـﹶ r0 = r6.f788
            if (r7 <= 0) goto L20
            java.lang.Object r0 = r0.ᐧˋ
            androidx.leanback.widget.ˊˆ r0 = (androidx.leanback.widget.C0149) r0
            int r1 = r0.f1059
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L1b
            goto L32
        L1b:
            int r0 = r0.f1058
            if (r7 <= r0) goto L32
            goto L31
        L20:
            if (r7 >= 0) goto L32
            java.lang.Object r0 = r0.ᐧˋ
            androidx.leanback.widget.ˊˆ r0 = (androidx.leanback.widget.C0149) r0
            int r1 = r0.f1052
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r3) goto L2d
            goto L32
        L2d:
            int r0 = r0.f1062
            if (r7 >= r0) goto L32
        L31:
            r7 = r0
        L32:
            r0 = 0
            if (r7 != 0) goto L36
            return r0
        L36:
            int r1 = -r7
            int r3 = r6.m4846()
            int r4 = r6.f813
            if (r4 != r2) goto L4c
            r4 = 0
        L40:
            if (r4 >= r3) goto L59
            android.view.View r5 = r6.m4847(r4)
            r5.offsetTopAndBottom(r1)
            int r4 = r4 + 1
            goto L40
        L4c:
            r4 = 0
        L4d:
            if (r4 >= r3) goto L59
            android.view.View r5 = r6.m4847(r4)
            r5.offsetLeftAndRight(r1)
            int r4 = r4 + 1
            goto L4d
        L59:
            int r1 = r6.f790
            r1 = r1 & 3
            if (r1 != r2) goto L63
            r6.m840()
            return r7
        L63:
            int r1 = r6.m4846()
            int r3 = r6.f790
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L71
            if (r7 <= 0) goto L77
            goto L73
        L71:
            if (r7 >= 0) goto L77
        L73:
            r6.m846()
            goto L7a
        L77:
            r6.m794()
        L7a:
            int r3 = r6.m4846()
            if (r3 <= r1) goto L82
            r1 = 1
            goto L83
        L82:
            r1 = 0
        L83:
            int r3 = r6.m4846()
            int r5 = r6.f790
            r4 = r4 & r5
            if (r4 == 0) goto L8f
            if (r7 <= 0) goto L95
            goto L91
        L8f:
            if (r7 >= 0) goto L95
        L91:
            r6.m791()
            goto L98
        L95:
            r6.m813()
        L98:
            int r4 = r6.m4846()
            if (r4 >= r3) goto L9f
            goto La0
        L9f:
            r2 = 0
        La0:
            r0 = r1 | r2
            if (r0 == 0) goto La7
            r6.m838()
        La7:
            androidx.leanback.widget.ˏᵢ r0 = r6.f801
            r0.invalidate()
            r6.m840()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.m804(int):int");
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int mo805(View view) {
        return super.mo805(view) - ((C0187) view.getLayoutParams()).f1166;
    }

    /* renamed from: ˆﹶ, reason: contains not printable characters */
    public final int m806(int i) {
        int iM854 = 0;
        if ((this.f790 & 524288) != 0) {
            for (int i2 = this.f826 - 1; i2 > i; i2--) {
                iM854 += m854(i2) + this.f816;
            }
            return iM854;
        }
        int iM8542 = 0;
        while (iM854 < i) {
            iM8542 += m854(iM854) + this.f816;
            iM854++;
        }
        return iM8542;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final int mo807(View view) {
        return super.mo807(view) - ((C0187) view.getLayoutParams()).f1164;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final boolean m808() {
        return m4844() == 0 || this.f801.m1326(0) != null;
    }

    /* renamed from: ˉʽ, reason: contains not printable characters */
    public final void m809() {
        int iM4846 = m4846();
        for (int i = 0; i < iM4846; i++) {
            m824(m4847(i));
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo810(int i, C1423 c1423) {
        int i2 = this.f801.f1118;
        if (i == 0 || i2 == 0) {
            return;
        }
        int iMax = Math.max(0, Math.min(this.f791 - ((i2 - 1) / 2), i - i2));
        for (int i3 = iMax; i3 < i && i3 < iMax + i2; i3++) {
            c1423.m4925(i3, 0);
        }
    }

    /* renamed from: ˊˉ, reason: contains not printable characters */
    public final void m811(View view, View view2, boolean z, int i, int i2) {
        if ((this.f790 & 64) != 0) {
            return;
        }
        int iM785 = m785(view);
        int iM788 = m788(view, view2);
        if (iM785 != this.f791 || iM788 != this.f818) {
            this.f791 = iM785;
            this.f818 = iM788;
            this.f808 = 0;
            if ((this.f790 & 3) != 1) {
                m798();
            }
            if (this.f801.m1321()) {
                this.f801.invalidate();
            }
        }
        if (view == null) {
            return;
        }
        if (!view.hasFocus() && this.f801.hasFocus()) {
            view.requestFocus();
        }
        if ((this.f790 & 131072) == 0 && z) {
            return;
        }
        int[] iArr = f783;
        if (!m802(view, view2, iArr) && i == 0 && i2 == 0) {
            return;
        }
        int i3 = iArr[0] + i;
        int i4 = iArr[1] + i2;
        if ((this.f790 & 3) == 1) {
            m804(i3);
            m862(i4);
            return;
        }
        if (this.f813 != 0) {
            i4 = i3;
            i3 = i4;
        }
        if (z) {
            this.f801.m1300(i3, false, i4);
        } else {
            this.f801.scrollBy(i3, i4);
            m816();
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public final void mo812(Parcelable parcelable) {
        if (parcelable instanceof C0197) {
            C0197 c0197 = (C0197) parcelable;
            this.f791 = c0197.f1196;
            this.f808 = 0;
            Bundle bundle = c0197.f1195;
            C0137 c0137 = this.f785;
            C1424 c1424 = (C1424) c0137.f1033;
            if (c1424 != null && bundle != null) {
                c1424.m4936(-1);
                for (String str : bundle.keySet()) {
                    ((C1424) c0137.f1033).m4933(str, bundle.getSparseParcelableArray(str));
                }
            }
            this.f790 |= 256;
            m4838();
        }
    }

    /* renamed from: ˋʽ, reason: contains not printable characters */
    public final void m813() {
        int i = this.f790;
        if ((65600 & i) == 65536) {
            AbstractC0154 abstractC0154 = this.f798;
            int i2 = this.f791;
            int i3 = (i & 262144) != 0 ? this.f820 + this.f799 : -this.f799;
            while (true) {
                int i4 = abstractC0154.f1084;
                int i5 = abstractC0154.f1083;
                if (i4 >= i5 && i5 < i2) {
                    int i6 = abstractC0154.f1078.יʻ(i5);
                    if (!abstractC0154.f1081) {
                        if (abstractC0154.f1078.ˋˊ(abstractC0154.f1083) + i6 > i3) {
                            break;
                        }
                        abstractC0154.f1078.ᐧⁱ(abstractC0154.f1083);
                        abstractC0154.f1083++;
                    } else {
                        if (abstractC0154.f1078.ˋˊ(abstractC0154.f1083) - i6 < i3) {
                            break;
                        }
                        abstractC0154.f1078.ᐧⁱ(abstractC0154.f1083);
                        abstractC0154.f1083++;
                    }
                } else {
                    break;
                }
            }
            if (abstractC0154.f1084 < abstractC0154.f1083) {
                abstractC0154.f1084 = -1;
                abstractC0154.f1083 = -1;
            }
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final C1398 mo814(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0187 ? new C0187((C0187) layoutParams) : layoutParams instanceof C1398 ? new C0187((C1398) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0187((ViewGroup.MarginLayoutParams) layoutParams) : new C0187(layoutParams);
    }

    /* renamed from: ˋᴵ, reason: contains not printable characters */
    public final void m815(boolean z) {
        int i;
        if (z) {
            if (m849()) {
                return;
            }
        } else if (m808()) {
            return;
        }
        C0158 c0158 = this.f796;
        if (c0158 == null) {
            C0158 c01582 = new C0158(this, z ? 1 : -1, this.f826 > 1);
            this.f808 = 0;
            mo823(c01582);
        } else {
            GridLayoutManager gridLayoutManager = c0158.f1087;
            if (z) {
                int i2 = c0158.f1089;
                if (i2 < gridLayoutManager.f814) {
                    c0158.f1089 = i2 + 1;
                }
            } else {
                int i3 = c0158.f1089;
                if (i3 > (-gridLayoutManager.f814)) {
                    c0158.f1089 = i3 - 1;
                }
            }
        }
        if (this.f813 == 0) {
            i = 4;
            if (m4829() != 1 ? !z : z) {
                i = 3;
            }
        } else {
            i = z ? 2 : 1;
        }
        if (this.f792 == null) {
            this.f792 = (AudioManager) this.f801.getContext().getSystemService("audio");
        }
        this.f792.playSoundEffect(i);
    }

    /* renamed from: ˎי, reason: contains not printable characters */
    public final void m816() {
        ArrayList arrayList = this.f809;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        int i = this.f791;
        View viewMo1262 = i == -1 ? null : mo1262(i);
        if (viewMo1262 != null) {
            AbstractC1375 abstractC1375M1331 = this.f801.m1331(viewMo1262);
            int i2 = this.f791;
            ArrayList arrayList2 = this.f809;
            if (arrayList2 == null) {
                return;
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((AbstractC0141) this.f809.get(size)).mo898(abstractC1375M1331, i2);
            }
            return;
        }
        InterfaceC0184 interfaceC0184 = this.f800;
        if (interfaceC0184 != null) {
            interfaceC0184.mo981(null, -1);
        }
        ArrayList arrayList3 = this.f809;
        if (arrayList3 == null) {
            return;
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ((AbstractC0141) this.f809.get(size2)).mo898(null, -1);
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public final void mo817(int i, int i2) {
        int i3;
        int i4 = i2 + i;
        while (i < i4) {
            C0137 c0137 = this.f785;
            C1424 c1424 = (C1424) c0137.f1033;
            if (c1424 != null) {
                synchronized (((ٴᐧ.ᐧⁱ) c1424.f5802)) {
                    i3 = c1424.f5799;
                }
                if (i3 != 0) {
                    ((C1424) c0137.f1033).m4934(Integer.toString(i));
                }
            }
            i++;
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void mo818(C1429 c1429) {
        for (int iM4846 = m4846() - 1; iM4846 >= 0; iM4846--) {
            m4828(iM4846, c1429);
        }
    }

    /* renamed from: ˏʻ, reason: contains not printable characters */
    public final void m819() {
        int i = this.f789 - 1;
        this.f789 = i;
        if (i == 0) {
            this.f810 = null;
            this.f797 = null;
            this.f825 = 0;
            this.f824 = 0;
        }
    }

    /* renamed from: ˑˉ, reason: contains not printable characters */
    public final int m820(int i, boolean z) {
        ˉⁱ r0;
        AbstractC0154 abstractC0154 = this.f798;
        if (abstractC0154 == null) {
            return i;
        }
        int i2 = this.f791;
        int i3 = (i2 == -1 || (r0 = abstractC0154.mo919(i2)) == null) ? -1 : r0.ᐧⁱ;
        int iM4846 = m4846();
        View view = null;
        for (int i4 = 0; i4 < iM4846 && i != 0; i4++) {
            int i5 = i > 0 ? i4 : (iM4846 - 1) - i4;
            View viewM4847 = m4847(i5);
            if (viewM4847.getVisibility() == 0 && (!m4842() || viewM4847.hasFocusable())) {
                int iM785 = m785(m4847(i5));
                ˉⁱ r9 = this.f798.mo919(iM785);
                int i6 = r9 == null ? -1 : r9.ᐧⁱ;
                if (i3 == -1) {
                    i2 = iM785;
                    view = viewM4847;
                    i3 = i6;
                } else if (i6 == i3 && ((i > 0 && iM785 > i2) || (i < 0 && iM785 < i2))) {
                    i = i > 0 ? i - 1 : i + 1;
                    i2 = iM785;
                    view = viewM4847;
                }
            }
        }
        if (view != null) {
            if (z) {
                if (m4842()) {
                    this.f790 |= 32;
                    view.requestFocus();
                    this.f790 &= -33;
                }
                this.f791 = i2;
                this.f818 = 0;
            } else {
                m825(view, true);
            }
        }
        return i;
    }

    /* renamed from: ˑˏ, reason: contains not printable characters */
    public final void m821() {
        if (m4846() <= 0) {
            this.f825 = 0;
        } else {
            this.f825 = this.f798.f1083 - ((C0187) m4847(0).getLayoutParams()).f5702.m4783();
        }
    }

    /* renamed from: יʾ, reason: contains not printable characters */
    public final void m822(View view, int i, int i2, int i3, int i4) {
        int iM854;
        int i5;
        int iM786 = this.f813 == 0 ? m786(view) : m787(view);
        int i6 = this.f805;
        if (i6 > 0) {
            iM786 = Math.min(iM786, i6);
        }
        int i7 = this.f815;
        int i8 = i7 & 112;
        int absoluteGravity = (this.f790 & 786432) != 0 ? Gravity.getAbsoluteGravity(i7 & 8388615, 1) : i7 & 7;
        int i9 = this.f813;
        if ((i9 != 0 || i8 != 48) && (i9 != 1 || absoluteGravity != 3)) {
            if ((i9 == 0 && i8 == 80) || (i9 == 1 && absoluteGravity == 5)) {
                iM854 = m854(i) - iM786;
            } else if ((i9 == 0 && i8 == 16) || (i9 == 1 && absoluteGravity == 1)) {
                iM854 = (m854(i) - iM786) / 2;
            }
            i4 += iM854;
        }
        if (this.f813 == 0) {
            i5 = iM786 + i4;
        } else {
            int i10 = iM786 + i4;
            int i11 = i4;
            i4 = i2;
            i2 = i11;
            i5 = i3;
            i3 = i10;
        }
        C0187 c0187 = (C0187) view.getLayoutParams();
        AbstractC1402.m4819(view, i2, i4, i3, i5);
        Rect rect = f782;
        super.mo834(view, rect);
        int i12 = i2 - rect.left;
        int i13 = i4 - rect.top;
        int i14 = rect.right - i3;
        int i15 = rect.bottom - i5;
        c0187.f1160 = i12;
        c0187.f1165 = i13;
        c0187.f1166 = i14;
        c0187.f1164 = i15;
        m824(view);
    }

    @Override // p061.AbstractC1402
    /* renamed from: יᴵ, reason: contains not printable characters */
    public final void mo823(C1425 c1425) {
        AbstractC0167 abstractC0167 = this.f823;
        if (abstractC0167 != null) {
            abstractC0167.f1125 = true;
        }
        super.mo823(c1425);
        if (!c1425.f5805 || !(c1425 instanceof AbstractC0167)) {
            this.f823 = null;
            this.f796 = null;
            return;
        }
        AbstractC0167 abstractC01672 = (AbstractC0167) c1425;
        this.f823 = abstractC01672;
        if (abstractC01672 instanceof C0158) {
            this.f796 = (C0158) abstractC01672;
        } else {
            this.f796 = null;
        }
    }

    /* renamed from: יᵎ, reason: contains not printable characters */
    public final void m824(View view) {
        C0187 c0187 = (C0187) view.getLayoutParams();
        ʾי.ˑʽ r1 = c0187.f1162;
        C3222 c3222 = this.f794;
        if (r1 == null) {
            C0190 c0190 = (C0190) c3222.f12539;
            c0187.f1167 = AbstractC0204.m996(view, c0190, c0190.f1173);
            C0190 c01902 = (C0190) c3222.f12538;
            c0187.f1161 = AbstractC0204.m996(view, c01902, c01902.f1173);
            return;
        }
        int i = this.f813;
        C0189[] c0189Arr = (C0189[]) r1.ˆʿ;
        int[] iArr = c0187.f1163;
        if (iArr == null || iArr.length != c0189Arr.length) {
            c0187.f1163 = new int[c0189Arr.length];
        }
        for (int i2 = 0; i2 < c0189Arr.length; i2++) {
            c0187.f1163[i2] = AbstractC0204.m996(view, c0189Arr[i2], i);
        }
        if (i == 0) {
            c0187.f1167 = c0187.f1163[0];
        } else {
            c0187.f1161 = c0187.f1163[0];
        }
        if (this.f813 == 0) {
            C0190 c01903 = (C0190) c3222.f12538;
            c0187.f1161 = AbstractC0204.m996(view, c01903, c01903.f1173);
        } else {
            C0190 c01904 = (C0190) c3222.f12539;
            c0187.f1167 = AbstractC0204.m996(view, c01904, c01904.f1173);
        }
    }

    /* renamed from: יᵔ, reason: contains not printable characters */
    public final void m825(View view, boolean z) {
        m811(view, view.findFocus(), z, 0, 0);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void mo826() {
        this.f808 = 0;
        C1424 c1424 = (C1424) this.f785.f1033;
        if (c1424 != null) {
            c1424.m4936(-1);
        }
    }

    /* renamed from: ـᵢ, reason: contains not printable characters */
    public final boolean m827(boolean z) {
        if (this.f805 != 0 || this.f804 == null) {
            return false;
        }
        AbstractC0154 abstractC0154 = this.f798;
        C1423[] c1423ArrMo914 = abstractC0154 == null ? null : abstractC0154.mo914(abstractC0154.f1083, abstractC0154.f1084);
        boolean z2 = false;
        int i = -1;
        for (int i2 = 0; i2 < this.f826; i2++) {
            C1423 c1423 = c1423ArrMo914 == null ? null : c1423ArrMo914[i2];
            int iM4926 = c1423 == null ? 0 : c1423.m4926();
            int i3 = -1;
            for (int i4 = 0; i4 < iM4926; i4 += 2) {
                int iM4929 = c1423.m4929(i4 + 1);
                for (int iM49292 = c1423.m4929(i4); iM49292 <= iM4929; iM49292++) {
                    View viewMo1262 = mo1262(iM49292 - this.f825);
                    if (viewMo1262 != null) {
                        if (z) {
                            m790(viewMo1262);
                        }
                        int iM786 = this.f813 == 0 ? m786(viewMo1262) : m787(viewMo1262);
                        if (iM786 > i3) {
                            i3 = iM786;
                        }
                    }
                }
            }
            int iM4948 = this.f797.m4948();
            if (!this.f801.f1720 && z && i3 < 0 && iM4948 > 0) {
                if (i < 0) {
                    int i5 = this.f791;
                    if (i5 < 0) {
                        i5 = 0;
                    } else if (i5 >= iM4948) {
                        i5 = iM4948 - 1;
                    }
                    if (m4846() > 0) {
                        int iM4783 = this.f801.m1331(m4847(0)).m4783();
                        int iM47832 = this.f801.m1331(m4847(m4846() - 1)).m4783();
                        if (i5 >= iM4783 && i5 <= iM47832) {
                            i5 = i5 - iM4783 <= iM47832 - i5 ? iM4783 - 1 : iM47832 + 1;
                            if (i5 < 0 && iM47832 < iM4948 - 1) {
                                i5 = iM47832 + 1;
                            } else if (i5 >= iM4948 && iM4783 > 0) {
                                i5 = iM4783 - 1;
                            }
                        }
                    }
                    if (i5 >= 0 && i5 < iM4948) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        View viewM4969 = this.f810.m4969(i5);
                        int[] iArr = this.f807;
                        if (viewM4969 != null) {
                            C0187 c0187 = (C0187) viewM4969.getLayoutParams();
                            Rect rect = f782;
                            m4843(viewM4969, rect);
                            viewM4969.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, m4848() + m4835() + ((ViewGroup.MarginLayoutParams) c0187).leftMargin + ((ViewGroup.MarginLayoutParams) c0187).rightMargin + rect.left + rect.right, ((ViewGroup.MarginLayoutParams) c0187).width), ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, m4833() + m4824() + ((ViewGroup.MarginLayoutParams) c0187).topMargin + ((ViewGroup.MarginLayoutParams) c0187).bottomMargin + rect.top + rect.bottom, ((ViewGroup.MarginLayoutParams) c0187).height));
                            iArr[0] = m787(viewM4969);
                            iArr[1] = m786(viewM4969);
                            this.f810.m4970(viewM4969);
                        }
                        i = this.f813 == 0 ? iArr[1] : iArr[0];
                    }
                }
                if (i >= 0) {
                    i3 = i;
                }
            }
            if (i3 < 0) {
                i3 = 0;
            }
            int[] iArr2 = this.f804;
            if (iArr2[i2] != i3) {
                iArr2[i2] = i3;
                z2 = true;
            }
        }
        return z2;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean mo828() {
        return this.f813 == 1 || this.f826 > 1;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final View mo829(View view, int i) {
        View viewFindNextFocus;
        View viewFindNextFocus2;
        if ((this.f790 & 32768) != 0) {
            return view;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (i == 2 || i == 1) {
            if (mo828()) {
                viewFindNextFocus = focusFinder.findNextFocus(this.f801, view, i == 2 ? 130 : 33);
            } else {
                viewFindNextFocus = null;
            }
            if (mo797()) {
                viewFindNextFocus2 = focusFinder.findNextFocus(this.f801, view, (m4829() == 1) ^ (i == 2) ? 66 : 17);
            } else {
                viewFindNextFocus2 = viewFindNextFocus;
            }
        } else {
            viewFindNextFocus2 = focusFinder.findNextFocus(this.f801, view, i);
        }
        if (viewFindNextFocus2 != null) {
            return viewFindNextFocus2;
        }
        if (this.f801.getDescendantFocusability() == 393216) {
            return this.f801.getParent().focusSearch(view, i);
        }
        int iM803 = m803(i);
        boolean z = this.f801.getScrollState() != 0;
        if (iM803 == 1) {
            if (z || (this.f790 & 4096) == 0) {
                viewFindNextFocus2 = view;
            }
            if ((this.f790 & 131072) != 0 && !m849()) {
                m815(true);
                viewFindNextFocus2 = view;
            }
        } else if (iM803 == 0) {
            if (z || (this.f790 & 2048) == 0) {
                viewFindNextFocus2 = view;
            }
            if ((this.f790 & 131072) != 0 && !m808()) {
                m815(false);
                viewFindNextFocus2 = view;
            }
        } else if (iM803 == 3) {
        }
        if (viewFindNextFocus2 != null) {
            return viewFindNextFocus2;
        }
        View viewFocusSearch = this.f801.getParent().focusSearch(view, i);
        return viewFocusSearch != null ? viewFocusSearch : view != null ? view : this.f801;
    }

    /* renamed from: ٴᵔ, reason: contains not printable characters */
    public final View m830(int i) {
        ʾי.ˑʽ r1;
        View viewM4969 = this.f810.m4969(i);
        C0187 c0187 = (C0187) viewM4969.getLayoutParams();
        Object objM1331 = this.f801.m1331(viewM4969);
        if (objM1331 instanceof InterfaceC0162) {
            ((C0193) ((InterfaceC0162) objM1331)).getClass();
            r1 = C0159.f1090;
        } else {
            r1 = null;
        }
        c0187.f1162 = r1;
        return viewM4969;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void mo831(int i, int i2) {
        AbstractC0154 abstractC0154;
        int i3;
        int i4 = this.f791;
        if (i4 != -1 && (abstractC0154 = this.f798) != null && abstractC0154.f1083 >= 0 && (i3 = this.f808) != Integer.MIN_VALUE && i <= i4 + i3) {
            this.f808 = i3 + i2;
        }
        C1424 c1424 = (C1424) this.f785.f1033;
        if (c1424 != null) {
            c1424.m4936(-1);
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean mo832(C1398 c1398) {
        return c1398 instanceof C0187;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public final boolean mo833(RecyclerView recyclerView, View view, View view2) {
        if ((this.f790 & 32768) == 0 && m785(view) != -1 && (this.f790 & 35) == 0) {
            m811(view, view2, true, 0, 0);
        }
        return true;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void mo834(View view, Rect rect) {
        super.mo834(view, rect);
        C0187 c0187 = (C0187) view.getLayoutParams();
        rect.left += c0187.f1160;
        rect.top += c0187.f1165;
        rect.right -= c0187.f1166;
        rect.bottom -= c0187.f1164;
    }

    /* renamed from: ᴵˊ, reason: contains not printable characters */
    public final void m835(C1429 c1429, C1426 c1426) {
        int i = this.f789;
        if (i == 0) {
            this.f810 = c1429;
            this.f797 = c1426;
            this.f825 = 0;
            this.f824 = 0;
        }
        this.f789 = i + 1;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final void mo836(AbstractC1373 abstractC1373) {
        if (abstractC1373 != null) {
            this.f798 = null;
            this.f804 = null;
            this.f790 &= -1025;
            this.f791 = -1;
            this.f808 = 0;
            C1424 c1424 = (C1424) this.f785.f1033;
            if (c1424 != null) {
                c1424.m4936(-1);
            }
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public final void mo837(int i, int i2) {
        AbstractC0154 abstractC0154;
        int i3;
        int i4;
        int i5 = this.f791;
        if (i5 != -1 && (abstractC0154 = this.f798) != null && abstractC0154.f1083 >= 0 && (i3 = this.f808) != Integer.MIN_VALUE && i <= (i4 = i5 + i3)) {
            if (i + i2 > i4) {
                this.f791 = (i - i4) + i3 + i5;
                this.f808 = Integer.MIN_VALUE;
            } else {
                this.f808 = i3 - i2;
            }
        }
        C1424 c1424 = (C1424) this.f785.f1033;
        if (c1424 != null) {
            c1424.m4936(-1);
        }
    }

    /* renamed from: ᵎˑ, reason: contains not printable characters */
    public final void m838() {
        int i = (this.f790 & (-1025)) | (m827(false) ? 1024 : 0);
        this.f790 = i;
        if ((i & 1024) != 0) {
            AbstractC0164 abstractC0164 = this.f801;
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            abstractC0164.postOnAnimation(this.f793);
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final void mo839(int i, int i2) {
        int i3;
        int i4 = this.f791;
        if (i4 != -1 && (i3 = this.f808) != Integer.MIN_VALUE) {
            int i5 = i4 + i3;
            if (i <= i5 && i5 < i + 1) {
                this.f808 = (i2 - i) + i3;
            } else if (i < i5 && i2 > i5 - 1) {
                this.f808 = i3 - 1;
            } else if (i > i5 && i2 < i5) {
                this.f808 = i3 + 1;
            }
        }
        C1424 c1424 = (C1424) this.f785.f1033;
        if (c1424 != null) {
            c1424.m4936(-1);
        }
    }

    /* renamed from: ᵔˊ, reason: contains not printable characters */
    public final void m840() {
        int i;
        int i2;
        int iM4948;
        int i3;
        int i4;
        int i5;
        int top;
        int i6;
        int top2;
        int i7;
        if (this.f797.m4948() == 0) {
            return;
        }
        if ((this.f790 & 262144) == 0) {
            i3 = this.f798.f1084;
            int iM49482 = this.f797.m4948() - 1;
            i = this.f798.f1083;
            i2 = iM49482;
            iM4948 = 0;
        } else {
            AbstractC0154 abstractC0154 = this.f798;
            int i8 = abstractC0154.f1083;
            i = abstractC0154.f1084;
            i2 = 0;
            iM4948 = this.f797.m4948() - 1;
            i3 = i8;
        }
        if (i3 < 0 || i < 0) {
            return;
        }
        boolean z = i3 == i2;
        boolean z2 = i == iM4948;
        int iM942 = Integer.MIN_VALUE;
        int iM939 = Integer.MAX_VALUE;
        ﹶˋ.ـﹶ r6 = this.f788;
        if (!z) {
            C0149 c0149 = (C0149) r6.ᐧˋ;
            if (c0149.f1059 == Integer.MAX_VALUE && !z2 && c0149.f1052 == Integer.MIN_VALUE) {
                return;
            }
        }
        int[] iArr = f783;
        if (z) {
            iM939 = this.f798.m939(true, iArr);
            View viewMo1262 = mo1262(iArr[1]);
            if (this.f813 == 0) {
                C0187 c0187 = (C0187) viewMo1262.getLayoutParams();
                c0187.getClass();
                top2 = viewMo1262.getLeft() + c0187.f1160;
                i7 = c0187.f1167;
            } else {
                C0187 c01872 = (C0187) viewMo1262.getLayoutParams();
                c01872.getClass();
                top2 = viewMo1262.getTop() + c01872.f1165;
                i7 = c01872.f1161;
            }
            int i9 = top2 + i7;
            int[] iArr2 = ((C0187) viewMo1262.getLayoutParams()).f1163;
            i4 = (iArr2 == null || iArr2.length <= 0) ? i9 : (iArr2[iArr2.length - 1] - iArr2[0]) + i9;
        } else {
            i4 = Integer.MAX_VALUE;
        }
        if (z2) {
            iM942 = this.f798.m942(false, iArr);
            View viewMo12622 = mo1262(iArr[1]);
            if (this.f813 == 0) {
                C0187 c01873 = (C0187) viewMo12622.getLayoutParams();
                c01873.getClass();
                top = viewMo12622.getLeft() + c01873.f1160;
                i6 = c01873.f1167;
            } else {
                C0187 c01874 = (C0187) viewMo12622.getLayoutParams();
                c01874.getClass();
                top = viewMo12622.getTop() + c01874.f1165;
                i6 = c01874.f1161;
            }
            i5 = top + i6;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        ((C0149) r6.ᐧˋ).m910(iM942, iM939, i5, i4);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public final int mo841(int i, C1429 c1429, C1426 c1426) {
        if ((this.f790 & 512) == 0 || this.f798 == null) {
            return 0;
        }
        m835(c1429, c1426);
        this.f790 = (this.f790 & (-4)) | 2;
        int iM804 = this.f813 == 0 ? m804(i) : m862(i);
        m819();
        this.f790 &= -4;
        return iM804;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int mo842(View view) {
        return super.mo842(view) + ((C0187) view.getLayoutParams()).f1165;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final int mo843(int i, C1429 c1429, C1426 c1426) {
        int i2 = this.f790;
        if ((i2 & 512) == 0 || this.f798 == null) {
            return 0;
        }
        this.f790 = (i2 & (-4)) | 2;
        m835(c1429, c1426);
        int iM804 = this.f813 == 1 ? m804(i) : m862(i);
        m819();
        this.f790 &= -4;
        return iM804;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public final void mo844(RecyclerView recyclerView, int i) {
        m860(i, true);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final int mo845(C1429 c1429, C1426 c1426) {
        AbstractC0154 abstractC0154;
        if (this.f813 != 0 || (abstractC0154 = this.f798) == null) {
            return -1;
        }
        return abstractC0154.f1079;
    }

    /* renamed from: ᵢᴵ, reason: contains not printable characters */
    public final void m846() {
        this.f798.mo917((this.f790 & 262144) != 0 ? this.f820 + this.f799 + this.f824 : (-this.f799) - this.f824, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    @Override // p061.AbstractC1402
    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo847(int r7, p061.C1429 r8, p061.C1426 r9) {
        /*
            r6 = this;
            int r0 = r6.f790
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            r1 = 1
            if (r0 == 0) goto L8e
            r6.m835(r8, r9)
            int r8 = r6.f790
            r0 = 262144(0x40000, float:3.67342E-40)
            r8 = r8 & r0
            r0 = 0
            if (r8 == 0) goto L15
            r8 = 1
            goto L16
        L15:
            r8 = 0
        L16:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            r4 = 8192(0x2000, float:1.148E-41)
            r5 = 4096(0x1000, float:5.74E-42)
            if (r2 < r3) goto L4f
            int r2 = r6.f813
            if (r2 != 0) goto L3a
            ˎᵔ.ʽᐧ r2 = p204.C2772.f10830
            int r2 = r2.m7047()
            if (r7 != r2) goto L2f
            if (r8 == 0) goto L42
            goto L4d
        L2f:
            ˎᵔ.ʽᐧ r2 = p204.C2772.f10836
            int r2 = r2.m7047()
            if (r7 != r2) goto L4f
            if (r8 == 0) goto L4d
            goto L42
        L3a:
            ˎᵔ.ʽᐧ r8 = p204.C2772.f10832
            int r8 = r8.m7047()
            if (r7 != r8) goto L45
        L42:
            r7 = 8192(0x2000, float:1.148E-41)
            goto L4f
        L45:
            ˎᵔ.ʽᐧ r8 = p204.C2772.f10831
            int r8 = r8.m7047()
            if (r7 != r8) goto L4f
        L4d:
            r7 = 4096(0x1000, float:5.74E-42)
        L4f:
            int r8 = r6.f791
            if (r8 != 0) goto L57
            if (r7 != r4) goto L57
            r2 = 1
            goto L58
        L57:
            r2 = 0
        L58:
            int r9 = r9.m4948()
            int r9 = r9 - r1
            if (r8 != r9) goto L63
            if (r7 != r5) goto L63
            r8 = 1
            goto L64
        L63:
            r8 = 0
        L64:
            if (r2 != 0) goto L7d
            if (r8 == 0) goto L69
            goto L7d
        L69:
            if (r7 == r5) goto L76
            if (r7 == r4) goto L6e
            goto L8b
        L6e:
            r6.m815(r0)
            r7 = -1
            r6.m820(r7, r0)
            goto L8b
        L76:
            r6.m815(r1)
            r6.m820(r1, r0)
            goto L8b
        L7d:
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r5)
            androidx.leanback.widget.ˏᵢ r8 = r6.f801
            r8.onInitializeAccessibilityEvent(r7)
            androidx.leanback.widget.ˏᵢ r8 = r6.f801
            r8.requestSendAccessibilityEvent(r8, r7)
        L8b:
            r6.m819()
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.mo847(int, ʾـ.ⁱⁱ, ʾـ.ᵢᵢ):boolean");
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final void mo848(int i) {
        m860(i, false);
    }

    /* renamed from: ⁱˏ, reason: contains not printable characters */
    public final boolean m849() {
        int iM4844 = m4844();
        return iM4844 == 0 || this.f801.m1326(iM4844 - 1) != null;
    }

    /* renamed from: ⁱᵎ, reason: contains not printable characters */
    public final void m850(int i, boolean z, int i2) {
        C1425 c1425;
        View viewMo1262 = mo1262(i);
        boolean zM4840 = m4840();
        if (!zM4840 && !this.f801.isLayoutRequested() && viewMo1262 != null && m785(viewMo1262) == i) {
            this.f790 |= 32;
            m825(viewMo1262, z);
            this.f790 &= -33;
            return;
        }
        int i3 = this.f790;
        if ((i3 & 512) == 0 || (i3 & 64) != 0) {
            this.f791 = i;
            this.f818 = i2;
            this.f808 = Integer.MIN_VALUE;
            return;
        }
        if (z && !this.f801.isLayoutRequested()) {
            this.f791 = i;
            this.f818 = i2;
            this.f808 = Integer.MIN_VALUE;
            if (this.f798 == null) {
                String str = "GridLayoutManager:" + this.f801.getId();
                return;
            }
            C0163 c0163 = new C0163(this);
            c0163.f5814 = i;
            mo823(c0163);
            int i4 = c0163.f5814;
            if (i4 != this.f791) {
                this.f791 = i4;
                this.f818 = 0;
                return;
            }
            return;
        }
        if (zM4840) {
            AbstractC0167 abstractC0167 = this.f823;
            if (abstractC0167 != null) {
                abstractC0167.f1125 = true;
            }
            AbstractC0164 abstractC0164 = this.f801;
            abstractC0164.setScrollState(0);
            RunnableC1362 runnableC1362 = abstractC0164.f1654;
            runnableC1362.f5526.removeCallbacks(runnableC1362);
            runnableC1362.f5522.abortAnimation();
            AbstractC1402 abstractC1402 = abstractC0164.f1683;
            if (abstractC1402 != null && (c1425 = abstractC1402.f5718) != null) {
                c1425.m4946();
            }
        }
        if (!this.f801.isLayoutRequested() && viewMo1262 != null && m785(viewMo1262) == i) {
            this.f790 |= 32;
            m825(viewMo1262, z);
            this.f790 &= -33;
        } else {
            this.f791 = i;
            this.f818 = i2;
            this.f808 = Integer.MIN_VALUE;
            this.f790 |= 256;
            m4838();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02c5 A[LOOP:3: B:131:0x02c3->B:132:0x02c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f8 A[LOOP:11: B:141:0x02f8->B:365:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x042c A[LOOP:12: B:184:0x042c->B:366:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0668 A[PHI: r0 r1
  0x0668: PHI (r0v47 int) = (r0v43 int), (r0v50 int) binds: [B:324:0x0666, B:312:0x0637] A[DONT_GENERATE, DONT_INLINE]
  0x0668: PHI (r1v47 int) = (r1v42 int), (r1v51 int) binds: [B:324:0x0666, B:312:0x0637] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p061.AbstractC1402
    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo851(p061.C1429 r25, p061.C1426 r26) {
        /*
            Method dump skipped, instructions count: 1658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.mo851(ʾـ.ⁱⁱ, ʾـ.ᵢᵢ):void");
    }

    /* renamed from: ⁱﹳ, reason: contains not printable characters */
    public final void m852(int i) {
        if (i < 0 && i != -2) {
            throw new IllegalArgumentException(ـˈ.ˉᵎ.ˉⁱ("Invalid row height: ", i));
        }
        this.f787 = i;
    }

    /* renamed from: ⁱﾞ, reason: contains not printable characters */
    public final void m853(int i) {
        if (i == 0 || i == 1) {
            this.f813 = i;
            this.f821 = AbstractC1420.m4913(this, i);
            ﹶˋ.ـﹶ r0 = this.f788;
            r0.getClass();
            C0149 c0149 = (C0149) r0.ˆʿ;
            C0149 c01492 = (C0149) r0.ˎˑ;
            if (i == 0) {
                r0.ᐧˋ = c01492;
                r0.ˆᵔ = c0149;
            } else {
                r0.ᐧˋ = c0149;
                r0.ˆᵔ = c01492;
            }
            C3222 c3222 = this.f794;
            c3222.getClass();
            if (i == 0) {
                c3222.f12540 = (C0190) c3222.f12539;
            } else {
                c3222.f12540 = (C0190) c3222.f12538;
            }
            this.f790 |= 256;
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public final int m854(int i) {
        int i2 = this.f805;
        if (i2 != 0) {
            return i2;
        }
        int[] iArr = this.f804;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    /* renamed from: ﹳˋ, reason: contains not printable characters */
    public final void m855() {
        C0149 c0149 = (C0149) this.f788.ˆᵔ;
        int i = c0149.f1054 - this.f827;
        int iM792 = m792() + i;
        c0149.m910(i, iM792, i, iM792);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final C1398 mo856() {
        return new C0187(-2, -2);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final int mo857(C1429 c1429, C1426 c1426) {
        AbstractC0154 abstractC0154;
        if (this.f813 != 1 || (abstractC0154 = this.f798) == null) {
            return -1;
        }
        return abstractC0154.f1079;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo858(int i, int i2, C1426 c1426, C1423 c1423) {
        try {
            m835(null, c1426);
            if (this.f813 != 0) {
                i = i2;
            }
            if (m4846() != 0 && i != 0) {
                this.f798.mo936(i < 0 ? -this.f799 : this.f820 + this.f799, i, c1423);
                m819();
            }
        } finally {
            m819();
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public final boolean mo859(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return false;
    }

    /* renamed from: ﾞʾ, reason: contains not printable characters */
    public final void m860(int i, boolean z) {
        if ((this.f791 == i || i == -1) && this.f818 == 0) {
            return;
        }
        m850(i, z, 0);
    }

    /* renamed from: ﾞי, reason: contains not printable characters */
    public final boolean m861(int i) {
        AbstractC1375 abstractC1375M1326 = this.f801.m1326(i);
        if (abstractC1375M1326 == null) {
            return false;
        }
        View view = abstractC1375M1326.f5618;
        return view.getLeft() >= 0 && view.getRight() <= this.f801.getWidth() && view.getTop() >= 0 && view.getBottom() <= this.f801.getHeight();
    }

    /* renamed from: ﾞﹳ, reason: contains not printable characters */
    public final int m862(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = -i;
        int iM4846 = m4846();
        if (this.f813 == 0) {
            while (i2 < iM4846) {
                m4847(i2).offsetTopAndBottom(i3);
                i2++;
            }
        } else {
            while (i2 < iM4846) {
                m4847(i2).offsetLeftAndRight(i3);
                i2++;
            }
        }
        this.f827 += i;
        m855();
        this.f801.invalidate();
        return i;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public final void mo863(C1426 c1426) {
    }
}
