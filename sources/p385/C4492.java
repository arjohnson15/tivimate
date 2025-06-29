package p385;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p033.C1215;
import p149.HandlerC2291;
import p166.AbstractC2424;
import p166.AbstractC2435;
import p166.C2405;
import p166.C2413;
import p166.C2431;
import p193.C2705;
import p293.C3474;
import p310.C3581;
import p345.AbstractC3980;
import p345.AbstractC3985;
import p345.AbstractC3986;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p456.C5349;
import ʻˉ.ᐧˋ;
import ˆˑ.ﹳﹳ;
import ˏᵢ.ᵢٴ;
import ᵢ.ʿʼ;

/* renamed from: ᵢﹶ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4492 implements InterfaceC4483 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public Looper f17288;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Set f17289;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3581 f17290;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int[] f17291;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C2705 f17292;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC4490 f17293;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public C4488 f17294;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public int f17295;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Set f17296;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final ᵢٴ f17297;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final HashMap f17298;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final UUID f17299;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final long f17300;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C1215 f17301;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public Handler f17302;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public C4488 f17303;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean f17304;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public InterfaceC4497 f17305;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C5349 f17306;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public volatile HandlerC2291 f17307;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final ArrayList f17308;

    public C4492(UUID uuid, InterfaceC4490 interfaceC4490, HashMap map, int[] iArr, boolean z, C2705 c2705, long j) {
        C3581 c3581 = C4500.f17318;
        uuid.getClass();
        AbstractC4464.m10124("Use C.CLEARKEY_UUID instead", !AbstractC2424.f9641.equals(uuid));
        this.f17299 = uuid;
        this.f17290 = c3581;
        this.f17293 = interfaceC4490;
        this.f17298 = map;
        this.f17291 = iArr;
        this.f17304 = z;
        this.f17292 = c2705;
        this.f17306 = new C5349();
        this.f17297 = new ᵢٴ(26, this);
        this.f17308 = new ArrayList();
        this.f17289 = Collections.newSetFromMap(new IdentityHashMap());
        this.f17296 = Collections.newSetFromMap(new IdentityHashMap());
        this.f17300 = j;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean m10255(C4488 c4488) {
        c4488.m10244();
        if (c4488.f17271 != 1) {
            return false;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionMo10248 = c4488.mo10248();
        drmSession$DrmSessionExceptionMo10248.getClass();
        Throwable cause = drmSession$DrmSessionExceptionMo10248.getCause();
        return (cause instanceof ResourceBusyException) || ﹳﹳ.ˎٴ(cause);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static ArrayList m10256(C2405 c2405, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c2405.f9502);
        for (int i = 0; i < c2405.f9502; i++) {
            C2413 c2413 = c2405.f9503[i];
            if ((c2413.m6507(uuid) || (AbstractC2424.f9643.equals(uuid) && c2413.m6507(AbstractC2424.f9641))) && (c2413.f9582 != null || z)) {
                arrayList.add(c2413);
            }
        }
        return arrayList;
    }

    @Override // p385.InterfaceC4483
    /* renamed from: ʽᐧ */
    public final void mo10230() {
        m10259(true);
        int i = this.f17295 - 1;
        this.f17295 = i;
        if (i != 0) {
            return;
        }
        if (this.f17300 != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f17308);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C4488) arrayList.get(i2)).mo10246(null);
            }
        }
        AbstractC3986 it = AbstractC3985.m9217(this.f17289).iterator();
        while (it.hasNext()) {
            ((C4498) it.next()).mo8483();
        }
        m10258();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4488 m10257(List list, boolean z, C4480 c4480) {
        this.f17305.getClass();
        boolean z2 = this.f17304 | z;
        InterfaceC4497 interfaceC4497 = this.f17305;
        Looper looper = this.f17288;
        looper.getClass();
        C1215 c1215 = this.f17301;
        c1215.getClass();
        C4488 c4488 = new C4488(this.f17299, interfaceC4497, this.f17306, this.f17297, list, z2, z, null, this.f17298, this.f17293, looper, this.f17292, c1215);
        c4488.mo10247(c4480);
        if (this.f17300 != -9223372036854775807L) {
            c4488.mo10247(null);
        }
        return c4488;
    }

    @Override // p385.InterfaceC4483
    /* renamed from: ˉי */
    public final void mo10231() throws UnsupportedDrmException {
        InterfaceC4497 c3474;
        m10259(true);
        int i = this.f17295;
        this.f17295 = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f17305 == null) {
            UUID uuid = this.f17299;
            this.f17290.getClass();
            try {
                try {
                    try {
                        c3474 = new C4500(uuid);
                    } catch (UnsupportedSchemeException e) {
                        throw new UnsupportedDrmException(e);
                    }
                } catch (Exception e2) {
                    throw new UnsupportedDrmException(e2);
                }
            } catch (UnsupportedDrmException unused) {
                AbstractC4464.m10134("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                c3474 = new C3474(7);
            }
            this.f17305 = c3474;
            c3474.mo8352(new ʿʼ(8, this));
            return;
        }
        if (this.f17300 == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f17308;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C4488) arrayList.get(i2)).mo10247(null);
            i2++;
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m10258() {
        if (this.f17305 != null && this.f17295 == 0 && this.f17308.isEmpty() && this.f17289.isEmpty()) {
            InterfaceC4497 interfaceC4497 = this.f17305;
            interfaceC4497.getClass();
            interfaceC4497.mo8340();
            this.f17305 = null;
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m10259(boolean z) {
        if (z && this.f17288 == null) {
            AbstractC4464.m10127("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f17288;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            AbstractC4464.m10127("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f17288.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p385.InterfaceC4483
    /* renamed from: ˏʾ */
    public final InterfaceC4481 mo10232(C4480 c4480, C2431 c2431) {
        AbstractC4464.m10132(this.f17295 > 0);
        AbstractC4464.m10146(this.f17288);
        C4498 c4498 = new C4498(this, c4480);
        Handler handler = this.f17302;
        handler.getClass();
        handler.post(new ᐧˋ(c4498, 28, c2431));
        return c4498;
    }

    @Override // p385.InterfaceC4483
    /* renamed from: ˏᵢ */
    public final void mo10233(Looper looper, C1215 c1215) {
        synchronized (this) {
            try {
                Looper looper2 = this.f17288;
                if (looper2 == null) {
                    this.f17288 = looper;
                    this.f17302 = new Handler(looper);
                } else {
                    AbstractC4464.m10132(looper2 == looper);
                    this.f17302.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17301 = c1215;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC4493 m10260(Looper looper, C4480 c4480, C2431 c2431, boolean z) {
        if (this.f17307 == null) {
            this.f17307 = new HandlerC2291(this, looper, 4);
        }
        C2405 c2405 = c2431.f9685;
        int i = 0;
        if (c2405 != null) {
            ArrayList arrayListM10256 = m10256(c2405, this.f17299, false);
            if (arrayListM10256.isEmpty()) {
                DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException("Media does not support uuid: " + this.f17299);
                AbstractC4464.m10147("DefaultDrmSessionMgr", "DRM error", defaultDrmSessionManager$MissingSchemeDataException);
                if (c4480 != null) {
                    c4480.m10229(defaultDrmSessionManager$MissingSchemeDataException);
                }
                return new C4496(new DrmSession$DrmSessionException(6003, defaultDrmSessionManager$MissingSchemeDataException));
            }
            C4488 c4488 = this.f17303;
            if (c4488 != null) {
                c4488.mo10247(c4480);
                return c4488;
            }
            C4488 c4488M10261 = m10261(arrayListM10256, false, c4480, z);
            this.f17303 = c4488M10261;
            this.f17308.add(c4488M10261);
            return c4488M10261;
        }
        int iM6554 = AbstractC2435.m6554(c2431.f9667);
        InterfaceC4497 interfaceC4497 = this.f17305;
        interfaceC4497.getClass();
        if (interfaceC4497.mo8350() == 2 && C4479.f17247) {
            return null;
        }
        int[] iArr = this.f17291;
        while (true) {
            if (i >= iArr.length) {
                i = -1;
                break;
            }
            if (iArr[i] == iM6554) {
                break;
            }
            i++;
        }
        if (i == -1 || interfaceC4497.mo8350() == 1) {
            return null;
        }
        C4488 c44882 = this.f17294;
        if (c44882 == null) {
            C3928 c3928 = AbstractC3980.f15360;
            C4488 c4488M102612 = m10261(C3932.f15274, true, null, z);
            this.f17308.add(c4488M102612);
            this.f17294 = c4488M102612;
        } else {
            c44882.mo10247(null);
        }
        return this.f17294;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4488 m10261(List list, boolean z, C4480 c4480, boolean z2) {
        C4488 c4488M10257 = m10257(list, z, c4480);
        boolean zM10255 = m10255(c4488M10257);
        long j = this.f17300;
        Set set = this.f17296;
        if (zM10255 && !set.isEmpty()) {
            AbstractC3986 it = AbstractC3985.m9217(set).iterator();
            while (it.hasNext()) {
                ((InterfaceC4493) it.next()).mo10246(null);
            }
            c4488M10257.mo10246(c4480);
            if (j != -9223372036854775807L) {
                c4488M10257.mo10246(null);
            }
            c4488M10257 = m10257(list, z, c4480);
        }
        if (!m10255(c4488M10257) || !z2) {
            return c4488M10257;
        }
        Set set2 = this.f17289;
        if (set2.isEmpty()) {
            return c4488M10257;
        }
        AbstractC3986 it2 = AbstractC3985.m9217(set2).iterator();
        while (it2.hasNext()) {
            ((C4498) it2.next()).mo8483();
        }
        if (!set.isEmpty()) {
            AbstractC3986 it3 = AbstractC3985.m9217(set).iterator();
            while (it3.hasNext()) {
                ((InterfaceC4493) it3.next()).mo10246(null);
            }
        }
        c4488M10257.mo10246(c4480);
        if (j != -9223372036854775807L) {
            c4488M10257.mo10246(null);
        }
        return m10257(list, z, c4480);
    }

    @Override // p385.InterfaceC4483
    /* renamed from: ﹳﹳ */
    public final InterfaceC4493 mo10234(C4480 c4480, C2431 c2431) {
        m10259(false);
        AbstractC4464.m10132(this.f17295 > 0);
        AbstractC4464.m10146(this.f17288);
        return m10260(this.f17288, c4480, c2431, true);
    }

    @Override // p385.InterfaceC4483
    /* renamed from: ﹶˆ */
    public final int mo10235(C2431 c2431) {
        String str;
        m10259(false);
        InterfaceC4497 interfaceC4497 = this.f17305;
        interfaceC4497.getClass();
        int iMo8350 = interfaceC4497.mo8350();
        C2405 c2405 = c2431.f9685;
        if (c2405 == null) {
            int iM6554 = AbstractC2435.m6554(c2431.f9667);
            int i = 0;
            while (true) {
                int[] iArr = this.f17291;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iM6554) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                return iMo8350;
            }
            return 0;
        }
        UUID uuid = this.f17299;
        if (!m10256(c2405, uuid, true).isEmpty()) {
            str = c2405.f9501;
            if (str == null && !"cenc".equals(str)) {
                if ("cbcs".equals(str)) {
                    if (AbstractC4470.f17202 >= 25) {
                        return iMo8350;
                    }
                } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                    return iMo8350;
                }
            }
        } else if (c2405.f9502 == 1 && c2405.f9503[0].m6507(AbstractC2424.f9641)) {
            AbstractC4464.m10144("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
            str = c2405.f9501;
            return str == null ? iMo8350 : iMo8350;
        }
        return 1;
    }
}
