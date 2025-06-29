package com.parse;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ParseCacheDirMigrationUtils {
    private final Context context;
    private final String TAG = getClass().getName();
    private final Object lock = new Object();

    public ParseCacheDirMigrationUtils(Context context) {
        this.context = context;
    }

    private String getFileOldDir(Context context, File file) {
        return replaceLast(file.getAbsolutePath().replace(getOldParseDir(context).getAbsolutePath(), "").replace("/" + file.getName(), ""), file.getName());
    }

    private File getOldParseDir(Context context) {
        return context.getDir("Parse", 0);
    }

    private void logMigrationStatus(String str, String str2, String str3, String str4) {
        PLog.v(this.TAG, "Migration for file: {" + str + "} from {" + str2 + "} to {" + str3 + "}, Status: " + str4);
    }

    private String replaceLast(String str, String str2) {
        return str.replaceFirst("(?s)" + str2 + "(?!.*?" + str2 + ")", "");
    }

    private void runSilentMigration(Context context) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ParseFileUtils.getAllNestedFiles(getOldParseDir(context).getAbsolutePath(), arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        String[] strArr = {"installationId", "currentUser", "currentConfig", "currentInstallation", "LocalId", "pushState"};
        Iterator it = arrayList.iterator();
        boolean zContains = false;
        while (it.hasNext()) {
            File file = (File) it.next();
            int i = 0;
            while (true) {
                if (i >= 6) {
                    break;
                }
                try {
                    zContains = file.getAbsolutePath().contains(strArr[i]);
                    if (zContains) {
                        zContains = true;
                        break;
                    } else {
                        i++;
                        zContains = false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(zContains ? context.getFilesDir() : context.getCacheDir());
            sb.append("/com.parse/");
            sb.append(getFileOldDir(context, file));
            File file2 = new File(sb.toString(), file.getName());
            if (file2.exists()) {
                logMigrationStatus(file.getName(), file.getPath(), file2.getAbsolutePath(), "Already exist in new location.");
            } else {
                ParseFileUtils.copyFile(file, file2);
                logMigrationStatus(file.getName(), file.getPath(), file2.getAbsolutePath(), "Successful.");
            }
            ParseFileUtils.deleteQuietly(file);
            PLog.v(this.TAG, "File deleted: {" + file.getName() + "} successfully");
        }
        arrayList.clear();
        ParseFileUtils.getAllNestedFiles(getOldParseDir(context).getAbsolutePath(), arrayList);
        if (arrayList.isEmpty()) {
            try {
                ParseFileUtils.deleteDirectory(getOldParseDir(context));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        PLog.v(this.TAG, "Migration completed.");
    }

    public void runMigrations() {
        synchronized (this.lock) {
            runSilentMigration(this.context);
        }
    }
}
