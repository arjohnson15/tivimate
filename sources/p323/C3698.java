package p323;

import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ᴵˊ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3698 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f14252;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f14253;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final long f14254;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long[] f14255;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3697 f14256;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long[] f14257;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int[] f14258;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int[] f14259;

    public C3698(C3697 c3697, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        AbstractC4464.m10142(iArr.length == jArr2.length);
        AbstractC4464.m10142(jArr.length == jArr2.length);
        AbstractC4464.m10142(iArr2.length == jArr2.length);
        this.f14256 = c3697;
        this.f14255 = jArr;
        this.f14259 = iArr;
        this.f14253 = i;
        this.f14257 = jArr2;
        this.f14258 = iArr2;
        this.f14254 = j;
        this.f14252 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m8655(long j) {
        long[] jArr = this.f14257;
        for (int iM10163 = AbstractC4470.m10163(jArr, j, true); iM10163 < jArr.length; iM10163++) {
            if ((this.f14258[iM10163] & 1) != 0) {
                return iM10163;
            }
        }
        return -1;
    }
}
