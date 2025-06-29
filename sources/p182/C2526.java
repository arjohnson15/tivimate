package p182;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p320.MenuC3664;

/* renamed from: ˋⁱ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2526 extends ActionMode {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC2517 f10052;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f10053;

    public C2526(Context context, AbstractC2517 abstractC2517) {
        this.f10053 = context;
        this.f10052 = abstractC2517;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f10052.mo6649();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f10052.mo6640();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC3664(this.f10053, this.f10052.mo6647());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f10052.mo6641();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f10052.mo6650();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f10052.f10004;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f10052.mo6651();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f10052.f10003;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f10052.mo6646();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f10052.mo6653();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f10052.mo6642(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f10052.mo6644(i);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f10052.mo6643(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f10052.f10004 = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f10052.mo6652(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f10052.mo6645(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f10052.mo6648(z);
    }
}
