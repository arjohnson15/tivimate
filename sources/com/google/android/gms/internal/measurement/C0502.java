package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0002;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ᵎˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0502 implements InterfaceC0566 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f2847;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0502 f2839 = new C0502(0);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C0502 f2842 = new C0502(1);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C0502 f2845 = new C0502(2);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C0502 f2840 = new C0502(3);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C0502 f2843 = new C0502(4);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C0502 f2844 = new C0502(5);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C0502 f2841 = new C0502(6);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C0502 f2846 = new C0502(7);

    public /* synthetic */ C0502(int i) {
        this.f2847 = i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0566
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo2337(int i) {
        switch (this.f2847) {
            case 0:
                if (AbstractC0002.m54(i) != 0) {
                }
                break;
            case 1:
                switch (i) {
                }
            case 2:
                if (i == 0 || i == 1 || i == 2) {
                }
                break;
            case 3:
                if (AbstractC0002.m35(i) != 0) {
                }
                break;
            case 4:
                if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                }
                break;
            case 5:
                if (i == 0 || i == 1) {
                }
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                if (i == 1 || i == 2) {
                }
                break;
            default:
                if (AbstractC0002.m48(i) != 0) {
                }
                break;
        }
        return true;
    }
}
