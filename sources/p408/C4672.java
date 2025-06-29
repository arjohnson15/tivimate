package p408;

import com.bumptech.glide.ˑʽ;
import java.util.Arrays;
import p180.AbstractC2500;

/* renamed from: ﹳˈ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4672 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f17808;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f17809;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f17810;

    public C4672(String str, String str2, String str3) {
        this.f17808 = str2;
        this.f17810 = str;
        this.f17809 = m10572(str3);
    }

    public C4672(C4672 c4672, String str) {
        this.f17810 = c4672.f17810;
        if (!ˑʽ.ᵎˏ(c4672.f17808)) {
            throw new IllegalArgumentException("Can only make child SmbPath of fully specified SmbPath");
        }
        this.f17808 = c4672.f17808;
        if (!ˑʽ.ᵎˏ(c4672.f17809)) {
            this.f17809 = m10572(str);
            return;
        }
        this.f17809 = c4672.f17809 + "\\" + m10572(str);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m10572(String str) {
        return ˑʽ.ᵎˏ(str) ? str.replace('/', '\\') : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4672.class != obj.getClass()) {
            return false;
        }
        C4672 c4672 = (C4672) obj;
        return AbstractC2500.m6612(this.f17810, c4672.f17810) && AbstractC2500.m6612(this.f17808, c4672.f17808) && AbstractC2500.m6612(this.f17809, c4672.f17809);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17810, this.f17808, this.f17809});
    }

    public final String toString() {
        return m10573();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String m10573() {
        StringBuilder sb = new StringBuilder("\\\\");
        sb.append(this.f17810);
        String str = this.f17808;
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) != '\\') {
                sb.append("\\");
            }
            sb.append(str);
            String str2 = this.f17809;
            if (ˑʽ.ᵎˏ(str2)) {
                sb.append("\\");
                sb.append(str2);
            }
        }
        return sb.toString();
    }
}
