package com.mydomain.myproject.client.login;

import com.gwtplatform.mvp.client.UiHandlers;

public interface LoginUiHandlers extends UiHandlers {


    void confirm(String username, String password);


}
