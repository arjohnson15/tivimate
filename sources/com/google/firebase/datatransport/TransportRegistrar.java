package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p031.C1185;
import p031.C1188;
import p031.C1194;
import p031.C1200;
import p031.InterfaceC1203;
import p033.C1219;
import p059.InterfaceC1351;
import p059.InterfaceC1352;
import p123.C1998;
import p135.C2094;
import p183.InterfaceC2532;
import ﹶⁱ.ـﹶ;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC2532 lambda$getComponents$0(InterfaceC1203 interfaceC1203) {
        C1998.m5647((Context) interfaceC1203.mo4256(Context.class));
        return C1998.m5648().m5649(C2094.f8275);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC2532 lambda$getComponents$1(InterfaceC1203 interfaceC1203) {
        C1998.m5647((Context) interfaceC1203.mo4256(Context.class));
        return C1998.m5648().m5649(C2094.f8275);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC2532 lambda$getComponents$2(InterfaceC1203 interfaceC1203) {
        C1998.m5647((Context) interfaceC1203.mo4256(Context.class));
        return C1998.m5648().m5649(C2094.f8273);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1194> getComponents() {
        C1185 c1185M4247 = C1194.m4247(InterfaceC2532.class);
        c1185M4247.f4905 = "fire-transport";
        c1185M4247.m4240(C1188.m4242(Context.class));
        c1185M4247.f4906 = new C1219(1);
        C1194 c1194M4238 = c1185M4247.m4238();
        C1185 c1185M4245 = C1194.m4245(new C1200(InterfaceC1352.class, InterfaceC2532.class));
        c1185M4245.m4240(C1188.m4242(Context.class));
        c1185M4245.f4906 = new C1219(2);
        C1194 c1194M42382 = c1185M4245.m4238();
        C1185 c1185M42452 = C1194.m4245(new C1200(InterfaceC1351.class, InterfaceC2532.class));
        c1185M42452.m4240(C1188.m4242(Context.class));
        c1185M42452.f4906 = new C1219(3);
        return Arrays.asList(c1194M4238, c1194M42382, c1185M42452.m4238(), ـﹶ.ᴵʿ("fire-transport", "19.0.0"));
    }
}
