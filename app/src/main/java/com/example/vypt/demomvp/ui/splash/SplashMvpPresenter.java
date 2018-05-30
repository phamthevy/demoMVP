package com.example.vypt.demomvp.ui.splash;

import com.example.vypt.demomvp.ui.base.MvpPresenter;

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();

}
