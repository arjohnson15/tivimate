package p083;

import android.util.Log;
import androidx.leanback.widget.ʿˏ;
import com.bumptech.glide.EnumC0293;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.InterfaceC0270;
import com.bumptech.glide.load.data.InterfaceC0281;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import p003.C0893;
import p035.C1232;
import p041.C1274;
import p329.AbstractC3740;
import p329.C3743;
import p430.AbstractC5001;
import p430.C4994;
import p430.C4999;
import p430.C5021;
import p430.InterfaceC4992;

/* renamed from: ʿـ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1712 implements InterfaceC0270, InterfaceC4992 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C0893 f6675;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public InterfaceC0281 f6676;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C3743 f6677;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public AbstractC5001 f6678;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4999 f6679;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public volatile C1274 f6680;

    public C1712(C4999 c4999, C0893 c0893) {
        this.f6679 = c4999;
        this.f6675 = c0893;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    public final void cancel() {
        C1274 c1274 = this.f6680;
        if (c1274 != null) {
            c1274.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ʽᐧ */
    public final void mo1527() throws IOException {
        try {
            C3743 c3743 = this.f6677;
            if (c3743 != null) {
                c3743.close();
            }
        } catch (IOException unused) {
        }
        AbstractC5001 abstractC5001 = this.f6678;
        if (abstractC5001 != null) {
            abstractC5001.close();
        }
        this.f6676 = null;
    }

    @Override // p430.InterfaceC4992
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo5427(IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
        }
        this.f6676.mo1541(iOException);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ـﹶ */
    public final Class mo1533() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ٴˎ */
    public final void mo1529(EnumC0293 enumC0293, InterfaceC0281 interfaceC0281) {
        ʿˏ r5 = new ʿˏ();
        r5.ﾞˊ(this.f6675.m3714());
        for (Map.Entry entry : this.f6675.f4024.m3728().entrySet()) {
            ((C1232) r5.ˎˑ).m4427((String) entry.getKey(), (String) entry.getValue());
        }
        C5021 c5021 = r5.ˏᵢ();
        this.f6676 = interfaceC0281;
        C4999 c4999 = this.f6679;
        c4999.getClass();
        this.f6680 = new C1274(c4999, c5021);
        this.f6680.m4543(this);
    }

    @Override // p430.InterfaceC4992
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void mo5428(C4994 c4994) {
        this.f6678 = c4994.f18890;
        if (!c4994.m11083()) {
            this.f6676.mo1541(new HttpException(c4994.f18886, null, c4994.f18883));
        } else {
            AbstractC5001 abstractC5001 = this.f6678;
            AbstractC3740.m8706(abstractC5001, "Argument must not be null");
            C3743 c3743 = new C3743(this.f6678.mo5667().mo9494(), abstractC5001.mo5668());
            this.f6677 = c3743;
            this.f6676.mo1540(c3743);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ﹳﹳ */
    public final int mo1531() {
        return 2;
    }
}
