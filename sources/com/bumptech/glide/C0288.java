package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.datastore.preferences.protobuf.C0054;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p200.C2741;
import p216.C2821;
import p259.InterfaceC3214;
import p329.AbstractC3740;
import p329.AbstractC3742;
import p346.AbstractC3991;
import p346.C3992;
import p346.InterfaceC3988;
import p346.InterfaceC3990;
import ʻˋ.ˋˊ;

/* renamed from: com.bumptech.glide.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0288 extends AbstractC3991 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final Context f2362;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public C0288 f2363;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public C0288 f2364;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public AbstractC0289 f2365;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public Object f2366;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public boolean f2367;

    /* renamed from: יˋ, reason: contains not printable characters */
    public boolean f2368;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public ArrayList f2369;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final Class f2370;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final ComponentCallbacks2C0294 f2371;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public boolean f2372 = true;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final C0284 f2373;

    static {
    }

    public C0288(ComponentCallbacks2C0283 componentCallbacks2C0283, ComponentCallbacks2C0294 componentCallbacks2C0294, Class cls, Context context) {
        C3992 c3992;
        this.f2371 = componentCallbacks2C0294;
        this.f2370 = cls;
        this.f2362 = context;
        C2741 c2741 = componentCallbacks2C0294.f2398.f2341.f2352;
        AbstractC0289 abstractC0289 = (AbstractC0289) c2741.get(cls);
        if (abstractC0289 == null) {
            Iterator it = ((C0054) c2741.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    abstractC0289 = (AbstractC0289) entry.getValue();
                }
            }
        }
        this.f2365 = abstractC0289 == null ? C0284.f2345 : abstractC0289;
        this.f2373 = componentCallbacks2C0283.f2341;
        Iterator it2 = componentCallbacks2C0294.f2396.iterator();
        while (it2.hasNext()) {
            m1580((InterfaceC3988) it2.next());
        }
        synchronized (componentCallbacks2C0294) {
            c3992 = componentCallbacks2C0294.f2399;
        }
        mo1573(c3992);
    }

    @Override // p346.AbstractC3991
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0288)) {
            return false;
        }
        C0288 c0288 = (C0288) obj;
        if (super.equals(c0288)) {
            return Objects.equals(this.f2370, c0288.f2370) && this.f2365.equals(c0288.f2365) && Objects.equals(this.f2366, c0288.f2366) && Objects.equals(this.f2369, c0288.f2369) && Objects.equals(this.f2363, c0288.f2363) && Objects.equals(this.f2364, c0288.f2364) && this.f2372 == c0288.f2372 && this.f2367 == c0288.f2367;
        }
        return false;
    }

    @Override // p346.AbstractC3991
    public final int hashCode() {
        return AbstractC3742.m8715(this.f2367 ? 1 : 0, AbstractC3742.m8715(this.f2372 ? 1 : 0, AbstractC3742.m8711(AbstractC3742.m8711(AbstractC3742.m8711(AbstractC3742.m8711(AbstractC3742.m8711(AbstractC3742.m8711(AbstractC3742.m8711(super.hashCode(), this.f2370), this.f2365), this.f2366), this.f2369), this.f2363), this.f2364), null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* renamed from: ˆʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1569(android.widget.ImageView r5) {
        /*
            r4 = this;
            p329.AbstractC3742.m8713()
            p329.AbstractC3740.m8705(r5)
            int r0 = r4.f15390
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = p346.AbstractC3991.m9232(r0, r1)
            if (r0 != 0) goto L6d
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L6d
            int[] r0 = com.bumptech.glide.AbstractC0285.f2357
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            switch(r0) {
                case 1: goto L5d;
                case 2: goto L4b;
                case 3: goto L39;
                case 4: goto L39;
                case 5: goto L39;
                case 6: goto L27;
                default: goto L26;
            }
        L26:
            goto L6d
        L27:
            com.bumptech.glide.ˏʾ r0 = r4.clone()
            ˎʾ.ˉⁱ r2 = p188.C2616.f10395
            ˎʾ.ˏᵢ r3 = new ˎʾ.ˏᵢ
            r3.<init>()
            ᵎᵎ.ـﹶ r0 = r0.m9236(r2, r3)
            r0.f15385 = r1
            goto L6e
        L39:
            com.bumptech.glide.ˏʾ r0 = r4.clone()
            ˎʾ.ˉⁱ r2 = p188.C2616.f10392
            ˎʾ.ᵎˏ r3 = new ˎʾ.ᵎˏ
            r3.<init>()
            ᵎᵎ.ـﹶ r0 = r0.m9236(r2, r3)
            r0.f15385 = r1
            goto L6e
        L4b:
            com.bumptech.glide.ˏʾ r0 = r4.clone()
            ˎʾ.ˉⁱ r2 = p188.C2616.f10395
            ˎʾ.ˏᵢ r3 = new ˎʾ.ˏᵢ
            r3.<init>()
            ᵎᵎ.ـﹶ r0 = r0.m9236(r2, r3)
            r0.f15385 = r1
            goto L6e
        L5d:
            com.bumptech.glide.ˏʾ r0 = r4.clone()
            ˎʾ.ˉⁱ r1 = p188.C2616.f10398
            ˎʾ.ᐧʻ r2 = new ˎʾ.ᐧʻ
            r2.<init>()
            ᵎᵎ.ـﹶ r0 = r0.m9236(r1, r2)
            goto L6e
        L6d:
            r0 = r4
        L6e:
            com.bumptech.glide.ʿʼ r1 = r4.f2373
            ˈˉ.ﹳﹳ r1 = r1.f2350
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class r2 = r4.f2370
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L86
            יᵢ.ـﹶ r1 = new יᵢ.ـﹶ
            r2 = 0
            r1.<init>(r5, r2)
            goto L94
        L86:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L98
            יᵢ.ـﹶ r1 = new יᵢ.ـﹶ
            r2 = 1
            r1.<init>(r5, r2)
        L94:
            r4.m1572(r1, r0)
            return
        L98:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C0288.m1569(android.widget.ImageView):void");
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C0288 m1570(Object obj) {
        if (this.f15394) {
            return clone().m1570(obj);
        }
        this.f2366 = obj;
        this.f2367 = true;
        m9244();
        return this;
    }

    @Override // p346.AbstractC3991
    /* renamed from: ˈٴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C0288 clone() {
        C0288 c0288 = (C0288) super.clone();
        c0288.f2365 = c0288.f2365.clone();
        if (c0288.f2369 != null) {
            c0288.f2369 = new ArrayList(c0288.f2369);
        }
        C0288 c02882 = c0288.f2363;
        if (c02882 != null) {
            c0288.f2363 = c02882.clone();
        }
        C0288 c02883 = c0288.f2364;
        if (c02883 != null) {
            c0288.f2364 = c02883.clone();
        }
        return c0288;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m1572(InterfaceC3214 interfaceC3214, AbstractC3991 abstractC3991) {
        AbstractC3740.m8705(interfaceC3214);
        if (!this.f2367) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC3990 interfaceC3990M1578 = m1578(new Object(), interfaceC3214, null, this.f2365, abstractC3991.f15384, abstractC3991.f15383, abstractC3991.f15395, abstractC3991);
        InterfaceC3990 interfaceC3990Mo1565 = interfaceC3214.mo1565();
        if (interfaceC3990M1578.mo9223(interfaceC3990Mo1565) && (abstractC3991.f15393 || !interfaceC3990Mo1565.mo9221())) {
            AbstractC3740.m8706(interfaceC3990Mo1565, "Argument must not be null");
            if (interfaceC3990Mo1565.isRunning()) {
                return;
            }
            interfaceC3990Mo1565.mo9220();
            return;
        }
        this.f2371.m1595(interfaceC3214);
        interfaceC3214.mo1566(interfaceC3990M1578);
        ComponentCallbacks2C0294 componentCallbacks2C0294 = this.f2371;
        synchronized (componentCallbacks2C0294) {
            componentCallbacks2C0294.f2400.f4351.add(interfaceC3214);
            ˋˊ r11 = componentCallbacks2C0294.f2397;
            ((Set) r11.ˎˑ).add(interfaceC3990M1578);
            if (r11.ˆʿ) {
                interfaceC3990M1578.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                }
                ((HashSet) r11.ᐧˋ).add(interfaceC3990M1578);
            } else {
                interfaceC3990M1578.mo9220();
            }
        }
    }

    @Override // p346.AbstractC3991
    /* renamed from: יʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C0288 mo1573(AbstractC3991 abstractC3991) {
        AbstractC3740.m8705(abstractC3991);
        return (C0288) super.mo1573(abstractC3991);
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C0288 m1575(InterfaceC3988 interfaceC3988) {
        if (this.f15394) {
            return clone().m1575(interfaceC3988);
        }
        this.f2369 = null;
        return m1580(interfaceC3988);
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0288 m1576(C0288 c0288) {
        if (this.f15394) {
            return clone().m1576(c0288);
        }
        this.f2364 = c0288;
        m9244();
        return this;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C0288 m1577(C2821 c2821) {
        if (this.f15394) {
            return clone().m1577(c2821);
        }
        AbstractC3740.m8706(c2821, "Argument must not be null");
        this.f2365 = c2821;
        this.f2372 = false;
        m9244();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p346.InterfaceC3990 m1578(java.lang.Object r25, p259.InterfaceC3214 r26, p346.InterfaceC3994 r27, com.bumptech.glide.AbstractC0289 r28, com.bumptech.glide.EnumC0293 r29, int r30, int r31, p346.AbstractC3991 r32) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C0288.m1578(java.lang.Object, יᵢ.ʿʼ, ᵎᵎ.ﹳﹳ, com.bumptech.glide.ˏᴵ, com.bumptech.glide.ᐧʻ, int, int, ᵎᵎ.ـﹶ):ᵎᵎ.ˑʽ");
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final C0288 m1580(InterfaceC3988 interfaceC3988) {
        if (this.f15394) {
            return clone().m1580(interfaceC3988);
        }
        if (interfaceC3988 != null) {
            if (this.f2369 == null) {
                this.f2369 = new ArrayList();
            }
            this.f2369.add(interfaceC3988);
        }
        m9244();
        return this;
    }
}
