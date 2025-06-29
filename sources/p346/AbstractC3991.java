package p346;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC0293;
import p063.C1455;
import p063.C1457;
import p188.AbstractC2636;
import p188.C2616;
import p188.C2633;
import p261.C3231;
import p314.C3598;
import p314.C3602;
import p314.InterfaceC3594;
import p314.InterfaceC3596;
import p329.AbstractC3740;
import p329.AbstractC3742;
import p329.C3738;
import p354.C4024;
import p354.C4025;

/* renamed from: ᵎᵎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3991 implements Cloneable {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Drawable f15382;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f15386;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Drawable f15389;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f15390;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f15391;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean f15392;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean f15394;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C3231 f15381 = C3231.f12587;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public EnumC0293 f15384 = EnumC0293.f2388;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f15393 = true;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f15395 = -1;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f15383 = -1;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public InterfaceC3594 f15388 = C4025.f15474;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public C3598 f15396 = new C3598();

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public C3738 f15380 = new C3738(0);

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public Class f15387 = Object.class;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public boolean f15385 = true;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static boolean m9232(int i, int i2) {
        return (i & i2) != 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3991) {
            return m9234((AbstractC3991) obj);
        }
        return false;
    }

    public int hashCode() {
        char[] cArr = AbstractC3742.f14503;
        return AbstractC3742.m8711(AbstractC3742.m8711(AbstractC3742.m8711(AbstractC3742.m8711(AbstractC3742.m8711(AbstractC3742.m8711(AbstractC3742.m8711(AbstractC3742.m8715(0, AbstractC3742.m8715(0, AbstractC3742.m8715(1, AbstractC3742.m8715(this.f15391 ? 1 : 0, AbstractC3742.m8715(this.f15383, AbstractC3742.m8715(this.f15395, AbstractC3742.m8715(this.f15393 ? 1 : 0, AbstractC3742.m8711(AbstractC3742.m8715(0, AbstractC3742.m8711(AbstractC3742.m8715(0, AbstractC3742.m8711(AbstractC3742.m8715(0, AbstractC3742.m8715(Float.floatToIntBits(1.0f), 17)), this.f15389)), this.f15382)), null)))))))), this.f15381), this.f15384), this.f15396), this.f15380), this.f15387), this.f15388), null);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final AbstractC3991 m9233(Class cls, InterfaceC3596 interfaceC3596, boolean z) {
        if (this.f15394) {
            return clone().m9233(cls, interfaceC3596, z);
        }
        AbstractC3740.m8705(interfaceC3596);
        this.f15380.put(cls, interfaceC3596);
        int i = this.f15390;
        this.f15390 = 67584 | i;
        this.f15385 = false;
        if (z) {
            this.f15390 = i | 198656;
            this.f15391 = true;
        }
        m9244();
        return this;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m9234(AbstractC3991 abstractC3991) {
        abstractC3991.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && AbstractC3742.m8708(this.f15389, abstractC3991.f15389) && AbstractC3742.m8708(this.f15382, abstractC3991.f15382) && AbstractC3742.m8708(null, null) && this.f15393 == abstractC3991.f15393 && this.f15395 == abstractC3991.f15395 && this.f15383 == abstractC3991.f15383 && this.f15391 == abstractC3991.f15391 && this.f15381.equals(abstractC3991.f15381) && this.f15384 == abstractC3991.f15384 && this.f15396.equals(abstractC3991.f15396) && this.f15380.equals(abstractC3991.f15380) && this.f15387.equals(abstractC3991.f15387) && this.f15388.equals(abstractC3991.f15388) && AbstractC3742.m8708(null, null);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final AbstractC3991 m9235(InterfaceC3596 interfaceC3596, boolean z) {
        if (this.f15394) {
            return clone().m9235(interfaceC3596, z);
        }
        C2633 c2633 = new C2633(interfaceC3596, z);
        m9233(Bitmap.class, interfaceC3596, z);
        m9233(Drawable.class, c2633, z);
        m9233(BitmapDrawable.class, c2633, z);
        m9233(C1457.class, new C1455(interfaceC3596), z);
        m9244();
        return this;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final AbstractC3991 m9236(C2616 c2616, AbstractC2636 abstractC2636) {
        if (this.f15394) {
            return clone().m9236(c2616, abstractC2636);
        }
        m9237(C2616.f10397, c2616);
        return m9235(abstractC2636, false);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final AbstractC3991 m9237(C3602 c3602, C2616 c2616) {
        if (this.f15394) {
            return clone().m9237(c3602, c2616);
        }
        AbstractC3740.m8705(c3602);
        this.f15396.f13814.put(c3602, c2616);
        m9244();
        return this;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final AbstractC3991 m9238(Drawable drawable) {
        if (this.f15394) {
            return clone().m9238(drawable);
        }
        this.f15382 = drawable;
        this.f15390 = (this.f15390 | 64) & (-129);
        m9244();
        return this;
    }

    /* renamed from: ˑʽ */
    public AbstractC3991 mo1573(AbstractC3991 abstractC3991) {
        if (this.f15394) {
            return clone().mo1573(abstractC3991);
        }
        int i = abstractC3991.f15390;
        if (m9232(abstractC3991.f15390, 1048576)) {
            this.f15392 = abstractC3991.f15392;
        }
        if (m9232(abstractC3991.f15390, 4)) {
            this.f15381 = abstractC3991.f15381;
        }
        if (m9232(abstractC3991.f15390, 8)) {
            this.f15384 = abstractC3991.f15384;
        }
        if (m9232(abstractC3991.f15390, 16)) {
            this.f15389 = abstractC3991.f15389;
            this.f15390 &= -33;
        }
        if (m9232(abstractC3991.f15390, 32)) {
            this.f15389 = null;
            this.f15390 &= -17;
        }
        if (m9232(abstractC3991.f15390, 64)) {
            this.f15382 = abstractC3991.f15382;
            this.f15390 &= -129;
        }
        if (m9232(abstractC3991.f15390, 128)) {
            this.f15382 = null;
            this.f15390 &= -65;
        }
        if (m9232(abstractC3991.f15390, 256)) {
            this.f15393 = abstractC3991.f15393;
        }
        if (m9232(abstractC3991.f15390, 512)) {
            this.f15383 = abstractC3991.f15383;
            this.f15395 = abstractC3991.f15395;
        }
        if (m9232(abstractC3991.f15390, 1024)) {
            this.f15388 = abstractC3991.f15388;
        }
        if (m9232(abstractC3991.f15390, 4096)) {
            this.f15387 = abstractC3991.f15387;
        }
        if (m9232(abstractC3991.f15390, 8192)) {
            this.f15390 &= -16385;
        }
        if (m9232(abstractC3991.f15390, 16384)) {
            this.f15390 &= -8193;
        }
        if (m9232(abstractC3991.f15390, 131072)) {
            this.f15391 = abstractC3991.f15391;
        }
        if (m9232(abstractC3991.f15390, 2048)) {
            this.f15380.putAll(abstractC3991.f15380);
            this.f15385 = abstractC3991.f15385;
        }
        this.f15390 |= abstractC3991.f15390;
        this.f15396.f13814.mo7017(abstractC3991.f15396.f13814);
        m9244();
        return this;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final AbstractC3991 m9239() {
        EnumC0293 enumC0293 = EnumC0293.f2389;
        if (this.f15394) {
            return clone().m9239();
        }
        this.f15384 = enumC0293;
        this.f15390 |= 8;
        m9244();
        return this;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final AbstractC3991 m9240(Class cls) {
        if (this.f15394) {
            return clone().m9240(cls);
        }
        this.f15387 = cls;
        this.f15390 |= 4096;
        m9244();
        return this;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final AbstractC3991 m9241(C3231 c3231) {
        if (this.f15394) {
            return clone().m9241(c3231);
        }
        this.f15381 = c3231;
        this.f15390 |= 4;
        m9244();
        return this;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final AbstractC3991 m9242(int i, int i2) {
        if (this.f15394) {
            return clone().m9242(i, i2);
        }
        this.f15383 = i;
        this.f15395 = i2;
        this.f15390 |= 512;
        m9244();
        return this;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final AbstractC3991 m9243(C4024 c4024) {
        if (this.f15394) {
            return clone().m9243(c4024);
        }
        this.f15388 = c4024;
        this.f15390 |= 1024;
        m9244();
        return this;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m9244() {
        if (this.f15386) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final AbstractC3991 m9245() {
        if (this.f15394) {
            return clone().m9245();
        }
        this.f15393 = false;
        this.f15390 |= 256;
        m9244();
        return this;
    }

    @Override // 
    /* renamed from: ﹳﹳ, reason: merged with bridge method [inline-methods] */
    public AbstractC3991 clone() {
        try {
            AbstractC3991 abstractC3991 = (AbstractC3991) super.clone();
            C3598 c3598 = new C3598();
            abstractC3991.f15396 = c3598;
            c3598.f13814.mo7017(this.f15396.f13814);
            C3738 c3738 = new C3738(0);
            abstractC3991.f15380 = c3738;
            c3738.putAll(this.f15380);
            abstractC3991.f15386 = false;
            abstractC3991.f15394 = false;
            return abstractC3991;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final AbstractC3991 m9246(Drawable drawable) {
        if (this.f15394) {
            return clone().m9246(drawable);
        }
        this.f15389 = drawable;
        this.f15390 = (this.f15390 | 16) & (-33);
        m9244();
        return this;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final AbstractC3991 m9247() {
        if (this.f15394) {
            return clone().m9247();
        }
        this.f15392 = true;
        this.f15390 |= 1048576;
        m9244();
        return this;
    }
}
