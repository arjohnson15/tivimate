package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0367;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p031.C1185;
import p031.C1188;
import p031.C1189;
import p031.C1194;
import p031.InterfaceC1203;
import p150.C2313;
import p150.ExecutorC2314;
import p150.InterfaceC2315;
import p210.C2804;
import p292.InterfaceC3461;
import p417.AbstractC4753;
import ـˊ.ʿʼ;
import ﹳᴵ.ˉי;
import ﹶⁱ.ـﹶ;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static InterfaceC2315 lambda$getComponents$0(InterfaceC1203 interfaceC1203) {
        C2804 c2804 = (C2804) interfaceC1203.mo4256(C2804.class);
        Context context = (Context) interfaceC1203.mo4256(Context.class);
        InterfaceC3461 interfaceC3461 = (InterfaceC3461) interfaceC1203.mo4256(InterfaceC3461.class);
        AbstractC4753.m10683(c2804);
        AbstractC4753.m10683(context);
        AbstractC4753.m10683(interfaceC3461);
        AbstractC4753.m10683(context.getApplicationContext());
        if (C2313.f9133 == null) {
            synchronized (C2313.class) {
                try {
                    if (C2313.f9133 == null) {
                        Bundle bundle = new Bundle(1);
                        c2804.m7085();
                        if ("[DEFAULT]".equals(c2804.f10931)) {
                            ((C1189) interfaceC3461).m4243(new ExecutorC2314(0), new ˉי(21));
                            bundle.putBoolean("dataCollectionDefaultEnabled", c2804.m7084());
                        }
                        C2313.f9133 = new C2313(C0367.m2047(context, bundle).f2622);
                    }
                } finally {
                }
            }
        }
        return C2313.f9133;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C1194> getComponents() {
        C1185 c1185M4247 = C1194.m4247(InterfaceC2315.class);
        c1185M4247.m4240(C1188.m4242(C2804.class));
        c1185M4247.m4240(C1188.m4242(Context.class));
        c1185M4247.m4240(C1188.m4242(InterfaceC3461.class));
        c1185M4247.f4906 = new ʿʼ(14);
        c1185M4247.m4239();
        return Arrays.asList(c1185M4247.m4238(), ـﹶ.ᴵʿ("fire-analytics", "22.1.0"));
    }
}
