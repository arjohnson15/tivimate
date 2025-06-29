package p036;

import p166.C2433;
import p383.AbstractC4464;

/* renamed from: ʼﹶ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1257 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int[] f5162;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2433 f5163;

    public C1257(C2433 c2433, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC4464.m10147("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f5163 = c2433;
        this.f5162 = iArr;
    }
}
