package p282;

import androidx.lifecycle.AbstractC0207;
import androidx.lifecycle.ᵢʿ;
import com.parse.ParseCloud;
import java.util.UUID;
import p013.AbstractC1035;
import p118.C1848;
import p252.AbstractC3139;
import p288.C3395;
import ʼʽ.ˉי;
import ʼʽ.ﹳﹳ;

/* renamed from: ٴʾ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3378 extends AbstractC0207 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ᵢʿ f13214 = new ᵢʿ(1);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m8237(String str, String str2) throws InterruptedException {
        C1848 c1848 = new C1848(this, 1, str);
        ˉי.ʽᐧ.await();
        String strM7711 = AbstractC3139.m7711(UUID.randomUUID().toString());
        ParseCloud.callFunctionInBackground("addDevice_v2", AbstractC1035.m3988(new C3395("deviceName", str), new C3395("deviceObjectIdToReplace", str2), new C3395("isGooglePlayInstalled", Boolean.valueOf(AbstractC3139.m7781())), new C3395("requestToken", strM7711)), new ﹳﹳ(c1848, strM7711));
    }
}
