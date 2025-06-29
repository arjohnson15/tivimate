package androidx.leanback.widget;

import android.view.View;

/* renamed from: androidx.leanback.widget.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0182 implements View.OnClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0159 f1156;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C0193 f1157;

    public ViewOnClickListenerC0182(C0159 c0159, C0193 c0193) {
        this.f1156 = c0159;
        this.f1157 = c0193;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0157 interfaceC0157;
        C0159 c0159 = this.f1156;
        if (c0159.f1106 == null && (interfaceC0157 = ((C0180) c0159.f1091.getAdapter()).f1146) != null) {
            interfaceC0157.mo747(this.f1157.f1184);
        }
    }
}
