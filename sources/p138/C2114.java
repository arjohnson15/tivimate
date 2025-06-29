package p138;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import p331.C3767;

/* renamed from: ˉˊ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2114 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2116 f8342;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f8343;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3767 f8344;

    public C2114(Context context, C2116 c2116) {
        C3767 c3767 = new C3767(7, context);
        this.f8343 = new HashMap();
        this.f8344 = c3767;
        this.f8342 = c2116;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized InterfaceC2115 m5976(String str) {
        if (this.f8343.containsKey(str)) {
            return (InterfaceC2115) this.f8343.get(str);
        }
        CctBackendFactory cctBackendFactoryM8802 = this.f8344.m8802(str);
        if (cctBackendFactoryM8802 == null) {
            return null;
        }
        C2116 c2116 = this.f8342;
        InterfaceC2115 interfaceC2115Create = cctBackendFactoryM8802.create(new C2110(c2116.f8347, c2116.f8345, c2116.f8346, str));
        this.f8343.put(str, interfaceC2115Create);
        return interfaceC2115Create;
    }
}
