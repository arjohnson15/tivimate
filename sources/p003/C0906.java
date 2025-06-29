package p003;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0283;
import com.bumptech.glide.EnumC0293;
import com.bumptech.glide.load.data.InterfaceC0270;
import com.bumptech.glide.load.data.InterfaceC0281;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p074.C1649;
import p074.InterfaceC1648;

/* renamed from: ʻʾ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0906 implements InterfaceC0270 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Comparable f4056;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f4057;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Object f4058;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4059;

    public /* synthetic */ C0906(int i, Comparable comparable, Object obj) {
        this.f4059 = i;
        this.f4056 = comparable;
        this.f4057 = obj;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    private final void m3723() {
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    private final void m3724() {
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C0906 m3725(Context context, Uri uri, InterfaceC1648 interfaceC1648) {
        return new C0906(2, uri, new C1649(ComponentCallbacks2C0283.m1550(context).f2341.m1555().m1591(), interfaceC1648, ComponentCallbacks2C0283.m1550(context).f2338, context.getContentResolver()));
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    private final void m3726() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    public final void cancel() {
        int i = this.f4059;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ʽᐧ */
    public final void mo1527() throws IOException {
        switch (this.f4059) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.f4058).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
            case 1:
                Object obj = this.f4058;
                if (obj != null) {
                    try {
                        switch (((C0902) this.f4057).f4048) {
                            case 4:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f4058;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ـﹶ */
    public final Class mo1533() {
        switch (this.f4059) {
            case 0:
                ((C0902) this.f4057).getClass();
                return InputStream.class;
            case 1:
                return ((C0902) this.f4057).m3721();
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ٴˎ */
    public final void mo1529(EnumC0293 enumC0293, InterfaceC0281 interfaceC0281) throws Throwable {
        Object objOpen;
        switch (this.f4059) {
            case 0:
                try {
                    ByteArrayInputStream byteArrayInputStreamM3720 = C0902.m3720((String) this.f4056);
                    this.f4058 = byteArrayInputStreamM3720;
                    interfaceC0281.mo1540(byteArrayInputStreamM3720);
                    break;
                } catch (IllegalArgumentException e) {
                    interfaceC0281.mo1541(e);
                    return;
                }
            case 1:
                try {
                    C0902 c0902 = (C0902) this.f4057;
                    File file = (File) this.f4056;
                    switch (c0902.f4048) {
                        case 4:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f4058 = objOpen;
                    interfaceC0281.mo1540(objOpen);
                    break;
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("FileLoader", 3)) {
                    }
                    interfaceC0281.mo1541(e2);
                }
            default:
                try {
                    InputStream inputStreamM3727 = m3727();
                    this.f4058 = inputStreamM3727;
                    interfaceC0281.mo1540(inputStreamM3727);
                    break;
                } catch (FileNotFoundException e3) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                    }
                    interfaceC0281.mo1541(e3);
                    return;
                }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ﹳﹳ */
    public final int mo1531() {
        switch (this.f4059) {
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0026: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:10:0x0026 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r6
  0x002d: PHI (r6v6 android.database.Cursor) = (r6v2 android.database.Cursor), (r6v8 android.database.Cursor) binds: [B:23:0x004a, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.InputStream m3727() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003.C0906.m3727():java.io.InputStream");
    }
}
