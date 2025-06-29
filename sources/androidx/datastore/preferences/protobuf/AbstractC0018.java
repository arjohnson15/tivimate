package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0018 implements Cloneable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public AbstractC0083 f364;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f365 = false;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC0083 f366;

    public AbstractC0018(AbstractC0083 abstractC0083) {
        this.f366 = abstractC0083;
        this.f364 = (AbstractC0083) abstractC0083.mo581(4);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m279(AbstractC0083 abstractC0083, AbstractC0083 abstractC00832) {
        C0028 c0028 = C0028.f387;
        c0028.getClass();
        c0028.m308(abstractC0083.getClass()).mo307(abstractC0083, abstractC00832);
    }

    public final Object clone() {
        AbstractC0018 abstractC0018 = (AbstractC0018) this.f366.mo581(5);
        AbstractC0083 abstractC0083M282 = m282();
        abstractC0018.m281();
        m279(abstractC0018.f364, abstractC0083M282);
        return abstractC0018;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC0083 m280() {
        AbstractC0083 abstractC0083M282 = m282();
        if (abstractC0083M282.m580()) {
            return abstractC0083M282;
        }
        throw new UninitializedMessageException();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m281() {
        if (this.f365) {
            AbstractC0083 abstractC0083 = (AbstractC0083) this.f364.mo581(4);
            m279(abstractC0083, this.f364);
            this.f364 = abstractC0083;
            this.f365 = false;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC0083 m282() {
        if (this.f365) {
            return this.f364;
        }
        AbstractC0083 abstractC0083 = this.f364;
        abstractC0083.getClass();
        C0028 c0028 = C0028.f387;
        c0028.getClass();
        c0028.m308(abstractC0083.getClass()).mo303(abstractC0083);
        this.f365 = true;
        return this.f364;
    }
}
