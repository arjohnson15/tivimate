package p065;

import java.util.Iterator;
import java.util.TreeMap;
import p034.InterfaceC1226;
import p034.InterfaceC1230;

/* renamed from: ʾᵔ.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1529 implements InterfaceC1226, InterfaceC1230 {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final TreeMap f6210 = new TreeMap();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public volatile String f6211;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final String[] f6212;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f6213;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long[] f6214;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final double[] f6215;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f6216;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final byte[][] f6217;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int[] f6218;

    public C1529(int i) {
        this.f6216 = i;
        int i2 = i + 1;
        this.f6218 = new int[i2];
        this.f6214 = new long[i2];
        this.f6215 = new double[i2];
        this.f6212 = new String[i2];
        this.f6217 = new byte[i2][];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p034.InterfaceC1226
    /* renamed from: ʽᐧ */
    public final void mo4396(InterfaceC1230 interfaceC1230) {
        int i = this.f6213;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f6218[i2];
            if (i3 == 1) {
                interfaceC1230.mo4421(i2);
            } else if (i3 == 2) {
                interfaceC1230.mo4419(i2, this.f6214[i2]);
            } else if (i3 == 3) {
                interfaceC1230.mo4422(i2, this.f6215[i2]);
            } else if (i3 == 4) {
                String str = this.f6212[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC1230.mo4420(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.f6217[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC1230.mo4423(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // p034.InterfaceC1230
    /* renamed from: ˉⁱ */
    public final void mo4419(int i, long j) {
        this.f6218[i] = 2;
        this.f6214[i] = j;
    }

    @Override // p034.InterfaceC1230
    /* renamed from: ˋˊ */
    public final void mo4420(int i, String str) {
        this.f6218[i] = 4;
        this.f6212[i] = str;
    }

    @Override // p034.InterfaceC1226
    /* renamed from: ˑʽ */
    public final String mo4397() {
        String str = this.f6211;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5111() {
        TreeMap treeMap = f6210;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f6216), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // p034.InterfaceC1230
    /* renamed from: ٴˎ */
    public final void mo4421(int i) {
        this.f6218[i] = 1;
    }

    @Override // p034.InterfaceC1230
    /* renamed from: ᐧʻ */
    public final void mo4422(int i, double d) {
        this.f6218[i] = 3;
        this.f6215[i] = d;
    }

    @Override // p034.InterfaceC1230
    /* renamed from: ᵔﹳ */
    public final void mo4423(int i, byte[] bArr) {
        this.f6218[i] = 5;
        this.f6217[i] = bArr;
    }
}
