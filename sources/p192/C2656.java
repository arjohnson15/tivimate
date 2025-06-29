package p192;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.InterfaceC0211;
import androidx.lifecycle.InterfaceC0262;

/* renamed from: ˎˉ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2656 implements InterfaceC0211 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ EmojiCompatInitializer f10534;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0233 f10535;

    public C2656(EmojiCompatInitializer emojiCompatInitializer, AbstractC0233 abstractC0233) {
        this.f10534 = emojiCompatInitializer;
        this.f10535 = abstractC0233;
    }

    @Override // androidx.lifecycle.InterfaceC0211
    public final /* synthetic */ void onDestroy(InterfaceC0262 interfaceC0262) {
    }

    @Override // androidx.lifecycle.InterfaceC0211
    /* renamed from: ʽᐧ */
    public final void mo1006() {
        this.f10534.getClass();
        (Build.VERSION.SDK_INT >= 28 ? AbstractC2653.m6830(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC2657(0), 500L);
        this.f10535.mo1031(this);
    }
}
