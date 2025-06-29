package p307;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlSerializer;
import p225.AbstractActivityC3013;

/* renamed from: ᐧˋ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3569 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Object f13757 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Intent m8460(AbstractActivityC3013 abstractActivityC3013, ComponentName componentName) {
        String strM8462 = m8462(abstractActivityC3013, componentName);
        if (strM8462 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM8462);
        return m8462(abstractActivityC3013, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m8461(android.content.Context r8) {
        /*
            java.lang.Object r0 = p307.AbstractC3569.f13757
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L68
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L62
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L44:
            if (r2 == 0) goto L54
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L54
            goto L54
        L4a:
            r8 = move-exception
            goto L6a
        L4c:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            if (r2 == 0) goto L54
            goto L46
        L54:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5b
            goto L60
        L5b:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L62:
            if (r2 == 0) goto L67
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L67
        L67:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p307.AbstractC3569.m8461(android.content.Context):java.lang.String");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m8462(Activity activity, ComponentName componentName) {
        String string;
        PackageManager packageManager = activity.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i >= 29 ? 269222528 : i >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return activity.getPackageName() + string;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Intent m8463(AbstractActivityC3013 abstractActivityC3013) {
        Intent parentActivityIntent = abstractActivityC3013.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM8462 = m8462(abstractActivityC3013, abstractActivityC3013.getComponentName());
            if (strM8462 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC3013, strM8462);
            try {
                return m8462(abstractActivityC3013, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                String str = "getParentActivityIntent: bad parentActivityName '" + strM8462 + "' in manifest";
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m8464(Context context, String str) {
        synchronized (f13757) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                } catch (Exception e) {
                    if (fileOutputStreamOpenFileOutput != null) {
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (FileNotFoundException unused3) {
            }
        }
    }
}
