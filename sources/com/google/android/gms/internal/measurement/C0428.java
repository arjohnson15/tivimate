package com.google.android.gms.internal.measurement;

import android.content.Context;
import p353.InterfaceC4012;

/* renamed from: com.google.android.gms.internal.measurement.ˑˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0428 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC4012 f2726;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f2727;

    public C0428(Context context, InterfaceC4012 interfaceC4012) {
        this.f2727 = context;
        this.f2726 = interfaceC4012;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0428) {
            C0428 c0428 = (C0428) obj;
            if (this.f2727.equals(c0428.f2727)) {
                InterfaceC4012 interfaceC4012 = c0428.f2726;
                InterfaceC4012 interfaceC40122 = this.f2726;
                if (interfaceC40122 != null ? interfaceC40122.equals(interfaceC4012) : interfaceC4012 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f2727.hashCode() ^ 1000003) * 1000003;
        InterfaceC4012 interfaceC4012 = this.f2726;
        return iHashCode ^ (interfaceC4012 == null ? 0 : interfaceC4012.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f2727) + ", hermeticFileOverrides=" + String.valueOf(this.f2726) + "}";
    }
}
