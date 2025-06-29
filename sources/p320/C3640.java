package p320;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: ᴵʿ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3640 extends BaseAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C3655 f13896;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f13897 = -1;

    public C3640(C3655 c3655) {
        this.f13896 = c3655;
        m8576();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C3655 c3655 = this.f13896;
        MenuC3643 menuC3643 = c3655.f13986;
        menuC3643.m8598();
        int size = menuC3643.f13904.size();
        c3655.getClass();
        return this.f13897 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f13896.f13984.inflate(R.layout._2_res_0x7f0e0010, viewGroup, false);
        }
        ((InterfaceC3645) view).mo106(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m8576();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* renamed from: ʽᐧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3644 getItem(int i) {
        C3655 c3655 = this.f13896;
        MenuC3643 menuC3643 = c3655.f13986;
        menuC3643.m8598();
        ArrayList arrayList = menuC3643.f13904;
        c3655.getClass();
        int i2 = this.f13897;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C3644) arrayList.get(i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8576() {
        MenuC3643 menuC3643 = this.f13896.f13986;
        C3644 c3644 = menuC3643.f13906;
        if (c3644 != null) {
            menuC3643.m8598();
            ArrayList arrayList = menuC3643.f13904;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C3644) arrayList.get(i)) == c3644) {
                    this.f13897 = i;
                    return;
                }
            }
        }
        this.f13897 = -1;
    }
}
