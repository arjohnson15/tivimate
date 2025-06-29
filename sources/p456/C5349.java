package p456;

import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import com.google.android.gms.internal.measurement.InterfaceC0485;
import com.google.android.gms.internal.measurement.InterfaceC0489;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.security.SecureRandom;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import net.lingala.zip4j.exception.ZipException;
import org.json.JSONException;
import org.json.JSONObject;
import p061.C1419;
import p069.C1541;
import p076.InterfaceC1668;
import p080.AbstractC1702;
import p141.C2210;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p192.C2655;
import p192.C2658;
import p192.C2674;
import p192.InterfaceC2670;
import p210.C2804;
import p235.C3088;
import p251.C3130;
import p251.InterfaceC3135;
import p254.AbstractC3152;
import p254.InterfaceC3157;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p266.C3264;
import p324.C3704;
import p324.C3714;
import p324.C3716;
import p324.InterfaceC3707;
import p331.C3767;
import p341.C3898;
import p342.EnumC3909;
import p345.AbstractC3980;
import p345.C3928;
import p352.EnumC4008;
import p352.InterfaceC4007;
import p367.InterfaceC4176;
import p374.C4261;
import p374.C4296;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import p385.C4477;
import p385.C4488;
import p385.C4495;
import p385.HandlerC4491;
import p395.AbstractC4535;
import p405.C4640;
import p405.C4641;
import p406.RunnableC4654;
import p414.C4736;
import p414.C4737;
import p428.C4927;
import p428.CallableC4922;
import ˆʽ.ᵎˏ;
import ᴵﹳ.ﹶˆ;
import ᵎﹳ.ᐧʻ;
import ﹳᴵ.ˉי;
import ﹶˋ.ـﹶ;

