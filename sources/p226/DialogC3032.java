package p226;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0224;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.C0236;
import androidx.lifecycle.EnumC0247;
import androidx.lifecycle.InterfaceC0262;
import androidx.lifecycle.RunnableC0246;
import org.lsposed.hiddenapibypass.library.R;
import p285.C3383;
import p285.C3386;
import p285.InterfaceC3387;
import ˆˑ.ﹳﹳ;

/* renamed from: ˑʽ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class DialogC3032 extends Dialog implements InterfaceC0262, InterfaceC3048, InterfaceC3387 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3386 f11714;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3031 f11715;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C0236 f11716;

    public DialogC3032(Context context, int i) {
        super(context, i);
        this.f11714 = new C3386(this);
        this.f11715 = new C3031(new RunnableC0246(9, this));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7527(DialogC3032 dialogC3032) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m7529();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC0262
    public final AbstractC0233 getLifecycle() {
        return m7528();
    }

    @Override // p226.InterfaceC3048
    public final C3031 getOnBackPressedDispatcher() {
        return this.f11715;
    }

    @Override // p285.InterfaceC3387
    public final C3383 getSavedStateRegistry() {
        return this.f11714.f13227;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f11715.m7526();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C3031 c3031 = this.f11715;
            c3031.f11708 = onBackInvokedDispatcher;
            c3031.m7524(c3031.f11712);
        }
        this.f11714.m8245(bundle);
        m7528().m1034(EnumC0247.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.f11714.m8246(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m7528().m1034(EnumC0247.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m7528().m1034(EnumC0247.ON_DESTROY);
        this.f11716 = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m7529();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m7529();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m7529();
        super.setContentView(view, layoutParams);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0236 m7528() {
        C0236 c0236 = this.f11716;
        if (c0236 != null) {
            return c0236;
        }
        C0236 c02362 = new C0236(this);
        this.f11716 = c02362;
        return c02362;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7529() {
        AbstractC0224.m1025(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id._2_res_0x7f0b0421, this);
        ﹳﹳ.ﹳˑ(getWindow().getDecorView(), this);
    }
}
