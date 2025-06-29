package p138;

import android.content.Context;
import p165.InterfaceC2393;
import ˆʽ.ᵎˏ;

/* renamed from: ˉˊ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2110 extends AbstractC2112 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC2393 f8334;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC2393 f8335;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f8336;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f8337;

    public C2110(Context context, InterfaceC2393 interfaceC2393, InterfaceC2393 interfaceC23932, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f8336 = context;
        if (interfaceC2393 == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f8334 = interfaceC2393;
        if (interfaceC23932 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f8335 = interfaceC23932;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f8337 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2112)) {
            return false;
        }
        AbstractC2112 abstractC2112 = (AbstractC2112) obj;
        if (this.f8336.equals(((C2110) abstractC2112).f8336)) {
            C2110 c2110 = (C2110) abstractC2112;
            if (this.f8334.equals(c2110.f8334) && this.f8335.equals(c2110.f8335) && this.f8337.equals(c2110.f8337)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f8336.hashCode() ^ 1000003) * 1000003) ^ this.f8334.hashCode()) * 1000003) ^ this.f8335.hashCode()) * 1000003) ^ this.f8337.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f8336);
        sb.append(", wallClock=");
        sb.append(this.f8334);
        sb.append(", monotonicClock=");
        sb.append(this.f8335);
        sb.append(", backendName=");
        return ᵎˏ.ˎٴ(sb, this.f8337, "}");
    }
}
