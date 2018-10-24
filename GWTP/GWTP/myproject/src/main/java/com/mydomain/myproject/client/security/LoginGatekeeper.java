package com.mydomain.myproject.client.security;


import com.gwtplatform.mvp.client.annotations.DefaultGatekeeper;
import com.gwtplatform.mvp.client.proxy.Gatekeeper;

import javax.inject.Inject;

@DefaultGatekeeper
public class LoginGatekeeper implements Gatekeeper {
    private final CurrentUser currentUser;

    @Inject
    LoginGatekeeper(CurrentUser currentUser){
        this.currentUser = currentUser;
    }


    @Override
    public boolean canReveal() {
        return currentUser.isLoggedIn();
    }
}
