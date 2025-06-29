package p149;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ˊʾ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2297 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final Class[] f9076 = {Context.class, AttributeSet.class};

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final HashMap f9077 = new HashMap();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2308 f9079;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f9080;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object[] f9078 = new Object[2];

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String[] f9081 = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public C2297(Context context, C2308 c2308) {
        this.f9080 = context;
        this.f9079 = c2308;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Preference m6342(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? m6344(str, this.f9081, attributeSet) : m6344(str, null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final PreferenceGroup m6343(XmlResourceParser xmlResourceParser) {
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (this.f9078) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f9078[0] = this.f9080;
            do {
                try {
                    try {
                        next = xmlResourceParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (IOException e) {
                        InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e.getMessage());
                        inflateException.initCause(e);
                        throw inflateException;
                    } catch (XmlPullParserException e2) {
                        InflateException inflateException2 = new InflateException(e2.getMessage());
                        inflateException2.initCause(e2);
                        throw inflateException2;
                    }
                } catch (InflateException e3) {
                    throw e3;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroup = (PreferenceGroup) m6342(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            preferenceGroup.m1188(this.f9079);
            m6345(xmlResourceParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Preference m6344(String str, String[] strArr, AttributeSet attributeSet) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        HashMap map = f9077;
        Constructor<?> constructor = (Constructor) map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f9080.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e != null) {
                                throw e;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f9076);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (ClassNotFoundException e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        Object[] objArr = this.f9078;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m6345(XmlResourceParser xmlResourceParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                boolean zEquals = "intent".equals(name);
                Context context = this.f9080;
                if (zEquals) {
                    try {
                        preference.f1557 = Intent.parseIntent(context.getResources(), xmlResourceParser, attributeSet);
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    context.getResources().parseBundleExtra("extra", attributeSet, preference.m1199());
                    try {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlResourceParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceM6342 = m6342(name, attributeSet);
                    ((PreferenceGroup) preference).m1205(preferenceM6342);
                    m6345(xmlResourceParser, preferenceM6342, attributeSet);
                }
            }
        }
    }
}
