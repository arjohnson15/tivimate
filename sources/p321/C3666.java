package p321;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ᴵˈ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3666 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final HashMap f14055 = new HashMap();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final File f14056;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Lock f14057;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean f14058;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public FileChannel f14059;

    public C3666(String str, File file, boolean z) {
        Lock lock;
        this.f14058 = z;
        this.f14056 = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f14055;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14057 = lock;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m8622() throws IOException {
        try {
            FileChannel fileChannel = this.f14059;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f14057.unlock();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8623(boolean z) throws IOException {
        this.f14057.lock();
        if (z) {
            File file = this.f14056;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f14059 = channel;
            } catch (IOException e) {
                this.f14059 = null;
            }
        }
    }
}
