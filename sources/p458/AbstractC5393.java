package p458;

import java.util.LinkedHashMap;
import p070.AbstractC1549;

/* renamed from: ﾞﾞ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5393 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final LinkedHashMap f20868 = new LinkedHashMap();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC5393) && AbstractC1549.m5138(this.f20868, ((AbstractC5393) obj).f20868);
    }

    public final int hashCode() {
        return this.f20868.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f20868 + ')';
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public abstract Object mo12171(InterfaceC5392 interfaceC5392);
}
