package p149;

import android.content.DialogInterface;

/* renamed from: ˊʾ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC2286 implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C2292 f9062;

    public DialogInterfaceOnMultiChoiceClickListenerC2286(C2292 c2292) {
        this.f9062 = c2292;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        C2292 c2292 = this.f9062;
        if (z) {
            c2292.f9069 = c2292.f9068.add(c2292.f9070[i].toString()) | c2292.f9069;
        } else {
            c2292.f9069 = c2292.f9068.remove(c2292.f9070[i].toString()) | c2292.f9069;
        }
    }
}
