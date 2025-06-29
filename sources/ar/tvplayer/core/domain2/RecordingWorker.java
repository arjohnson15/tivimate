package ar.tvplayer.core.domain2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import p041.C1274;
import p078.EnumC1681;
import p078.EnumC1687;
import p080.AbstractC1702;
import p132.C2077;
import p143.C2227;
import p186.C2587;
import p215.EnumC2820;
import p252.AbstractC3139;
import p260.C3222;
import p288.C3395;
import p288.C3406;
import p296.C3486;
import p317.AbstractC3616;
import p317.AbstractC3619;
import p317.AbstractC3629;
import p331.C3758;
import p342.EnumC3910;
import p366.AbstractC4152;
import p366.C4144;
import p366.InterfaceC4161;
import p446.C5158;
import p446.C5168;
import p447.AbstractC5179;
import ˈי.ʾˈ;
import ˉﾞ.ـᵎ;
import ˉﾞ.ﹳﹳ;
import ˏʼ.ʽᐧ;
import ᵎﹳ.ᐧʻ;
import ᵢˈ.ـˆ;
import ᵢˈ.ﾞᐧ;

@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes.dex */
public final class RecordingWorker extends CoroutineWorker {

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final CopyOnWriteArraySet f2253 = new CopyOnWriteArraySet();

    /* renamed from: ˉי, reason: contains not printable characters */
    public C3486 f2254;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C5158 f2255;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C4144 f2256;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public C5168 f2257;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final C3406 f2258;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C1274 f2259;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public ﹳﹳ f2260;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C3406 f2261;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public volatile boolean f2262;

