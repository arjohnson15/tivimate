package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.RunnableC0183;
import androidx.lifecycle.AbstractC0224;
import org.lsposed.hiddenapibypass.library.R;
import p226.DialogC3032;
import p291.AbstractC3416;
import p291.C3421;
import p291.C3425;
import p291.DialogInterfaceOnCancelListenerC3420;
import p291.DialogInterfaceOnDismissListenerC3430;

/* renamed from: androidx.fragment.app.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0116 extends AbstractComponentCallbacksC0100 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public Dialog f694;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f700;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f701;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Handler f704;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f705;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean f707;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final RunnableC0183 f695 = new RunnableC0183(22, this);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final DialogInterfaceOnCancelListenerC3420 f698 = new DialogInterfaceOnCancelListenerC3420(this);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final DialogInterfaceOnDismissListenerC3430 f703 = new DialogInterfaceOnDismissListenerC3430(this);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f696 = 0;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f706 = 0;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f708 = true;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f697 = true;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f702 = -1;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C3421 f709 = new C3421(this);

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public boolean f699 = false;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final AbstractC3416 createFragmentContainer() {
        return new C3425(this, super.createFragmentContainer());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().m1047(this.f709);
        if (this.f707) {
            return;
        }
        this.f700 = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f704 = new Handler();
        this.f697 = this.mContainerId == 0;
        if (bundle != null) {
            this.f696 = bundle.getInt("android:style", 0);
            this.f706 = bundle.getInt("android:theme", 0);
            this.f708 = bundle.getBoolean("android:cancelable", true);
            this.f697 = bundle.getBoolean("android:showsDialog", this.f697);
            this.f702 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f694;
        if (dialog != null) {
            this.f701 = true;
            dialog.setOnDismissListener(null);
            this.f694.dismiss();
            if (!this.f700) {
                onDismiss(this.f694);
            }
            this.f694 = null;
            this.f699 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onDetach() {
        super.onDetach();
        if (!this.f707 && !this.f700) {
            this.f700 = true;
        }
        getViewLifecycleOwnerLiveData().m1043(this.f709);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f701) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            String str = "onDismiss called for DialogFragment " + this;
        }
        m743(true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0046, B:29:0x0050, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0068), top: B:48:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r0 = super.onGetLayoutInflater(r8)
            boolean r1 = r7.f697
            r2 = 2
            java.lang.String r3 = "FragmentManager"
            if (r1 == 0) goto L98
            boolean r4 = r7.f705
            if (r4 == 0) goto L11
            goto L98
        L11:
            if (r1 != 0) goto L14
            goto L71
        L14:
            boolean r1 = r7.f699
            if (r1 != 0) goto L71
            r1 = 0
            r4 = 1
            r7.f705 = r4     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r8 = r7.mo742(r8)     // Catch: java.lang.Throwable -> L4e
            r7.f694 = r8     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f697     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L68
            int r5 = r7.f696     // Catch: java.lang.Throwable -> L4e
            if (r5 == r4) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r8.getWindow()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4e
        L3b:
            r8.requestWindowFeature(r4)     // Catch: java.lang.Throwable -> L4e
        L3e:
            android.content.Context r8 = r7.getContext()     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r8 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            android.app.Dialog r5 = r7.f694     // Catch: java.lang.Throwable -> L4e
            android.app.Activity r8 = (android.app.Activity) r8     // Catch: java.lang.Throwable -> L4e
            r5.setOwnerActivity(r8)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r8 = move-exception
            goto L6e
        L50:
            android.app.Dialog r8 = r7.f694     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f708     // Catch: java.lang.Throwable -> L4e
            r8.setCancelable(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r8 = r7.f694     // Catch: java.lang.Throwable -> L4e
            ٴᐧ.ˉי r5 = r7.f698     // Catch: java.lang.Throwable -> L4e
            r8.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r8 = r7.f694     // Catch: java.lang.Throwable -> L4e
            ٴᐧ.ˏʾ r5 = r7.f703     // Catch: java.lang.Throwable -> L4e
            r8.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4e
            r7.f699 = r4     // Catch: java.lang.Throwable -> L4e
            goto L6b
        L68:
            r8 = 0
            r7.f694 = r8     // Catch: java.lang.Throwable -> L4e
        L6b:
            r7.f705 = r1
            goto L71
        L6e:
            r7.f705 = r1
            throw r8
        L71:
            boolean r8 = android.util.Log.isLoggable(r3, r2)
            if (r8 == 0) goto L8b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r1 = " from dialog context"
            r8.append(r1)
            java.lang.String r8 = r8.toString()
        L8b:
            android.app.Dialog r8 = r7.f694
            if (r8 == 0) goto L97
            android.content.Context r8 = r8.getContext()
            android.view.LayoutInflater r0 = r0.cloneInContext(r8)
        L97:
            return r0
        L98:
            boolean r8 = android.util.Log.isLoggable(r3, r2)
            if (r8 == 0) goto Lcf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            boolean r1 = r7.f697
            if (r1 != 0) goto Lc0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mShowsDialog = false: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            goto Lcf
        Lc0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mCreatingDialog = true: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
        Lcf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DialogInterfaceOnCancelListenerC0116.onGetLayoutInflater(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f694;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f696;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f706;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f708;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f697;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f702;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f694;
        if (dialog != null) {
            this.f701 = false;
            dialog.show();
            View decorView = this.f694.getWindow().getDecorView();
            AbstractC0224.m1025(decorView, this);
            decorView.setTag(R.id._2_res_0x7f0b0423, this);
            ˆˑ.ﹳﹳ.ﹳˑ(decorView, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f694;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f694 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f694.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f694 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f694.onRestoreInstanceState(bundle2);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m739() {
        m743(true, false);
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public void m740() {
        m739();
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public void m741() {
        m739();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public Dialog mo742(Bundle bundle) {
        if (Log.isLoggable("FragmentManager", 3)) {
            String str = "onCreateDialog called for DialogFragment " + this;
        }
        return new DialogC3032(requireContext(), this.f706);
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final void m743(boolean z, boolean z2) {
        if (this.f700) {
            return;
        }
        this.f700 = true;
        this.f707 = false;
        Dialog dialog = this.f694;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f694.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f704.getLooper()) {
                    onDismiss(this.f694);
                } else {
                    this.f704.post(this.f695);
                }
            }
        }
        this.f701 = true;
        if (this.f702 >= 0) {
            getParentFragmentManager().m683(this.f702, z, 1);
            this.f702 = -1;
            return;
        }
        AbstractC0104 parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        C0105 c0105 = new C0105(parentFragmentManager);
        c0105.f647 = true;
        c0105.m698(this);
        if (z) {
            c0105.m697(true);
        } else {
            c0105.m697(false);
        }
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public void m744() {
        m739();
    }
}
