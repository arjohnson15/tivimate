package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5486l {
    public static final /* synthetic */ int a = 0;

    static {
        EnumC5471i enumC5471i = EnumC5471i.CONCURRENT;
        EnumC5471i enumC5471i2 = EnumC5471i.UNORDERED;
        EnumC5471i enumC5471i3 = EnumC5471i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC5471i, enumC5471i2, enumC5471i3));
        Collections.unmodifiableSet(EnumSet.of(enumC5471i, enumC5471i2));
        Collections.unmodifiableSet(EnumSet.of(enumC5471i3));
        Collections.unmodifiableSet(EnumSet.of(enumC5471i2, enumC5471i3));
        Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(enumC5471i2));
    }

    static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}
