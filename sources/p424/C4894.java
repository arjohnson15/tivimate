package p424;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.Iterator;
import p256.C3202;
import p356.AbstractC4034;
import p356.C4030;
import p383.AbstractC4464;
import p417.AbstractC4753;
import p456.C5236;
import p456.C5279;
import p456.C5301;
import p456.C5316;

/* renamed from: ﹶʾ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4894 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f18476;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object f18477;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f18478;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f18479 = 0;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object f18480;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object f18481;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f18482;

    public C4894(long j, AbstractC4034 abstractC4034, C4030 c4030, C3202 c3202, long j2, InterfaceC4906 interfaceC4906) {
        this.f18476 = j;
        this.f18477 = abstractC4034;
        this.f18480 = c4030;
        this.f18478 = j2;
        this.f18482 = c3202;
        this.f18481 = interfaceC4906;
    }

    public C4894(C5236 c5236, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C5279 c5279;
        AbstractC4753.m10688(str2);
        AbstractC4753.m10688(str3);
        this.f18482 = str2;
        this.f18477 = str3;
        this.f18480 = TextUtils.isEmpty(str) ? null : str;
        this.f18476 = j;
        this.f18478 = j2;
        if (j2 != 0 && j2 > j) {
            C5301 c5301 = c5236.f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4531(C5301.m11911(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            c5279 = new C5279(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    C5301 c53012 = c5236.f20110;
                    C5236.m11647(c53012);
                    c53012.f20571.m4533("Param name can't be null");
                    it.remove();
                } else {
                    C5316 c5316 = c5236.f20095;
                    C5236.m11644(c5316);
                    Object objM11983 = c5316.m11983(bundle2.get(next), next);
                    if (objM11983 == null) {
                        C5301 c53013 = c5236.f20110;
                        C5236.m11647(c53013);
                        c53013.f20568.m4531(c5236.f20108.m11772(next), "Param value can't be null");
                        it.remove();
                    } else {
                        C5316 c53162 = c5236.f20095;
                        C5236.m11644(c53162);
                        c53162.m11957(bundle2, next, objM11983);
                    }
                }
            }
            c5279 = new C5279(bundle2);
        }
        this.f18481 = c5279;
    }

    public C4894(C5236 c5236, String str, String str2, String str3, long j, long j2, C5279 c5279) {
        AbstractC4753.m10688(str2);
        AbstractC4753.m10688(str3);
        AbstractC4753.m10683(c5279);
        this.f18482 = str2;
        this.f18477 = str3;
        this.f18480 = TextUtils.isEmpty(str) ? null : str;
        this.f18476 = j;
        this.f18478 = j2;
        if (j2 != 0 && j2 > j) {
            C5301 c5301 = c5236.f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4529(C5301.m11911(str2), C5301.m11911(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f18481 = c5279;
    }

    public String toString() {
        switch (this.f18479) {
            case 1:
                return "Event{appId='" + ((String) this.f18482) + "', name='" + ((String) this.f18477) + "', params=" + String.valueOf((C5279) this.f18481) + "}";
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long m11008(long j) {
        InterfaceC4906 interfaceC4906 = (InterfaceC4906) this.f18481;
        AbstractC4464.m10146(interfaceC4906);
        return interfaceC4906.mo4857(this.f18476, j) + this.f18478;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long m11009(long j) {
        long jM11013 = m11013(j);
        InterfaceC4906 interfaceC4906 = (InterfaceC4906) this.f18481;
        AbstractC4464.m10146(interfaceC4906);
        return interfaceC4906.mo4868(j - this.f18478, this.f18476) + jM11013;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C4894 m11010(C5236 c5236, long j) {
        return new C4894(c5236, (String) this.f18480, (String) this.f18482, (String) this.f18477, this.f18476, j, (C5279) this.f18481);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long m11011(long j) {
        long jM11008 = m11008(j);
        InterfaceC4906 interfaceC4906 = (InterfaceC4906) this.f18481;
        AbstractC4464.m10146(interfaceC4906);
        return (interfaceC4906.mo4878(this.f18476, j) + jM11008) - 1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C4894 m11012(long j, AbstractC4034 abstractC4034) throws BehindLiveWindowException {
        long jMo4867;
        InterfaceC4906 interfaceC4906Mo9296 = ((AbstractC4034) this.f18477).mo9296();
        InterfaceC4906 interfaceC4906Mo92962 = abstractC4034.mo9296();
        if (interfaceC4906Mo9296 == null) {
            return new C4894(j, abstractC4034, (C4030) this.f18480, (C3202) this.f18482, this.f18478, interfaceC4906Mo9296);
        }
        if (!interfaceC4906Mo9296.mo4872()) {
            return new C4894(j, abstractC4034, (C4030) this.f18480, (C3202) this.f18482, this.f18478, interfaceC4906Mo92962);
        }
        long jMo4879 = interfaceC4906Mo9296.mo4879(j);
        if (jMo4879 == 0) {
            return new C4894(j, abstractC4034, (C4030) this.f18480, (C3202) this.f18482, this.f18478, interfaceC4906Mo92962);
        }
        AbstractC4464.m10146(interfaceC4906Mo92962);
        long jMo4856 = interfaceC4906Mo9296.mo4856();
        long jMo4862 = interfaceC4906Mo9296.mo4862(jMo4856);
        long j2 = jMo4879 + jMo4856;
        long j3 = j2 - 1;
        long jMo4868 = interfaceC4906Mo9296.mo4868(j3, j) + interfaceC4906Mo9296.mo4862(j3);
        long jMo48562 = interfaceC4906Mo92962.mo4856();
        long jMo48622 = interfaceC4906Mo92962.mo4862(jMo48562);
        long j4 = this.f18478;
        if (jMo4868 == jMo48622) {
            jMo4867 = (j2 - jMo48562) + j4;
        } else {
            if (jMo4868 < jMo48622) {
                throw new BehindLiveWindowException();
            }
            jMo4867 = jMo48622 < jMo4862 ? j4 - (interfaceC4906Mo92962.mo4867(jMo4862, j) - jMo4856) : (interfaceC4906Mo9296.mo4867(jMo48622, j) - jMo48562) + j4;
        }
        return new C4894(j, abstractC4034, (C4030) this.f18480, (C3202) this.f18482, jMo4867, interfaceC4906Mo92962);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long m11013(long j) {
        InterfaceC4906 interfaceC4906 = (InterfaceC4906) this.f18481;
        AbstractC4464.m10146(interfaceC4906);
        return interfaceC4906.mo4862(j - this.f18478);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean m11014(long j, long j2) {
        InterfaceC4906 interfaceC4906 = (InterfaceC4906) this.f18481;
        AbstractC4464.m10146(interfaceC4906);
        return interfaceC4906.mo4872() || j2 == -9223372036854775807L || m11009(j) <= j2;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long m11015() {
        InterfaceC4906 interfaceC4906 = (InterfaceC4906) this.f18481;
        AbstractC4464.m10146(interfaceC4906);
        return interfaceC4906.mo4879(this.f18476);
    }
}
