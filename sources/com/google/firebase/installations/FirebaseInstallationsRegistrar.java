package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p031.C1185;
import p031.C1188;
import p031.C1194;
import p031.C1196;
import p031.C1200;
import p031.InterfaceC1203;
import p032.InterfaceC1205;
import p032.InterfaceC1207;
import p033.C1219;
import p119.InterfaceC1859;
import p147.C2250;
import p147.InterfaceC2254;
import p210.C2804;
import p381.ExecutorC4440;
import ˈˉ.ﹳﹳ;
import ﹶⁱ.ـﹶ;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC2254 lambda$getComponents$0(InterfaceC1203 interfaceC1203) {
        return new C2250((C2804) interfaceC1203.mo4256(C2804.class), interfaceC1203.mo4259(InterfaceC1859.class), (ExecutorService) interfaceC1203.mo4255(new C1200(InterfaceC1207.class, ExecutorService.class)), new ExecutorC4440((Executor) interfaceC1203.mo4255(new C1200(InterfaceC1205.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1194> getComponents() {
        C1185 c1185M4247 = C1194.m4247(InterfaceC2254.class);
        c1185M4247.f4905 = "fire-installations";
        c1185M4247.m4240(C1188.m4242(C2804.class));
        c1185M4247.m4240(new C1188(0, 1, InterfaceC1859.class));
        c1185M4247.m4240(new C1188(new C1200(InterfaceC1207.class, ExecutorService.class), 1, 0));
        c1185M4247.m4240(new C1188(new C1200(InterfaceC1205.class, Executor.class), 1, 0));
        c1185M4247.f4906 = new C1219(14);
        C1194 c1194M4238 = c1185M4247.m4238();
        ﹳﹳ r4 = new ﹳﹳ(0);
        C1185 c1185M42472 = C1194.m4247(ﹳﹳ.class);
        c1185M42472.f4903 = 1;
        c1185M42472.f4906 = new C1196(r4);
        return Arrays.asList(c1194M4238, c1185M42472.m4238(), ـﹶ.ᴵʿ("fire-installations", "18.0.0"));
    }
}
