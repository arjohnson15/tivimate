package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.AbstractC0002;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0104;
import androidx.leanback.widget.RunnableC0183;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.C0236;
import androidx.lifecycle.C0252;
import androidx.lifecycle.EnumC0230;
import androidx.lifecycle.InterfaceC0242;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.lsposed.hiddenapibypass.library.R;
import p070.AbstractC1563;
import p070.C1545;
import p071.AbstractC1569;
import p071.C1567;
import p071.C1574;
import p071.InterfaceC1575;
import p107.InterfaceC1799;
import p107.InterfaceC1802;
import p226.C3031;
import p226.C3045;
import p226.InterfaceC3037;
import p226.InterfaceC3048;
import p240.InterfaceC3101;
import p285.C3383;
import p285.InterfaceC3387;
import p286.C3389;
import p291.AbstractC3416;
import p291.AbstractC3458;
import p291.C3414;
import p291.C3417;
import p291.C3419;
import p291.C3423;
import p291.C3437;
import p291.C3439;
import p291.C3442;
import p291.C3445;
import p291.C3447;
import p291.C3450;
import p291.C3453;
import p291.C3457;
import p291.InterfaceC3418;
import p291.InterfaceC3438;
import p291.InterfaceC3443;
import p297.AbstractC3490;
import p307.C3572;
import p307.C3576;
import p307.InterfaceC3562;
import p307.InterfaceC3573;
import p331.C3758;
import p378.InterfaceC4341;
import p458.C5394;
import ˆʽ.ˉʽ;
import ˊﹶ.ˋˉ;
import ـˈ.ˉᵎ;

