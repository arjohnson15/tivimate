package p076;

import java.util.Arrays;
import p383.AbstractC4470;

/* renamed from: ʿˉ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1653 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f6447;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f6450;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean f6448 = true;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f6445 = 65536;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f6446 = 0;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C1663[] f6449 = new C1663[100];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized void m5320() {
        int iMax = Math.max(0, AbstractC4470.m10196(this.f6447, this.f6445) - this.f6450);
        int i = this.f6446;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f6449, iMax, i, (Object) null);
        this.f6446 = iMax;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void m5321(int i) {
        boolean z = i < this.f6447;
        this.f6447 = i;
        if (z) {
            m5320();
        }
    }
}
