package p305;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.AbstractActivityC0113;
import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.C0105;
import com.google.android.gms.common.api.GoogleApiActivity;
import p225.AbstractC3019;
import p238.AbstractC3095;
import p293.InterfaceC3476;
import p307.C3558;
import p307.C3563;
import p331.C3761;
import p417.AbstractC4753;
import p417.AbstractC4768;
import p417.DialogInterfaceOnClickListenerC4758;
import p447.AbstractC5179;
import ـˈ.ˉᵎ;

/* renamed from: ᐧˆ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3525 extends C3536 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Object f13649 = new Object();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C3525 f13650 = new C3525();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m8407(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC0113) {
                AbstractC0104 supportFragmentManager = ((AbstractActivityC0113) activity).getSupportFragmentManager();
                C3543 c3543 = new C3543();
                AbstractC4753.m10689(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                c3543.f13697 = alertDialog;
                if (onCancelListener != null) {
                    c3543.f13695 = onCancelListener;
                }
                c3543.f700 = false;
                c3543.f707 = true;
                supportFragmentManager.getClass();
                C0105 c0105 = new C0105(supportFragmentManager);
                c0105.f647 = true;
                c0105.m705(0, c3543, str, 1);
                c0105.m697(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC3533 dialogFragmentC3533 = new DialogFragmentC3533();
        AbstractC4753.m10689(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC3533.f13667 = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC3533.f13665 = onCancelListener;
        }
        dialogFragmentC3533.show(fragmentManager, str);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static AlertDialog m8408(Activity activity, int i, DialogInterfaceOnClickListenerC4758 dialogInterfaceOnClickListenerC4758, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(AbstractC4768.m10697(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f13006f) : resources.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130079) : resources.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130072);
        if (string != null) {
            builder.setPositiveButton(string, dialogInterfaceOnClickListenerC4758);
        }
        String strM10699 = AbstractC4768.m10699(activity, i);
        if (strM10699 != null) {
            builder.setTitle(strM10699);
        }
        ˉᵎ.ˉⁱ("Creating dialog for Google Play services availability issue. ConnectionResult=", i);
        new IllegalArgumentException();
        return builder.create();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m8409(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogM8408 = m8408(googleApiActivity, i, new DialogInterfaceOnClickListenerC4758(super.m8427(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogM8408 == null) {
            return;
        }
        m8407(googleApiActivity, alertDialogM8408, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m8410(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        AbstractC5179.m11548(i, "GMS core API Availability. ConnectionResult=", ", tag=null");
        new IllegalArgumentException();
        if (i == 18) {
            new HandlerC3526(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                return;
            } else {
                return;
            }
        }
        String strM10698 = i == 6 ? AbstractC4768.m10698(context, "common_google_play_services_resolution_required_title") : AbstractC4768.m10699(context, i);
        if (strM10698 == null) {
            strM10698 = context.getResources().getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130076);
        }
        String strM10701 = (i == 6 || i == 19) ? AbstractC4768.m10701(context, "common_google_play_services_resolution_required_text", AbstractC4768.m10700(context)) : AbstractC4768.m10697(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC4753.m10683(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C3563 c3563 = new C3563(context, null);
        c3563.f13745 = true;
        c3563.f13746.flags |= 16;
        c3563.f13741 = C3563.m8449(strM10698);
        C3761 c3761 = new C3761(13, false);
        c3761.f14528 = C3563.m8449(strM10701);
        c3563.m8450(c3761);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC3095.f11947 == null) {
            AbstractC3095.f11947 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC3095.f11947.booleanValue()) {
            c3563.f13746.icon = context.getApplicationInfo().icon;
            c3563.f13747 = 2;
            if (AbstractC3095.m7614(context)) {
                c3563.f13740.add(new C3558(resources.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f13007e), pendingIntent));
            } else {
                c3563.f13752 = pendingIntent;
            }
        } else {
            c3563.f13746.icon = R.drawable.stat_sys_warning;
            c3563.f13746.tickerText = C3563.m8449(resources.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130076));
            c3563.f13746.when = System.currentTimeMillis();
            c3563.f13752 = pendingIntent;
            c3563.f13751 = C3563.m8449(strM10701);
        }
        if (AbstractC3095.m7610()) {
            if (!AbstractC3095.m7610()) {
                throw new IllegalStateException();
            }
            synchronized (f13649) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130075);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(AbstractC3019.m7486(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            c3563.f13744 = "com.google.android.gms.availability";
        }
        Notification notificationM8451 = c3563.m8451();
        if (i == 1 || i == 2 || i == 3) {
            AbstractC3537.f13680.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationM8451);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m8411(Activity activity, InterfaceC3476 interfaceC3476, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogM8408 = m8408(activity, i, new DialogInterfaceOnClickListenerC4758(super.m8427(i, activity, "d"), interfaceC3476, 1), onCancelListener);
        if (alertDialogM8408 == null) {
            return;
        }
        m8407(activity, alertDialogM8408, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
