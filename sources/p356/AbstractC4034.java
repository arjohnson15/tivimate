package p356;

import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p166.C2431;
import p345.AbstractC3980;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p424.InterfaceC4906;

/* renamed from: ᵔˋ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4034 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final AbstractC3980 f15516;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C4032 f15517;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f15518;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final List f15519;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2431 f15520;

    public AbstractC4034(C2431 c2431, AbstractC3980 abstractC3980, AbstractC4045 abstractC4045, ArrayList arrayList) {
        AbstractC4464.m10142(!abstractC3980.isEmpty());
        this.f15520 = c2431;
        this.f15516 = AbstractC3980.m9209(abstractC3980);
        this.f15519 = arrayList == null ? Collections.emptyList() : DesugarCollections.unmodifiableList(arrayList);
        this.f15517 = abstractC4045.mo9303(this);
        int i = AbstractC4470.f17202;
        this.f15518 = AbstractC4470.m10166(abstractC4045.f15565, 1000000L, abstractC4045.f15564, RoundingMode.FLOOR);
    }

    /* renamed from: ʽᐧ */
    public abstract String mo9294();

    /* renamed from: ʿʼ */
    public abstract C4032 mo9295();

    /* renamed from: ﹳﹳ */
    public abstract InterfaceC4906 mo9296();
}
