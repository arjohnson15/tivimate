package p061;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p065.C1496;
import p340.AbstractC3876;
import ـˈ.ˉᵎ;
import ٴᐧ.ᐧⁱ;

/* renamed from: ʾـ.ᵢˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1424 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5797;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f5798;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f5799;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5800;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object f5801;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object f5802;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f5803;

    public C1424(int i) {
        this.f5800 = 1;
        this.f5797 = i;
        if (i <= 0) {
            AbstractC3876.m9071("maxSize <= 0");
            throw null;
        }
        this.f5801 = new C1496(1);
        this.f5802 = new ᐧⁱ(2);
    }

    public C1424(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f5800 = 0;
        this.f5802 = staggeredGridLayoutManager;
        this.f5801 = new ArrayList();
        this.f5797 = Integer.MIN_VALUE;
        this.f5799 = Integer.MIN_VALUE;
        this.f5803 = 0;
        this.f5798 = i;
    }

    public String toString() {
        String str;
        switch (this.f5800) {
            case 1:
                synchronized (((ᐧⁱ) this.f5802)) {
                    try {
                        int i = this.f5803;
                        int i2 = this.f5798 + i;
                        str = "LruCache[maxSize=" + this.f5797 + ",hits=" + this.f5803 + ",misses=" + this.f5798 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m4930() {
        ((ArrayList) this.f5801).clear();
        this.f5797 = Integer.MIN_VALUE;
        this.f5799 = Integer.MIN_VALUE;
        this.f5803 = 0;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int m4931() {
        return ((StaggeredGridLayoutManager) this.f5802).f1744 ? m4940(0, ((ArrayList) this.f5801).size()) : m4940(r1.size() - 1, -1);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public int m4932(int i) {
        int i2 = this.f5797;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f5801).size() == 0) {
            return i;
        }
        View view = (View) ((ArrayList) this.f5801).get(0);
        C1434 c1434 = (C1434) view.getLayoutParams();
        this.f5797 = ((StaggeredGridLayoutManager) this.f5802).f1730.mo4722(view);
        c1434.getClass();
        return this.f5797;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public Object m4933(Object obj, Object obj2) {
        Object objPut;
        synchronized (((ᐧⁱ) this.f5802)) {
            this.f5799++;
            objPut = ((C1496) this.f5801).f6088.put(obj, obj2);
            if (objPut != null) {
                this.f5799--;
            }
        }
        m4936(this.f5797);
        return objPut;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public Object m4934(String str) {
        Object objRemove;
        synchronized (((ᐧⁱ) this.f5802)) {
            objRemove = ((C1496) this.f5801).f6088.remove(str);
            if (objRemove != null) {
                this.f5799--;
            }
        }
        return objRemove;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int m4935() {
        int i;
        synchronized (((ᐧⁱ) this.f5802)) {
            i = this.f5797;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4936(int r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3.f5802
            ٴᐧ.ᐧⁱ r0 = (ٴᐧ.ᐧⁱ) r0
            monitor-enter(r0)
            int r1 = r3.f5799     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L5b
            java.lang.Object r1 = r3.f5801     // Catch: java.lang.Throwable -> L1a
            ʾᵔ.ˎˑ r1 = (p065.C1496) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f6088     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            int r1 = r3.f5799     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L5b
            goto L1c
        L1a:
            r4 = move-exception
            goto L63
        L1c:
            int r1 = r3.f5799     // Catch: java.lang.Throwable -> L1a
            if (r1 <= r4) goto L59
            java.lang.Object r1 = r3.f5801     // Catch: java.lang.Throwable -> L1a
            ʾᵔ.ˎˑ r1 = (p065.C1496) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f6088     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2d
            goto L59
        L2d:
            java.lang.Object r1 = r3.f5801     // Catch: java.lang.Throwable -> L1a
            ʾᵔ.ˎˑ r1 = (p065.C1496) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f6088     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = p013.AbstractC1041.m4025(r1)     // Catch: java.lang.Throwable -> L1a
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L41
            monitor-exit(r0)
            return
        L41:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1a
            r1.getValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r3.f5801     // Catch: java.lang.Throwable -> L1a
            ʾᵔ.ˎˑ r1 = (p065.C1496) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f6088     // Catch: java.lang.Throwable -> L1a
            r1.remove(r2)     // Catch: java.lang.Throwable -> L1a
            int r1 = r3.f5799     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 + (-1)
            r3.f5799 = r1     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            goto L0
        L59:
            monitor-exit(r0)
            return
        L5b:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1a
        L63:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p061.C1424.m4936(int):void");
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int m4937(int i) {
        int i2 = this.f5799;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f5801).size() == 0) {
            return i;
        }
        m4939();
        return this.f5799;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object mo4938(Object obj) {
        return null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m4939() {
        View view = (View) ˉᵎ.ﹶˆ(1, (ArrayList) this.f5801);
        C1434 c1434 = (C1434) view.getLayoutParams();
        this.f5799 = ((StaggeredGridLayoutManager) this.f5802).f1730.mo4725(view);
        c1434.getClass();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int m4940(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f5802;
        int iMo4716 = staggeredGridLayoutManager.f1730.mo4716();
        int iMo4726 = staggeredGridLayoutManager.f1730.mo4726();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f5801).get(i);
            int iMo4722 = staggeredGridLayoutManager.f1730.mo4722(view);
            int iMo4725 = staggeredGridLayoutManager.f1730.mo4725(view);
            boolean z = iMo4722 <= iMo4726;
            boolean z2 = iMo4725 >= iMo4716;
            if (z && z2 && (iMo4722 < iMo4716 || iMo4725 > iMo4726)) {
                return AbstractC1402.m4815(view);
            }
            i += i3;
        }
        return -1;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object m4941(Object obj) {
        Object objPut;
        synchronized (((ᐧⁱ) this.f5802)) {
            Object obj2 = ((C1496) this.f5801).f6088.get(obj);
            if (obj2 != null) {
                this.f5803++;
                return obj2;
            }
            this.f5798++;
            Object objMo4938 = mo4938(obj);
            if (objMo4938 == null) {
                return null;
            }
            synchronized (((ᐧⁱ) this.f5802)) {
                objPut = ((C1496) this.f5801).f6088.put(obj, objMo4938);
                if (objPut != null) {
                    ((C1496) this.f5801).f6088.put(obj, objPut);
                } else {
                    this.f5799++;
                }
            }
            if (objPut != null) {
                return objPut;
            }
            m4936(this.f5797);
            return objMo4938;
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public LinkedHashMap m4942() {
        LinkedHashMap linkedHashMap;
        synchronized (((ᐧⁱ) this.f5802)) {
            linkedHashMap = new LinkedHashMap(((C1496) this.f5801).f6088.entrySet().size());
            for (Map.Entry entry : ((C1496) this.f5801).f6088.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int m4943() {
        return ((StaggeredGridLayoutManager) this.f5802).f1744 ? m4940(r1.size() - 1, -1) : m4940(0, ((ArrayList) this.f5801).size());
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public View m4944(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f5801;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f5802;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1744 && AbstractC1402.m4815(view2) >= i) || ((!staggeredGridLayoutManager.f1744 && AbstractC1402.m4815(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.f1744 && AbstractC1402.m4815(view3) <= i) || ((!staggeredGridLayoutManager.f1744 && AbstractC1402.m4815(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }
}
