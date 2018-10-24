package com.mydomain.myproject.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.mydomain.myproject.client.application.home.HomeModule;
import com.mydomain.myproject.client.login.LoginModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new HomeModule());
        install(new LoginModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}