package p225;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: ˏᵢ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3008 implements AdapterView.OnItemClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C3022 f11542;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C3009 f11543;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ AlertController$RecycleListView f11544;

    public C3008(C3009 c3009, AlertController$RecycleListView alertController$RecycleListView, C3022 c3022) {
        this.f11543 = c3009;
        this.f11544 = alertController$RecycleListView;
        this.f11542 = c3022;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C3009 c3009 = this.f11543;
        boolean[] zArr = c3009.f11555;
        AlertController$RecycleListView alertController$RecycleListView = this.f11544;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        c3009.f11562.onClick(this.f11542.f11664, i, alertController$RecycleListView.isItemChecked(i));
    }
}
