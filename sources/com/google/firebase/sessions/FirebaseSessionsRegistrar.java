package com.google.firebase.sessions;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p013.AbstractC1037;
import p031.C1185;
import p031.C1188;
import p031.C1194;
import p031.C1200;
import p031.InterfaceC1203;
import p032.InterfaceC1205;
import p032.InterfaceC1207;
import p072.AbstractC1636;
import p147.InterfaceC2254;
import p183.InterfaceC2532;
import p210.C2804;
import p322.C3669;
import p330.InterfaceC3747;
import p397.C4607;
import p429.C4944;
import p429.C4949;
import p429.C4956;
import p429.C4961;
import p429.C4968;
import p429.C4990;
import p429.InterfaceC4948;
import p429.InterfaceC4980;
import p429.InterfaceC4981;
import ᵢ.ʿʼ;
import ﹶⁱ.ـﹶ;

@Keep
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final C4961 Companion = new C4961();
    private static final C1200 firebaseApp = C1200.m4252(C2804.class);
    private static final C1200 firebaseInstallationsApi = C1200.m4252(InterfaceC2254.class);
    private static final C1200 backgroundDispatcher = new C1200(InterfaceC1207.class, AbstractC1636.class);
    private static final C1200 blockingDispatcher = new C1200(InterfaceC1205.class, AbstractC1636.class);
    private static final C1200 transportFactory = C1200.m4252(InterfaceC2532.class);
    private static final C1200 sessionsSettings = C1200.m4252(C3669.class);
    private static final C1200 sessionLifecycleServiceBinder = C1200.m4252(InterfaceC4980.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4956 getComponents$lambda$0(InterfaceC1203 interfaceC1203) {
        return new C4956((C2804) interfaceC1203.mo4255(firebaseApp), (C3669) interfaceC1203.mo4255(sessionsSettings), (InterfaceC3747) interfaceC1203.mo4255(backgroundDispatcher), (InterfaceC4980) interfaceC1203.mo4255(sessionLifecycleServiceBinder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4990 getComponents$lambda$1(InterfaceC1203 interfaceC1203) {
        return new C4990();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4981 getComponents$lambda$2(InterfaceC1203 interfaceC1203) {
        return new C4968((C2804) interfaceC1203.mo4255(firebaseApp), (InterfaceC2254) interfaceC1203.mo4255(firebaseInstallationsApi), (C3669) interfaceC1203.mo4255(sessionsSettings), new ʿʼ(19, interfaceC1203.mo4254(transportFactory)), (InterfaceC3747) interfaceC1203.mo4255(backgroundDispatcher));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3669 getComponents$lambda$3(InterfaceC1203 interfaceC1203) {
        return new C3669((C2804) interfaceC1203.mo4255(firebaseApp), (InterfaceC3747) interfaceC1203.mo4255(blockingDispatcher), (InterfaceC3747) interfaceC1203.mo4255(backgroundDispatcher), (InterfaceC2254) interfaceC1203.mo4255(firebaseInstallationsApi));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4948 getComponents$lambda$4(InterfaceC1203 interfaceC1203) {
        C2804 c2804 = (C2804) interfaceC1203.mo4255(firebaseApp);
        c2804.m7085();
        return new C4949(c2804.f10936, (InterfaceC3747) interfaceC1203.mo4255(backgroundDispatcher));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4980 getComponents$lambda$5(InterfaceC1203 interfaceC1203) {
        return new C4944((C2804) interfaceC1203.mo4255(firebaseApp));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1194> getComponents() {
        C1185 c1185M4247 = C1194.m4247(C4956.class);
        c1185M4247.f4905 = "fire-sessions";
        C1200 c1200 = firebaseApp;
        c1185M4247.m4240(C1188.m4241(c1200));
        C1200 c12002 = sessionsSettings;
        c1185M4247.m4240(C1188.m4241(c12002));
        C1200 c12003 = backgroundDispatcher;
        c1185M4247.m4240(C1188.m4241(c12003));
        c1185M4247.m4240(C1188.m4241(sessionLifecycleServiceBinder));
        c1185M4247.f4906 = new C4607(3);
        c1185M4247.m4239();
        C1194 c1194M4238 = c1185M4247.m4238();
        C1185 c1185M42472 = C1194.m4247(C4990.class);
        c1185M42472.f4905 = "session-generator";
        c1185M42472.f4906 = new C4607(4);
        C1194 c1194M42382 = c1185M42472.m4238();
        C1185 c1185M42473 = C1194.m4247(InterfaceC4981.class);
        c1185M42473.f4905 = "session-publisher";
        c1185M42473.m4240(new C1188(c1200, 1, 0));
        C1200 c12004 = firebaseInstallationsApi;
        c1185M42473.m4240(C1188.m4241(c12004));
        c1185M42473.m4240(new C1188(c12002, 1, 0));
        c1185M42473.m4240(new C1188(transportFactory, 1, 1));
        c1185M42473.m4240(new C1188(c12003, 1, 0));
        c1185M42473.f4906 = new C4607(5);
        C1194 c1194M42383 = c1185M42473.m4238();
        C1185 c1185M42474 = C1194.m4247(C3669.class);
        c1185M42474.f4905 = "sessions-settings";
        c1185M42474.m4240(new C1188(c1200, 1, 0));
        c1185M42474.m4240(C1188.m4241(blockingDispatcher));
        c1185M42474.m4240(new C1188(c12003, 1, 0));
        c1185M42474.m4240(new C1188(c12004, 1, 0));
        c1185M42474.f4906 = new C4607(6);
        C1194 c1194M42384 = c1185M42474.m4238();
        C1185 c1185M42475 = C1194.m4247(InterfaceC4948.class);
        c1185M42475.f4905 = "sessions-datastore";
        c1185M42475.m4240(new C1188(c1200, 1, 0));
        c1185M42475.m4240(new C1188(c12003, 1, 0));
        c1185M42475.f4906 = new C4607(7);
        C1194 c1194M42385 = c1185M42475.m4238();
        C1185 c1185M42476 = C1194.m4247(InterfaceC4980.class);
        c1185M42476.f4905 = "sessions-service-binder";
        c1185M42476.m4240(new C1188(c1200, 1, 0));
        c1185M42476.f4906 = new C4607(8);
        return AbstractC1037.m4011(c1194M4238, c1194M42382, c1194M42383, c1194M42384, c1194M42385, c1185M42476.m4238(), ـﹶ.ᴵʿ("fire-sessions", "2.0.3"));
    }
}
