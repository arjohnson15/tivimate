package p448;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.leanback.widget.ﾞᐧ;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p204.C2784;
import p255.C3186;
import p378.AbstractC4345;
import p378.C4332;
import ـˊ.ʿʼ;
import ٴᐧ.ᐧⁱ;

/* renamed from: ﾞˎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5181 extends C4332 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public C5183 f19942;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final AccessibilityManager f19946;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Chip f19950;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final Rect f19940 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final ʿʼ f19938 = new ʿʼ(16);

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final ᐧⁱ f19939 = new ᐧⁱ(16);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Rect f19949 = new Rect();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Rect f19941 = new Rect();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Rect f19947 = new Rect();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int[] f19948 = new int[2];

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f19945 = Integer.MIN_VALUE;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f19943 = Integer.MIN_VALUE;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f19944 = Integer.MIN_VALUE;

    public AbstractC5181(Chip chip) {
        if (chip == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f19950 = chip;
        this.f19946 = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // p378.C4332
    /* renamed from: ʽᐧ */
    public final ﾞᐧ mo4881(View view) {
        if (this.f19942 == null) {
            this.f19942 = new C5183(this);
        }
        return this.f19942;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m11557(int i) {
        if (this.f19943 != i) {
            return false;
        }
        this.f19943 = Integer.MIN_VALUE;
        C3186 c3186 = (C3186) this;
        if (i == 1) {
            Chip chip = c3186.f12323;
            chip.f3242 = false;
            chip.refreshDrawableState();
        }
        m11562(i, 8);
        return true;
    }

    /* renamed from: ˉⁱ */
    public abstract void mo7854(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a4  */
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11558(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p448.AbstractC5181.m11558(int, android.graphics.Rect):boolean");
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C2784 m11559(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C2784 c2784 = new C2784(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c2784.m7063("android.view.View");
        Rect rect = f19940;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f19950;
        accessibilityNodeInfoObtain.setParent(chip);
        mo7855(i, c2784);
        if (c2784.m7061() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f19941;
        c2784.m7060(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c2784.f10847 = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f19945 == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c2784.m7059(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c2784.m7059(64);
        }
        boolean z = this.f19943 == i;
        if (z) {
            c2784.m7059(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c2784.m7059(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f19948;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f19949;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c2784.m7060(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f19947;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoObtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c2784;
    }

    /* renamed from: ˏᴵ */
    public abstract void mo7855(int i, C2784 c2784);

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m11560(int i) {
        int i2;
        Chip chip = this.f19950;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f19943) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m11557(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f19943 = i;
        C3186 c3186 = (C3186) this;
        if (i == 1) {
            Chip chip2 = c3186.f12323;
            chip2.f3242 = true;
            chip2.refreshDrawableState();
        }
        m11562(i, 8);
        return true;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C2784 m11561(int i) {
        if (i != -1) {
            return m11559(i);
        }
        Chip chip = this.f19950;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C2784 c2784 = new C2784(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo7854(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c2784.f10848.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c2784;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m11562(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f19946.isEnabled() || (parent = (view = this.f19950).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C2784 c2784M11561 = m11561(i);
            accessibilityEventObtain.getText().add(c2784M11561.m7061());
            AccessibilityNodeInfo accessibilityNodeInfo = c2784M11561.f10848;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }

    @Override // p378.C4332
    /* renamed from: ﹳﹳ */
    public final void mo2857(View view, C2784 c2784) {
        View.AccessibilityDelegate accessibilityDelegate = this.f16820;
        AccessibilityNodeInfo accessibilityNodeInfo = c2784.f10848;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C3186) this).f12323;
        accessibilityNodeInfo.setCheckable(chip.m2852());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c2784.m7063(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            c2784.m7062(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }
}
