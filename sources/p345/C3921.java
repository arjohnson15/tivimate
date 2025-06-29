package p345;

/* renamed from: ᵎᴵ.ʽˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3921 extends AbstractC3985 {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final Object[] f15236;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final C3921 f15237;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final transient int f15238;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final transient int f15239;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient Object[] f15240;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final transient Object[] f15241;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final transient int f15242;

    static {
        Object[] objArr = new Object[0];
        f15236 = objArr;
        f15237 = new C3921(0, 0, 0, objArr, objArr);
    }

    public C3921(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f15240 = objArr;
        this.f15238 = i;
        this.f15241 = objArr2;
        this.f15242 = i2;
        this.f15239 = i3;
    }

    @Override // p345.AbstractC3927, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f15241;
            if (objArr.length != 0) {
                int iM9178 = AbstractC3968.m9178(obj);
                while (true) {
                    int i = iM9178 & this.f15242;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM9178 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // p345.AbstractC3985, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15238;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15239;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˉי, reason: contains not printable characters */
    public final int mo9117() {
        return 0;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˉⁱ */
    public final boolean mo9116() {
        return false;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final AbstractC3986 iterator() {
        return mo9136().listIterator(0);
    }

    @Override // p345.AbstractC3927
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int mo9119(int i, Object[] objArr) {
        Object[] objArr2 = this.f15240;
        int i2 = this.f15239;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object[] mo9120() {
        return this.f15240;
    }

    @Override // p345.AbstractC3985
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final AbstractC3980 mo9121() {
        return AbstractC3980.m9206(this.f15239, this.f15240);
    }

    @Override // p345.AbstractC3927
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int mo9122() {
        return this.f15239;
    }
}
