package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import org.lsposed.hiddenapibypass.library.R;
import p061.AbstractC1373;
import p061.AbstractC1375;
import p149.C2285;
import p149.C2311;
import p204.C2784;
import p378.C4332;
import ˊﹶ.ˋˉ;

/* renamed from: com.google.android.material.datepicker.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0686 extends C4332 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ Object f3269;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f3270;

    public /* synthetic */ C0686(int i, Object obj) {
        this.f3270 = i;
        this.f3269 = obj;
    }

    @Override // p378.C4332
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void mo2855(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3270) {
            case 3:
                super.mo2855(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f3269).f3351);
                break;
            default:
                super.mo2855(view, accessibilityEvent);
                break;
        }
    }

    @Override // p378.C4332
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean mo2856(View view, int i, Bundle bundle) {
        switch (this.f3270) {
            case 1:
                return ((C2285) this.f3269).f9061.mo2856(view, i, bundle);
            default:
                return super.mo2856(view, i, bundle);
        }
    }

    @Override // p378.C4332
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo2857(View view, C2784 c2784) {
        View.AccessibilityDelegate accessibilityDelegate = this.f16820;
        Object obj = this.f3269;
        switch (this.f3270) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c2784.f10848);
                C0687 c0687 = (C0687) obj;
                c2784.m7054(c0687.f3271.getVisibility() == 0 ? c0687.getString(R.string._2_res_0x7f13015e) : c0687.getString(R.string._2_res_0x7f13015c));
                break;
            case 1:
                C2285 c2285 = (C2285) obj;
                c2285.f9061.mo2857(view, c2784);
                RecyclerView recyclerView = c2285.f9060;
                recyclerView.getClass();
                AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(view);
                iM4766 = abstractC1375M1270 != null ? abstractC1375M1270.m4766() : -1;
                AbstractC1373 adapter = recyclerView.getAdapter();
                if (adapter instanceof C2311) {
                    ((C2311) adapter).m6361(iM4766);
                    break;
                }
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c2784.f10848);
                int i = MaterialButtonToggleGroup.f3214;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i2 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i2) == view) {
                                iM4766 = i3;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i2) instanceof MaterialButton) && materialButtonToggleGroup.m2836(i2)) {
                                    i3++;
                                }
                                i2++;
                            }
                        }
                    }
                }
                c2784.m7056(ˋˉ.ˎˑ(((MaterialButton) view).f3211, 0, 1, iM4766, 1));
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo = c2784.f10848;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f3350);
                accessibilityNodeInfo.setChecked(checkableImageButton.f3351);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c2784.f10848;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f3363);
                break;
        }
    }
}
