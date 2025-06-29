package p197;

import java.util.ArrayList;

/* renamed from: ˎˑ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2720 implements Cloneable {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public ArrayList f10657;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ArrayList f10661;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public AbstractC2726 f10662;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ArrayList f10656 = null;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f10659 = false;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C2720 f10664 = null;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f10665 = false;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public long f10658 = 0;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public long f10660 = 0;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public long f10663 = 0;

    public C2720(AbstractC2726 abstractC2726) {
        this.f10662 = abstractC2726;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6921(C2720 c2720) {
        if (this.f10657 == null) {
            this.f10657 = new ArrayList();
        }
        if (this.f10657.contains(c2720)) {
            return;
        }
        this.f10657.add(c2720);
        if (c2720.f10656 == null) {
            c2720.f10656 = new ArrayList();
        }
        if (c2720.f10656.contains(this)) {
            return;
        }
        c2720.f10656.add(this);
        m6921(c2720);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C2720 clone() {
        try {
            C2720 c2720 = (C2720) super.clone();
            c2720.f10662 = this.f10662.mo6910();
            if (this.f10656 != null) {
                c2720.f10656 = new ArrayList(this.f10656);
            }
            if (this.f10661 != null) {
                c2720.f10661 = new ArrayList(this.f10661);
            }
            if (this.f10657 != null) {
                c2720.f10657 = new ArrayList(this.f10657);
            }
            c2720.f10659 = false;
            return c2720;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m6923(C2720 c2720) {
        if (this.f10661 == null) {
            this.f10661 = new ArrayList();
        }
        if (this.f10661.contains(c2720)) {
            return;
        }
        this.f10661.add(c2720);
        c2720.m6923(this);
    }
}
