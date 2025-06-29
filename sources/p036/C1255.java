package p036;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.bumptech.glide.C0295;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import p166.C2397;
import p166.C2431;
import p166.C2432;
import p166.C2433;
import p345.AbstractC3925;
import p345.AbstractC3980;
import p345.C3932;
import p345.C3936;
import p374.C4241;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p438.C5076;

/* renamed from: ʼﹶ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1255 extends AbstractC1261 {

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final AbstractC3925 f5150 = new C3936(new C1259(1));

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Context f5151;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C2397 f5152;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C1245 f5153;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C1237 f5154;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f5155;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f5156;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C0295 f5157;

    public C1255(Context context, C1237 c1237) {
        C0295 c0295;
        int i = C1245.f5088;
        C1245 c1245 = new C1245(new C1240(context));
        this.f5156 = new Object();
        this.f5151 = context.getApplicationContext();
        this.f5154 = c1237;
        this.f5153 = c1245;
        this.f5152 = C2397.f9462;
        boolean zM10183 = AbstractC4470.m10183(context);
        this.f5155 = zM10183;
        if (!zM10183 && AbstractC4470.f17202 >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                c0295 = null;
            } else {
                Spatializer spatializer = audioManager.getSpatializer();
                C0295 c02952 = new C0295();
                c02952.f2402 = spatializer;
                c02952.f2404 = spatializer.getImmersiveAudioLevel() != 0;
                c0295 = c02952;
            }
            this.f5157 = c0295;
        }
        boolean z = this.f5153.f5097;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m4476(C2431 c2431, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c2431.f9689)) {
            return 4;
        }
        String strM4478 = m4478(str);
        String strM44782 = m4478(c2431.f9689);
        if (strM44782 == null || strM4478 == null) {
            return (z && strM44782 == null) ? 1 : 0;
        }
        if (strM44782.startsWith(strM4478) || strM4478.startsWith(strM44782)) {
            return 3;
        }
        int i = AbstractC4470.f17202;
        return strM44782.split("-", 2)[0].equals(strM4478.split("-", 2)[0]) ? 2 : 0;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static Pair m4477(int i, C1262 c1262, int[][][] iArr, InterfaceC1249 interfaceC1249, Comparator comparator) {
        RandomAccess randomAccessM9207;
        C1262 c12622 = c1262;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < c12622.f5178) {
            if (i == ((int[]) c12622.f5175)[i2]) {
                C4241 c4241 = ((C4241[]) c12622.f5180)[i2];
                for (int i3 = 0; i3 < c4241.f16466; i3++) {
                    C2433 c2433M9704 = c4241.m9704(i3);
                    C3932 c3932Mo4093 = interfaceC1249.mo4093(i2, c2433M9704, iArr[i2][i3]);
                    int i4 = c2433M9704.f9699;
                    boolean[] zArr = new boolean[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        AbstractC1256 abstractC1256 = (AbstractC1256) c3932Mo4093.get(i5);
                        int iMo4470 = abstractC1256.mo4470();
                        if (!zArr[i5] && iMo4470 != 0) {
                            if (iMo4470 == 1) {
                                randomAccessM9207 = AbstractC3980.m9207(abstractC1256);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC1256);
                                for (int i6 = i5 + 1; i6 < i4; i6++) {
                                    AbstractC1256 abstractC12562 = (AbstractC1256) c3932Mo4093.get(i6);
                                    if (abstractC12562.mo4470() == 2 && abstractC1256.mo4469(abstractC12562)) {
                                        arrayList2.add(abstractC12562);
                                        zArr[i6] = true;
                                    }
                                }
                                randomAccessM9207 = arrayList2;
                            }
                            arrayList.add(randomAccessM9207);
                        }
                    }
                }
            }
            i2++;
            c12622 = c1262;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((AbstractC1256) list.get(i7)).f5159;
        }
        AbstractC1256 abstractC12563 = (AbstractC1256) list.get(0);
        return Pair.create(new C1257(abstractC12563.f5158, iArr2), Integer.valueOf(abstractC12563.f5161));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static String m4478(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m4479(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m4480(C4241 c4241, C1245 c1245, HashMap map) {
        for (int i = 0; i < c4241.f16466; i++) {
            C2432 c2432 = (C2432) c1245.f9533.get(c4241.m9704(i));
            if (c2432 != null) {
                C2433 c2433 = c2432.f9695;
                C2432 c24322 = (C2432) map.get(Integer.valueOf(c2433.f9698));
                if (c24322 == null || (c24322.f9694.isEmpty() && !c2432.f9694.isEmpty())) {
                    map.put(Integer.valueOf(c2433.f9698), c2432);
                }
            }
        }
    }

    @Override // p036.AbstractC1261
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo4481(C2397 c2397) {
        boolean zEquals;
        synchronized (this.f5156) {
            zEquals = this.f5152.equals(c2397);
            this.f5152 = c2397;
        }
        if (zEquals) {
            return;
        }
        m4485();
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m4482(C1245 c1245) {
        boolean zEquals;
        c1245.getClass();
        synchronized (this.f5156) {
            zEquals = this.f5153.equals(c1245);
            this.f5153 = c1245;
        }
        if (zEquals) {
            return;
        }
        if (c1245.f5097 && this.f5151 == null) {
            AbstractC4464.m10144("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        C5076 c5076 = this.f5174;
        if (c5076 != null) {
            c5076.f19262.m10157(10);
        }
    }

    @Override // p036.AbstractC1261
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo4483() {
        C0295 c0295;
        C1254 c1254;
        synchronized (this.f5156) {
            try {
                if (AbstractC4470.f17202 >= 32 && (c0295 = this.f5157) != null && (c1254 = (C1254) c0295.f2405) != null && ((Handler) c0295.f2403) != null) {
                    ((Spatializer) c0295.f2402).removeOnSpatializerStateChangedListener(c1254);
                    ((Handler) c0295.f2403).removeCallbacksAndMessages(null);
                    c0295.f2403 = null;
                    c0295.f2405 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5174 = null;
        this.f5172 = null;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C1245 m4484() {
        C1245 c1245;
        synchronized (this.f5156) {
            c1245 = this.f5153;
        }
        return c1245;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m4485() {
        boolean z;
        C5076 c5076;
        C0295 c0295;
        synchronized (this.f5156) {
            try {
                z = this.f5153.f5097 && !this.f5155 && AbstractC4470.f17202 >= 32 && (c0295 = this.f5157) != null && c0295.f2404;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (c5076 = this.f5174) == null) {
            return;
        }
        c5076.f19262.m10157(10);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m4486() {
        synchronized (this.f5156) {
            this.f5153.getClass();
        }
    }
}
