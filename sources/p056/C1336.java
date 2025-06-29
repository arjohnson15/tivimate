package p056;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p345.C3932;
import p383.AbstractC4464;

/* renamed from: ʾˈ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1336 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f5443 = new ArrayList();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public ByteBuffer[] f5444 = new ByteBuffer[0];

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3932 f5445;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f5446;

    public C1336(C3932 c3932) {
        this.f5445 = c3932;
        C1333 c1333 = C1333.f5415;
        this.f5446 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1336)) {
            return false;
        }
        C1336 c1336 = (C1336) obj;
        C3932 c3932 = this.f5445;
        if (c3932.size() != c1336.f5445.size()) {
            return false;
        }
        for (int i = 0; i < c3932.size(); i++) {
            if (c3932.get(i) != c1336.f5445.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f5445.hashCode();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m4659() {
        ArrayList arrayList = this.f5443;
        arrayList.clear();
        this.f5446 = false;
        int i = 0;
        while (true) {
            C3932 c3932 = this.f5445;
            if (i >= c3932.size()) {
                break;
            }
            InterfaceC1335 interfaceC1335 = (InterfaceC1335) c3932.get(i);
            interfaceC1335.flush();
            if (interfaceC1335.mo4652()) {
                arrayList.add(interfaceC1335);
            }
            i++;
        }
        this.f5444 = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= m4661(); i2++) {
            this.f5444[i2] = ((InterfaceC1335) arrayList.get(i2)).mo4658();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m4660() {
        return !this.f5443.isEmpty();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m4661() {
        return this.f5444.length - 1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1333 m4662(C1333 c1333) {
        if (c1333.equals(C1333.f5415)) {
            throw new AudioProcessor$UnhandledAudioFormatException(c1333);
        }
        int i = 0;
        while (true) {
            C3932 c3932 = this.f5445;
            if (i >= c3932.size()) {
                return c1333;
            }
            InterfaceC1335 interfaceC1335 = (InterfaceC1335) c3932.get(i);
            C1333 c1333Mo4653 = interfaceC1335.mo4653(c1333);
            if (interfaceC1335.mo4652()) {
                AbstractC4464.m10132(!c1333Mo4653.equals(C1333.f5415));
                c1333 = c1333Mo4653;
            }
            i++;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m4663(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= m4661()) {
                if (!this.f5444[i].hasRemaining()) {
                    ArrayList arrayList = this.f5443;
                    InterfaceC1335 interfaceC1335 = (InterfaceC1335) arrayList.get(i);
                    if (!interfaceC1335.mo4654()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f5444[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC1335.f5442;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC1335.mo4657(byteBuffer2);
                        this.f5444[i] = interfaceC1335.mo4658();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f5444[i].hasRemaining();
                    } else if (!this.f5444[i].hasRemaining() && i < m4661()) {
                        ((InterfaceC1335) arrayList.get(i + 1)).mo4656();
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m4664() {
        return this.f5446 && ((InterfaceC1335) this.f5443.get(m4661())).mo4654() && !this.f5444[m4661()].hasRemaining();
    }
}
