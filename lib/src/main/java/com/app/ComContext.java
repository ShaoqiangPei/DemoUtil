package com.app;

import android.app.Application;

public class ComContext extends Application {

    private static ComContext instance;

    public static synchronized ComContext getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
