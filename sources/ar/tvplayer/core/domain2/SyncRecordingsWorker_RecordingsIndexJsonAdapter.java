package ar.tvplayer.core.domain2;

import ar.tvplayer.core.data.db.entities.RecordingForPush;
import ar.tvplayer.core.domain2.SyncRecordingsWorker;
import java.util.List;
import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5047;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class SyncRecordingsWorker_RecordingsIndexJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2265;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2266;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2267 = C3759.m8745("v", "r");

    public SyncRecordingsWorker_RecordingsIndexJsonAdapter(C5054 c5054) {
        Class cls = Integer.TYPE;
        C1038 c1038 = C1038.f4437;
        this.f2265 = c5054.m11213(cls, c1038, "version");
        this.f2266 = c5054.m11213(AbstractC5047.m11170(List.class, RecordingForPush.class), c1038, "recordings");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(58, "GeneratedJsonAdapter(SyncRecordingsWorker.RecordingsIndex)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        Integer num = null;
        List list = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2267);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                num = (Integer) this.f2265.mo1390(abstractC5050);
                if (num == null) {
                    throw AbstractC2458.m6574("version", "v", abstractC5050);
                }
            } else if (iMo11194 == 1 && (list = (List) this.f2266.mo1390(abstractC5050)) == null) {
                throw AbstractC2458.m6574("recordings", "r", abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (num == null) {
            throw AbstractC2458.m6573("version", "v", abstractC5050);
        }
        int iIntValue = num.intValue();
        if (list != null) {
            return new SyncRecordingsWorker.RecordingsIndex(iIntValue, list);
        }
        throw AbstractC2458.m6573("recordings", "r", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        SyncRecordingsWorker.RecordingsIndex recordingsIndex = (SyncRecordingsWorker.RecordingsIndex) obj;
        if (recordingsIndex == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("v");
        this.f2265.mo1391(abstractC5048, Integer.valueOf(recordingsIndex.f2264));
        abstractC5048.mo11174("r");
        this.f2266.mo1391(abstractC5048, recordingsIndex.f2263);
        abstractC5048.mo11178();
    }
}
