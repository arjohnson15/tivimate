package p049;

/* renamed from: ʽﹳ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1310 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f5352;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f5353;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5354;

    public /* synthetic */ C1310(String str, boolean z, int i) {
        this.f5354 = i;
        this.f5353 = str;
        this.f5352 = z;
    }

    public /* synthetic */ C1310(boolean z, String str, int i) {
        this.f5354 = i;
        this.f5352 = z;
        this.f5353 = str;
    }

    public String toString() {
        switch (this.f5354) {
            case 0:
                String str = this.f5353;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.f5352);
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
