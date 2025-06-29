package p324;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p166.C2418;
import p166.C2431;

/* renamed from: ᴵˋ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3704 extends AbstractC3705 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final C3704 f14290 = new C3704("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final List f14291;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final Map f14292;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final List f14293;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C2431 f14294;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final List f14295;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final List f14296;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final List f14297;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final List f14298;

    public C3704(String str, List list, List list2, List list3, List list4, List list5, List list6, C2431 c2431, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((C3706) list2.get(i)).f14305;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m8666(list3, arrayList);
        m8666(list4, arrayList);
        m8666(list5, arrayList);
        m8666(list6, arrayList);
        this.f14297 = DesugarCollections.unmodifiableList(arrayList);
        this.f14291 = DesugarCollections.unmodifiableList(list2);
        DesugarCollections.unmodifiableList(list3);
        this.f14295 = DesugarCollections.unmodifiableList(list4);
        this.f14296 = DesugarCollections.unmodifiableList(list5);
        DesugarCollections.unmodifiableList(list6);
        this.f14294 = c2431;
        this.f14298 = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.f14292 = DesugarCollections.unmodifiableMap(map);
        this.f14293 = DesugarCollections.unmodifiableList(list8);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m8666(List list, ArrayList arrayList) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C3703) list.get(i)).f14289;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static ArrayList m8667(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    C2418 c2418 = (C2418) list2.get(i3);
                    if (c2418.f9630 == i && c2418.f9631 == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    @Override // p022.InterfaceC1133
    /* renamed from: ـﹶ */
    public final Object mo4158(List list) {
        return new C3704(this.f14301, this.f14299, m8667(this.f14291, 0, list), Collections.emptyList(), m8667(this.f14295, 1, list), m8667(this.f14296, 2, list), Collections.emptyList(), this.f14294, this.f14298, this.f14300, this.f14292, this.f14293);
    }
}
