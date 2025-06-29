package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0077 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final byte[] f504;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Charset f505 = Charset.forName("UTF-8");

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f504 = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw InvalidProtocolBufferException.m222();
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m563(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static AbstractC0083 m564(Object obj, Object obj2) {
        AbstractC0083 abstractC0083 = (AbstractC0083) ((AbstractC0052) obj);
        AbstractC0018 abstractC0018 = (AbstractC0018) abstractC0083.mo581(5);
        abstractC0018.m281();
        AbstractC0018.m279(abstractC0018.f364, abstractC0083);
        AbstractC0052 abstractC0052 = (AbstractC0052) obj2;
        if (!abstractC0018.f366.getClass().isInstance(abstractC0052)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC0018.m281();
        AbstractC0018.m279(abstractC0018.f364, (AbstractC0083) abstractC0052);
        return abstractC0018.m282();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m565(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
