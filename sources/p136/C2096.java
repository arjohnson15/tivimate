package p136;

import androidx.leanback.widget.ˉⁱ;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p036.C1259;
import p065.C1500;
import p122.AbstractC1962;
import p310.C3580;
import p428.C4921;
import ˆʽ.ᵎˏ;

/* renamed from: ˉˆ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2096 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ﹳﹳ f8291;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1500 f8292;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AtomicInteger f8293 = new AtomicInteger(0);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4921 f8294;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final Charset f8286 = Charset.forName("UTF-8");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final int f8288 = 15;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C3580 f8289 = new C3580();

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C1259 f8287 = new C1259(11);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C2098 f8290 = new C2098(0);

    public C2096(ﹳﹳ r3, C1500 c1500, C4921 c4921) {
        this.f8291 = r3;
        this.f8292 = c1500;
        this.f8294 = c4921;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static String m5943(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f8286);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m5944(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m5945(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f8286);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList m5946() {
        ArrayList arrayList = new ArrayList();
        ﹳﹳ r1 = this.f8291;
        arrayList.addAll(ﹳﹳ.ﹶˆ(((File) r1.ᵢʿ).listFiles()));
        arrayList.addAll(ﹳﹳ.ﹶˆ(((File) r1.ﹳﹶ).listFiles()));
        C1259 c1259 = f8287;
        Collections.sort(arrayList, c1259);
        List list = ﹳﹳ.ﹶˆ(((File) r1.ˆᵔ).listFiles());
        Collections.sort(list, c1259);
        arrayList.addAll(list);
        return arrayList;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final NavigableSet m5947() {
        return new TreeSet(ﹳﹳ.ﹶˆ(((File) this.f8291.ᐧˋ).list())).descendingSet();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m5948(AbstractC1962 abstractC1962, String str, boolean z) {
        ﹳﹳ r1 = this.f8291;
        ˉⁱ r2 = this.f8292.m5065().f18192;
        f8289.getClass();
        try {
            m5945(r1.ﹳﹳ(str, ᵎˏ.ˑי("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f8293.getAndIncrement())), z ? "_" : "")), C3580.f13770.ˎٴ(abstractC1962));
        } catch (IOException e) {
            String str2 = "Could not persist event for session " + str;
        }
        C2098 c2098 = new C2098(1);
        r1.getClass();
        File file = new File((File) r1.ᐧˋ, str);
        file.mkdirs();
        List<File> list = ﹳﹳ.ﹶˆ(file.listFiles(c2098));
        Collections.sort(list, new C1259(12));
        int size = list.size();
        for (File file2 : list) {
            if (size <= r2.ᐧⁱ) {
                return;
            }
            ﹳﹳ.ˏᵢ(file2);
            size--;
        }
    }
}
