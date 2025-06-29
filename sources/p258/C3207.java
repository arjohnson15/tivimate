package p258;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.leanback.widget.C0137;
import java.util.ArrayList;
import java.util.List;
import p112.C1808;
import p153.C2324;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p362.C4125;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import p383.InterfaceC4462;
import p397.C4598;
import p397.C4601;
import p397.InterfaceC4599;
import p397.InterfaceC4602;
import ᵎﹳ.ᐧʻ;

/* renamed from: יᵔ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3207 implements InterfaceC4602 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final byte[] f12487 = {0, 7, 8, 15};

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final byte[] f12488 = {0, 119, -120, -1};

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final byte[] f12489 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Paint f12490;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C3209 f12491;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Canvas f12492;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3205 f12493;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Paint f12494;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3211 f12495;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public Bitmap f12496;

    public C3207(List list) {
        C4457 c4457 = new C4457((byte[]) list.get(0));
        int iM10100 = c4457.m10100();
        int iM101002 = c4457.m10100();
        Paint paint = new Paint();
        this.f12494 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f12490 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f12492 = new Canvas();
        this.f12493 = new C3205(719, 575, 0, 719, 0, 575);
        this.f12491 = new C3209(0, new int[]{0, -1, -16777216, -8421505}, m7912(), m7909());
        this.f12495 = new C3211(iM10100, iM101002);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static byte[] m7908(int i, int i2, C2324 c2324) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c2324.m6410(i2);
        }
        return bArr;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int[] m7909() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m7913(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m7913(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m7913(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m7913(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m7913(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static C3209 m7910(C2324 c2324, int i) {
        int iM6410;
        int i2;
        int iM64102;
        int iM64103;
        int iM64104;
        int i3 = 8;
        int iM64105 = c2324.m6410(8);
        c2324.m6408(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrM7912 = m7912();
        int[] iArrM7909 = m7909();
        while (i5 > 0) {
            int iM64106 = c2324.m6410(i3);
            int iM64107 = c2324.m6410(i3);
            int[] iArr2 = (iM64107 & 128) != 0 ? iArr : (iM64107 & 64) != 0 ? iArrM7912 : iArrM7909;
            if ((iM64107 & 1) != 0) {
                iM64103 = c2324.m6410(i3);
                iM64104 = c2324.m6410(i3);
                iM6410 = c2324.m6410(i3);
                iM64102 = c2324.m6410(i3);
                i2 = i5 - 6;
            } else {
                int iM64108 = c2324.m6410(6) << i4;
                int iM64109 = c2324.m6410(4) << 4;
                iM6410 = c2324.m6410(4) << 4;
                i2 = i5 - 4;
                iM64102 = c2324.m6410(i4) << 6;
                iM64103 = iM64108;
                iM64104 = iM64109;
            }
            if (iM64103 == 0) {
                iM64104 = 0;
                iM6410 = 0;
                iM64102 = 255;
            }
            double d = iM64103;
            double d2 = iM64104 - 128;
            double d3 = iM6410 - 128;
            iArr2[iM64106] = m7913((byte) (255 - (iM64102 & 255)), AbstractC4470.m10172((int) ((1.402d * d2) + d), 0, 255), AbstractC4470.m10172((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), AbstractC4470.m10172((int) ((d3 * 1.772d) + d), 0, 255));
            i5 = i2;
            iM64105 = iM64105;
            iArrM7909 = iArrM7909;
            i3 = 8;
            i4 = 2;
        }
        return new C3209(iM64105, iArr, iArrM7912, iArrM7909);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static C3208 m7911(C2324 c2324) {
        byte[] bArr;
        int iM6410 = c2324.m6410(16);
        c2324.m6408(4);
        int iM64102 = c2324.m6410(2);
        boolean zM6399 = c2324.m6399();
        c2324.m6408(1);
        byte[] bArr2 = AbstractC4470.f17203;
        if (iM64102 != 1) {
            if (iM64102 == 0) {
                int iM64103 = c2324.m6410(16);
                int iM64104 = c2324.m6410(16);
                if (iM64103 > 0) {
                    bArr2 = new byte[iM64103];
                    c2324.m6393(iM64103, bArr2);
                }
                if (iM64104 > 0) {
                    bArr = new byte[iM64104];
                    c2324.m6393(iM64104, bArr);
                }
            }
            return new C3208(iM6410, zM6399, bArr2, bArr);
        }
        c2324.m6408(c2324.m6410(8) * 16);
        bArr = bArr2;
        return new C3208(iM6410, zM6399, bArr2, bArr);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int[] m7912() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m7913(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m7913(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m7913(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021d A[LOOP:3: B:89:0x016c->B:119:0x021d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a A[LOOP:2: B:41:0x00aa->B:76:0x014a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017b  */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m7914(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p258.C3207.m7914(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏʾ */
    public final int mo2490() {
        return 2;
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏᵢ */
    public final /* synthetic */ InterfaceC4599 mo2492(byte[] bArr, int i, int i2) {
        return ᐧʻ.ʽᐧ(this, bArr, i2);
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ـﹶ */
    public final void mo2495() {
        C3211 c3211 = this.f12495;
        c3211.f12510.clear();
        c3211.f12514.clear();
        c3211.f12508.clear();
        c3211.f12512.clear();
        c3211.f12513.clear();
        c3211.f12509 = null;
        c3211.f12515 = null;
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ﹳﹳ */
    public final /* synthetic */ void mo2506(byte[] bArr, C4601 c4601, C4125 c4125) {
        ᐧʻ.ـﹶ(this, bArr, c4601, c4125);
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ﹶˆ */
    public final void mo2508(byte[] bArr, int i, int i2, C4601 c4601, InterfaceC4462 interfaceC4462) {
        C3211 c3211;
        C4598 c4598;
        int i3;
        C3205 c3205;
        ArrayList arrayList;
        int i4;
        C3211 c32112;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C3206 c3206;
        C3206 c32062;
        int i10;
        int iM6410;
        int i11;
        int i12;
        int i13 = 8;
        C2324 c2324 = new C2324(i + i2, bArr);
        c2324.m6407(i);
        while (true) {
            int iM6389 = c2324.m6389();
            c3211 = this.f12495;
            if (iM6389 >= 48 && c2324.m6410(i13) == 15) {
                int iM64102 = c2324.m6410(i13);
                int i14 = 16;
                int iM64103 = c2324.m6410(16);
                int iM64104 = c2324.m6410(16);
                int iM6403 = c2324.m6403() + iM64104;
                if (iM64104 * 8 > c2324.m6389()) {
                    AbstractC4464.m10144("DvbParser", "Data field length exceeds limit");
                    c2324.m6408(c2324.m6389());
                } else {
                    switch (iM64102) {
                        case 16:
                            if (iM64103 == c3211.f12511) {
                                C0137 c0137 = c3211.f12515;
                                c2324.m6410(i13);
                                int iM64105 = c2324.m6410(4);
                                int iM64106 = c2324.m6410(2);
                                c2324.m6408(2);
                                int i15 = iM64104 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i15 > 0) {
                                    int iM64107 = c2324.m6410(i13);
                                    c2324.m6408(i13);
                                    i15 -= 6;
                                    sparseArray.put(iM64107, new C3212(c2324.m6410(16), c2324.m6410(16)));
                                    i13 = 8;
                                }
                                C0137 c01372 = new C0137();
                                c01372.f1034 = iM64105;
                                c01372.f1032 = iM64106;
                                c01372.f1033 = sparseArray;
                                if (iM64106 == 0) {
                                    if (c0137 != null && c0137.f1034 != iM64105) {
                                        c3211.f12515 = c01372;
                                        break;
                                    }
                                } else {
                                    c3211.f12515 = c01372;
                                    c3211.f12510.clear();
                                    c3211.f12514.clear();
                                    c3211.f12508.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            C0137 c01373 = c3211.f12515;
                            if (iM64103 == c3211.f12511 && c01373 != null) {
                                int iM64108 = c2324.m6410(i13);
                                c2324.m6408(4);
                                boolean zM6399 = c2324.m6399();
                                c2324.m6408(3);
                                int iM64109 = c2324.m6410(16);
                                int iM641010 = c2324.m6410(16);
                                c2324.m6410(3);
                                int iM641011 = c2324.m6410(3);
                                c2324.m6408(2);
                                int iM641012 = c2324.m6410(i13);
                                int iM641013 = c2324.m6410(i13);
                                int iM641014 = c2324.m6410(4);
                                int iM641015 = c2324.m6410(2);
                                c2324.m6408(2);
                                int i16 = iM64104 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i16 > 0) {
                                    int iM641016 = c2324.m6410(i14);
                                    int iM641017 = c2324.m6410(2);
                                    c2324.m6410(2);
                                    int iM641018 = c2324.m6410(12);
                                    c2324.m6408(4);
                                    int iM641019 = c2324.m6410(12);
                                    int i17 = i16 - 6;
                                    if (iM641017 == 1 || iM641017 == 2) {
                                        c2324.m6410(i13);
                                        c2324.m6410(i13);
                                        i16 -= 8;
                                    } else {
                                        i16 = i17;
                                    }
                                    sparseArray2.put(iM641016, new C3210(iM641018, iM641019));
                                    i14 = 16;
                                }
                                C3206 c32063 = new C3206(iM64108, zM6399, iM64109, iM641010, iM641011, iM641012, iM641013, iM641014, iM641015, sparseArray2);
                                SparseArray sparseArray3 = c3211.f12510;
                                if (c01373.f1032 == 0 && (c32062 = (C3206) sparseArray3.get(iM64108)) != null) {
                                    int i18 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = c32062.f12479;
                                        if (i18 < sparseArray4.size()) {
                                            c32063.f12479.put(sparseArray4.keyAt(i18), (C3210) sparseArray4.valueAt(i18));
                                            i18++;
                                        }
                                    }
                                }
                                sparseArray3.put(c32063.f12482, c32063);
                                break;
                            }
                            break;
                        case 18:
                            if (iM64103 != c3211.f12511) {
                                if (iM64103 == c3211.f12507) {
                                    C3209 c3209M7910 = m7910(c2324, iM64104);
                                    c3211.f12512.put(c3209M7910.f12503, c3209M7910);
                                    break;
                                }
                            } else {
                                C3209 c3209M79102 = m7910(c2324, iM64104);
                                c3211.f12514.put(c3209M79102.f12503, c3209M79102);
                                break;
                            }
                            break;
                        case 19:
                            if (iM64103 != c3211.f12511) {
                                if (iM64103 == c3211.f12507) {
                                    C3208 c3208M7911 = m7911(c2324);
                                    c3211.f12513.put(c3208M7911.f12499, c3208M7911);
                                    break;
                                }
                            } else {
                                C3208 c3208M79112 = m7911(c2324);
                                c3211.f12508.put(c3208M79112.f12499, c3208M79112);
                                break;
                            }
                            break;
                        case 20:
                            if (iM64103 == c3211.f12511) {
                                c2324.m6408(4);
                                boolean zM63992 = c2324.m6399();
                                c2324.m6408(3);
                                int iM641020 = c2324.m6410(16);
                                int iM641021 = c2324.m6410(16);
                                if (zM63992) {
                                    int iM641022 = c2324.m6410(16);
                                    int iM641023 = c2324.m6410(16);
                                    int iM641024 = c2324.m6410(16);
                                    i10 = iM641023;
                                    iM6410 = c2324.m6410(16);
                                    i12 = iM641024;
                                    i11 = iM641022;
                                } else {
                                    i10 = iM641020;
                                    iM6410 = iM641021;
                                    i11 = 0;
                                    i12 = 0;
                                }
                                c3211.f12509 = new C3205(iM641020, iM641021, i11, i10, i12, iM6410);
                                break;
                            }
                            break;
                    }
                    c2324.m6391(iM6403 - c2324.m6403());
                }
                i13 = 8;
            }
        }
        C0137 c01374 = c3211.f12515;
        if (c01374 == null) {
            C3928 c3928 = AbstractC3980.f15360;
            c4598 = new C4598(C3932.f15274, -9223372036854775807L, -9223372036854775807L);
        } else {
            C3205 c32052 = c3211.f12509;
            if (c32052 == null) {
                c32052 = this.f12493;
            }
            Bitmap bitmap = this.f12496;
            Canvas canvas = this.f12492;
            if (bitmap == null || c32052.f12474 + 1 != bitmap.getWidth() || c32052.f12471 + 1 != this.f12496.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c32052.f12474 + 1, c32052.f12471 + 1, Bitmap.Config.ARGB_8888);
                this.f12496 = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i19 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) c01374.f1033;
                if (i19 < sparseArray5.size()) {
                    canvas.save();
                    C3212 c3212 = (C3212) sparseArray5.valueAt(i19);
                    C3206 c32064 = (C3206) c3211.f12510.get(sparseArray5.keyAt(i19));
                    int i20 = c3212.f12517 + c32052.f12473;
                    int i21 = c3212.f12516 + c32052.f12472;
                    int iMin = Math.min(c32064.f12481 + i20, c32052.f12476);
                    int i22 = c32064.f12485;
                    int i23 = i21 + i22;
                    canvas.clipRect(i20, i21, iMin, Math.min(i23, c32052.f12475));
                    SparseArray sparseArray6 = c3211.f12514;
                    int i24 = c32064.f12483;
                    C3209 c3209 = (C3209) sparseArray6.get(i24);
                    if (c3209 == null && (c3209 = (C3209) c3211.f12512.get(i24)) == null) {
                        c3209 = this.f12491;
                    }
                    int i25 = 0;
                    while (true) {
                        SparseArray sparseArray7 = c32064.f12479;
                        if (i25 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i25);
                            C3210 c3210 = (C3210) sparseArray7.valueAt(i25);
                            C0137 c01375 = c01374;
                            C3208 c3208 = (C3208) c3211.f12508.get(iKeyAt);
                            if (c3208 == null) {
                                c3208 = (C3208) c3211.f12513.get(iKeyAt);
                            }
                            if (c3208 != null) {
                                Paint paint = c3208.f12497 ? null : this.f12494;
                                c32112 = c3211;
                                int i26 = c3210.f12506 + i20;
                                int i27 = c3210.f12505 + i21;
                                i4 = i19;
                                int i28 = c32064.f12478;
                                int i29 = i25;
                                int[] iArr = i28 == 3 ? c3209.f12504 : i28 == 2 ? c3209.f12502 : c3209.f12501;
                                i5 = i29;
                                arrayList = arrayList2;
                                c3205 = c32052;
                                i7 = i22;
                                i6 = i23;
                                i9 = i20;
                                i8 = i21;
                                c3206 = c32064;
                                Paint paint2 = paint;
                                m7914(c3208.f12498, iArr, i28, i26, i27, paint2, canvas);
                                m7914(c3208.f12500, iArr, i28, i26, i27 + 1, paint2, canvas);
                            } else {
                                c3205 = c32052;
                                arrayList = arrayList2;
                                i4 = i19;
                                c32112 = c3211;
                                i5 = i25;
                                i6 = i23;
                                i7 = i22;
                                i8 = i21;
                                i9 = i20;
                                c3206 = c32064;
                            }
                            i25 = i5 + 1;
                            c32064 = c3206;
                            i20 = i9;
                            c01374 = c01375;
                            c3211 = c32112;
                            i19 = i4;
                            c32052 = c3205;
                            i22 = i7;
                            i23 = i6;
                            i21 = i8;
                            arrayList2 = arrayList;
                        } else {
                            C0137 c01376 = c01374;
                            C3205 c32053 = c32052;
                            ArrayList arrayList3 = arrayList2;
                            int i30 = i19;
                            C3211 c32113 = c3211;
                            int i31 = i23;
                            int i32 = i22;
                            int i33 = i21;
                            int i34 = i20;
                            C3206 c32065 = c32064;
                            boolean z = c32065.f12477;
                            int i35 = c32065.f12481;
                            if (z) {
                                int i36 = c32065.f12478;
                                int i37 = i36 == 3 ? c3209.f12504[c32065.f12484] : i36 == 2 ? c3209.f12502[c32065.f12480] : c3209.f12501[c32065.f12486];
                                Paint paint3 = this.f12490;
                                paint3.setColor(i37);
                                i3 = i33;
                                canvas.drawRect(i34, i3, i34 + i35, i31, paint3);
                            } else {
                                i3 = i33;
                            }
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f12496, i34, i3, i35, i32);
                            float f = c32053.f12474;
                            float f2 = c32053.f12471;
                            arrayList3.add(new C1808(null, null, null, bitmapCreateBitmap2, i3 / f2, 0, 0, i34 / f, 0, Integer.MIN_VALUE, -3.4028235E38f, i35 / f, i32 / f2, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            i19 = i30 + 1;
                            c01374 = c01376;
                            c3211 = c32113;
                            arrayList2 = arrayList3;
                            c32052 = c32053;
                        }
                    }
                } else {
                    c4598 = new C4598(arrayList2, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        interfaceC4462.mo4264(c4598);
    }
}
