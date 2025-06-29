package p393;

import android.os.Build;
import android.os.StrictMode;
import com.bumptech.glide.C0295;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p181.CallableC2516;
import ˏᵢ.ᵢٴ;

/* renamed from: ⁱˑ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4523 implements Closeable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final File f17391;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final File f17394;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public BufferedWriter f17397;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final File f17398;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final File f17399;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final long f17401;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f17403;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public long f17393 = 0;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final LinkedHashMap f17400 = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public long f17390 = 0;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final ThreadPoolExecutor f17396 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4524());

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final CallableC2516 f17395 = new CallableC2516(1, this);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f17392 = 1;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f17402 = 1;

    public C4523(File file, long j) {
        this.f17399 = file;
        this.f17391 = new File(file, "journal");
        this.f17394 = new File(file, "journal.tmp");
        this.f17398 = new File(file, "journal.bkp");
        this.f17401 = j;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m10286(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m10287(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static C4523 m10288(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m10291(file2, file3, false);
            }
        }
        C4523 c4523 = new C4523(file, j);
        if (c4523.f17391.exists()) {
            try {
                c4523.m10296();
                c4523.m10295();
                return c4523;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c4523.close();
                AbstractC4525.m10300(c4523.f17399);
            }
        }
        file.mkdirs();
        C4523 c45232 = new C4523(file, j);
        c45232.m10292();
        return c45232;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m10289(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m10290(C4523 c4523, C0295 c0295, boolean z) {
        synchronized (c4523) {
            C4521 c4521 = (C4521) c0295.f2402;
            if (c4521.f17383 != c0295) {
                throw new IllegalStateException();
            }
            if (z && !c4521.f17380) {
                for (int i = 0; i < c4523.f17402; i++) {
                    if (!((boolean[]) c0295.f2403)[i]) {
                        c0295.m1606();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c4521.f17385[i].exists()) {
                        c0295.m1606();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c4523.f17402; i2++) {
                File file = c4521.f17385[i2];
                if (!z) {
                    m10289(file);
                } else if (file.exists()) {
                    File file2 = c4521.f17381[i2];
                    file.renameTo(file2);
                    long j = c4521.f17379[i2];
                    long length = file2.length();
                    c4521.f17379[i2] = length;
                    c4523.f17393 = (c4523.f17393 - j) + length;
                }
            }
            c4523.f17403++;
            c4521.f17383 = null;
            if (c4521.f17380 || z) {
                c4521.f17380 = true;
                c4523.f17397.append((CharSequence) "CLEAN");
                c4523.f17397.append(' ');
                c4523.f17397.append((CharSequence) c4521.f17382);
                c4523.f17397.append((CharSequence) c4521.m10284());
                c4523.f17397.append('\n');
                if (z) {
                    c4523.f17390++;
                }
            } else {
                c4523.f17400.remove(c4521.f17382);
                c4523.f17397.append((CharSequence) "REMOVE");
                c4523.f17397.append(' ');
                c4523.f17397.append((CharSequence) c4521.f17382);
                c4523.f17397.append('\n');
            }
            m10287(c4523.f17397);
            if (c4523.f17393 > c4523.f17401 || c4523.m10293()) {
                c4523.f17396.submit(c4523.f17395);
            }
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static void m10291(File file, File file2, boolean z) throws IOException {
        if (z) {
            m10289(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f17397 == null) {
                return;
            }
            Iterator it = new ArrayList(this.f17400.values()).iterator();
            while (it.hasNext()) {
                C0295 c0295 = ((C4521) it.next()).f17383;
                if (c0295 != null) {
                    c0295.m1606();
                }
            }
            m10297();
            m10286(this.f17397);
            this.f17397 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final synchronized void m10292() {
        try {
            BufferedWriter bufferedWriter = this.f17397;
            if (bufferedWriter != null) {
                m10286(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17394), AbstractC4525.f17404));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f17392));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f17402));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C4521 c4521 : this.f17400.values()) {
                    if (c4521.f17383 != null) {
                        bufferedWriter2.write("DIRTY " + c4521.f17382 + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c4521.f17382 + c4521.m10284() + '\n');
                    }
                }
                m10286(bufferedWriter2);
                if (this.f17391.exists()) {
                    m10291(this.f17391, this.f17398, true);
                }
                m10291(this.f17394, this.f17391, false);
                this.f17398.delete();
                this.f17397 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17391, true), AbstractC4525.f17404));
            } catch (Throwable th) {
                m10286(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m10293() {
        int i = this.f17403;
        return i >= 2000 && i >= this.f17400.size();
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final synchronized ᵢٴ m10294(String str) {
        if (this.f17397 == null) {
            throw new IllegalStateException("cache is closed");
        }
        C4521 c4521 = (C4521) this.f17400.get(str);
        if (c4521 == null) {
            return null;
        }
        if (!c4521.f17380) {
            return null;
        }
        for (File file : c4521.f17381) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f17403++;
        this.f17397.append((CharSequence) "READ");
        this.f17397.append(' ');
        this.f17397.append((CharSequence) str);
        this.f17397.append('\n');
        if (m10293()) {
            this.f17396.submit(this.f17395);
        }
        return new ᵢٴ(28, c4521.f17381);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m10295() throws IOException {
        m10289(this.f17394);
        Iterator it = this.f17400.values().iterator();
        while (it.hasNext()) {
            C4521 c4521 = (C4521) it.next();
            C0295 c0295 = c4521.f17383;
            int i = this.f17402;
            int i2 = 0;
            if (c0295 == null) {
                while (i2 < i) {
                    this.f17393 += c4521.f17379[i2];
                    i2++;
                }
            } else {
                c4521.f17383 = null;
                while (i2 < i) {
                    m10289(c4521.f17381[i2]);
                    m10289(c4521.f17385[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m10296() {
        File file = this.f17391;
        FileInputStream fileInputStream = new FileInputStream(file);
        Charset charset = AbstractC4525.f17404;
        C4522 c4522 = new C4522(fileInputStream);
        try {
            String strM10285 = c4522.m10285();
            String strM102852 = c4522.m10285();
            String strM102853 = c4522.m10285();
            String strM102854 = c4522.m10285();
            String strM102855 = c4522.m10285();
            if (!"libcore.io.DiskLruCache".equals(strM10285) || !"1".equals(strM102852) || !Integer.toString(this.f17392).equals(strM102853) || !Integer.toString(this.f17402).equals(strM102854) || !"".equals(strM102855)) {
                throw new IOException("unexpected journal header: [" + strM10285 + ", " + strM102852 + ", " + strM102854 + ", " + strM102855 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m10299(c4522.m10285());
                    i++;
                } catch (EOFException unused) {
                    this.f17403 = i - this.f17400.size();
                    if (c4522.f17388 == -1) {
                        m10292();
                    } else {
                        this.f17397 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC4525.f17404));
                    }
                    try {
                        c4522.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c4522.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m10297() {
        while (this.f17393 > this.f17401) {
            String str = (String) ((Map.Entry) this.f17400.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f17397 == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C4521 c4521 = (C4521) this.f17400.get(str);
                    if (c4521 != null && c4521.f17383 == null) {
                        for (int i = 0; i < this.f17402; i++) {
                            File file = c4521.f17381[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f17393;
                            long[] jArr = c4521.f17379;
                            this.f17393 = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f17403++;
                        this.f17397.append((CharSequence) "REMOVE");
                        this.f17397.append(' ');
                        this.f17397.append((CharSequence) str);
                        this.f17397.append('\n');
                        this.f17400.remove(str);
                        if (m10293()) {
                            this.f17396.submit(this.f17395);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C0295 m10298(String str) {
        synchronized (this) {
            try {
                if (this.f17397 == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C4521 c4521 = (C4521) this.f17400.get(str);
                if (c4521 == null) {
                    c4521 = new C4521(this, str);
                    this.f17400.put(str, c4521);
                } else if (c4521.f17383 != null) {
                    return null;
                }
                C0295 c0295 = new C0295(this, c4521);
                c4521.f17383 = c0295;
                this.f17397.append((CharSequence) "DIRTY");
                this.f17397.append(' ');
                this.f17397.append((CharSequence) str);
                this.f17397.append('\n');
                m10287(this.f17397);
                return c0295;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void m10299(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f17400;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C4521 c4521 = (C4521) linkedHashMap.get(strSubstring);
        if (c4521 == null) {
            c4521 = new C4521(this, strSubstring);
            linkedHashMap.put(strSubstring, c4521);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c4521.f17383 = new C0295(this, c4521);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c4521.f17380 = true;
        c4521.f17383 = null;
        if (strArrSplit.length != c4521.f17384.f17402) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c4521.f17379[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }
}
