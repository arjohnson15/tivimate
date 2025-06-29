package p003;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p314.C3598;
import p314.InterfaceC3593;
import p329.AbstractC3731;

/* renamed from: ʻʾ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0902 implements InterfaceC3593 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4048;

    public /* synthetic */ C0902(int i) {
        this.f4048 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static ByteArrayInputStream m3720(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Class m3721() {
        switch (this.f4048) {
            case 0:
                return ByteBuffer.class;
            case 1:
                return InputStream.class;
            case 2:
            case 3:
            default:
                return InputStream.class;
            case 4:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p314.InterfaceC3593
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean mo3722(Object obj, File file, C3598 c3598) throws Throwable {
        try {
            AbstractC3731.m8696((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
            }
            return false;
        }
    }
}