/* renamed from: androidx.fragment.app.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0104 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f595;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public ArrayList f596;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public ArrayList f597;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C1567 f599;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f604;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C1567 f607;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final C3457 f608;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public C0114 f614;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public ArrayList f615;

    /* renamed from: יʻ, reason: contains not printable characters */
    public AbstractComponentCallbacksC0100 f616;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f617;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C3031 f620;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C1567 f621;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f623;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final C3457 f625;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final C3457 f626;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f627;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final C3457 f629;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public AbstractComponentCallbacksC0100 f630;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f632;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public AbstractC3416 f634;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public AbstractC3458 f635;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public ArrayList f636;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f618 = new ArrayList();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0090 f612 = new C0090();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public ArrayList f631 = new ArrayList();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final LayoutInflaterFactory2C0095 f619 = new LayoutInflaterFactory2C0095(this);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C0105 f611 = null;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C0118 f633 = new C0118(this);

    /* renamed from: ˉי, reason: contains not printable characters */
    public final AtomicInteger f602 = new AtomicInteger();

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final Map f609 = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final Map f603 = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final Map f606 = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final ArrayList f624 = new ArrayList();

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final C3758 f610 = new C3758(this);

    /* renamed from: ˑי, reason: contains not printable characters */
    public final CopyOnWriteArrayList f613 = new CopyOnWriteArrayList();

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final C3453 f598 = new C3453(this);

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public int f605 = -1;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final C3419 f601 = new C3419(this);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ٴᐧ.ᐧⁱ f622 = new ٴᐧ.ᐧⁱ(0);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public ArrayDeque f600 = new ArrayDeque();

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final RunnableC0183 f628 = new RunnableC0183(24, this);

    /* JADX WARN: Type inference failed for: r0v16, types: [ٴᐧ.ﾞʽ] */
    /* JADX WARN: Type inference failed for: r0v17, types: [ٴᐧ.ﾞʽ] */
    /* JADX WARN: Type inference failed for: r0v18, types: [ٴᐧ.ﾞʽ] */
    /* JADX WARN: Type inference failed for: r0v19, types: [ٴᐧ.ﾞʽ] */
    public AbstractC0104() {
        final int i = 0;
        this.f626 = new InterfaceC3101(this) { // from class: ٴᐧ.ﾞʽ

            /* renamed from: ʽᐧ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC0104 f13383;

            {
                this.f13383 = this;
            }

            @Override // p240.InterfaceC3101
            /* renamed from: ˑʽ */
            public final void mo731(Object obj) {
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC0104 abstractC0104 = this.f13383;
                        if (abstractC0104.m665()) {
                            abstractC0104.m691(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0104 abstractC01042 = this.f13383;
                        if (abstractC01042.m665() && num.intValue() == 80) {
                            abstractC01042.m652(false);
                            break;
                        }
                        break;
                    case 2:
                        C3576 c3576 = (C3576) obj;
                        AbstractC0104 abstractC01043 = this.f13383;
                        if (abstractC01043.m665()) {
                            abstractC01043.m678(c3576.f13765, false);
                            break;
                        }
                        break;
                    default:
                        C3572 c3572 = (C3572) obj;
                        AbstractC0104 abstractC01044 = this.f13383;
                        if (abstractC01044.m665()) {
                            abstractC01044.m681(c3572.f13758, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f608 = new InterfaceC3101(this) { // from class: ٴᐧ.ﾞʽ

            /* renamed from: ʽᐧ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC0104 f13383;

            {
                this.f13383 = this;
            }

            @Override // p240.InterfaceC3101
            /* renamed from: ˑʽ */
            public final void mo731(Object obj) {
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC0104 abstractC0104 = this.f13383;
                        if (abstractC0104.m665()) {
                            abstractC0104.m691(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0104 abstractC01042 = this.f13383;
                        if (abstractC01042.m665() && num.intValue() == 80) {
                            abstractC01042.m652(false);
                            break;
                        }
                        break;
                    case 2:
                        C3576 c3576 = (C3576) obj;
                        AbstractC0104 abstractC01043 = this.f13383;
                        if (abstractC01043.m665()) {
                            abstractC01043.m678(c3576.f13765, false);
                            break;
                        }
                        break;
                    default:
                        C3572 c3572 = (C3572) obj;
                        AbstractC0104 abstractC01044 = this.f13383;
                        if (abstractC01044.m665()) {
                            abstractC01044.m681(c3572.f13758, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f625 = new InterfaceC3101(this) { // from class: ٴᐧ.ﾞʽ

            /* renamed from: ʽᐧ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC0104 f13383;

            {
                this.f13383 = this;
            }

            @Override // p240.InterfaceC3101
            /* renamed from: ˑʽ */
            public final void mo731(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC0104 abstractC0104 = this.f13383;
                        if (abstractC0104.m665()) {
                            abstractC0104.m691(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0104 abstractC01042 = this.f13383;
                        if (abstractC01042.m665() && num.intValue() == 80) {
                            abstractC01042.m652(false);
                            break;
                        }
                        break;
                    case 2:
                        C3576 c3576 = (C3576) obj;
                        AbstractC0104 abstractC01043 = this.f13383;
                        if (abstractC01043.m665()) {
                            abstractC01043.m678(c3576.f13765, false);
                            break;
                        }
                        break;
                    default:
                        C3572 c3572 = (C3572) obj;
                        AbstractC0104 abstractC01044 = this.f13383;
                        if (abstractC01044.m665()) {
                            abstractC01044.m681(c3572.f13758, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f629 = new InterfaceC3101(this) { // from class: ٴᐧ.ﾞʽ

            /* renamed from: ʽᐧ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC0104 f13383;

            {
                this.f13383 = this;
            }

            @Override // p240.InterfaceC3101
            /* renamed from: ˑʽ */
            public final void mo731(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC0104 abstractC0104 = this.f13383;
                        if (abstractC0104.m665()) {
                            abstractC0104.m691(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0104 abstractC01042 = this.f13383;
                        if (abstractC01042.m665() && num.intValue() == 80) {
                            abstractC01042.m652(false);
                            break;
                        }
                        break;
                    case 2:
                        C3576 c3576 = (C3576) obj;
                        AbstractC0104 abstractC01043 = this.f13383;
                        if (abstractC01043.m665()) {
                            abstractC01043.m678(c3576.f13765, false);
                            break;
                        }
                        break;
                    default:
                        C3572 c3572 = (C3572) obj;
                        AbstractC0104 abstractC01044 = this.f13383;
                        if (abstractC01044.m665()) {
                            abstractC01044.m681(c3572.f13758, false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static boolean m630(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        if (!abstractComponentCallbacksC0100.mHasMenu || !abstractComponentCallbacksC0100.mMenuVisible) {
            Iterator it = abstractComponentCallbacksC0100.mChildFragmentManager.f612.m593().iterator();
            boolean zM630 = false;
            while (it.hasNext()) {
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = (AbstractComponentCallbacksC0100) it.next();
                if (abstractComponentCallbacksC01002 != null) {
                    zM630 = m630(abstractComponentCallbacksC01002);
                }
                if (zM630) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public static void m631(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "show: " + abstractComponentCallbacksC0100;
        }
        if (abstractComponentCallbacksC0100.mHidden) {
            abstractComponentCallbacksC0100.mHidden = false;
            abstractComponentCallbacksC0100.mHiddenChanged = !abstractComponentCallbacksC0100.mHiddenChanged;
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static HashSet m632(C0105 c0105) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < c0105.f648.size(); i++) {
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = ((C3414) c0105.f648.get(i)).f13278;
            if (abstractComponentCallbacksC0100 != null && c0105.f650) {
                hashSet.add(abstractComponentCallbacksC0100);
            }
        }
        return hashSet;
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static boolean m633(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        if (abstractComponentCallbacksC0100 == null) {
            return true;
        }
        AbstractC0104 abstractC0104 = abstractComponentCallbacksC0100.mFragmentManager;
        return abstractComponentCallbacksC0100.equals(abstractC0104.f630) && m633(abstractC0104.f616);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f616;
        if (abstractComponentCallbacksC0100 != null) {
            sb.append(abstractComponentCallbacksC0100.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f616)));
            sb.append("}");
        } else {
            AbstractC3458 abstractC3458 = this.f635;
            if (abstractC3458 != null) {
                sb.append(abstractC3458.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f635)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m634() {
        if (this.f635 == null) {
            return;
        }
        this.f632 = false;
        this.f604 = false;
        this.f614.f689 = false;
        for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 : this.f612.m597()) {
            if (abstractComponentCallbacksC0100 != null) {
                abstractComponentCallbacksC0100.noteStateNotSaved();
            }
        }
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final void m635(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        ViewGroup viewGroupM668 = m668(abstractComponentCallbacksC0100);
        if (viewGroupM668 == null || !(viewGroupM668 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM668).setDrawDisappearingViewsLast(!z);
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m636(String str, ˉʽ r9, InterfaceC3443 interfaceC3443) {
        AbstractC0233 lifecycle = r9.getLifecycle();
        if (((C0236) lifecycle).f1275 == EnumC0230.f1254) {
            return;
        }
        C1574 c1574 = new C1574(this, str, interfaceC3443, lifecycle, 1);
        C3442 c3442 = (C3442) this.f606.put(str, new C3442(lifecycle, interfaceC3443, c1574));
        if (c3442 != null) {
            c3442.f13342.mo1031(c3442.f13341);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            String str2 = "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + interfaceC3443;
        }
        lifecycle.mo1032(c1574);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m637(AbstractC3458 abstractC3458, AbstractC3416 abstractC3416, AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        if (this.f635 != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f635 = abstractC3458;
        this.f634 = abstractC3416;
        this.f616 = abstractComponentCallbacksC0100;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f613;
        if (abstractComponentCallbacksC0100 != null) {
            copyOnWriteArrayList.add(new C3417(abstractComponentCallbacksC0100));
        } else if (abstractC3458 instanceof InterfaceC3438) {
            copyOnWriteArrayList.add((InterfaceC3438) abstractC3458);
        }
        if (this.f616 != null) {
            m663();
        }
        if (abstractC3458 instanceof InterfaceC3048) {
            InterfaceC3048 interfaceC3048 = (InterfaceC3048) abstractC3458;
            C3031 onBackPressedDispatcher = interfaceC3048.getOnBackPressedDispatcher();
            this.f620 = onBackPressedDispatcher;
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = interfaceC3048;
            if (abstractComponentCallbacksC0100 != null) {
                abstractComponentCallbacksC01002 = abstractComponentCallbacksC0100;
            }
            onBackPressedDispatcher.getClass();
            AbstractC0233 lifecycle = abstractComponentCallbacksC01002.getLifecycle();
            if (((C0236) lifecycle).f1275 != EnumC0230.f1254) {
                C0118 c0118 = this.f633;
                c0118.f711.add(new C3045(onBackPressedDispatcher, lifecycle, c0118));
                onBackPressedDispatcher.m7525();
                c0118.f712 = new ʾᵔ.ᐧˋ(0, onBackPressedDispatcher, C3031.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 21);
            }
        }
        if (abstractComponentCallbacksC0100 != null) {
            C0114 c0114 = abstractComponentCallbacksC0100.mFragmentManager.f614;
            HashMap map = c0114.f687;
            C0114 c01142 = (C0114) map.get(abstractComponentCallbacksC0100.mWho);
            if (c01142 == null) {
                c01142 = new C0114(c0114.f686);
                map.put(abstractComponentCallbacksC0100.mWho, c01142);
            }
            this.f614 = c01142;
        } else if (abstractC3458 instanceof InterfaceC0242) {
            ﹶˋ.ـﹶ r1 = new ﹶˋ.ـﹶ(((InterfaceC0242) abstractC3458).getViewModelStore(), C0114.f684, C5394.f20869);
            C1545 c1545M5154 = AbstractC1563.m5154(C0114.class);
            String strM5132 = c1545M5154.m5132();
            if (strM5132 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f614 = (C0114) r1.ᴵʿ(c1545M5154, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM5132));
        } else {
            this.f614 = new C0114(false);
        }
        this.f614.f689 = m657();
        this.f612.f548 = this.f614;
        Object obj = this.f635;
        if ((obj instanceof InterfaceC3387) && abstractComponentCallbacksC0100 == null) {
            C3383 savedStateRegistry = ((InterfaceC3387) obj).getSavedStateRegistry();
            savedStateRegistry.m8242("android:support:fragments", new C0252(2, this));
            Bundle bundleM8243 = savedStateRegistry.m8243("android:support:fragments");
            if (bundleM8243 != null) {
                m647(bundleM8243);
            }
        }
        Object obj2 = this.f635;
        if (obj2 instanceof InterfaceC1575) {
            AbstractC1569 activityResultRegistry = ((InterfaceC1575) obj2).getActivityResultRegistry();
            String str = ᵎﹳ.ᐧʻ.ﾞˊ("FragmentManager:", abstractComponentCallbacksC0100 != null ? ˆʽ.ᵎˏ.ˎٴ(new StringBuilder(), abstractComponentCallbacksC0100.mWho, ":") : "");
            this.f599 = activityResultRegistry.m5164(ᵎﹳ.ᐧʻ.ˉⁱ(str, "StartActivityForResult"), new C3389(2), new ˋˉ(16, this));
            this.f607 = activityResultRegistry.m5164(ᵎﹳ.ᐧʻ.ˉⁱ(str, "StartIntentSenderForResult"), new C3389(4), new C3437(this, 1));
            this.f621 = activityResultRegistry.m5164(ᵎﹳ.ᐧʻ.ˉⁱ(str, "RequestPermissions"), new C3389(0), new C3437(this, 0));
        }
        Object obj3 = this.f635;
        if (obj3 instanceof InterfaceC1799) {
            ((InterfaceC1799) obj3).addOnConfigurationChangedListener(this.f626);
        }
        Object obj4 = this.f635;
        if (obj4 instanceof InterfaceC1802) {
            ((InterfaceC1802) obj4).addOnTrimMemoryListener(this.f608);
        }
        Object obj5 = this.f635;
        if (obj5 instanceof InterfaceC3573) {
            ((InterfaceC3573) obj5).addOnMultiWindowModeChangedListener(this.f625);
        }
        Object obj6 = this.f635;
        if (obj6 instanceof InterfaceC3562) {
            ((InterfaceC3562) obj6).addOnPictureInPictureModeChangedListener(this.f629);
        }
        Object obj7 = this.f635;
        if ((obj7 instanceof InterfaceC4341) && abstractComponentCallbacksC0100 == null) {
            ((InterfaceC4341) obj7).addMenuProvider(this.f598);
        }
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final void m638(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "hide: " + abstractComponentCallbacksC0100;
        }
        if (abstractComponentCallbacksC0100.mHidden) {
            return;
        }
        abstractComponentCallbacksC0100.mHidden = true;
        abstractComponentCallbacksC0100.mHiddenChanged = true ^ abstractComponentCallbacksC0100.mHiddenChanged;
        m669(abstractComponentCallbacksC0100);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final HashSet m639() {
        C0101 c0101;
        HashSet hashSet = new HashSet();
        Iterator it = this.f612.m599().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0109) it.next()).f677.mContainer;
            if (viewGroup != null) {
                m695();
                Object tag = viewGroup.getTag(R.id._2_res_0x7f0b0358);
                if (tag instanceof C0101) {
                    c0101 = (C0101) tag;
                } else {
                    c0101 = new C0101(viewGroup);
                    viewGroup.setTag(R.id._2_res_0x7f0b0358, c0101);
                }
                hashSet.add(c0101);
            }
        }
        return hashSet;
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final void m640(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C0105) arrayList.get(i)).f647) {
                if (i2 != i) {
                    m642(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0105) arrayList.get(i2)).f647) {
                        i2++;
                    }
                }
                m642(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m642(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m641(int i) {
        try {
            this.f595 = true;
            for (C0109 c0109 : this.f612.f545.values()) {
                if (c0109 != null) {
                    c0109.f676 = i;
                }
            }
            m685(i, false);
            Iterator it = m639().iterator();
            while (it.hasNext()) {
                ((C0101) it.next()).m628();
            }
            this.f595 = false;
            m644(true);
        } catch (Throwable th) {
            this.f595 = false;
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */
    /* renamed from: ˆʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m642(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC0104.m642(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m643() {
        Iterator it = m639().iterator();
        while (it.hasNext()) {
            C0101 c0101 = (C0101) it.next();
            if (c0101.f589) {
                if (Log.isLoggable("FragmentManager", 2)) {
                }
                c0101.f589 = false;
                c0101.m619();
            }
        }
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean m644(boolean z) {
        boolean zMo703;
        m688(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f636;
            ArrayList arrayList2 = this.f596;
            synchronized (this.f618) {
                if (this.f618.isEmpty()) {
                    zMo703 = false;
                } else {
                    try {
                        int size = this.f618.size();
                        zMo703 = false;
                        for (int i = 0; i < size; i++) {
                            zMo703 |= ((InterfaceC3418) this.f618.get(i)).mo703(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zMo703) {
                m663();
                m651();
                this.f612.f545.values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.f595 = true;
            try {
                m640(this.f636, this.f596);
            } finally {
                m689();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: ˈﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m645(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.util.Map r0 = r3.f606
            java.lang.Object r0 = r0.get(r4)
            ٴᐧ.ᐧˋ r0 = (p291.C3442) r0
            if (r0 == 0) goto L1c
            androidx.lifecycle.ˏᴵ r1 = androidx.lifecycle.EnumC0230.f1253
            androidx.lifecycle.ˑי r2 = r0.f13342
            androidx.lifecycle.יʻ r2 = (androidx.lifecycle.C0236) r2
            androidx.lifecycle.ˏᴵ r2 = r2.f1275
            boolean r1 = r2.m1030(r1)
            if (r1 == 0) goto L1c
            r0.mo8296(r4, r5)
            goto L21
        L1c:
            java.util.Map r0 = r3.f603
            r0.put(r4, r5)
        L21:
            r0 = 2
            java.lang.String r1 = "FragmentManager"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Setting fragment result with key "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r4 = " and result "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC0104.m645(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m646(MenuItem menuItem) {
        if (this.f605 < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 : this.f612.m597()) {
            if (abstractComponentCallbacksC0100 != null && abstractComponentCallbacksC0100.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final void m647(Bundle bundle) {
        int i;
        C3758 c3758;
        C0109 c0109;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f635.f13385.getClassLoader());
                this.f603.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f635.f13385.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C0090 c0090 = this.f612;
        HashMap map2 = c0090.f546;
        map2.clear();
        map2.putAll(map);
        C3423 c3423 = (C3423) bundle.getParcelable("state");
        if (c3423 == null) {
            return;
        }
        HashMap map3 = c0090.f545;
        map3.clear();
        Iterator it = c3423.f13299.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i = 2;
            c3758 = this.f610;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM600 = c0090.m600((String) it.next(), null);
            if (bundleM600 != null) {
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = (AbstractComponentCallbacksC0100) this.f614.f685.get(((C0092) bundleM600.getParcelable("state")).f562);
                if (abstractComponentCallbacksC0100 != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        String str3 = "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0100;
                    }
                    c0109 = new C0109(c3758, c0090, abstractComponentCallbacksC0100, bundleM600);
                } else {
                    c0109 = new C0109(this.f610, this.f612, this.f635.f13385.getClassLoader(), m677(), bundleM600);
                }
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = c0109.f677;
                abstractComponentCallbacksC01002.mSavedFragmentState = bundleM600;
                abstractComponentCallbacksC01002.mFragmentManager = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    String str4 = "restoreSaveState: active (" + abstractComponentCallbacksC01002.mWho + "): " + abstractComponentCallbacksC01002;
                }
                c0109.m717(this.f635.f13385.getClassLoader());
                c0090.m598(c0109);
                c0109.f676 = this.f605;
            }
        }
        C0114 c0114 = this.f614;
        c0114.getClass();
        Iterator it2 = new ArrayList(c0114.f685.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC01003 = (AbstractComponentCallbacksC0100) it2.next();
            if (map3.get(abstractComponentCallbacksC01003.mWho) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    String str5 = "Discarding retained Fragment " + abstractComponentCallbacksC01003 + " that was not found in the set of active Fragments " + c3423.f13299;
                }
                this.f614.m733(abstractComponentCallbacksC01003);
                abstractComponentCallbacksC01003.mFragmentManager = this;
                C0109 c01092 = new C0109(c3758, c0090, abstractComponentCallbacksC01003);
                c01092.f676 = 1;
                c01092.m719();
                abstractComponentCallbacksC01003.mRemoving = true;
                c01092.m719();
            }
        }
        ArrayList<String> arrayList = c3423.f13294;
        c0090.f547.clear();
        if (arrayList != null) {
            for (String str6 : arrayList) {
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M592 = c0090.m592(str6);
                if (abstractComponentCallbacksC0100M592 == null) {
                    throw new IllegalStateException(ˆʽ.ᵎˏ.ˑי("No instantiated fragment for (", str6, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    String str7 = "restoreSaveState: added (" + str6 + "): " + abstractComponentCallbacksC0100M592;
                }
                c0090.m596(abstractComponentCallbacksC0100M592);
            }
        }
        if (c3423.f13297 != null) {
            this.f631 = new ArrayList(c3423.f13297.length);
            int i2 = 0;
            while (true) {
                C0087[] c0087Arr = c3423.f13297;
                if (i2 >= c0087Arr.length) {
                    break;
                }
                C0087 c0087 = c0087Arr[i2];
                c0087.getClass();
                C0105 c0105 = new C0105(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = c0087.f536;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    C3414 c3414 = new C3414();
                    int i5 = i3 + 1;
                    c3414.f13282 = iArr[i3];
                    if (Log.isLoggable("FragmentManager", i)) {
                        String str8 = "Instantiate " + c0105 + " op #" + i4 + " base fragment #" + iArr[i5];
                    }
                    c3414.f13280 = EnumC0230.values()[c0087.f531[i4]];
                    c3414.f13286 = EnumC0230.values()[c0087.f535[i4]];
                    int i6 = i3 + 2;
                    c3414.f13281 = iArr[i5] != 0;
                    int i7 = iArr[i6];
                    c3414.f13285 = i7;
                    int i8 = iArr[i3 + 3];
                    c3414.f13279 = i8;
                    int i9 = i3 + 5;
                    int i10 = iArr[i3 + 4];
                    c3414.f13283 = i10;
                    i3 += 6;
                    int i11 = iArr[i9];
                    c3414.f13284 = i11;
                    c0105.f637 = i7;
                    c0105.f646 = i8;
                    c0105.f655 = i10;
                    c0105.f638 = i11;
                    c0105.m696(c3414);
                    i4++;
                    i = 2;
                }
                c0105.f649 = c0087.f529;
                c0105.f656 = c0087.f538;
                c0105.f650 = true;
                c0105.f639 = c0087.f530;
                c0105.f643 = c0087.f534;
                c0105.f640 = c0087.f537;
                c0105.f641 = c0087.f540;
                c0105.f651 = c0087.f527;
                c0105.f644 = c0087.f533;
                c0105.f647 = c0087.f532;
                c0105.f654 = c0087.f539;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = c0087.f528;
                    if (i12 >= arrayList2.size()) {
                        break;
                    }
                    String str9 = (String) arrayList2.get(i12);
                    if (str9 != null) {
                        ((C3414) c0105.f648.get(i12)).f13278 = c0090.m592(str9);
                    }
                    i12++;
                }
                c0105.m706(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sbM40 = AbstractC0002.m40(i2, "restoreAllState: back stack #", " (index ");
                    sbM40.append(c0105.f654);
                    sbM40.append("): ");
                    sbM40.append(c0105);
                    sbM40.toString();
                    PrintWriter printWriter = new PrintWriter(new C3447());
                    c0105.m701("  ", printWriter, false);
                    printWriter.close();
                }
                this.f631.add(c0105);
                i2++;
                i = 2;
            }
        } else {
            this.f631 = new ArrayList();
        }
        this.f602.set(c3423.f13298);
        String str10 = c3423.f13295;
        if (str10 != null) {
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M5922 = c0090.m592(str10);
            this.f630 = abstractComponentCallbacksC0100M5922;
            m656(abstractComponentCallbacksC0100M5922);
        }
        ArrayList arrayList3 = c3423.f13300;
        if (arrayList3 != null) {
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                this.f609.put((String) arrayList3.get(i13), (C3439) c3423.f13301.get(i13));
            }
        }
        this.f600 = new ArrayDeque(c3423.f13296);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m648() {
        boolean zIsChangingConfigurations = true;
        this.f617 = true;
        m644(true);
        m692();
        AbstractC3458 abstractC3458 = this.f635;
        boolean z = abstractC3458 instanceof InterfaceC0242;
        C0090 c0090 = this.f612;
        if (z) {
            zIsChangingConfigurations = c0090.f548.f688;
        } else {
            AbstractActivityC0113 abstractActivityC0113 = abstractC3458.f13385;
            if (abstractActivityC0113 instanceof Activity) {
                zIsChangingConfigurations = true ^ abstractActivityC0113.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f609.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C3439) it.next()).f13335.iterator();
                while (it2.hasNext()) {
                    c0090.f548.m734((String) it2.next(), false);
                }
            }
        }
        m641(-1);
        Object obj = this.f635;
        if (obj instanceof InterfaceC1802) {
            ((InterfaceC1802) obj).removeOnTrimMemoryListener(this.f608);
        }
        Object obj2 = this.f635;
        if (obj2 instanceof InterfaceC1799) {
            ((InterfaceC1799) obj2).removeOnConfigurationChangedListener(this.f626);
        }
        Object obj3 = this.f635;
        if (obj3 instanceof InterfaceC3573) {
            ((InterfaceC3573) obj3).removeOnMultiWindowModeChangedListener(this.f625);
        }
        Object obj4 = this.f635;
        if (obj4 instanceof InterfaceC3562) {
            ((InterfaceC3562) obj4).removeOnPictureInPictureModeChangedListener(this.f629);
        }
        Object obj5 = this.f635;
        if ((obj5 instanceof InterfaceC4341) && this.f616 == null) {
            ((InterfaceC4341) obj5).removeMenuProvider(this.f598);
        }
        this.f635 = null;
        this.f634 = null;
        this.f616 = null;
        if (this.f620 != null) {
            Iterator it3 = this.f633.f711.iterator();
            while (it3.hasNext()) {
                ((InterfaceC3037) it3.next()).cancel();
            }
            this.f620 = null;
        }
        C1567 c1567 = this.f599;
        if (c1567 != null) {
            c1567.m5157();
            this.f607.m5157();
            this.f621.m5157();
        }
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final boolean m649(int i, int i2) {
        m644(false);
        m688(true);
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f630;
        if (abstractComponentCallbacksC0100 != null && i < 0 && abstractComponentCallbacksC0100.getChildFragmentManager().m694()) {
            return true;
        }
        boolean zM653 = m653(this.f636, this.f596, i, i2);
        if (zM653) {
            this.f595 = true;
            try {
                m640(this.f636, this.f596);
            } finally {
                m689();
            }
        }
        m663();
        m651();
        this.f612.f545.values().removeAll(Collections.singleton(null));
        return zM653;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int m650() {
        return this.f631.size() + (this.f611 != null ? 1 : 0);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m651() {
        if (this.f623) {
            this.f623 = false;
            m680();
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m652(boolean z) {
        if (z && (this.f635 instanceof InterfaceC1802)) {
            m658(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 : this.f612.m597()) {
            if (abstractComponentCallbacksC0100 != null) {
                abstractComponentCallbacksC0100.performLowMemory();
                if (z) {
                    abstractComponentCallbacksC0100.mChildFragmentManager.m652(true);
                }
            }
        }
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final boolean m653(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.f631.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f631.size() - 1;
            } else {
                int size2 = this.f631.size() - 1;
                while (size2 >= 0) {
                    C0105 c0105 = (C0105) this.f631.get(size2);
                    if (i >= 0 && i == c0105.f654) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z) {
                        while (size2 > 0) {
                            C0105 c01052 = (C0105) this.f631.get(size2 - 1);
                            if (i < 0 || i != c01052.f654) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.f631.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f631.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0105) this.f631.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final C3445 m654(ᐧﾞ.ـﹶ r5) {
        C0109 c0109 = (C0109) this.f612.f545.get(r5.mWho);
        if (c0109 != null) {
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c0109.f677;
            if (abstractComponentCallbacksC0100.equals(r5)) {
                if (abstractComponentCallbacksC0100.mState > -1) {
                    return new C3445(c0109.m726());
                }
                return null;
            }
        }
        m658(new IllegalStateException("Fragment " + r5 + " is not currently in the FragmentManager"));
        throw null;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final AbstractComponentCallbacksC0100 m655(int i) {
        C0090 c0090 = this.f612;
        ArrayList arrayList = c0090.f547;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = (AbstractComponentCallbacksC0100) arrayList.get(size);
            if (abstractComponentCallbacksC0100 != null && abstractComponentCallbacksC0100.mFragmentId == i) {
                return abstractComponentCallbacksC0100;
            }
        }
        for (C0109 c0109 : c0090.f545.values()) {
            if (c0109 != null) {
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = c0109.f677;
                if (abstractComponentCallbacksC01002.mFragmentId == i) {
                    return abstractComponentCallbacksC01002;
                }
            }
        }
        return null;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m656(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        if (abstractComponentCallbacksC0100 != null) {
            if (abstractComponentCallbacksC0100.equals(this.f612.m592(abstractComponentCallbacksC0100.mWho))) {
                abstractComponentCallbacksC0100.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final boolean m657() {
        return this.f632 || this.f604;
    }

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public final void m658(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C3447());
        AbstractC3458 abstractC3458 = this.f635;
        if (abstractC3458 == null) {
            try {
                m693("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                throw illegalStateException;
            }
        } else {
            try {
                ((C0111) abstractC3458).f681.dump("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                throw illegalStateException;
            }
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m659(Menu menu, MenuInflater menuInflater) {
        if (this.f605 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 : this.f612.m597()) {
            if (abstractComponentCallbacksC0100 != null && abstractComponentCallbacksC0100.isMenuVisible() && abstractComponentCallbacksC0100.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC0100);
                z = true;
            }
        }
        if (this.f597 != null) {
            for (int i = 0; i < this.f597.size(); i++) {
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = (AbstractComponentCallbacksC0100) this.f597.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC01002)) {
                    abstractComponentCallbacksC01002.onDestroyOptionsMenu();
                }
            }
        }
        this.f597 = arrayList;
        return z;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m660() {
        Iterator it = this.f612.m593().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = (AbstractComponentCallbacksC0100) it.next();
            if (abstractComponentCallbacksC0100 != null) {
                abstractComponentCallbacksC0100.onHiddenChanged(abstractComponentCallbacksC0100.isHidden());
                abstractComponentCallbacksC0100.mChildFragmentManager.m660();
            }
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m661(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "detach: " + abstractComponentCallbacksC0100;
        }
        if (abstractComponentCallbacksC0100.mDetached) {
            return;
        }
        abstractComponentCallbacksC0100.mDetached = true;
        if (abstractComponentCallbacksC0100.mAdded) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str2 = "remove from detach: " + abstractComponentCallbacksC0100;
            }
            C0090 c0090 = this.f612;
            synchronized (c0090.f547) {
                c0090.f547.remove(abstractComponentCallbacksC0100);
            }
            abstractComponentCallbacksC0100.mAdded = false;
            if (m630(abstractComponentCallbacksC0100)) {
                this.f627 = true;
            }
            m669(abstractComponentCallbacksC0100);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m662(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "attach: " + abstractComponentCallbacksC0100;
        }
        if (abstractComponentCallbacksC0100.mDetached) {
            abstractComponentCallbacksC0100.mDetached = false;
            if (abstractComponentCallbacksC0100.mAdded) {
                return;
            }
            this.f612.m596(abstractComponentCallbacksC0100);
            if (Log.isLoggable("FragmentManager", 2)) {
                String str2 = "add from attach: " + abstractComponentCallbacksC0100;
            }
            if (m630(abstractComponentCallbacksC0100)) {
                this.f627 = true;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ʿ.ˏᵢ, ᵎˈ.ـﹶ] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ʿ.ˏᵢ, ᵎˈ.ـﹶ] */
    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final void m663() {
        synchronized (this.f618) {
            try {
                if (!this.f618.isEmpty()) {
                    C0118 c0118 = this.f633;
                    c0118.f713 = true;
                    ?? r2 = c0118.f712;
                    if (r2 != 0) {
                        r2.mo1053();
                    }
                    if (Log.isLoggable("FragmentManager", 3)) {
                        String str = "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions";
                    }
                    return;
                }
                boolean z = m650() > 0 && m633(this.f616);
                if (Log.isLoggable("FragmentManager", 3)) {
                    String str2 = "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z;
                }
                C0118 c01182 = this.f633;
                c01182.f713 = z;
                ?? r0 = c01182.f712;
                if (r0 != 0) {
                    r0.mo1053();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m664(MenuItem menuItem) {
        if (this.f605 < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 : this.f612.m597()) {
            if (abstractComponentCallbacksC0100 != null && abstractComponentCallbacksC0100.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final boolean m665() {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f616;
        if (abstractComponentCallbacksC0100 == null) {
            return true;
        }
        return abstractComponentCallbacksC0100.isAdded() && this.f616.getParentFragmentManager().m665();
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m666(InterfaceC3418 interfaceC3418, boolean z) {
        if (!z) {
            if (this.f635 == null) {
                if (!this.f617) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (m657()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f618) {
            try {
                if (this.f635 == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f618.add(interfaceC3418);
                    m667();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public final void m667() {
        synchronized (this.f618) {
            try {
                if (this.f618.size() == 1) {
                    this.f635.f13386.removeCallbacks(this.f628);
                    this.f635.f13386.post(this.f628);
                    m663();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final ViewGroup m668(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        ViewGroup viewGroup = abstractComponentCallbacksC0100.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0100.mContainerId > 0 && this.f634.mo606()) {
            View viewMo605 = this.f634.mo605(abstractComponentCallbacksC0100.mContainerId);
            if (viewMo605 instanceof ViewGroup) {
                return (ViewGroup) viewMo605;
            }
        }
        return null;
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m669(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        ViewGroup viewGroupM668 = m668(abstractComponentCallbacksC0100);
        if (viewGroupM668 != null) {
            if (abstractComponentCallbacksC0100.getPopExitAnim() + abstractComponentCallbacksC0100.getPopEnterAnim() + abstractComponentCallbacksC0100.getExitAnim() + abstractComponentCallbacksC0100.getEnterAnim() > 0) {
                if (viewGroupM668.getTag(R.id._2_res_0x7f0b0425) == null) {
                    viewGroupM668.setTag(R.id._2_res_0x7f0b0425, abstractComponentCallbacksC0100);
                }
                ((AbstractComponentCallbacksC0100) viewGroupM668.getTag(R.id._2_res_0x7f0b0425)).setPopDirection(abstractComponentCallbacksC0100.getPopDirection());
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0109 m670(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        String str = abstractComponentCallbacksC0100.mPreviousWho;
        if (str != null) {
            AbstractC3490.m8380(abstractComponentCallbacksC0100, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            String str2 = "add: " + abstractComponentCallbacksC0100;
        }
        C0109 c0109M674 = m674(abstractComponentCallbacksC0100);
        abstractComponentCallbacksC0100.mFragmentManager = this;
        C0090 c0090 = this.f612;
        c0090.m598(c0109M674);
        if (!abstractComponentCallbacksC0100.mDetached) {
            c0090.m596(abstractComponentCallbacksC0100);
            abstractComponentCallbacksC0100.mRemoving = false;
            if (abstractComponentCallbacksC0100.mView == null) {
                abstractComponentCallbacksC0100.mHiddenChanged = false;
            }
            if (m630(abstractComponentCallbacksC0100)) {
                this.f627 = true;
            }
        }
        return c0109M674;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final HashSet m671(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        C0101 c0101;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((C0105) arrayList.get(i)).f648.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = ((C3414) it.next()).f13278;
                if (abstractComponentCallbacksC0100 != null && (viewGroup = abstractComponentCallbacksC0100.mContainer) != null) {
                    m695();
                    Object tag = viewGroup.getTag(R.id._2_res_0x7f0b0358);
                    if (tag instanceof C0101) {
                        c0101 = (C0101) tag;
                    } else {
                        c0101 = new C0101(viewGroup);
                        viewGroup.setTag(R.id._2_res_0x7f0b0358, c0101);
                    }
                    hashSet.add(c0101);
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final void m672(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, EnumC0230 enumC0230) {
        if (abstractComponentCallbacksC0100.equals(this.f612.m592(abstractComponentCallbacksC0100.mWho)) && (abstractComponentCallbacksC0100.mHost == null || abstractComponentCallbacksC0100.mFragmentManager == this)) {
            abstractComponentCallbacksC0100.mMaxState = enumC0230;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0100 + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void m673(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        if (abstractComponentCallbacksC0100 != null) {
            if (!abstractComponentCallbacksC0100.equals(this.f612.m592(abstractComponentCallbacksC0100.mWho)) || (abstractComponentCallbacksC0100.mHost != null && abstractComponentCallbacksC0100.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0100 + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = this.f630;
        this.f630 = abstractComponentCallbacksC0100;
        m656(abstractComponentCallbacksC01002);
        m656(this.f630);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C0109 m674(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        String str = abstractComponentCallbacksC0100.mWho;
        C0090 c0090 = this.f612;
        C0109 c0109 = (C0109) c0090.f545.get(str);
        if (c0109 != null) {
            return c0109;
        }
        C0109 c01092 = new C0109(this.f610, c0090, abstractComponentCallbacksC0100);
        c01092.m717(this.f635.f13385.getClassLoader());
        c01092.f676 = this.f605;
        return c01092;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final AbstractComponentCallbacksC0100 m675(String str) {
        C0090 c0090 = this.f612;
        if (str != null) {
            ArrayList arrayList = c0090.f547;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = (AbstractComponentCallbacksC0100) arrayList.get(size);
                if (abstractComponentCallbacksC0100 != null && str.equals(abstractComponentCallbacksC0100.mTag)) {
                    return abstractComponentCallbacksC0100;
                }
            }
        }
        if (str != null) {
            for (C0109 c0109 : c0090.f545.values()) {
                if (c0109 != null) {
                    AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = c0109.f677;
                    if (str.equals(abstractComponentCallbacksC01002.mTag)) {
                        return abstractComponentCallbacksC01002;
                    }
                }
            }
        } else {
            c0090.getClass();
        }
        return null;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void m676(C0105 c0105, boolean z) {
        if (z && (this.f635 == null || this.f617)) {
            return;
        }
        m688(z);
        c0105.mo703(this.f636, this.f596);
        this.f595 = true;
        try {
            m640(this.f636, this.f596);
            m689();
            m663();
            m651();
            this.f612.f545.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            m689();
            throw th;
        }
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C3419 m677() {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f616;
        return abstractComponentCallbacksC0100 != null ? abstractComponentCallbacksC0100.mFragmentManager.m677() : this.f601;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m678(boolean z, boolean z2) {
        if (z2 && (this.f635 instanceof InterfaceC3573)) {
            m658(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 : this.f612.m597()) {
            if (abstractComponentCallbacksC0100 != null) {
                abstractComponentCallbacksC0100.performMultiWindowModeChanged(z);
                if (z2) {
                    abstractComponentCallbacksC0100.mChildFragmentManager.m678(z, true);
                }
            }
        }
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final void m679(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "remove: " + abstractComponentCallbacksC0100 + " nesting=" + abstractComponentCallbacksC0100.mBackStackNesting;
        }
        boolean zIsInBackStack = abstractComponentCallbacksC0100.isInBackStack();
        if (abstractComponentCallbacksC0100.mDetached && zIsInBackStack) {
            return;
        }
        C0090 c0090 = this.f612;
        synchronized (c0090.f547) {
            c0090.f547.remove(abstractComponentCallbacksC0100);
        }
        abstractComponentCallbacksC0100.mAdded = false;
        if (m630(abstractComponentCallbacksC0100)) {
            this.f627 = true;
        }
        abstractComponentCallbacksC0100.mRemoving = true;
        m669(abstractComponentCallbacksC0100);
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public final void m680() {
        Iterator it = this.f612.m599().iterator();
        while (it.hasNext()) {
            C0109 c0109 = (C0109) it.next();
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c0109.f677;
            if (abstractComponentCallbacksC0100.mDeferStart) {
                if (this.f595) {
                    this.f623 = true;
                } else {
                    abstractComponentCallbacksC0100.mDeferStart = false;
                    c0109.m719();
                }
            }
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m681(boolean z, boolean z2) {
        if (z2 && (this.f635 instanceof InterfaceC3562)) {
            m658(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 : this.f612.m597()) {
            if (abstractComponentCallbacksC0100 != null) {
                abstractComponentCallbacksC0100.performPictureInPictureModeChanged(z);
                if (z2) {
                    abstractComponentCallbacksC0100.mChildFragmentManager.m681(z, true);
                }
            }
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m682(Menu menu) {
        if (this.f605 < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 : this.f612.m597()) {
            if (abstractComponentCallbacksC0100 != null) {
                abstractComponentCallbacksC0100.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m683(int i, boolean z, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Bad id: ", i));
        }
        m666(new C3450(this, i, i2), z);
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final void m684() {
        m666(new C3450(this, -1, 0), false);
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m685(int i, boolean z) {
        HashMap map;
        AbstractC3458 abstractC3458;
        if (this.f635 == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f605) {
            this.f605 = i;
            C0090 c0090 = this.f612;
            Iterator it = c0090.f547.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = c0090.f545;
                if (!zHasNext) {
                    break;
                }
                C0109 c0109 = (C0109) map.get(((AbstractComponentCallbacksC0100) it.next()).mWho);
                if (c0109 != null) {
                    c0109.m719();
                }
            }
            for (C0109 c01092 : map.values()) {
                if (c01092 != null) {
                    c01092.m719();
                    AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c01092.f677;
                    if (abstractComponentCallbacksC0100.mRemoving && !abstractComponentCallbacksC0100.isInBackStack()) {
                        if (abstractComponentCallbacksC0100.mBeingSaved && !c0090.f546.containsKey(abstractComponentCallbacksC0100.mWho)) {
                            c0090.m600(abstractComponentCallbacksC0100.mWho, c01092.m726());
                        }
                        c0090.m594(c01092);
                    }
                }
            }
            m680();
            if (this.f627 && (abstractC3458 = this.f635) != null && this.f605 == 7) {
                ((C0111) abstractC3458).f681.invalidateMenu();
                this.f627 = false;
            }
        }
    }

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final Bundle m686() {
        ArrayList arrayList;
        C0087[] c0087Arr;
        Bundle bundle = new Bundle();
        m643();
        m692();
        m644(true);
        this.f632 = true;
        this.f614.f689 = true;
        C0090 c0090 = this.f612;
        c0090.getClass();
        HashMap map = c0090.f545;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (C0109 c0109 : map.values()) {
            if (c0109 != null) {
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c0109.f677;
                c0090.m600(abstractComponentCallbacksC0100.mWho, c0109.m726());
                arrayList2.add(abstractComponentCallbacksC0100.mWho);
                if (Log.isLoggable("FragmentManager", 2)) {
                    String str = "Saved state of " + abstractComponentCallbacksC0100 + ": " + abstractComponentCallbacksC0100.mSavedFragmentState;
                }
            }
        }
        HashMap map2 = this.f612.f546;
        if (!map2.isEmpty()) {
            C0090 c00902 = this.f612;
            synchronized (c00902.f547) {
                try {
                    if (c00902.f547.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(c00902.f547.size());
                        Iterator it = c00902.f547.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = (AbstractComponentCallbacksC0100) it.next();
                            arrayList.add(abstractComponentCallbacksC01002.mWho);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                String str2 = "saveAllState: adding fragment (" + abstractComponentCallbacksC01002.mWho + "): " + abstractComponentCallbacksC01002;
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f631.size();
            if (size > 0) {
                c0087Arr = new C0087[size];
                for (int i = 0; i < size; i++) {
                    c0087Arr[i] = new C0087((C0105) this.f631.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sbM40 = AbstractC0002.m40(i, "saveAllState: adding back stack #", ": ");
                        sbM40.append(this.f631.get(i));
                        sbM40.toString();
                    }
                }
            } else {
                c0087Arr = null;
            }
            C3423 c3423 = new C3423();
            c3423.f13295 = null;
            ArrayList arrayList3 = new ArrayList();
            c3423.f13300 = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            c3423.f13301 = arrayList4;
            c3423.f13299 = arrayList2;
            c3423.f13294 = arrayList;
            c3423.f13297 = c0087Arr;
            c3423.f13298 = this.f602.get();
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC01003 = this.f630;
            if (abstractComponentCallbacksC01003 != null) {
                c3423.f13295 = abstractComponentCallbacksC01003.mWho;
            }
            arrayList3.addAll(this.f609.keySet());
            arrayList4.addAll(this.f609.values());
            c3423.f13296 = new ArrayList(this.f600);
            bundle.putParcelable("state", c3423);
            for (String str3 : this.f603.keySet()) {
                bundle.putBundle(ᵎﹳ.ᐧʻ.ﾞˊ("result_", str3), (Bundle) this.f603.get(str3));
            }
            for (String str4 : map2.keySet()) {
                bundle.putBundle(ᵎﹳ.ᐧʻ.ﾞˊ("fragment_", str4), (Bundle) map2.get(str4));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
        }
        return bundle;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final boolean m687(Menu menu) {
        boolean z = false;
        if (this.f605 < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 : this.f612.m597()) {
            if (abstractComponentCallbacksC0100 != null && abstractComponentCallbacksC0100.isMenuVisible() && abstractComponentCallbacksC0100.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m688(boolean z) {
        if (this.f595) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f635 == null) {
            if (!this.f617) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f635.f13386.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && m657()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f636 == null) {
            this.f636 = new ArrayList();
            this.f596 = new ArrayList();
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m689() {
        this.f595 = false;
        this.f596.clear();
        this.f636.clear();
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C0105 m690(int i) {
        if (i != this.f631.size()) {
            return (C0105) this.f631.get(i);
        }
        C0105 c0105 = this.f611;
        if (c0105 != null) {
            return c0105;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m691(boolean z, Configuration configuration) {
        if (z && (this.f635 instanceof InterfaceC1799)) {
            m658(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 : this.f612.m597()) {
            if (abstractComponentCallbacksC0100 != null) {
                abstractComponentCallbacksC0100.performConfigurationChanged(configuration);
                if (z) {
                    abstractComponentCallbacksC0100.mChildFragmentManager.m691(true, configuration);
                }
            }
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void m692() {
        Iterator it = m639().iterator();
        while (it.hasNext()) {
            ((C0101) it.next()).m628();
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m693(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = ᵎﹳ.ᐧʻ.ˉⁱ(str, "    ");
        C0090 c0090 = this.f612;
        c0090.getClass();
        String str3 = str + "    ";
        HashMap map = c0090.f545;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0109 c0109 : map.values()) {
                printWriter.print(str);
                if (c0109 != null) {
                    AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c0109.f677;
                    printWriter.println(abstractComponentCallbacksC0100);
                    abstractComponentCallbacksC0100.dump(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = c0090.f547;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = (AbstractComponentCallbacksC0100) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC01002.toString());
            }
        }
        ArrayList arrayList2 = this.f597;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC01003 = (AbstractComponentCallbacksC0100) this.f597.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC01003.toString());
            }
        }
        int size3 = this.f631.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                C0105 c0105 = (C0105) this.f631.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0105.toString());
                c0105.m701(str2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f602.get());
        synchronized (this.f618) {
            try {
                int size4 = this.f618.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC3418) this.f618.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f635);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f634);
        if (this.f616 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f616);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f605);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f632);
        printWriter.print(" mStopped=");
        printWriter.print(this.f604);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f617);
        if (this.f627) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f627);
        }
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final boolean m694() {
        return m649(-1, 0);
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final ٴᐧ.ᐧⁱ m695() {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f616;
        return abstractComponentCallbacksC0100 != null ? abstractComponentCallbacksC0100.mFragmentManager.m695() : this.f622;
    }
}
