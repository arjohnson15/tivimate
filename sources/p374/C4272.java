package p374;

import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import p000.InterfaceC0880;
import p076.C1653;
import p166.AbstractC2394;
import p166.C2399;
import p166.C2402;
import p166.C2407;
import p166.C2410;
import p166.C2420;
import p166.C2430;
import p166.C2444;
import p266.C3264;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p345.C3971;
import p383.AbstractC4470;

/* renamed from: ᵢˎ.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4272 extends AbstractC4265 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static final C2402 f16583;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final AbstractC2394[] f16584;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public long[][] f16585;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C3264 f16586;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final ArrayList f16587;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public MergingMediaSource$IllegalMergeException f16588;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public int f16589;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final InterfaceC4277[] f16590;

    static {
        C2430 c2430 = new C2430();
        C3928 c3928 = AbstractC3980.f15360;
        C3932 c3932 = C3932.f15274;
        Collections.emptyList();
        C3932 c39322 = C3932.f15274;
        C2407 c2407 = new C2407();
        f16583 = new C2402("MergingMediaSource", new C2399(c2430), null, new C2444(c2407), C2410.f9547, C2420.f9633);
    }

    public C4272(InterfaceC4277... interfaceC4277Arr) {
        C3264 c3264 = new C3264(6);
        this.f16590 = interfaceC4277Arr;
        this.f16586 = c3264;
        this.f16587 = new ArrayList(Arrays.asList(interfaceC4277Arr));
        this.f16589 = -1;
        this.f16584 = new AbstractC2394[interfaceC4277Arr.length];
        this.f16585 = new long[0][];
        new HashMap();
        AbstractC3968.m9177(8, "expectedKeys");
        new C3971().m9198().ˎٴ();
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ʽᐧ */
    public final InterfaceC4294 mo6113(C4290 c4290, C1653 c1653, long j) {
        InterfaceC4277[] interfaceC4277Arr = this.f16590;
        int length = interfaceC4277Arr.length;
        InterfaceC4294[] interfaceC4294Arr = new InterfaceC4294[length];
        AbstractC2394[] abstractC2394Arr = this.f16584;
        int iMo6469 = abstractC2394Arr[0].mo6469(c4290.f16693);
        for (int i = 0; i < length; i++) {
            interfaceC4294Arr[i] = interfaceC4277Arr[i].mo6113(c4290.m9754(abstractC2394Arr[i].mo6472(iMo6469)), c1653, j - this.f16585[iMo6469][i]);
        }
        return new C4255(this.f16586, this.f16585[iMo6469], interfaceC4294Arr);
    }

    @Override // p374.AbstractC4273
    /* renamed from: ʿˏ */
    public final void mo6114(InterfaceC0880 interfaceC0880) {
        this.f16568 = interfaceC0880;
        this.f16567 = AbstractC4470.m10200(null);
        int i = 0;
        while (true) {
            InterfaceC4277[] interfaceC4277Arr = this.f16590;
            if (i >= interfaceC4277Arr.length) {
                return;
            }
            m9725(Integer.valueOf(i), interfaceC4277Arr[i]);
            i++;
        }
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˉⁱ */
    public final void mo6115(C2402 c2402) {
        this.f16590[0].mo6115(c2402);
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˋⁱ */
    public final void mo6116(InterfaceC4294 interfaceC4294) {
        C4255 c4255 = (C4255) interfaceC4294;
        int i = 0;
        while (true) {
            InterfaceC4277[] interfaceC4277Arr = this.f16590;
            if (i >= interfaceC4277Arr.length) {
                return;
            }
            InterfaceC4277 interfaceC4277 = interfaceC4277Arr[i];
            InterfaceC4294 interfaceC42942 = c4255.f16527[i];
            if (interfaceC42942 instanceof C4259) {
                interfaceC42942 = ((C4259) interfaceC42942).f16548;
            }
            interfaceC4277.mo6116(interfaceC42942);
            i++;
        }
    }

    @Override // p374.AbstractC4265, p374.InterfaceC4277
    /* renamed from: ˏᵢ */
    public final void mo6117() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.f16588;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.mo6117();
    }

    @Override // p374.AbstractC4265
    /* renamed from: יʻ */
    public final C4290 mo9715(Object obj, C4290 c4290) {
        if (((Integer) obj).intValue() == 0) {
            return c4290;
        }
        return null;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ـﹶ */
    public final C2402 mo6119() {
        InterfaceC4277[] interfaceC4277Arr = this.f16590;
        return interfaceC4277Arr.length > 0 ? interfaceC4277Arr[0].mo6119() : f16583;
    }

    @Override // p374.AbstractC4265
    /* renamed from: ᐧⁱ */
    public final void mo9716(Object obj, AbstractC4273 abstractC4273, AbstractC2394 abstractC2394) {
        Integer num = (Integer) obj;
        if (this.f16588 != null) {
            return;
        }
        if (this.f16589 == -1) {
            this.f16589 = abstractC2394.mo6475();
        } else if (abstractC2394.mo6475() != this.f16589) {
            this.f16588 = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.f16585.length;
        AbstractC2394[] abstractC2394Arr = this.f16584;
        if (length == 0) {
            this.f16585 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f16589, abstractC2394Arr.length);
        }
        ArrayList arrayList = this.f16587;
        arrayList.remove(abstractC4273);
        abstractC2394Arr[num.intValue()] = abstractC2394;
        if (arrayList.isEmpty()) {
            m9730(abstractC2394Arr[0]);
        }
    }

    @Override // p374.AbstractC4265, p374.AbstractC4273
    /* renamed from: ﾞˊ */
    public final void mo6120() {
        super.mo6120();
        Arrays.fill(this.f16584, (Object) null);
        this.f16589 = -1;
        this.f16588 = null;
        ArrayList arrayList = this.f16587;
        arrayList.clear();
        Collections.addAll(arrayList, this.f16590);
    }
}
