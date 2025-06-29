package p041;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import p435.InterfaceC5049;

/* renamed from: ʽˉ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1281 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5269;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f5270;

    public C1281(int i) {
        switch (i) {
            case 2:
                this.f5270 = new ArrayList();
                this.f5269 = 0;
                break;
            default:
                this.f5270 = new ArrayList();
                this.f5269 = 128;
                break;
        }
    }

    public C1281(ArrayList arrayList) {
        this.f5270 = arrayList;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public synchronized List m4569() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.f5270));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean m4570() {
        return this.f5269 < this.f5270.size();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m4571(InterfaceC5049 interfaceC5049) {
        if (interfaceC5049 == null) {
            throw new IllegalArgumentException("factory == null");
        }
        ArrayList arrayList = this.f5270;
        int i = this.f5269;
        this.f5269 = i + 1;
        arrayList.add(i, interfaceC5049);
    }
}
