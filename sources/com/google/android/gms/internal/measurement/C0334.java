package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import p200.C2741;
import p353.AbstractC4020;
import p353.C4018;
import p353.InterfaceC4012;
import ـˈ.ˎـ;

/* renamed from: com.google.android.gms.internal.measurement.ʾᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0334 implements InterfaceC4012 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public /* synthetic */ Context f2454;

    @Override // p353.InterfaceC4012
    public final Object get() {
        AbstractC4020 abstractC4020M2025;
        Context context = this.f2454;
        AbstractC4020 abstractC4020 = AbstractC0361.f2605;
        if (abstractC4020 == null) {
            synchronized (AbstractC0361.class) {
                try {
                    abstractC4020 = AbstractC0361.f2605;
                    if (abstractC4020 == null) {
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        C2741 c2741 = AbstractC0546.f2887;
                        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                            if (AbstractC0549.m2471() && !ˎـ.ﾞʽ(context)) {
                                context = ˎـ.ˑʽ(context);
                            }
                            abstractC4020M2025 = AbstractC0361.m2025(context);
                        } else {
                            abstractC4020M2025 = C4018.f15467;
                        }
                        AbstractC0361.f2605 = abstractC4020M2025;
                        abstractC4020 = abstractC4020M2025;
                    }
                } finally {
                }
            }
        }
        return abstractC4020;
    }
}
