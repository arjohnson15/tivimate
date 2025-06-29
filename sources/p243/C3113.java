package p243;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import j$.util.Objects;
import p149.AbstractC2293;

/* renamed from: ˑﾞ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3113 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final TextDirectionHeuristic f12006;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f12007;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final TextPaint f12008;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f12009;

    public C3113(PrecomputedText.Params params) {
        this.f12008 = params.getTextPaint();
        this.f12006 = params.getTextDirection();
        this.f12007 = params.getBreakStrategy();
        this.f12009 = params.getHyphenationFrequency();
    }

    public C3113(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2293.m6317(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f12008 = textPaint;
        this.f12006 = textDirectionHeuristic;
        this.f12007 = i;
        this.f12009 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p243.C3113
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ˑﾞ.ﹳﹳ r8 = (p243.C3113) r8
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L22
            int r3 = r8.f12007
            int r4 = r7.f12007
            if (r4 == r3) goto L1b
        L18:
            r1 = 0
            goto Lb7
        L1b:
            int r3 = r7.f12009
            int r4 = r8.f12009
            if (r3 == r4) goto L22
            goto L18
        L22:
            android.text.TextPaint r3 = r7.f12008
            float r4 = r3.getTextSize()
            android.text.TextPaint r5 = r8.f12008
            float r5 = r5.getTextSize()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L33
            goto L18
        L33:
            float r4 = r3.getTextScaleX()
            android.text.TextPaint r5 = r8.f12008
            float r6 = r5.getTextScaleX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L42
            goto L18
        L42:
            float r4 = r3.getTextSkewX()
            float r6 = r5.getTextSkewX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L4f
            goto L18
        L4f:
            float r4 = r3.getLetterSpacing()
            float r6 = r5.getLetterSpacing()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L5c
            goto L18
        L5c:
            java.lang.String r4 = r3.getFontFeatureSettings()
            java.lang.String r6 = r5.getFontFeatureSettings()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 != 0) goto L6b
            goto L18
        L6b:
            int r4 = r3.getFlags()
            int r6 = r5.getFlags()
            if (r4 == r6) goto L76
            goto L18
        L76:
            r4 = 24
            if (r1 < r4) goto L89
            android.os.LocaleList r1 = com.google.android.gms.internal.measurement.AbstractC0513.m2365(r3)
            android.os.LocaleList r4 = com.google.android.gms.internal.measurement.AbstractC0513.m2365(r5)
            boolean r1 = com.google.android.gms.internal.measurement.AbstractC0513.m2366(r4, r1)
            if (r1 != 0) goto L98
            goto L18
        L89:
            java.util.Locale r1 = r3.getTextLocale()
            java.util.Locale r4 = r5.getTextLocale()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L98
            goto L18
        L98:
            android.graphics.Typeface r1 = r3.getTypeface()
            if (r1 != 0) goto La6
            android.graphics.Typeface r1 = r5.getTypeface()
            if (r1 == 0) goto Lb6
            goto L18
        La6:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r3 = r5.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb6
            goto L18
        Lb6:
            r1 = 1
        Lb7:
            if (r1 != 0) goto Lba
            return r2
        Lba:
            android.text.TextDirectionHeuristic r1 = r7.f12006
            android.text.TextDirectionHeuristic r8 = r8.f12006
            if (r1 != r8) goto Lc1
            goto Lc2
        Lc1:
            r0 = 0
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p243.C3113.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.f12006;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.f12009;
        int i3 = this.f12007;
        TextPaint textPaint = this.f12008;
        return i >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f12008;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f12006);
        sb.append(", breakStrategy=" + this.f12007);
        sb.append(", hyphenationFrequency=" + this.f12009);
        sb.append("}");
        return sb.toString();
    }
}
