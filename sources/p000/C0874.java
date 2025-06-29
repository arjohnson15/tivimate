package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p383.AbstractC4470;

/* renamed from: ʻ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0874 extends AbstractC0863 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final AssetManager f3971;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public long f3972;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f3973;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Uri f3974;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public InputStream f3975;

    public C0874(Context context) {
        super(false);
        this.f3971 = context.getAssets();
    }

    @Override // p000.InterfaceC0875
    public final void close() {
        this.f3974 = null;
        try {
            try {
                InputStream inputStream = this.f3975;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSource$AssetDataSourceException(e, 2000);
            }
        } finally {
            this.f3975 = null;
            if (this.f3973) {
                this.f3973 = false;
                m3675();
            }
        }
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f3972;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new AssetDataSource$AssetDataSourceException(e, 2000);
            }
        }
        InputStream inputStream = this.f3975;
        int i3 = AbstractC4470.f17202;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.f3972;
        if (j2 != -1) {
            this.f3972 = j2 - i4;
        }
        m3676(i4);
        return i4;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) throws IOException {
        try {
            Uri uri = c0882.f4004;
            long j = c0882.f4001;
            this.f3974 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m3673();
            InputStream inputStreamOpen = this.f3971.open(path, 1);
            this.f3975 = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSource$AssetDataSourceException(null, 2008);
            }
            long j2 = c0882.f4005;
            if (j2 != -1) {
                this.f3972 = j2;
            } else {
                long jAvailable = this.f3975.available();
                this.f3972 = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f3972 = -1L;
                }
            }
            this.f3973 = true;
            m3677(c0882);
            return this.f3972;
        } catch (AssetDataSource$AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSource$AssetDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        return this.f3974;
    }
}
