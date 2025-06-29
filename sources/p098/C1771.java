package p098;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.lsposed.hiddenapibypass.library.R;
import ˈⁱ.ˉⁱ;

/* renamed from: ˆˉ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1771 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final Object f6847 = new Object();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static volatile C1771 f6848;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Context f6850;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashSet f6849 = new HashSet();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f6851 = new HashMap();

    public C1771(Context context) {
        this.f6850 = context.getApplicationContext();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C1771 m5485(Context context) {
        if (f6848 == null) {
            synchronized (f6847) {
                try {
                    if (f6848 == null) {
                        f6848 = new C1771(context);
                    }
                } finally {
                }
            }
        }
        return f6848;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object m5486(Class cls, HashSet hashSet) {
        Object objMo584;
        if (ˉⁱ.ˑי()) {
            try {
                Trace.beginSection(ˉⁱ.ˎˑ(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f6851;
        if (map.containsKey(cls)) {
            objMo584 = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC1770 interfaceC1770 = (InterfaceC1770) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo586 = interfaceC1770.mo586();
                if (!listMo586.isEmpty()) {
                    for (Class cls2 : listMo586) {
                        if (!map.containsKey(cls2)) {
                            m5486(cls2, hashSet);
                        }
                    }
                }
                objMo584 = interfaceC1770.mo584(this.f6850);
                hashSet.remove(cls);
                map.put(cls, objMo584);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return objMo584;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5487(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f6850.getString(R.string._2_res_0x7f13001f);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f6849;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC1770.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m5486((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }
}
