package p456;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.bumptech.glide.C0295;
import p202.C2766;
import p417.AbstractC4753;
import p438.C5105;
import ʿﾞ.ﹳﹳ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ﾞⁱ.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5280 extends AbstractC5324 {

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public static final Pair f20461 = new Pair("", 0L);

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final C5105 f20462;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C5105 f20463;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final C5105 f20464;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public SharedPreferences f20465;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final ﹶˆ f20466;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final C5105 f20467;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C0295 f20468;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final C0295 f20469;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public SharedPreferences f20470;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final C5329 f20471;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C0295 f20472;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final C5329 f20473;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public String f20474;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Object f20475;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f20476;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final C0295 f20477;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final C5329 f20478;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public boolean f20479;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final C5105 f20480;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C2766 f20481;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final ﹶˆ f20482;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C5105 f20483;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final C5329 f20484;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public long f20485;

    public C5280(C5236 c5236) {
        super(c5236);
        this.f20475 = new Object();
        this.f20463 = new C5105(this, "session_timeout", 1800000L);
        this.f20473 = new C5329(this, "start_new_session", true);
        this.f20480 = new C5105(this, "last_pause_time", 0L);
        this.f20462 = new C5105(this, "session_id", 0L);
        this.f20472 = new C0295(this, "non_personalized_ads");
        this.f20482 = new ﹶˆ(this, "last_received_uri_timestamps_by_source");
        this.f20471 = new C5329(this, "allow_remote_dynamite", false);
        this.f20483 = new C5105(this, "first_open_time", 0L);
        AbstractC4753.m10688("app_install_time");
        this.f20468 = new C0295(this, "app_instance_id");
        this.f20478 = new C5329(this, "app_backgrounded", false);
        this.f20484 = new C5329(this, "deep_link_retrieval_complete", false);
        this.f20467 = new C5105(this, "deep_link_retrieval_attempts", 0L);
        this.f20469 = new C0295(this, "firebase_feature_rollouts");
        this.f20477 = new C0295(this, "deferred_attribution_cache");
        this.f20464 = new C5105(this, "deferred_attribution_cache_timestamp", 0L);
        this.f20466 = new ﹶˆ(this, "default_event_parameters");
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final SparseArray m11854() {
        Bundle bundle = this.f20482.ᵔﹳ();
        if (bundle == null) {
            return new SparseArray();
        }
        int[] intArray = bundle.getIntArray("uriSources");
        long[] longArray = bundle.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            ˏᵢ().f20571.m4533("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public final C5356 m11855() {
        ʼᵎ();
        return C5356.m12140(m11856().getInt("consent_source", 100), m11856().getString("consent_settings", "G1"));
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public final SharedPreferences m11856() {
        ʼᵎ();
        m11997();
        AbstractC4753.m10683(this.f20470);
        return this.f20470;
    }

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public final boolean m11857(long j) {
        return j - this.f20463.m11317() > this.f20480.m11317();
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final void m11858(boolean z) {
        ʼᵎ();
        C5301 c5301 = ˏᵢ();
        c5301.f20566.m4531(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = m11856().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    @Override // p456.AbstractC5324
    /* renamed from: ᵔˋ */
    public final boolean mo11746() {
        return true;
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final SharedPreferences m11859() {
        ʼᵎ();
        m11997();
        if (this.f20465 == null) {
            synchronized (this.f20475) {
                try {
                    if (this.f20465 == null) {
                        String str = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114.getPackageName() + "_preferences";
                        ˏᵢ().f20566.m4531(str, "Default prefs file");
                        this.f20465 = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114.getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f20465;
    }

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final boolean m11860(int i) {
        return C5356.m12137(i, m11856().getInt("consent_source", 100));
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final void m11861(SparseArray sparseArray) {
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            iArr[i] = sparseArray.keyAt(i);
            jArr[i] = ((Long) sparseArray.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f20482.ᵔٴ(bundle);
    }
}
