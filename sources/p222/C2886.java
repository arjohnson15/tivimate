package p222;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import org.xmlpull.v1.XmlPullParserException;
import p131.C2074;
import p200.AbstractC2746;
import p200.C2742;
import p200.C2755;
import p200.C2757;
import p340.AbstractC3876;
import p375.C4305;

/* renamed from: ˏᴵ.ˉʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2886 {

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static C2886 f11187;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C2755 f11188;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public TypedValue f11189;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C2757 f11190;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public WeakHashMap f11191;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f11192;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C4305 f11193;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final WeakHashMap f11194 = new WeakHashMap(0);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final PorterDuff.Mode f11186 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C2896 f11185 = new C2896(6);

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m7211(C2886 c2886) {
        if (Build.VERSION.SDK_INT < 24) {
            c2886.m7220("vector", new C2919(3));
            c2886.m7220("animated-vector", new C2919(2));
            c2886.m7220("animated-selector", new C2919(1));
            c2886.m7220("drawable", new C2919(0));
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m7212(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C2896 c2896 = f11185;
        c2896.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c2896.m4941(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static synchronized C2886 m7213() {
        try {
            if (f11187 == null) {
                C2886 c2886 = new C2886();
                f11187 = c2886;
                m7211(c2886);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11187;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized void m7214(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C2742 c2742 = (C2742) this.f11194.get(context);
                if (c2742 == null) {
                    c2742 = new C2742();
                    this.f11194.put(context, c2742);
                }
                c2742.m6964(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final synchronized Drawable m7215(Context context, long j) {
        C2742 c2742 = (C2742) this.f11194.get(context);
        if (c2742 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c2742.m6968(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iM9070 = AbstractC3876.m9070(c2742.f10723, c2742.f10725, j);
            if (iM9070 >= 0) {
                Object[] objArr = c2742.f10724;
                Object obj = objArr[iM9070];
                Object obj2 = AbstractC2746.f10741;
                if (obj != obj2) {
                    objArr[iM9070] = obj2;
                    c2742.f10726 = true;
                }
            }
        }
        return null;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final synchronized void m7216(Context context) {
        C2742 c2742 = (C2742) this.f11194.get(context);
        if (c2742 != null) {
            c2742.m6970();
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final synchronized void m7217(C4305 c4305) {
        this.f11193 = c4305;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final Drawable m7218(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        C2755 c2755 = this.f11188;
        if (c2755 == null || c2755.isEmpty()) {
            return null;
        }
        C2757 c2757 = this.f11190;
        if (c2757 != null) {
            String str = (String) c2757.m7029(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f11188.get(str) == null)) {
                return null;
            }
        } else {
            this.f11190 = new C2757();
        }
        if (this.f11189 == null) {
            this.f11189 = new TypedValue();
        }
        TypedValue typedValue = this.f11189;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableM7215 = m7215(context, j);
        if (drawableM7215 != null) {
            return drawableM7215;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f11190.m7028(i, name);
                C2919 c2919 = (C2919) this.f11188.get(name);
                if (c2919 != null) {
                    drawableM7215 = c2919.m7268(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM7215 != null) {
                    drawableM7215.setChangingConfigurations(typedValue.changingConfigurations);
                    m7214(context, j, drawableM7215);
                }
            } catch (Exception e) {
            }
        }
        if (drawableM7215 == null) {
            this.f11190.m7028(i, "appcompat_skip_skip");
        }
        return drawableM7215;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Drawable m7219(Context context, int i) throws Resources.NotFoundException {
        if (this.f11189 == null) {
            this.f11189 = new TypedValue();
        }
        TypedValue typedValue = this.f11189;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableM7215 = m7215(context, j);
        if (drawableM7215 != null) {
            return drawableM7215;
        }
        LayerDrawable layerDrawableM9793 = null;
        if (this.f11193 != null) {
            if (i == R.drawable._2_res_0x7f080041) {
                layerDrawableM9793 = new LayerDrawable(new Drawable[]{m7221(context, R.drawable._2_res_0x7f080040), m7221(context, R.drawable._2_res_0x7f080042)});
            } else if (i == R.drawable._2_res_0x7f080064) {
                layerDrawableM9793 = C4305.m9793(this, context, R.dimen._2_res_0x7f07003b);
            } else if (i == R.drawable._2_res_0x7f080063) {
                layerDrawableM9793 = C4305.m9793(this, context, R.dimen._2_res_0x7f07003c);
            } else if (i == R.drawable._2_res_0x7f080065) {
                layerDrawableM9793 = C4305.m9793(this, context, R.dimen._2_res_0x7f07003d);
            }
        }
        if (layerDrawableM9793 != null) {
            layerDrawableM9793.setChangingConfigurations(typedValue.changingConfigurations);
            m7214(context, j, layerDrawableM9793);
        }
        return layerDrawableM9793;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7220(String str, C2919 c2919) {
        if (this.f11188 == null) {
            this.f11188 = new C2755(0);
        }
        this.f11188.put(str, c2919);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final synchronized Drawable m7221(Context context, int i) {
        return m7222(context, i, false);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final synchronized Drawable m7222(Context context, int i, boolean z) {
        Drawable drawableM7218;
        try {
            if (!this.f11192) {
                this.f11192 = true;
                Drawable drawableM7221 = m7221(context, R.drawable._2_res_0x7f08007f);
                if (drawableM7221 == null || (!(drawableM7221 instanceof C2074) && !"android.graphics.drawable.VectorDrawable".equals(drawableM7221.getClass().getName()))) {
                    this.f11192 = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM7218 = m7218(context, i);
            if (drawableM7218 == null) {
                drawableM7218 = m7219(context, i);
            }
            if (drawableM7218 == null) {
                drawableM7218 = context.getDrawable(i);
            }
            if (drawableM7218 != null) {
                drawableM7218 = m7223(context, i, z, drawableM7218);
            }
            if (drawableM7218 != null) {
                AbstractC2962.m7332(drawableM7218);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM7218;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m7223(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p222.C2886.m7223(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final synchronized ColorStateList m7224(Context context, int i) {
        ColorStateList colorStateList;
        C2757 c2757;
        WeakHashMap weakHashMap = this.f11191;
        ColorStateList colorStateListM9795 = null;
        colorStateList = (weakHashMap == null || (c2757 = (C2757) weakHashMap.get(context)) == null) ? null : (ColorStateList) c2757.m7029(i);
        if (colorStateList == null) {
            C4305 c4305 = this.f11193;
            if (c4305 != null) {
                colorStateListM9795 = c4305.m9795(context, i);
            }
            if (colorStateListM9795 != null) {
                if (this.f11191 == null) {
                    this.f11191 = new WeakHashMap();
                }
                C2757 c27572 = (C2757) this.f11191.get(context);
                if (c27572 == null) {
                    c27572 = new C2757();
                    this.f11191.put(context, c27572);
                }
                c27572.m7028(i, colorStateListM9795);
            }
            colorStateList = colorStateListM9795;
        }
        return colorStateList;
    }
}
