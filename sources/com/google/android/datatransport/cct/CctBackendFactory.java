package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import p135.C2095;
import p138.AbstractC2112;
import p138.C2110;
import p138.InterfaceC2115;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public InterfaceC2115 create(AbstractC2112 abstractC2112) {
        Context context = ((C2110) abstractC2112).f8336;
        C2110 c2110 = (C2110) abstractC2112;
        return new C2095(context, c2110.f8334, c2110.f8335);
    }
}
