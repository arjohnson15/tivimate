package p341;

import java.util.Collections;
import java.util.List;
import p166.AbstractC2435;
import p166.C2417;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.C4457;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᵎˑ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3897 implements InterfaceC3891 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f15088;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f15089;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f15090;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f15091;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object f15092;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object f15093;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f15094;

    public C3897() {
        this.f15091 = 1;
        this.f15092 = new C4457(10);
        this.f15090 = -9223372036854775807L;
    }

    public C3897(List list) {
        this.f15091 = 0;
        this.f15092 = list;
        this.f15093 = new InterfaceC3178[list.size()];
        this.f15090 = -9223372036854775807L;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ˏᵢ */
    public final void mo9075(int i, long j) {
        switch (this.f15091) {
            case 0:
                if ((i & 4) != 0) {
                    this.f15088 = true;
                    this.f15090 = j;
                    this.f15089 = 0;
                    this.f15094 = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f15088 = true;
                    this.f15090 = j;
                    this.f15094 = 0;
                    this.f15089 = 0;
                    break;
                }
                break;
        }
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ـﹶ */
    public final void mo9076() {
        switch (this.f15091) {
            case 0:
                this.f15088 = false;
                this.f15090 = -9223372036854775807L;
                break;
            default:
                this.f15088 = false;
                this.f15090 = -9223372036854775807L;
                break;
        }
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ٴˎ */
    public final void mo9077(C4457 c4457) {
        boolean z;
        boolean z2;
        switch (this.f15091) {
            case 0:
                if (this.f15088) {
                    if (this.f15094 == 2) {
                        if (c4457.m10096() == 0) {
                            z2 = false;
                        } else {
                            if (c4457.m10086() != 32) {
                                this.f15088 = false;
                            }
                            this.f15094--;
                            z2 = this.f15088;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.f15094 == 1) {
                        if (c4457.m10096() == 0) {
                            z = false;
                        } else {
                            if (c4457.m10086() != 0) {
                                this.f15088 = false;
                            }
                            this.f15094--;
                            z = this.f15088;
                        }
                        if (!z) {
                        }
                    }
                    int i = c4457.f17169;
                    int iM10096 = c4457.m10096();
                    for (InterfaceC3178 interfaceC3178 : (InterfaceC3178[]) this.f15093) {
                        c4457.m10108(i);
                        interfaceC3178.mo7841(iM10096, c4457);
                    }
                    this.f15089 += iM10096;
                    break;
                }
                break;
            default:
                AbstractC4464.m10146((InterfaceC3178) this.f15093);
                if (this.f15088) {
                    int iM100962 = c4457.m10096();
                    int i2 = this.f15089;
                    if (i2 < 10) {
                        int iMin = Math.min(iM100962, 10 - i2);
                        byte[] bArr = c4457.f17171;
                        int i3 = c4457.f17169;
                        C4457 c44572 = (C4457) this.f15092;
                        System.arraycopy(bArr, i3, c44572.f17171, this.f15089, iMin);
                        if (this.f15089 + iMin == 10) {
                            c44572.m10108(0);
                            if (73 != c44572.m10086() || 68 != c44572.m10086() || 51 != c44572.m10086()) {
                                AbstractC4464.m10144("Id3Reader", "Discarding invalid ID3 tag");
                                this.f15088 = false;
                                break;
                            } else {
                                c44572.m10085(3);
                                this.f15094 = c44572.m10079() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iM100962, this.f15094 - this.f15089);
                    ((InterfaceC3178) this.f15093).mo7841(iMin2, c4457);
                    this.f15089 += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ᐧʻ */
    public final void mo9078(boolean z) {
        int i;
        switch (this.f15091) {
            case 0:
                if (this.f15088) {
                    AbstractC4464.m10132(this.f15090 != -9223372036854775807L);
                    for (InterfaceC3178 interfaceC3178 : (InterfaceC3178[]) this.f15093) {
                        interfaceC3178.mo7842(this.f15090, 1, this.f15089, 0, null);
                    }
                    this.f15088 = false;
                    break;
                }
                break;
            default:
                AbstractC4464.m10146((InterfaceC3178) this.f15093);
                if (this.f15088 && (i = this.f15094) != 0 && this.f15089 == i) {
                    AbstractC4464.m10132(this.f15090 != -9223372036854775807L);
                    ((InterfaceC3178) this.f15093).mo7842(this.f15090, 1, this.f15094, 0, null);
                    this.f15088 = false;
                    break;
                }
                break;
        }
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ﹶˆ */
    public final void mo9079(InterfaceC3177 interfaceC3177, C3898 c3898) {
        switch (this.f15091) {
            case 0:
                int i = 0;
                while (true) {
                    InterfaceC3178[] interfaceC3178Arr = (InterfaceC3178[]) this.f15093;
                    if (i >= interfaceC3178Arr.length) {
                        break;
                    } else {
                        C3887 c3887 = (C3887) ((List) this.f15092).get(i);
                        c3898.m9092();
                        c3898.m9091();
                        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(c3898.f15099, 3);
                        C2417 c2417 = new C2417();
                        c3898.m9091();
                        c2417.f9614 = c3898.f15096;
                        c2417.f9602 = AbstractC2435.m6559("application/dvbsubs");
                        c2417.f9609 = Collections.singletonList(c3887.f14993);
                        c2417.f9625 = c3887.f14994;
                        ᐧʻ.ˋˊ(c2417, interfaceC3178Mo4851);
                        interfaceC3178Arr[i] = interfaceC3178Mo4851;
                        i++;
                    }
                }
            default:
                c3898.m9092();
                c3898.m9091();
                InterfaceC3178 interfaceC3178Mo48512 = interfaceC3177.mo4851(c3898.f15099, 5);
                this.f15093 = interfaceC3178Mo48512;
                C2417 c24172 = new C2417();
                c3898.m9091();
                c24172.f9614 = c3898.f15096;
                c24172.f9602 = AbstractC2435.m6559("application/id3");
                ᐧʻ.ˋˊ(c24172, interfaceC3178Mo48512);
                break;
        }
    }
}
