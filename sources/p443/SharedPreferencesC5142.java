package p443;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.NoSuchPaddingException;
import p016.AbstractC1082;
import p016.C1078;
import p064.AbstractC1470;
import p068.AbstractC1540;
import p080.AbstractC1702;
import p115.AbstractC1820;
import p115.AbstractC1833;
import p115.InterfaceC1828;
import p115.InterfaceC1830;
import p181.C2511;
import p200.C2752;
import p313.C3592;
import p331.C3762;
import p334.C3789;
import p416.AbstractC4745;
import p416.C4744;
import p433.C5029;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﾞʿ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class SharedPreferencesC5142 implements SharedPreferences {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f19660 = new CopyOnWriteArrayList();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InterfaceC1828 f19661;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f19662;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SharedPreferences f19663;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC1830 f19664;

    public SharedPreferencesC5142(String str, SharedPreferences sharedPreferences, InterfaceC1830 interfaceC1830, InterfaceC1828 interfaceC1828) {
        this.f19662 = str;
        this.f19663 = sharedPreferences;
        this.f19664 = interfaceC1830;
        this.f19661 = interfaceC1828;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static SharedPreferencesC5142 m11444(Context context, String str, C2511 c2511) throws NoSuchPaddingException, NoSuchAlgorithmException {
        C3762 c3762M5570;
        String str2 = c2511.f9987;
        int i = AbstractC4745.f18200;
        AbstractC1833.m5577(C4744.f18198);
        if (!AbstractC1540.f6258.get()) {
            AbstractC1833.m5580(new C1078(9), true);
        }
        AbstractC1082.m4115();
        Context applicationContext = context.getApplicationContext();
        C5029 c5029 = new C5029();
        c5029.f19099 = AbstractC1820.m5562("AES256_SIV");
        if (applicationContext == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        c5029.f19096 = applicationContext;
        c5029.f19093 = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        c5029.f19100 = str;
        String str3 = ᐧʻ.ﾞˊ("android-keystore://", str2);
        if (!str3.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        c5029.f19094 = str3;
        C3592 c3592M11143 = c5029.m11143();
        synchronized (c3592M11143) {
            c3762M5570 = c3592M11143.f13812.m5570();
        }
        C5029 c50292 = new C5029();
        c50292.f19099 = AbstractC1820.m5562("AES256_GCM");
        c50292.f19096 = applicationContext;
        c50292.f19093 = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        c50292.f19100 = str;
        String str4 = ᐧʻ.ﾞˊ("android-keystore://", str2);
        if (!str4.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        c50292.f19094 = str4;
        C3762 c3762M8501 = c50292.m11143().m8501();
        InterfaceC1828 interfaceC1828 = (InterfaceC1828) c3762M5570.m8788(InterfaceC1828.class);
        return new SharedPreferencesC5142(str, applicationContext.getSharedPreferences(str, 0), (InterfaceC1830) c3762M8501.m8788(InterfaceC1830.class), interfaceC1828);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static boolean m11445(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (m11445(str)) {
            throw new SecurityException(ᐧʻ.ˉⁱ(str, " is a reserved key for the encryption keyset."));
        }
        return this.f19663.contains(m11446(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC5144(this, this.f19663.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f19663.getAll().entrySet()) {
            if (!m11445(entry.getKey())) {
                try {
                    String str = new String(this.f19661.mo5028(AbstractC1470.m5025(entry.getKey()), this.f19662.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, m11447(str));
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objM11447 = m11447(str);
        return objM11447 instanceof Boolean ? ((Boolean) objM11447).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objM11447 = m11447(str);
        return objM11447 instanceof Float ? ((Float) objM11447).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objM11447 = m11447(str);
        return objM11447 instanceof Integer ? ((Integer) objM11447).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objM11447 = m11447(str);
        return objM11447 instanceof Long ? ((Long) objM11447).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objM11447 = m11447(str);
        return objM11447 instanceof String ? (String) objM11447 : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objM11447 = m11447(str);
        Set c2752 = objM11447 instanceof Set ? (Set) objM11447 : new C2752(0);
        return c2752.size() > 0 ? c2752 : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f19660.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f19660.remove(onSharedPreferenceChangeListener);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String m11446(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(AbstractC1470.m5024(this.f19661.mo5030(str.getBytes(StandardCharsets.UTF_8), this.f19662.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt key. " + e2.getMessage(), e2);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object m11447(String str) {
        String str2;
        if (m11445(str)) {
            throw new SecurityException(ᐧʻ.ˉⁱ(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM11446 = m11446(str);
            String string = this.f19663.getString(strM11446, null);
            if (string == null) {
                return null;
            }
            byte[] bArrM5025 = AbstractC1470.m5025(string);
            InterfaceC1830 interfaceC1830 = this.f19664;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(interfaceC1830.mo4121(bArrM5025, strM11446.getBytes(charset)));
            byteBufferWrap.position(0);
            int i = byteBufferWrap.getInt();
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 6 : 5 : 4 : 3 : 2 : 1;
            if (i2 == 0) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
            }
            int iM5411 = AbstractC1702.m5411(i2);
            if (iM5411 == 0) {
                int i3 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                byteBufferWrap.limit(i3);
                String string2 = charset.decode(byteBufferSlice).toString();
                if (string2.equals("__NULL__")) {
                    return null;
                }
                return string2;
            }
            if (iM5411 == 1) {
                C2752 c2752 = new C2752(0);
                while (byteBufferWrap.hasRemaining()) {
                    int i4 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                    byteBufferSlice2.limit(i4);
                    byteBufferWrap.position(byteBufferWrap.position() + i4);
                    c2752.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                }
                if (c2752.f10764 == 1 && "__NULL__".equals(c2752.f10763[0])) {
                    return null;
                }
                return c2752;
            }
            if (iM5411 == 2) {
                return Integer.valueOf(byteBufferWrap.getInt());
            }
            if (iM5411 == 3) {
                return Long.valueOf(byteBufferWrap.getLong());
            }
            if (iM5411 == 4) {
                return Float.valueOf(byteBufferWrap.getFloat());
            }
            if (iM5411 == 5) {
                return Boolean.valueOf(byteBufferWrap.get() != 0);
            }
            switch (i2) {
                case 1:
                    str2 = "STRING";
                    break;
                case 2:
                    str2 = "STRING_SET";
                    break;
                case 3:
                    str2 = "INT";
                    break;
                case 4:
                    str2 = "LONG";
                    break;
                case 5:
                    str2 = "FLOAT";
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "BOOLEAN";
                    break;
                default:
                    str2 = "null";
                    break;
            }
            throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
        }
    }
}
