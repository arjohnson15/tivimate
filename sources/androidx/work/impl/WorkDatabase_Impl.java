package androidx.work.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p034.C1231;
import p034.InterfaceC1229;
import p065.C1500;
import p065.C1509;
import p065.C1523;
import p331.C3757;
import p331.C3758;
import p331.C3759;
import p331.C3761;
import p331.C3762;
import p331.C3766;
import p331.C3767;
import p331.C3772;
import p396.C4554;
import p414.C4724;
import ᴵﹳ.ٴˎ;
import ᴵﹳ.ﹶˆ;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public volatile C3767 f1762;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public volatile C3759 f1763;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public volatile C3772 f1764;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public volatile C3761 f1765;

    /* renamed from: ˑי, reason: contains not printable characters */
    public volatile C3762 f1766;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public volatile ﹶˆ f1767;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public volatile C3758 f1768;

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: ˆʿ */
    public final C3762 mo1372() {
        C3762 c3762;
        if (this.f1766 != null) {
            return this.f1766;
        }
        synchronized (this) {
            try {
                if (this.f1766 == null) {
                    this.f1766 = new C3762(this);
                }
                c3762 = this.f1766;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3762;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: ˈٴ */
    public final ﹶˆ mo1373() {
        ﹶˆ r0;
        if (this.f1767 != null) {
            return this.f1767;
        }
        synchronized (this) {
            try {
                if (this.f1767 == null) {
                    ﹶˆ r02 = new ﹶˆ();
                    r02.ᐧⁱ = this;
                    r02.ˆʿ = new C3757(this, 2);
                    r02.ˎˑ = new C3766(this, 0);
                    r02.ᐧˋ = new C3766(this, 1);
                    this.f1767 = r02;
                }
                r0 = this.f1767;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r0;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: ˎˑ */
    public final C3772 mo1374() {
        C3772 c3772;
        if (this.f1764 != null) {
            return this.f1764;
        }
        synchronized (this) {
            try {
                if (this.f1764 == null) {
                    this.f1764 = new C3772(this);
                }
                c3772 = this.f1764;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3772;
    }

    @Override // p065.AbstractC1484
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final InterfaceC1229 mo1379(C1509 c1509) {
        return c1509.f6137.mo4395(new C1231(c1509.f6139, c1509.f6127, new C1523(c1509, new C4554(this)), false, false));
    }

    @Override // p065.AbstractC1484
    /* renamed from: ˑי, reason: contains not printable characters */
    public final Map mo1380() {
        HashMap map = new HashMap();
        map.put(C3772.class, Collections.emptyList());
        map.put(C3767.class, Collections.emptyList());
        map.put(C3759.class, Collections.emptyList());
        map.put(ﹶˆ.class, Collections.emptyList());
        map.put(C3761.class, Collections.emptyList());
        map.put(C3762.class, Collections.emptyList());
        map.put(C3758.class, Collections.emptyList());
        map.put(ٴˎ.class, Collections.emptyList());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: יʻ */
    public final C3767 mo1375() {
        C3767 c3767;
        if (this.f1762 != null) {
            return this.f1762;
        }
        synchronized (this) {
            try {
                if (this.f1762 == null) {
                    this.f1762 = new C3767(this);
                }
                c3767 = this.f1762;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3767;
    }

    @Override // p065.AbstractC1484
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C1500 mo1381() {
        return new C1500(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: ᐧˋ */
    public final C3759 mo1376() {
        C3759 c3759;
        if (this.f1763 != null) {
            return this.f1763;
        }
        synchronized (this) {
            try {
                if (this.f1763 == null) {
                    this.f1763 = new C3759(this);
                }
                c3759 = this.f1763;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3759;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: ᐧⁱ */
    public final C3761 mo1377() {
        C3761 c3761;
        if (this.f1765 != null) {
            return this.f1765;
        }
        synchronized (this) {
            try {
                if (this.f1765 == null) {
                    this.f1765 = new C3761(this);
                }
                c3761 = this.f1765;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3761;
    }

    @Override // p065.AbstractC1484
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final Set mo1382() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: ﹳˑ */
    public final C3758 mo1378() {
        C3758 c3758;
        if (this.f1768 != null) {
            return this.f1768;
        }
        synchronized (this) {
            try {
                if (this.f1768 == null) {
                    this.f1768 = new C3758(this);
                }
                c3758 = this.f1768;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3758;
    }

    @Override // p065.AbstractC1484
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final List mo1383() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4724(13, 14, 10));
        arrayList.add(new C4724(11));
        arrayList.add(new C4724(16, 17, 12));
        arrayList.add(new C4724(17, 18, 13));
        arrayList.add(new C4724(18, 19, 14));
        arrayList.add(new C4724(15));
        arrayList.add(new C4724(20, 21, 16));
        arrayList.add(new C4724(22, 23, 17));
        return arrayList;
    }
}
