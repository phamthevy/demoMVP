package com.example.vypt.demomvp.ui.main;

import com.example.vypt.demomvp.ui.base.MvpPresenter;

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmail();

    void setUserLoggedOut();

}
