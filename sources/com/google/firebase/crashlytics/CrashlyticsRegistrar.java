package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p015.C1067;
import p020.InterfaceC1129;
import p031.C1185;
import p031.C1188;
import p031.C1194;
import p084.C1713;
import p118.C1856;
import p147.InterfaceC2254;
import p150.InterfaceC2315;
import p174.C2473;
import p174.C2474;
import p174.EnumC2475;
import p210.C2804;
import ᵔʼ.ˑʽ;
import ﹶⁱ.ـﹶ;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f3655 = 0;

    static {
        EnumC2475 enumC2475 = EnumC2475.f9830;
        Map map = C2473.f9824;
        if (map.containsKey(enumC2475)) {
            String str = "Dependency " + enumC2475 + " already added.";
            return;
        }
        map.put(enumC2475, new C2474(new C1856(true)));
        String str2 = "Dependency to " + enumC2475 + " added.";
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C1185 c1185M4247 = C1194.m4247(ˑʽ.class);
        c1185M4247.f4905 = "fire-cls";
        c1185M4247.m4240(C1188.m4242(C2804.class));
        c1185M4247.m4240(C1188.m4242(InterfaceC2254.class));
        c1185M4247.m4240(new C1188(0, 2, C1713.class));
        c1185M4247.m4240(new C1188(0, 2, InterfaceC2315.class));
        c1185M4247.m4240(new C1188(0, 2, InterfaceC1129.class));
        c1185M4247.f4906 = new C1067(27, this);
        c1185M4247.m4239();
        return Arrays.asList(c1185M4247.m4238(), ـﹶ.ᴵʿ("fire-cls", "19.0.3"));
    }
}
