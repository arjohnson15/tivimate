package p192;

import java.nio.ByteBuffer;
import p250.C3125;
import p250.C3126;
import ﹶˋ.ـﹶ;

/* renamed from: ˎˉ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2655 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final ThreadLocal f10530 = new ThreadLocal();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ـﹶ f10531;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public volatile int f10532 = 0;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f10533;

    public C2655(ـﹶ r2, int i) {
        this.f10531 = r2;
        this.f10533 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C3126 c3126M6834 = m6834();
        int iM4692 = c3126M6834.m4692(4);
        sb.append(Integer.toHexString(iM4692 != 0 ? ((ByteBuffer) c3126M6834.f5491).getInt(iM4692 + c3126M6834.f5492) : 0));
        sb.append(", codepoints:");
        int iM6833 = m6833();
        for (int i = 0; i < iM6833; i++) {
            sb.append(Integer.toHexString(m6835(i)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m6833() {
        C3126 c3126M6834 = m6834();
        int iM4692 = c3126M6834.m4692(16);
        if (iM4692 == 0) {
            return 0;
        }
        int i = iM4692 + c3126M6834.f5492;
        return ((ByteBuffer) c3126M6834.f5491).getInt(((ByteBuffer) c3126M6834.f5491).getInt(i) + i);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3126 m6834() {
        ThreadLocal threadLocal = f10530;
        C3126 c3126 = (C3126) threadLocal.get();
        if (c3126 == null) {
            c3126 = new C3126();
            threadLocal.set(c3126);
        }
        C3125 c3125 = (C3125) this.f10531.ˆʿ;
        int iM4692 = c3125.m4692(6);
        if (iM4692 != 0) {
            int i = iM4692 + c3125.f5492;
            int i2 = (this.f10533 * 4) + ((ByteBuffer) c3125.f5491).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c3125.f5491).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c3125.f5491;
            c3126.f5491 = byteBuffer;
            if (byteBuffer != null) {
                c3126.f5492 = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c3126.f5489 = i4;
                c3126.f5490 = ((ByteBuffer) c3126.f5491).getShort(i4);
            } else {
                c3126.f5492 = 0;
                c3126.f5489 = 0;
                c3126.f5490 = 0;
            }
        }
        return c3126;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m6835(int i) {
        C3126 c3126M6834 = m6834();
        int iM4692 = c3126M6834.m4692(16);
        if (iM4692 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c3126M6834.f5491;
        int i2 = iM4692 + c3126M6834.f5492;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }
}
