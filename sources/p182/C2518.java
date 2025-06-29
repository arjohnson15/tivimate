package p182;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p222.C2908;
import p320.InterfaceC3650;
import p320.MenuC3643;
import p331.C3759;
import ﹶˋ.ـﹶ;

/* renamed from: ˋⁱ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2518 extends AbstractC2517 implements InterfaceC3650 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C3759 f10005;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public MenuC3643 f10006;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Context f10007;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ActionBarContextView f10008;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public WeakReference f10009;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f10010;

    @Override // p182.AbstractC2517
    /* renamed from: ʽᐧ */
    public final View mo6640() {
        WeakReference weakReference = this.f10009;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p182.AbstractC2517
    /* renamed from: ʿʼ */
    public final MenuInflater mo6641() {
        return new C2530(this.f10008.getContext());
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˉי */
    public final void mo6642(View view) {
        this.f10008.setCustomView(view);
        this.f10009 = view != null ? new WeakReference(view) : null;
    }

    @Override // p320.InterfaceC3650
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void mo6654(MenuC3643 menuC3643) {
        mo6646();
        C2908 c2908 = this.f10008.f93;
        if (c2908 != null) {
            c2908.m7254();
        }
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˋⁱ */
    public final void mo6643(CharSequence charSequence) {
        this.f10008.setSubtitle(charSequence);
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˏʾ */
    public final void mo6644(int i) {
        mo6643(this.f10007.getString(i));
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˏᴵ */
    public final void mo6645(CharSequence charSequence) {
        this.f10008.setTitle(charSequence);
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˏᵢ */
    public final void mo6646() {
        this.f10005.m8760(this, this.f10006);
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˑʽ */
    public final MenuC3643 mo6647() {
        return this.f10006;
    }

    @Override // p182.AbstractC2517
    /* renamed from: ˑי */
    public final void mo6648(boolean z) {
        this.f10003 = z;
        this.f10008.setTitleOptional(z);
    }

    @Override // p182.AbstractC2517
    /* renamed from: ـﹶ */
    public final void mo6649() {
        if (this.f10010) {
            return;
        }
        this.f10010 = true;
        this.f10005.m8749(this);
    }

    @Override // p182.AbstractC2517
    /* renamed from: ٴˎ */
    public final CharSequence mo6650() {
        return this.f10008.getSubtitle();
    }

    @Override // p182.AbstractC2517
    /* renamed from: ᐧʻ */
    public final CharSequence mo6651() {
        return this.f10008.getTitle();
    }

    @Override // p182.AbstractC2517
    /* renamed from: ᴵʿ */
    public final void mo6652(int i) {
        mo6645(this.f10007.getString(i));
    }

    @Override // p320.InterfaceC3650
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean mo6655(MenuC3643 menuC3643, MenuItem menuItem) {
        return ((ـﹶ) this.f10005.f14522).ˏᴵ(this, menuItem);
    }

    @Override // p182.AbstractC2517
    /* renamed from: ﹶˆ */
    public final boolean mo6653() {
        return this.f10008.f97;
    }
}
