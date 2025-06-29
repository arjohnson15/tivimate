package p375;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.bumptech.glide.C0295;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.lsposed.hiddenapibypass.library.R;
import p029.C1182;
import p029.C1183;
import p029.RunnableC1181;
import p036.C1259;
import p041.C1281;
import p065.C1500;
import p084.C1714;
import p122.AbstractC1962;
import p122.C1908;
import p122.C1916;
import p122.C1918;
import p122.C1919;
import p122.C1931;
import p122.C1934;
import p122.C1943;
import p122.C1947;
import p122.C1958;
import p122.C1976;
import p123.C1998;
import p135.C2094;
import p136.C2096;
import p166.AbstractC2394;
import p166.C2412;
import p166.InterfaceC2419;
import p183.C2531;
import p222.AbstractC2873;
import p222.C2886;
import p222.C2907;
import p222.C2964;
import p251.C3130;
import p251.C3136;
import p310.C3580;
import p331.C3758;
import p331.C3767;
import p345.AbstractC3980;
import p345.C3930;
import p362.C4125;
import p369.AbstractC4186;
import p369.C4182;
import p369.C4183;
import p369.C4194;
import p369.InterfaceC4189;
import p374.C4290;
import p383.AbstractC4470;
import p418.EnumC4778;
import p418.EnumC4796;
import p421.AbstractC4862;
import p428.C4918;
import p428.C4921;
import p428.C4932;
import p428.C4936;
import p428.C4942;
import p428.C4943;
import p438.C5118;
import ˉˆ.ﹳﹳ;
import ˎˊ.ˏʾ;
import ⁱـ.ˑי;

