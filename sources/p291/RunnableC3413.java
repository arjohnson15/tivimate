package p291;

import androidx.fragment.app.C0091;
import androidx.fragment.app.C0101;
import java.util.ArrayList;

/* renamed from: ٴᐧ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3413 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0101 f13275;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C0091 f13276;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f13277;

    public /* synthetic */ RunnableC3413(C0101 c0101, C0091 c0091, int i) {
        this.f13277 = i;
        this.f13275 = c0101;
        this.f13276 = c0091;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13277) {
            case 0:
                this.f13275.m625(this.f13276);
                break;
            default:
                C0101 c0101 = this.f13275;
                ArrayList arrayList = c0101.f588;
                C0091 c0091 = this.f13276;
                arrayList.remove(c0091);
                c0101.f590.remove(c0091);
                break;
        }
    }
}
