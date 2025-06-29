package j$.util.concurrent;

/* loaded from: classes2.dex */
final class g extends k {
    final k[] e;

    g(k[] kVarArr) {
        super(-1, null, null);
        this.e = kVarArr;
    }

    @Override // j$.util.concurrent.k
    final k a(int i, Object obj) {
        int length;
        k kVarK;
        Object obj2;
        k[] kVarArr = this.e;
        loop0: while (obj != null && kVarArr != null && (length = kVarArr.length) != 0 && (kVarK = ConcurrentHashMap.k(kVarArr, (length - 1) & i)) != null) {
            do {
                int i2 = kVarK.a;
                if (i2 == i && ((obj2 = kVarK.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return kVarK;
                }
                if (i2 >= 0) {
                    kVarK = kVarK.d;
                } else {
                    if (!(kVarK instanceof g)) {
                        return kVarK.a(i, obj);
                    }
                    kVarArr = ((g) kVarK).e;
                }
            } while (kVarK != null);
        }
        return null;
    }
}
