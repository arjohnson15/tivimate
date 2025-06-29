package p456;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import java.io.IOException;
import java.util.Map;
import p202.C2766;
import p238.AbstractC3095;
import p417.AbstractC4753;
import ʿﾞ.ﹳﹳ;
import ˆʽ.ᵎˏ;

/* renamed from: ﾞⁱ.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5354 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f20772;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Object f20773;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f20774;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Object f20775;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20776 = 1;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Object f20777;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Object f20778;

    public RunnableC5354(String str, InterfaceC5293 interfaceC5293, int i, IOException iOException, byte[] bArr, Map map) {
        AbstractC4753.m10683(interfaceC5293);
        this.f20775 = interfaceC5293;
        this.f20772 = i;
        this.f20773 = iOException;
        this.f20777 = bArr;
        this.f20774 = str;
        this.f20778 = map;
    }

    public RunnableC5354(C5301 c5301, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f20772 = i;
        this.f20774 = str;
        this.f20775 = obj;
        this.f20773 = obj2;
        this.f20777 = obj3;
        this.f20778 = c5301;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20776) {
            case 0:
                C5280 c5280 = ((C5236) ((ﹳﹳ) ((C5301) this.f20778)).ᐧⁱ).f20102;
                C5236.m11644(c5280);
                if (!c5280.f20648) {
                    ((C5301) this.f20778).m11915();
                    return;
                }
                C5301 c5301 = (C5301) this.f20778;
                if (c5301.f20565 == 0) {
                    C5245 c5245 = ((C5236) ((ﹳﹳ) c5301).ᐧⁱ).f20123;
                    if (c5245.f20168 == null) {
                        synchronized (c5245) {
                            try {
                                if (c5245.f20168 == null) {
                                    ApplicationInfo applicationInfo = ((C5236) ((ﹳﹳ) c5245).ᐧⁱ).f20114.getApplicationInfo();
                                    String strM7613 = AbstractC3095.m7613();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c5245.f20168 = Boolean.valueOf(str != null && str.equals(strM7613));
                                    }
                                    if (c5245.f20168 == null) {
                                        c5245.f20168 = Boolean.TRUE;
                                        c5245.ˏᵢ().f20571.m4533("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (c5245.f20168.booleanValue()) {
                        ((C5301) this.f20778).f20565 = 'C';
                    } else {
                        ((C5301) this.f20778).f20565 = 'c';
                    }
                }
                C5301 c53012 = (C5301) this.f20778;
                if (c53012.f20569 < 0) {
                    c53012.f20569 = 102001L;
                }
                char cCharAt = "01VDIWEA?".charAt(this.f20772);
                C5301 c53013 = (C5301) this.f20778;
                char c = c53013.f20565;
                long j = c53013.f20569;
                String strM11912 = C5301.m11912(true, this.f20774, this.f20775, this.f20773, this.f20777);
                StringBuilder sb = new StringBuilder("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                String strSubstring = ᵎˏ.ˎٴ(sb, ":", strM11912);
                if (strSubstring.length() > 1024) {
                    strSubstring = this.f20774.substring(0, 1024);
                }
                C2766 c2766 = c5280.f20481;
                if (c2766 != null) {
                    C5280 c52802 = (C5280) c2766.f10822;
                    c52802.ʼᵎ();
                    if (((C5280) c2766.f10822).m11856().getLong((String) c2766.f10819, 0L) == 0) {
                        c2766.m7045();
                    }
                    if (strSubstring == null) {
                        strSubstring = "";
                    }
                    SharedPreferences sharedPreferencesM11856 = c52802.m11856();
                    String str2 = (String) c2766.f10820;
                    long j2 = sharedPreferencesM11856.getLong(str2, 0L);
                    String str3 = (String) c2766.f10818;
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = c52802.m11856().edit();
                        editorEdit.putString(str3, strSubstring);
                        editorEdit.putLong(str2, 1L);
                        editorEdit.apply();
                        return;
                    }
                    long j3 = j2 + 1;
                    boolean z = (c52802.ﹶﾞ().m11956().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = c52802.m11856().edit();
                    if (z) {
                        editorEdit2.putString(str3, strSubstring);
                    }
                    editorEdit2.putLong(str2, j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((InterfaceC5293) this.f20775).mo7954(this.f20774, this.f20772, (IOException) this.f20773, (byte[]) this.f20777, (Map) this.f20778);
                return;
        }
    }
}
