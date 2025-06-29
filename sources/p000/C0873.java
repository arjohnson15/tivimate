package p000;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p383.AbstractC4470;

/* renamed from: ʻ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0873 extends AbstractC0863 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public RandomAccessFile f3967;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f3968;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Uri f3969;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public long f3970;

    @Override // p000.InterfaceC0875
    public final void close() {
        this.f3969 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f3967;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } finally {
            this.f3967 = null;
            if (this.f3968) {
                this.f3968 = false;
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
        long j = this.f3970;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f3967;
            int i3 = AbstractC4470.f17202;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.f3970 -= i4;
                m3676(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new FileDataSource$FileDataSourceException(e, 2000);
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) throws IOException {
        Uri uri = c0882.f4004;
        long j = c0882.f4001;
        this.f3969 = uri;
        m3673();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f3967 = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c0882.f4005;
                if (length == -1) {
                    length = this.f3967.length() - j;
                }
                this.f3970 = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(null, null, 2008);
                }
                this.f3968 = true;
                m3677(c0882);
                return this.f3970;
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(e2, (AbstractC4470.f17202 < 21 || !AbstractC0870.m3684(e2.getCause())) ? 2005 : 2006);
            }
            throw new FileDataSource$FileDataSourceException("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e2, 1004);
        } catch (SecurityException e3) {
            throw new FileDataSource$FileDataSourceException(e3, 2006);
        } catch (RuntimeException e4) {
            throw new FileDataSource$FileDataSourceException(e4, 2000);
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        return this.f3969;
    }
}
