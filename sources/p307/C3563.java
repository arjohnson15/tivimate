package p307;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import p004.AbstractC0919;
import p200.C2752;
import p331.C3761;

/* renamed from: ᐧˋ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3563 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public CharSequence f13741;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C3761 f13742;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public Bundle f13743;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public String f13744;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final Notification f13746;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f13747;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final ArrayList f13749;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f13750;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public CharSequence f13751;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public PendingIntent f13752;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final boolean f13753;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f13740 = new ArrayList();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList f13748 = new ArrayList();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ArrayList f13754 = new ArrayList();

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean f13755 = true;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f13745 = false;

    public C3563(Context context, String str) {
        Notification notification = new Notification();
        this.f13746 = notification;
        this.f13750 = context;
        this.f13744 = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f13747 = 0;
        this.f13749 = new ArrayList();
        this.f13753 = true;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static CharSequence m8449(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m8450(C3761 c3761) {
        if (this.f13742 != c3761) {
            this.f13742 = c3761;
            if (((C3563) c3761.f14527) != this) {
                c3761.f14527 = this;
                m8450(c3761);
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Notification m8451() {
        Notification notificationBuild;
        Bundle bundle;
        int i;
        ArrayList arrayList;
        Notification.Action.Builder builder;
        Icon iconM3749;
        int i2;
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Context context = this.f13750;
        int i3 = Build.VERSION.SDK_INT;
        Notification.Builder builderM8446 = i3 >= 26 ? AbstractC3561.m8446(context, this.f13744) : new Notification.Builder(this.f13750);
        Notification notification = this.f13746;
        builderM8446.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f13741).setContentText(this.f13751).setContentInfo(null).setContentIntent(this.f13752).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        int i4 = 23;
        if (i3 < 23) {
            builderM8446.setLargeIcon((Bitmap) null);
        } else {
            AbstractC3568.m8458(builderM8446);
        }
        builderM8446.setSubText(null).setUsesChronometer(false).setPriority(this.f13747);
        Iterator it = this.f13740.iterator();
        while (it.hasNext()) {
            C3558 c3558 = (C3558) it.next();
            int i5 = Build.VERSION.SDK_INT;
            if (c3558.f13731 == null && (i2 = c3558.f13732) != 0) {
                c3558.f13731 = IconCompat.m198(i2);
            }
            IconCompat iconCompat = c3558.f13731;
            PendingIntent pendingIntent = c3558.f13736;
            CharSequence charSequence = c3558.f13735;
            if (i5 >= i4) {
                if (iconCompat == null) {
                    iconM3749 = null;
                } else {
                    if (i5 < i4) {
                        throw new UnsupportedOperationException("This method is only supported on API level 23+");
                    }
                    iconM3749 = AbstractC0919.m3749(iconCompat);
                }
                builder = AbstractC3568.m8456(iconM3749, charSequence, pendingIntent);
            } else {
                builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.m199() : 0, charSequence, pendingIntent);
            }
            Bundle bundle3 = c3558.f13734;
            Bundle bundle4 = bundle3 != null ? new Bundle(bundle3) : new Bundle();
            boolean z = c3558.f13733;
            bundle4.putBoolean("android.support.allowGeneratedReplies", z);
            if (i5 >= 24) {
                AbstractC3559.m8440(builder, z);
            }
            bundle4.putInt("android.support.action.semanticAction", 0);
            if (i5 >= 28) {
                AbstractC3571.m8470(builder);
            }
            if (i5 >= 29) {
                AbstractC3570.m8466(builder);
            }
            if (i5 >= 31) {
                AbstractC3564.m8452(builder);
            }
            bundle4.putBoolean("android.support.action.showsUserInterface", c3558.f13737);
            builder.addExtras(bundle4);
            builderM8446.addAction(builder.build());
            i4 = 23;
        }
        Bundle bundle5 = this.f13743;
        if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        int i6 = Build.VERSION.SDK_INT;
        builderM8446.setShowWhen(this.f13755);
        builderM8446.setLocalOnly(this.f13745);
        builderM8446.setGroup(null);
        builderM8446.setSortKey(null);
        builderM8446.setGroupSummary(false);
        builderM8446.setCategory(null);
        builderM8446.setColor(0);
        builderM8446.setVisibility(0);
        builderM8446.setPublicVersion(null);
        builderM8446.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.f13749;
        ArrayList arrayList3 = this.f13748;
        if (i6 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C2752 c2752 = new C2752(arrayList2.size() + arrayList.size());
                    c2752.addAll(arrayList);
                    c2752.addAll(arrayList2);
                    arrayList2 = new ArrayList(c2752);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                builderM8446.addPerson((String) it3.next());
            }
        }
        ArrayList arrayList4 = this.f13754;
        if (arrayList4.size() > 0) {
            if (this.f13743 == null) {
                this.f13743 = new Bundle();
            }
            Bundle bundle6 = this.f13743.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                String string = Integer.toString(i7);
                C3558 c35582 = (C3558) arrayList4.get(i7);
                Bundle bundle9 = new Bundle();
                if (c35582.f13731 == null && (i = c35582.f13732) != 0) {
                    c35582.f13731 = IconCompat.m198(i);
                }
                IconCompat iconCompat2 = c35582.f13731;
                bundle9.putInt("icon", iconCompat2 != null ? iconCompat2.m199() : 0);
                bundle9.putCharSequence("title", c35582.f13735);
                bundle9.putParcelable("actionIntent", c35582.f13736);
                Bundle bundle10 = c35582.f13734;
                Bundle bundle11 = bundle10 != null ? new Bundle(bundle10) : new Bundle();
                bundle11.putBoolean("android.support.allowGeneratedReplies", c35582.f13733);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", c35582.f13737);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(string, bundle9);
            }
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (this.f13743 == null) {
                this.f13743 = new Bundle();
            }
            this.f13743.putBundle("android.car.EXTENSIONS", bundle6);
            bundle2.putBundle("android.car.EXTENSIONS", bundle7);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            builderM8446.setExtras(this.f13743);
            AbstractC3559.m8441(builderM8446);
        }
        if (i8 >= 26) {
            AbstractC3561.m8443(builderM8446);
            AbstractC3561.m8448(builderM8446);
            AbstractC3561.m8444(builderM8446);
            AbstractC3561.m8447(builderM8446);
            AbstractC3561.m8445(builderM8446);
            if (!TextUtils.isEmpty(this.f13744)) {
                builderM8446.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i8 >= 29) {
            AbstractC3570.m8467(builderM8446, this.f13753);
            AbstractC3570.m8469(builderM8446);
        }
        C3761 c3761 = this.f13742;
        if (c3761 != null) {
            new Notification.BigTextStyle(builderM8446).setBigContentTitle(null).bigText((CharSequence) c3761.f14528);
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 26 && i9 < 24) {
            builderM8446.setExtras(bundle2);
            notificationBuild = builderM8446.build();
        } else {
            notificationBuild = builderM8446.build();
        }
        if (c3761 != null) {
            this.f13742.getClass();
        }
        if (c3761 != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return notificationBuild;
    }
}
