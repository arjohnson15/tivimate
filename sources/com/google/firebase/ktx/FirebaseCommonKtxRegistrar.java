package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import p013.AbstractC1037;
import p031.C1185;
import p031.C1188;
import p031.C1194;
import p031.C1200;
import p032.InterfaceC1205;
import p032.InterfaceC1206;
import p032.InterfaceC1207;
import p032.InterfaceC1208;
import p072.AbstractC1636;
import p104.C1793;

@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1194> getComponents() {
        C1185 c1185M4245 = C1194.m4245(new C1200(InterfaceC1207.class, AbstractC1636.class));
        c1185M4245.m4240(new C1188(new C1200(InterfaceC1207.class, Executor.class), 1, 0));
        c1185M4245.f4906 = C1793.f6932;
        C1194 c1194M4238 = c1185M4245.m4238();
        C1185 c1185M42452 = C1194.m4245(new C1200(InterfaceC1206.class, AbstractC1636.class));
        c1185M42452.m4240(new C1188(new C1200(InterfaceC1206.class, Executor.class), 1, 0));
        c1185M42452.f4906 = C1793.f6934;
        C1194 c1194M42382 = c1185M42452.m4238();
        C1185 c1185M42453 = C1194.m4245(new C1200(InterfaceC1205.class, AbstractC1636.class));
        c1185M42453.m4240(new C1188(new C1200(InterfaceC1205.class, Executor.class), 1, 0));
        c1185M42453.f4906 = C1793.f6935;
        C1194 c1194M42383 = c1185M42453.m4238();
        C1185 c1185M42454 = C1194.m4245(new C1200(InterfaceC1208.class, AbstractC1636.class));
        c1185M42454.m4240(new C1188(new C1200(InterfaceC1208.class, Executor.class), 1, 0));
        c1185M42454.f4906 = C1793.f6933;
        return AbstractC1037.m4011(c1194M4238, c1194M42382, c1194M42383, c1185M42454.m4238());
    }
}
