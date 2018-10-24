package com.mydomain.myproject.client.login;

import javax.inject.Inject;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.NoGatekeeper;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.mydomain.myproject.client.NameTokens;
import com.mydomain.myproject.client.application.ApplicationPresenter;
import com.mydomain.myproject.client.security.CurrentUser;

import java.awt.*;


public class LoginPresenter extends Presenter<LoginPresenter.MyView, LoginPresenter.MyProxy>
        implements LoginUiHandlers{

    @ProxyStandard
    @NameToken(NameTokens.LOGIN)
    @NoGatekeeper
    interface MyProxy extends ProxyPlace<LoginPresenter> {
    }

    interface MyView extends View, HasUiHandlers<LoginUiHandlers> {
    }


    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "Admin";

    private CurrentUser currentUser;

    private PlaceManager placeManager;

    @Inject
    LoginPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy,
            CurrentUser currentUser,
            PlaceManager placeManager) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);

        this.currentUser = currentUser;
//        this.placeManager = placeManager;

        getView().setUiHandlers(this);
    }

    @Override
    public void confirm(String username, String password) {
        if (validateCredentials(username, password)) {
            currentUser.setLoggedIn(true);

//            PlaceRequest placeRequest = new PlaceRequest.Builder()
//                    .nameToken(NameTokens.HOME)
//                    .build();

            GWT.log("HUILO  ETO TI?");
//            placeManager.revealDefaultPlace();
            Window.Location.replace("https://www.youtube.com/");
        }
    }

    private boolean validateCredentials(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }
}