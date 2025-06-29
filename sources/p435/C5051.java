package p435;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: ﹶᵔ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5051 extends AbstractC5044 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C5055 f19166 = new C5055(2);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ int f19167;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC5044 f19168;

    public C5051(AbstractC5044 abstractC5044, int i) {
        this.f19167 = i;
        this.f19168 = abstractC5044;
    }

    public final String toString() {
        return this.f19168 + ".collection()";
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        switch (this.f19167) {
            case 0:
                Collection collectionM11200 = m11200();
                abstractC5050.mo11193();
                while (abstractC5050.mo11191()) {
                    ((ArrayList) collectionM11200).add(this.f19168.mo1390(abstractC5050));
                }
                abstractC5050.mo11192();
                return collectionM11200;
            default:
                Collection collectionM112002 = m11200();
                abstractC5050.mo11193();
                while (abstractC5050.mo11191()) {
                    collectionM112002.add(this.f19168.mo1390(abstractC5050));
                }
                abstractC5050.mo11192();
                return collectionM112002;
        }
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        switch (this.f19167) {
            case 0:
                abstractC5048.mo11179();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    this.f19168.mo1391(abstractC5048, it.next());
                }
                ((C5061) abstractC5048).m11220(1, 2, ']');
                break;
            default:
                abstractC5048.mo11179();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    this.f19168.mo1391(abstractC5048, it2.next());
                }
                ((C5061) abstractC5048).m11220(1, 2, ']');
                break;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Collection m11200() {
        switch (this.f19167) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }
}
