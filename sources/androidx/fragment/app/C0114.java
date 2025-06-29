package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0207;
import androidx.lifecycle.C0241;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0114 extends AbstractC0207 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final ٴʾ.ʿˏ f684 = new ٴʾ.ʿˏ(1);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean f686;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashMap f685 = new HashMap();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f687 = new HashMap();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final HashMap f690 = new HashMap();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f688 = false;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f689 = false;

    public C0114(boolean z) {
        this.f686 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0114.class != obj.getClass()) {
            return false;
        }
        C0114 c0114 = (C0114) obj;
        return this.f685.equals(c0114.f685) && this.f687.equals(c0114.f687) && this.f690.equals(c0114.f690);
    }

    public final int hashCode() {
        return this.f690.hashCode() + ((this.f687.hashCode() + (this.f685.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f685.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f687.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f690.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m733(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        if (this.f689) {
            if (Log.isLoggable("FragmentManager", 2)) {
            }
        } else {
            if (this.f685.remove(abstractComponentCallbacksC0100.mWho) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            String str = "Updating retained Fragments: Removed " + abstractComponentCallbacksC0100;
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m734(String str, boolean z) {
        if (Log.isLoggable("FragmentManager", 3)) {
            String str2 = "Clearing non-config state for saved state of Fragment " + str;
        }
        m737(str, z);
    }

    @Override // androidx.lifecycle.AbstractC0207
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo735() {
        if (Log.isLoggable("FragmentManager", 3)) {
            String str = "onCleared called for " + this;
        }
        this.f688 = true;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m736(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        if (Log.isLoggable("FragmentManager", 3)) {
            String str = "Clearing non-config state for " + abstractComponentCallbacksC0100;
        }
        m737(abstractComponentCallbacksC0100.mWho, z);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m737(String str, boolean z) {
        HashMap map = this.f687;
        C0114 c0114 = (C0114) map.get(str);
        if (c0114 != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c0114.f687.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c0114.m734((String) it.next(), true);
                }
            }
            c0114.mo735();
            map.remove(str);
        }
        HashMap map2 = this.f690;
        C0241 c0241 = (C0241) map2.get(str);
        if (c0241 != null) {
            c0241.m1039();
            map2.remove(str);
        }
    }
}
