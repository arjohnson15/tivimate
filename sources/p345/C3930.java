package p345;

import com.google.android.gms.internal.play_billing.ᐧʻ;
import j$.util.Map;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: ᵎᴵ.ˈﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3930 implements Map, Serializable, j$.util.Map {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final C3930 f15266 = new C3930(null, new Object[0], 0);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public transient C3953 f15267;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final transient Object[] f15268;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public transient C3920 f15269;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient Object f15270;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public transient C3939 f15271;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final transient int f15272;

    public C3930(Object obj, Object[] objArr, int i) {
        this.f15270 = obj;
        this.f15268 = objArr;
        this.f15272 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p345.C3930 m9139(int r16, java.lang.Object[] r17, com.google.android.gms.internal.play_billing.ᐧʻ r18) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p345.C3930.m9139(int, java.lang.Object[], com.google.android.gms.internal.play_billing.ᐧʻ):ᵎᴵ.ˈﹳ");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3930 m9140(Map map) {
        if ((map instanceof C3930) && !(map instanceof SortedMap)) {
            C3930 c3930 = (C3930) map;
            c3930.getClass();
            return c3930;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z = setEntrySet instanceof Collection;
        ᐧʻ r2 = new ᐧʻ(z ? setEntrySet.size() : 4);
        if (z) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) r2.ˎˑ;
            if (size > objArr.length) {
                r2.ˎˑ = Arrays.copyOf(objArr, AbstractC3962.m9169(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            r2.ﾞˊ(entry.getKey(), entry.getValue());
        }
        return r2.ﹳﹳ();
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
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC3968.m9186(this, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0037->B:22:0x004d], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0062->B:32:0x0079], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0088->B:43:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r9 = r0
            goto L9c
        L6:
            r1 = 1
            java.lang.Object[] r2 = r8.f15268
            int r3 = r8.f15272
            if (r3 != r1) goto L20
            r3 = 0
            r3 = r2[r3]
            j$.util.Objects.requireNonNull(r3)
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L3
            r9 = r2[r1]
            j$.util.Objects.requireNonNull(r9)
            goto L9c
        L20:
            java.lang.Object r3 = r8.f15270
            if (r3 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L50
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = p345.AbstractC3968.m9193(r3)
        L37:
            r3 = r3 & r5
            r6 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L3
        L40:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L4d:
            int r3 = r3 + 1
            goto L37
        L50:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L7c
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = p345.AbstractC3968.m9193(r3)
        L62:
            r3 = r3 & r5
            short r6 = r4[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L3
        L6c:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L79:
            int r3 = r3 + 1
            goto L62
        L7c:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            int r5 = r9.hashCode()
            int r5 = p345.AbstractC3968.m9193(r5)
        L88:
            r5 = r5 & r4
            r6 = r3[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L3
        L90:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r2[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r0
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: p345.C3930.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC3968.m9182(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
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
        return this.f15272;
    }

    public final String toString() {
        int i = this.f15272;
        AbstractC3968.m9177(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        AbstractC3986 it = ((C3939) entrySet()).iterator();
        boolean z = true;
        while (true) {
            C3928 c3928 = (C3928) it;
            if (!c3928.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) c3928.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }

    @Override // java.util.Map
    /* renamed from: ʿʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC3985 keySet() {
        C3953 c3953 = this.f15267;
        if (c3953 != null) {
            return c3953;
        }
        C3953 c39532 = new C3953(this, new C3920(this.f15268, 0, this.f15272));
        this.f15267 = c39532;
        return c39532;
    }

    @Override // java.util.Map
    /* renamed from: ˑʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC3985 entrySet() {
        C3939 c3939 = this.f15271;
        if (c3939 != null) {
            return c3939;
        }
        C3939 c39392 = new C3939(this, this.f15268, this.f15272);
        this.f15271 = c39392;
        return c39392;
    }

    @Override // java.util.Map
    /* renamed from: ٴˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC3927 values() {
        C3920 c3920 = this.f15269;
        if (c3920 != null) {
            return c3920;
        }
        C3920 c39202 = new C3920(this.f15268, 1, this.f15272);
        this.f15269 = c39202;
        return c39202;
    }
}
