package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p015.C1067;
import p031.C1185;
import p031.C1188;
import p031.C1194;
import p031.C1200;
import p032.InterfaceC1207;
import p033.C1219;
import p060.C1353;
import p060.C1354;
import p119.C1860;
import p119.InterfaceC1859;
import p119.InterfaceC1862;
import p210.C2804;
import p288.C3394;
import ˈˉ.ﹳﹳ;
import ﹶⁱ.ـﹶ;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m3256(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C1185 c1185M4247 = C1194.m4247(C1353.class);
        c1185M4247.m4240(new C1188(2, 0, C1354.class));
        c1185M4247.f4906 = new C1219(4);
        arrayList.add(c1185M4247.m4238());
        C1200 c1200 = new C1200(InterfaceC1207.class, Executor.class);
        C1185 c1185 = new C1185(C1860.class, new Class[]{InterfaceC1859.class, InterfaceC1862.class});
        c1185.m4240(C1188.m4242(Context.class));
        c1185.m4240(C1188.m4242(C2804.class));
        c1185.m4240(new C1188(2, 0, ﹳﹳ.class));
        c1185.m4240(new C1188(1, 1, C1353.class));
        c1185.m4240(new C1188(c1200, 1, 0));
        c1185.f4906 = new C1067(7, c1200);
        arrayList.add(c1185.m4238());
        arrayList.add(ـﹶ.ᴵʿ("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(ـﹶ.ᴵʿ("fire-core", "21.0.0"));
        arrayList.add(ـﹶ.ᴵʿ("device-name", m3256(Build.PRODUCT)));
        arrayList.add(ـﹶ.ᴵʿ("device-model", m3256(Build.DEVICE)));
        arrayList.add(ـﹶ.ᴵʿ("device-brand", m3256(Build.BRAND)));
        arrayList.add(ـﹶ.ʿˏ("android-target-sdk", new C1219(17)));
        arrayList.add(ـﹶ.ʿˏ("android-min-sdk", new C1219(18)));
        arrayList.add(ـﹶ.ʿˏ("android-platform", new C1219(19)));
        arrayList.add(ـﹶ.ʿˏ("android-installer", new C1219(20)));
        try {
            C3394.f13242.getClass();
            str = "2.0.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(ـﹶ.ᴵʿ("kotlin", str));
        }
        return arrayList;
    }
}
