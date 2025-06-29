package p036;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import p166.C2406;
import p374.C4241;
import p383.AbstractC4470;

/* renamed from: ʼﹶ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1240 extends C2406 {

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public boolean f5061;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final SparseBooleanArray f5062;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public boolean f5063;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public boolean f5064;

    /* renamed from: יʻ, reason: contains not printable characters */
    public boolean f5065;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final SparseArray f5066;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public boolean f5067;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public boolean f5068;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public boolean f5069;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public boolean f5070;

    public C1240() {
        this.f5066 = new SparseArray();
        this.f5062 = new SparseBooleanArray();
        m4452();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1240(android.content.Context r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p036.C1240.<init>(android.content.Context):void");
    }

    public C1240(C1245 c1245) {
        m6495(c1245);
        this.f5067 = c1245.f5095;
        this.f5061 = c1245.f5089;
        this.f5064 = c1245.f5092;
        this.f5070 = c1245.f5098;
        this.f5069 = c1245.f5097;
        this.f5065 = c1245.f5093;
        this.f5068 = c1245.f5096;
        this.f5063 = c1245.f5091;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = c1245.f5094;
            if (i >= sparseArray2.size()) {
                this.f5066 = sparseArray;
                this.f5062 = c1245.f5090.clone();
                return;
            } else {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m4452() {
        this.f5067 = true;
        this.f5061 = true;
        this.f5064 = true;
        this.f5070 = true;
        this.f5069 = true;
        this.f5065 = true;
        this.f5068 = false;
        this.f5063 = true;
    }

    @Override // p166.C2406
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2406 mo4453(int i, int i2) {
        super.mo4453(i, i2);
        return this;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m4454(int i, C4241 c4241, C1241 c1241) {
        SparseArray sparseArray = this.f5066;
        Map map = (Map) sparseArray.get(i);
        if (map == null) {
            map = new HashMap();
            sparseArray.put(i, map);
        }
        if (map.containsKey(c4241) && AbstractC4470.m10194(map.get(c4241), c1241)) {
            return;
        }
        map.put(c4241, c1241);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m4455(int i) {
        this.f9519.remove(Integer.valueOf(i));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m4456(int i) {
        SparseArray sparseArray = this.f5066;
        Map map = (Map) sparseArray.get(i);
        if (map == null || map.isEmpty()) {
            return;
        }
        sparseArray.remove(i);
    }
}
