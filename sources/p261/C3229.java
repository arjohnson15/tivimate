package p261;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC0270;
import com.bumptech.glide.load.data.InterfaceC0279;
import com.google.android.gms.internal.measurement.C0559;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p003.C0910;
import p314.InterfaceC3593;
import p314.InterfaceC3594;
import p329.AbstractC3737;
import p331.C3762;
import p368.InterfaceC4180;

/* renamed from: ـ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3229 implements InterfaceC3243, InterfaceC3242 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final RunnableC3230 f12547;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public volatile Object f12548;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public volatile int f12549;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public volatile C3249 f12550;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3237 f12551;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public volatile C0910 f12552;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public volatile C3227 f12553;

    public C3229(C3237 c3237, RunnableC3230 runnableC3230) {
        this.f12551 = c3237;
        this.f12547 = runnableC3230;
    }

    @Override // p261.InterfaceC3243
    public final void cancel() {
        C0910 c0910 = this.f12552;
        if (c0910 != null) {
            c0910.f4067.cancel();
        }
    }

    @Override // p261.InterfaceC3242
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo7959(InterfaceC3594 interfaceC3594, Object obj, InterfaceC0270 interfaceC0270, int i, InterfaceC3594 interfaceC35942) {
        this.f12547.mo7959(interfaceC3594, obj, interfaceC0270, this.f12552.f4067.mo1531(), interfaceC3594);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m7960(Object obj) throws Throwable {
        int i = AbstractC3737.f14494;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC0279 interfaceC0279M1588 = this.f12551.f12626.m1555().m1588(obj);
            Object objMo1539 = interfaceC0279M1588.mo1539();
            InterfaceC3593 interfaceC3593M7994 = this.f12551.m7994(objMo1539);
            C3762 c3762 = new C3762(interfaceC3593M7994, objMo1539, this.f12551.f12634, 9);
            InterfaceC3594 interfaceC3594 = this.f12552.f4068;
            C3237 c3237 = this.f12551;
            C3227 c3227 = new C3227(interfaceC3594, c3237.f12631);
            InterfaceC4180 interfaceC4180M8419 = c3237.f12625.m8419();
            interfaceC4180M8419.mo7038(c3227, c3762);
            if (Log.isLoggable("SourceGenerator", 2)) {
                String str = "Finished encoding source to cache, key: " + c3227 + ", data: " + obj + ", encoder: " + interfaceC3593M7994 + ", duration: " + AbstractC3737.m8704(jElapsedRealtimeNanos);
            }
            if (interfaceC4180M8419.mo7037(c3227) != null) {
                this.f12553 = c3227;
                this.f12550 = new C3249(Collections.singletonList(this.f12552.f4068), this.f12551, this);
                this.f12552.f4067.mo1527();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                String str2 = "Attempt to write: " + this.f12553 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...";
            }
            try {
                this.f12547.mo7959(this.f12552.f4068, interfaceC0279M1588.mo1539(), this.f12552.f4067, this.f12552.f4067.mo1531(), this.f12552.f4068);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f12552.f4067.mo1527();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p261.InterfaceC3242
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo7961(InterfaceC3594 interfaceC3594, Exception exc, InterfaceC0270 interfaceC0270, int i) {
        this.f12547.mo7961(interfaceC3594, exc, interfaceC0270, this.f12552.f4067.mo1531());
    }

    @Override // p261.InterfaceC3243
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean mo7962() {
        if (this.f12548 != null) {
            Object obj = this.f12548;
            this.f12548 = null;
            try {
                if (!m7960(obj)) {
                    return true;
                }
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                }
            }
        }
        if (this.f12550 != null && this.f12550.mo7962()) {
            return true;
        }
        this.f12550 = null;
        this.f12552 = null;
        boolean z = false;
        while (!z && this.f12549 < this.f12551.m7990().size()) {
            ArrayList arrayListM7990 = this.f12551.m7990();
            int i = this.f12549;
            this.f12549 = i + 1;
            this.f12552 = (C0910) arrayListM7990.get(i);
            if (this.f12552 != null && (this.f12551.f12627.m7978(this.f12552.f4067.mo1531()) || this.f12551.m7992(this.f12552.f4067.mo1533()) != null)) {
                this.f12552.f4067.mo1529(this.f12551.f12624, new C0559(12, this, this.f12552, false));
                z = true;
            }
        }
        return z;
    }
}
