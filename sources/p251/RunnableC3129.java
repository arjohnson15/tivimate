package p251;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.leanback.widget.C0203;
import androidx.leanback.widget.VerticalGridView;
import ar.tvplayer.tv.ui.MainActivity;
import com.google.android.gms.internal.measurement.AbstractC0522;
import com.google.android.gms.internal.measurement.C0487;
import com.google.android.gms.internal.measurement.InterfaceC0455;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import p007.C0937;
import p013.AbstractC1041;
import p023.AbstractC1148;
import p061.AbstractC1373;
import p065.C1500;
import p065.ExecutorC1522;
import p072.AbstractC1636;
import p150.ExecutorC2314;
import p176.InterfaceC2490;
import p263.C3258;
import p288.C3403;
import p293.C3463;
import p293.C3464;
import p293.C3469;
import p293.C3474;
import p305.C3524;
import p307.AbstractC3556;
import p307.C3575;
import p331.C3768;
import p334.C3789;
import p349.InterfaceC4000;
import p377.ThreadFactoryC4325;
import p381.ExecutorC4440;
import p396.C4559;
import p406.C4660;
import p417.AbstractC4753;
import p417.InterfaceC4759;
import p428.C4925;
import p456.AbstractC5274;
import p456.BinderC5240;
import p456.C5236;
import p456.C5244;
import p456.C5247;
import p456.C5253;
import p456.C5273;
import p456.C5301;
import p456.C5307;
import p456.C5325;
import p456.C5345;
import p456.InterfaceC5281;
import p456.ServiceConnectionC5327;
import ʻˋ.ˋˊ;
import יˏ.ʾˈ;
import יⁱ.ˑⁱ;
import יⁱ.ᵎʾ;
import ـˈ.ٴᵔ;
import ـˈ.ᴵʿ;
import ـˈ.ﹳﹶ;
import ـˏ.ˆᵔ;
import ᵢﹳ.ٴᐧ;
import ⁱـ.ˑי;
import ⁱᵢ.ﹶˆ;
import ﹶᴵ.ʻﹳ;
import ﹶᴵ.ˈﹳ;
import ﹶᴵ.ˋⁱ;
import ﹶᴵ.ᵢʿ;
import ﹶⁱ.ـﹶ;

