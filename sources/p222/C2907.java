package p222;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.bumptech.glide.C0295;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.lsposed.hiddenapibypass.library.R;
import p041.C1281;
import p129.C2053;
import p129.C2055;
import p144.C2230;
import p266.C3261;
import p266.C3264;
import p331.C3758;
import p369.C4192;
import p369.C4194;
import p369.CallableC4193;
import ˉˆ.ﹳﹳ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ˏᴵ.ˏʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2907 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f11255;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object f11256;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object f11257;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f11258;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object f11259;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object f11260;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f11261;

    public C2907(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f11261 = layoutParams;
        this.f11256 = new Rect();
        this.f11259 = new int[2];
        this.f11260 = new int[2];
        this.f11258 = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout._2_res_0x7f0e001b, (ViewGroup) null);
        this.f11255 = viewInflate;
        this.f11257 = (TextView) viewInflate.findViewById(R.id._2_res_0x7f0b0288);
        layoutParams.setTitle(C2907.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style._2_res_0x7f140004;
        layoutParams.flags = 24;
    }

    public C2907(String str, ﹳﹳ r5, ﹶˆ r6) {
        this.f11261 = new C0295(this, false);
        this.f11256 = new C0295(this, true);
        this.f11259 = new C1281(1);
        this.f11260 = new AtomicMarkableReference(null, false);
        this.f11257 = str;
        this.f11258 = new C4192(r5);
        this.f11255 = r6;
    }

    public C2907(C2055 c2055, C3264 c3264, C3758 c3758) {
        this.f11261 = new C2230();
        this.f11259 = new ReentrantReadWriteLock();
        this.f11258 = c2055;
        this.f11256 = c3264;
        this.f11260 = c3758;
        this.f11255 = new HashMap(256);
        this.f11257 = new HashMap(256);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m7250(String str) {
        C0295 c0295 = (C0295) this.f11256;
        synchronized (c0295) {
            try {
                if (((C4194) ((AtomicMarkableReference) c0295.f2402).getReference()).m9622(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c0295.f2402;
                    atomicMarkableReference.set((C4194) atomicMarkableReference.getReference(), true);
                    CallableC4193 callableC4193 = new CallableC4193(0, c0295);
                    AtomicReference atomicReference = (AtomicReference) c0295.f2403;
                    while (!atomicReference.compareAndSet(null, callableC4193)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((ﹶˆ) ((C2907) c0295.f2405).f11255).ᵢٴ(callableC4193);
                }
            } finally {
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m7251(AutoCloseable autoCloseable, C3261[] c3261Arr) {
        ReentrantReadWriteLock.WriteLock writeLock = ((ReentrantReadWriteLock) this.f11259).writeLock();
        try {
            writeLock.lock();
            C3261[] c3261ArrM7252 = m7252(autoCloseable);
            if (c3261ArrM7252 == null) {
                for (C3261 c3261 : c3261Arr) {
                    c3261.m8019(autoCloseable);
                    for (Class cls : ((C2053) c3261.f12722.f12726).f7774) {
                        HashMap map = (HashMap) this.f11255;
                        ArrayList arrayList = (ArrayList) map.get(cls);
                        if (arrayList == null) {
                            arrayList = new ArrayList(8);
                            map.put(cls, arrayList);
                        }
                        arrayList.add(c3261);
                    }
                }
                ((HashMap) this.f11257).put(autoCloseable.getClass(), c3261Arr);
            } else {
                for (C3261 c32612 : c3261ArrM7252) {
                    c32612.m8019(autoCloseable);
                }
            }
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C3261[] m7252(AutoCloseable autoCloseable) {
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.f11259).readLock();
        try {
            lock.lock();
            return (C3261[]) ((HashMap) this.f11257).get(autoCloseable.getClass());
        } finally {
            lock.unlock();
        }
    }
}
