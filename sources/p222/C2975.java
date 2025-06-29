package p222;

import android.view.View;
import android.widget.AdapterView;
import p357.C4056;

/* renamed from: ˏᴵ.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2975 implements AdapterView.OnItemClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f11450;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11451;

    public /* synthetic */ C2975(int i, Object obj) {
        this.f11451 = i;
        this.f11450 = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        switch (this.f11451) {
            case 0:
                C2916 c2916 = (C2916) this.f11450;
                c2916.f11299.setSelection(i);
                C2904 c2904 = c2916.f11299;
                if (c2904.getOnItemClickListener() != null) {
                    c2904.performItemClick(view, i, c2916.f11297.getItemId(i));
                }
                c2916.dismiss();
                break;
            default:
                C4056 c4056 = (C4056) this.f11450;
                if (i < 0) {
                    C2959 c2959 = c4056.f15626;
                    item = !c2959.f11410.isShowing() ? null : c2959.f11414.getSelectedItem();
                } else {
                    item = c4056.getAdapter().getItem(i);
                }
                c4056.setText(c4056.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = c4056.getOnItemClickListener();
                C2959 c29592 = c4056.f15626;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = c29592.f11410.isShowing() ? c29592.f11414.getSelectedView() : null;
                        i = !c29592.f11410.isShowing() ? -1 : c29592.f11414.getSelectedItemPosition();
                        j = !c29592.f11410.isShowing() ? Long.MIN_VALUE : c29592.f11414.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c29592.f11414, view, i, j);
                }
                c29592.dismiss();
                break;
        }
    }
}
