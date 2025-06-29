package p080;

/* renamed from: ʿˏ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1704 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f6666;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object[] f6667;

    public C1704() {
        this.f6667 = new Object[256];
    }

    public C1704(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f6667 = new Object[i];
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m5417(C1698 c1698) {
        int i = this.f6666;
        Object[] objArr = this.f6667;
        if (i < objArr.length) {
            objArr[i] = c1698;
            this.f6666 = i + 1;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean mo5418(Object obj) {
        Object[] objArr;
        boolean z;
        int i = this.f6666;
        int i2 = 0;
        while (true) {
            objArr = this.f6667;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f6666;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f6666 = i3 + 1;
        return true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object mo5419() {
        int i = this.f6666;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f6667;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f6666 = i - 1;
        return obj;
    }
}
