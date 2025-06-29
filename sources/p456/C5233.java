package p456;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Map;
import ˆʽ.ˑˉ;

/* renamed from: ﾞⁱ.ʻˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C5233 implements InterfaceC5293, InterfaceC5269 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public /* synthetic */ C5273 f20083;

    @Override // p456.InterfaceC5293
    /* renamed from: ﹳˎ */
    public void mo7954(String str, int i, IOException iOException, byte[] bArr, Map map) {
        this.f20083.m11806(str, i, iOException, bArr, map);
    }

    @Override // p456.InterfaceC5269
    /* renamed from: ﹳﹳ */
    public void mo10434(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C5273 c5273 = this.f20083;
        if (!zIsEmpty) {
            c5273.mo11648().m11743(new ˑˉ(this, str, str2, bundle, 8));
            return;
        }
        C5236 c5236 = c5273.f20418;
        if (c5236 != null) {
            C5301 c5301 = c5236.f20110;
            C5236.m11647(c5301);
            c5301.f20571.m4531(str2, "AppId not known when logging event");
        }
    }
}
