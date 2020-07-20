package com.geekbrains.mvp.view;

import com.geekbrains.mvp.presenter.Presenter;

public interface MainView {
    void setButtonText(Presenter.ButtonIndex btnIndex, int value);
}
