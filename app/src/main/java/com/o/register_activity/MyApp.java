package com.o.register_activity;

import android.app.Application;

import com.facebook.stetho.Stetho;

import leakcanary.LeakCanary;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);


    }
}
