package com.google.android.gms.internal.play_billing;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: com.google.android.gms.internal.play_billing.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0648 implements Map, Serializable, j$.util.Map {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final C0648 f3045 = new C0648(null, new Object[0], 0);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public transient C0610 f3046;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final transient Object[] f3047;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public transient C0617 f3048;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient Object f3049;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public transient C0624 f3050;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final transient int f3051;

    public C0648(Object obj, Object[] objArr, int i) {
        this.f3049 = obj;
        this.f3047 = objArr;
        this.f3051 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a3  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.play_billing.C0648 m2662(int r16, java.lang.Object[] r17, com.google.android.gms.internal.play_billing.ᐧʻ r18) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C0648.m2662(int, java.lang.Object[], com.google.android.gms.internal.play_billing.ᐧʻ):com.google.android.gms.internal.play_billing.ᴵʿ");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C0617 c0617 = this.f3048;
        if (c0617 == null) {
            c0617 = new C0617(this.f3047, 1, this.f3051);
            this.f3048 = c0617;
        }
        return c0617.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0624 c0624 = this.f3050;
        if (c0624 != null) {
            return c0624;
        }
        C0624 c06242 = new C0624(this, this.f3047, this.f3051);
        this.f3050 = c06242;
        return c06242;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            r1 = 1
            int r2 = r9.f3051
            java.lang.Object[] r3 = r9.f3047
            if (r2 != r1) goto L20
            r2 = 0
            r2 = r3[r2]
            j$.util.Objects.requireNonNull(r2)
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L3
            r10 = r3[r1]
            j$.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r2 = r9.f3049
            if (r2 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r2 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r2
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = ˈⁱ.ˉⁱ.ʾʼ(r2)
        L38:
            r2 = r2 & r6
            r5 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L4e:
            int r2 = r2 + 1
            goto L38
        L51:
            boolean r4 = r2 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r2
            short[] r4 = (short[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = ˈⁱ.ˉⁱ.ʾʼ(r2)
        L63:
            r2 = r2 & r6
            short r5 = r4[r2]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L7a:
            int r2 = r2 + 1
            goto L63
        L7d:
            int[] r2 = (int[]) r2
            int r4 = r2.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = ˈⁱ.ˉⁱ.ʾʼ(r6)
        L89:
            r6 = r6 & r4
            r7 = r2[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r3[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r3[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C0648.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0624 c0624 = this.f3050;
        if (c0624 == null) {
            c0624 = new C0624(this, this.f3047, this.f3051);
            this.f3050 = c0624;
        }
        Iterator it = c0624.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0610 c0610 = this.f3046;
        if (c0610 != null) {
            return c0610;
        }
        C0610 c06102 = new C0610(this, new C0617(this.f3047, 0, this.f3051));
        this.f3046 = c06102;
        return c06102;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3051;
    }

    public final String toString() {
        int i = this.f3051;
        if (i < 0) {
            throw new IllegalArgumentException(ـˈ.ˉᵎ.ˉⁱ("size cannot be negative but was: ", i));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((C0624) entrySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C0617 c0617 = this.f3048;
        if (c0617 != null) {
            return c0617;
        }
        C0617 c06172 = new C0617(this.f3047, 1, this.f3051);
        this.f3048 = c06172;
        return c06172;
    }
}
