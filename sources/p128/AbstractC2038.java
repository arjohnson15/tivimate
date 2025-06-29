package p128;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: ˈﹳ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2038 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static FileDescriptor m5686(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static long m5687(FileDescriptor fileDescriptor, long j, int i) {
        return Os.lseek(fileDescriptor, j, i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m5688(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }
}
