package p225;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: ˏᵢ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2985 implements AdapterView.OnItemClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C3009 f11484;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C3022 f11485;

    public C2985(C3009 c3009, C3022 c3022) {
        this.f11484 = c3009;
        this.f11485 = c3022;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C3009 c3009 = this.f11484;
        DialogInterface.OnClickListener onClickListener = c3009.f11559;
        C3022 c3022 = this.f11485;
        onClickListener.onClick(c3022.f11664, i);
        if (c3009.f11550) {
            return;
        }
        c3022.f11664.dismiss();
    }
}
