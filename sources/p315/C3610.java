package p315;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import p124.AbstractC2011;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᐧⁱ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3610 extends ViewGroup.MarginLayoutParams {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f13831;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f13832;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f13833;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public View f13834;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean f13835;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public View f13836;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final Rect f13837;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f13838;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f13839;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public AbstractC3608 f13840;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f13841;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f13842;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public boolean f13843;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f13844;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f13845;

    public C3610() {
        super(-2, -2);
        this.f13831 = false;
        this.f13839 = 0;
        this.f13844 = 0;
        this.f13832 = -1;
        this.f13841 = -1;
        this.f13842 = 0;
        this.f13838 = 0;
        this.f13837 = new Rect();
    }

    public C3610(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        AbstractC3608 abstractC3608;
        super(context, attributeSet);
        this.f13831 = false;
        this.f13839 = 0;
        this.f13844 = 0;
        this.f13832 = -1;
        this.f13841 = -1;
        this.f13842 = 0;
        this.f13838 = 0;
        this.f13837 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2011.f7652);
        this.f13839 = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f13841 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f13844 = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f13832 = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f13842 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f13838 = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f13831 = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f279;
            if (TextUtils.isEmpty(string)) {
                abstractC3608 = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f279;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f276;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f280);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC3608 = (AbstractC3608) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(ᐧʻ.ﾞˊ("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f13840 = abstractC3608;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC3608 abstractC36082 = this.f13840;
        if (abstractC36082 != null) {
            abstractC36082.mo2818(this);
        }
    }

    public C3610(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f13831 = false;
        this.f13839 = 0;
        this.f13844 = 0;
        this.f13832 = -1;
        this.f13841 = -1;
        this.f13842 = 0;
        this.f13838 = 0;
        this.f13837 = new Rect();
    }

    public C3610(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f13831 = false;
        this.f13839 = 0;
        this.f13844 = 0;
        this.f13832 = -1;
        this.f13841 = -1;
        this.f13842 = 0;
        this.f13838 = 0;
        this.f13837 = new Rect();
    }

    public C3610(C3610 c3610) {
        super((ViewGroup.MarginLayoutParams) c3610);
        this.f13831 = false;
        this.f13839 = 0;
        this.f13844 = 0;
        this.f13832 = -1;
        this.f13841 = -1;
        this.f13842 = 0;
        this.f13838 = 0;
        this.f13837 = new Rect();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m8505(int i) {
        if (i == 0) {
            return this.f13835;
        }
        if (i != 1) {
            return false;
        }
        return this.f13843;
    }
}
