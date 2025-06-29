package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import p383.AbstractC4470;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʻ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0869 extends AbstractC0863 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Context f3947;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public FileInputStream f3948;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public long f3949;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f3950;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C0882 f3951;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public AssetFileDescriptor f3952;

    public C0869(Context context) {
        super(false);
        this.f3947 = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // p000.InterfaceC0875
    public final void close() {
        this.f3951 = null;
        try {
            try {
                FileInputStream fileInputStream = this.f3948;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f3948 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f3952;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
                    }
                } finally {
                    this.f3952 = null;
                    if (this.f3950) {
                        this.f3950 = false;
                        m3675();
                    }
                }
            } catch (Throwable th) {
                this.f3948 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f3952;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f3952 = null;
                        if (this.f3950) {
                            this.f3950 = false;
                            m3675();
                        }
                        throw th;
                    } finally {
                        this.f3952 = null;
                        if (this.f3950) {
                            this.f3950 = false;
                            m3675();
                        }
                    }
                } catch (IOException e2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new RawResourceDataSource$RawResourceDataSourceException(null, e3, 2000);
        }
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f3949;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
            }
        }
        FileInputStream fileInputStream = this.f3948;
        int i3 = AbstractC4470.f17202;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.f3949 == -1) {
                return -1;
            }
            throw new RawResourceDataSource$RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.f3949;
        if (j2 != -1) {
            this.f3949 = j2 - i4;
        }
        m3676(i4);
        return i4;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) throws DataSourceException, Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f3951 = c0882;
        m3673();
        Uri uriNormalizeScheme = c0882.f4004.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f3947;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSource$RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(ᐧʻ.ˋⁱ(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f3952 = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f3952.getFileDescriptor());
            this.f3948 = fileInputStream;
            long j = c0882.f4001;
            try {
                if (length != -1 && j > length) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                long startOffset = this.f3952.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f3949 = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f3949 = size;
                        if (size < 0) {
                            throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.f3949 = j2;
                    if (j2 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                long j3 = c0882.f4005;
                if (j3 != -1) {
                    long j4 = this.f3949;
                    this.f3949 = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.f3950 = true;
                m3677(c0882);
                return j3 != -1 ? j3 : this.f3949;
            } catch (RawResourceDataSource$RawResourceDataSourceException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new RawResourceDataSource$RawResourceDataSourceException(null, e4, 2005);
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        C0882 c0882 = this.f3951;
        if (c0882 != null) {
            return c0882.f4004;
        }
        return null;
    }
}
