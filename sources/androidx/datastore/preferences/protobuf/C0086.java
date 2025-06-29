package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.ﾞﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0086 extends AbstractC0057 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ int f521;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0086(Unsafe unsafe, int i) {
        super(unsafe);
        this.f521 = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0057
    /* renamed from: ʿʼ */
    public final double mo224(long j, Object obj) {
        switch (this.f521) {
        }
        return Double.longBitsToDouble(m489(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0057
    /* renamed from: ˉⁱ */
    public final void mo225(Object obj, long j, byte b) {
        switch (this.f521) {
            case 0:
                if (!AbstractC0029.f395) {
                    AbstractC0029.m316(obj, j, b);
                    break;
                } else {
                    AbstractC0029.m323(obj, j, b);
                    break;
                }
            default:
                if (!AbstractC0029.f395) {
                    AbstractC0029.m316(obj, j, b);
                    break;
                } else {
                    AbstractC0029.m323(obj, j, b);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0057
    /* renamed from: ˋⁱ */
    public final void mo226(Object obj, long j, double d) {
        switch (this.f521) {
            case 0:
                m490(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                m490(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0057
    /* renamed from: ˏʾ */
    public final void mo227(Object obj, long j, boolean z) {
        switch (this.f521) {
            case 0:
                if (!AbstractC0029.f395) {
                    AbstractC0029.m316(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC0029.m323(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!AbstractC0029.f395) {
                    AbstractC0029.m316(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC0029.m323(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0057
    /* renamed from: ˑʽ */
    public final boolean mo228(long j, Object obj) {
        switch (this.f521) {
            case 0:
                if (AbstractC0029.f395) {
                    if (AbstractC0029.m322(j, obj) != 0) {
                    }
                } else if (AbstractC0029.m317(j, obj) != 0) {
                }
                break;
            default:
                if (AbstractC0029.f395) {
                    if (AbstractC0029.m322(j, obj) != 0) {
                    }
                } else if (AbstractC0029.m317(j, obj) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0057
    /* renamed from: ٴˎ */
    public final float mo229(long j, Object obj) {
        switch (this.f521) {
        }
        return Float.intBitsToFloat(m492(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0057
    /* renamed from: ᴵʿ */
    public final void mo230(Object obj, long j, float f) {
        switch (this.f521) {
            case 0:
                m488(j, obj, Float.floatToIntBits(f));
                break;
            default:
                m488(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0057
    /* renamed from: ﹳﹳ */
    public final byte mo231(long j, Object obj) {
        switch (this.f521) {
            case 0:
                if (!AbstractC0029.f395) {
                    break;
                } else {
                    break;
                }
            default:
                if (!AbstractC0029.f395) {
                    break;
                } else {
                    break;
                }
        }
        return AbstractC0029.m317(j, obj);
    }
}
