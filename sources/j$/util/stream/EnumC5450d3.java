package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class EnumC5450d3 {
    public static final EnumC5450d3 DISTINCT;
    public static final EnumC5450d3 ORDERED;
    public static final EnumC5450d3 SHORT_CIRCUIT;
    public static final EnumC5450d3 SIZED;
    public static final EnumC5450d3 SORTED;
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;
    static final int o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;
    static final int t;
    static final int u;
    private static final /* synthetic */ EnumC5450d3[] v;
    private final EnumMap a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    static {
        EnumC5445c3 enumC5445c3 = EnumC5445c3.SPLITERATOR;
        C5440b3 c5440b3A = A(enumC5445c3);
        EnumC5445c3 enumC5445c32 = EnumC5445c3.STREAM;
        c5440b3A.a(enumC5445c32);
        EnumC5445c3 enumC5445c33 = EnumC5445c3.OP;
        c5440b3A.a.put((EnumMap) enumC5445c33, (EnumC5445c3) 3);
        EnumC5450d3 enumC5450d3 = new EnumC5450d3("DISTINCT", 0, 0, c5440b3A);
        DISTINCT = enumC5450d3;
        C5440b3 c5440b3A2 = A(enumC5445c3);
        c5440b3A2.a(enumC5445c32);
        c5440b3A2.a.put((EnumMap) enumC5445c33, (EnumC5445c3) 3);
        EnumC5450d3 enumC5450d32 = new EnumC5450d3("SORTED", 1, 1, c5440b3A2);
        SORTED = enumC5450d32;
        C5440b3 c5440b3A3 = A(enumC5445c3);
        c5440b3A3.a(enumC5445c32);
        EnumMap enumMap = c5440b3A3.a;
        enumMap.put((EnumMap) enumC5445c33, (EnumC5445c3) 3);
        EnumC5445c3 enumC5445c34 = EnumC5445c3.TERMINAL_OP;
        enumMap.put((EnumMap) enumC5445c34, (EnumC5445c3) 2);
        EnumC5445c3 enumC5445c35 = EnumC5445c3.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) enumC5445c35, (EnumC5445c3) 2);
        EnumC5450d3 enumC5450d33 = new EnumC5450d3("ORDERED", 2, 2, c5440b3A3);
        ORDERED = enumC5450d33;
        C5440b3 c5440b3A4 = A(enumC5445c3);
        c5440b3A4.a(enumC5445c32);
        c5440b3A4.a.put((EnumMap) enumC5445c33, (EnumC5445c3) 2);
        EnumC5450d3 enumC5450d34 = new EnumC5450d3("SIZED", 3, 3, c5440b3A4);
        SIZED = enumC5450d34;
        C5440b3 c5440b3A5 = A(enumC5445c33);
        c5440b3A5.a(enumC5445c34);
        EnumC5450d3 enumC5450d35 = new EnumC5450d3("SHORT_CIRCUIT", 4, 12, c5440b3A5);
        SHORT_CIRCUIT = enumC5450d35;
        v = new EnumC5450d3[]{enumC5450d3, enumC5450d32, enumC5450d33, enumC5450d34, enumC5450d35};
        f = p(enumC5445c3);
        g = p(enumC5445c32);
        h = p(enumC5445c33);
        p(enumC5445c34);
        p(enumC5445c35);
        int i2 = 0;
        for (EnumC5450d3 enumC5450d36 : values()) {
            i2 |= enumC5450d36.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        EnumC5450d3 enumC5450d37 = DISTINCT;
        m = enumC5450d37.c;
        n = enumC5450d37.d;
        EnumC5450d3 enumC5450d38 = SORTED;
        o = enumC5450d38.c;
        p = enumC5450d38.d;
        EnumC5450d3 enumC5450d39 = ORDERED;
        q = enumC5450d39.c;
        r = enumC5450d39.d;
        EnumC5450d3 enumC5450d310 = SIZED;
        s = enumC5450d310.c;
        t = enumC5450d310.d;
        u = SHORT_CIRCUIT.c;
    }

    private EnumC5450d3(String str, int i2, int i3, C5440b3 c5440b3) {
        EnumC5445c3[] enumC5445c3ArrValues = EnumC5445c3.values();
        int length = enumC5445c3ArrValues.length;
        int i4 = 0;
        while (true) {
            EnumMap enumMap = c5440b3.a;
            if (i4 >= length) {
                this.a = enumMap;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
            AbstractC5414b.v(enumMap, enumC5445c3ArrValues[i4], 0);
            i4++;
        }
    }

    private static C5440b3 A(EnumC5445c3 enumC5445c3) {
        C5440b3 c5440b3 = new C5440b3(new EnumMap(EnumC5445c3.class));
        c5440b3.a(enumC5445c3);
        return c5440b3;
    }

    static int C(int i2) {
        return i2 & ((~i2) >> 1) & j;
    }

    static int n(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    private static int p(EnumC5445c3 enumC5445c3) {
        int iIntValue = 0;
        for (EnumC5450d3 enumC5450d3 : values()) {
            iIntValue |= ((Integer) enumC5450d3.a.get(enumC5445c3)).intValue() << enumC5450d3.b;
        }
        return iIntValue;
    }

    static int r(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static EnumC5450d3 valueOf(String str) {
        return (EnumC5450d3) Enum.valueOf(EnumC5450d3.class, str);
    }

    public static EnumC5450d3[] values() {
        return (EnumC5450d3[]) v.clone();
    }

    final boolean s(int i2) {
        return (i2 & this.e) == this.c;
    }

    final boolean v(int i2) {
        int i3 = this.e;
        return (i2 & i3) == i3;
    }
}
