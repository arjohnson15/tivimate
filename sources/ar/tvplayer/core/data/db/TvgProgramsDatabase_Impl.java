package ar.tvplayer.core.data.db;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p013.C1053;
import p061.AbstractC1420;
import p065.C1500;
import p070.AbstractC1563;
import p288.C3406;
import ʼˈ.ـﹶ;
import ʽ.ˏᴵ;
import ˈᐧ.ᐧʼ;

/* loaded from: classes.dex */
public final class TvgProgramsDatabase_Impl extends TvgProgramsDatabase {

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C3406 f2229 = new C3406(new ـﹶ(5, this));

    @Override // p065.AbstractC1484
    /* renamed from: ʿʼ */
    public final List mo1436(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // p065.AbstractC1484
    /* renamed from: ˋⁱ */
    public final Set mo1437() {
        return new LinkedHashSet();
    }

    @Override // p065.AbstractC1484
    /* renamed from: ˏᴵ */
    public final LinkedHashMap mo1438() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AbstractC1563.m5154(ᐧʼ.class), C1053.f4449);
        return linkedHashMap;
    }

    @Override // ar.tvplayer.core.data.db.TvgProgramsDatabase
    /* renamed from: יʻ */
    public final ᐧʼ mo1440() {
        return (ᐧʼ) this.f2229.getValue();
    }

    @Override // p065.AbstractC1484
    /* renamed from: ٴˎ */
    public final C1500 mo1381() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tvg_programs_fts", "tvg_programs");
        return new C1500(this, linkedHashMap, new LinkedHashMap(), "tvg_programs", "tvg_programs_fts");
    }

    @Override // p065.AbstractC1484
    /* renamed from: ᐧʻ */
    public final AbstractC1420 mo1439() {
        return new ˏᴵ(this);
    }
}
