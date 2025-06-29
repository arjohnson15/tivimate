package p222;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p131.C2061;
import p131.C2074;
import p212.AbstractC2809;

/* renamed from: ˏᴵ.יˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2919 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f11316;

    public /* synthetic */ C2919(int i) {
        this.f11316 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Drawable m7268(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f11316) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) C2919.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                        AbstractC2809.m7090(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                        break;
                    } catch (Exception e) {
                        return null;
                    }
                }
                break;
            case 1:
                try {
                    break;
                } catch (Exception e2) {
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    C2061 c2061 = new C2061(context);
                    c2061.inflate(resources, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e3) {
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C2074 c2074 = new C2074();
                    c2074.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e4) {
                    return null;
                }
        }
        return null;
    }
}
