package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p334.C3789;

/* loaded from: classes2.dex */
public final class n extends AbstractC5396a implements Serializable {
    public static final n o;
    private static final long serialVersionUID = 3127340209035924785L;
    private final transient String d = "Hijrah-umalqura";
    private final transient String e = "islamic-umalqura";
    private volatile transient boolean f;
    private transient int[] g;
    private transient int h;
    private transient int i;
    private transient int j;
    private transient int k;
    private transient int l;
    private transient int m;
    private transient int n;

    static {
        n nVar = new n();
        o = nVar;
        AbstractC5396a.s(nVar, "Hijrah");
        AbstractC5396a.s(nVar, "islamic");
    }

    private n() {
    }

    private void T() {
        if (this.f) {
            return;
        }
        String str = this.d;
        try {
            HashMap map = new HashMap();
            int[][] iArrC0 = c0();
            int iW = (int) LocalDate.of(1882, 11, 12).w();
            for (int i = 1300; i <= 1600; i++) {
                int[] iArr = iArrC0[i - 1300];
                if (iArr.length != 12) {
                    throw new IllegalArgumentException("wrong number of months on line: " + Arrays.toString(iArr) + "; count: " + iArr.length);
                }
                map.put(Integer.valueOf(i), iArr);
            }
            if (!str.equals("Hijrah-umalqura")) {
                throw new IllegalArgumentException("Configuration is for a different calendar: Hijrah-umalqura");
            }
            if (!this.e.equals("islamic-umalqura")) {
                throw new IllegalArgumentException("Configuration is for a different calendar type: islamic-umalqura");
            }
            if (iW == 0) {
                throw new IllegalArgumentException("Configuration does not contain a ISO start date");
            }
            this.j = 15600;
            this.h = iW;
            int[] iArrV = V(iW, map);
            this.g = iArrV;
            this.i = iArrV[3612];
            for (int i2 = 1300; i2 < 1600; i2++) {
                int iD0 = d0(i2, 12);
                this.m = Math.min(this.m, iD0);
                this.n = Math.max(this.n, iD0);
            }
            this.f = true;
        } catch (Exception e) {
            throw new j$.time.c("Unable to initialize HijrahCalendar: " + str, e);
        }
    }

    private int[] V(int i, HashMap map) {
        int[] iArr = new int[3613];
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MIN_VALUE;
        int i2 = 0;
        for (int i3 = 1300; i3 <= 1600; i3++) {
            int[] iArr2 = (int[]) map.get(Integer.valueOf(i3));
            int i4 = 0;
            while (i4 < 12) {
                int i5 = iArr2[i4];
                int i6 = i2 + 1;
                iArr[i2] = i;
                if (i5 < 29 || i5 > 32) {
                    throw new IllegalArgumentException("Invalid month length in year: 1300");
                }
                i += i5;
                this.k = Math.min(this.k, i5);
                this.l = Math.max(this.l, i5);
                i4++;
                i2 = i6;
            }
        }
        int i7 = i2 + 1;
        iArr[i2] = i;
        if (i7 == 3613) {
            return iArr;
        }
        throw new IllegalStateException("Did not fill epochMonths exactly: ndx = " + i7 + " should be 3613");
    }

    private int W(int i) {
        return (i + this.j) / 12;
    }

