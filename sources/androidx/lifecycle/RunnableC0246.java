package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.AbstractC0104;
import androidx.media3.decoder.ffmpeg.C0266;
import androidx.media3.ui.DefaultTimeBar;
import ar.tvplayer.tv.base.ui.view.CustomTextClock;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import p007.C0951;
import p033.C1209;
import p033.C1220;
import p052.C1319;
import p070.C1561;
import p120.C1865;
import p176.InterfaceC2490;
import p192.C2665;
import p226.AbstractActivityC3030;
import p226.DialogC3032;
import p226.ViewTreeObserverOnDrawListenerC3034;
import p230.C3065;
import p248.C3122;
import p251.RunnableC3129;
import p252.AbstractC3139;
import p272.C3328;
import p289.AbstractC3407;
import p291.AbstractC3436;
import p307.AbstractC3556;
import p307.C3575;
import p334.C3789;
import p337.C3839;
import p337.C3847;
import p338.InterfaceC3865;
import p357.C4052;
import p357.C4060;
import p362.C4109;
import p385.C4498;
import p385.InterfaceC4493;
import p421.AbstractC4863;
import p438.SurfaceHolderCallbackC5075;
import p448.C5184;
import p453.AbstractC5202;
import ـˈ.ᐧᴵ;

/* renamed from: androidx.lifecycle.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0246 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f1296;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f1297;

    public /* synthetic */ RunnableC0246(int i, Object obj) {
        this.f1297 = i;
        this.f1296 = obj;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m1051() {
        C4109 c4109 = (C4109) this.f1296;
        synchronized (c4109.f15891) {
            try {
                if (c4109.f15886) {
                    return;
                }
                long j = c4109.f15885 - 1;
                c4109.f15885 = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    c4109.m9424(new IllegalStateException());
                } else {
                    c4109.m9425();
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z = false;
        switch (this.f1297) {
            case 0:
                C0234 c0234 = (C0234) this.f1296;
                int i = c0234.f1260;
                C0236 c0236 = c0234.f1266;
                if (i == 0) {
                    c0234.f1263 = true;
                    c0236.m1034(EnumC0247.ON_PAUSE);
                }
                if (c0234.f1265 == 0 && c0234.f1263) {
                    c0236.m1034(EnumC0247.ON_STOP);
                    c0234.f1264 = true;
                    return;
                }
                return;
            case 1:
                C0951 c0951 = (C0951) this.f1296;
                int i2 = c0951.f4212 - 1;
                c0951.f4212 = i2;
                if (i2 > 0) {
                    return;
                }
                if (i2 < 0) {
                    throw new IllegalStateException(String.valueOf(c0951.f4212));
                }
                c0951.f4214.m3809();
                return;
            case 2:
                C1220 c1220 = (C1220) this.f1296;
                c1220.m4338(c1220.m4339(), 1028, new C1209(11));
                c1220.f5018.ʿʼ();
                return;
            case 3:
                ((HandlerThread) this.f1296).quit();
                return;
            case 4:
                ((CarouselLayoutManager) this.f1296).m4838();
                return;
            case 5:
                C2665 c2665 = (C2665) this.f1296;
                synchronized (c2665.f10559) {
                    try {
                        if (c2665.f10554 == null) {
                            return;
                        }
                        try {
                            C1319 c1319M6845 = c2665.m6845();
                            int i3 = c1319M6845.f5372;
                            if (i3 == 2) {
                                synchronized (c2665.f10559) {
                                }
                            }
                            if (i3 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            }
                            try {
                                int i4 = AbstractC5202.f20025;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                ˈˉ.ﹳﹳ r0 = c2665.f10555;
                                Context context = c2665.f10556;
                                r0.getClass();
                                C1319[] c1319Arr = {c1319M6845};
                                ʼˉ.ٴˎ r6 = AbstractC4863.f18370;
                                Trace.beginSection(ˈⁱ.ˉⁱ.ˎˑ("TypefaceCompat.createFromFontInfo"));
                                try {
                                    Typeface typeface = AbstractC4863.f18370.ٴˎ(context, c1319Arr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBuffer = ˆˑ.ﹳﹳ.ﹳˎ(c2665.f10556, c1319M6845.f5374);
                                    if (mappedByteBuffer == null || typeface == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        ﹶˋ.ـﹶ r4 = new ﹶˋ.ـﹶ(typeface, ᴵﹳ.ٴˎ.ˏᴵ(mappedByteBuffer));
                                        Trace.endSection();
                                        synchronized (c2665.f10559) {
                                            try {
                                                ˏʼ.ʽᐧ r02 = c2665.f10554;
                                                if (r02 != null) {
                                                    r02.ʿˏ(r4);
                                                }
                                            } finally {
                                            }
                                        }
                                        c2665.m6843();
                                        return;
                                    } finally {
                                        int i5 = AbstractC5202.f20025;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (c2665.f10559) {
                                try {
                                    ˏʼ.ʽᐧ r3 = c2665.f10554;
                                    if (r3 != null) {
                                        r3.ﹳˎ(th);
                                    }
                                    c2665.m6843();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                View view = (View) this.f1296;
                ((InputMethodManager) com.bumptech.glide.ﹳﹳ.ᵎˏ(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                ((AbstractActivityC3030) this.f1296).invalidateMenu();
                return;
            case 8:
                ViewTreeObserverOnDrawListenerC3034 viewTreeObserverOnDrawListenerC3034 = (ViewTreeObserverOnDrawListenerC3034) this.f1296;
                Runnable runnable = viewTreeObserverOnDrawListenerC3034.f11721;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC3034.f11721 = null;
                    return;
                }
                return;
            case 9:
                DialogC3032.m7527((DialogC3032) this.f1296);
                return;
            case 10:
                C3065 c3065 = (C3065) this.f1296;
                Surface surface = c3065.f11811;
                if (surface != null) {
                    Iterator it = c3065.f11815.iterator();
                    while (it.hasNext()) {
                        ((SurfaceHolderCallbackC5075) it.next()).f19247.m11395(null);
                    }
                }
                SurfaceTexture surfaceTexture = c3065.f11818;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                c3065.f11818 = null;
                c3065.f11811 = null;
                return;
            case 11:
                ((C3122) this.f1296).m7668();
                return;
            case 12:
                try {
                    ((Runnable) this.f1296).run();
                    return;
                } catch (Exception unused) {
                    AbstractC3407.f13261.ᴵʼ("SafeExecutor");
                    ˊﹶ.ˋˉ.ˑﾞ(new Object[0]);
                    return;
                }
            case 13:
                InterfaceC2490[] interfaceC2490Arr = ᐧᴵ.ˉᵎ;
                ((ᐧᴵ) this.f1296).ˎᵢ();
                return;
            case 14:
                int i6 = DefaultTimeBar.f1453;
                ((DefaultTimeBar) this.f1296).m1156(false);
                return;
            case 15:
                ((C3328) this.f1296).m8129();
                return;
            case 16:
                C1865 c1865 = (C1865) this.f1296;
                c1865.f7124 = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c1865.f7123;
                C5184 c5184 = sideSheetBehavior.f3387;
                if (c5184 != null && c5184.m11577()) {
                    c1865.m5630(c1865.f7122);
                    return;
                } else {
                    if (sideSheetBehavior.f3376 == 2) {
                        sideSheetBehavior.m2879(c1865.f7122);
                        return;
                    }
                    return;
                }
            case 17:
                InterfaceC3865 interfaceC3865 = (InterfaceC3865) ((C1561) this.f1296).f6302;
                if (interfaceC3865 != null) {
                    interfaceC3865.mo1053();
                    return;
                }
                return;
            case 18:
                AbstractC3436.m8293(4, (ArrayList) this.f1296);
                return;
            case 19:
                Iterator it2 = ((AbstractC0104) this.f1296).f624.iterator();
                while (it2.hasNext()) {
                    ((ٴˉ.ﹳﹳ) it2.next()).getClass();
                }
                return;
            case 20:
                Activity activity = (Activity) this.f1296;
                if (activity.isFinishing()) {
                    return;
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 28) {
                    Class cls = AbstractC3556.f13727;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC3556.f13727;
                boolean z2 = i7 == 26 || i7 == 27;
                Method method = AbstractC3556.f13728;
                if ((!z2 || method != null) && (AbstractC3556.f13725 != null || AbstractC3556.f13730 != null)) {
                    try {
                        Object obj2 = AbstractC3556.f13726.get(activity);
                        if (obj2 != null && (obj = AbstractC3556.f13724.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C3575 c3575 = new C3575(activity);
                            application.registerActivityLifecycleCallbacks(c3575);
                            Handler handler = AbstractC3556.f13729;
                            handler.post(new RunnableC3129(13, c3575, obj2, z));
                            try {
                                if (i7 == 26 || i7 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new RunnableC3129(14, application, c3575, z));
                                return;
                            } finally {
                                handler.post(new RunnableC3129(14, application, c3575, z));
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                activity.recreate();
                return;
            case 21:
                C3847 c3847 = (C3847) this.f1296;
                if (c3847.f14846 >= 300000) {
                    ˊﹶ.ˋˉ r2 = c3847.f14844;
                    switch (r2.ᐧⁱ) {
                        case 24:
                            ((C0266) r2.ˆʿ).f1380 = true;
                            break;
                        default:
                            ((C3839) r2.ˆʿ).f14742 = true;
                            break;
                    }
                    c3847.f14846 = 0L;
                    return;
                }
                return;
            case 22:
                ((C4060) this.f1296).m9347(true);
                return;
            case 23:
                C4052 c4052 = (C4052) this.f1296;
                boolean zIsPopupShowing = c4052.f15594.isPopupShowing();
                c4052.m9323(zIsPopupShowing);
                c4052.f15590 = zIsPopupShowing;
                return;
            case 24:
                ((TextInputLayout) this.f1296).f3443.requestLayout();
                return;
            case 25:
                int i8 = CustomTextClock.ˆʿ;
                CustomTextClock customTextClock = (CustomTextClock) this.f1296;
                customTextClock.setTimeZone(customTextClock.getTimeZone());
                RunnableC0246 runnableC0246 = customTextClock.ᐧⁱ;
                customTextClock.removeCallbacks(runnableC0246);
                customTextClock.postDelayed(runnableC0246, 60000L);
                return;
            case 26:
                m1051();
                return;
            case 27:
                ((ˏᵢ.ᵢٴ) this.f1296).ﾞˊ();
                return;
            case 28:
                File databasePath = ˈʼ.ﹳﹳ.ـﹶ().getDatabasePath("TvPlayer.db");
                File file = (File) this.f1296;
                AbstractC3139.m7776(databasePath, new File(file, "TvPlayer.db"));
                AbstractC3139.m7754(databasePath.getPath() + "-shm", file.getPath() + "/TvPlayer.db-shm");
                AbstractC3139.m7754(databasePath.getPath() + "-wal", file.getPath() + "/TvPlayer.db-wal");
                return;
            default:
                C4498 c4498 = (C4498) this.f1296;
                if (c4498.f17313) {
                    return;
                }
                InterfaceC4493 interfaceC4493 = c4498.f17312;
                if (interfaceC4493 != null) {
                    interfaceC4493.mo10246(c4498.f17315);
                }
                c4498.f17314.f17289.remove(c4498);
                c4498.f17313 = true;
                return;
        }
    }
}
