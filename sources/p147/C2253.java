package p147;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: ˊ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2253 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final byte f8970 = Byte.parseByte("01110000", 2);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final byte f8969 = Byte.parseByte("00001111", 2);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m6254() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b = bArrArray[0];
        bArrArray[16] = b;
        bArrArray[0] = (byte) ((b & f8969) | f8970);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