/* renamed from: ᵢˏ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4305 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f16745;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f16746;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object f16747;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object f16748;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object f16749;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f16750;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static AbstractC1962 m9783(C1976 c1976, C2907 c2907) {
        List listM4569 = ((C1281) c2907.f11259).m4569();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listM4569.size(); i++) {
            AbstractC4186 abstractC4186 = (AbstractC4186) listM4569.get(i);
            abstractC4186.getClass();
            C1947 c1947 = new C1947();
            C4182 c4182 = (C4182) abstractC4186;
            String str = c4182.f16132;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = c4182.f16131;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            c1947.f7427 = new C1919(str2, str);
            String str3 = c4182.f16133;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            c1947.f7424 = str3;
            String str4 = c4182.f16135;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            c1947.f7426 = str4;
            c1947.f7428 = c4182.f16134;
            c1947.f7425 = (byte) (c1947.f7425 | 1);
            arrayList.add(c1947.m5639());
        }
        if (arrayList.isEmpty()) {
            return c1976;
        }
        C1943 c1943M5644 = c1976.m5644();
        c1943M5644.f7407 = new C1908(arrayList);
        return c1943M5644.m5638();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C4305 m9784(Context context, C4942 c4942, ﹳﹳ r9, C4932 c4932, C4183 c4183, C2907 c2907, C3758 c3758, C1500 c1500, C3767 c3767, C4921 c4921) {
        C4936 c4936 = new C4936(context, c4942, c4932, c3758, c1500);
        C2096 c2096 = new C2096(r9, c1500, c4921);
        C3580 c3580 = C1182.f4886;
        C1998.m5647(context);
        C1182 c1182 = new C1182(new C1183(C1998.m5648().m5649(new C2094(C1182.f4888, C1182.f4889)).m5652("FIREBASE_CRASHLYTICS_REPORT", new C2531("json"), C1182.f4887), c1500.m5065(), c3767));
        C4305 c4305 = new C4305();
        c4305.f16748 = c4936;
        c4305.f16745 = c2096;
        c4305.f16747 = c1182;
        c4305.f16750 = c4183;
        c4305.f16746 = c2907;
        c4305.f16749 = c4942;
        return c4305;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static List m9785(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new C1916(str, str2));
        }
        Collections.sort(arrayList, new C1259(21));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static boolean m9786(C4290 c4290, Object obj, boolean z, int i, int i2, int i3) {
        if (!c4290.f16693.equals(obj)) {
            return false;
        }
        int i4 = c4290.f16690;
        return (z && i4 == i && c4290.f16692 == i2) || (!z && i4 == -1 && c4290.f16691 == i3);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static C4290 m9787(InterfaceC2419 interfaceC2419, AbstractC3980 abstractC3980, C4290 c4290, C2412 c2412) {
        C5118 c5118 = (C5118) interfaceC2419;
        AbstractC2394 abstractC2394M11369 = c5118.m11369();
        int iM11377 = c5118.m11377();
        Object objMo6472 = abstractC2394M11369.m6477() ? null : abstractC2394M11369.mo6472(iM11377);
        int iM6499 = (c5118.m11356() || abstractC2394M11369.m6477()) ? -1 : abstractC2394M11369.mo6180(iM11377, c2412, false).m6499(AbstractC4470.m10206(c5118.m11360()) - c2412.f9575);
        for (int i = 0; i < abstractC3980.size(); i++) {
            C4290 c42902 = (C4290) abstractC3980.get(i);
            if (m9786(c42902, objMo6472, c5118.m11356(), c5118.m11382(), c5118.m11383(), iM6499)) {
                return c42902;
            }
        }
        if (abstractC3980.isEmpty() && c4290 != null) {
            if (m9786(c4290, objMo6472, c5118.m11356(), c5118.m11382(), c5118.m11383(), iM6499)) {
                return c4290;
            }
        }
        return null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1976 m9788(C1976 c1976, C4183 c4183, C2907 c2907) {
        C1943 c1943M5644 = c1976.m5644();
        String strMo9596 = ((InterfaceC4189) c4183.f16137).mo9596();
        if (strMo9596 != null) {
            c1943M5644.f7404 = new C1931(strMo9596);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        List listM9785 = m9785(((C4194) ((AtomicMarkableReference) ((C0295) c2907.f11261).f2402).getReference()).m9623());
        List listM97852 = m9785(((C4194) ((AtomicMarkableReference) ((C0295) c2907.f11256).f2402).getReference()).m9623());
        if (!listM9785.isEmpty() || !listM97852.isEmpty()) {
            C1934 c1934 = c1976.f7537;
            c1943M5644.f7405 = new C1934(c1934.f7367, listM9785, listM97852, c1934.f7370, c1934.f7365, c1934.f7368, c1934.f7369);
        }
        return c1943M5644.m5638();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C4305 m9789(String str, AbstractC0748 abstractC0748, EnumC4796 enumC4796, EnumC4778 enumC4778, Integer num) throws GeneralSecurityException {
        if (enumC4778 == EnumC4778.f18315) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        C4305 c4305 = new C4305();
        c4305.f16748 = str;
        c4305.f16745 = AbstractC4315.m9802(str);
        c4305.f16747 = abstractC0748;
        c4305.f16750 = enumC4796;
        c4305.f16746 = enumC4778;
        c4305.f16749 = num;
        return c4305;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static ColorStateList m9790(Context context, int i) {
        int iM7186 = AbstractC2873.m7186(context, R.attr._2_res_0x7f040133);
        return new ColorStateList(new int[][]{AbstractC2873.f11132, AbstractC2873.f11138, AbstractC2873.f11134, AbstractC2873.f11136}, new int[]{AbstractC2873.m7185(context, R.attr._2_res_0x7f04012e), AbstractC4862.m10939(iM7186, i), AbstractC4862.m10939(iM7186, i), i});
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m9791(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(C2964.m7338(i, C2964.f11435));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static boolean m9792(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static LayerDrawable m9793(C2886 c2886, Context context, int i) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM7221 = c2886.m7221(context, R.drawable._2_res_0x7f080070);
        Drawable drawableM72212 = c2886.m7221(context, R.drawable._2_res_0x7f080071);
        if ((drawableM7221 instanceof BitmapDrawable) && drawableM7221.getIntrinsicWidth() == dimensionPixelSize && drawableM7221.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM7221;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM7221.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM7221.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM72212 instanceof BitmapDrawable) && drawableM72212.getIntrinsicWidth() == dimensionPixelSize && drawableM72212.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM72212;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM72212.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM72212.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C3130 m9794(ExecutorService executorService, String str) {
        C3136 c3136;
        ArrayList arrayListM5946 = ((C2096) this.f16745).m5946();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM5946.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                C3580 c3580 = C2096.f8289;
                String strM5943 = C2096.m5943(file);
                c3580.getClass();
                arrayList.add(new C4918(C3580.m8481(strM5943), file.getName(), file));
            } catch (IOException e) {
                String str2 = "Could not load report file " + file + "; deleting";
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C4918 c4918 = (C4918) it2.next();
            if (str == null || str.equals(c4918.f18593)) {
                C1182 c1182 = (C1182) this.f16747;
                C1958 c1958 = c4918.f18595;
                boolean z = true;
                if (c1958.f7477 == null || c1958.f7478 == null) {
                    C4943 c4943M11066 = ((C4942) this.f16749).m11066(true);
                    C1918 c1918M5642 = c4918.f18595.m5642();
                    c1918M5642.f7274 = c4943M11066.f18701;
                    C1918 c1918M56422 = c1918M5642.m5634().m5642();
                    c1918M56422.f7282 = c4943M11066.f18700;
                    c4918 = new C4918(c1918M56422.m5634(), c4918.f18593, c4918.f18594);
                }
                boolean z2 = str != null;
                C1183 c1183 = c1182.f4890;
                synchronized (c1183.f4898) {
                    try {
                        c3136 = new C3136();
                        if (z2) {
                            ((AtomicInteger) c1183.f4901.f14557).getAndIncrement();
                            if (c1183.f4898.size() >= c1183.f4892) {
                                z = false;
                            }
                            if (z) {
                                C1714 c1714 = C1714.f6685;
                                c1714.m5437("Enqueueing report: " + c4918.f18593);
                                c1714.m5437("Queue size: " + c1183.f4898.size());
                                c1183.f4899.execute(new RunnableC1181(c1183, c4918, c3136, 0));
                                c1714.m5437("Closing task for report: " + c4918.f18593);
                                c3136.m7702(c4918);
                            } else {
                                c1183.m4237();
                                String str3 = "Dropping report due to queue being full: " + c4918.f18593;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                }
                                ((AtomicInteger) c1183.f4901.f14558).getAndIncrement();
                                c3136.m7702(c4918);
                            }
                        } else {
                            c1183.m4236(c4918, c3136);
                        }
                    } finally {
                    }
                }
                arrayList2.add(c3136.f12093.m7690(executorService, new C4125(9, this)));
            }
        }
        return ˏʾ.ˎᵔ(arrayList2);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public ColorStateList m9795(Context context, int i) {
        if (i == R.drawable._2_res_0x7f080045) {
            return com.bumptech.glide.ﹳﹳ.ˑי(context, R.color._2_res_0x7f060015);
        }
        if (i == R.drawable._2_res_0x7f080073) {
            return com.bumptech.glide.ﹳﹳ.ˑי(context, R.color._2_res_0x7f060018);
        }
        if (i != R.drawable._2_res_0x7f080072) {
            if (i == R.drawable._2_res_0x7f080039) {
                return m9790(context, AbstractC2873.m7186(context, R.attr._2_res_0x7f04012e));
            }
            if (i == R.drawable._2_res_0x7f080033) {
                return m9790(context, 0);
            }
            if (i == R.drawable._2_res_0x7f080038) {
                return m9790(context, AbstractC2873.m7186(context, R.attr._2_res_0x7f040127));
            }
            if (i == R.drawable._2_res_0x7f08006e || i == R.drawable._2_res_0x7f08006f) {
                return com.bumptech.glide.ﹳﹳ.ˑי(context, R.color._2_res_0x7f060017);
            }
            if (m9792((int[]) this.f16745, i)) {
                return AbstractC2873.m7188(context, R.attr._2_res_0x7f040134);
            }
            if (m9792((int[]) this.f16746, i)) {
                return com.bumptech.glide.ﹳﹳ.ˑי(context, R.color._2_res_0x7f060014);
            }
            if (m9792((int[]) this.f16749, i)) {
                return com.bumptech.glide.ﹳﹳ.ˑי(context, R.color._2_res_0x7f060013);
            }
            if (i == R.drawable._2_res_0x7f08006b) {
                return com.bumptech.glide.ﹳﹳ.ˑי(context, R.color._2_res_0x7f060016);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM7188 = AbstractC2873.m7188(context, R.attr._2_res_0x7f040173);
        if (colorStateListM7188 == null || !colorStateListM7188.isStateful()) {
            iArr[0] = AbstractC2873.f11132;
            iArr2[0] = AbstractC2873.m7185(context, R.attr._2_res_0x7f040173);
            iArr[1] = AbstractC2873.f11133;
            iArr2[1] = AbstractC2873.m7186(context, R.attr._2_res_0x7f040132);
            iArr[2] = AbstractC2873.f11136;
            iArr2[2] = AbstractC2873.m7186(context, R.attr._2_res_0x7f040173);
        } else {
            int[] iArr3 = AbstractC2873.f11132;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM7188.getColorForState(iArr3, 0);
            iArr[1] = AbstractC2873.f11133;
            iArr2[1] = AbstractC2873.m7186(context, R.attr._2_res_0x7f040132);
            iArr[2] = AbstractC2873.f11136;
            iArr2[2] = colorStateListM7188.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void m9796(AbstractC2394 abstractC2394) {
        ᐧʻ r0 = new ᐧʻ(4);
        if (((AbstractC3980) this.f16745).isEmpty()) {
            m9797(r0, (C4290) this.f16746, abstractC2394);
            if (!ˑי.ﹶˆ((C4290) this.f16749, (C4290) this.f16746)) {
                m9797(r0, (C4290) this.f16749, abstractC2394);
            }
            if (!ˑי.ﹶˆ((C4290) this.f16750, (C4290) this.f16746) && !ˑי.ﹶˆ((C4290) this.f16750, (C4290) this.f16749)) {
                m9797(r0, (C4290) this.f16750, abstractC2394);
            }
        } else {
            for (int i = 0; i < ((AbstractC3980) this.f16745).size(); i++) {
                m9797(r0, (C4290) ((AbstractC3980) this.f16745).get(i), abstractC2394);
            }
            if (!((AbstractC3980) this.f16745).contains((C4290) this.f16750)) {
                m9797(r0, (C4290) this.f16750, abstractC2394);
            }
        }
        this.f16747 = r0.ﹳﹳ();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m9797(ᐧʻ r3, C4290 c4290, AbstractC2394 abstractC2394) {
        if (c4290 == null) {
            return;
        }
        if (abstractC2394.mo6469(c4290.f16693) != -1) {
            r3.ﾞˊ(c4290, abstractC2394);
            return;
        }
        AbstractC2394 abstractC23942 = (AbstractC2394) ((C3930) this.f16747).get(c4290);
        if (abstractC23942 != null) {
            r3.ﾞˊ(c4290, abstractC23942);
        }
    }
}
