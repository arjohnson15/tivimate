package p212;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ˏʾ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2809 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m7089(TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m7090(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Drawable m7091(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }
}
