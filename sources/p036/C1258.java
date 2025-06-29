package p036;

import p166.C2398;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p438.C5081;

/* renamed from: ʼﹶ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1258 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5081[] f5164;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1262 f5165;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC1239[] f5166;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f5167;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2398 f5168;

    public C1258(C5081[] c5081Arr, InterfaceC1239[] interfaceC1239Arr, C2398 c2398, C1262 c1262) {
        AbstractC4464.m10142(c5081Arr.length == interfaceC1239Arr.length);
        this.f5164 = c5081Arr;
        this.f5166 = (InterfaceC1239[]) interfaceC1239Arr.clone();
        this.f5168 = c2398;
        this.f5165 = c1262;
        this.f5167 = c5081Arr.length;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m4487(int i) {
        return this.f5164[i] != null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m4488(C1258 c1258, int i) {
        return c1258 != null && AbstractC4470.m10194(this.f5164[i], c1258.f5164[i]) && AbstractC4470.m10194(this.f5166[i], c1258.f5166[i]);
    }
}
