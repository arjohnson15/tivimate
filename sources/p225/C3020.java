package p225;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: ˏᵢ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3020 extends ArrayAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C3009 f11661;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ AlertController$RecycleListView f11662;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3020(C3009 c3009, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i, R.id.text1, charSequenceArr);
        this.f11661 = c3009;
        this.f11662 = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f11661.f11555;
        if (zArr != null && zArr[i]) {
            this.f11662.setItemChecked(i, true);
        }
        return view2;
    }
}
