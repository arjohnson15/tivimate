package j$.util.stream;

import java.util.stream.Collector;

/* renamed from: j$.util.stream.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5476j {
    public final /* synthetic */ Collector a;

    private /* synthetic */ C5476j(Collector collector) {
        this.a = collector;
    }

    public static /* synthetic */ C5476j a(Collector collector) {
        if (collector == null) {
            return null;
        }
        if (!(collector instanceof AbstractC5481k)) {
            return new C5476j(collector);
        }
        throw null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.a;
        if (obj instanceof C5476j) {
            obj = ((C5476j) obj).a;
        }
        return collector.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
