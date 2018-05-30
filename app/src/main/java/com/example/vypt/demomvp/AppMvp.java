package com.example.vypt.demomvp;

import android.app.Application;

import com.example.vypt.demomvp.data.DataManager;
import com.example.vypt.demomvp.data.SharedPrefsHelper;

public class AppMvp extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);

    }

    public DataManager getDataManager() {
        return dataManager;
    }
}
