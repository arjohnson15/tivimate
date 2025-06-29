package p117;

/* renamed from: ˈˆ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1841 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC1845 f7065;

    public AbstractC1841(AbstractC1845 abstractC1845) {
        this.f7065 = abstractC1845;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1841 abstractC1841 = (AbstractC1841) obj;
        if (this.f7065 != abstractC1841.f7065) {
            return false;
        }
        return mo5457() != null ? mo5457().equals(abstractC1841.mo5457()) : abstractC1841.mo5457() == null;
    }

    public final int hashCode() {
        return this.f7065.f7081;
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + mo5603() + "]";
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public String mo5603() {
        if (mo5457() != null) {
            return mo5457().toString();
        }
        return null;
    }

    /* renamed from: ﹳﹳ */
    public abstract Object mo5457();
}
