package p406;

import android.content.ComponentName;
import android.content.Context;
import p457.C5391;

/* renamed from: ﹳʿ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4651 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f17768 = C5391.m12164("PackageManagerHelper");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m10555(Context context, Class cls, boolean z) {
        String str = f17768;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                C5391.m12163().m12168(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C5391 c5391M12163 = C5391.m12163();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            c5391M12163.m12168(str, sb.toString());
        } catch (Exception e) {
            C5391 c5391M121632 = C5391.m12163();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            c5391M121632.m12165(str, sb2.toString(), e);
        }
    }
}
