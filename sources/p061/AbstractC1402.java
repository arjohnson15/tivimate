package p061;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0002;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.leanback.widget.GridLayoutManager;
import androidx.leanback.widget.ﾞᐧ;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.C0559;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p200.C2755;
import p204.C2784;
import p232.AbstractC3076;
import p378.AbstractC4345;
import ʾי.ˑʽ;

/* renamed from: ʾـ.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1402 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public RecyclerView f5717;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C1425 f5718;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f5719;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f5720;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f5721;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f5722;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f5723;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean f5724;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0559 f5725;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C1389 f5726;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f5727;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f5728;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f5729;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C0559 f5730;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f5731;

    public AbstractC1402() {
        ﾞᐧ r0 = new ﾞᐧ(11, this);
        ˑʽ r1 = new ˑʽ(18, this);
        this.f5725 = new C0559((InterfaceC1411) r0);
        this.f5730 = new C0559((InterfaceC1411) r1);
        this.f5727 = false;
        this.f5728 = false;
        this.f5724 = true;
        this.f5731 = true;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static int m4812(View view) {
        Rect rect = ((C1398) view.getLayoutParams()).f5700;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m4813(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static C1401 m4814(Context context, AttributeSet attributeSet, int i, int i2) {
        C1401 c1401 = new C1401();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3076.f11864, i, i2);
        c1401.f5715 = typedArrayObtainStyledAttributes.getInt(0, 1);
        c1401.f5713 = typedArrayObtainStyledAttributes.getInt(10, 1);
        c1401.f5714 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c1401.f5716 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c1401;
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static int m4815(View view) {
        return ((C1398) view.getLayoutParams()).f5702.m4783();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* renamed from: יʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m4816(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1e
            if (r8 < 0) goto L13
        L10:
            r6 = 1073741824(0x40000000, float:2.0)
            goto L32
        L13:
            if (r8 != r1) goto L1b
            if (r6 == r2) goto L23
            if (r6 == 0) goto L1b
            if (r6 == r3) goto L23
        L1b:
            r6 = 0
            r8 = 0
            goto L32
        L1e:
            if (r8 < 0) goto L21
            goto L10
        L21:
            if (r8 != r1) goto L25
        L23:
            r8 = r5
            goto L32
        L25:
            if (r8 != r0) goto L1b
            if (r6 == r2) goto L2f
            if (r6 != r3) goto L2c
            goto L2f
        L2c:
            r8 = r5
            r6 = 0
            goto L32
        L2f:
            r8 = r5
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L32:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p061.AbstractC1402.m4816(boolean, int, int, int, int):int");
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static int m4817(View view) {
        Rect rect = ((C1398) view.getLayoutParams()).f5700;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static boolean m4818(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static void m4819(View view, int i, int i2, int i3, int i4) {
        C1398 c1398 = (C1398) view.getLayoutParams();
        Rect rect = c1398.f5700;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c1398).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c1398).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c1398).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1398).bottomMargin);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m4820(C1429 c1429) {
        ArrayList arrayList;
        int size = c1429.f5850.size();
        int i = size - 1;
        while (true) {
            arrayList = c1429.f5850;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC1375) arrayList.get(i)).f5618;
            AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(view);
            if (!abstractC1375M1270.m4771()) {
                abstractC1375M1270.m4782(false);
                if (abstractC1375M1270.m4770()) {
                    this.f5717.removeDetachedView(view, false);
                }
                AbstractC1371 abstractC1371 = this.f5717.f1682;
                if (abstractC1371 != null) {
                    abstractC1371.mo4751(abstractC1375M1270);
                }
                abstractC1375M1270.m4782(true);
                AbstractC1375 abstractC1375M12702 = RecyclerView.m1270(view);
                abstractC1375M12702.f5614 = null;
                abstractC1375M12702.f5623 = false;
                abstractC1375M12702.f5619 &= -33;
                c1429.m4959(abstractC1375M12702);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c1429.f5846;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f5717.invalidate();
        }
    }

    /* renamed from: ʻʻ */
    public void mo789(C1429 c1429, C1426 c1426, int i, int i2) {
        this.f5717.m1317(i, i2);
    }

    /* renamed from: ʻʿ */
    public boolean mo1234() {
        return false;
    }

    /* renamed from: ʻﹳ */
    public void mo793(C1429 c1429, C1426 c1426, C2784 c2784) {
        if (this.f5717.canScrollVertically(-1) || this.f5717.canScrollHorizontally(-1)) {
            c2784.m7059(8192);
            c2784.m7055(true);
        }
        if (this.f5717.canScrollVertically(1) || this.f5717.canScrollHorizontally(1)) {
            c2784.m7059(4096);
            c2784.m7055(true);
        }
        c2784.f10848.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo845(c1429, c1426), mo857(c1429, c1426), false, 0));
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final void m4821(int i, int i2) {
        int iM4846 = m4846();
        if (iM4846 == 0) {
            this.f5717.m1317(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM4846; i7++) {
            View viewM4847 = m4847(i7);
            Rect rect = this.f5717.f1697;
            mo834(viewM4847, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.f5717.f1697.set(i5, i6, i3, i4);
        mo1223(this.f5717.f1697, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* renamed from: ʼᵎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo2840(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.m4835()
            int r1 = r8.m4824()
            int r2 = r8.f5729
            int r3 = r8.m4848()
            int r2 = r2 - r3
            int r3 = r8.f5723
            int r4 = r8.m4833()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.m4829()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.m4835()
            int r2 = r8.m4824()
            int r3 = r8.f5729
            int r4 = r8.m4848()
            int r3 = r3 - r4
            int r4 = r8.f5723
            int r5 = r8.m4833()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f5717
            android.graphics.Rect r5 = r5.f1697
            r8.mo834(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            goto Lbd
        Lba:
            r9.mo959(r11, r10)
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p061.AbstractC1402.mo2840(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    /* renamed from: ʽˆ */
    public void mo795(C1429 c1429, C1426 c1426, View view, C2784 c2784) {
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m4822(View view, int i, boolean z) {
        AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(view);
        if (z || abstractC1375M1270.m4772()) {
            C2755 c2755 = (C2755) this.f5717.f1717.f14557;
            C1421 c1421M4922 = (C1421) c2755.get(abstractC1375M1270);
            if (c1421M4922 == null) {
                c1421M4922 = C1421.m4922();
                c2755.put(abstractC1375M1270, c1421M4922);
            }
            c1421M4922.f5791 |= 1;
        } else {
            this.f5717.f1717.m8805(abstractC1375M1270);
        }
        C1398 c1398 = (C1398) view.getLayoutParams();
        if (abstractC1375M1270.m4781() || abstractC1375M1270.m4769()) {
            if (abstractC1375M1270.m4769()) {
                abstractC1375M1270.f5614.m4961(abstractC1375M1270);
            } else {
                abstractC1375M1270.f5619 &= -33;
            }
            this.f5726.m4797(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f5717) {
                int iM4800 = this.f5726.m4800(view);
                if (i == -1) {
                    i = this.f5726.m4802();
                }
                if (iM4800 == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f5717.indexOfChild(view));
                    throw new IllegalStateException(AbstractC0002.m37(this.f5717, sb));
                }
                if (iM4800 != i) {
                    AbstractC1402 abstractC1402 = this.f5717.f1683;
                    View viewM4847 = abstractC1402.m4847(iM4800);
                    if (viewM4847 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM4800 + abstractC1402.f5717.toString());
                    }
                    abstractC1402.m4847(iM4800);
                    abstractC1402.f5726.m4790(iM4800);
                    C1398 c13982 = (C1398) viewM4847.getLayoutParams();
                    AbstractC1375 abstractC1375M12702 = RecyclerView.m1270(viewM4847);
                    if (abstractC1375M12702.m4772()) {
                        C2755 c27552 = (C2755) abstractC1402.f5717.f1717.f14557;
                        C1421 c1421M49222 = (C1421) c27552.get(abstractC1375M12702);
                        if (c1421M49222 == null) {
                            c1421M49222 = C1421.m4922();
                            c27552.put(abstractC1375M12702, c1421M49222);
                        }
                        c1421M49222.f5791 = 1 | c1421M49222.f5791;
                    } else {
                        abstractC1402.f5717.f1717.m8805(abstractC1375M12702);
                    }
                    abstractC1402.f5726.m4797(viewM4847, i, c13982, abstractC1375M12702.m4772());
                }
            } else {
                this.f5726.m4789(view, i, false);
                c1398.f5701 = true;
                C1425 c1425 = this.f5718;
                if (c1425 != null && c1425.f5805) {
                    c1425.f5804.getClass();
                    AbstractC1375 abstractC1375M12703 = RecyclerView.m1270(view);
                    if ((abstractC1375M12703 != null ? abstractC1375M12703.m4783() : -1) == c1425.f5814) {
                        c1425.f5815 = view;
                        if (RecyclerView.f1644) {
                        }
                    }
                }
            }
        }
        if (c1398.f5703) {
            if (RecyclerView.f1644) {
                String str = "consuming pending invalidate on child " + c1398.f5702;
            }
            abstractC1375M1270.f5618.invalidate();
            c1398.f5703 = false;
        }
    }

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public final void m4823(View view, C1429 c1429) {
        C1389 c1389 = this.f5726;
        C1366 c1366 = (C1366) c1389.f5666;
        int i = c1389.f5664;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c1389.f5664 = 1;
            c1389.f5669 = view;
            int iIndexOfChild = c1366.f5546.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((C1403) c1389.f5667).m4880(iIndexOfChild)) {
                    c1389.m4795(view);
                }
                c1366.m4741(iIndexOfChild);
            }
            c1389.f5664 = 0;
            c1389.f5669 = null;
            c1429.m4970(view);
        } catch (Throwable th) {
            c1389.f5664 = 0;
            c1389.f5669 = null;
            throw th;
        }
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int m4824() {
        RecyclerView recyclerView = this.f5717;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: ʾˈ */
    public Parcelable mo796() {
        return null;
    }

    /* renamed from: ʿʼ */
    public abstract boolean mo797();

    /* renamed from: ʿˊ */
    public boolean mo799(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        return false;
    }

    /* renamed from: ʿˏ */
    public C1398 mo800(Context context, AttributeSet attributeSet) {
        return new C1398(context, attributeSet);
    }

    /* renamed from: ˆʼ */
    public boolean mo1213() {
        return this instanceof GridLayoutManager;
    }

    /* renamed from: ˆʿ */
    public int mo801(View view) {
        return view.getLeft() - ((C1398) view.getLayoutParams()).f5700.left;
    }

    /* renamed from: ˆᵔ */
    public int mo805(View view) {
        return view.getRight() + ((C1398) view.getLayoutParams()).f5700.right;
    }

    /* renamed from: ˆﾞ */
    public void mo1344(int i) {
    }

    /* renamed from: ˈٴ */
    public int mo807(View view) {
        return view.getBottom() + ((C1398) view.getLayoutParams()).f5700.bottom;
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final void m4825(View view, C2784 c2784) {
        AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(view);
        if (abstractC1375M1270 == null || abstractC1375M1270.m4772() || ((ArrayList) this.f5726.f5665).contains(abstractC1375M1270.f5618)) {
            return;
        }
        RecyclerView recyclerView = this.f5717;
        mo795(recyclerView.f1677, recyclerView.f1705, view, c2784);
    }

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public final boolean m4826(View view, int i, int i2, C1398 c1398) {
        return (this.f5724 && m4818(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c1398).width) && m4818(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c1398).height)) ? false : true;
    }

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public final void m4827(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f5717 = null;
            this.f5726 = null;
            this.f5729 = 0;
            this.f5723 = 0;
        } else {
            this.f5717 = recyclerView;
            this.f5726 = recyclerView.f1709;
            this.f5729 = recyclerView.getWidth();
            this.f5723 = recyclerView.getHeight();
        }
        this.f5720 = 1073741824;
        this.f5721 = 1073741824;
    }

    /* renamed from: ˉי */
    public void mo810(int i, C1423 c1423) {
    }

    /* renamed from: ˉᵎ */
    public void mo2843(RecyclerView recyclerView) {
    }

    /* renamed from: ˉⁱ */
    public int mo1215(C1426 c1426) {
        return 0;
    }

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public final void m4828(int i, C1429 c1429) {
        View viewM4847 = m4847(i);
        m4834(i);
        c1429.m4970(viewM4847);
    }

    /* renamed from: ˊᵔ */
    public void mo1346(int i) {
        RecyclerView recyclerView = this.f5717;
        if (recyclerView != null) {
            int iM4802 = recyclerView.f1709.m4802();
            for (int i2 = 0; i2 < iM4802; i2++) {
                recyclerView.f1709.m4796(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* renamed from: ˊﹶ */
    public void mo812(Parcelable parcelable) {
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int m4829() {
        RecyclerView recyclerView = this.f5717;
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        return recyclerView.getLayoutDirection();
    }

    /* renamed from: ˋˊ */
    public C1398 mo814(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1398 ? new C1398((C1398) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1398((ViewGroup.MarginLayoutParams) layoutParams) : new C1398(layoutParams);
    }

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public final boolean m4830(View view, int i, int i2, C1398 c1398) {
        return (!view.isLayoutRequested() && this.f5724 && m4818(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c1398).width) && m4818(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c1398).height)) ? false : true;
    }

    /* renamed from: ˋⁱ */
    public int mo1217(C1426 c1426) {
        return 0;
    }

    /* renamed from: ˋﾞ */
    public void mo1349(int i) {
        RecyclerView recyclerView = this.f5717;
        if (recyclerView != null) {
            int iM4802 = recyclerView.f1709.m4802();
            for (int i2 = 0; i2 < iM4802; i2++) {
                recyclerView.f1709.m4796(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* renamed from: ˎˉ */
    public View mo1218(View view, int i, C1429 c1429, C1426 c1426) {
        return null;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final View m4831(View view) {
        View viewM1297;
        RecyclerView recyclerView = this.f5717;
        if (recyclerView == null || (viewM1297 = recyclerView.m1297(view)) == null || ((ArrayList) this.f5726.f5665).contains(viewM1297)) {
            return null;
        }
        return viewM1297;
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final void m4832(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C1398) view.getLayoutParams()).f5700;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f5717 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f5717.f1658;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: ˎᵢ */
    public void mo817(int i, int i2) {
    }

    /* renamed from: ˏ */
    public void mo818(C1429 c1429) {
        for (int iM4846 = m4846() - 1; iM4846 >= 0; iM4846--) {
            if (!RecyclerView.m1270(m4847(iM4846)).m4771()) {
                m4828(iM4846, c1429);
            }
        }
    }

    /* renamed from: ˏʾ */
    public int mo1249(C1426 c1426) {
        return 0;
    }

    /* renamed from: ˏᴵ */
    public int mo1219(C1426 c1426) {
        return 0;
    }

    /* renamed from: ˑʽ */
    public void mo1250(String str) {
        RecyclerView recyclerView = this.f5717;
        if (recyclerView != null) {
            recyclerView.m1301(str);
        }
    }

    /* renamed from: ˑʾ */
    public void mo1220(RecyclerView recyclerView, int i, int i2) {
        mo817(i, i2);
    }

    /* renamed from: ˑי */
    public int mo1222(C1426 c1426) {
        return 0;
    }

    /* renamed from: יˆ */
    public boolean mo1254() {
        return false;
    }

    /* renamed from: יˊ */
    public void mo1223(Rect rect, int i, int i2) {
        int iM4848 = m4848() + m4835() + rect.width();
        int iM4833 = m4833() + m4824() + rect.height();
        RecyclerView recyclerView = this.f5717;
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        this.f5717.setMeasuredDimension(m4813(i, iM4848, recyclerView.getMinimumWidth()), m4813(i2, iM4833, this.f5717.getMinimumHeight()));
    }

    /* renamed from: יˋ */
    public void mo1255(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f5717;
        C1429 c1429 = recyclerView.f1677;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f5717.canScrollVertically(-1) && !this.f5717.canScrollHorizontally(-1) && !this.f5717.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC1373 abstractC1373 = this.f5717.f1684;
        if (abstractC1373 != null) {
            accessibilityEvent.setItemCount(abstractC1373.mo974());
        }
    }

    /* renamed from: יᴵ */
    public void mo823(C1425 c1425) {
        C1425 c14252 = this.f5718;
        if (c14252 != null && c1425 != c14252 && c14252.f5805) {
            c14252.m4946();
        }
        this.f5718 = c1425;
        RecyclerView recyclerView = this.f5717;
        RunnableC1362 runnableC1362 = recyclerView.f1654;
        runnableC1362.f5526.removeCallbacks(runnableC1362);
        runnableC1362.f5522.abortAnimation();
        if (c1425.f5811) {
            String str = "An instance of " + c1425.getClass().getSimpleName() + " was started more than once. Each instance of" + c1425.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.";
        }
        c1425.f5804 = recyclerView;
        c1425.f5812 = this;
        int i = c1425.f5814;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1705.f5830 = i;
        c1425.f5805 = true;
        c1425.f5818 = true;
        c1425.f5815 = recyclerView.f1683.mo1262(i);
        c1425.f5804.f1654.m4736();
        c1425.f5811 = true;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final int m4833() {
        RecyclerView recyclerView = this.f5717;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: ـᵎ */
    public void mo826() {
    }

    /* renamed from: ٴˎ */
    public abstract boolean mo828();

    /* renamed from: ٴᐧ */
    public View mo829(View view, int i) {
        return null;
    }

    /* renamed from: ٴﹶ */
    public void mo831(int i, int i2) {
    }

    /* renamed from: ᐧʻ */
    public boolean mo832(C1398 c1398) {
        return c1398 != null;
    }

    /* renamed from: ᐧʼ */
    public boolean mo833(RecyclerView recyclerView, View view, View view2) {
        return m4840() || recyclerView.m1299();
    }

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public final void m4834(int i) {
        if (m4847(i) != null) {
            C1389 c1389 = this.f5726;
            C1366 c1366 = (C1366) c1389.f5666;
            int i2 = c1389.f5664;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iM4791 = c1389.m4791(i);
                View childAt = c1366.f5546.getChildAt(iM4791);
                if (childAt != null) {
                    c1389.f5664 = 1;
                    c1389.f5669 = childAt;
                    if (((C1403) c1389.f5667).m4880(iM4791)) {
                        c1389.m4795(childAt);
                    }
                    c1366.m4741(iM4791);
                }
            } finally {
                c1389.f5664 = 0;
                c1389.f5669 = null;
            }
        }
    }

    /* renamed from: ᐧⁱ */
    public void mo834(View view, Rect rect) {
        boolean z = RecyclerView.f1643;
        C1398 c1398 = (C1398) view.getLayoutParams();
        Rect rect2 = c1398.f5700;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1398).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1398).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1398).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1398).bottomMargin);
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final int m4835() {
        RecyclerView recyclerView = this.f5717;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: ᴵʿ */
    public int mo1260(C1426 c1426) {
        return 0;
    }

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public final void m4836(RecyclerView recyclerView) {
        m4841(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final void m4837(boolean z) {
        if (z != this.f5731) {
            this.f5731 = z;
            this.f5719 = 0;
            RecyclerView recyclerView = this.f5717;
            if (recyclerView != null) {
                recyclerView.f1677.m4968();
            }
        }
    }

    /* renamed from: ᵎʽ */
    public void mo836(AbstractC1373 abstractC1373) {
    }

    /* renamed from: ᵎʾ */
    public void mo837(int i, int i2) {
    }

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public final void m4838() {
        RecyclerView recyclerView = this.f5717;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: ᵎˏ */
    public View mo1262(int i) {
        int iM4846 = m4846();
        for (int i2 = 0; i2 < iM4846; i2++) {
            View viewM4847 = m4847(i2);
            AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(viewM4847);
            if (abstractC1375M1270 != null && abstractC1375M1270.m4783() == i && !abstractC1375M1270.m4771() && (this.f5717.f1705.f5832 || !abstractC1375M1270.m4772())) {
                return viewM4847;
            }
        }
        return null;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m4839(C1429 c1429) {
        for (int iM4846 = m4846() - 1; iM4846 >= 0; iM4846--) {
            m4845(c1429, iM4846, m4847(iM4846));
        }
    }

    /* renamed from: ᵎᵢ */
    public void mo839(int i, int i2) {
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final boolean m4840() {
        C1425 c1425 = this.f5718;
        return c1425 != null && c1425.f5805;
    }

    /* renamed from: ᵔˋ */
    public abstract int mo841(int i, C1429 c1429, C1426 c1426);

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final void m4841(int i, int i2) {
        this.f5729 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f5720 = mode;
        if (mode == 0 && !RecyclerView.f1641) {
            this.f5729 = 0;
        }
        this.f5723 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f5721 = mode2;
        if (mode2 != 0 || RecyclerView.f1641) {
            return;
        }
        this.f5723 = 0;
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final boolean m4842() {
        RecyclerView recyclerView = this.f5717;
        return recyclerView != null && recyclerView.hasFocus();
    }

    /* renamed from: ᵢʿ */
    public int mo842(View view) {
        return view.getTop() - ((C1398) view.getLayoutParams()).f5700.top;
    }

    /* renamed from: ᵢˆ */
    public abstract int mo843(int i, C1429 c1429, C1426 c1426);

    /* renamed from: ᵢˎ */
    public abstract void mo844(RecyclerView recyclerView, int i);

    /* renamed from: ᵢٴ */
    public int mo845(C1429 c1429, C1426 c1426) {
        return -1;
    }

    /* renamed from: ᵢᵢ */
    public boolean mo847(int i, C1429 c1429, C1426 c1426) {
        int iM4824;
        int iM4835;
        if (this.f5717 == null) {
            return false;
        }
        int iHeight = this.f5723;
        int iWidth = this.f5729;
        Rect rect = new Rect();
        if (this.f5717.getMatrix().isIdentity() && this.f5717.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i != 4096) {
            if (i != 8192) {
                iM4824 = 0;
            } else {
                iM4824 = this.f5717.canScrollVertically(-1) ? -((iHeight - m4824()) - m4833()) : 0;
                if (this.f5717.canScrollHorizontally(-1)) {
                    iM4835 = -((iWidth - m4835()) - m4848());
                }
            }
        } else {
            iM4824 = this.f5717.canScrollVertically(1) ? (iHeight - m4824()) - m4833() : 0;
            iM4835 = this.f5717.canScrollHorizontally(1) ? (iWidth - m4835()) - m4848() : 0;
        }
        if (iM4824 == 0 && iM4835 == 0) {
            return false;
        }
        this.f5717.m1300(iM4835, true, iM4824);
        return true;
    }

    /* renamed from: ᵢﹶ */
    public abstract void mo848(int i);

    /* renamed from: ⁱʿ */
    public void mo1265(RecyclerView recyclerView) {
    }

    /* renamed from: ⁱⁱ */
    public abstract void mo851(C1429 c1429, C1426 c1426);

    /* renamed from: ﹳˎ */
    public abstract C1398 mo856();

    /* renamed from: ﹳˑ */
    public int mo857(C1429 c1429, C1426 c1426) {
        return -1;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m4843(View view, Rect rect) {
        RecyclerView recyclerView = this.f5717;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m1305(view));
        }
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int m4844() {
        RecyclerView recyclerView = this.f5717;
        AbstractC1373 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo974();
        }
        return 0;
    }

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public final void m4845(C1429 c1429, int i, View view) {
        AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(view);
        if (abstractC1375M1270.m4771()) {
            if (RecyclerView.f1644) {
                String str = "ignoring view " + abstractC1375M1270;
                return;
            }
            return;
        }
        if (abstractC1375M1270.m4784() && !abstractC1375M1270.m4772() && !this.f5717.f1684.f5596) {
            m4834(i);
            c1429.m4959(abstractC1375M1270);
        } else {
            m4847(i);
            this.f5726.m4790(i);
            c1429.m4962(view);
            this.f5717.f1717.m8805(abstractC1375M1270);
        }
    }

    /* renamed from: ﹶˆ */
    public void mo858(int i, int i2, C1426 c1426, C1423 c1423) {
    }

    /* renamed from: ﹶﾞ */
    public boolean mo859(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return mo2840(recyclerView, view, rect, z, false);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final int m4846() {
        C1389 c1389 = this.f5726;
        if (c1389 != null) {
            return c1389.m4802();
        }
        return 0;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final View m4847(int i) {
        C1389 c1389 = this.f5726;
        if (c1389 != null) {
            return c1389.m4796(i);
        }
        return null;
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final int m4848() {
        RecyclerView recyclerView = this.f5717;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: ﾞﾞ */
    public abstract void mo863(C1426 c1426);
}
