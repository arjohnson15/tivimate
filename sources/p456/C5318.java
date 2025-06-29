package p456;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: ﾞⁱ.ᴵᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5318 extends AbstractC5324 {
    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public static byte[] m11992(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    @Override // p456.AbstractC5324
    /* renamed from: ᵔˋ */
    public final boolean mo11746() {
        return false;
    }
}
