package p456;

import android.content.SharedPreferences;
import p417.AbstractC4753;

/* renamed from: ﾞⁱ.ˊˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class SharedPreferencesOnSharedPreferenceChangeListenerC5265 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public /* synthetic */ C5244 f20390;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C5244 c5244 = this.f20390;
        c5244.getClass();
        if ("IABTCF_TCString".equals(str)) {
            c5244.ˏᵢ().f20566.m4533("IABTCF_TCString change picked up in listener.");
            C5312 c5312 = c5244.f20165;
            AbstractC4753.m10683(c5312);
            c5312.m11843(500L);
        }
    }
}
