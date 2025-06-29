package p421;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p052.C1319;
import p371.C4206;
import p371.C4214;
import ʼˉ.ٴˎ;

/* renamed from: ﹳﹶ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4859 extends ٴˎ {
    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static int m10922(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static Font m10923(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM10922 = m10922(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM109222 = m10922(fontStyle, font2.getStyle());
            if (iM109222 < iM10922) {
                font = font2;
                iM10922 = iM109222;
            }
        }
        return font;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static FontFamily m10924(C1319[] c1319Arr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (C1319 c1319 : c1319Arr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c1319.f5374, "r", null);
            } catch (IOException e) {
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c1319.f5373).setSlant(c1319.f5375 ? 1 : 0).setTtcIndex(c1319.f5371).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Typeface m10925(Context context, C4206 c4206, Resources resources, int i) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (C4214 c4214 : c4206.f16221) {
                try {
                    Font fontBuild = new Font.Builder(resources, c4214.f16249).setWeight(c4214.f16245).setSlant(c4214.f16247 ? 1 : 0).setTtcIndex(c4214.f16246).setFontVariationSettings(c4214.f16250).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m10923(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C1319 m10926(C1319[] c1319Arr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Typeface m10927(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Typeface m10928(Context context, C1319[] c1319Arr, int i) {
        try {
            FontFamily fontFamilyM10924 = m10924(c1319Arr, context.getContentResolver());
            if (fontFamilyM10924 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM10924).setStyle(m10923(fontFamilyM10924, i).getStyle()).build();
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Typeface m10929(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM10924 = m10924((C1319[]) list.get(0), contentResolver);
            if (fontFamilyM10924 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM10924);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyM109242 = m10924((C1319[]) list.get(i2), contentResolver);
                if (fontFamilyM109242 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM109242);
                }
            }
            return customFallbackBuilder.setStyle(m10923(fontFamilyM10924, i).getStyle()).build();
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Typeface m10930(Context context, Resources resources, int i, String str, int i2) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            return null;
        }
    }
}
