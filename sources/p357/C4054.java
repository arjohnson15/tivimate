package p357;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p204.C2784;
import p222.C2900;
import p378.C4332;

/* renamed from: ᵔˎ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4054 extends C4332 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final TextInputLayout f15602;

    public C4054(TextInputLayout textInputLayout) {
        this.f15602 = textInputLayout;
    }

    @Override // p378.C4332
    /* renamed from: ʿʼ */
    public final void mo4882(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4882(view, accessibilityEvent);
        this.f15602.f3424.m9327().mo9316(accessibilityEvent);
    }

    @Override // p378.C4332
    /* renamed from: ﹳﹳ */
    public final void mo2857(View view, C2784 c2784) {
        View.AccessibilityDelegate accessibilityDelegate = this.f16820;
        AccessibilityNodeInfo accessibilityNodeInfo = c2784.f10848;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f15602;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f3437;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        C4068 c4068 = textInputLayout.f3410;
        C2900 c2900 = c4068.f15692;
        if (c2900.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c2900);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(c2900);
            }
        } else if (Build.VERSION.SDK_INT >= 22) {
            accessibilityNodeInfo.setTraversalAfter(c4068.f15697);
        }
        if (!zIsEmpty) {
            c2784.m7062(text);
        } else if (!TextUtils.isEmpty(string)) {
            c2784.m7062(string);
            if (!z && placeholderText != null) {
                c2784.m7062(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c2784.m7062(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                c2784.m7054(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                c2784.m7062(string);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                c2784.m7057(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C2900 c29002 = textInputLayout.f3446.f15663;
        if (c29002 != null) {
            accessibilityNodeInfo.setLabelFor(c29002);
        }
        textInputLayout.f3424.m9327().mo9321(c2784);
    }
}
