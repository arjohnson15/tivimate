package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p383.AbstractC4470;

/* renamed from: ʻ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0872 extends AbstractC0863 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ContentResolver f3961;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public FileInputStream f3962;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public long f3963;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f3964;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Uri f3965;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public AssetFileDescriptor f3966;

    public C0872(Context context) {
        super(false);
        this.f3961 = context.getContentResolver();
    }

    @Override // p000.InterfaceC0875
    public final void close() {
        this.f3965 = null;
        try {
            try {
                FileInputStream fileInputStream = this.f3962;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f3962 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f3966;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ContentDataSource$ContentDataSourceException(e, 2000);
                    }
                } finally {
                    this.f3966 = null;
                    if (this.f3964) {
                        this.f3964 = false;
                        m3675();
                    }
                }
            } catch (Throwable th) {
                this.f3962 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f3966;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f3966 = null;
                        if (this.f3964) {
                            this.f3964 = false;
                            m3675();
                        }
                        throw th;
                    } finally {
                        this.f3966 = null;
                        if (this.f3964) {
                            this.f3964 = false;
                            m3675();
                        }
                    }
                } catch (IOException e2) {
                    throw new ContentDataSource$ContentDataSourceException(e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new ContentDataSource$ContentDataSourceException(e3, 2000);
        }
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f3963;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new ContentDataSource$ContentDataSourceException(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.f3962;
        int i3 = AbstractC4470.f17202;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.f3963;
        if (j2 != -1) {
            this.f3963 = j2 - i4;
        }
        m3676(i4);
        return i4;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = c0882.f4004.normalizeScheme();
            this.f3965 = uriNormalizeScheme;
            m3673();
            boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
            ContentResolver contentResolver = this.f3961;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f3966 = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSource$ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f3962 = fileInputStream;
            long j = c0882.f4001;
            if (length != -1 && j > length) {
                throw new ContentDataSource$ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
            if (jSkip != j) {
                throw new ContentDataSource$ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f3963 = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f3963 = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSource$ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j2 = length - jSkip;
                this.f3963 = j2;
                if (j2 < 0) {
                    throw new ContentDataSource$ContentDataSourceException(null, 2008);
                }
            }
            long j3 = c0882.f4005;
            if (j3 != -1) {
                long j4 = this.f3963;
                this.f3963 = j4 == -1 ? j3 : Math.min(j4, j3);
            }
            this.f3964 = true;
            m3677(c0882);
            return j3 != -1 ? j3 : this.f3963;
        } catch (ContentDataSource$ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new ContentDataSource$ContentDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        return this.f3965;
    }
}
