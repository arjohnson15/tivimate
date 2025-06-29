package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0277 extends AbstractC0269 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f2324;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0277(ContentResolver contentResolver, Uri uri, int i) {
        super(1, uri, contentResolver);
        this.f2324 = i;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ـﹶ */
    public final Class mo1533() {
        switch (this.f2324) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.AbstractC0269
    /* renamed from: ᐧʻ */
    public final void mo1530(Object obj) throws IOException {
        switch (this.f2324) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.AbstractC0269
    /* renamed from: ﹶˆ */
    public final Object mo1532(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        switch (this.f2324) {
            case 0:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor;
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
            default:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor2 != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
    }
}
