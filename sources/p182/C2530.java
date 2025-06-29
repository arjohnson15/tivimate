package p182;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.bumptech.glide.ﹳﹳ;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p222.AbstractC2962;
import p300.AbstractC3505;
import p320.ActionProviderVisibilityListenerC3646;
import p320.MenuC3643;

/* renamed from: ˋⁱ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2530 extends MenuInflater {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final Class[] f10063;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final Class[] f10064;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object[] f10065;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Context f10066;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object[] f10067;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f10068;

    static {
        Class[] clsArr = {Context.class};
        f10063 = clsArr;
        f10064 = clsArr;
    }

    public C2530(Context context) {
        super(context);
        this.f10066 = context;
        Object[] objArr = {context};
        this.f10067 = objArr;
        this.f10065 = objArr;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Object m6669(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? m6669(((ContextWrapper) context).getBaseContext()) : context;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC3643)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f10066.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC3643) {
                    MenuC3643 menuC3643 = (MenuC3643) menu;
                    if (!menuC3643.f13913) {
                        menuC3643.m8599();
                        z = true;
                    }
                }
                m6670(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC3643) menu).m8588();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC3643) menu).m8588();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6670(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i;
        ColorStateList colorStateList;
        int resourceId;
        C2523 c2523 = new C2523(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    C2530 c2530 = c2523.f10041;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = c2530.f10066.obtainStyledAttributes(attributeSet, AbstractC3505.f13586);
                        c2523.f10021 = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                        c2523.f10035 = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c2523.f10048 = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c2523.f10022 = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c2523.f10039 = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                        c2523.f10040 = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        Context context = c2530.f10066;
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC3505.f13593);
                        c2523.f10049 = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        c2523.f10026 = (typedArrayObtainStyledAttributes2.getInt(5, c2523.f10035) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c2523.f10048) & 65535);
                        c2523.f10032 = typedArrayObtainStyledAttributes2.getText(7);
                        c2523.f10027 = typedArrayObtainStyledAttributes2.getText(8);
                        c2523.f10029 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        c2523.f10043 = string == null ? (char) 0 : string.charAt(0);
                        c2523.f10033 = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        c2523.f10036 = string2 == null ? (char) 0 : string2.charAt(0);
                        c2523.f10045 = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            c2523.f10031 = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c2523.f10031 = c2523.f10022;
                        }
                        c2523.f10044 = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        c2523.f10046 = typedArrayObtainStyledAttributes2.getBoolean(4, c2523.f10039);
                        c2523.f10023 = typedArrayObtainStyledAttributes2.getBoolean(1, c2523.f10040);
                        c2523.f10028 = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        c2523.f10037 = typedArrayObtainStyledAttributes2.getString(12);
                        c2523.f10051 = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        c2523.f10050 = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && c2523.f10051 == 0 && c2523.f10050 == null) {
                            c2523.f10047 = (ActionProviderVisibilityListenerC3646) c2523.m6665(string3, f10064, c2530.f10065);
                        } else {
                            if (z3) {
                            }
                            c2523.f10047 = null;
                        }
                        c2523.f10025 = typedArrayObtainStyledAttributes2.getText(17);
                        c2523.f10042 = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            c2523.f10030 = AbstractC2962.m7331(typedArrayObtainStyledAttributes2.getInt(19, -1), c2523.f10030);
                        } else {
                            c2523.f10030 = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = ﹳﹳ.ˑי(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            c2523.f10024 = colorStateList;
                        } else {
                            c2523.f10024 = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        c2523.f10034 = false;
                    } else if (name2.equals("menu")) {
                        c2523.f10034 = true;
                        SubMenu subMenuAddSubMenu = c2523.f10038.addSubMenu(c2523.f10021, c2523.f10049, c2523.f10026, c2523.f10032);
                        c2523.m6664(subMenuAddSubMenu.getItem());
                        m6670(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        str = name2;
                        z2 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = 1;
                i = 2;
            } else if (eventType == 3) {
                String name3 = xmlResourceParser.getName();
                if (z2 && name3.equals(str)) {
                    z2 = false;
                    str = null;
                } else if (name3.equals("group")) {
                    c2523.f10021 = 0;
                    c2523.f10035 = 0;
                    c2523.f10048 = 0;
                    c2523.f10022 = 0;
                    c2523.f10039 = r4;
                    c2523.f10040 = r4;
                } else if (name3.equals("item")) {
                    if (!c2523.f10034) {
                        ActionProviderVisibilityListenerC3646 actionProviderVisibilityListenerC3646 = c2523.f10047;
                        if (actionProviderVisibilityListenerC3646 == null || !actionProviderVisibilityListenerC3646.f13954.hasSubMenu()) {
                            c2523.f10034 = r4;
                            c2523.m6664(c2523.f10038.add(c2523.f10021, c2523.f10049, c2523.f10026, c2523.f10032));
                        } else {
                            c2523.f10034 = r4;
                            c2523.m6664(c2523.f10038.addSubMenu(c2523.f10021, c2523.f10049, c2523.f10026, c2523.f10032).getItem());
                        }
                    }
                } else if (name3.equals("menu")) {
                    z = true;
                }
                eventType = xmlResourceParser.next();
                r4 = 1;
                i = 2;
            }
            eventType = xmlResourceParser.next();
            r4 = 1;
            i = 2;
        }
    }
}
