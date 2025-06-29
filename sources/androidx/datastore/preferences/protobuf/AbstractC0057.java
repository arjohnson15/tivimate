package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.ᐧʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0057 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Unsafe f471;

    public AbstractC0057(Unsafe unsafe) {
        this.f471 = unsafe;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m486(Class cls) {
        return this.f471.arrayIndexScale(cls);
    }

    /* renamed from: ʿʼ */
    public abstract double mo224(long j, Object obj);

    /* renamed from: ˉי, reason: contains not printable characters */
    public final long m487(Field field) {
        return this.f471.objectFieldOffset(field);
    }

    /* renamed from: ˉⁱ */
    public abstract void mo225(Object obj, long j, byte b);

    /* renamed from: ˋⁱ */
    public abstract void mo226(Object obj, long j, double d);

    /* renamed from: ˏʾ */
    public abstract void mo227(Object obj, long j, boolean z);

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m488(long j, Object obj, int i) {
        this.f471.putInt(obj, j, i);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final long m489(long j, Object obj) {
        return this.f471.getLong(obj, j);
    }

    /* renamed from: ˑʽ */
    public abstract boolean mo228(long j, Object obj);

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m490(Object obj, long j, long j2) {
        this.f471.putLong(obj, j, j2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m491(Class cls) {
        return this.f471.arrayBaseOffset(cls);
    }

    /* renamed from: ٴˎ */
    public abstract float mo229(long j, Object obj);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int m492(long j, Object obj) {
        return this.f471.getInt(obj, j);
    }

    /* renamed from: ᴵʿ */
    public abstract void mo230(Object obj, long j, float f);

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m493(long j, Object obj, Object obj2) {
        this.f471.putObject(obj, j, obj2);
    }

    /* renamed from: ﹳﹳ */
    public abstract byte mo231(long j, Object obj);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Object m494(long j, Object obj) {
        return this.f471.getObject(obj, j);
    }
}
