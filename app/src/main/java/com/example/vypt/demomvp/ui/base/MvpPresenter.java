package com.example.vypt.demomvp.ui.base;

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

}
