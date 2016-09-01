package com.ihandy.a2014010845.news;

import android.app.Application;
import android.content.Context;

/**
 * Created by zhou on 2016/9/1.
 */
public class AppContext extends Application {

    private static Context instance;

    @Override
    public void onCreate()
    {
        super.onCreate();
        instance = getApplicationContext();
    }

    public static Context getContext()
    {
        return instance;
    }

}
