package com.geekbrains.mvp.presenter;

import com.geekbrains.mvp.view.MainView;
import com.geekbrains.mvp.model.Model;

public class Presenter {

    private final Model mModel;
    private final MainView mView;

    public enum ButtonIndex {ONE, TWO, THREE}

    public Presenter(MainView mainView) {
        mModel = new Model();
        mView = mainView;
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public void buttonClick(ButtonIndex btnIndex) {
        int newModelValue;
        switch (btnIndex) {
            case ONE:
                newModelValue = calcNewModelValue(0);
                mModel.setElementValueAtIndex(0, newModelValue);
                mView.setButtonText(ButtonIndex.ONE, newModelValue);
                break;

            case TWO:
                newModelValue = calcNewModelValue(1);
                mModel.setElementValueAtIndex(1, newModelValue);
                mView.setButtonText(ButtonIndex.TWO, newModelValue);
                break;

            case THREE:
                newModelValue = calcNewModelValue(2);
                mModel.setElementValueAtIndex(2, newModelValue);
                mView.setButtonText(ButtonIndex.THREE, newModelValue);
                break;
        }
    }
}
