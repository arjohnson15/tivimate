package p320;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: ᴵʿ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3656 extends BaseAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f13990 = -1;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final LayoutInflater f13991;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f13992;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final MenuC3643 f13993;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f13994;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f13995;

    public C3656(MenuC3643 menuC3643, LayoutInflater layoutInflater, boolean z, int i) {
        this.f13995 = z;
        this.f13991 = layoutInflater;
        this.f13993 = menuC3643;
        this.f13994 = i;
        m8617();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM8587;
        MenuC3643 menuC3643 = this.f13993;
        if (this.f13995) {
            menuC3643.m8598();
            arrayListM8587 = menuC3643.f13904;
        } else {
            arrayListM8587 = menuC3643.m8587();
        }
        return this.f13990 < 0 ? arrayListM8587.size() : arrayListM8587.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f13991.inflate(this.f13994, viewGroup, false);
        }
        int i2 = getItem(i).f13925;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f13925 : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f13993.mo8579() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC3645 interfaceC3645 = (InterfaceC3645) view;
        if (this.f13992) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC3645.mo106(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m8617();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* renamed from: ʽᐧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3644 getItem(int i) {
        ArrayList arrayListM8587;
        MenuC3643 menuC3643 = this.f13993;
        if (this.f13995) {
            menuC3643.m8598();
            arrayListM8587 = menuC3643.f13904;
        } else {
            arrayListM8587 = menuC3643.m8587();
        }
        int i2 = this.f13990;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C3644) arrayListM8587.get(i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8617() {
        MenuC3643 menuC3643 = this.f13993;
        C3644 c3644 = menuC3643.f13906;
        if (c3644 != null) {
            menuC3643.m8598();
            ArrayList arrayList = menuC3643.f13904;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C3644) arrayList.get(i)) == c3644) {
                    this.f13990 = i;
                    return;
                }
            }
        }
        this.f13990 = -1;
    }
}
