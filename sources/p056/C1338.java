package p056;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;

/* renamed from: ʾˈ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1338 extends AbstractC1339 {
    @Override // p056.AbstractC1339
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C1333 mo4665(C1333 c1333) throws AudioProcessor$UnhandledAudioFormatException {
        int i = c1333.f5417;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new C1333(c1333.f5418, c1333.f5416, 2) : C1333.f5415;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c1333);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // p056.InterfaceC1335
    /* renamed from: ᐧʻ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4657(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p056.C1338.mo4657(java.nio.ByteBuffer):void");
    }
}
