package p204;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.leanback.widget.ﾞᐧ;
import java.util.List;

/* renamed from: ˎᵔ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2773 extends AccessibilityNodeProvider {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ﾞᐧ f10842;

    public C2773(ﾞᐧ r1) {
        this.f10842 = r1;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C2784 c2784 = this.f10842.ˆᵔ(i);
        if (c2784 == null) {
            return null;
        }
        return c2784.f10848;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f10842.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C2784 c2784 = this.f10842.ᵢʿ(i);
        if (c2784 == null) {
            return null;
        }
        return c2784.f10848;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f10842.ˑﾞ(i, i2, bundle);
    }
}
