package p014;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import p254.C3159;
import ʾי.ˑʽ;

/* renamed from: ʻـ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1059 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f4462;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f4465;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f4466;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public ˑʽ f4467;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] f4464 = new byte[8];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayDeque f4461 = new ArrayDeque();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1063 f4463 = new C1063();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long m4052(C3159 c3159, int i) throws EOFException, InterruptedIOException {
        c3159.mo4876(this.f4464, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }
}
