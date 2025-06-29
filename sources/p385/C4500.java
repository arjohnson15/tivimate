package p385;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p033.C1215;
import p149.HandlerC2291;
import p166.AbstractC2424;
import p310.C3581;
import p312.InterfaceC3586;
import p353.AbstractC4010;
import p383.AbstractC4464;
import p383.AbstractC4470;
import ᵢ.ʿʼ;

/* renamed from: ᵢﹶ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4500 implements InterfaceC4497 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C3581 f17318 = new C3581(21);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final MediaDrm f17319;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f17320;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final UUID f17321;

    public C4500(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = AbstractC2424.f9641;
        AbstractC4464.m10124("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f17321 = uuid;
        MediaDrm mediaDrm = new MediaDrm((AbstractC4470.f17202 >= 27 || !AbstractC2424.f9643.equals(uuid)) ? uuid : uuid2);
        this.f17319 = mediaDrm;
        this.f17320 = 1;
        if (AbstractC2424.f9645.equals(uuid) && "ASUS_Z00AD".equals(AbstractC4470.f17206)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ʽᐧ */
    public final synchronized void mo8340() {
        int i = this.f17320 - 1;
        this.f17320 = i;
        if (i == 0) {
            this.f17319.release();
        }
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ʿʼ */
    public final void mo8341(byte[] bArr, byte[] bArr2) {
        this.f17319.restoreKeys(bArr, bArr2);
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˉי */
    public final void mo8342(byte[] bArr) {
        this.f17319.closeSession(bArr);
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˎٴ */
    public final void mo8343(byte[] bArr, C1215 c1215) {
        if (AbstractC4470.f17202 >= 31) {
            try {
                AbstractC4501.m10263(this.f17319, bArr, c1215);
            } catch (UnsupportedOperationException unused) {
                AbstractC4464.m10144("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˏʾ */
    public final byte[] mo8344(byte[] bArr, byte[] bArr2) throws JSONException {
        if (AbstractC2424.f9643.equals(this.f17321) && AbstractC4470.f17202 < 27) {
            try {
                JSONObject jSONObject = new JSONObject(AbstractC4470.m10188(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(AbstractC4010.f15450);
            } catch (JSONException e) {
                AbstractC4464.m10147("ClearKeyUtil", "Failed to adjust response data: ".concat(AbstractC4470.m10188(bArr2)), e);
            }
        }
        return this.f17319.provideKeyResponse(bArr, bArr2);
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˏᴵ */
    public final C4495 mo8345() {
        MediaDrm.ProvisionRequest provisionRequest = this.f17319.getProvisionRequest();
        return new C4495(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˏᵢ */
    public final Map mo8346(byte[] bArr) {
        return this.f17319.queryKeyStatus(bArr);
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˑʽ */
    public final boolean mo8347(byte[] bArr, String str) throws Throwable {
        boolean zRequiresSecureDecoderComponent;
        if (AbstractC4470.f17202 >= 31) {
            zRequiresSecureDecoderComponent = AbstractC4501.m10264(this.f17319, str);
        } else {
            MediaCrypto mediaCrypto = null;
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(this.f17321, bArr);
                try {
                    zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    zRequiresSecureDecoderComponent = true;
                    if (zRequiresSecureDecoderComponent) {
                    }
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return (zRequiresSecureDecoderComponent || m10262()) ? false : true;
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˑי */
    public final void mo8348(byte[] bArr) throws DeniedByServerException {
        this.f17319.provideProvisionResponse(bArr);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m10262() {
        return AbstractC4470.f17202 < 21 && AbstractC2424.f9645.equals(this.f17321) && "L3".equals(this.f17319.getPropertyString("securityLevel"));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c4  */
    @Override // p385.InterfaceC4497
    /* renamed from: ᵎـ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p385.C4484 mo8349(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p385.C4500.mo8349(byte[], java.util.List, int, java.util.HashMap):ᵢﹶ.ˎٴ");
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ﹳˎ */
    public final int mo8350() {
        return 2;
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ﹳˑ */
    public final byte[] mo8351() {
        return this.f17319.openSession();
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ﾞʽ */
    public final void mo8352(final ʿʼ r2) {
        this.f17319.setOnEventListener(new MediaDrm.OnEventListener() { // from class: ᵢﹶ.ˋˊ
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C4500 c4500 = this.f17255;
                ʿʼ r4 = r2;
                c4500.getClass();
                HandlerC2291 handlerC2291 = ((C4492) r4.ˆʿ).f17307;
                handlerC2291.getClass();
                handlerC2291.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ﾞˊ */
    public final InterfaceC3586 mo8353(byte[] bArr) {
        m10262();
        int i = AbstractC4470.f17202;
        UUID uuid = this.f17321;
        if (i < 27 && AbstractC2424.f9643.equals(uuid)) {
            uuid = AbstractC2424.f9641;
        }
        return new C4479(uuid, bArr);
    }
}
