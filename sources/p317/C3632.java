package p317;

import p013.AbstractC1033;

/* renamed from: ᴵ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3632 extends AbstractC1033 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C3615 f13877;

    public C3632(C3615 c3615) {
        this.f13877 = c3615;
    }

    @Override // p013.AbstractC1033, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = this.f13877.f13859.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // p013.AbstractC1033, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // p013.AbstractC1033, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }

    @Override // p013.AbstractC1033
    /* renamed from: ٴˎ */
    public final int mo3982() {
        return this.f13877.f13859.groupCount() + 1;
    }
}
