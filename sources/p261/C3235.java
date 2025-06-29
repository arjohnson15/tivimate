package p261;

import android.util.Log;
import com.bumptech.glide.C0290;
import com.bumptech.glide.Registry$MissingComponentException;
import com.bumptech.glide.load.data.InterfaceC0279;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p003.C0910;
import p014.C1060;
import p080.AbstractC1702;
import p260.C3222;
import p314.C3598;
import p314.InterfaceC3594;
import p314.InterfaceC3595;
import p314.InterfaceC3596;
import p314.InterfaceC3597;
import p445.InterfaceC5156;

/* renamed from: ـ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3235 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List f12610;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f12611;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC5156 f12612;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class f12613;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3222 f12614;

    public C3235(Class cls, Class cls2, Class cls3, List list, InterfaceC5156 interfaceC5156, C3222 c3222) {
        this.f12613 = cls;
        this.f12610 = list;
        this.f12612 = interfaceC5156;
        this.f12614 = c3222;
        this.f12611 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f12613 + ", decoders=" + this.f12610 + ", transcoder=" + this.f12612 + '}';
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC3251 m7988(InterfaceC0279 interfaceC0279, int i, int i2, C3598 c3598, List list) throws GlideException {
        List list2 = this.f12610;
        int size = list2.size();
        InterfaceC3251 interfaceC3251Mo5001 = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC3595 interfaceC3595 = (InterfaceC3595) list2.get(i3);
            try {
                if (interfaceC3595.mo4999(interfaceC0279.mo1539(), c3598)) {
                    interfaceC3251Mo5001 = interfaceC3595.mo5001(interfaceC0279.mo1539(), i, i2, c3598);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    String str = "Failed to decode data for " + interfaceC3595;
                }
                list.add(e);
            }
            if (interfaceC3251Mo5001 != null) {
                break;
            }
        }
        if (interfaceC3251Mo5001 != null) {
            return interfaceC3251Mo5001;
        }
        throw new GlideException(this.f12611, new ArrayList(list));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3251 m7989(int i, int i2, InterfaceC0279 interfaceC0279, C1060 c1060, C3598 c3598) {
        InterfaceC3251 interfaceC3251Mo5011;
        InterfaceC3596 interfaceC3596;
        int iMo6785;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        InterfaceC3594 c3227;
        C3222 c3222 = this.f12614;
        List list = (List) c3222.m7947();
        try {
            InterfaceC3251 interfaceC3251M7988 = m7988(interfaceC0279, i, i2, c3598, list);
            c3222.m7946(list);
            RunnableC3230 runnableC3230 = (RunnableC3230) c1060.f4468;
            runnableC3230.getClass();
            Class<?> cls = interfaceC3251M7988.get().getClass();
            int i3 = c1060.f4469;
            C3237 c3237 = runnableC3230.f12573;
            InterfaceC3597 interfaceC3597M4172 = null;
            if (i3 != 4) {
                InterfaceC3596 interfaceC3596M7991 = c3237.m7991(cls);
                interfaceC3251Mo5011 = interfaceC3596M7991.mo5011(runnableC3230.f12563, interfaceC3251M7988, runnableC3230.f12556, runnableC3230.f12569);
                interfaceC3596 = interfaceC3596M7991;
            } else {
                interfaceC3251Mo5011 = interfaceC3251M7988;
                interfaceC3596 = null;
            }
            if (!interfaceC3251M7988.equals(interfaceC3251Mo5011)) {
                interfaceC3251M7988.mo4602();
            }
            if (c3237.f12626.m1555().f2383.m4172(interfaceC3251Mo5011.mo4603()) != null) {
                C0290 c0290M1555 = c3237.f12626.m1555();
                c0290M1555.getClass();
                interfaceC3597M4172 = c0290M1555.f2383.m4172(interfaceC3251Mo5011.mo4603());
                if (interfaceC3597M4172 == null) {
                    final Class clsMo4603 = interfaceC3251Mo5011.mo4603();
                    throw new Registry$MissingComponentException(clsMo4603) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + clsMo4603 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                iMo6785 = interfaceC3597M4172.mo6785(runnableC3230.f12580);
            } else {
                iMo6785 = 3;
            }
            InterfaceC3594 interfaceC3594 = runnableC3230.f12583;
            ArrayList arrayListM7990 = c3237.m7990();
            int size = arrayListM7990.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                if (((C0910) arrayListM7990.get(i4)).f4068.equals(interfaceC3594)) {
                    z = true;
                    break;
                }
                i4++;
            }
            switch (runnableC3230.f12568.f12588) {
                default:
                    z2 = true;
                    if (((z || i3 != 3) && i3 != 1) || iMo6785 != 2) {
                    }
                    break;
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (interfaceC3597M4172 == null) {
                    final Class<?> cls2 = interfaceC3251Mo5011.get().getClass();
                    throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + cls2 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                int iM5411 = AbstractC1702.m5411(iMo6785);
                if (iM5411 == 0) {
                    z3 = true;
                    z4 = false;
                    c3227 = new C3227(runnableC3230.f12583, runnableC3230.f12571);
                } else {
                    if (iM5411 != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(iMo6785 != 1 ? iMo6785 != 2 ? iMo6785 != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z3 = true;
                    c3227 = new C3248(c3237.f12626.f2351, runnableC3230.f12583, runnableC3230.f12571, runnableC3230.f12556, runnableC3230.f12569, interfaceC3596, cls, runnableC3230.f12580);
                    z4 = false;
                }
                C3252 c3252 = (C3252) C3252.f12702.m7947();
                c3252.f12705 = z4;
                c3252.f12704 = z3;
                c3252.f12703 = interfaceC3251Mo5011;
                C3222 c32222 = runnableC3230.f12579;
                c32222.f12538 = c3227;
                c32222.f12539 = interfaceC3597M4172;
                c32222.f12540 = c3252;
                interfaceC3251Mo5011 = c3252;
            }
            return this.f12612.mo4064(interfaceC3251Mo5011, c3598);
        } catch (Throwable th) {
            c3222.m7946(list);
            throw th;
        }
    }
}
