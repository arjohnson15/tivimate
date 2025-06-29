package p457;

import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p013.AbstractC1041;
import ˆʽ.ᵎˏ;
import ˏʼ.ʽᐧ;

/* renamed from: ﾞﹶ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5363 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C5363 f20820;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f20821;

    static {
        C5363 c5363 = new C5363(new LinkedHashMap());
        ʽᐧ.ˆᵔ(c5363);
        f20820 = c5363;
    }

    public C5363(LinkedHashMap linkedHashMap) {
        this.f20821 = new HashMap(linkedHashMap);
    }

    public C5363(C5363 c5363) {
        this.f20821 = new HashMap(c5363.f20821);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p457.C5363 m12156(byte[] r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p457.C5363.m12156(byte[]):ﾞﹶ.ˉי");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto L66
            java.lang.Class r2 = r9.getClass()
            java.lang.Class<ﾞﹶ.ˉי> r3 = p457.C5363.class
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L14
            goto L66
        L14:
            ﾞﹶ.ˉי r9 = (p457.C5363) r9
            java.util.HashMap r2 = r8.f20821
            java.util.Set r3 = r2.keySet()
            java.util.HashMap r9 = r9.f20821
            java.util.Set r4 = r9.keySet()
            boolean r4 = p070.AbstractC1549.m5138(r3, r4)
            if (r4 != 0) goto L29
            return r1
        L29:
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r4 = r9.get(r4)
            if (r5 == 0) goto L5d
            if (r4 != 0) goto L46
            goto L5d
        L46:
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L58
            r6 = r5
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            boolean r7 = r4 instanceof java.lang.Object[]
            if (r7 == 0) goto L58
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            boolean r4 = p013.AbstractC1036.m3998(r6, r4)
            goto L62
        L58:
            boolean r4 = r5.equals(r4)
            goto L62
        L5d:
            if (r5 != r4) goto L61
            r4 = 1
            goto L62
        L61:
            r4 = 0
        L62:
            if (r4 != 0) goto L2d
            return r1
        L65:
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p457.C5363.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f20821.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return ᵎˏ.ˎٴ(new StringBuilder("Data {"), AbstractC1041.m4033(this.f20821.entrySet(), null, null, null, C5389.f20864, 31), "}");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m12157(String str) {
        Object obj = Boolean.FALSE;
        Object obj2 = this.f20821.get(str);
        if (obj2 instanceof Boolean) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long m12158(String str) {
        Object obj = this.f20821.get(str);
        return ((Number) (obj instanceof Long ? obj : 0L)).longValue();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m12159(String str) {
        Object obj = this.f20821.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }
}
