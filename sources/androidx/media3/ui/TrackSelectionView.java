package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.leanback.widget.ViewOnClickListenerC0202;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p166.C2429;
import p166.C2432;
import p166.C2433;
import p272.C3311;
import p272.InterfaceC3333;
import ˏᵢ.ᵢٴ;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public boolean f1509;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final LayoutInflater f1510;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ViewOnClickListenerC0202 f1511;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f1512;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final CheckedTextView f1513;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f1514;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final CheckedTextView f1515;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f1516;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public InterfaceC3333 f1517;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final ArrayList f1518;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final HashMap f1519;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public CheckedTextView[][] f1520;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f1516 = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f1510 = layoutInflaterFrom;
        ViewOnClickListenerC0202 viewOnClickListenerC0202 = new ViewOnClickListenerC0202(7, this);
        this.f1511 = viewOnClickListenerC0202;
        this.f1517 = new ᵢٴ(getResources());
        this.f1518 = new ArrayList();
        this.f1519 = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f1513 = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f1300b8);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC0202);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(org.lsposed.hiddenapibypass.library.R.layout._2_res_0x7f0e0039, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f1515 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f1300b7);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC0202);
        addView(checkedTextView2);
    }

    public boolean getIsDisabled() {
        return this.f1509;
    }

    public Map<C2433, C2432> getOverrides() {
        return this.f1519;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f1512 != z) {
            this.f1512 = z;
            m1162();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f1514 != z) {
            this.f1514 = z;
            if (!z) {
                HashMap map = this.f1519;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f1518;
                    HashMap map2 = new HashMap();
                    for (int i = 0; i < arrayList.size(); i++) {
                        C2432 c2432 = (C2432) map.get(((C2429) arrayList.get(i)).f9651);
                        if (c2432 != null && map2.isEmpty()) {
                            map2.put(c2432.f9695, c2432);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            m1162();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f1513.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC3333 interfaceC3333) {
        interfaceC3333.getClass();
        this.f1517 = interfaceC3333;
        m1162();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m1162() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f1518;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f1515;
        CheckedTextView checkedTextView2 = this.f1513;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f1520 = new CheckedTextView[arrayList.size()][];
        boolean z = this.f1514 && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            C2429 c2429 = (C2429) arrayList.get(i);
            boolean z2 = this.f1512 && c2429.f9653;
            CheckedTextView[][] checkedTextViewArr = this.f1520;
            int i2 = c2429.f9654;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            C3311[] c3311Arr = new C3311[i2];
            for (int i3 = 0; i3 < c2429.f9654; i3++) {
                c3311Arr[i3] = new C3311(c2429, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.f1510;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(org.lsposed.hiddenapibypass.library.R.layout._2_res_0x7f0e0039, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f1516);
                ᵢٴ r11 = this.f1517;
                C3311 c3311 = c3311Arr[i4];
                checkedTextView3.setText(r11.ʿˏ(c3311.f12866.f9651.f9700[c3311.f12865]));
                checkedTextView3.setTag(c3311Arr[i4]);
                if (c2429.m6536(i4)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f1511);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f1520[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        m1163();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m1163() {
        this.f1513.setChecked(this.f1509);
        boolean z = this.f1509;
        HashMap map = this.f1519;
        this.f1515.setChecked(!z && map.size() == 0);
        for (int i = 0; i < this.f1520.length; i++) {
            C2432 c2432 = (C2432) map.get(((C2429) this.f1518.get(i)).f9651);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f1520[i];
                if (i2 < checkedTextViewArr.length) {
                    if (c2432 != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.f1520[i][i2].setChecked(c2432.f9694.contains(Integer.valueOf(((C3311) tag).f12865)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }
}
