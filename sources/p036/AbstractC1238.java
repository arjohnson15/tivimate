package p036;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p166.C2431;
import p166.C2433;
import p256.AbstractC3191;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ʼﹶ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1238 implements InterfaceC1239 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f5055;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long[] f5056;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int[] f5057;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2433 f5058;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f5059;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2431[] f5060;

    public AbstractC1238(C2433 c2433, int[] iArr) {
        int i = 0;
        AbstractC4464.m10132(iArr.length > 0);
        c2433.getClass();
        this.f5058 = c2433;
        int length = iArr.length;
        this.f5055 = length;
        this.f5060 = new C2431[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f5060[i2] = c2433.f9700[iArr[i2]];
        }
        Arrays.sort(this.f5060, new C1259(0));
        this.f5057 = new int[this.f5055];
        while (true) {
            int i3 = this.f5055;
            if (i >= i3) {
                this.f5056 = new long[i3];
                return;
            } else {
                this.f5057[i] = c2433.m6544(this.f5060[i]);
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1238 abstractC1238 = (AbstractC1238) obj;
        return this.f5058.equals(abstractC1238.f5058) && Arrays.equals(this.f5057, abstractC1238.f5057);
    }

    public final int hashCode() {
        if (this.f5059 == 0) {
            this.f5059 = Arrays.hashCode(this.f5057) + (System.identityHashCode(this.f5058) * 31);
        }
        return this.f5059;
    }

    @Override // p036.InterfaceC1239
    public final int length() {
        return this.f5057.length;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ void mo4431(boolean z) {
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void mo4432() {
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final int mo4433(int i) {
        for (int i2 = 0; i2 < this.f5055; i2++) {
            if (this.f5057[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2433 mo4434() {
        return this.f5058;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C2431 mo4435() {
        return this.f5060[mo4449()];
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void mo4436(float f) {
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void mo4437() {
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean mo4438(int i, long j) {
        return this.f5056[i] > j;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int mo4439(C2431 c2431) {
        for (int i = 0; i < this.f5055; i++) {
            if (this.f5060[i] == c2431) {
                return i;
            }
        }
        return -1;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int mo4440(int i) {
        return this.f5057[i];
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int mo4441(long j, List list) {
        return list.size();
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final boolean mo4442(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo4438 = mo4438(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f5055 && !zMo4438) {
            zMo4438 = (i2 == i || mo4438(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zMo4438) {
            return false;
        }
        long[] jArr = this.f5056;
        long j2 = jArr[i];
        int i3 = AbstractC4470.f17202;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final /* synthetic */ boolean mo4443(long j, AbstractC3191 abstractC3191, List list) {
        return false;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final /* synthetic */ void mo4444() {
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final /* synthetic */ void mo4445() {
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2431 mo4446(int i) {
        return this.f5060[i];
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int mo4447() {
        return this.f5057[mo4449()];
    }
}