/* renamed from: ﾞⁱ.ﹶﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5349 implements InterfaceC0485, InterfaceC3177, InterfaceC2670, InterfaceC3707, InterfaceC4176, InterfaceC3135 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f20756;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f20757;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20758;

    public C5349() {
        this.f20758 = 16;
        this.f20756 = new HashSet();
    }

    public /* synthetic */ C5349(int i) {
        this.f20758 = i;
    }

    public /* synthetic */ C5349(int i, Object obj, Object obj2, boolean z) {
        this.f20758 = i;
        this.f20756 = obj;
        this.f20757 = obj2;
    }

    public C5349(ByteArrayInputStream byteArrayInputStream) {
        this.f20758 = 3;
        C4641 c4641 = new C4641(byteArrayInputStream);
        this.f20756 = c4641;
        this.f20757 = new C4640(c4641);
    }

    public /* synthetic */ C5349(Object obj, int i, Object obj2) {
        this.f20758 = i;
        this.f20756 = obj2;
        this.f20757 = obj;
    }

    public C5349(String str) {
        this.f20758 = 8;
        this.f20756 = str.concat(".lck");
    }

    public C5349(List list) {
        this.f20758 = 14;
        this.f20756 = list;
        this.f20757 = new InterfaceC3178[list.size()];
    }

    public C5349(Locale locale) {
        this.f20758 = 10;
        this.f20756 = locale;
        this.f20757 = DateFormatSymbols.getInstance(locale).getShortMonths();
        Calendar calendar = Calendar.getInstance(locale);
        AbstractC4535.m10367(calendar.getMinimum(5), calendar.getMaximum(5));
    }

    public C5349(C2804 c2804) {
        this.f20758 = 5;
        this.f20757 = c2804;
    }

    public C5349(char[] cArr, long j, boolean z) throws ZipException {
        this.f20758 = 15;
        C3088 c3088 = new C3088();
        this.f20756 = c3088;
        if (cArr == null || cArr.length <= 0) {
            throw new ZipException("input password is null or empty, cannot initialize standard encrypter");
        }
        c3088.m7589(cArr, z);
        byte[] bArr = new byte[12];
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 12; i++) {
            byte bNextInt = (byte) secureRandom.nextInt(256);
            C3088 c30882 = (C3088) this.f20756;
            byte bM7591 = (byte) ((c30882.m7591() & 255) ^ bNextInt);
            c30882.m7590(bNextInt);
            bArr[i] = bM7591;
        }
        this.f20757 = bArr;
        c3088.m7589(cArr, z);
        byte[] bArr2 = (byte[]) this.f20757;
        bArr2[11] = (byte) (j >>> 24);
        bArr2[10] = (byte) (j >>> 16);
        mo9590(bArr2, 0, bArr2.length);
    }

    public String toString() {
        switch (this.f20758) {
            case 2:
                StringBuilder sb = new StringBuilder("FileNotifyInfo{action=");
                sb.append((EnumC3909) this.f20756);
                sb.append(", fileName='");
                return ᵎˏ.ˎٴ(sb, (String) this.f20757, "'}");
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m12092(EnumC4008 enumC4008) {
        if (enumC4008 == EnumC4008.ONE) {
            return;
        }
        byte b = enumC4008.f15447;
        long j = ((C4641) this.f20756).f17757;
        long j2 = ((b + j) & (~b)) - j;
        while (true) {
            long j3 = j2 - 1;
            if (j2 <= 0) {
                return;
            }
            m12111();
            j2 = j3;
        }
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ʿʼ */
    public void mo4850() {
        final C2210 c2210 = (C2210) this.f20757;
        final int i = 0;
        c2210.f8736.post(new Runnable() { // from class: ˉˑ.ˑי
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        C2210.m6158(c2210);
                        break;
                    default:
                        C2210.m6158(c2210);
                        break;
                }
            }
        });
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ʿˏ */
    public InterfaceC3178 mo4851(int i, int i2) {
        return (C4296) this.f20756;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long m12093() {
        return ((C4640) this.f20757).readInt() & 4294967295L;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public int m12094() {
        return ((C4640) this.f20757).readInt();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public void m12095(int i) {
        int[] iArr = (int[]) this.f20756;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f20756 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f20756 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f20756;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public File m12096() {
        if (((File) this.f20756) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f20756) == null) {
                        C2804 c2804 = (C2804) this.f20757;
                        c2804.m7085();
                        this.f20756 = new File(c2804.f10936.getFilesDir(), "PersistedInstallation." + ((C2804) this.f20757).m7086() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f20756;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public void m12097(Exception exc, boolean z) {
        this.f20757 = null;
        HashSet hashSet = (HashSet) this.f20756;
        AbstractC3980 abstractC3980M9209 = AbstractC3980.m9209(hashSet);
        hashSet.clear();
        C3928 c3928ListIterator = abstractC3980M9209.listIterator(0);
        while (c3928ListIterator.hasNext()) {
            C4488 c4488 = (C4488) c3928ListIterator.next();
            c4488.getClass();
            c4488.m10243(z ? 1 : 3, exc);
        }
    }

    @Override // p324.InterfaceC3707
    /* renamed from: ˋⁱ */
    public InterfaceC1668 mo8052() {
        return new C3767(((C3264) this.f20756).mo8052(), 3, (List) this.f20757);
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ˎˑ */
    public void mo4858(InterfaceC3157 interfaceC3157) {
    }

    @Override // p251.InterfaceC3135
    /* renamed from: ˎٴ */
    public C3130 mo7701(Object obj) {
        return ((C4927) this.f20757).f18634.ˎᵔ(new CallableC4922(this, 0, (Boolean) obj));
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void m12098(int i) throws EOFException {
        if (i != ((C4640) this.f20757).skipBytes(i)) {
            throw new EOFException();
        }
    }

    @Override // p367.InterfaceC4176
    /* renamed from: ˏᴵ */
    public int mo9590(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 0) {
            throw new ZipException("invalid length specified to decrpyt data");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            byte b = bArr[i3];
            C3088 c3088 = (C3088) this.f20756;
            byte bM7591 = (byte) ((c3088.m7591() & 255) ^ b);
            c3088.m7590(b);
            bArr[i3] = bM7591;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0485
    /* renamed from: ˏᵢ */
    public ـﹶ mo2292(InterfaceC0489 interfaceC0489) {
        String str = (String) this.f20757;
        ـﹶ r1 = (ـﹶ) this.f20756;
        r1.ˈٴ(str, interfaceC0489);
        return r1;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m12099() {
        switch (this.f20758) {
            case 4:
                int[] iArr = (int[]) this.f20756;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f20757 = null;
                break;
            default:
                this.f20756 = null;
                this.f20757 = null;
                break;
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void m12100() throws IOException {
        String str = (String) this.f20756;
        if (((FileChannel) this.f20757) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f20757 = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f20757;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f20757 = null;
            throw new IllegalStateException(ᵎˏ.ˑי("Unable to lock file: '", str, "'."), th);
        }
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public int m12101() {
        return ((C4640) this.f20757).readInt();
    }

    @Override // p192.InterfaceC2670
    /* renamed from: ـﹶ */
    public Object mo4415() {
        return (C2674) this.f20756;
    }

    @Override // p192.InterfaceC2670
    /* renamed from: ٴˎ */
    public boolean mo4416(CharSequence charSequence, int i, int i2, C2655 c2655) {
        if ((c2655.f10532 & 4) > 0) {
            return true;
        }
        if (((C2674) this.f20756) == null) {
            this.f20756 = new C2674(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((ˉי) this.f20757).getClass();
        ((C2674) this.f20756).setSpan(new C2658(c2655), i, i2, 33);
        return true;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m12102(long j, C4457 c4457) {
        if (c4457.m10096() < 9) {
            return;
        }
        int iM10092 = c4457.m10092();
        int iM100922 = c4457.m10092();
        int iM10086 = c4457.m10086();
        if (iM10092 == 434 && iM100922 == 1195456820 && iM10086 == 3) {
            AbstractC3152.m7817(j, c4457, (InterfaceC3178[]) this.f20757);
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public void m12103(C4737 c4737, int i) {
        ((ﹶˆ) this.f20757).ˏᴵ(new RunnableC4654((C4736) this.f20756, c4737, false, i));
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public void m12104(InterfaceC4007 interfaceC4007) {
        interfaceC4007.mo7065(this);
        interfaceC4007.mo7067(this);
        interfaceC4007.mo7066(this);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public void m12105(C1541 c1541) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c1541.f6263);
            jSONObject.put("Status", AbstractC1702.m5411(c1541.f6260));
            jSONObject.put("AuthToken", c1541.f6262);
            jSONObject.put("RefreshToken", c1541.f6266);
            jSONObject.put("TokenCreationEpochInSecs", c1541.f6264);
            jSONObject.put("ExpiresInSecs", c1541.f6261);
            jSONObject.put("FisError", c1541.f6265);
            C2804 c2804 = (C2804) this.f20757;
            c2804.m7085();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", c2804.f10936.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(m12096())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public void m12106(int i, int i2) {
        int[] iArr = (int[]) this.f20756;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m12095(i3);
        int[] iArr2 = (int[]) this.f20756;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f20756;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f20757;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1419 c1419 = (C1419) ((ArrayList) this.f20757).get(size);
            int i4 = c1419.f5784;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f20757).remove(size);
                } else {
                    c1419.f5784 = i4 - i2;
                }
            }
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public void m12107(int i, int i2) {
        int[] iArr = (int[]) this.f20756;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m12095(i3);
        int[] iArr2 = (int[]) this.f20756;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f20756, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f20757;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1419 c1419 = (C1419) ((ArrayList) this.f20757).get(size);
            int i4 = c1419.f5784;
            if (i4 >= i) {
                c1419.f5784 = i4 + i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m12108(java.lang.Throwable r9) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5349.m12108(java.lang.Throwable):void");
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public C1541 m12109() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m12096());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
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
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = AbstractC1702.m5408(5)[iOptInt];
        if (i2 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i2 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C1541(strOptString, i2, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // p324.InterfaceC3707
    /* renamed from: ﹳﹳ */
    public InterfaceC1668 mo8059(C3704 c3704, C3716 c3716) {
        ((C3264) this.f20756).getClass();
        return new C3767(new C3714(c3704, c3716), 3, (List) this.f20757);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m12110(InterfaceC3177 interfaceC3177, C3898 c3898) {
        int i = 0;
        while (true) {
            InterfaceC3178[] interfaceC3178Arr = (InterfaceC3178[]) this.f20757;
            if (i >= interfaceC3178Arr.length) {
                return;
            }
            c3898.m9092();
            c3898.m9091();
            InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(c3898.f15099, 3);
            C2431 c2431 = (C2431) ((List) this.f20756).get(i);
            String str = c2431.f9667;
            AbstractC4464.m10124("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C2417 c2417 = new C2417();
            c3898.m9091();
            c2417.f9614 = c3898.f15096;
            c2417.f9602 = AbstractC2435.m6559(str);
            c2417.f9596 = c2431.f9658;
            c2417.f9625 = c2431.f9689;
            c2417.f9617 = c2431.f9661;
            c2417.f9609 = c2431.f9674;
            ᐧʻ.ˋˊ(c2417, interfaceC3178Mo4851);
            interfaceC3178Arr[i] = interfaceC3178Mo4851;
            i++;
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public byte m12111() {
        return (byte) ((C4640) this.f20757).readUnsignedByte();
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public void m12112(C4488 c4488) {
        ((HashSet) this.f20756).add(c4488);
        if (((C4488) this.f20757) != null) {
            return;
        }
        this.f20757 = c4488;
        C4495 c4495Mo8345 = c4488.f17262.mo8345();
        c4488.f17284 = c4495Mo8345;
        HandlerC4491 handlerC4491 = c4488.f17269;
        int i = AbstractC4470.f17202;
        c4495Mo8345.getClass();
        handlerC4491.getClass();
        handlerC4491.obtainMessage(1, new C4477(C4261.f16556.getAndIncrement(), true, SystemClock.elapsedRealtime(), c4495Mo8345)).sendToTarget();
    }
}
