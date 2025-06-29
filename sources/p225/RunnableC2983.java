package p225;

import android.view.View;

/* renamed from: ˏᵢ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC2983 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ View f11476;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ View f11477;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C3022 f11478;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11479;

    public /* synthetic */ RunnableC2983(C3022 c3022, View view, View view2, int i) {
        this.f11479 = i;
        this.f11478 = c3022;
        this.f11476 = view;
        this.f11477 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11479) {
            case 0:
                C3022.m7513(this.f11478.f11675, this.f11476, this.f11477);
                break;
            default:
                C3022.m7513(this.f11478.f11683, this.f11476, this.f11477);
                break;
        }
    }
}
