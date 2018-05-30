package com.example.vypt.demomvp.ui.login;

import com.example.vypt.demomvp.data.DataManager;
import com.example.vypt.demomvp.ui.base.BasePresenter;

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String email) {
        getDataManager().saveEmail(email);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }

}
