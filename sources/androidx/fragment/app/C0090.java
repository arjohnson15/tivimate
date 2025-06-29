package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.fragment.app.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0090 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C0114 f548;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f547 = new ArrayList();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashMap f545 = new HashMap();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f546 = new HashMap();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractComponentCallbacksC0100 m592(String str) {
        C0109 c0109 = (C0109) this.f545.get(str);
        if (c0109 != null) {
            return c0109.f677;
        }
        return null;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ArrayList m593() {
        ArrayList arrayList = new ArrayList();
        for (C0109 c0109 : this.f545.values()) {
            if (c0109 != null) {
                arrayList.add(c0109.f677);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m594(C0109 c0109) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c0109.f677;
        if (abstractComponentCallbacksC0100.mRetainInstance) {
            this.f548.m733(abstractComponentCallbacksC0100);
        }
        HashMap map = this.f545;
        if (map.get(abstractComponentCallbacksC0100.mWho) == c0109 && ((C0109) map.put(abstractComponentCallbacksC0100.mWho, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            String str = "Removed fragment from active set " + abstractComponentCallbacksC0100;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractComponentCallbacksC0100 m595(String str) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100FindFragmentByWho;
        for (C0109 c0109 : this.f545.values()) {
            if (c0109 != null && (abstractComponentCallbacksC0100FindFragmentByWho = c0109.f677.findFragmentByWho(str)) != null) {
                return abstractComponentCallbacksC0100FindFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m596(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        if (this.f547.contains(abstractComponentCallbacksC0100)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0100);
        }
        synchronized (this.f547) {
            this.f547.add(abstractComponentCallbacksC0100);
        }
        abstractComponentCallbacksC0100.mAdded = true;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final List m597() {
        ArrayList arrayList;
        if (this.f547.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f547) {
            arrayList = new ArrayList(this.f547);
        }
        return arrayList;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m598(C0109 c0109) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c0109.f677;
        String str = abstractComponentCallbacksC0100.mWho;
        HashMap map = this.f545;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0100.mWho, c0109);
        if (abstractComponentCallbacksC0100.mRetainInstanceChangedWhileDetached) {
            if (abstractComponentCallbacksC0100.mRetainInstance) {
                C0114 c0114 = this.f548;
                if (!c0114.f689) {
                    HashMap map2 = c0114.f685;
                    if (!map2.containsKey(abstractComponentCallbacksC0100.mWho)) {
                        map2.put(abstractComponentCallbacksC0100.mWho, abstractComponentCallbacksC0100);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            String str2 = "Updating retained Fragments: Added " + abstractComponentCallbacksC0100;
                        }
                    }
                } else if (Log.isLoggable("FragmentManager", 2)) {
                }
            } else {
                this.f548.m733(abstractComponentCallbacksC0100);
            }
            abstractComponentCallbacksC0100.mRetainInstanceChangedWhileDetached = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            String str3 = "Added fragment to active set " + abstractComponentCallbacksC0100;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ArrayList m599() {
        ArrayList arrayList = new ArrayList();
        for (C0109 c0109 : this.f545.values()) {
            if (c0109 != null) {
                arrayList.add(c0109);
            }
        }
        return arrayList;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Bundle m600(String str, Bundle bundle) {
        HashMap map = this.f546;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