    private static int[][] c0() {
        return new int[][]{new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 30, 30, 29, 30, 30, 29, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29, 29}, new int[]{29, 30, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 29, 30, 30, 29, 30, 30, 29, 30, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 30, 30, 29, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 30, 30, 29, 29}, new int[]{30, 30, 29, 30, 29, 29, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 30, 30, 29}, new int[]{30, 29, 30, 29, 29, 30, 29, 29, 30, 30, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 29, 30, 29, 30, 30, 30}, new int[]{29, 30, 30, 29, 30, 29, 29, 29, 30, 29, 30, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 29, 30, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30}, new int[]{30, 30, 29, 30, 29, 29, 30, 29, 29, 30, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29, 29}, new int[]{30, 29, 29, 30, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{29, 29, 30, 29, 30, 29, 30, 30, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 30, 29, 30, 29, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 30, 30, 29, 30, 29, 29}, new int[]{30, 29, 29, 30, 29, 30, 30, 30, 29, 30, 30, 29}, new int[]{29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 29, 30, 29, 29}, new int[]{30, 29, 30, 30, 30, 30, 29, 30, 29, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 30, 29, 30, 30, 29, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 29, 30, 30, 30, 29, 29}, new int[]{30, 29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 29, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 29}, new int[]{30, 29, 29, 30, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30, 30}, new int[]{29, 29, 30, 29, 30, 29, 29, 30, 29, 30, 30, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 29, 29, 30, 30}, new int[]{29, 30, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 30, 29, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 29, 30, 29, 30, 29, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 30, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 29, 30, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 29, 30, 29, 30, 30, 29, 30, 30, 30}, new int[]{29, 30, 29, 29, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 29}, new int[]{30, 29, 29, 30, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{29, 30, 29, 29, 30, 30, 29, 30, 30, 30, 29, 30}, new int[]{29, 29, 30, 29, 29, 30, 30, 29, 30, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 29, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 30, 29, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 29, 30, 29, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 30, 29, 29, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{30, 30, 29, 30, 29, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 30, 30, 29, 30, 29, 29, 30, 29, 29, 30, 29}, new int[]{30, 30, 30, 29, 30, 30, 29, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 30, 30, 29, 30, 29, 29, 30}, new int[]{30, 29, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 29, 30, 30}, new int[]{30, 30, 29, 30, 29, 30, 29, 29, 30, 29, 29, 30}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 30, 30, 29, 29, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 30, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 30, 30, 29, 29}, new int[]{29, 30, 29, 29, 30, 29, 30, 30, 30, 30, 29, 30}, new int[]{29, 29, 30, 29, 29, 29, 30, 30, 30, 30, 29, 30}, new int[]{30, 29, 29, 30, 29, 29, 29, 30, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 29, 30, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 30, 29, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 29, 30, 29, 30, 29, 29, 30}, new int[]{30, 29, 30, 30, 30, 29, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 30, 29, 30, 29, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 30, 29, 30, 30, 29, 29, 30, 29, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 30, 29}, new int[]{30, 30, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 29, 30, 29, 30, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 29, 30, 29, 30, 30, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 29, 30, 29, 30, 30, 30}, new int[]{29, 30, 30, 29, 29, 30, 29, 29, 30, 29, 30, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 30, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 30, 30, 29, 30}, new int[]{29, 30, 29, 29, 30, 29, 29, 30, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30}, new int[]{30, 30, 29, 30, 29, 29, 29, 30, 29, 30, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 30, 29, 29, 30, 29, 30, 29}, new int[]{29, 30, 30, 29, 30, 30, 30, 29, 29, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 29, 30, 30, 30, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 30, 30, 30, 29, 30, 29, 29, 30, 29}, new int[]{29, 30, 29, 30, 30, 30, 29, 30, 30, 29, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 29, 30, 29}, new int[]{30, 29, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 29, 30, 30, 29, 30, 29, 30, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 30, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 29, 29, 30, 30, 30}, new int[]{29, 30, 30, 29, 30, 29, 29, 30, 29, 29, 30, 30}, new int[]{29, 30, 30, 30, 29, 30, 29, 29, 30, 29, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 29, 30, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 29, 30, 29, 30, 30}, new int[]{30, 30, 29, 30, 29, 30, 29, 29, 29, 30, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 29, 29, 30, 30}, new int[]{29, 30, 29, 30, 30, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29}, new int[]{29, 30, 29, 29, 30, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 29, 30, 29, 29, 30, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 29, 30, 29, 30, 29, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 30, 30, 29, 30, 29, 30}, new int[]{29, 29, 29, 30, 29, 30, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 29, 29, 30, 29, 30, 30, 29, 30, 30, 30}, new int[]{29, 29, 30, 29, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 29}, new int[]{30, 29, 29, 30, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{29, 30, 29, 29, 30, 30, 30, 29, 30, 30, 29, 30}, new int[]{29, 29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30}, new int[]{30, 29, 29, 29, 30, 29, 30, 30, 29, 30, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 29, 30, 30, 29}, new int[]{30, 30, 29, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 30, 29, 29, 30, 29, 30, 29, 29, 30, 30}, new int[]{29, 30, 30, 30, 29, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 30, 29, 30, 30, 29, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 29, 30, 29, 29, 30, 29, 30}, new int[]{30, 30, 29, 30, 30, 29, 29, 30, 29, 29, 30, 29}, new int[]{30, 30, 30, 29, 30, 30, 29, 29, 30, 29, 29, 30}, new int[]{29, 30, 30, 29, 30, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 30, 29, 30, 29, 29, 30}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{30, 30, 29, 30, 29, 29, 30, 29, 30, 29, 29, 30}, new int[]{30, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 30, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 29, 29, 30, 30, 30, 29, 30, 30}, new int[]{29, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30, 30}, new int[]{30, 29, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 30, 30, 29, 30}, new int[]{29, 30, 29, 29, 29, 30, 29, 30, 30, 30, 30, 29}, new int[]{30, 29, 30, 29, 29, 29, 30, 29, 30, 30, 30, 29}, new int[]{30, 30, 29, 29, 30, 29, 29, 30, 30, 29, 30, 29}, new int[]{30, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 30, 29, 29, 30, 29}, new int[]{29, 30, 30, 29, 30, 29, 30, 30, 30, 29, 29, 30}, new int[]{29, 30, 29, 29, 30, 29, 30, 30, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 29, 30, 29, 30, 30, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 30, 30, 29, 30}, new int[]{30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29, 29}, new int[]{30, 29, 30, 30, 30, 29, 30, 30, 29, 30, 29, 29}, new int[]{29, 30, 29, 30, 30, 29, 30, 30, 30, 29, 29, 30}, new int[]{29, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 29, 30, 29, 30, 29, 30, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 29}, new int[]{30, 30, 30, 29, 30, 30, 29, 30, 29, 29, 29, 30}, new int[]{29, 30, 30, 29, 30, 30, 30, 29, 30, 29, 29, 29}, new int[]{30, 29, 30, 30, 29, 30, 30, 29, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 30, 29, 30, 30, 29, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 30, 29, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 30, 29, 30, 30, 29, 30, 29, 30, 29, 29, 29}, new int[]{30, 30, 29, 30, 30, 30, 29, 30, 29, 30, 29, 29}, new int[]{29, 30, 30, 29, 30, 30, 29, 30, 30, 29, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 30, 29, 30, 30}, new int[]{29, 29, 30, 29, 30, 29, 29, 30, 30, 30, 29, 30}, new int[]{29, 30, 30, 29, 29, 29, 30, 29, 30, 29, 30, 30}, new int[]{30, 29, 30, 30, 29, 29, 29, 30, 29, 30, 29, 30}, new int[]{30, 29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 30, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 29, 30, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 30, 30, 29}, new int[]{30, 29, 29, 30, 29, 29, 30, 29, 30, 30, 30, 29}, new int[]{30, 30, 29, 29, 30, 29, 29, 29, 30, 30, 30, 30}, new int[]{29, 30, 29, 30, 29, 29, 30, 29, 29, 30, 30, 30}, new int[]{29, 30, 30, 29, 30, 29, 29, 30, 29, 30, 29, 30}, new int[]{29, 30, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29}, new int[]{30, 29, 30, 29, 30, 30, 29, 30, 29, 30, 30, 29}, new int[]{29, 30, 29, 30, 29, 30, 29, 30, 30, 30, 29, 30}, new int[]{29, 29, 30, 29, 30, 29, 29, 30, 30, 30, 29, 30}};
    }

    private int d0(int i, int i2) {
        int i3 = (i * 12) - this.j;
        int[] iArr = this.g;
        return iArr[i2 + i3] - iArr[i3];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate G(int i, int i2, int i3) {
        return p.Y(this, i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC5396a, j$.time.chrono.k
    public final ChronoLocalDate J(Map map, j$.time.format.F f) {
        return (p) super.J(map, f);
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        T();
        if (!(aVar instanceof j$.time.temporal.a)) {
            return aVar.n();
        }
        switch (m.a[aVar.ordinal()]) {
            case 1:
                return j$.time.temporal.t.k(1L, this.k, this.l);
            case 2:
                return j$.time.temporal.t.j(1L, this.n);
            case 3:
                return j$.time.temporal.t.j(1L, 5L);
            case 4:
            case 5:
                return j$.time.temporal.t.j(W(0), W(this.g.length - 1) - 1);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return j$.time.temporal.t.j(1L, 1L);
            default:
                return aVar.n();
        }
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return j.T(this, instant, zoneId);
    }

    @Override // j$.time.chrono.k
    public final List N() {
        return j$.com.android.tools.r8.a.l(q.values());
    }

    @Override // j$.time.chrono.k
    public final boolean Q(long j) {
        T();
        return j >= ((long) W(0)) && j <= ((long) (W(this.g.length - 1) - 1)) && d0((int) j, 12) > 354;
    }

    @Override // j$.time.chrono.k
    public final l R(int i) {
        if (i == 1) {
            return q.AH;
        }
        throw new j$.time.c("invalid Hijrah era");
    }

    final int U(long j) {
        if (j >= W(0) && j <= W(this.g.length - 1) - 1) {
            return (int) j;
        }
        throw new j$.time.c("Invalid Hijrah year: " + j);
    }

    final int X(int i, int i2) {
        return d0(i, i2 - 1);
    }

    final long Y(int i, int i2, int i3) {
        T();
        if (i2 < 1 || i2 > 12) {
            throw new j$.time.c("Invalid Hijrah month: " + i2);
        }
        int i4 = (i2 - 1) + ((i * 12) - this.j);
        if (i4 < 0 || i4 >= this.g.length) {
            throw new j$.time.c("Invalid Hijrah date, year: " + i + ", month: " + i2);
        }
        if (i3 >= 1 && i3 <= a0(i, i2)) {
            return (i3 - 1) + this.g[i4];
        }
        throw new j$.time.c("Invalid Hijrah day of month: " + i3);
    }

    final int[] Z(int i) {
        T();
        if (i < this.h || i >= this.i) {
            throw new j$.time.c("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(this.g, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return new int[]{W(iBinarySearch), ((this.j + iBinarySearch) % 12) + 1, (i - this.g[iBinarySearch]) + 1};
    }

    final int a0(int i, int i2) {
        int i3 = (i2 - 1) + ((i * 12) - this.j);
        if (i3 >= 0) {
            int[] iArr = this.g;
            if (i3 < iArr.length) {
                return iArr[i3 + 1] - iArr[i3];
            }
        }
        throw new j$.time.c("Invalid Hijrah date, year: " + i + ", month: " + i2);
    }

    final int b0(int i) {
        return d0(i, 12);
    }

    @Override // j$.time.chrono.k
    public final int g(l lVar, int i) {
        if (lVar instanceof q) {
            return i;
        }
        throw new ClassCastException("Era must be HijrahEra");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate l(long j) {
        return p.Z(this, j);
    }

    @Override // j$.time.chrono.k
    public final String m() {
        return this.d;
    }

    @Override // j$.time.chrono.AbstractC5396a
    public final ChronoLocalDate p() {
        return p.Z(this, LocalDate.e0(j$.time.b.b()).v(j$.time.temporal.a.EPOCH_DAY));
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate q(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof p ? (p) temporalAccessor : p.Z(this, temporalAccessor.v(j$.time.temporal.a.EPOCH_DAY));
    }

    @Override // j$.time.chrono.k
    public final String u() {
        return this.e;
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate x(int i, int i2) {
        p pVarY = p.Y(this, i, 1, 1);
        if (i2 <= pVarY.O()) {
            return pVarY.U(i2 - 1);
        }
        throw new j$.time.c("Invalid dayOfYear: " + i2);
    }
}
