package p305;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0116;
import p417.AbstractC4753;

/* renamed from: ᐧˆ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3543 extends DialogInterfaceOnCancelListenerC0116 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public DialogInterface.OnCancelListener f13695;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public AlertDialog f13696;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public AlertDialog f13697;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13695;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116
    /* renamed from: ᵔ */
    public final Dialog mo742(Bundle bundle) {
        AlertDialog alertDialog = this.f13697;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f697 = false;
        if (this.f13696 == null) {
            Context context = getContext();
            AbstractC4753.m10683(context);
            this.f13696 = new AlertDialog.Builder(context).create();
        }
        return this.f13696;
    }
}
