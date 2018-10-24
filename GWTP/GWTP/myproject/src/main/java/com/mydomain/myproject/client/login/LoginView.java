package com.mydomain.myproject.client.login;

import javax.inject.Inject;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class LoginView extends ViewWithUiHandlers<LoginUiHandlers> implements LoginPresenter.MyView {


    interface Binder extends UiBinder<Widget, LoginView> {
    }

    @UiField
    Button confirm;
    @UiField
    TextBox username;
    @UiField
    PasswordTextBox password;


    @Inject
    LoginView(
            Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }



    @UiHandler("confirm")
    void onConfirm(ClickEvent event) {
        getUiHandlers().confirm(username.getText(), password.getText());
        if (username.getText().length()<4 && username.getText().length()>0){
            Window.alert("login2short");
        }
        if (password.getText().length()<4 && password.getText().length()>0){
            Window.alert("WRONG! pASSWORD");
        }
        if (username.getText().length()<1 || password.getText().length()<1){
            Window.alert("PROPUSTIL KAKOE TO POLE");
        }
        if (username.getText()=="Admin" && password.getText()=="Admin"){
            Window.Location.replace("https://www.youtube.com/channel/UC-Ya58FUPZlT161EXIcocZA");
        }

    }


}