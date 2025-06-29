package p456;

import android.os.Bundle;
import android.text.TextUtils;
import p447.AbstractC5179;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5282 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public /* synthetic */ long f20486;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public /* synthetic */ Object f20487;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public /* synthetic */ Object f20488;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20489 = 0;

    public /* synthetic */ RunnableC5282() {
    }

    public RunnableC5282(C5328 c5328, C5297 c5297, long j) {
        this.f20487 = c5297;
        this.f20486 = j;
        this.f20488 = c5328;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20489) {
            case 0:
                C5244 c5244 = (C5244) this.f20487;
                if (!TextUtils.isEmpty(((C5236) ((ﹳﹳ) c5244).ᐧⁱ).m11654().m11754())) {
                    c5244.ˏᵢ().f20573.m4533("Using developer consent only; google app id found");
                    break;
                } else {
                    c5244.m11711((Bundle) this.f20488, 0, this.f20486);
                    break;
                }
            default:
                C5328 c5328 = (C5328) this.f20488;
                c5328.m12005((C5297) this.f20487, false, this.f20486);
                c5328.f20660 = null;
                C5272 c5272M11549 = AbstractC5179.m11549((C5236) ((ﹳﹳ) c5328).ᐧⁱ);
                c5272M11549.m11785(new RunnableC5242(c5272M11549, 5, (Object) null));
                break;
        }
    }
}
