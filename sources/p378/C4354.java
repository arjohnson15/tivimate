package p378;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p291.C3453;

/* renamed from: ᵢٴ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4354 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f16859 = new CopyOnWriteArrayList();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f16860 = new HashMap();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Runnable f16861;

    public C4354(Runnable runnable) {
        this.f16861 = runnable;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m9928(MenuItem menuItem) {
        Iterator it = this.f16859.iterator();
        while (it.hasNext()) {
            if (((C3453) ((InterfaceC4343) it.next())).f13374.m664(menuItem)) {
                return true;
            }
        }
        return false;
    }
}
