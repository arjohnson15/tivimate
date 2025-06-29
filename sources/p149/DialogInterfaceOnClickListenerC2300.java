package p149;

import android.content.DialogInterface;

/* renamed from: ˊʾ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2300 implements DialogInterface.OnClickListener {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C2294 f9085;

    public DialogInterfaceOnClickListenerC2300(C2294 c2294) {
        this.f9085 = c2294;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C2294 c2294 = this.f9085;
        c2294.f9072 = i;
        c2294.f9100 = -1;
        dialogInterface.dismiss();
    }
}