    public RecordingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2261 = new C3406(new ـˆ(0));
        this.f2258 = new C3406(new ـˆ(1));
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static String m1453(ـᵎ r6) {
        String string = r6.ˉⁱ;
        if (string == null || string.length() == 0) {
            String str = r6.ˉי;
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                str = r6.ᐧʻ;
            }
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochSecond(r6.ˑʽ), ZoneId.systemDefault());
            StringBuilder sbM5407 = AbstractC1702.m5407(str);
            sbM5407.append(DateTimeFormatter.ofPattern(" yyyyMMdd HHmmss").format(localDateTimeOfInstant));
            string = sbM5407.toString();
        }
        String str2 = ᐧʻ.ˉⁱ(string, ".ts");
        if (!C2587.m6726() || !C2587.m6716()) {
            return "1.ts";
        }
        boolean z = AbstractC3139.f12115;
        char[] charArray = str2.toCharArray();
        int length = charArray.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char c = charArray[i];
            int i3 = i2 + 1;
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '-') {
                charArray[i2] = '_';
            }
            i++;
            i2 = i3;
        }
        return new String(charArray);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final String m1454(InterfaceC4161 interfaceC4161) {
        String strM8516;
        String strMo9513 = interfaceC4161.mo9513();
        if (strMo9513 == null || (strM8516 = AbstractC3616.m8516(strMo9513, 65279)) == null) {
            return null;
        }
        return AbstractC3616.m8539(strM8516).toString();
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m1455(InterfaceC4161 interfaceC4161, Uri uri, String str) throws Exception {
        OutputStream outputStreamOpenOutputStream;
        Uri uriCreateDocument;
        C3758 c3758M8722 = C3758.m8722(ˈʼ.ﹳﹳ.ـﹶ(), uri);
        C3758 c3758M8740 = c3758M8722.m8740(str);
        Throwable th = null;
        if (c3758M8740 == null) {
            Context context = (Context) c3758M8722.f14519;
            try {
                uriCreateDocument = DocumentsContract.createDocument(context.getContentResolver(), (Uri) c3758M8722.f14520, "*/*", str);
            } catch (Exception unused) {
                uriCreateDocument = null;
            }
            c3758M8740 = uriCreateDocument != null ? new C3758(context, 8, uriCreateDocument) : null;
        }
        if (c3758M8740 == null || (outputStreamOpenOutputStream = ˈʼ.ﹳﹳ.ـﹶ().getContentResolver().openOutputStream((Uri) c3758M8740.f14520, "wa")) == null) {
            return;
        }
        C4144 c4144 = new C4144(ʽᐧ.יʻ(outputStreamOpenOutputStream));
        try {
            c4144.m9536(interfaceC4161);
            try {
                c4144.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                c4144.close();
            } catch (Throwable th4) {
                ʾˈ.ـﹶ(th, th4);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:288:0x0518 -> B:426:0x0519). Please report as a decompilation issue!!! */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final java.lang.Object m1456(ar.tvplayer.core.domain2.RecordingWorker r20, ˉﾞ.ـᵎ r21, java.lang.String r22, p185.AbstractC2562 r23) {
        /*
            Method dump skipped, instructions count: 1524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.RecordingWorker.m1456(ar.tvplayer.core.domain2.RecordingWorker, ˉﾞ.ـᵎ, java.lang.String, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static String m1457(ـᵎ r5) {
        String str;
        String strM5875 = C2077.f7939.m5875();
        if (AbstractC3139.m7707(strM5875)) {
            str = AbstractC3629.m8559(strM5875, "/tree/", "/document/", false) + "%2F" + m1453(r5);
        } else {
            str = strM5875 + '/' + m1453(r5);
        }
        int i = 1;
        String strM11550 = str;
        while (AbstractC3139.m7767(strM11550)) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC3616.m8518(str, ".ts"));
            sb.append(" (");
            strM11550 = AbstractC5179.m11550(sb, i, ").ts");
            i++;
        }
        return strM11550;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static ﾞᐧ m1458(String str, String str2, InterfaceC4161 interfaceC4161) throws NumberFormatException {
        Long lM8557;
        String strM1454;
        ArrayList arrayList = new ArrayList();
        long jLongValue = -1;
        String str3 = "";
        int i = 0;
        while (true) {
            String strM14542 = m1454(interfaceC4161);
            if (strM14542 == null) {
                return new ﾞᐧ(str, str2, str3, jLongValue, arrayList);
            }
            if (AbstractC3629.m8560(strM14542, "#EXT-X-STREAM-INF", false)) {
                int iM8540 = AbstractC3616.m8540(strM14542, "BANDWIDTH=", 0, true, 2);
                if (iM8540 != -1) {
                    int iM85402 = AbstractC3616.m8540(strM14542, ",", iM8540, false, 4);
                    int i2 = Integer.parseInt(iM85402 != -1 ? strM14542.substring(iM8540 + 10, iM85402) : strM14542.substring(iM8540 + 10));
                    if (i2 > i) {
                        String strM14543 = m1454(interfaceC4161);
                        if (strM14543 != null) {
                            str3 = strM14543;
                        }
                        i = i2;
                    }
                }
            } else if (AbstractC3629.m8560(strM14542, "#EXT-X-MEDIA-SEQUENCE", false)) {
                int iM8527 = AbstractC3616.m8527(strM14542, ':', 0, false, 6);
                if (iM8527 != -1 && (lM8557 = AbstractC3619.m8557(strM14542.substring(iM8527 + 1))) != null) {
                    jLongValue = lM8557.longValue();
                }
            } else if (AbstractC3629.m8560(strM14542, "#EXTINF", false)) {
                do {
                    strM1454 = m1454(interfaceC4161);
                    if (strM1454 == null) {
                        break;
                    }
                } while (AbstractC3629.m8560(strM1454, "#", false));
                if (strM1454 != null) {
                    arrayList.add(strM1454);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: ʿʼ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1367(p330.InterfaceC3746 r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ᵢˈ.ʾʼ
            if (r0 == 0) goto L13
            r0 = r6
            ᵢˈ.ʾʼ r0 = (ᵢˈ.ʾʼ) r0
            int r1 = r0.ᵢʿ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.ᵢʿ = r1
            goto L1a
        L13:
            ᵢˈ.ʾʼ r0 = new ᵢˈ.ʾʼ
            ˎʻ.ˑʽ r6 = (p185.AbstractC2562) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.ᐧˋ
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.ᵢʿ
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            יˑ.ﹳﹳ r6 = p072.AbstractC1586.f6345
            יˑ.ˑʽ r6 = p253.ExecutorC3146.f12150
            ᵢˈ.ˎᵔ r2 = new ᵢˈ.ˎᵔ
            r4 = 0
            r2.<init>(r5, r4)
            r0.ᵢʿ = r3
            java.lang.Object r6 = p072.AbstractC1642.m5295(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.RecordingWorker.mo1367(ᴵⁱ.ʿʼ):java.lang.Object");
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m1459() {
        try {
            C4144 c4144 = this.f2256;
            if (c4144 != null) {
                c4144.close();
            }
            C5158 c5158 = this.f2255;
            if (c5158 != null) {
                c5158.close();
            }
            C5168 c5168 = this.f2257;
            if (c5168 != null) {
                c5168.close();
            }
            C3486 c3486 = this.f2254;
            if (c3486 != null) {
                c3486.close();
            }
        } catch (Exception unused) {
        }
        this.f2256 = null;
        this.f2255 = null;
        this.f2257 = null;
        this.f2254 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1460(java.lang.String r12, java.lang.String r13, p185.AbstractC2562 r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.RecordingWorker.m1460(java.lang.String, java.lang.String, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|192|(1:(7:(1:(1:(6:14|15|16|17|200|147)(2:22|23))(4:24|202|25|26))(15:30|198|31|32|177|98|99|214|218|(11:206|66|(7:68|69|181|70|(2:72|73)(5:76|208|77|78|(3:80|212|81)(2:86|87))|88|(1:210)(2:108|109))(4:217|115|116|117)|165|103|101|102|140|141|(2:143|(1:145)(4:146|17|200|147))(2:150|151)|64)|216|118|204|119|(8:121|122|179|123|124|194|125|(1:127))(1:133))|19|155|(1:157)(1:158)|(1:161)(1:162)|163|164)(6:35|183|36|190|53|(4:137|188|138|139)(13:(1:56)|57|(2:60|58)|215|62|63|218|(1:64)|216|118|204|119|(0)(0))))(7:39|187|40|41|185|42|43)|(2:196|45)(1:48)|175|49|(1:51)(4:52|190|53|(0)(0))|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:30|(3:198|31|32)|(1:177)|98|99|214|218|(11:206|66|(7:68|69|181|70|(2:72|73)(5:76|208|77|78|(3:80|212|81)(2:86|87))|88|(1:210)(2:108|109))(4:217|115|116|117)|165|103|101|102|140|141|(2:143|(1:145)(4:146|17|200|147))(2:150|151)|64)|216|118|204|119|(8:121|122|179|123|124|194|125|(1:127))(1:133)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:68|181|70|(2:72|73)(5:76|208|77|78|(3:80|212|81)(2:86|87))|88|(1:210)(2:108|109)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:121|122|179|123|124|194|125|(1:127)) */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b2, code lost:
    
        r15 = r0;
        r14 = r1;
        r1 = r4;
        r13 = r5;
        r4 = r6;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02bb, code lost:
    
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02bf, code lost:
    
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f3, code lost:
    
        r4.ᐧˋ = r7;
        r4.ˆᵔ = r0;
        r4.ᵢʿ = r1;
        r4.ﹳﹶ = r2;
        r4.ˋˉ = r5;
        r4.ـˆ = r15;
        r4.ᴵʼ = r14;
        r4.ﾞᐧ = r13;
        r4.ʾʼ = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0205, code lost:
    
        r12 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0207, code lost:
    
        r4.ˑﾞ = r12;
        r4.ˑⁱ = r6;
        r9 = r24;
        r4.ᵢٴ = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0210, code lost:
    
        r4.ʻʿ = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0216, code lost:
    
        if (r7.m1460(r10, r0, r4) != r3) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0218, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0219, code lost:
    
        r10 = r2;
        r20 = r15;
        r15 = r0;
        r0 = r20;
        r21 = r6;
        r6 = r1;
        r1 = r4;
        r4 = r21;
        r7 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0282 A[Catch: CancellationException -> 0x0052, Exception -> 0x02bb, ProtocolException -> 0x02bf, TRY_LEAVE, TryCatch #28 {CancellationException -> 0x0052, blocks: (B:15:0x0042, B:45:0x00ec, B:49:0x00f8, B:53:0x0123, B:56:0x012f, B:57:0x0131, B:58:0x014c, B:60:0x0152, B:62:0x0162, B:64:0x0179, B:66:0x017f, B:68:0x0187, B:70:0x018b, B:92:0x0207, B:94:0x0210, B:98:0x0225, B:116:0x0276, B:117:0x027a, B:119:0x027e, B:121:0x0282, B:123:0x0286, B:125:0x02a7, B:138:0x02cf, B:139:0x02d6, B:25:0x006e, B:31:0x00a0, B:36:0x00cb), top: B:192:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e6 A[Catch: Exception -> 0x031b, CancellationException -> 0x031d, TryCatch #34 {CancellationException -> 0x031d, Exception -> 0x031b, blocks: (B:147:0x030d, B:141:0x02d8, B:143:0x02e6, B:150:0x031f, B:151:0x0326), top: B:200:0x030d }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031f A[Catch: Exception -> 0x031b, CancellationException -> 0x031d, TryCatch #34 {CancellationException -> 0x031d, Exception -> 0x031b, blocks: (B:147:0x030d, B:141:0x02d8, B:143:0x02e6, B:150:0x031f, B:151:0x0326), top: B:200:0x030d }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0343 A[PHI: r12
  0x0343: PHI (r12v7 int) = (r12v3 int), (r12v8 int), (r12v14 int) binds: [B:156:0x0334, B:21:0x0053, B:149:0x031d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18, types: [ar.tvplayer.core.domain2.RecordingWorker] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x02af -> B:44:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x02c2 -> B:44:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x0309 -> B:17:0x004a). Please report as a decompilation issue!!! */
    /* renamed from: ˏʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1461(java.lang.String r24, ᵢˈ.ˋˊ r25, java.lang.String r26, p185.AbstractC2562 r27) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.RecordingWorker.m1461(java.lang.String, ᵢˈ.ˋˊ, java.lang.String, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1462(ᵢˈ.ˋˊ r9, p185.AbstractC2562 r10) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ᵢˈ.ᵔ
            if (r0 == 0) goto L13
            r0 = r10
            ᵢˈ.ᵔ r0 = (ᵢˈ.ᵔ) r0
            int r1 = r0.ﹳﹶ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.ﹳﹶ = r1
            goto L18
        L13:
            ᵢˈ.ᵔ r0 = new ᵢˈ.ᵔ
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.ˆᵔ
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.ﹳﹶ
            java.lang.String r3 = ""
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L32
            java.lang.Object r9 = r0.ᐧˋ
            ᵢˈ.ﾞᐧ r9 = (ᵢˈ.ﾞᐧ) r9
            ˈⁱ.ˉⁱ.ˆʿ(r10)
            goto L98
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.Object r9 = r0.ᐧˋ
            ar.tvplayer.core.domain2.RecordingWorker r9 = (ar.tvplayer.core.domain2.RecordingWorker) r9
            ˈⁱ.ˉⁱ.ˆʿ(r10)
            goto L66
        L42:
            ˈⁱ.ˉⁱ.ˆʿ(r10)
            java.lang.String r10 = r9.ˑʽ
            ˉﾞ.ﹳﹳ r2 = r8.f2260
            if (r2 == 0) goto L50
            java.lang.String r2 = ᴵˎ.ᴵˋ.ˏᴵ(r2, r9)
            goto L51
        L50:
            r2 = r4
        L51:
            if (r2 != 0) goto L54
            r2 = r3
        L54:
            java.util.List r9 = r9.ʿʼ
            ﹶˏ.ﾞʽ r9 = p252.AbstractC3139.m7738(r10, r2, r9)
            r0.ᐧˋ = r8
            r0.ﹳﹶ = r6
            java.lang.Object r10 = r8.m1463(r9, r0)
            if (r10 != r1) goto L65
            return r1
        L65:
            r9 = r8
        L66:
            ᵢˈ.ﾞᐧ r10 = (ᵢˈ.ﾞᐧ) r10
            java.lang.String r2 = r10.ˑʽ
            int r2 = r2.length()
            if (r2 <= 0) goto Lab
            java.lang.String r2 = r10.ـﹶ
            java.lang.String r6 = r10.ˑʽ
            java.lang.String r2 = p383.AbstractC4464.m10145(r2, r6)
            ˉﾞ.ﹳﹳ r6 = r9.f2260
            if (r6 == 0) goto L80
            java.lang.String r4 = ᴵˎ.ᴵˋ.ˏᴵ(r6, r4)
        L80:
            if (r4 != 0) goto L83
            goto L84
        L83:
            r3 = r4
        L84:
            ʻי.ﹳˎ r4 = p013.C1053.f4449
            ﹶˏ.ﾞʽ r2 = p252.AbstractC3139.m7738(r2, r3, r4)
            r0.ᐧˋ = r10
            r0.ﹳﹶ = r5
            java.lang.Object r9 = r9.m1463(r2, r0)
            if (r9 != r1) goto L95
            return r1
        L95:
            r7 = r10
            r10 = r9
            r9 = r7
        L98:
            ᵢˈ.ﾞᐧ r10 = (ᵢˈ.ﾞᐧ) r10
            java.lang.String r2 = r9.ʽᐧ
            java.lang.String r1 = r10.ـﹶ
            ᵢˈ.ﾞᐧ r9 = new ᵢˈ.ﾞᐧ
            java.lang.String r3 = r10.ˑʽ
            long r4 = r10.ﹳﹳ
            java.util.List r6 = r10.ʿʼ
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r9
        Lab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.RecordingWorker.m1462(ᵢˈ.ˋˊ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: ˑי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1463(p430.C5021 r11, p185.AbstractC2562 r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.RecordingWorker.m1463(ﹶˏ.ﾞʽ, ˎʻ.ˑʽ):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    /* renamed from: ٴˎ */
    public final Object mo1369() {
        return AbstractC3139.m7740(2);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m1464(InterfaceC4161 interfaceC4161, String str) throws Exception {
        C3486 c3486;
        if (!AbstractC3139.m7772(str)) {
            if (AbstractC3139.m7707(str)) {
                C3395 c3395M7780 = AbstractC3139.m7780(str);
                m1455(interfaceC4161, (Uri) c3395M7780.f13245, (String) c3395M7780.f13244);
                return;
            }
            File file = new File(str);
            if (AbstractC3139.m7727(file)) {
                m1455(interfaceC4161, AbstractC3139.m7779(file.getParentFile()), file.getName());
                return;
            }
            Logger logger = AbstractC4152.f16061;
            C4144 c4144 = new C4144(ʽᐧ.יʻ(new FileOutputStream(file, true)));
            try {
                c4144.m9536(interfaceC4161);
                try {
                    c4144.close();
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    c4144.close();
                } catch (Throwable th3) {
                    ʾˈ.ـﹶ(th, th3);
                }
            }
            if (th != null) {
                throw th;
            }
            return;
        }
        if (this.f2256 == null || (c3486 = this.f2254) == null || !c3486.f13473.m7605()) {
            m1459();
            this.f2254 = AbstractC3139.m7724().m4527(AbstractC3616.m8531(AbstractC3616.m8538(str, "://", str), "/"));
            C2077 c2077 = C2077.f7939;
            C2227 c2227M8373 = this.f2254.m8373(new C3222(c2077.m5753(), c2077.m5747().toCharArray()));
            String strM8538 = AbstractC3616.m8538(str, "://", str);
            this.f2257 = (C5168) c2227M8373.m6208(AbstractC3616.m8531(AbstractC3616.m8538(strM8538, "/", strM8538), "/"));
            String strM85382 = AbstractC3616.m8538(str, "://", str);
            String strM85383 = AbstractC3616.m8538(strM85382, "/", strM85382);
            String strM85384 = AbstractC3616.m8538(strM85383, "/", strM85383);
            C5168 c5168 = this.f2257;
            EnumSet enumSetOf = EnumSet.of(EnumC2820.f10967);
            EnumSet enumSetOf2 = EnumSet.of(EnumC3910.f15210);
            EnumC1687 enumC1687 = EnumC1687.f6565;
            C5158 c5158M11467 = c5168.m11467(strM85384, enumSetOf, enumSetOf2, 4, EnumSet.noneOf(EnumC1681.class));
            this.f2255 = c5158M11467;
            this.f2256 = new C4144(ʽᐧ.יʻ(c5158M11467.m11456(true)));
        }
        C4144 c41442 = this.f2256;
        if (c41442 != null) {
            c41442.m9536(interfaceC4161);
        }
    }
}
