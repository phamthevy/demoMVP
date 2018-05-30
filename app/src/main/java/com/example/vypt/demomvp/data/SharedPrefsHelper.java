package com.example.vypt.demomvp.data;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class SharedPrefsHelper {

    SharedPreferences mSharedPreferences;

    public SharedPrefsHelper(Context context) {
        mSharedPreferences = context.getSharedPreferences("share_pre", MODE_PRIVATE);
    }

    public void clear() {
        mSharedPreferences.edit().clear().apply();
    }

    public void putEmail(String email) {
        mSharedPreferences.edit().putString("EMAIL", email).apply();
    }

    public String getEmail() {
        return mSharedPreferences.getString("EMAIL", null);
    }

    public boolean getLoggedInMode() {
        return mSharedPreferences.getBoolean("LOGGED_IN", false);
    }

    public void setLoggedInMode(boolean loggedIn) {
        mSharedPreferences.edit().putBoolean("LOGGED_IN", loggedIn).apply();
    }

}
