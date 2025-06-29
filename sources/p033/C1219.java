package p033;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.JsonReader;
import androidx.leanback.widget.ʿˏ;
import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p031.InterfaceC1197;
import p060.C1353;
import p060.C1354;
import p072.AbstractC1642;
import p081.AbstractC1705;
import p115.AbstractC1820;
import p115.C1826;
import p122.C1956;
import p123.C1995;
import p139.AbstractC2160;
import p139.InterfaceC2121;
import p139.InterfaceC2128;
import p181.C2510;
import p181.InterfaceC2515;
import p183.InterfaceC2535;
import p186.C2575;
import p254.InterfaceC3165;
import p256.C3196;
import p260.C3222;
import p266.C3262;
import p267.AbstractC3268;
import p267.AbstractC3276;
import p267.C3266;
import p267.C3270;
import p267.C3279;
import p306.InterfaceC3552;
import p310.InterfaceC3579;
import p331.C3762;
import p334.C3789;
import p345.AbstractC3980;
import p353.InterfaceC4019;
import p375.C4305;
import p375.InterfaceC4298;
import p380.InterfaceC4434;
import p383.InterfaceC4461;
import p397.C4598;
import p418.C4782;
import p418.C4805;
import p418.EnumC4778;
import p450.InterfaceC5190;
import p450.InterfaceC5191;
import ʾי.ˑʽ;
import ˈʼ.ﹳﹳ;
import ـˈ.ˉᵎ;
import ᴵﹳ.ﹶˆ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʼᵎ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1219 implements InterfaceC4461, InterfaceC1197, InterfaceC5191, InterfaceC4019, InterfaceC2535, InterfaceC2128, InterfaceC4434, InterfaceC2515, InterfaceC4298, InterfaceC3552, InterfaceC3579 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5010;

    public /* synthetic */ C1219(int i) {
        this.f5010 = i;
    }

    @Override // p353.InterfaceC4019
    public Object apply(Object obj) {
        switch (this.f5010) {
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return Long.valueOf(((C4598) obj).f17598);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return Long.valueOf(((C4598) obj).f17599);
            case 21:
                return AbstractC3980.m9207(Integer.valueOf(((C3196) obj).f12424));
            default:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        C3262 c3262M5645 = C1995.m5645();
                        c3262M5645.m8036(cursorRawQuery.getString(1));
                        c3262M5645.f12725 = AbstractC1705.m5420(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        c3262M5645.f12724 = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(c3262M5645.m8038());
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
        }
    }

    @Override // p383.InterfaceC4461
    /* renamed from: ʽᐧ */
    public void mo4092(Object obj) {
        ((C1213) obj).getClass();
    }

    @Override // p375.InterfaceC4298
    /* renamed from: ʿʼ */
    public AbstractC1820 mo4102(C4305 c4305) throws GeneralSecurityException {
        switch (this.f5010) {
            case 25:
                C1826 c1826 = C1826.f7049;
                if (!((String) c4305.f16748).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    C4782 c4782M10722 = C4782.m10722((AbstractC0748) c4305.f16747, C0747.m3127());
                    if (c4782M10722.m10728() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C3222 c3222 = new C3222(12, false);
                    c3222.f12538 = null;
                    c3222.f12539 = null;
                    c3222.f12540 = C3279.f12765;
                    c3222.m7934(c4782M10722.m10729().size());
                    int iM10843 = c4782M10722.m10727().m10843();
                    if (iM10843 < 10 || 16 < iM10843) {
                        throw new GeneralSecurityException(ˉᵎ.ˉⁱ("Invalid tag size for AesCmacParameters: ", iM10843));
                    }
                    c3222.f12539 = Integer.valueOf(iM10843);
                    c3222.f12540 = AbstractC3276.m8074((EnumC4778) c4305.f16746);
                    C3266 c3266M7955 = c3222.m7955();
                    C3762 c3762 = new C3762(10);
                    c3762.f14531 = null;
                    c3762.f14532 = null;
                    c3762.f14530 = c3266M7955;
                    c3762.f14531 = ˑʽ.ᴵʿ(c4782M10722.m10729().m3130(), c1826);
                    c3762.f14532 = (Integer) c4305.f16749;
                    return c3762.m8791();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                C1826 c18262 = C1826.f7049;
                if (!((String) c4305.f16748).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    C4805 c4805M10804 = C4805.m10804((AbstractC0748) c4305.f16747, C0747.m3127());
                    if (c4805M10804.m10808() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ﹶˆ r2 = new ﹶˆ();
                    r2.ᐧⁱ = null;
                    r2.ˆʿ = null;
                    r2.ˎˑ = null;
                    r2.ᐧˋ = C3279.f12762;
                    r2.ᐧⁱ = Integer.valueOf(c4805M10804.m10806().size());
                    r2.ˆʿ = Integer.valueOf(c4805M10804.m10807().m10874());
                    r2.ˎˑ = AbstractC3268.m8068(c4805M10804.m10807().m10875());
                    r2.ᐧˋ = AbstractC3268.m8067((EnumC4778) c4305.f16746);
                    C3270 c3270 = r2.ᴵʿ();
                    C3262 c3262 = new C3262();
                    c3262.f12724 = null;
                    c3262.f12725 = null;
                    c3262.f12726 = c3270;
                    c3262.f12724 = ˑʽ.ᴵʿ(c4805M10804.m10806().m3130(), c18262);
                    c3262.f12725 = (Integer) c4305.f16749;
                    return c3262.m8029();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public Constructor m4333() {
        switch (this.f5010) {
            case 22:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC3165.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC3165.class).getConstructor(null);
        }
    }

    @Override // p183.InterfaceC2535
    /* renamed from: ˏᵢ */
    public void mo4232(Exception exc) {
    }

    @Override // p181.InterfaceC2515
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void mo4334(C2510 c2510, List list) {
        AbstractC1642.m5294(ﹳﹳ.ʽᐧ(), null, 0, new C2575(c2510, list, null), 3);
    }

    @Override // p380.InterfaceC4434
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean mo4335(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    @Override // p310.InterfaceC3579
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object mo4336(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null libraryName");
                    }
                    break;
                case "arch":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null arch");
                    }
                    break;
                case "buildId":
                    strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildId");
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null && strNextString3 != null) {
            return new C1956(strNextString, strNextString2, strNextString3);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" arch");
        }
        if (strNextString2 == null) {
            sb.append(" libraryName");
        }
        if (strNextString3 == null) {
            sb.append(" buildId");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }

    @Override // p450.InterfaceC5191
    /* renamed from: ᐧʻ */
    public void mo4097(InterfaceC5190 interfaceC5190) {
        ᐧʻ.ᵎˏ(interfaceC5190.get());
        throw null;
    }

    @Override // p031.InterfaceC1197
    /* renamed from: ﹳﹳ */
    public Object mo4098(ʿˏ r5) {
        switch (this.f5010) {
            case 1:
                return TransportRegistrar.lambda$getComponents$0(r5);
            case 2:
                return TransportRegistrar.lambda$getComponents$1(r5);
            case 3:
                return TransportRegistrar.lambda$getComponents$2(r5);
            case 4:
                Set set = r5.ᵎˏ(C1354.class);
                ˑʽ r1 = ˑʽ.ˎˑ;
                if (r1 == null) {
                    synchronized (ˑʽ.class) {
                        try {
                            r1 = ˑʽ.ˎˑ;
                            if (r1 == null) {
                                r1 = new ˑʽ(0);
                                ˑʽ.ˎˑ = r1;
                            }
                        } finally {
                        }
                    }
                }
                return new C1353(set, r1);
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(r5);
        }
    }

    @Override // p139.InterfaceC2128
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void mo4337(InterfaceC2121 interfaceC2121, AbstractC2160 abstractC2160, boolean z) {
        switch (this.f5010) {
            case 9:
                interfaceC2121.mo5993(abstractC2160);
                break;
            case 10:
                interfaceC2121.mo5992(abstractC2160);
                break;
            case 11:
                interfaceC2121.mo5990(abstractC2160);
                break;
            case 12:
                interfaceC2121.mo5988();
                break;
            default:
                interfaceC2121.mo5989();
                break;
        }
    }
}
