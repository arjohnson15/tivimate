package p003;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC0293;
import com.bumptech.glide.load.data.InterfaceC0270;
import com.bumptech.glide.load.data.InterfaceC0281;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* renamed from: ʻʾ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0900 implements InterfaceC0270 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final String[] f4039 = {"_data"};

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f4040;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f4041;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4042;

    public /* synthetic */ C0900(Object obj, int i, Object obj2) {
        this.f4042 = i;
        this.f4040 = obj;
        this.f4041 = obj2;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    private final void m3716() {
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    private final void m3717() {
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m3718() {
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    private final void m3719() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    public final void cancel() {
        int i = this.f4042;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ʽᐧ */
    public final void mo1527() {
        int i = this.f4042;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ـﹶ */
    public final Class mo1533() {
        switch (this.f4042) {
            case 0:
                return File.class;
            default:
                return ((C0902) this.f4041).m3721();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ٴˎ */
    public final void mo1529(EnumC0293 enumC0293, InterfaceC0281 interfaceC0281) {
        Object objWrap;
        switch (this.f4042) {
            case 0:
                Cursor cursorQuery = ((Context) this.f4040).getContentResolver().query((Uri) this.f4041, f4039, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    } finally {
                        cursorQuery.close();
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    interfaceC0281.mo1540(new File(string));
                    return;
                }
                interfaceC0281.mo1541(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f4041)));
                return;
            default:
                C0902 c0902 = (C0902) this.f4041;
                byte[] bArr = (byte[]) this.f4040;
                switch (c0902.f4048) {
                    case 0:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                interfaceC0281.mo1540(objWrap);
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ﹳﹳ */
    public final int mo1531() {
        switch (this.f4042) {
        }
        return 1;
    }
}
