package androidx.leanback.widget;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import p357.C4061;

/* renamed from: androidx.leanback.widget.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0169 extends View.AccessibilityDelegate {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f1128;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f1129;

    public /* synthetic */ C0169(int i, Object obj) {
        this.f1129 = i;
        this.f1128 = obj;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1129) {
            case 0:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                C0203 c0203 = ((C0193) this.f1128).f1184;
                accessibilityEvent.setChecked(c0203 != null && c0203.m990());
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f1129) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                C0193 c0193 = (C0193) this.f1128;
                C0203 c0203 = c0193.f1184;
                boolean z = false;
                accessibilityNodeInfo.setCheckable((c0203 == null || c0203.f1205 == 0) ? false : true);
                C0203 c02032 = c0193.f1184;
                if (c02032 != null && c02032.m990()) {
                    z = true;
                }
                accessibilityNodeInfo.setChecked(z);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                EditText editText = ((C4061) this.f1128).f15660.getEditText();
                if (editText != null) {
                    accessibilityNodeInfo.setLabeledBy(editText);
                    break;
                }
                break;
        }
    }
}
