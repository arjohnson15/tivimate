package p305;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import p417.AbstractC4753;

/* renamed from: ᐧˆ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class DialogFragmentC3533 extends DialogFragment {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public DialogInterface.OnCancelListener f13665;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public AlertDialog f13666;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public AlertDialog f13667;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13665;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f13667;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f13666 == null) {
            Activity activity = getActivity();
            AbstractC4753.m10683(activity);
            this.f13666 = new AlertDialog.Builder(activity).create();
        }
        return this.f13666;
    }
}
