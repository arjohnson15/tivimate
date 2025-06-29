package p204;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bumptech.glide.ˑʽ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p004.AbstractC0924;
import p171.AbstractC2466;
import ˊﹶ.ˋˉ;

/* renamed from: ˎᵔ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2784 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int f10846;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f10847 = -1;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AccessibilityNodeInfo f10848;

    public C2784(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f10848 = accessibilityNodeInfo;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m7050(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2784)) {
            return false;
        }
        C2784 c2784 = (C2784) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = c2784.f10848;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f10848;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f10847 == c2784.f10847;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10848;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public final String toString() {
        ?? EmptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m7060(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10848;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            AbstractC0924.m3781(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(m7061());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? AbstractC2466.m6584(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; tooltipText: ");
        sb.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? AbstractC2779.m7049(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(i >= 23 ? accessibilityNodeInfo.isContextClickable() : false);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? AbstractC0924.m3785(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(m7052(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(i >= 24 ? accessibilityNodeInfo.isImportantForAccessibility() : true);
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? AbstractC2779.m7048(accessibilityNodeInfo) : m7052(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? AbstractC0924.m3784(accessibilityNodeInfo) : m7052(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            EmptyList = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                EmptyList.add(new C2772(actionList.get(i2), 0, null, null, null));
            }
        } else {
            EmptyList = Collections.emptyList();
        }
        for (int i3 = 0; i3 < EmptyList.size(); i3++) {
            C2772 c2772 = (C2772) EmptyList.get(i3);
            String strM7050 = m7050(c2772.m7047());
            if (strM7050.equals("ACTION_UNKNOWN")) {
                Object obj = c2772.f10840;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    strM7050 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(strM7050);
            if (i3 != EmptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7051(C2772 c2772) {
        this.f10848.addAction((AccessibilityNodeInfo.AccessibilityAction) c2772.f10840);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m7052(int i) {
        Bundle extras = this.f10848.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m7053(ˑʽ r2) {
        this.f10848.setCollectionInfo(null);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m7054(String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10848;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m7055(boolean z) {
        this.f10848.setScrollable(z);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m7056(ˋˉ r2) {
        this.f10848.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) r2.ˆʿ);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m7057(int i, boolean z) {
        Bundle extras = this.f10848.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList m7058(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10848;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7059(int i) {
        this.f10848.addAction(i);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m7060(Rect rect) {
        this.f10848.getBoundsInParent(rect);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final CharSequence m7061() {
        boolean zIsEmpty = m7058("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10848;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListM7058 = m7058("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListM70582 = m7058("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListM70583 = m7058("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListM70584 = m7058("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < arrayListM7058.size(); i++) {
            spannableString.setSpan(new C2780(((Integer) arrayListM70584.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListM7058.get(i)).intValue(), ((Integer) arrayListM70582.get(i)).intValue(), ((Integer) arrayListM70583.get(i)).intValue());
        }
        return spannableString;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m7062(CharSequence charSequence) {
        this.f10848.setText(charSequence);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m7063(CharSequence charSequence) {
        this.f10848.setClassName(charSequence);
    }
}
