package p438;

import java.util.HashMap;
import java.util.Iterator;
import p076.C1653;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ﹶﾞ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5117 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f19507;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f19508;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final HashMap f19509;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f19510;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1653 f19511;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f19512;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long f19513;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f19514;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public long f19515;

    public C5117(C1653 c1653, int i, int i2, int i3, int i4) {
        m11350(i3, 0, "bufferForPlaybackMs", "0");
        m11350(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m11350(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m11350(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m11350(i2, i, "maxBufferMs", "minBufferMs");
        m11350(0, 0, "backBufferDurationMs", "0");
        this.f19511 = c1653;
        this.f19507 = AbstractC4470.m10206(i);
        this.f19510 = AbstractC4470.m10206(i2);
        this.f19514 = AbstractC4470.m10206(i3);
        this.f19508 = AbstractC4470.m10206(i4);
        this.f19512 = -1;
        this.f19513 = AbstractC4470.m10206(0);
        this.f19509 = new HashMap();
        this.f19515 = -1L;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m11350(int i, int i2, String str, String str2) {
        AbstractC4464.m10124(str + " cannot be less than " + str2, i >= i2);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m11351() {
        Iterator it = this.f19509.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C5091) it.next()).f19364;
        }
        return i;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m11352(C5086 c5086) {
        int i;
        C5091 c5091 = (C5091) this.f19509.get(c5086.f19330);
        c5091.getClass();
        C1653 c1653 = this.f19511;
        synchronized (c1653) {
            i = c1653.f6450 * c1653.f6445;
        }
        boolean z = i >= m11351();
        long j = this.f19510;
        long jMin = this.f19507;
        float f = c5086.f19329;
        if (f > 1.0f) {
            jMin = Math.min(AbstractC4470.m10211(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = c5086.f19328;
        if (j2 < jMax) {
            c5091.f19365 = !z;
            if (z && j2 < 500000) {
                AbstractC4464.m10144("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z) {
            c5091.f19365 = false;
        }
        return c5091.f19365;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m11353() {
        if (!this.f19509.isEmpty()) {
            this.f19511.m5321(m11351());
            return;
        }
        C1653 c1653 = this.f19511;
        synchronized (c1653) {
            if (c1653.f6448) {
                c1653.m5321(0);
            }
        }
    }
}
