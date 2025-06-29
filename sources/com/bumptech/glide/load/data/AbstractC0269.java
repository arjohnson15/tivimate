package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC0293;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0269 implements InterfaceC0270 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f2304;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Comparable f2305;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Object f2306;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f2307;

    public /* synthetic */ AbstractC0269(int i, Comparable comparable, Object obj) {
        this.f2307 = i;
        this.f2306 = obj;
        this.f2305 = comparable;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    private final void m1525() {
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m1526() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    public final void cancel() {
        int i = this.f2307;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo1527() {
        switch (this.f2307) {
            case 0:
                Object obj = this.f2304;
                if (obj != null) {
                    try {
                        mo1530(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                Object obj2 = this.f2304;
                if (obj2 != null) {
                    try {
                        mo1530(obj2);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public abstract Object mo1528(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo1529(EnumC0293 enumC0293, InterfaceC0281 interfaceC0281) {
        switch (this.f2307) {
            case 0:
                try {
                    Object objMo1528 = mo1528((AssetManager) this.f2306, (String) this.f2305);
                    this.f2304 = objMo1528;
                    interfaceC0281.mo1540(objMo1528);
                    break;
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                    }
                    interfaceC0281.mo1541(e);
                }
            default:
                try {
                    Object objMo1532 = mo1532((Uri) this.f2305, (ContentResolver) this.f2306);
                    this.f2304 = objMo1532;
                    interfaceC0281.mo1540(objMo1532);
                    break;
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                    }
                    interfaceC0281.mo1541(e2);
                    return;
                }
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public abstract void mo1530(Object obj);

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int mo1531() {
        switch (this.f2307) {
        }
        return 1;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public abstract Object mo1532(Uri uri, ContentResolver contentResolver);
}
