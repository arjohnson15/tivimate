package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.InterfaceC0262;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p009.C0995;
import p098.C1771;
import p098.InterfaceC1770;
import p192.C2656;
import p192.C2672;
import p192.C2676;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC1770 {
    @Override // p098.InterfaceC1770
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object mo584(Context context) {
        C0995 c0995 = new C0995();
        c0995.f4341 = context.getApplicationContext();
        C2672 c2672 = new C2672(c0995);
        c2672.f5787 = 1;
        if (C2676.f10575 == null) {
            synchronized (C2676.f10574) {
                try {
                    if (C2676.f10575 == null) {
                        C2676.f10575 = new C2676(c2672);
                    }
                } finally {
                }
            }
        }
        m585(context);
        return Boolean.TRUE;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m585(Context context) {
        Object objM5486;
        C1771 c1771M5485 = C1771.m5485(context);
        c1771M5485.getClass();
        synchronized (C1771.f6847) {
            try {
                objM5486 = c1771M5485.f6851.get(ProcessLifecycleInitializer.class);
                if (objM5486 == null) {
                    objM5486 = c1771M5485.m5486(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0233 lifecycle = ((InterfaceC0262) objM5486).getLifecycle();
        lifecycle.mo1032(new C2656(this, lifecycle));
    }

    @Override // p098.InterfaceC1770
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List mo586() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
