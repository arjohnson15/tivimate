package p193;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import p014.C1060;
import p076.C1654;
import p076.C1671;

/* renamed from: ˎˊ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2705 implements InterfaceC2701 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f10605 = false;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C1654 m6867(C1671 c1671, C1060 c1060) {
        int i;
        IOException iOException = (IOException) c1060.f4468;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException) || ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).f1342) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (c1671.m5361(1)) {
            return new C1654(1, 300000L);
        }
        if (c1671.m5361(2)) {
            return new C1654(2, 60000L);
        }
        return null;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public synchronized boolean m6868() {
        if (this.f10605) {
            return false;
        }
        this.f10605 = true;
        notifyAll();
        return true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int m6869(int i) {
        return i == 7 ? 6 : 3;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public synchronized void m6870() {
        this.f10605 = false;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long m6871(C1060 c1060) {
        Throwable cause = (IOException) c1060.f4468;
        if ((!(cause instanceof HttpDataSource$InvalidResponseCodeException) || (!this.f10605 && ((HttpDataSource$InvalidResponseCodeException) cause).f1342 != 401)) && !(cause instanceof ParserException) && !(cause instanceof FileNotFoundException) && !(cause instanceof HttpDataSource$CleartextNotPermittedException) && !(cause instanceof Loader$UnexpectedLoaderException)) {
            int i = DataSourceException.f1338;
            while (cause != null) {
                if (!(cause instanceof DataSourceException) || ((DataSourceException) cause).f1339 != 2008) {
                    cause = cause.getCause();
                }
            }
            return Math.min((c1060.f4469 - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }
}
