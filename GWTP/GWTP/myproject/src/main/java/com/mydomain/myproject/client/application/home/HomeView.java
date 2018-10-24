package com.mydomain.myproject.client.application.home;

import javax.inject.Inject;

import com.google.gwt.user.client.ui.Label;
import com.gwtplatform.mvp.client.ViewImpl;

public class HomeView extends ViewImpl implements HomePresenter.MyView {
    HomeView() {
        initWidget(new Label("Empty page"));
    }
}