/* renamed from: יˎ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC3129 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f12078;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f12079;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f12080;

    public /* synthetic */ RunnableC3129() {
        this.f12080 = 29;
    }

    public /* synthetic */ RunnableC3129(int i, Object obj, Object obj2, boolean z) {
        this.f12080 = i;
        this.f12078 = obj;
        this.f12079 = obj2;
    }

    public /* synthetic */ RunnableC3129(Object obj, int i, Object obj2) {
        this.f12080 = i;
        this.f12079 = obj;
        this.f12078 = obj2;
    }

    public RunnableC3129(ExecutorC4440 executorC4440) {
        this.f12080 = 17;
        this.f12079 = executorC4440;
    }

    public RunnableC3129(ServiceConnectionC5327 serviceConnectionC5327, InterfaceC0455 interfaceC0455, ServiceConnectionC5327 serviceConnectionC53272) {
        this.f12080 = 26;
        this.f12078 = interfaceC0455;
        this.f12079 = serviceConnectionC5327;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final void m7676() {
        synchronized (((C3131) this.f12079).f12089) {
            try {
                InterfaceC3128 interfaceC3128 = (InterfaceC3128) ((C3131) this.f12079).f12087;
                if (interfaceC3128 != null) {
                    interfaceC3128.mo7675(((C3130) this.f12078).m7689());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    private final void m7677() {
        synchronized (((C4660) this.f12079).f17789) {
            try {
                Object objApply = ((C4660) this.f12079).f17791.apply(this.f12078);
                C4660 c4660 = (C4660) this.f12079;
                Object obj = c4660.f17790;
                if (obj == null && objApply != null) {
                    c4660.f17790 = objApply;
                    c4660.f17788.m1050(objApply);
                } else if (obj != null && !obj.equals(objApply)) {
                    C4660 c46602 = (C4660) this.f12079;
                    c46602.f17790 = objApply;
                    c46602.f17788.m1050(objApply);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m7678() {
        C3768 c3768M10650 = ((C3258) this.f12079).f12714.f18124.m10650((String) this.f12078);
        if (c3768M10650 == null || !c3768M10650.m8817()) {
            return;
        }
        synchronized (((C3258) this.f12079).f12711) {
            ((C3258) this.f12079).f12715.put(ـﹶ.ˋˊ(c3768M10650), c3768M10650);
            C3258 c3258 = (C3258) this.f12079;
            ((C3258) this.f12079).f12716.put(ـﹶ.ˋˊ(c3768M10650), AbstractC1148.m4175(c3258.f12710, c3768M10650, (AbstractC1636) c3258.f12708.ˆʿ, c3258));
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m7679() {
        synchronized (((C3131) this.f12079).f12089) {
            try {
                InterfaceC3137 interfaceC3137 = (InterfaceC3137) ((C3131) this.f12079).f12087;
                if (interfaceC3137 != null) {
                    Exception excM7684 = ((C3130) this.f12078).m7684();
                    AbstractC4753.m10683(excM7684);
                    interfaceC3137.mo7698(excM7684);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    private final void m7680() {
        try {
            ((Runnable) this.f12079).run();
            synchronized (((ExecutorC1522) this.f12078).f6185) {
                ((ExecutorC1522) this.f12078).m5103();
            }
        } catch (Throwable th) {
            synchronized (((ExecutorC1522) this.f12078).f6185) {
                ((ExecutorC1522) this.f12078).m5103();
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(47:16|(1:18)(54:20|381|21|22|(1:25)(50:27|(1:29)|379|30|(7:32|(1:34)(1:36)|377|37|371|38|39)|41|44|(1:49)(1:48)|50|51|(1:63)(1:64)|65|(1:67)|375|68|(1:70)(1:71)|72|(6:74|76|(1:78)(1:79)|80|(4:82|(1:84)(1:85)|86|(2:88|90)(3:373|89|90))|(3:94|(1:96)(1:97)|98))(7:385|75|76|(0)(0)|80|(0)|(0))|99|101|(1:103)(30:105|(0)(1:108)|(1:110)(3:387|111|(2:113|110)(1:114))|(1:128)(2:119|(1:121)(4:122|(3:125|(1:393)(1:394)|123)|392|128))|(1:130)(1:131)|132|(2:134|(1:136)(1:137))(1:138)|139|(1:141)|142|(2:144|(3:146|(1:148)(2:149|(1:151)(1:152))|153))|154|(5:156|(3:159|161|(1:163))(1:160)|164|(2:176|(0)(2:183|(0)))(1:175)|214)(2:186|(1:191)(3:192|(2:204|(0)(2:211|(0)))(1:203)|214))|(1:216)(1:217)|218|(4:220|(1:222)|223|(2:233|(4:239|(2:246|(2:247|(1:389)(2:249|(2:390|251)(1:391))))|252|(1:261))(1:238))(1:227))(2:228|(0)(1:232))|262|(1:264)(1:265)|(3:267|(1:269)|270)|271|(1:273)|274|(1:278)|279|(2:281|(7:283|(1:285)|286|(1:288)|289|(4:293|(1:295)|296|(1:298))|299)(1:301))(6:302|(16:304|(3:308|(5:310|(1:312)(1:313)|314|(1:316)|317)|318)(1:307)|319|(1:321)|322|383|323|324|(2:327|(1:329))|330|(2:332|(1:335))|336|(1:338)(1:339)|(3:341|(1:346)(1:345)|(1:348))(1:349)|(1:351)|352)(0)|353|(3:355|(1:357)|(1:359))|360|361)|300|353|(0)|360|361)|104|(0)(0)|(0)(0)|(0)(0)|132|(0)(0)|139|(0)|142|(0)|154|(0)(0)|(0)(0)|218|(0)(0)|262|(0)(0)|(0)|271|(0)|274|(2:276|278)|279|(0)(0)|300|353|(0)|360|361)|26|379|30|(0)|41|44|(2:46|49)(0)|50|51|(0)(0)|65|(0)|375|68|(0)(0)|72|(0)(0)|99|101|(0)(0)|104|(0)(0)|(0)(0)|(0)(0)|132|(0)(0)|139|(0)|142|(0)|154|(0)(0)|(0)(0)|218|(0)(0)|262|(0)(0)|(0)|271|(0)|274|(0)|279|(0)(0)|300|353|(0)|360|361)|19|44|(0)(0)|50|51|(0)(0)|65|(0)|375|68|(0)(0)|72|(0)(0)|99|101|(0)(0)|104|(0)(0)|(0)(0)|(0)(0)|132|(0)(0)|139|(0)|142|(0)|154|(0)(0)|(0)(0)|218|(0)(0)|262|(0)(0)|(0)|271|(0)|274|(0)|279|(0)(0)|300|353|(0)|360|361) */
    /* JADX WARN: Can't wrap try/catch for region: R(54:20|381|21|22|(1:25)(50:27|(1:29)|379|30|(7:32|(1:34)(1:36)|377|37|371|38|39)|41|44|(1:49)(1:48)|50|51|(1:63)(1:64)|65|(1:67)|375|68|(1:70)(1:71)|72|(6:74|76|(1:78)(1:79)|80|(4:82|(1:84)(1:85)|86|(2:88|90)(3:373|89|90))|(3:94|(1:96)(1:97)|98))(7:385|75|76|(0)(0)|80|(0)|(0))|99|101|(1:103)(30:105|(0)(1:108)|(1:110)(3:387|111|(2:113|110)(1:114))|(1:128)(2:119|(1:121)(4:122|(3:125|(1:393)(1:394)|123)|392|128))|(1:130)(1:131)|132|(2:134|(1:136)(1:137))(1:138)|139|(1:141)|142|(2:144|(3:146|(1:148)(2:149|(1:151)(1:152))|153))|154|(5:156|(3:159|161|(1:163))(1:160)|164|(2:176|(0)(2:183|(0)))(1:175)|214)(2:186|(1:191)(3:192|(2:204|(0)(2:211|(0)))(1:203)|214))|(1:216)(1:217)|218|(4:220|(1:222)|223|(2:233|(4:239|(2:246|(2:247|(1:389)(2:249|(2:390|251)(1:391))))|252|(1:261))(1:238))(1:227))(2:228|(0)(1:232))|262|(1:264)(1:265)|(3:267|(1:269)|270)|271|(1:273)|274|(1:278)|279|(2:281|(7:283|(1:285)|286|(1:288)|289|(4:293|(1:295)|296|(1:298))|299)(1:301))(6:302|(16:304|(3:308|(5:310|(1:312)(1:313)|314|(1:316)|317)|318)(1:307)|319|(1:321)|322|383|323|324|(2:327|(1:329))|330|(2:332|(1:335))|336|(1:338)(1:339)|(3:341|(1:346)(1:345)|(1:348))(1:349)|(1:351)|352)(0)|353|(3:355|(1:357)|(1:359))|360|361)|300|353|(0)|360|361)|104|(0)(0)|(0)(0)|(0)(0)|132|(0)(0)|139|(0)|142|(0)|154|(0)(0)|(0)(0)|218|(0)(0)|262|(0)(0)|(0)|271|(0)|274|(2:276|278)|279|(0)(0)|300|353|(0)|360|361)|26|379|30|(0)|41|44|(2:46|49)(0)|50|51|(0)(0)|65|(0)|375|68|(0)(0)|72|(0)(0)|99|101|(0)(0)|104|(0)(0)|(0)(0)|(0)(0)|132|(0)(0)|139|(0)|142|(0)|154|(0)(0)|(0)(0)|218|(0)(0)|262|(0)(0)|(0)|271|(0)|274|(0)|279|(0)(0)|300|353|(0)|360|361) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c1, code lost:
    
        r8.ˏᵢ().f20571.m4529(p456.C5301.m11911(r9), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0174, code lost:
    
        r11 = "Unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02a1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014c A[Catch: NameNotFoundException -> 0x0174, TryCatch #4 {NameNotFoundException -> 0x0174, blocks: (B:30:0x0141, B:32:0x014c, B:34:0x0158), top: B:379:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x026f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0303 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0263 A[Catch: IllegalStateException -> 0x02a1, TryCatch #2 {IllegalStateException -> 0x02a1, blocks: (B:68:0x0255, B:72:0x0267, B:76:0x0273, B:80:0x027b, B:82:0x0283, B:86:0x0292, B:90:0x029e, B:89:0x029a, B:85:0x028e, B:94:0x02a5, B:96:0x02b7, B:98:0x02bc, B:97:0x02ba, B:75:0x026f, B:71:0x0263), top: B:375:0x0255 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0283 A[Catch: IllegalStateException -> 0x02a1, TryCatch #2 {IllegalStateException -> 0x02a1, blocks: (B:68:0x0255, B:72:0x0267, B:76:0x0273, B:80:0x027b, B:82:0x0283, B:86:0x0292, B:90:0x029e, B:89:0x029a, B:85:0x028e, B:94:0x02a5, B:96:0x02b7, B:98:0x02bc, B:97:0x02ba, B:75:0x026f, B:71:0x0263), top: B:375:0x0255 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a5 A[Catch: IllegalStateException -> 0x02a1, TryCatch #2 {IllegalStateException -> 0x02a1, blocks: (B:68:0x0255, B:72:0x0267, B:76:0x0273, B:80:0x027b, B:82:0x0283, B:86:0x0292, B:90:0x029e, B:89:0x029a, B:85:0x028e, B:94:0x02a5, B:96:0x02b7, B:98:0x02bc, B:97:0x02ba, B:75:0x026f, B:71:0x0263), top: B:375:0x0255 }] */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m7681() throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 2560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p251.RunnableC3129.m7681():void");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private final void m7682() {
        try {
            m7683();
        } catch (Error e) {
            synchronized (((ExecutorC4440) this.f12079).f17113) {
                ((ExecutorC4440) this.f12079).f17115 = 1;
                throw e;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException {
        InterfaceC4759 interfaceC4759;
        ˈﹳ r2;
        AbstractC1373 adapter;
        AbstractC1373 adapter2;
        switch (this.f12080) {
            case 0:
                if (((C3130) this.f12078).f12086) {
                    ((C3130) ((C3131) this.f12079).f12087).m7694();
                    return;
                }
                try {
                    ((C3130) ((C3131) this.f12079).f12087).m7688(((InterfaceC3134) ((C3131) this.f12079).f12089).mo7700((C3130) this.f12078));
                    return;
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        ((C3130) ((C3131) this.f12079).f12087).m7692((Exception) e.getCause());
                        return;
                    } else {
                        ((C3130) ((C3131) this.f12079).f12087).m7692(e);
                        return;
                    }
                } catch (Exception e2) {
                    ((C3130) ((C3131) this.f12079).f12087).m7692(e2);
                    return;
                }
            case 1:
                synchronized (((C3131) this.f12079).f12089) {
                    ((InterfaceC3133) ((C3131) this.f12079).f12087).mo7068((C3130) this.f12078);
                }
                return;
            case 2:
                m7679();
                return;
            case 3:
                m7676();
                return;
            case 4:
                C3131 c3131 = (C3131) this.f12079;
                try {
                    C3130 c3130Mo7701 = ((InterfaceC3135) c3131.f12089).mo7701(((C3130) this.f12078).m7689());
                    ExecutorC2314 executorC2314 = AbstractC3132.f12091;
                    C3131 c31312 = new C3131(executorC2314, (InterfaceC3128) c3131);
                    ˋˊ r4 = c3130Mo7701.f12081;
                    r4.ᴵʿ(c31312);
                    c3130Mo7701.m7687();
                    r4.ᴵʿ(new C3131(executorC2314, (InterfaceC3137) c3131));
                    c3130Mo7701.m7687();
                    r4.ᴵʿ(new C3131(executorC2314, (InterfaceC3127) c3131));
                    c3130Mo7701.m7687();
                    return;
                } catch (RuntimeExecutionException e3) {
                    if (e3.getCause() instanceof Exception) {
                        c3131.mo7698((Exception) e3.getCause());
                        return;
                    } else {
                        c3131.mo7698(e3);
                        return;
                    }
                } catch (CancellationException unused) {
                    c3131.mo7674();
                    return;
                } catch (Exception e4) {
                    c3131.mo7698(e4);
                    return;
                }
            case 5:
                C3130 c3130 = (C3130) this.f12078;
                try {
                    c3130.m7688(((Callable) this.f12079).call());
                    return;
                } catch (Exception e5) {
                    c3130.m7692(e5);
                    return;
                } catch (Throwable th) {
                    c3130.m7692(new RuntimeException(th));
                    return;
                }
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                if (((ᵎʾ) this.f12078).getView() != null) {
                    InterfaceC2490[] interfaceC2490Arr = ᵎʾ.ʻﹳ;
                    ʾˈ.ٴᐧ(((ᵎʾ) this.f12079).ᵢﹶ().ˏᵢ, ˑⁱ.ˆʿ);
                    return;
                }
                return;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                m7678();
                return;
            case 8:
                if (((ᴵʿ) this.f12078).getView() != null) {
                    ((VerticalGridView) this.f12079).requestFocus();
                    return;
                }
                return;
            case 9:
                if (((AbstractComponentCallbacksC0100) this.f12078).getView() != null) {
                    EditText editText = (EditText) this.f12079;
                    editText.setSelection(editText.getText().length());
                    return;
                }
                return;
            case 10:
                if (((ˆᵔ) this.f12078).getView() != null) {
                    ˆᵔ r0 = (ˆᵔ) this.f12079;
                    r0.m762((C0203) AbstractC1041.m4027(r0.f721));
                    return;
                }
                return;
            case 11:
                if (((ᐧﾞ.ـﹶ) this.f12078).getView() != null) {
                    int i = MainActivity.ˑⁱ;
                    ((MainActivity) this.f12079).ˑﾞ();
                    return;
                }
                return;
            case 12:
                C0937 c0937 = (C0937) this.f12079;
                C3469 c3469 = (C3469) ((C3464) c0937.f4129).f13410.get((C3463) c0937.f4126);
                if (c3469 == null) {
                    return;
                }
                C3524 c3524 = (C3524) this.f12078;
                if (!(c3524.f13645 == 0)) {
                    c3469.m8320(c3524, null);
                    return;
                }
                c0937.f4124 = true;
                InterfaceC4000 interfaceC4000 = (InterfaceC4000) c0937.f4128;
                if (interfaceC4000.m9260()) {
                    if (!c0937.f4124 || (interfaceC4759 = (InterfaceC4759) c0937.f4127) == null) {
                        return;
                    }
                    interfaceC4000.m9256(interfaceC4759, (Set) c0937.f4125);
                    return;
                }
                try {
                    interfaceC4000.m9256(null, interfaceC4000.mo8567());
                    return;
                } catch (SecurityException e6) {
                    interfaceC4000.m9265("Failed to get service from broker.");
                    c3469.m8320(new C3524(10), null);
                    return;
                }
            case 13:
                ((C3575) this.f12078).f13763 = this.f12079;
                return;
            case 14:
                ((Application) this.f12078).unregisterActivityLifecycleCallbacks((C3575) this.f12079);
                return;
            case 15:
                try {
                    Method method = AbstractC3556.f13730;
                    Object obj = this.f12079;
                    Object obj2 = this.f12078;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC3556.f13725.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e7) {
                    if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                        throw e7;
                    }
                    return;
                } catch (Throwable th2) {
                    return;
                }
            case 16:
                ThreadFactoryC4325 threadFactoryC4325 = (ThreadFactoryC4325) this.f12079;
                if (threadFactoryC4325.f16804) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f12078).run();
                    return;
                } catch (Throwable th3) {
                    threadFactoryC4325.f16802.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                m7682();
                return;
            case 18:
                if (((ᵢﹳ.ᵎʾ) this.f12078).getView() == null) {
                    return;
                }
                InterfaceC2490[] interfaceC2490Arr2 = ᵢﹳ.ᵎʾ.ᵔ;
                ᵢﹳ.ᵎʾ r02 = (ᵢﹳ.ᵎʾ) this.f12079;
                VerticalGridView verticalGridView = r02.ᵎˆ().ˑʽ;
                int i2 = 0;
                while (true) {
                    if (!(i2 < verticalGridView.getChildCount())) {
                        return;
                    }
                    int i3 = i2 + 1;
                    View childAt = verticalGridView.getChildAt(i2);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    ٴᐧ r5 = r02.ᵎˆ().ˑʽ.m1331(childAt);
                    ٴᐧ r52 = r5 instanceof ٴᐧ ? r5 : null;
                    if (r52 != null) {
                        r52.ᐧⁱ();
                    }
                    i2 = i3;
                }
            case 19:
                ˑי.ˏᴵ((C4559) this.f12078).mo3974(new C3403((Throwable) this.f12079));
                return;
            case 20:
                if (((ﹶˆ) this.f12078).getView() != null) {
                    ﹶˆ r03 = (ﹶˆ) this.f12079;
                    r03.m762((C0203) AbstractC1041.m4027(r03.f721));
                    return;
                }
                return;
            case 21:
                m7677();
                return;
            case 22:
                m7680();
                return;
            case 23:
                C4925.m11038((C4925) this.f12079, (C1500) this.f12078);
                return;
            case 24:
                if (((ˋⁱ) this.f12078).getView() != null) {
                    InterfaceC2490[] interfaceC2490Arr3 = ˋⁱ.ʿˊ;
                    ˋⁱ r04 = (ˋⁱ) this.f12079;
                    if (r04.getView() != null) {
                        ﹳﹶ r1 = r04.ᵢﹶ();
                        if (r1.getView() != null && (adapter2 = r1.ᵎˆ().ʽᐧ.getAdapter()) != null) {
                            adapter2.m4765();
                        }
                        ᵢʿ r12 = r04.ᵢˆ();
                        if (r12.getView() != null && (adapter = r12.ﹶʾ().ﹳﹳ.getAdapter()) != null) {
                            adapter.m4765();
                        }
                        ʻﹳ r13 = r04.יˊ();
                        if (r13.getView() != null && (r2 = (ˈﹳ) r13.ᵢˆ().ʽᐧ.m1049()) != null) {
                            r13.יˊ(r2.ـﹶ, r2.ʽᐧ);
                            AbstractC1373 adapter3 = r13.ᵔˋ().ﹶˆ.getAdapter();
                            if (adapter3 != null) {
                                adapter3.m4765();
                            }
                            AbstractC1373 adapter4 = r13.ᵔˋ().ˏᵢ.getAdapter();
                            if (adapter4 != null) {
                                adapter4.m4765();
                            }
                        }
                        ٴᵔ r05 = r04.ᵔᵢ();
                        if (r05.getView() != null) {
                            r05.ᵔˋ();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ((InterfaceC5281) this.f12078).mo11661();
                if (C3474.m8337()) {
                    ((InterfaceC5281) this.f12078).mo11648().m11743(this);
                    return;
                }
                boolean z = ((AbstractC5274) this.f12079).f20450 != 0;
                ((AbstractC5274) this.f12079).f20450 = 0L;
                if (z) {
                    ((AbstractC5274) this.f12079).mo11643();
                    return;
                }
                return;
            case 26:
                ServiceConnectionC5327 serviceConnectionC5327 = (ServiceConnectionC5327) this.f12079;
                C5325 c5325 = serviceConnectionC5327.f20657;
                C5236 c5236 = c5325.f20649;
                C5247 c5247 = c5236.f20115;
                C5236.m11647(c5247);
                c5247.m11740();
                InterfaceC0455 interfaceC0455 = (InterfaceC0455) this.f12078;
                C5301 c5301 = c5236.f20110;
                Bundle bundle = new Bundle();
                bundle.putString("package_name", serviceConnectionC5327.f20658);
                try {
                    C0487 c0487 = (C0487) interfaceC0455;
                    Parcel parcelM2287 = c0487.m2287();
                    AbstractC0522.m2385(parcelM2287, bundle);
                    Parcel parcelM2290 = c0487.m2290(parcelM2287, 1);
                    Bundle bundle2 = (Bundle) AbstractC0522.m2386(parcelM2290, Bundle.CREATOR);
                    parcelM2290.recycle();
                    if (bundle2 == null) {
                        C5236.m11647(c5301);
                        c5301.f20571.m4533("Install Referrer Service returned a null response");
                    }
                } catch (Exception e8) {
                    C5236.m11647(c5301);
                    c5301.f20571.m4531(e8.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                C5247 c52472 = c5325.f20649.f20115;
                C5236.m11647(c52472);
                c52472.m11740();
                throw new IllegalStateException("Unexpected call on client side");
            case 27:
                m7681();
                return;
            case 28:
                BinderC5240 binderC5240 = (BinderC5240) this.f12079;
                binderC5240.f20139.m11819();
                C5345 c5345 = (C5345) this.f12078;
                Object objM11869 = c5345.f20728.m11869();
                C5273 c5273 = binderC5240.f20139;
                if (objM11869 == null) {
                    c5273.getClass();
                    String str = c5345.f20731;
                    AbstractC4753.m10683(str);
                    C5253 c5253M11817 = c5273.m11817(str);
                    if (c5253M11817 != null) {
                        c5273.m11836(c5345, c5253M11817);
                        return;
                    }
                    return;
                }
                c5273.getClass();
                String str2 = c5345.f20731;
                AbstractC4753.m10683(str2);
                C5253 c5253M118172 = c5273.m11817(str2);
                if (c5253M118172 != null) {
                    c5273.m11820(c5345, c5253M118172);
                    return;
                }
                return;
            default:
                C5244 c5244 = (C5244) this.f12078;
                c5244.m11846();
                if (Build.VERSION.SDK_INT >= 30) {
                    SparseArray sparseArrayM11854 = c5244.ᐧᴵ().m11854();
                    for (C5307 c5307 : (List) this.f12079) {
                        if (!sparseArrayM11854.contains(c5307.f20587) || ((Long) sparseArrayM11854.get(c5307.f20587)).longValue() < c5307.f20586) {
                            c5244.m11709().add(c5307);
                        }
                    }
                    c5244.m11702();
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f12080) {
            case 17:
                Runnable runnable = (Runnable) this.f12078;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((ExecutorC4440) this.f12079).f17115;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        ((java.lang.Runnable) r10.f12078).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        p381.ExecutorC4440.f17112.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f12078), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        r10.f12078 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m7683() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L2:
            java.lang.Object r2 = r10.f12079     // Catch: java.lang.Throwable -> L5e
            ᵢᵎ.ˉי r2 = (p381.ExecutorC4440) r2     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayDeque r2 = r2.f17113     // Catch: java.lang.Throwable -> L5e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f12079     // Catch: java.lang.Throwable -> L20
            ᵢᵎ.ˉי r0 = (p381.ExecutorC4440) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f17115     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1f:
            return
        L20:
            r0 = move-exception
            goto L83
        L22:
            long r6 = r0.f17116     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f17116 = r6     // Catch: java.lang.Throwable -> L20
            r0.f17115 = r5     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r4 = r10.f12079     // Catch: java.lang.Throwable -> L20
            ᵢᵎ.ˉי r4 = (p381.ExecutorC4440) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f17113     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f12078 = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L4d
            java.lang.Object r0 = r10.f12079     // Catch: java.lang.Throwable -> L20
            ᵢᵎ.ˉי r0 = (p381.ExecutorC4440) r0     // Catch: java.lang.Throwable -> L20
            r0.f17115 = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L4c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4c:
            return
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f12078     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
        L5b:
            r10.f12078 = r2     // Catch: java.lang.Throwable -> L5e
            goto L2
        L5e:
            r0 = move-exception
            goto L85
        L60:
            r0 = move-exception
            goto L80
        L62:
            r3 = move-exception
            java.util.logging.Logger r4 = p381.ExecutorC4440.f17112     // Catch: java.lang.Throwable -> L60
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r6.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = r10.f12078     // Catch: java.lang.Throwable -> L60
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L60
            r6.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
            goto L5b
        L80:
            r10.f12078 = r2     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L83:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L5e
        L85:
            if (r1 == 0) goto L8e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p251.RunnableC3129.m7683():void");
    }
}
