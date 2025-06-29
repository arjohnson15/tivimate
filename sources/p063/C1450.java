package p063;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p137.C2106;
import p261.InterfaceC3251;
import p314.C3598;
import p314.InterfaceC3595;
import ⁱـ.ˑי;

/* renamed from: ʾᐧ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1450 implements InterfaceC3595 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1446 f5943;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2106 f5944;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f5945;

    public C1450(ArrayList arrayList, C1446 c1446, C2106 c2106) {
        this.f5945 = arrayList;
        this.f5943 = c1446;
        this.f5944 = c2106;
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ʽᐧ */
    public final boolean mo4999(Object obj, C3598 c3598) {
        return !((Boolean) c3598.m8502(AbstractC1449.f5941)).booleanValue() && ˑי.ˋⁱ(this.f5945, (InputStream) obj, this.f5944) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ـﹶ */
    public final InterfaceC3251 mo5001(Object obj, int i, int i2, C3598 c3598) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f5943.mo5001(ByteBuffer.wrap(byteArray), i, i2, c3598);
    }
}
