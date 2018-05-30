package com.example.vypt.demomvp.ui.main;

import com.example.vypt.demomvp.data.DataManager;
import com.example.vypt.demomvp.ui.base.BasePresenter;

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmail() {
        return getDataManager().getEmail();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }

}
