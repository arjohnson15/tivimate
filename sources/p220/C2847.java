package p220;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* renamed from: ˏٴ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2847 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final int f11071;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static boolean f11072;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static TextDirectionHeuristic f11073;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static Constructor f11074;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final TextPaint f11075;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f11077;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f11080;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public CharSequence f11081;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f11084;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Layout.Alignment f11076 = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f11082 = Integer.MAX_VALUE;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public float f11083 = 1.0f;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f11079 = f11071;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f11085 = true;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public TextUtils.TruncateAt f11078 = null;

    static {
        f11071 = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public C2847(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f11081 = charSequence;
        this.f11075 = textPaint;
        this.f11080 = i;
        this.f11084 = charSequence.length();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final StaticLayout m7135() throws NoSuchMethodException, SecurityException, C2851 {
        if (this.f11081 == null) {
            this.f11081 = "";
        }
        int iMax = Math.max(0, this.f11080);
        CharSequence charSequenceEllipsize = this.f11081;
        int i = this.f11082;
        TextPaint textPaint = this.f11075;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f11078);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f11084);
        this.f11084 = iMin;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            if (this.f11077 && this.f11082 == 1) {
                this.f11076 = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
            builderObtain.setAlignment(this.f11076);
            builderObtain.setIncludePad(this.f11085);
            builderObtain.setTextDirection(this.f11077 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f11078;
            if (truncateAt != null) {
                builderObtain.setEllipsize(truncateAt);
            }
            builderObtain.setMaxLines(this.f11082);
            float f = this.f11083;
            if (f != 1.0f) {
                builderObtain.setLineSpacing(0.0f, f);
            }
            if (this.f11082 > 1) {
                builderObtain.setHyphenationFrequency(this.f11079);
            }
            return builderObtain.build();
        }
        if (!f11072) {
            try {
                f11073 = this.f11077 && i2 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                f11074 = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f11072 = true;
            } catch (Exception e) {
                throw new C2851(e);
            }
        }
        try {
            Constructor constructor = f11074;
            constructor.getClass();
            Integer numValueOf = Integer.valueOf(this.f11084);
            Integer numValueOf2 = Integer.valueOf(iMax);
            Layout.Alignment alignment = this.f11076;
            TextDirectionHeuristic textDirectionHeuristic = f11073;
            textDirectionHeuristic.getClass();
            return (StaticLayout) constructor.newInstance(charSequenceEllipsize, 0, numValueOf, textPaint, numValueOf2, alignment, textDirectionHeuristic, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f11085), null, Integer.valueOf(iMax), Integer.valueOf(this.f11082));
        } catch (Exception e2) {
            throw new C2851(e2);
        }
    }
}
