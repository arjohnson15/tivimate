package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0274 extends AbstractC0269 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f2318;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0274(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.f2318 = i;
    }

    @Override // com.bumptech.glide.load.data.AbstractC0269
    /* renamed from: ˏᵢ */
    public final Object mo1528(AssetManager assetManager, String str) {
        switch (this.f2318) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ـﹶ */
    public final Class mo1533() {
        switch (this.f2318) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.AbstractC0269
    /* renamed from: ᐧʻ */
    public final void mo1530(Object obj) throws IOException {
        switch (this.f2318) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }
}
