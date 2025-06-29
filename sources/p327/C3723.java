package p327;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.EnumC0293;
import com.bumptech.glide.load.data.InterfaceC0270;
import com.bumptech.glide.load.data.InterfaceC0281;
import java.io.File;
import java.io.FileNotFoundException;
import p003.C0910;
import p003.InterfaceC0913;
import p314.C3598;
import ʼˉ.ٴˎ;

/* renamed from: ᴵᐧ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3723 implements InterfaceC0270 {

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final String[] f14440 = {"_data"};

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC0913 f14441;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f14442;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final Class f14443;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC0913 f14444;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public volatile boolean f14445;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Uri f14446;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f14447;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public volatile InterfaceC0270 f14448;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f14449;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C3598 f14450;

    public C3723(Context context, InterfaceC0913 interfaceC0913, InterfaceC0913 interfaceC09132, Uri uri, int i, int i2, C3598 c3598, Class cls) {
        this.f14447 = context.getApplicationContext();
        this.f14441 = interfaceC0913;
        this.f14444 = interfaceC09132;
        this.f14446 = uri;
        this.f14442 = i;
        this.f14449 = i2;
        this.f14450 = c3598;
        this.f14443 = cls;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    public final void cancel() {
        this.f14445 = true;
        InterfaceC0270 interfaceC0270 = this.f14448;
        if (interfaceC0270 != null) {
            interfaceC0270.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ʽᐧ */
    public final void mo1527() {
        InterfaceC0270 interfaceC0270 = this.f14448;
        if (interfaceC0270 != null) {
            interfaceC0270.mo1527();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC0270 m8688() throws Throwable {
        C0910 c0910Mo3705;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f14447;
        C3598 c3598 = this.f14450;
        int i = this.f14449;
        int i2 = this.f14442;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f14446;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f14440, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c0910Mo3705 = this.f14441.mo3705(file, i2, i, c3598);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.f14446;
            boolean z = ٴˎ.ᵎˏ(requireOriginal);
            InterfaceC0913 interfaceC0913 = this.f14444;
            if (z && requireOriginal.getPathSegments().contains("picker")) {
                c0910Mo3705 = interfaceC0913.mo3705(requireOriginal, i2, i, c3598);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                c0910Mo3705 = interfaceC0913.mo3705(requireOriginal, i2, i, c3598);
            }
        }
        if (c0910Mo3705 != null) {
            return c0910Mo3705.f4067;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ـﹶ */
    public final Class mo1533() {
        return this.f14443;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ٴˎ */
    public final void mo1529(EnumC0293 enumC0293, InterfaceC0281 interfaceC0281) throws Throwable {
        try {
            InterfaceC0270 interfaceC0270M8688 = m8688();
            if (interfaceC0270M8688 == null) {
                interfaceC0281.mo1541(new IllegalArgumentException("Failed to build fetcher for: " + this.f14446));
            } else {
                this.f14448 = interfaceC0270M8688;
                if (this.f14445) {
                    cancel();
                } else {
                    interfaceC0270M8688.mo1529(enumC0293, interfaceC0281);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC0281.mo1541(e);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ﹳﹳ */
    public final int mo1531() {
        return 1;
    }
}
