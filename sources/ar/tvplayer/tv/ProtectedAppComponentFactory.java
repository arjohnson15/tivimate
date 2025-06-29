package ar.tvplayer.tv;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public class ProtectedAppComponentFactory extends AppComponentFactory {
    private AppComponentFactory factory;

    private AppComponentFactory getAppComponentFactory() {
        AppComponentFactory appComponentFactory = this.factory;
        if (appComponentFactory != null) {
            return appComponentFactory;
        }
        String processName = Application.getProcessName();
        if (processName == null || !(processName.contains(":p4f6420bb0b0d4e6825ba8697") || processName.contains(":p4cc4b844a96d81b6932e6948"))) {
            try {
                this.factory = (AppComponentFactory) Class.forName("androidx.core.app.CoreComponentFactory").newInstance();
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                if (!Process.isIsolated()) {
                    Log.e("LoadedApk", "Unable to instantiate appComponentFactory", e);
                }
                this.factory = new AppComponentFactory();
            }
            return this.factory;
        }
        Log.i("LoadedApk", "Fast path. Process name: " + processName);
        AppComponentFactory appComponentFactory2 = new AppComponentFactory();
        this.factory = appComponentFactory2;
        return appComponentFactory2;
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return getAppComponentFactory().instantiateActivity(classLoader, str, intent);
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) classLoader.loadClass(str).newInstance();
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return getAppComponentFactory().instantiateProvider(classLoader, str);
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return getAppComponentFactory().instantiateReceiver(classLoader, str, intent);
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return getAppComponentFactory().instantiateService(classLoader, str, intent);
    }
}
