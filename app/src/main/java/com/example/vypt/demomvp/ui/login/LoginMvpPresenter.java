package com.example.vypt.demomvp.ui.login;

import com.example.vypt.demomvp.ui.base.MvpPresenter;

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String email);

}
