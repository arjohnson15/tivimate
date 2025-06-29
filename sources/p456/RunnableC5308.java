package p456;

import android.os.Bundle;

/* renamed from: ﾞⁱ.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5308 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f20589;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ Object f20590;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f20591;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ long f20592;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20593;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f20594;

    public /* synthetic */ RunnableC5308(Object obj, Object obj2, Object obj3, Object obj4, long j, int i) {
        this.f20593 = i;
        this.f20589 = obj2;
        this.f20591 = obj3;
        this.f20590 = obj4;
        this.f20592 = j;
        this.f20594 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20593) {
            case 0:
                String str = (String) this.f20591;
                BinderC5240 binderC5240 = (BinderC5240) this.f20594;
                String str2 = (String) this.f20589;
                if (str2 != null) {
                    C5297 c5297 = new C5297(this.f20592, (String) this.f20590, str2);
                    C5273 c5273 = binderC5240.f20139;
                    c5273.mo11648().m11740();
                    String str3 = c5273.f20417;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    c5273.f20417 = str;
                    c5273.f20422 = c5297;
                    break;
                } else {
                    C5273 c52732 = binderC5240.f20139;
                    c52732.mo11648().m11740();
                    String str4 = c52732.f20417;
                    if (str4 == null || str4.equals(str)) {
                        c52732.f20417 = str;
                        c52732.f20422 = null;
                        break;
                    }
                }
                break;
            case 1:
                Object obj = this.f20590;
                ((C5244) this.f20594).m11717(this.f20592, obj, (String) this.f20589, (String) this.f20591);
                break;
            default:
                Bundle bundle = (Bundle) this.f20589;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                C5328 c5328 = (C5328) this.f20594;
                c5328.m12004((C5297) this.f20591, (C5297) this.f20590, this.f20592, true, c5328.ﹶﾞ().m11964("screen_view", bundle, null, false));
                break;
        }
    }
}
