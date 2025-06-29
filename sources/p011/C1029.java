package p011;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p166.C2401;
import p353.AbstractC4010;
import p392.C4520;
import p395.AbstractC4535;
import ˈⁱ.ˉⁱ;

/* renamed from: ʻˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1029 extends ˉⁱ {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final Pattern f4424 = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final CharsetDecoder f4425 = AbstractC4010.f15450.newDecoder();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final CharsetDecoder f4426 = AbstractC4010.f15448.newDecoder();

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2401 m3980(C4520 c4520, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f4426;
        CharsetDecoder charsetDecoder2 = this.f4425;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new C2401(new C1028(null, null, bArr));
        }
        Matcher matcher = f4424.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM10327 = AbstractC4535.m10327(strGroup);
                strM10327.getClass();
                if (strM10327.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM10327.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C2401(new C1028(str, str2, bArr));
    }
}
