package p134;

import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import p323.AbstractC3691;
import p323.C3686;

/* renamed from: ˉʾ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2086 extends AbstractC2092 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f8228;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public UUID f8229;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public byte[] f8230;

    @Override // p134.AbstractC2092
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object mo5920() {
        UUID uuid = this.f8229;
        byte[] bArrM8642 = AbstractC3691.m8642(uuid, null, this.f8230);
        byte[] bArr = this.f8230;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String string = sb.toString();
        byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
        byte b = bArrDecode[0];
        bArrDecode[0] = bArrDecode[3];
        bArrDecode[3] = b;
        byte b2 = bArrDecode[1];
        bArrDecode[1] = bArrDecode[2];
        bArrDecode[2] = b2;
        byte b3 = bArrDecode[4];
        bArrDecode[4] = bArrDecode[5];
        bArrDecode[5] = b3;
        byte b4 = bArrDecode[6];
        bArrDecode[6] = bArrDecode[7];
        bArrDecode[7] = b4;
        return new C2089(uuid, bArrM8642, new C3686[]{new C3686(true, null, 8, bArrDecode, 0, 0, null)});
    }

    @Override // p134.AbstractC2092
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo5921(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f8228 = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f8229 = UUID.fromString(attributeValue);
        }
    }

    @Override // p134.AbstractC2092
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo5922(XmlPullParser xmlPullParser) {
        if (this.f8228) {
            this.f8230 = Base64.decode(xmlPullParser.getText(), 0);
        }
    }

    @Override // p134.AbstractC2092
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo5923(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f8228 = false;
        }
    }

    @Override // p134.AbstractC2092
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean mo5924(String str) {
        return "ProtectionHeader".equals(str);
    }
}
