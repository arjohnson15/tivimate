package j$.time;

/* loaded from: classes2.dex */
public abstract class b {
    protected b() {
    }

    public static b b() {
        return new a(ZoneId.systemDefault());
    }

    public abstract ZoneId a();
}
