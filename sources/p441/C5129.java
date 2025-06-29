package p441;

import java.util.ArrayList;

/* renamed from: ﾞʽ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5129 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public ArrayList f19618;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public AbstractC5132 f19619;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static long m11412(C5136 c5136, long j) {
        AbstractC5132 abstractC5132 = c5136.f19646;
        if (abstractC5132 instanceof C5128) {
            return j;
        }
        ArrayList arrayList = c5136.f19640;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC5139 interfaceC5139 = (InterfaceC5139) arrayList.get(i);
            if (interfaceC5139 instanceof C5136) {
                C5136 c51362 = (C5136) interfaceC5139;
                if (c51362.f19646 != abstractC5132) {
                    jMax = Math.max(jMax, m11412(c51362, c51362.f19644 + j));
                }
            }
        }
        if (c5136 != abstractC5132.f19626) {
            return jMax;
        }
        long jMo11420 = abstractC5132.mo11420();
        long j2 = j + jMo11420;
        return Math.max(Math.max(jMax, m11412(abstractC5132.f19632, j2)), j2 - r9.f19644);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static long m11413(C5136 c5136, long j) {
        AbstractC5132 abstractC5132 = c5136.f19646;
        if (abstractC5132 instanceof C5128) {
            return j;
        }
        ArrayList arrayList = c5136.f19640;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC5139 interfaceC5139 = (InterfaceC5139) arrayList.get(i);
            if (interfaceC5139 instanceof C5136) {
                C5136 c51362 = (C5136) interfaceC5139;
                if (c51362.f19646 != abstractC5132) {
                    jMin = Math.min(jMin, m11413(c51362, c51362.f19644 + j));
                }
            }
        }
        if (c5136 != abstractC5132.f19632) {
            return jMin;
        }
        long jMo11420 = abstractC5132.mo11420();
        long j2 = j - jMo11420;
        return Math.min(Math.min(jMin, m11413(abstractC5132.f19626, j2)), j2 - r9.f19644);
    }
}
