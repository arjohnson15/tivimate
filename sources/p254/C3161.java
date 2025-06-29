package p254;

import android.net.Uri;
import com.bumptech.glide.ﹳﹳ;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p014.C1064;
import p015.C1066;
import p033.C1219;
import p052.C1329;
import p099.C1772;
import p100.C1773;
import p101.C1775;
import p111.C1807;
import p168.C2456;
import p293.C3474;
import p323.C3683;
import p323.C3685;
import p331.C3758;
import p334.C3789;
import p341.C3880;
import p341.C3892;
import p341.C3894;
import p341.C3895;
import p341.C3905;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p355.C4027;
import p383.C4458;
import p384.C4473;
import p397.C4610;
import p403.C4622;

/* renamed from: יי.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3161 implements InterfaceC3163 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public AbstractC3980 f12227;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f12230;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f12231;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final int[] f12225 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C3758 f12224 = new C3758(new C1219(22));

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C3758 f12226 = new C3758(new C1219(23));

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f12229 = 112800;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C3474 f12228 = new C3474(8);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f12232 = true;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7833(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new C3895());
                break;
            case 1:
                arrayList.add(new C3892());
                break;
            case 2:
                arrayList.add(new C3905());
                break;
            case 3:
                arrayList.add(new C1773());
                break;
            case 4:
                InterfaceC3165 interfaceC3165M8744 = f12224.m8744(0);
                if (interfaceC3165M8744 == null) {
                    arrayList.add(new C1066());
                    break;
                } else {
                    arrayList.add(interfaceC3165M8744);
                    break;
                }
            case 5:
                arrayList.add(new C4473());
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                arrayList.add(new C1064(this.f12228, this.f12232 ? 0 : 2));
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                arrayList.add(new C2456());
                break;
            case 8:
                C3474 c3474 = this.f12228;
                int i2 = this.f12232 ? 0 : 32;
                C3928 c3928 = AbstractC3980.f15360;
                arrayList.add(new C3683(c3474, i2, null, null, C3932.f15274, null));
                arrayList.add(new C3685(this.f12228, this.f12232 ? 0 : 16));
                break;
            case 9:
                arrayList.add(new C1775());
                break;
            case 10:
                arrayList.add(new C3894());
                break;
            case 11:
                if (this.f12227 == null) {
                    C3928 c39282 = AbstractC3980.f15360;
                    this.f12227 = C3932.f15274;
                }
                arrayList.add(new C3880(1, !this.f12232 ? 1 : 0, this.f12228, new C4458(0L), new C1329(this.f12230, this.f12227), this.f12229));
                break;
            case 12:
                C4027 c4027 = new C4027();
                c4027.f15477 = 0;
                c4027.f15481 = -1L;
                c4027.f15479 = -1;
                c4027.f15480 = -1L;
                arrayList.add(c4027);
                break;
            case 14:
                arrayList.add(new C1772(this.f12231));
                break;
            case 15:
                InterfaceC3165 interfaceC3165M87442 = f12226.m8744(new Object[0]);
                if (interfaceC3165M87442 != null) {
                    arrayList.add(interfaceC3165M87442);
                    break;
                }
                break;
            case 16:
                arrayList.add(new C4622(!this.f12232 ? 1 : 0, this.f12228));
                break;
            case 17:
                arrayList.add(new C1772((byte) 0, 1));
                break;
            case 18:
                arrayList.add(new C1807(2));
                break;
            case 19:
                arrayList.add(new C1772((byte) 0, 0));
                break;
            case 20:
                arrayList.add(new C1807(1));
                break;
            case 21:
                arrayList.add(new C1807(0));
                break;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized void m7834() {
        this.f12229 = 1880000;
    }

    @Override // p254.InterfaceC3163
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized InterfaceC3165[] mo7835(Uri uri, Map map) {
        InterfaceC3165[] interfaceC3165Arr;
        try {
            int[] iArr = f12225;
            ArrayList arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int i = ﹳﹳ.ﹳˎ((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (i != -1) {
                m7833(i, arrayList);
            }
            int i2 = ﹳﹳ.ʿˏ(uri);
            if (i2 != -1 && i2 != i) {
                m7833(i2, arrayList);
            }
            for (int i3 = 0; i3 < 21; i3++) {
                int i4 = iArr[i3];
                if (i4 != i && i4 != i2) {
                    m7833(i4, arrayList);
                }
            }
            interfaceC3165Arr = new InterfaceC3165[arrayList.size()];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                InterfaceC3165 c4610 = (InterfaceC3165) arrayList.get(i5);
                if (this.f12232 && !(c4610.mo4086() instanceof C3683) && !(c4610.mo4086() instanceof C3685) && !(c4610.mo4086() instanceof C3880) && !(c4610.mo4086() instanceof C4622) && !(c4610.mo4086() instanceof C1064)) {
                    c4610 = new C4610(c4610, this.f12228);
                }
                interfaceC3165Arr[i5] = c4610;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC3165Arr;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized void m7836(List list) {
        this.f12227 = AbstractC3980.m9209(list);
    }
}
