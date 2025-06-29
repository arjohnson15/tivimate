package p225;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p182.AbstractC2517;
import p182.C2530;
import p222.C2908;
import p320.InterfaceC3650;
import p320.MenuC3643;
import p331.C3759;
import ﹶˋ.ـﹶ;

/* renamed from: ˏᵢ.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2997 extends AbstractC2517 implements InterfaceC3650 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C3759 f11518;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Context f11519;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final MenuC3643 f11520;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public WeakReference f11521;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C3016 f11522;

    public C2997(C3016 c3016, Context context, C3759 c3759) {
        this.f11522 = c3016;
        this.f11519 = context;
        this.f11518 = c3759;
        MenuC3643 menuC3643 = new MenuC3643(context);
        menuC3643.f13905 = 1;
        this.f11520 = menuC3643;
        menuC3643.f13902 = this;
    }

    @Override // p182.AbstractC2517
    /* renamed from: ʽᐧ */
    public final View mo6640() {
        WeakReference weakReference = this.f11521;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p182.AbstractC2517
    /* renamed from: ʿʼ */
    public final MenuInflater mo6641() {
        return new C2530(this.f11519);
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˉי */
    public final void mo6642(View view) {
        this.f11522.f11596.setCustomView(view);
        this.f11521 = new WeakReference(view);
    }

    @Override // p320.InterfaceC3650
    /* renamed from: ˉⁱ */
    public final void mo6654(MenuC3643 menuC3643) {
        if (this.f11518 == null) {
            return;
        }
        mo6646();
        C2908 c2908 = this.f11522.f11596.f93;
        if (c2908 != null) {
            c2908.m7254();
        }
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˋⁱ */
    public final void mo6643(CharSequence charSequence) {
        this.f11522.f11596.setSubtitle(charSequence);
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˏʾ */
    public final void mo6644(int i) {
        mo6643(this.f11522.f11595.getResources().getString(i));
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˏᴵ */
    public final void mo6645(CharSequence charSequence) {
        this.f11522.f11596.setTitle(charSequence);
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˏᵢ */
    public final void mo6646() {
        if (this.f11522.f11603 != this) {
            return;
        }
        MenuC3643 menuC3643 = this.f11520;
        menuC3643.m8599();
        try {
            this.f11518.m8760(this, menuC3643);
        } finally {
            menuC3643.m8588();
        }
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˑʽ */
    public final MenuC3643 mo6647() {
        return this.f11520;
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˑי */
    public final void mo6648(boolean z) {
        this.f10003 = z;
        this.f11522.f11596.setTitleOptional(z);
    }

    @Override // p182.AbstractC2517
    /* renamed from: ـﹶ */
    public final void mo6649() {
        C3016 c3016 = this.f11522;
        if (c3016.f11603 != this) {
            return;
        }
        if (c3016.f11594) {
            c3016.f11585 = this;
            c3016.f11590 = this.f11518;
        } else {
            this.f11518.m8749(this);
        }
        this.f11518 = null;
        c3016.m7457(false);
        ActionBarContextView actionBarContextView = c3016.f11596;
        if (actionBarContextView.f102 == null) {
            actionBarContextView.m115();
        }
        c3016.f11593.setHideOnContentScrollEnabled(c3016.f11584);
        c3016.f11603 = null;
    }

    @Override // p182.AbstractC2517
    /* renamed from: ٴˎ */
    public final CharSequence mo6650() {
        return this.f11522.f11596.getSubtitle();
    }

    @Override // p182.AbstractC2517
    /* renamed from: ᐧʻ */
    public final CharSequence mo6651() {
        return this.f11522.f11596.getTitle();
    }

    @Override // p182.AbstractC2517
    /* renamed from: ᴵʿ */
    public final void mo6652(int i) {
        mo6645(this.f11522.f11595.getResources().getString(i));
    }

    @Override // p320.InterfaceC3650
    /* renamed from: ﹳﹳ */
    public final boolean mo6655(MenuC3643 menuC3643, MenuItem menuItem) {
        C3759 c3759 = this.f11518;
        if (c3759 != null) {
            return ((ـﹶ) c3759.f14522).ˏᴵ(this, menuItem);
        }
        return false;
    }

    @Override // p182.AbstractC2517
    /* renamed from: ﹶˆ */
    public final boolean mo6653() {
        return this.f11522.f11596.f97;
    }
}
