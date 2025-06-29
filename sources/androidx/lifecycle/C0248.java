package androidx.lifecycle;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p007.C0945;
import p013.AbstractC1041;
import p013.C1053;
import p023.AbstractC1142;
import p023.C1149;
import p034.InterfaceC1229;
import p065.AbstractC1484;
import p065.AbstractC1524;
import p070.AbstractC1547;
import p070.AbstractC1549;
import p090.C1744;
import p090.C1748;
import p164.C2363;
import p164.InterfaceC2379;
import p184.InterfaceC2551;
import p288.C3395;
import p293.C3474;
import p317.AbstractC3616;
import p317.AbstractC3629;
import p322.C3678;
import p331.C3761;
import p334.C3789;
import p338.InterfaceC3865;
import p366.AbstractC4147;
import p366.C4149;
import p366.C4154;
import p366.C4162;
import p366.C4167;
import p376.AbstractC4318;
import p376.C4319;
import p376.C4324;
import p427.C4911;
import p427.C4914;
import p427.C4917;
import ˈי.ʾˈ;

/* renamed from: androidx.lifecycle.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0248 extends AbstractC1547 implements InterfaceC3865 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f1298;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f1299;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0248(int i, Object obj) {
        super(0);
        this.f1298 = i;
        this.f1299 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0248(InterfaceC3865 interfaceC3865) {
        super(0);
        this.f1298 = 12;
        this.f1299 = (AbstractC1547) interfaceC3865;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ʿ.ˉי, ᵎˈ.ـﹶ] */
    @Override // p338.InterfaceC3865
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object mo1053() throws Throwable {
        int iM8528;
        C4154 c4154;
        Throwable th;
        C3395 c3395;
        Throwable th2;
        Throwable th3;
        int iM9550;
        C3395 c33952;
        switch (this.f1298) {
            case 0:
                return AbstractC0224.m1022((InterfaceC0242) this.f1299);
            case 1:
                return ((Iterable) this.f1299).iterator();
            case 2:
                return new AbstractC1142[((InterfaceC2551[]) this.f1299).length];
            case 3:
                AbstractC1524 abstractC1524 = (AbstractC1524) this.f1299;
                String strMo5110 = abstractC1524.mo5110();
                AbstractC1484 abstractC1484 = (AbstractC1484) abstractC1524.f6195;
                abstractC1484.m5049();
                abstractC1484.m5041();
                return abstractC1484.m5044().mo4418().mo4383(strMo5110);
            case 4:
                File file = (File) ((C1149) this.f1299).mo1053();
                if (AbstractC3616.m8519(file.getName(), '.', "").equals("preferences_pb")) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 5:
                int i = Build.VERSION.SDK_INT;
                C1744 c1744 = (C1744) this.f1299;
                C1748 c1748 = (i < 23 || c1744.f6756 == null || !c1744.f6759) ? new C1748(c1744.f6760, c1744.f6756, new ʾי.ˑʽ(23), c1744.f6758, c1744.f6757) : new C1748(c1744.f6760, new File(c1744.f6760.getNoBackupFilesDir(), c1744.f6756).getAbsolutePath(), new ʾי.ˑʽ(23), c1744.f6758, c1744.f6757);
                c1748.setWriteAheadLoggingEnabled(c1744.f6762);
                return c1748;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((C3761) this.f1299).mo8011(":memory:");
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                File file2 = (File) ((C2363) this.f1299).f9354.mo1053();
                String absolutePath = file2.getAbsolutePath();
                synchronized (C2363.f9348) {
                    LinkedHashSet linkedHashSet = C2363.f9349;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file2 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(absolutePath);
                }
                return file2;
            case 8:
                return new C3678((InterfaceC2379) this.f1299);
            case 9:
                C4324 c4324 = (C4324) this.f1299;
                ClassLoader classLoader = c4324.f16797;
                ArrayList list = Collections.list(classLoader.getResources(""));
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    AbstractC4147 abstractC4147 = c4324.f16798;
                    if (!zHasNext) {
                        ArrayList list2 = Collections.list(classLoader.getResources("META-INF/MANIFEST.MF"));
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            String string = ((URL) it2.next()).toString();
                            if (AbstractC3629.m8560(string, "jar:file:", false) && (iM8528 = AbstractC3616.m8528(6, string, "!")) != -1) {
                                String str = C4167.f16083;
                                C4154 c4154Mo9542 = abstractC4147.mo9542(C3474.m8338(new File(URI.create(string.substring(4, iM8528)))));
                                try {
                                    long jM9556 = c4154Mo9542.m9556() - 22;
                                    if (jM9556 < 0) {
                                        throw new IOException("not a zip: size=" + c4154Mo9542.m9556());
                                    }
                                    long jMax = Math.max(jM9556 - 65536, 0L);
                                    while (true) {
                                        C4149 c4149 = new C4149(c4154Mo9542.m9555(jM9556));
                                        try {
                                            if (c4149.m9550() == 101010256) {
                                                int iM9548 = c4149.m9548() & 65535;
                                                int iM95482 = c4149.m9548() & 65535;
                                                C4154 c41542 = c4154Mo9542;
                                                long jM9548 = c4149.m9548() & 65535;
                                                try {
                                                    if (jM9548 != (c4149.m9548() & 65535) || iM9548 != 0 || iM95482 != 0) {
                                                        try {
                                                            throw new IOException("unsupported zip: spanned");
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            c4149.close();
                                                            throw th;
                                                        }
                                                    }
                                                    c4149.skip(4L);
                                                    int iM95483 = c4149.m9548() & 65535;
                                                    C0945 c0945 = new C0945(iM95483, jM9548, c4149.m9550() & 4294967295L);
                                                    c4149.mo9506(iM95483);
                                                    try {
                                                        c4149.close();
                                                        long j = jM9556 - 20;
                                                        if (j > 0) {
                                                            c4154 = c41542;
                                                            try {
                                                                C4149 c41492 = new C4149(c4154.m9555(j));
                                                                try {
                                                                    if (c41492.m9550() == 117853008) {
                                                                        int iM95502 = c41492.m9550();
                                                                        long jM9552 = c41492.m9552();
                                                                        if (c41492.m9550() != 1 || iM95502 != 0) {
                                                                            throw new IOException("unsupported zip: spanned");
                                                                        }
                                                                        C4149 c41493 = new C4149(c4154.m9555(jM9552));
                                                                        try {
                                                                            iM9550 = c41493.m9550();
                                                                        } catch (Throwable th5) {
                                                                            try {
                                                                                c41493.close();
                                                                            } catch (Throwable th6) {
                                                                                ʾˈ.ـﹶ(th5, th6);
                                                                            }
                                                                            th3 = th5;
                                                                        }
                                                                        if (iM9550 != 101075792) {
                                                                            throw new IOException("bad zip: expected " + AbstractC4318.m9811(101075792) + " but was " + AbstractC4318.m9811(iM9550));
                                                                        }
                                                                        c41493.skip(12L);
                                                                        int iM95503 = c41493.m9550();
                                                                        int iM95504 = c41493.m9550();
                                                                        long jM95522 = c41493.m9552();
                                                                        if (jM95522 != c41493.m9552() || iM95503 != 0 || iM95504 != 0) {
                                                                            throw new IOException("unsupported zip: spanned");
                                                                        }
                                                                        c41493.skip(8L);
                                                                        C0945 c09452 = new C0945(iM95483, jM95522, c41493.m9552());
                                                                        try {
                                                                            c41493.close();
                                                                            th3 = null;
                                                                        } catch (Throwable th7) {
                                                                            th3 = th7;
                                                                        }
                                                                        c0945 = c09452;
                                                                        if (th3 != null) {
                                                                            throw th3;
                                                                        }
                                                                    }
                                                                    try {
                                                                        c41492.close();
                                                                        th2 = null;
                                                                    } catch (Throwable th8) {
                                                                        th2 = th8;
                                                                    }
                                                                } catch (Throwable th9) {
                                                                    try {
                                                                        c41492.close();
                                                                    } catch (Throwable th10) {
                                                                        ʾˈ.ـﹶ(th9, th10);
                                                                    }
                                                                    th2 = th9;
                                                                }
                                                                if (th2 != null) {
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                                Throwable th12 = th;
                                                                if (c4154 == null) {
                                                                    throw th12;
                                                                }
                                                                try {
                                                                    c4154.close();
                                                                    throw th12;
                                                                } catch (Throwable th13) {
                                                                    ʾˈ.ـﹶ(th12, th13);
                                                                    throw th12;
                                                                }
                                                            }
                                                        } else {
                                                            c4154 = c41542;
                                                        }
                                                        ArrayList arrayList3 = new ArrayList();
                                                        C4149 c41494 = new C4149(c4154.m9555(c0945.f4154));
                                                        try {
                                                            long j2 = c0945.f4155;
                                                            long j3 = 0;
                                                            while (j3 < j2) {
                                                                C4319 c4319M9814 = AbstractC4318.m9814(c41494);
                                                                long j4 = j2;
                                                                if (c4319M9814.f16774 >= c0945.f4154) {
                                                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                                                    break;
                                                                } else {
                                                                    C4167 c4167 = C4324.f16796;
                                                                    if (ٴᐧ.ᐧⁱ.ᴵʿ(c4319M9814.f16776)) {
                                                                        arrayList3.add(c4319M9814);
                                                                    }
                                                                    j3++;
                                                                    j2 = j4;
                                                                }
                                                            }
                                                            try {
                                                                c41494.close();
                                                                th = null;
                                                            } catch (Throwable th14) {
                                                                th = th14;
                                                            }
                                                        } catch (Throwable th15) {
                                                            try {
                                                                c41494.close();
                                                            } catch (Throwable th16) {
                                                                ʾˈ.ـﹶ(th15, th16);
                                                            }
                                                            th = th15;
                                                        }
                                                        if (th != null) {
                                                            throw th;
                                                        }
                                                        AbstractC4318.m9809(arrayList3);
                                                        C4162 c4162 = new C4162();
                                                        try {
                                                            c4154.close();
                                                        } catch (Throwable unused) {
                                                        }
                                                        c3395 = new C3395(c4162, C4324.f16796);
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        c4154 = c41542;
                                                    }
                                                } catch (Throwable th18) {
                                                    th = th18;
                                                }
                                            } else {
                                                C4154 c41543 = c4154Mo9542;
                                                c4149.close();
                                                jM9556--;
                                                if (jM9556 < jMax) {
                                                    throw new IOException("not a zip: end of central directory signature not found");
                                                }
                                                c4154Mo9542 = c41543;
                                            }
                                        } catch (Throwable th19) {
                                            th = th19;
                                        }
                                    }
                                } catch (Throwable th20) {
                                    th = th20;
                                    c4154 = c4154Mo9542;
                                }
                            } else {
                                c3395 = null;
                            }
                            if (c3395 != null) {
                                arrayList2.add(c3395);
                            }
                        }
                        return AbstractC1041.m4028(arrayList, arrayList2);
                    }
                    URL url = (URL) it.next();
                    if (AbstractC1549.m5138(url.getProtocol(), "file")) {
                        String str2 = C4167.f16083;
                        c33952 = new C3395(abstractC4147, C3474.m8338(new File(url.toURI())));
                    } else {
                        c33952 = null;
                    }
                    if (c33952 != null) {
                        arrayList.add(c33952);
                    }
                }
                break;
            case 10:
                C4911 c4911 = (C4911) this.f1299;
                ((InterfaceC1229) c4911.f18575.f17462).getClass();
                return new C4917(new C4914(((InterfaceC1229) c4911.f18575.f17462).mo4418()));
            case 11:
                return (List) this.f1299;
            default:
                try {
                    return (List) ((AbstractC1547) this.f1299).mo1053();
                } catch (SSLPeerUnverifiedException unused2) {
                    return C1053.f4449;
                }
        }
    }
}
