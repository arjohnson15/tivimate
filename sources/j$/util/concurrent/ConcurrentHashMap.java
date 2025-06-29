package j$.util.concurrent;

import j$.util.AbstractC5414b;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.AbstractC5551y0;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, u {
    static final int g = Runtime.getRuntime().availableProcessors();
    private static final j$.sun.misc.a h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final int n;
    private static final int o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    volatile transient k[] a;
    private volatile transient k[] b;
    private volatile transient long baseCount;
    private volatile transient c[] c;
    private volatile transient int cellsBusy;
    private transient KeySetView d;
    private transient r e;
    private transient e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    public static class KeySetView<K, V> extends b implements Set<K>, Serializable, j$.util.Set<K> {
        private static final long serialVersionUID = 7249069246763182397L;
        private final Boolean b;

        KeySetView(ConcurrentHashMap concurrentHashMap, Boolean bool) {
            super(concurrentHashMap);
            this.b = bool;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            Boolean bool = this.b;
            if (bool != null) {
                return this.a.f(k, bool, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            Boolean bool = this.b;
            if (bool == null) {
                throw new UnsupportedOperationException();
            }
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (this.a.f(it.next(), bool, true) == null) {
                    z = true;
                }
            }
            return z;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public final void forEach(Consumer consumer) {
            consumer.getClass();
            k[] kVarArr = this.a.a;
            if (kVarArr == null) {
                return;
            }
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    return;
                } else {
                    consumer.accept(kVarA.b);
                }
            }
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Iterator<K> it = iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += it.next().hashCode();
            }
            return iHashCode;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            k[] kVarArr = concurrentHashMap.a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new h(kVarArr, length, length, concurrentHashMap, 0);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            return AbstractC5551y0.f0(AbstractC5414b.x(this), true);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream parallelStream() {
            return Stream.Wrapper.convert(AbstractC5551y0.f0(AbstractC5414b.x(this), true));
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.a.remove(obj) != null;
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection
        public final Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            long j = concurrentHashMap.j();
            k[] kVarArr = concurrentHashMap.a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new i(kVarArr, length, 0, length, j < 0 ? 0L : j, 0);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream stream() {
            return AbstractC5551y0.f0(AbstractC5414b.x(this), false);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(AbstractC5551y0.f0(AbstractC5414b.x(this), false));
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) intFunction.apply(0));
        }
    }

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", m[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVarH = j$.sun.misc.a.h();
        h = aVarH;
        i = aVarH.j(ConcurrentHashMap.class, "sizeCtl");
        j = aVarH.j(ConcurrentHashMap.class, "transferIndex");
        k = aVarH.j(ConcurrentHashMap.class, "baseCount");
        l = aVarH.j(ConcurrentHashMap.class, "cellsBusy");
        m = aVarH.j(c.class, "value");
        n = aVarH.a(k[].class);
        int iB = aVarH.b(k[].class);
        if (((iB - 1) & iB) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(iB);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i2, float f, int i3) {
        if (f <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((i2 < i3 ? i3 : i2) / f) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : l((int) j2);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x013f, code lost:
    
        if (r25.c != r7) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0141, code lost:
    
        r25.c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(long r26, int r28) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    static final boolean b(k[] kVarArr, int i2, k kVar) {
        return h.e(kVarArr, (i2 << o) + n, kVar);
    }

    static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    private final k[] e() {
        while (true) {
            k[] kVarArr = this.a;
            if (kVarArr != null && kVarArr.length != 0) {
                return kVarArr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else if (h.c(this, i, i2, -1)) {
                try {
                    k[] kVarArr2 = this.a;
                    if (kVarArr2 == null || kVarArr2.length == 0) {
                        int i3 = i2 > 0 ? i2 : 16;
                        k[] kVarArr3 = new k[i3];
                        this.a = kVarArr3;
                        i2 = i3 - (i3 >>> 2);
                        kVarArr2 = kVarArr3;
                    }
                    this.sizeCtl = i2;
                    return kVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i2;
                    throw th;
                }
            }
        }
    }

    static final void h(k[] kVarArr, int i2, k kVar) {
        h.l(kVarArr, (i2 << o) + n, kVar);
    }

    static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    static final k k(k[] kVarArr, int i2) {
        return (k) h.g(kVarArr, (i2 << o) + n);
    }

    private static final int l(int i2) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i2 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + iNumberOfLeadingZeros;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r4v0, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r5v17, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r5v22, types: [j$.util.concurrent.k] */
    private final void m(k[] kVarArr, k[] kVarArr2) {
        k[] kVarArr3;
        int i2;
        int i3;
        g gVar;
        ConcurrentHashMap<K, V> concurrentHashMap;
        int i4;
        q kVar;
        int i5;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        k[] kVarArr4 = kVarArr;
        int length = kVarArr4.length;
        int i6 = g;
        int i7 = i6 > 1 ? (length >>> 3) / i6 : length;
        int i8 = i7 < 16 ? 16 : i7;
        if (kVarArr2 == null) {
            try {
                k[] kVarArr5 = new k[length << 1];
                concurrentHashMap2.b = kVarArr5;
                concurrentHashMap2.transferIndex = length;
                kVarArr3 = kVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            kVarArr3 = kVarArr2;
        }
        int length2 = kVarArr3.length;
        g gVar2 = new g(kVarArr3);
        int i9 = 0;
        int i10 = 0;
        boolean zB = true;
        boolean z = false;
        while (true) {
            if (zB) {
                int i11 = i10 - 1;
                if (i11 >= i9 || z) {
                    i9 = i9;
                    i10 = i11;
                    zB = false;
                } else {
                    int i12 = concurrentHashMap2.transferIndex;
                    if (i12 <= 0) {
                        i10 = -1;
                    } else {
                        j$.sun.misc.a aVar = h;
                        long j2 = j;
                        int i13 = i12 > i8 ? i12 - i8 : 0;
                        int i14 = i9;
                        if (aVar.c(this, j2, i12, i13)) {
                            i10 = i12 - 1;
                            i9 = i13;
                        } else {
                            i9 = i14;
                            i10 = i11;
                        }
                    }
                    zB = false;
                }
            } else {
                int i15 = i9;
                q kVar2 = null;
                if (i10 < 0 || i10 >= length || (i4 = i10 + length) >= length2) {
                    i2 = i8;
                    i3 = length2;
                    gVar = gVar2;
                    if (z) {
                        this.b = null;
                        this.a = kVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap = this;
                    j$.sun.misc.a aVar2 = h;
                    long j3 = i;
                    int i16 = concurrentHashMap.sizeCtl;
                    int i17 = i10;
                    if (!aVar2.c(this, j3, i16, i16 - 1)) {
                        i10 = i17;
                    } else {
                        if (i16 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i10 = length;
                        zB = true;
                        z = true;
                    }
                } else {
                    ?? K = k(kVarArr4, i10);
                    if (K == 0) {
                        zB = b(kVarArr4, i10, gVar2);
                        concurrentHashMap = concurrentHashMap2;
                        i2 = i8;
                        i3 = length2;
                        gVar = gVar2;
                    } else {
                        int i18 = K.a;
                        if (i18 == -1) {
                            concurrentHashMap = concurrentHashMap2;
                            i2 = i8;
                            i3 = length2;
                            gVar = gVar2;
                            zB = true;
                        } else {
                            synchronized (K) {
                                try {
                                    if (k(kVarArr4, i10) == K) {
                                        if (i18 >= 0) {
                                            int i19 = i18 & length;
                                            q qVar = K;
                                            for (q qVar2 = K.d; qVar2 != null; qVar2 = qVar2.d) {
                                                int i20 = qVar2.a & length;
                                                if (i20 != i19) {
                                                    qVar = qVar2;
                                                    i19 = i20;
                                                }
                                            }
                                            if (i19 == 0) {
                                                kVar = null;
                                                kVar2 = qVar;
                                            } else {
                                                kVar = qVar;
                                            }
                                            k kVar3 = K;
                                            while (kVar3 != qVar) {
                                                int i21 = kVar3.a;
                                                Object obj = kVar3.b;
                                                int i22 = i8;
                                                Object obj2 = kVar3.c;
                                                if ((i21 & length) == 0) {
                                                    i5 = length2;
                                                    kVar2 = new k(i21, obj, obj2, kVar2);
                                                } else {
                                                    i5 = length2;
                                                    kVar = new k(i21, obj, obj2, kVar);
                                                }
                                                kVar3 = kVar3.d;
                                                i8 = i22;
                                                length2 = i5;
                                            }
                                            i2 = i8;
                                            i3 = length2;
                                            h(kVarArr3, i10, kVar2);
                                            h(kVarArr3, i4, kVar);
                                            h(kVarArr4, i10, gVar2);
                                            gVar = gVar2;
                                        } else {
                                            i2 = i8;
                                            i3 = length2;
                                            if (K instanceof p) {
                                                p pVar = (p) K;
                                                q qVar3 = null;
                                                q qVar4 = null;
                                                k kVar4 = pVar.f;
                                                int i23 = 0;
                                                int i24 = 0;
                                                q qVar5 = null;
                                                while (kVar4 != null) {
                                                    p pVar2 = pVar;
                                                    int i25 = kVar4.a;
                                                    g gVar3 = gVar2;
                                                    q qVar6 = new q(i25, kVar4.b, kVar4.c, null, null);
                                                    if ((i25 & length) == 0) {
                                                        qVar6.h = qVar4;
                                                        if (qVar4 == null) {
                                                            kVar2 = qVar6;
                                                        } else {
                                                            qVar4.d = qVar6;
                                                        }
                                                        i23++;
                                                        qVar4 = qVar6;
                                                    } else {
                                                        qVar6.h = qVar3;
                                                        if (qVar3 == null) {
                                                            qVar5 = qVar6;
                                                        } else {
                                                            qVar3.d = qVar6;
                                                        }
                                                        i24++;
                                                        qVar3 = qVar6;
                                                    }
                                                    kVar4 = kVar4.d;
                                                    pVar = pVar2;
                                                    gVar2 = gVar3;
                                                }
                                                p pVar3 = pVar;
                                                g gVar4 = gVar2;
                                                k kVarP = i23 <= 6 ? p(kVar2) : i24 != 0 ? new p(kVar2) : pVar3;
                                                k kVarP2 = i24 <= 6 ? p(qVar5) : i23 != 0 ? new p(qVar5) : pVar3;
                                                h(kVarArr3, i10, kVarP);
                                                h(kVarArr3, i4, kVarP2);
                                                kVarArr4 = kVarArr;
                                                gVar = gVar4;
                                                h(kVarArr4, i10, gVar);
                                            }
                                        }
                                        zB = true;
                                    } else {
                                        i2 = i8;
                                        i3 = length2;
                                    }
                                    gVar = gVar2;
                                } finally {
                                }
                            }
                            concurrentHashMap = this;
                        }
                    }
                }
                gVar2 = gVar;
                concurrentHashMap2 = concurrentHashMap;
                i9 = i15;
                i8 = i2;
                length2 = i3;
            }
        }
    }

    private final void n(k[] kVarArr, int i2) {
        int length = kVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        k kVarK = k(kVarArr, i2);
        if (kVarK == null || kVarK.a < 0) {
            return;
        }
        synchronized (kVarK) {
            try {
                if (k(kVarArr, i2) == kVarK) {
                    q qVar = null;
                    k kVar = kVarK;
                    q qVar2 = null;
                    while (kVar != null) {
                        q qVar3 = new q(kVar.a, kVar.b, kVar.c, null, null);
                        qVar3.h = qVar2;
                        if (qVar2 == null) {
                            qVar = qVar3;
                        } else {
                            qVar2.d = qVar3;
                        }
                        kVar = kVar.d;
                        qVar2 = qVar3;
                    }
                    h(kVarArr, i2, new p(qVar));
                }
            } finally {
            }
        }
    }

    public static <K> KeySetView<K, Boolean> newKeySet() {
        return new KeySetView<>(new ConcurrentHashMap(), Boolean.TRUE);
    }

    private final void o(int i2) {
        int length;
        int iL = i2 >= 536870912 ? 1073741824 : l(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            k[] kVarArr = this.a;
            if (kVarArr == null || (length = kVarArr.length) == 0) {
                int i4 = i3 > iL ? i3 : iL;
                if (h.c(this, i, i3, -1)) {
                    try {
                        if (this.a == kVarArr) {
                            this.a = new k[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i3;
                    }
                } else {
                    continue;
                }
            } else {
                if (iL <= i3 || length >= 1073741824) {
                    return;
                }
                if (kVarArr == this.a) {
                    if (h.c(this, i, i3, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m(kVarArr, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.k] */
    static k p(q qVar) {
        k kVar = null;
        k kVar2 = null;
        for (q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.d) {
            k kVar3 = new k(qVar2.a, qVar2.b, qVar2.c);
            if (kVar2 == null) {
                kVar = kVar3;
            } else {
                kVar2.d = kVar3;
            }
            kVar2 = kVar3;
        }
        return kVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j2;
        boolean z;
        boolean z2;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j3 = 0;
        long j4 = 0;
        k kVar = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j2 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j4++;
            kVar = new k(i(object.hashCode()), object, object2, kVar);
        }
        if (j4 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j5 = (long) ((j4 / 0.75f) + 1.0d);
        int iL = j5 >= 1073741824 ? 1073741824 : l((int) j5);
        k[] kVarArr = new k[iL];
        int i2 = iL - 1;
        while (kVar != null) {
            k kVar2 = kVar.d;
            int i3 = kVar.a;
            int i4 = i3 & i2;
            k kVarK = k(kVarArr, i4);
            if (kVarK == null) {
                z2 = true;
            } else {
                Object obj2 = kVar.b;
                if (kVarK.a >= 0) {
                    int i5 = 0;
                    for (k kVar3 = kVarK; kVar3 != null; kVar3 = kVar3.d) {
                        if (kVar3.a == i3 && ((obj = kVar3.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    z = true;
                    if (!z || i5 < 8) {
                        z2 = z;
                    } else {
                        long j6 = j3 + 1;
                        kVar.d = kVarK;
                        k kVar4 = kVar;
                        q qVar = null;
                        q qVar2 = null;
                        while (kVar4 != null) {
                            long j7 = j6;
                            q qVar3 = new q(kVar4.a, kVar4.b, kVar4.c, null, null);
                            qVar3.h = qVar2;
                            if (qVar2 == null) {
                                qVar = qVar3;
                            } else {
                                qVar2.d = qVar3;
                            }
                            kVar4 = kVar4.d;
                            qVar2 = qVar3;
                            j6 = j7;
                        }
                        h(kVarArr, i4, new p(qVar));
                        j3 = j6;
                    }
                } else if (((p) kVarK).e(i3, obj2, kVar.c) == null) {
                    j3 += j2;
                }
                z2 = false;
            }
            j2 = 1;
            if (z2) {
                j3++;
                kVar.d = kVarK;
                h(kVarArr, i4, kVar);
            }
            kVar = kVar2;
        }
        this.a = kVarArr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i2 = 1;
        int i3 = 0;
        while (i2 < 16) {
            i3++;
            i2 <<= 1;
        }
        int i4 = 32 - i3;
        int i5 = i2 - 1;
        m[] mVarArr = new m[16];
        for (int i6 = 0; i6 < 16; i6++) {
            mVarArr[i6] = new m();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", mVarArr);
        putFieldPutFields.put("segmentShift", i4);
        putFieldPutFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        k[] kVarArr = this.a;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                objectOutputStream.writeObject(kVarA.b);
                objectOutputStream.writeObject(kVarA.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        k kVarK;
        k[] kVarArrD = this.a;
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (kVarArrD != null && i2 < kVarArrD.length) {
                kVarK = k(kVarArrD, i2);
                if (kVarK == null) {
                    i2++;
                } else {
                    int i3 = kVarK.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (kVarK) {
                        try {
                            if (k(kVarArrD, i2) == kVarK) {
                                for (k kVar = i3 >= 0 ? kVarK : kVarK instanceof p ? ((p) kVarK).f : null; kVar != null; kVar = kVar.d) {
                                    j2--;
                                }
                                h(kVarArrD, i2, null);
                                i2++;
                            }
                        } finally {
                        }
                    }
                }
            }
            kVarArrD = d(kVarArrD, kVarK);
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        k kVar;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        k[] kVarArrE = this.a;
        int i3 = 0;
        Object objApply = null;
        int i4 = 0;
        while (true) {
            if (kVarArrE != null) {
                int length = kVarArrE.length;
                if (length != 0) {
                    int i5 = (length - 1) & i2;
                    k kVarK = k(kVarArrE, i5);
                    if (kVarK == null) {
                        l lVar = new l();
                        synchronized (lVar) {
                            try {
                                if (b(kVarArrE, i5, lVar)) {
                                    try {
                                        objApply = biFunction.apply(obj, null);
                                        if (objApply != null) {
                                            kVar = new k(i2, obj, objApply);
                                            i4 = 1;
                                        } else {
                                            kVar = null;
                                        }
                                        h(kVarArrE, i5, kVar);
                                        i3 = 1;
                                    } catch (Throwable th) {
                                        h(kVarArrE, i5, null);
                                        throw th;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i3 != 0) {
                        }
                    } else {
                        int i6 = kVarK.a;
                        if (i6 == -1) {
                            kVarArrE = d(kVarArrE, kVarK);
                        } else {
                            synchronized (kVarK) {
                                try {
                                    if (k(kVarArrE, i5) == kVarK) {
                                        if (i6 >= 0) {
                                            k kVar2 = null;
                                            k kVar3 = kVarK;
                                            i3 = 1;
                                            while (true) {
                                                if (kVar3.a != i2 || ((obj2 = kVar3.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                                                    k kVar4 = kVar3.d;
                                                    if (kVar4 == null) {
                                                        Object objApply2 = biFunction.apply(obj, null);
                                                        if (objApply2 == null) {
                                                            objApply = objApply2;
                                                        } else {
                                                            if (kVar3.d != null) {
                                                                throw new IllegalStateException("Recursive update");
                                                            }
                                                            kVar3.d = new k(i2, obj, objApply2);
                                                            objApply = objApply2;
                                                            i4 = 1;
                                                        }
                                                    } else {
                                                        i3++;
                                                        kVar2 = kVar3;
                                                        kVar3 = kVar4;
                                                    }
                                                }
                                            }
                                            Object objApply3 = biFunction.apply(obj, kVar3.c);
                                            if (objApply3 != null) {
                                                kVar3.c = objApply3;
                                                objApply = objApply3;
                                            } else {
                                                k kVar5 = kVar3.d;
                                                if (kVar2 != null) {
                                                    kVar2.d = kVar5;
                                                } else {
                                                    h(kVarArrE, i5, kVar5);
                                                }
                                                objApply = objApply3;
                                                i4 = -1;
                                            }
                                        } else if (kVarK instanceof p) {
                                            p pVar = (p) kVarK;
                                            q qVar = pVar.e;
                                            q qVarB = qVar != null ? qVar.b(i2, obj, null) : null;
                                            Object objApply4 = biFunction.apply(obj, qVarB == null ? null : qVarB.c);
                                            if (objApply4 != null) {
                                                if (qVarB != null) {
                                                    qVarB.c = objApply4;
                                                } else {
                                                    pVar.e(i2, obj, objApply4);
                                                    i4 = 1;
                                                }
                                            } else if (qVarB != null) {
                                                if (pVar.f(qVarB)) {
                                                    h(kVarArrE, i5, p(pVar.f));
                                                }
                                                i4 = -1;
                                            }
                                            objApply = objApply4;
                                            i3 = 1;
                                        } else if (kVarK instanceof l) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(kVarArrE, i5);
                                }
                            }
                        }
                    }
                }
            }
            kVarArrE = e();
        }
        if (i4 != 0) {
            a(i4, i3);
        }
        return objApply;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x008c, code lost:
    
        r5 = r5.c;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.k[] r2 = r13.a
            r3 = 0
            r5 = r0
            r4 = 0
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.k r7 = k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.k[] r2 = r13.d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.k r10 = k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r14 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.k r3 = r8.d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = -1
            goto Lab
        L65:
            j$.util.concurrent.k r10 = r8.d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof j$.util.concurrent.p     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.p r4 = (j$.util.concurrent.p) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.q r8 = r4.e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.q r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.q r3 = r4.f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.k r3 = p(r3)     // Catch: java.lang.Throwable -> L4b
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = -1
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof j$.util.concurrent.l     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L4b
            throw r14     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r14
        Lb7:
            j$.util.concurrent.k[] r2 = r13.e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        k[] kVarArr = this.a;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                Object obj2 = kVarA.c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    final k[] d(k[] kVarArr, k kVar) {
        int i2;
        if (!(kVar instanceof g)) {
            return this.a;
        }
        k[] kVarArr2 = ((g) kVar).e;
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(kVarArr.length) | 32768;
        while (true) {
            if (kVarArr2 != this.b || this.a != kVarArr || (i2 = this.sizeCtl) >= 0 || (i2 >>> 16) != iNumberOfLeadingZeros || i2 == iNumberOfLeadingZeros + 1 || i2 == 65535 + iNumberOfLeadingZeros || this.transferIndex <= 0) {
                break;
            }
            if (h.c(this, i, i2, i2 + 1)) {
                m(kVarArr, kVarArr2);
                break;
            }
        }
        return kVarArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        k[] kVarArr = this.a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        o oVar = new o(kVarArr, length, 0, length);
        while (true) {
            k kVarA = oVar.a();
            if (kVarA == null) {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                        return false;
                    }
                }
                return true;
            }
            Object obj2 = kVarA.c;
            Object obj3 = map.get(kVarA.b);
            if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                break;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        r7 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (r11 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        r6.c = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        k[] kVarArr = this.a;
        if (kVarArr == null) {
            return;
        }
        o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            k kVarA = oVar.a();
            if (kVarA == null) {
                return;
            } else {
                biConsumer.accept(kVarA.b, kVarA.c);
            }
        }
    }

    final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i2;
        k kVarK;
        boolean z;
        Object obj4;
        q qVarB;
        Object obj5;
        int i3 = i(obj.hashCode());
        k[] kVarArrD = this.a;
        while (true) {
            if (kVarArrD == null || (length = kVarArrD.length) == 0 || (kVarK = k(kVarArrD, (i2 = (length - 1) & i3))) == null) {
                break;
            }
            int i4 = kVarK.a;
            if (i4 == -1) {
                kVarArrD = d(kVarArrD, kVarK);
            } else {
                synchronized (kVarK) {
                    try {
                        if (k(kVarArrD, i2) == kVarK) {
                            z = true;
                            if (i4 >= 0) {
                                k kVar = null;
                                k kVar2 = kVarK;
                                while (true) {
                                    if (kVar2.a != i3 || ((obj5 = kVar2.b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        k kVar3 = kVar2.d;
                                        if (kVar3 == null) {
                                            break;
                                        }
                                        kVar = kVar2;
                                        kVar2 = kVar3;
                                    }
                                }
                                obj4 = kVar2.c;
                                if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                    obj4 = null;
                                } else if (obj2 != null) {
                                    kVar2.c = obj2;
                                } else if (kVar != null) {
                                    kVar.d = kVar2.d;
                                } else {
                                    h(kVarArrD, i2, kVar2.d);
                                }
                            } else if (kVarK instanceof p) {
                                p pVar = (p) kVarK;
                                q qVar = pVar.e;
                                if (qVar != null && (qVarB = qVar.b(i3, obj, null)) != null) {
                                    obj4 = qVarB.c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            qVarB.c = obj2;
                                        } else if (pVar.f(qVarB)) {
                                            h(kVarArrD, i2, p(pVar.f));
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (kVarK instanceof l) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                        z = false;
                        obj4 = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int length;
        k kVarK;
        Object obj2;
        int i2 = i(obj.hashCode());
        k[] kVarArr = this.a;
        if (kVarArr != null && (length = kVarArr.length) > 0 && (kVarK = k(kVarArr, (length - 1) & i2)) != null) {
            int i3 = kVarK.a;
            if (i3 == i2) {
                Object obj3 = kVarK.b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return (V) kVarK.c;
                }
            } else if (i3 < 0) {
                k kVarA = kVarK.a(i2, obj);
                if (kVarA != null) {
                    return (V) kVarA.c;
                }
                return null;
            }
            while (true) {
                kVarK = kVarK.d;
                if (kVarK == null) {
                    break;
                }
                if (kVarK.a == i2 && ((obj2 = kVarK.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    break;
                }
            }
            return (V) kVarK.c;
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        k[] kVarArr = this.a;
        int iHashCode = 0;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                iHashCode += kVarA.c.hashCode() ^ kVarA.b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return j() <= 0;
    }

    final long j() {
        c[] cVarArr = this.c;
        long j2 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j2 += cVar.value;
                }
            }
        }
        return j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        KeySetView keySetView = this.d;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.d = keySetView2;
        return keySetView2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, java.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        return (V) f(k2, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        o(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v) {
        return (V) f(k2, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        k[] kVarArr = this.a;
        if (kVarArr == null) {
            return;
        }
        o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            k kVarA = oVar.a();
            if (kVarA == null) {
                return;
            }
            Object obj = kVarA.c;
            Object obj2 = kVarA.b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j2 = j();
        if (j2 < 0) {
            return 0;
        }
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j2;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        k[] kVarArr = this.a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        o oVar = new o(kVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        k kVarA = oVar.a();
        if (kVarA != null) {
            while (true) {
                Object obj = kVarA.b;
                Object obj2 = kVarA.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
        r rVar = this.e;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this);
        this.e = rVar2;
        return rVar2;
    }
}
