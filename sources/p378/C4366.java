package p378;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.leanback.widget.ﾞᐧ;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p171.AbstractC2466;
import p204.C2772;
import p204.C2784;

/* renamed from: ᵢٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4366 extends View.AccessibilityDelegate {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4332 f16868;

    public C4366(C4332 c4332) {
        this.f16868 = c4332;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f16868.mo4884(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        ﾞᐧ r2 = this.f16868.mo4881(view);
        if (r2 != null) {
            return (AccessibilityNodeProvider) r2.ˆʿ;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f16868.mo2855(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        Object tag3;
        int iKeyAt;
        int i = 1;
        C2784 c2784 = new C2784(accessibilityNodeInfo);
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(AbstractC4350.m9904(view));
        } else {
            tag = view.getTag(R.id._2_res_0x7f0b037d);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z = bool != null && bool.booleanValue();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            c2784.m7057(1, z);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(AbstractC4350.m9902(view));
        } else {
            tag2 = view.getTag(R.id._2_res_0x7f0b0378);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i2 >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            c2784.m7057(2, z2);
        }
        CharSequence charSequenceM9891 = AbstractC4345.m9891(view);
        if (i2 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequenceM9891);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceM9891);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            tag3 = AbstractC4338.m9850(view);
        } else {
            tag3 = view.getTag(R.id._2_res_0x7f0b037e);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (i2 >= 30) {
            AbstractC2466.m6586(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f16868.mo2857(view, c2784);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i2 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id._2_res_0x7f0b0377);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    if (((WeakReference) sparseArray.valueAt(i3)).get() == null) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    sparseArray.remove(((Integer) arrayList.get(i4)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id._2_res_0x7f0b0015);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id._2_res_0x7f0b0377);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id._2_res_0x7f0b0377, sparseArray2);
                }
                for (int i5 = 0; i5 < clickableSpanArr.length; i5++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i5];
                    int i6 = 0;
                    while (true) {
                        if (i6 >= sparseArray2.size()) {
                            iKeyAt = C2784.f10846;
                            C2784.f10846 = iKeyAt + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i6)).get())) {
                                iKeyAt = sparseArray2.keyAt(i6);
                                break;
                            }
                            i6 += i;
                        }
                    }
                    sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i5]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i5];
                    Spanned spanned = (Spanned) text;
                    c2784.m7058("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c2784.m7058("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c2784.m7058("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c2784.m7058("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                    i = 1;
                }
            }
        }
        List listEmptyList = (List) view.getTag(R.id._2_res_0x7f0b0376);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        for (int i7 = 0; i7 < listEmptyList.size(); i7++) {
            c2784.m7051((C2772) listEmptyList.get(i7));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f16868.mo4882(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f16868.mo4885(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f16868.mo2856(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f16868.mo4883(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f16868.mo4886(view, accessibilityEvent);
    }
}
