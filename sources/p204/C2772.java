package p204;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import p004.AbstractC0924;

/* renamed from: ˎᵔ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2772 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C2772 f10828;

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C2772 f10829;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final C2772 f10830;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final C2772 f10831;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final C2772 f10832;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C2772 f10833;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C2772 f10834;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C2772 f10835;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final C2772 f10836;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C2772 f10837;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f10838;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Class f10839;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f10840;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC2783 f10841;

    static {
        new C2772(1);
        new C2772(2);
        new C2772(4);
        new C2772(8);
        f10828 = new C2772(16);
        new C2772(32);
        new C2772(64);
        new C2772(128);
        new C2772(256, AbstractC2782.class);
        new C2772(512, AbstractC2782.class);
        new C2772(1024, AbstractC2778.class);
        new C2772(2048, AbstractC2778.class);
        f10834 = new C2772(4096);
        f10835 = new C2772(8192);
        new C2772(16384);
        new C2772(32768);
        new C2772(65536);
        new C2772(131072, AbstractC2775.class);
        f10833 = new C2772(262144);
        f10837 = new C2772(524288);
        f10829 = new C2772(1048576);
        new C2772(2097152, AbstractC2776.class);
        int i = Build.VERSION.SDK_INT;
        new C2772(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C2772(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, AbstractC2774.class);
        f10832 = new C2772(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
        f10830 = new C2772(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
        f10831 = new C2772(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
        f10836 = new C2772(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
        new C2772(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C2772(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C2772(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C2772(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C2772(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
        new C2772(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, AbstractC2777.class);
        new C2772(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC2785.class);
        new C2772(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C2772(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C2772(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C2772(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C2772(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C2772(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C2772(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C2772(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C2772(i >= 34 ? AbstractC0924.m3782() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C2772(int i) {
        this(null, i, null, null, null);
    }

    public C2772(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C2772(Object obj, int i, String str, InterfaceC2783 interfaceC2783, Class cls) {
        this.f10838 = i;
        this.f10841 = interfaceC2783;
        if (obj == null) {
            this.f10840 = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.f10840 = obj;
        }
        this.f10839 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2772)) {
            return false;
        }
        Object obj2 = ((C2772) obj).f10840;
        Object obj3 = this.f10840;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f10840;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM7050 = C2784.m7050(this.f10838);
        if (strM7050.equals("ACTION_UNKNOWN")) {
            Object obj = this.f10840;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM7050 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM7050);
        return sb.toString();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m7047() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f10840).getId();
    }
}
