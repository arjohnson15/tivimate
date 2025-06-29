package p316;

import com.squareup.moshi.JsonDataException;
import p366.C4155;
import p366.InterfaceC4161;
import p396.InterfaceC4560;
import p430.AbstractC5001;
import p435.AbstractC5044;
import p435.C5053;
import ٴᐧ.ᐧⁱ;

/* renamed from: ᐧﹶ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3612 implements InterfaceC4560 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C4155 f13848 = ᐧⁱ.ˏᴵ("EFBBBF");

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC5044 f13849;

    public C3612(AbstractC5044 abstractC5044) {
        this.f13849 = abstractC5044;
    }

    @Override // p396.InterfaceC4560
    /* renamed from: ʿʼ */
    public final Object mo8506(Object obj) {
        AbstractC5001 abstractC5001 = (AbstractC5001) obj;
        InterfaceC4161 interfaceC4161Mo5667 = abstractC5001.mo5667();
        try {
            if (interfaceC4161Mo5667.mo9519(f13848)) {
                interfaceC4161Mo5667.skip(r1.f16070.length);
            }
            C5053 c5053 = new C5053(interfaceC4161Mo5667);
            Object objMo1390 = this.f13849.mo1390(c5053);
            if (c5053.mo11199() != 10) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            abstractC5001.close();
            return objMo1390;
        } catch (Throwable th) {
            abstractC5001.close();
            throw th;
        }
    }
}
