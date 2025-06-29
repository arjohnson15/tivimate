package p065;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import p070.AbstractC1563;
import p070.C1545;
import p270.AbstractC3293;
import p457.AbstractC5370;
import p457.C5363;
import ˏʼ.ʽᐧ;

/* renamed from: ʾᵔ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1496 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final LinkedHashMap f6088;

    public C1496(int i) {
        switch (i) {
            case 1:
                this.f6088 = new LinkedHashMap(0, 0.75f, true);
                break;
            case 2:
                this.f6088 = new LinkedHashMap();
                break;
            default:
                this.f6088 = new LinkedHashMap();
                break;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C5363 m5058() {
        C5363 c5363 = new C5363(this.f6088);
        ʽᐧ.ˆᵔ(c5363);
        return c5363;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004e A[EDGE_INSN: B:44:0x004e->B:24:0x004e BREAK  A[LOOP:0: B:9:0x0012->B:48:?], SYNTHETIC] */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List m5059(int r10, int r11) {
        /*
            r9 = this;
            if (r10 != r11) goto L6
            ʻי.ﹳˎ r10 = p013.C1053.f4449
            goto L8c
        L6:
            r0 = 1
            r1 = 0
            if (r11 <= r10) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L12:
            if (r2 == 0) goto L17
            if (r10 >= r11) goto L8b
            goto L19
        L17:
            if (r10 <= r11) goto L8b
        L19:
            java.util.LinkedHashMap r4 = r9.f6088
            r5 = 0
            if (r2 == 0) goto L36
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L2c
        L2a:
            r7 = r5
            goto L4c
        L2c:
            java.util.NavigableSet r6 = r4.descendingKeySet()
            ٴˑ.ʿʼ r7 = new ٴˑ.ʿʼ
            r7.<init>(r4, r6)
            goto L4c
        L36:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L43
            goto L2a
        L43:
            java.util.Set r6 = r4.keySet()
            ٴˑ.ʿʼ r7 = new ٴˑ.ʿʼ
            r7.<init>(r4, r6)
        L4c:
            if (r7 != 0) goto L50
        L4e:
            r10 = r5
            goto L8c
        L50:
            java.lang.Object r4 = r7.f13245
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r6 = r7.f13244
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L87
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L75
            int r8 = r10 + 1
            if (r8 > r7) goto L5c
            if (r7 > r11) goto L5c
            goto L79
        L75:
            if (r11 > r7) goto L5c
            if (r7 >= r10) goto L5c
        L79:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r4.get(r10)
            r3.add(r10)
            r10 = r7
            r4 = 1
            goto L88
        L87:
            r4 = 0
        L88:
            if (r4 != 0) goto L12
            goto L4e
        L8b:
            r10 = r3
        L8c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p065.C1496.m5059(int, int):java.util.List");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m5060(AbstractC3293 abstractC3293) {
        LinkedHashMap linkedHashMap = this.f6088;
        Integer numValueOf = Integer.valueOf(abstractC3293.f12827);
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        int i = abstractC3293.f12826;
        if (treeMap2.containsKey(Integer.valueOf(i))) {
            String str = "Overriding migration " + treeMap2.get(Integer.valueOf(i)) + " with " + abstractC3293;
        }
        treeMap2.put(Integer.valueOf(i), abstractC3293);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m5061(HashMap map) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = this.f6088;
            if (value == null) {
                value = null;
            } else {
                C1545 c1545M5154 = AbstractC1563.m5154(value.getClass());
                if (c1545M5154.equals(AbstractC1563.m5154(Boolean.TYPE)) ? true : c1545M5154.equals(AbstractC1563.m5154(Byte.TYPE)) ? true : c1545M5154.equals(AbstractC1563.m5154(Integer.TYPE)) ? true : c1545M5154.equals(AbstractC1563.m5154(Long.TYPE)) ? true : c1545M5154.equals(AbstractC1563.m5154(Float.TYPE)) ? true : c1545M5154.equals(AbstractC1563.m5154(Double.TYPE)) ? true : c1545M5154.equals(AbstractC1563.m5154(String.class)) ? true : c1545M5154.equals(AbstractC1563.m5154(Boolean[].class)) ? true : c1545M5154.equals(AbstractC1563.m5154(Byte[].class)) ? true : c1545M5154.equals(AbstractC1563.m5154(Integer[].class)) ? true : c1545M5154.equals(AbstractC1563.m5154(Long[].class)) ? true : c1545M5154.equals(AbstractC1563.m5154(Float[].class)) ? true : c1545M5154.equals(AbstractC1563.m5154(Double[].class)) ? true : c1545M5154.equals(AbstractC1563.m5154(String[].class))) {
                    continue;
                } else {
                    int i = 0;
                    if (c1545M5154.equals(AbstractC1563.m5154(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = AbstractC5370.f20838;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (c1545M5154.equals(AbstractC1563.m5154(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str3 = AbstractC5370.f20838;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (c1545M5154.equals(AbstractC1563.m5154(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str4 = AbstractC5370.f20838;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (c1545M5154.equals(AbstractC1563.m5154(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str5 = AbstractC5370.f20838;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (c1545M5154.equals(AbstractC1563.m5154(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str6 = AbstractC5370.f20838;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!c1545M5154.equals(AbstractC1563.m5154(double[].class))) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + c1545M5154);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = AbstractC5370.f20838;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            linkedHashMap.put(str, value);
        }
    }
}
