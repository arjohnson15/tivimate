package com.parse;

import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
class InstallationId {
    private final File file;
    private String installationId;
    private final Object lock = new Object();

    public InstallationId(File file) {
        this.file = file;
    }

    private void setInternal(String str) {
        synchronized (this.lock) {
            try {
                ParseFileUtils.writeStringToFile(this.file, str, "UTF-8");
            } catch (IOException e) {
                PLog.e("InstallationId", "Unexpected exception writing installation id to disk", e);
            }
            this.installationId = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[Catch: all -> 0x0012, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:13:0x0024, B:15:0x0028, B:16:0x0033, B:11:0x0015, B:12:0x001d), top: B:21:0x0003, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String get() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
            java.lang.String r1 = r4.installationId     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L24
            java.io.File r1 = r4.file     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L14 java.io.FileNotFoundException -> L1d
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = com.parse.ParseFileUtils.readFileToString(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L14 java.io.FileNotFoundException -> L1d
            r4.installationId = r1     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L14 java.io.FileNotFoundException -> L1d
            goto L24
        L12:
            r1 = move-exception
            goto L37
        L14:
            r1 = move-exception
            java.lang.String r2 = "InstallationId"
            java.lang.String r3 = "Unexpected exception reading installation id from disk"
            com.parse.PLog.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L12
            goto L24
        L1d:
            java.lang.String r1 = "InstallationId"
            java.lang.String r2 = "Couldn't find existing installationId file. Creating one instead."
            com.parse.PLog.i(r1, r2)     // Catch: java.lang.Throwable -> L12
        L24:
            java.lang.String r1 = r4.installationId     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L33
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L12
            r4.setInternal(r1)     // Catch: java.lang.Throwable -> L12
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r4.installationId
            return r0
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.parse.InstallationId.get():java.lang.String");
    }

    public void set(String str) {
        synchronized (this.lock) {
            try {
                if (!ParseTextUtils.isEmpty(str) && !str.equals(get())) {
                    setInternal(str);
                }
            } finally {
            }
        }
    }
}
