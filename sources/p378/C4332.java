package p378;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.leanback.widget.ﾞᐧ;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import org.lsposed.hiddenapibypass.library.R;
import p204.C2772;
import p204.C2784;
import p204.InterfaceC2783;

/* renamed from: ᵢٴ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4332 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final View.AccessibilityDelegate f16818 = new View.AccessibilityDelegate();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4366 f16819;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final View.AccessibilityDelegate f16820;

    public C4332() {
        this(f16818);
    }

    public C4332(View.AccessibilityDelegate accessibilityDelegate) {
        this.f16820 = accessibilityDelegate;
        this.f16819 = new C4366(this);
    }

    /* renamed from: ʽᐧ */
    public ﾞᐧ mo4881(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f16820.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new ﾞᐧ(25, accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: ʿʼ */
    public void mo4882(View view, AccessibilityEvent accessibilityEvent) {
        this.f16820.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: ˏᵢ */
    public void mo4883(View view, int i) {
        this.f16820.sendAccessibilityEvent(view, i);
    }

    /* renamed from: ˑʽ */
    public void mo2855(View view, AccessibilityEvent accessibilityEvent) {
        this.f16820.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: ـﹶ */
    public boolean mo4884(View view, AccessibilityEvent accessibilityEvent) {
        return this.f16820.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: ٴˎ */
    public boolean mo4885(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f16820.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: ᐧʻ */
    public boolean mo2856(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id._2_res_0x7f0b0376);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= listEmptyList.size()) {
                break;
            }
            C2772 c2772 = (C2772) listEmptyList.get(i2);
            if (c2772.m7047() == i) {
                InterfaceC2783 interfaceC2783 = c2772.f10841;
                if (interfaceC2783 != null) {
                    Class cls = c2772.f10839;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName());
                        }
                    }
                    zPerformAccessibilityAction = interfaceC2783.mo4060(view);
                }
            } else {
                i2++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f16820.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id._2_res_0x7f0b0015 || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id._2_res_0x7f0b0377);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
                i4++;
            }
        }
        return z;
    }

    /* renamed from: ﹳﹳ */
    public void mo2857(View view, C2784 c2784) {
        this.f16820.onInitializeAccessibilityNodeInfo(view, c2784.f10848);
    }

    /* renamed from: ﹶˆ */
    public void mo4886(View view, AccessibilityEvent accessibilityEvent) {
        this.f16820.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
